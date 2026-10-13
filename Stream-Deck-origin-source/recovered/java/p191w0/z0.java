package p191w0;

import A1.h;
import C6.m;
import R0.N0;
import R0.T0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p135p0.c;
import p135p0.g;
import p207y0.p;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f36721a = AbstractC3182v.e(a.f36722a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36722a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            return new y0(null, null, null, null, null, 31, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36723a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f36723a = iArr;
        }
    }

    public static final p135p0.a a(p135p0.a aVar) {
        float f8 = (float) 0.0d;
        return p135p0.a.c(aVar, c.b(h.m(f8)), null, null, c.b(h.m(f8)), 6, null);
    }

    public static final T0 b(y0 y0Var, p pVar) {
        switch (b.f36723a[pVar.ordinal()]) {
            case 1:
                return y0Var.a();
            case 2:
                return e(y0Var.a());
            case 3:
                return y0Var.b();
            case 4:
                return e(y0Var.b());
            case 5:
                return g.f();
            case 6:
                return y0Var.c();
            case 7:
                return a(y0Var.c());
            case 8:
                return e(y0Var.c());
            case 9:
                return y0Var.d();
            case 10:
                return N0.a();
            case 11:
                return y0Var.e();
            default:
                throw new m();
        }
    }

    public static final B0 c() {
        return f36721a;
    }

    public static final T0 d(p pVar, InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1629172543, i8, -1, "androidx.compose.material3.<get-value> (Shapes.kt:192)");
        }
        T0 t0B = b(Z.f35786a.b(interfaceC3163l, 6), pVar);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return t0B;
    }

    public static final p135p0.a e(p135p0.a aVar) {
        float f8 = (float) 0.0d;
        return p135p0.a.c(aVar, null, null, c.b(h.m(f8)), c.b(h.m(f8)), 3, null);
    }
}
