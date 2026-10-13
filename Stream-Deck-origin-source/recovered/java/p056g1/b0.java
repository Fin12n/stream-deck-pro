package p056g1;

import A1.s;
import Q6.k;
import p038e1.AbstractC2230a;
import p038e1.G;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;
import p038e1.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f23562a = new b0();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2243n f23563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f23564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f23565c;

        public a(InterfaceC2243n interfaceC2243n, c cVar, d dVar) {
            this.f23563a = interfaceC2243n;
            this.f23564b = cVar;
            this.f23565c = dVar;
        }

        @Override // p038e1.InterfaceC2243n
        public int F(int i8) {
            return this.f23563a.F(i8);
        }

        @Override // p038e1.InterfaceC2243n
        public int G(int i8) {
            return this.f23563a.G(i8);
        }

        @Override // p038e1.G
        public a0 J(long j8) {
            if (this.f23565c == d.Width) {
                return new b(this.f23564b == c.Max ? this.f23563a.G(A1.b.m(j8)) : this.f23563a.F(A1.b.m(j8)), A1.b.i(j8) ? A1.b.m(j8) : 32767);
            }
            return new b(A1.b.j(j8) ? A1.b.n(j8) : 32767, this.f23564b == c.Max ? this.f23563a.g(A1.b.n(j8)) : this.f23563a.W(A1.b.n(j8)));
        }

        @Override // p038e1.InterfaceC2243n
        public int W(int i8) {
            return this.f23563a.W(i8);
        }

        @Override // p038e1.InterfaceC2243n
        public Object e() {
            return this.f23563a.e();
        }

        @Override // p038e1.InterfaceC2243n
        public int g(int i8) {
            return this.f23563a.g(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        Min,
        Max
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        Width,
        Height
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        I c(J j8, G g8, long j9);
    }

    public final int a(e eVar, InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return eVar.c(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), new a(interfaceC2243n, c.Max, d.Height), A1.c.b(0, i8, 0, 0, 13, null)).f();
    }

    public final int b(e eVar, InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return eVar.c(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), new a(interfaceC2243n, c.Max, d.Width), A1.c.b(0, 0, 0, i8, 7, null)).g();
    }

    public final int c(e eVar, InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return eVar.c(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), new a(interfaceC2243n, c.Min, d.Height), A1.c.b(0, i8, 0, 0, 13, null)).f();
    }

    public final int d(e eVar, InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return eVar.c(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), new a(interfaceC2243n, c.Min, d.Width), A1.c.b(0, 0, 0, i8, 7, null)).g();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends a0 {
        public b(int i8, int i9) {
            I0(s.a(i8, i9));
        }

        @Override // p038e1.K
        public int Q(AbstractC2230a abstractC2230a) {
            return Integer.MIN_VALUE;
        }

        @Override // p038e1.a0
        public void D0(long j8, float f8, k kVar) {
        }
    }
}
