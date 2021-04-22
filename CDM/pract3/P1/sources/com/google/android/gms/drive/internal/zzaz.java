package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

public class zzaz implements Parcelable.Creator<OnEventResponse> {
    static void zza(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int zzac = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, onEventResponse.zzCY);
        zzb.zzc(parcel, 2, onEventResponse.zzaca);
        zzb.zza(parcel, 3, (Parcelable) onEventResponse.zzagj, i, false);
        zzb.zza(parcel, 5, (Parcelable) onEventResponse.zzagk, i, false);
        zzb.zza(parcel, 6, (Parcelable) onEventResponse.zzagl, i, false);
        zzb.zza(parcel, 7, (Parcelable) onEventResponse.zzagm, i, false);
        zzb.zza(parcel, 8, (Parcelable) onEventResponse.zzagn, i, false);
        zzb.zzH(parcel, zzac);
    }

    /* renamed from: zzbe */
    public OnEventResponse createFromParcel(Parcel parcel) {
        int i = 0;
        ProgressEvent progressEvent = null;
        int zzab = zza.zzab(parcel);
        ChangesAvailableEvent changesAvailableEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        CompletionEvent completionEvent = null;
        ChangeEvent changeEvent = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzab) {
            int zzaa = zza.zzaa(parcel);
            switch (zza.zzbA(zzaa)) {
                case 1:
                    i2 = zza.zzg(parcel, zzaa);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzaa);
                    break;
                case 3:
                    changeEvent = (ChangeEvent) zza.zza(parcel, zzaa, ChangeEvent.CREATOR);
                    break;
                case 4:
                default:
                    zza.zzb(parcel, zzaa);
                    break;
                case 5:
                    completionEvent = (CompletionEvent) zza.zza(parcel, zzaa, CompletionEvent.CREATOR);
                    break;
                case 6:
                    queryResultEventParcelable = (QueryResultEventParcelable) zza.zza(parcel, zzaa, QueryResultEventParcelable.CREATOR);
                    break;
                case 7:
                    changesAvailableEvent = (ChangesAvailableEvent) zza.zza(parcel, zzaa, ChangesAvailableEvent.CREATOR);
                    break;
                case 8:
                    progressEvent = (ProgressEvent) zza.zza(parcel, zzaa, ProgressEvent.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() == zzab) {
            return new OnEventResponse(i2, i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, progressEvent);
        }
        throw new zza.C0031zza("Overread allowed size end=" + zzab, parcel);
    }

    /* renamed from: zzcT */
    public OnEventResponse[] newArray(int i) {
        return new OnEventResponse[i];
    }
}
