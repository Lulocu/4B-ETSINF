#!/bin/sh -e

export LOCALE="C"

if [ $# != 3 ]
then
    echo "usage: $(basename $0) <src-port> <dst-host> <dst-port>"
    exit 0
fi

DATE="Sat, 15 May 1999 00:00:00 +0200"

TMP=`mktemp -d`
BACK=$TMP/pipe.back
SENT=$TMP/pipe.sent
RCVD=$TMP/pipe.rcvd

FILTERIN=$TMP/pipe.in
FILTEROUT=$TMP/pipe.out

trap 'rm -rf "$TMP"' EXIT
mkfifo -m 0600 "$BACK" "$SENT" "$RCVD" "$FILTERIN" "$FILTEROUT"

sed 's/^/ => /' <"$SENT" &
sed 's/^/ #> /' <"$FILTERIN" &
sed 's/^/<=  /' <"$RCVD" &


DIR=$(dirname $0)

FILTER_CLT_SRV="mawk -W interactive -f ${DIR}/filter-clt-srv.awk"
FILTER_SRV_CLT="mawk -W interactive -f ${DIR}/filter-srv-clt.awk"

sed 's/^/<# /' <"$FILTEROUT" | head -n20 &

nc -l -p "$1" < "$BACK" | tee "$SENT" | \
    ${FILTER_CLT_SRV} -v HOST="$2" -v PORT="$3" | tee "$FILTERIN"  | \
    nc "$2" "$3" | tee "$RCVD" | ${FILTER_SRV_CLT} -v DATE="${DATE}"| tee "$FILTEROUT"\
    > "$BACK"
