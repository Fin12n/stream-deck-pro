package R0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9293a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f9293a = iArr;
        }
    }

    public static final BlendMode a(int i8) {
        X.a aVar = X.f9354a;
        if (X.E(i8, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (X.E(i8, aVar.x())) {
            return BlendMode.SRC;
        }
        if (X.E(i8, aVar.g())) {
            return BlendMode.DST;
        }
        if (X.E(i8, aVar.B())) {
            return BlendMode.SRC_OVER;
        }
        if (X.E(i8, aVar.k())) {
            return BlendMode.DST_OVER;
        }
        if (X.E(i8, aVar.z())) {
            return BlendMode.SRC_IN;
        }
        if (X.E(i8, aVar.i())) {
            return BlendMode.DST_IN;
        }
        if (X.E(i8, aVar.A())) {
            return BlendMode.SRC_OUT;
        }
        if (X.E(i8, aVar.j())) {
            return BlendMode.DST_OUT;
        }
        if (X.E(i8, aVar.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (X.E(i8, aVar.h())) {
            return BlendMode.DST_ATOP;
        }
        if (X.E(i8, aVar.C())) {
            return BlendMode.XOR;
        }
        if (X.E(i8, aVar.t())) {
            return BlendMode.PLUS;
        }
        if (X.E(i8, aVar.q())) {
            return BlendMode.MODULATE;
        }
        if (X.E(i8, aVar.v())) {
            return BlendMode.SCREEN;
        }
        if (X.E(i8, aVar.s())) {
            return BlendMode.OVERLAY;
        }
        if (X.E(i8, aVar.e())) {
            return BlendMode.DARKEN;
        }
        if (X.E(i8, aVar.o())) {
            return BlendMode.LIGHTEN;
        }
        if (X.E(i8, aVar.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (X.E(i8, aVar.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (X.E(i8, aVar.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (X.E(i8, aVar.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (X.E(i8, aVar.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (X.E(i8, aVar.l())) {
            return BlendMode.EXCLUSION;
        }
        if (X.E(i8, aVar.r())) {
            return BlendMode.MULTIPLY;
        }
        if (X.E(i8, aVar.n())) {
            return BlendMode.HUE;
        }
        if (X.E(i8, aVar.u())) {
            return BlendMode.SATURATION;
        }
        if (X.E(i8, aVar.b())) {
            return BlendMode.COLOR;
        }
        return X.E(i8, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.f9293a[blendMode.ordinal()]) {
            case 1:
                return X.f9354a.a();
            case 2:
                return X.f9354a.x();
            case 3:
                return X.f9354a.g();
            case 4:
                return X.f9354a.B();
            case 5:
                return X.f9354a.k();
            case 6:
                return X.f9354a.z();
            case 7:
                return X.f9354a.i();
            case 8:
                return X.f9354a.A();
            case 9:
                return X.f9354a.j();
            case 10:
                return X.f9354a.y();
            case 11:
                return X.f9354a.h();
            case 12:
                return X.f9354a.C();
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return X.f9354a.t();
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return X.f9354a.q();
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return X.f9354a.v();
            case 16:
                return X.f9354a.s();
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return X.f9354a.e();
            case 18:
                return X.f9354a.o();
            case 19:
                return X.f9354a.d();
            case 20:
                return X.f9354a.c();
            case 21:
                return X.f9354a.m();
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                return X.f9354a.w();
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                return X.f9354a.f();
            case 24:
                return X.f9354a.l();
            case 25:
                return X.f9354a.r();
            case 26:
                return X.f9354a.n();
            case 27:
                return X.f9354a.u();
            case 28:
                return X.f9354a.b();
            case 29:
                return X.f9354a.p();
            default:
                return X.f9354a.B();
        }
    }

    public static final PorterDuff.Mode c(int i8) {
        X.a aVar = X.f9354a;
        if (X.E(i8, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (X.E(i8, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (X.E(i8, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (X.E(i8, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (X.E(i8, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (X.E(i8, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (X.E(i8, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (X.E(i8, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (X.E(i8, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (X.E(i8, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (X.E(i8, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (X.E(i8, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (X.E(i8, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (X.E(i8, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (X.E(i8, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (X.E(i8, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (X.E(i8, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return X.E(i8, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
