package p191w0;

import A1.h;
import R0.AbstractC1602n0;
import R0.C1598l0;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p207y0.d;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: w0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3091w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f36650a = AbstractC3182v.e(a.f36652a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f36651b = AbstractC3182v.e(b.f36653a);

    /* JADX INFO: renamed from: w0.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36652a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3089v invoke() {
            return AbstractC3091w.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    /* JADX INFO: renamed from: w0.w$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36653a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: w0.w$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36654a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[d.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[d.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[d.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[d.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[d.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[d.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[d.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[d.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[d.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[d.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[d.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[d.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[d.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[d.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[d.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[d.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f36654a = iArr;
        }
    }

    public static final long a(C3089v c3089v, long j8, float f8, InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1610977682, i8, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:841)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC3163l.e(f36651b)).booleanValue();
        if (C1598l0.q(j8, c3089v.G()) && zBooleanValue) {
            j8 = l(c3089v, f8);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return j8;
    }

    public static final long b(C3089v c3089v, long j8) {
        if (C1598l0.q(j8, c3089v.B())) {
            return c3089v.r();
        }
        if (C1598l0.q(j8, c3089v.E())) {
            return c3089v.t();
        }
        if (C1598l0.q(j8, c3089v.Q())) {
            return c3089v.x();
        }
        if (C1598l0.q(j8, c3089v.a())) {
            return c3089v.o();
        }
        if (C1598l0.q(j8, c3089v.j())) {
            return c3089v.p();
        }
        if (C1598l0.q(j8, c3089v.C())) {
            return c3089v.s();
        }
        if (C1598l0.q(j8, c3089v.F())) {
            return c3089v.u();
        }
        if (C1598l0.q(j8, c3089v.R())) {
            return c3089v.y();
        }
        if (C1598l0.q(j8, c3089v.k())) {
            return c3089v.q();
        }
        if (C1598l0.q(j8, c3089v.n())) {
            return c3089v.l();
        }
        if (C1598l0.q(j8, c3089v.G())) {
            return c3089v.v();
        }
        if (C1598l0.q(j8, c3089v.P())) {
            return c3089v.w();
        }
        if (C1598l0.q(j8, c3089v.H())) {
            return c3089v.v();
        }
        if (C1598l0.q(j8, c3089v.I())) {
            return c3089v.v();
        }
        if (C1598l0.q(j8, c3089v.J())) {
            return c3089v.v();
        }
        if (C1598l0.q(j8, c3089v.K())) {
            return c3089v.v();
        }
        if (C1598l0.q(j8, c3089v.L())) {
            return c3089v.v();
        }
        return C1598l0.q(j8, c3089v.M()) ? c3089v.v() : C1598l0.f9405b.e();
    }

    public static final long c(long j8, InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(509589638, i8, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:823)");
        }
        long jB = b(Z.f35786a.a(interfaceC3163l, 6), j8);
        if (jB == C1598l0.f9405b.e()) {
            jB = ((C1598l0) interfaceC3163l.e(B.a())).y();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return jB;
    }

    public static final C3089v d(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        return new C3089v(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j43, j38, j39, j40, j41, j42, null);
    }

    public static /* synthetic */ C3089v e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, int i8, int i9, Object obj) {
        long jT = (i8 & 1) != 0 ? p207y0.b.f37570a.t() : j8;
        long j44 = (i8 & 2) != 0 ? p207y0.b.f37570a.j() : j9;
        long jU = (i8 & 4) != 0 ? p207y0.b.f37570a.u() : j10;
        long jK = (i8 & 8) != 0 ? p207y0.b.f37570a.k() : j11;
        long jE = (i8 & 16) != 0 ? p207y0.b.f37570a.e() : j12;
        long jW = (i8 & 32) != 0 ? p207y0.b.f37570a.w() : j13;
        long jL = (i8 & 64) != 0 ? p207y0.b.f37570a.l() : j14;
        long jX = (i8 & 128) != 0 ? p207y0.b.f37570a.x() : j15;
        long j45 = jT;
        long jM = (i8 & 256) != 0 ? p207y0.b.f37570a.m() : j16;
        long jH = (i8 & 512) != 0 ? p207y0.b.f37570a.H() : j17;
        long jP = (i8 & 1024) != 0 ? p207y0.b.f37570a.p() : j18;
        long jI = (i8 & 2048) != 0 ? p207y0.b.f37570a.I() : j19;
        long jQ = (i8 & 4096) != 0 ? p207y0.b.f37570a.q() : j20;
        long jA = (i8 & 8192) != 0 ? p207y0.b.f37570a.a() : j21;
        long jG = (i8 & 16384) != 0 ? p207y0.b.f37570a.g() : j22;
        long jY = (i8 & 32768) != 0 ? p207y0.b.f37570a.y() : j23;
        long jN = (i8 & 65536) != 0 ? p207y0.b.f37570a.n() : j24;
        long jG2 = (i8 & 131072) != 0 ? p207y0.b.f37570a.G() : j25;
        long jO = (i8 & 262144) != 0 ? p207y0.b.f37570a.o() : j26;
        long j46 = (i8 & 524288) != 0 ? j45 : j27;
        long jF = (i8 & 1048576) != 0 ? p207y0.b.f37570a.f() : j28;
        long jD = (i8 & 2097152) != 0 ? p207y0.b.f37570a.d() : j29;
        long jB = (i8 & 4194304) != 0 ? p207y0.b.f37570a.b() : j30;
        long jH2 = (i8 & 8388608) != 0 ? p207y0.b.f37570a.h() : j31;
        long jC = (i8 & 16777216) != 0 ? p207y0.b.f37570a.c() : j32;
        long jI2 = (i8 & 33554432) != 0 ? p207y0.b.f37570a.i() : j33;
        long jR = (i8 & 67108864) != 0 ? p207y0.b.f37570a.r() : j34;
        long jS = (i8 & 134217728) != 0 ? p207y0.b.f37570a.s() : j35;
        long jV = (i8 & 268435456) != 0 ? p207y0.b.f37570a.v() : j36;
        long jZ = (i8 & 536870912) != 0 ? p207y0.b.f37570a.z() : j37;
        long jA2 = (i8 & 1073741824) != 0 ? p207y0.b.f37570a.A() : j38;
        long jB2 = (i8 & Integer.MIN_VALUE) != 0 ? p207y0.b.f37570a.B() : j39;
        long jC2 = (i9 & 1) != 0 ? p207y0.b.f37570a.C() : j40;
        long jD2 = (i9 & 2) != 0 ? p207y0.b.f37570a.D() : j41;
        long jE2 = (i9 & 4) != 0 ? p207y0.b.f37570a.E() : j42;
        if ((i9 & 8) != 0) {
            j43 = p207y0.b.f37570a.F();
        }
        return d(j45, j44, jU, jK, jE, jW, jL, jX, jM, jH, jP, jI, jQ, jA, jG, jY, jN, jG2, jO, j46, jF, jD, jB, jH2, jC, jI2, jR, jS, jV, jZ, jA2, jB2, jC2, jD2, jE2, j43);
    }

    public static final long f(C3089v c3089v, d dVar) {
        switch (c.f36654a[dVar.ordinal()]) {
            case 1:
                return c3089v.a();
            case 2:
                return c3089v.j();
            case 3:
                return c3089v.k();
            case 4:
                return c3089v.l();
            case 5:
                return c3089v.m();
            case 6:
                return c3089v.n();
            case 7:
                return c3089v.o();
            case 8:
                return c3089v.p();
            case 9:
                return c3089v.q();
            case 10:
                return c3089v.r();
            case 11:
                return c3089v.s();
            case 12:
                return c3089v.t();
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return c3089v.u();
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return c3089v.v();
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return c3089v.w();
            case 16:
                return c3089v.O();
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return c3089v.x();
            case 18:
                return c3089v.y();
            case 19:
                return c3089v.z();
            case 20:
                return c3089v.A();
            case 21:
                return c3089v.B();
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                return c3089v.C();
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                return c3089v.D();
            case 24:
                return c3089v.E();
            case 25:
                return c3089v.F();
            case 26:
                return c3089v.G();
            case 27:
                return c3089v.P();
            case 28:
                return c3089v.H();
            case 29:
                return c3089v.I();
            case 30:
                return c3089v.J();
            case 31:
                return c3089v.K();
            case 32:
                return c3089v.L();
            case 33:
                return c3089v.M();
            case 34:
                return c3089v.N();
            case 35:
                return c3089v.Q();
            case 36:
                return c3089v.R();
            default:
                return C1598l0.f9405b.e();
        }
    }

    public static final B0 g() {
        return f36650a;
    }

    public static final B0 h() {
        return f36651b;
    }

    public static final long i(d dVar, InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-810780884, i8, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:945)");
        }
        long jF = f(Z.f35786a.a(interfaceC3163l, 6), dVar);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return jF;
    }

    public static final C3089v j(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43) {
        return new C3089v(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j43, j38, j39, j40, j41, j42, null);
    }

    public static /* synthetic */ C3089v k(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, int i8, int i9, Object obj) {
        long jT = (i8 & 1) != 0 ? p207y0.c.f37619a.t() : j8;
        long j44 = (i8 & 2) != 0 ? p207y0.c.f37619a.j() : j9;
        long jU = (i8 & 4) != 0 ? p207y0.c.f37619a.u() : j10;
        long jK = (i8 & 8) != 0 ? p207y0.c.f37619a.k() : j11;
        long jE = (i8 & 16) != 0 ? p207y0.c.f37619a.e() : j12;
        long jW = (i8 & 32) != 0 ? p207y0.c.f37619a.w() : j13;
        long jL = (i8 & 64) != 0 ? p207y0.c.f37619a.l() : j14;
        long jX = (i8 & 128) != 0 ? p207y0.c.f37619a.x() : j15;
        long j45 = jT;
        long jM = (i8 & 256) != 0 ? p207y0.c.f37619a.m() : j16;
        long jH = (i8 & 512) != 0 ? p207y0.c.f37619a.H() : j17;
        long jP = (i8 & 1024) != 0 ? p207y0.c.f37619a.p() : j18;
        long jI = (i8 & 2048) != 0 ? p207y0.c.f37619a.I() : j19;
        long jQ = (i8 & 4096) != 0 ? p207y0.c.f37619a.q() : j20;
        long jA = (i8 & 8192) != 0 ? p207y0.c.f37619a.a() : j21;
        long jG = (i8 & 16384) != 0 ? p207y0.c.f37619a.g() : j22;
        long jY = (i8 & 32768) != 0 ? p207y0.c.f37619a.y() : j23;
        long jN = (i8 & 65536) != 0 ? p207y0.c.f37619a.n() : j24;
        long jG2 = (i8 & 131072) != 0 ? p207y0.c.f37619a.G() : j25;
        long jO = (i8 & 262144) != 0 ? p207y0.c.f37619a.o() : j26;
        long j46 = (i8 & 524288) != 0 ? j45 : j27;
        long jF = (i8 & 1048576) != 0 ? p207y0.c.f37619a.f() : j28;
        long jD = (i8 & 2097152) != 0 ? p207y0.c.f37619a.d() : j29;
        long jB = (i8 & 4194304) != 0 ? p207y0.c.f37619a.b() : j30;
        long jH2 = (i8 & 8388608) != 0 ? p207y0.c.f37619a.h() : j31;
        long jC = (i8 & 16777216) != 0 ? p207y0.c.f37619a.c() : j32;
        long jI2 = (i8 & 33554432) != 0 ? p207y0.c.f37619a.i() : j33;
        long jR = (i8 & 67108864) != 0 ? p207y0.c.f37619a.r() : j34;
        long jS = (i8 & 134217728) != 0 ? p207y0.c.f37619a.s() : j35;
        long jV = (i8 & 268435456) != 0 ? p207y0.c.f37619a.v() : j36;
        long jZ = (i8 & 536870912) != 0 ? p207y0.c.f37619a.z() : j37;
        long jA2 = (i8 & 1073741824) != 0 ? p207y0.c.f37619a.A() : j38;
        long jB2 = (i8 & Integer.MIN_VALUE) != 0 ? p207y0.c.f37619a.B() : j39;
        long jC2 = (i9 & 1) != 0 ? p207y0.c.f37619a.C() : j40;
        long jD2 = (i9 & 2) != 0 ? p207y0.c.f37619a.D() : j41;
        long jE2 = (i9 & 4) != 0 ? p207y0.c.f37619a.E() : j42;
        if ((i9 & 8) != 0) {
            j43 = p207y0.c.f37619a.F();
        }
        return j(j45, j44, jU, jK, jE, jW, jL, jX, jM, jH, jP, jI, jQ, jA, jG, jY, jN, jG2, jO, j46, jF, jD, jB, jH2, jC, jI2, jR, jS, jV, jZ, jA2, jB2, jC2, jD2, jE2, j43);
    }

    public static final long l(C3089v c3089v, float f8) {
        if (h.t(f8, h.m(0))) {
            return c3089v.G();
        }
        return AbstractC1602n0.f(C1598l0.o(c3089v.O(), ((((float) Math.log(f8 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), c3089v.G());
    }
}
