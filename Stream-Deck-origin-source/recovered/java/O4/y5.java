package O4;

import java.io.UnsupportedEncodingException;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y5 implements InterfaceC1484p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G3 f8670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K4 f8671b = new K4();

    public y5(G3 g8, int i8) {
        this.f8670a = g8;
        K5.a();
    }

    public static InterfaceC1484p5 d(G3 g8) {
        return new y5(g8, 0);
    }

    @Override // O4.InterfaceC1484p5
    public final InterfaceC1484p5 a(F3 f8) {
        this.f8670a.c(f8);
        return this;
    }

    @Override // O4.InterfaceC1484p5
    public final InterfaceC1484p5 b(K4 k8) {
        this.f8671b = k8;
        return this;
    }

    @Override // O4.InterfaceC1484p5
    public final byte[] c(int i8, boolean z8) {
        this.f8671b.f(Boolean.valueOf(1 == (i8 ^ 1)));
        this.f8671b.e(Boolean.FALSE);
        this.f8670a.e(this.f8671b.m());
        try {
            K5.a();
            if (i8 == 0) {
                return new p060g5.d().j(N2.f7982a).k(true).i().b(this.f8670a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f8670a.f();
            C1464n c1464n = new C1464n();
            N2.f7982a.a(c1464n);
            return c1464n.b().a(i3F);
        } catch (UnsupportedEncodingException e8) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e8);
        }
    }

    @Override // O4.InterfaceC1484p5
    public final String j() {
        N4 n4C = this.f8670a.f().c();
        return (n4C == null || AbstractC1425h2.b(n4C.k())) ? "NA" : (String) AbstractC3207p.k(n4C.k());
    }
}
