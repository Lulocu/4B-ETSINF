package android.arch.lifecycle;

import android.arch.core.util.Function;

public class Transformations {
    private Transformations() {
    }

    public static <X, Y> LiveData<Y> map(LiveData<X> liveData, final Function<X, Y> function) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() {
            /* class android.arch.lifecycle.Transformations.AnonymousClass1 */

            @Override // android.arch.lifecycle.Observer
            public void onChanged(X x) {
                mediatorLiveData.setValue(function.apply(x));
            }
        });
        return mediatorLiveData;
    }

    public static <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final Function<X, LiveData<Y>> function) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() {
            /* class android.arch.lifecycle.Transformations.AnonymousClass2 */
            LiveData<Y> mSource;

            @Override // android.arch.lifecycle.Observer
            public void onChanged(X x) {
                LiveData<Y> liveData = (LiveData) function.apply(x);
                LiveData<Y> liveData2 = this.mSource;
                if (liveData2 != liveData) {
                    if (liveData2 != null) {
                        mediatorLiveData.removeSource(liveData2);
                    }
                    this.mSource = liveData;
                    if (liveData != null) {
                        mediatorLiveData.addSource(liveData, new Observer<Y>() {
                            /* class android.arch.lifecycle.Transformations.AnonymousClass2.AnonymousClass1 */

                            @Override // android.arch.lifecycle.Observer
                            public void onChanged(Y y) {
                                mediatorLiveData.setValue(y);
                            }
                        });
                    }
                }
            }
        });
        return mediatorLiveData;
    }
}
