#!/bin/sh -e

export LOCALE="C"

if [ $# != 3 ]
then
    echo "usage: $0 <src-port> <dst-host> <dst-port>"
    exit 0
fi

TMP=`mktemp -d`
BACK=$TMP/pipe.back
SENT=$TMP/pipe.sent
RCVD=$TMP/pipe.rcvd

FECHA='Sat, 15 May 1999 00:00:00 +0200'


FILTERIN=$TMP/pipe.in
FILTEROUT=$TMP/pipe.out

trap 'rm -rf "$TMP"' EXIT
mkfifo -m 0600 "$BACK" "$SENT" "$RCVD" "$FILTERIN" "$FILTEROUT"


sed 's/^/ => /' <"$SENT" &
sed 's/^/ #> /' <"$FILTERIN" &
sed 's/^/<=  /' <"$RCVD" &
#sed 's/^/<# /' <"$FILTEROUT" | head -n20 &

FILTER_CLT_SRV="mawk -W interactive -f filter-clt-srv.awk -v HOST=$2 -v PORT=$3"
FILTER_SRV_CLT="mawk -W interactive -f filter-srv-clt.awk -v DATE=$FECHA"


nc -l -p "$1" <"$BACK" | tee "$SENT" | \
    ${FILTER_CLT_SRV} | tee "$FILTERIN"  | \
    nc "$2" "$3" | tee "$RCVD" >"$BACK" | \
    ${FILTER_SRV_CLT}
