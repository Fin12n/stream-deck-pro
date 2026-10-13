package T0;

import Q0.l;
import Q0.m;
import R0.H0;
import R0.InterfaceC1586f0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f9806a;

        public a(d dVar) {
            this.f9806a = dVar;
        }

        @Override // T0.h
        public void a(float[] fArr) {
            this.f9806a.c().o(fArr);
        }

        @Override // T0.h
        public void b(H0 h8, int i8) {
            this.f9806a.c().b(h8, i8);
        }

        @Override // T0.h
        public void c(float f8, float f9, float f10, float f11, int i8) {
            this.f9806a.c().c(f8, f9, f10, f11, i8);
        }

        @Override // T0.h
        public void d(float f8, float f9) {
            this.f9806a.c().d(f8, f9);
        }

        @Override // T0.h
        public void f(float f8, float f9, long j8) {
            InterfaceC1586f0 interfaceC1586f0C = this.f9806a.c();
            interfaceC1586f0C.d(Q0.f.o(j8), Q0.f.p(j8));
            interfaceC1586f0C.g(f8, f9);
            interfaceC1586f0C.d(-Q0.f.o(j8), -Q0.f.p(j8));
        }

        @Override // T0.h
        public void g(float f8, float f9, float f10, float f11) {
            InterfaceC1586f0 interfaceC1586f0C = this.f9806a.c();
            d dVar = this.f9806a;
            long jA = m.a(l.i(j()) - (f10 + f8), l.g(j()) - (f11 + f9));
            if (l.i(jA) < 0.0f || l.g(jA) < 0.0f) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            dVar.b(jA);
            interfaceC1586f0C.d(f8, f9);
        }

        @Override // T0.h
        public void h(float f8, long j8) {
            InterfaceC1586f0 interfaceC1586f0C = this.f9806a.c();
            interfaceC1586f0C.d(Q0.f.o(j8), Q0.f.p(j8));
            interfaceC1586f0C.h(f8);
            interfaceC1586f0C.d(-Q0.f.o(j8), -Q0.f.p(j8));
        }

        public long j() {
            return this.f9806a.d();
        }
    }

    public static final h b(d dVar) {
        return new a(dVar);
    }
}
