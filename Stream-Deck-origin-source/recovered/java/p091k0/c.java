package p091k0;

import C6.G;
import G6.d;
import p055g0.H;
import p109m0.E;
import p110m1.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f28400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f28401b;

        public a(y yVar, boolean z8) {
            this.f28400a = yVar;
            this.f28401b = z8;
        }

        @Override // p109m0.E
        public boolean a() {
            return this.f28400a.a();
        }

        @Override // p109m0.E
        public Object c(float f8, d dVar) {
            Object objB = H.b(this.f28400a, f8, null, dVar, 2, null);
            return objB == H6.c.f() ? objB : G.f1419a;
        }

        @Override // p109m0.E
        public Object d(int i8, d dVar) {
            Object objI = y.I(this.f28400a, i8, 0, dVar, 2, null);
            return objI == H6.c.f() ? objI : G.f1419a;
        }

        @Override // p109m0.E
        public int e() {
            return this.f28400a.q();
        }

        @Override // p109m0.E
        public b f() {
            return this.f28401b ? new b(-1, 1) : new b(1, -1);
        }

        @Override // p109m0.E
        public int h() {
            return this.f28400a.p();
        }
    }

    public static final E a(y yVar, boolean z8) {
        return new a(yVar, z8);
    }
}
