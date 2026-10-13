package p159s0;

import A1.o;
import A1.p;
import A1.r;
import A1.t;
import C6.m;
import E1.n;
import Q0.f;
import Q0.g;
import S6.c;

/* JADX INFO: renamed from: s0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2885g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2886h f32778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2889k f32779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32780c = f.f9082b.c();

    /* JADX INFO: renamed from: s0.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32781a;

        static {
            int[] iArr = new int[EnumC2886h.values().length];
            try {
                iArr[EnumC2886h.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2886h.TopMiddle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2886h.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32781a = iArr;
        }
    }

    public C2885g(EnumC2886h enumC2886h, InterfaceC2889k interfaceC2889k) {
        this.f32778a = enumC2886h;
        this.f32779b = interfaceC2889k;
    }

    @Override // E1.n
    public long a(p pVar, long j8, t tVar, long j9) {
        int iG;
        long jA = this.f32779b.a();
        if (!g.c(jA)) {
            jA = this.f32780c;
        }
        this.f32780c = jA;
        int i8 = a.f32781a[this.f32778a.ordinal()];
        if (i8 == 1) {
            iG = 0;
        } else if (i8 == 2) {
            iG = r.g(j9) / 2;
        } else {
            if (i8 != 3) {
                throw new m();
            }
            iG = r.g(j9);
        }
        long jA2 = o.a(c.d(f.o(jA)), c.d(f.p(jA)));
        return o.a((pVar.d() + A1.n.j(jA2)) - iG, pVar.f() + A1.n.k(jA2));
    }
}
