package p211y4;

import S4.l;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p195w4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3113n f38335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f38336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3112m f38337d;

    public Y(int i8, AbstractC3113n abstractC3113n, l lVar, InterfaceC3112m interfaceC3112m) {
        super(i8);
        this.f38336c = lVar;
        this.f38335b = abstractC3113n;
        this.f38337d = interfaceC3112m;
        if (i8 == 2 && abstractC3113n.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p211y4.a0
    public final void a(Status status) {
        this.f38336c.d(this.f38337d.a(status));
    }

    @Override // p211y4.a0
    public final void b(Exception exc) {
        this.f38336c.d(exc);
    }

    @Override // p211y4.a0
    public final void c(B b8) throws DeadObjectException {
        try {
            this.f38335b.b(b8.w(), this.f38336c);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(a0.e(e9));
        } catch (RuntimeException e10) {
            this.f38336c.d(e10);
        }
    }

    @Override // p211y4.a0
    public final void d(r rVar, boolean z8) {
        rVar.b(this.f38336c, z8);
    }

    @Override // p211y4.J
    public final boolean f(B b8) {
        return this.f38335b.c();
    }

    @Override // p211y4.J
    public final d[] g(B b8) {
        return this.f38335b.e();
    }
}
