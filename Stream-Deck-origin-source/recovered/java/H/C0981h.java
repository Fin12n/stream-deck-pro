package H;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: H.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0981h extends AbstractC0972c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f3035b;

    public C0981h(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f3034a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f3035b = handler;
    }

    @Override // H.AbstractC0972c0
    public Executor b() {
        return this.f3034a;
    }

    @Override // H.AbstractC0972c0
    public Handler c() {
        return this.f3035b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0972c0) {
            AbstractC0972c0 abstractC0972c0 = (AbstractC0972c0) obj;
            if (this.f3034a.equals(abstractC0972c0.b()) && this.f3035b.equals(abstractC0972c0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3034a.hashCode() ^ 1000003) * 1000003) ^ this.f3035b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f3034a + ", schedulerHandler=" + this.f3035b + "}";
    }
}
