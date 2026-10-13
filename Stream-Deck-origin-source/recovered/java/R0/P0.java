package R0;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class P0 extends AbstractC1582d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shader f9332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9333d;

    public P0() {
        super(null);
        this.f9333d = Q0.l.f9103b.a();
    }

    @Override // R0.AbstractC1582d0
    public final void a(long j8, F0 f8, float f9) {
        Shader shaderB = this.f9332c;
        if (shaderB == null || !Q0.l.f(this.f9333d, j8)) {
            if (Q0.l.k(j8)) {
                shaderB = null;
                this.f9332c = null;
                this.f9333d = Q0.l.f9103b.a();
            } else {
                shaderB = b(j8);
                this.f9332c = shaderB;
                this.f9333d = j8;
            }
        }
        long jD = f8.d();
        C1598l0.a aVar = C1598l0.f9405b;
        if (!C1598l0.q(jD, aVar.a())) {
            f8.t(aVar.a());
        }
        if (!kotlin.jvm.internal.t.c(f8.m(), shaderB)) {
            f8.l(shaderB);
        }
        if (f8.c() == f9) {
            return;
        }
        f8.b(f9);
    }

    public abstract Shader b(long j8);
}
