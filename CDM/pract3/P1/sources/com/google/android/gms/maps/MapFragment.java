package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapFragment extends Fragment {
    private final zzb zzaBU = new zzb(this);
    private GoogleMap zzaBV;

    /* access modifiers changed from: package-private */
    public static class zza implements MapLifecycleDelegate {
        private final IMapFragmentDelegate zzaBW;
        private final Fragment zzajt;

        public zza(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.zzaBW = (IMapFragmentDelegate) zzu.zzu(iMapFragmentDelegate);
            this.zzajt = (Fragment) zzu.zzu(fragment);
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public void getMapAsync(final OnMapReadyCallback callback) {
            try {
                this.zzaBW.getMapAsync(new zzm.zza() {
                    /* class com.google.android.gms.maps.MapFragment.zza.AnonymousClass1 */

                    @Override // com.google.android.gms.maps.internal.zzm
                    public void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
                        callback.onMapReady(new GoogleMap(iGoogleMapDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onCreate(Bundle savedInstanceState) {
            if (savedInstanceState == null) {
                try {
                    savedInstanceState = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.zzajt.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                zzx.zza(savedInstanceState, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.zzaBW.onCreate(savedInstanceState);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            try {
                return (View) zze.zzn(this.zzaBW.onCreateView(zze.zzw(inflater), zze.zzw(container), savedInstanceState));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.zzaBW.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onDestroyView() {
            try {
                this.zzaBW.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
            try {
                this.zzaBW.onInflate(zze.zzw(activity), (GoogleMapOptions) attrs.getParcelable("MapOptions"), savedInstanceState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.zzaBW.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.zzaBW.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.zzaBW.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle outState) {
            try {
                this.zzaBW.onSaveInstanceState(outState);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStart() {
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public void onStop() {
        }

        public IMapFragmentDelegate zzvt() {
            return this.zzaBW;
        }
    }

    /* access modifiers changed from: package-private */
    public static class zzb extends com.google.android.gms.dynamic.zza<zza> {
        private Activity mActivity;
        protected zzf<zza> zzaBZ;
        private final List<OnMapReadyCallback> zzaCa = new ArrayList();
        private final Fragment zzajt;

        zzb(Fragment fragment) {
            this.zzajt = fragment;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void setActivity(Activity activity) {
            this.mActivity = activity;
            zzvu();
        }

        public void getMapAsync(OnMapReadyCallback callback) {
            if (zzqj() != null) {
                ((zza) zzqj()).getMapAsync(callback);
            } else {
                this.zzaCa.add(callback);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.dynamic.zza
        public void zza(zzf<zza> zzf) {
            this.zzaBZ = zzf;
            zzvu();
        }

        public void zzvu() {
            if (this.mActivity != null && this.zzaBZ != null && zzqj() == null) {
                try {
                    MapsInitializer.initialize(this.mActivity);
                    IMapFragmentDelegate zzr = zzy.zzay(this.mActivity).zzr(zze.zzw(this.mActivity));
                    if (zzr != null) {
                        this.zzaBZ.zza(new zza(this.zzajt, zzr));
                        for (OnMapReadyCallback onMapReadyCallback : this.zzaCa) {
                            ((zza) zzqj()).getMapAsync(onMapReadyCallback);
                        }
                        this.zzaCa.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }
    }

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(GoogleMapOptions options) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", options);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    @Deprecated
    public final GoogleMap getMap() {
        IMapFragmentDelegate zzvt = zzvt();
        if (zzvt == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = zzvt.getMap();
            if (map == null) {
                return null;
            }
            if (this.zzaBV == null || this.zzaBV.zzvi().asBinder() != map.asBinder()) {
                this.zzaBV = new GoogleMap(map);
            }
            return this.zzaBV;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getMapAsync(OnMapReadyCallback callback) {
        zzu.zzbY("getMapAsync must be called on the main thread.");
        this.zzaBU.getMapAsync(callback);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            savedInstanceState.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.zzaBU.setActivity(activity);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.zzaBU.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = this.zzaBU.onCreateView(inflater, container, savedInstanceState);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        this.zzaBU.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzaBU.onDestroyView();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        this.zzaBU.setActivity(activity);
        GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attrs);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", createFromAttributes);
        this.zzaBU.onInflate(activity, bundle, savedInstanceState);
    }

    public void onLowMemory() {
        this.zzaBU.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzaBU.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzaBU.onResume();
    }

    public void onSaveInstanceState(Bundle outState) {
        if (outState != null) {
            outState.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(outState);
        this.zzaBU.onSaveInstanceState(outState);
    }

    public void setArguments(Bundle args) {
        super.setArguments(args);
    }

    /* access modifiers changed from: protected */
    public IMapFragmentDelegate zzvt() {
        this.zzaBU.zzvu();
        if (this.zzaBU.zzqj() == null) {
            return null;
        }
        return ((zza) this.zzaBU.zzqj()).zzvt();
    }
}
