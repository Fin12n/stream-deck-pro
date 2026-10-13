package P4;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f8895a;

    public a() {
        this.f8895a = Looper.getMainLooper();
    }

    public a(Looper looper) {
        super(looper);
        this.f8895a = Looper.getMainLooper();
    }
}
