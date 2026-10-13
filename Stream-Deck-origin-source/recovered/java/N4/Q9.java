package N4;

import java.io.UnsupportedEncodingException;
import p181u6.GfRt.QhsKALGiniuQ;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q9 implements C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1082a7 f6545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y8 f6546b = new Y8();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6547c;

    public Q9(C1082a7 c1082a7, int i8) {
        this.f6545a = c1082a7;
        C1085aa.a();
        this.f6547c = i8;
    }

    public static C9 a(C1082a7 c1082a7) {
        return new Q9(c1082a7, 0);
    }

    public static C9 b(C1082a7 c1082a7, int i8) {
        return new Q9(c1082a7, 1);
    }

    @Override // N4.C9
    public final String k() {
        C1084a9 c1084a9G = this.f6545a.j().g();
        return (c1084a9G == null || AbstractC1318v.b(c1084a9G.k())) ? "NA" : (String) AbstractC3207p.k(c1084a9G.k());
    }

    @Override // N4.C9
    public final C9 l(Y8 y8) {
        this.f6546b = y8;
        return this;
    }

    @Override // N4.C9
    public final C9 n(Z6 z8) {
        this.f6545a.f(z8);
        return this;
    }

    @Override // N4.C9
    public final int zza() {
        return this.f6547c;
    }

    @Override // N4.C9
    public final byte[] m(int i8, boolean z8) {
        this.f6546b.f(Boolean.valueOf(1 == (i8 ^ 1)));
        this.f6546b.e(Boolean.FALSE);
        this.f6545a.i(this.f6546b.m());
        try {
            C1085aa.a();
            if (i8 == 0) {
                return new p060g5.d().j(R5.f6551a).k(true).i().b(this.f6545a.j()).getBytes("utf-8");
            }
            C1106c7 c1106c7J = this.f6545a.j();
            U0 u8 = new U0();
            R5.f6551a.a(u8);
            return u8.b().a(c1106c7J);
        } catch (UnsupportedEncodingException e8) {
            throw new UnsupportedOperationException(QhsKALGiniuQ.AcBHiqyAZGdkCr, e8);
        }
    }
}
