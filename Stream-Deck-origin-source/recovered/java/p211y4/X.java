package p211y4;

import S4.l;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p203x4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f38334b;

    public X(int i8, l lVar) {
        super(i8);
        this.f38334b = lVar;
    }

    @Override // p211y4.a0
    public final void a(Status status) {
        this.f38334b.d(new b(status));
    }

    @Override // p211y4.a0
    public final void b(Exception exc) {
        this.f38334b.d(exc);
    }

    @Override // p211y4.a0
    public final void c(B b8) throws DeadObjectException {
        try {
            h(b8);
        } catch (DeadObjectException e8) {
            a(a0.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(a0.e(e9));
        } catch (RuntimeException e10) {
            this.f38334b.d(e10);
        }
    }

    public abstract void h(B b8);

    @Override // p211y4.a0
    public void d(r rVar, boolean z8) {
    }
}
