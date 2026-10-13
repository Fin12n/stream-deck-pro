package A;

import H.m1;
import android.graphics.Matrix;

/* JADX INFO: renamed from: A.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884m0 implements InterfaceC0870f0 {
    public static InterfaceC0870f0 f(m1 m1Var, long j8, int i8, Matrix matrix, int i9) {
        return new C0871g(m1Var, j8, i8, matrix, i9);
    }

    @Override // A.InterfaceC0870f0
    public abstract long a();

    @Override // A.InterfaceC0870f0
    public abstract m1 b();

    @Override // A.InterfaceC0870f0
    public abstract int c();

    @Override // A.InterfaceC0870f0
    public void d(I.h.b bVar) {
        bVar.m(e());
    }

    @Override // A.InterfaceC0870f0
    public abstract int e();

    public abstract Matrix g();
}
