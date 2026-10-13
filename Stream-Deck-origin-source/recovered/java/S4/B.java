package S4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f9730b;

    public B(C c8, k kVar) {
        this.f9730b = c8;
        this.f9729a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            k kVarA = this.f9730b.f9732b.a(this.f9729a.i());
            if (kVarA == null) {
                this.f9730b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            C c8 = this.f9730b;
            Executor executor = m.f9748b;
            kVarA.g(executor, c8);
            kVarA.e(executor, this.f9730b);
            kVarA.a(executor, this.f9730b);
        } catch (C1638i e8) {
            if (e8.getCause() instanceof Exception) {
                this.f9730b.d((Exception) e8.getCause());
            } else {
                this.f9730b.d(e8);
            }
        } catch (CancellationException unused) {
            this.f9730b.b();
        } catch (Exception e9) {
            this.f9730b.d(e9);
        }
    }
}
