package L4;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f5044a;

    public e() {
        this.f5044a = Looper.getMainLooper();
    }

    public e(Looper looper) {
        super(looper);
        this.f5044a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f5044a = Looper.getMainLooper();
    }
}
