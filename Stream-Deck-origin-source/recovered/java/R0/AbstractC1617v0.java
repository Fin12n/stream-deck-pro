package R0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: renamed from: R0.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1617v0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9432a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short f9433b = b(5120);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final short f9434c = b(-1025);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f9435d = b(31743);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final short f9436e = b(1024);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final short f9437f = b(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final short f9438g = b(32256);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final short f9439h = b(-1024);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final short f9440i = b(Short.MIN_VALUE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final short f9441j = b(31744);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final short f9442k = b(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final short f9443l = a(1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final short f9444m = a(-1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f9445n;

    /* JADX INFO: renamed from: R0.v0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final short b(float f8) {
            int i8;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f8);
            int i9 = iFloatToRawIntBits >>> 31;
            int i10 = (iFloatToRawIntBits >>> 23) & 255;
            int i11 = 8388607 & iFloatToRawIntBits;
            int i12 = 31;
            int i13 = 0;
            if (i10 != 255) {
                int i14 = i10 - 112;
                if (i14 >= 31) {
                    i12 = 49;
                } else {
                    if (i14 > 0) {
                        i13 = i11 >> 13;
                        if ((iFloatToRawIntBits & 4096) != 0) {
                            i8 = (((i14 << 10) | i13) + 1) | (i9 << 15);
                        } else {
                            i12 = i14;
                        }
                        return (short) i8;
                    }
                    if (i14 >= -10) {
                        int i15 = (8388608 | i11) >> (1 - i14);
                        if ((i15 & 4096) != 0) {
                            i15 += 8192;
                        }
                        i12 = 0;
                        i13 = i15 >> 13;
                    } else {
                        i12 = 0;
                    }
                }
            } else if (i11 != 0) {
                i13 = 512;
            }
            i8 = (i9 << 15) | (i12 << 10) | i13;
            return (short) i8;
        }

        public a() {
        }
    }

    static {
        C2635m c2635m = C2635m.f28814a;
        f9445n = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f8) {
        return b(f9432a.b(f8));
    }

    public static final float c(short s8) {
        int i8;
        int i9;
        int i10;
        int i11 = Short.MIN_VALUE & s8;
        int i12 = ((65535 & s8) >>> 10) & 31;
        int i13 = s8 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i8 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i8 = i12 + 112;
            }
            int i15 = i8;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                C2635m c2635m = C2635m.f28814a;
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - f9445n;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        int i16 = (i10 << 23) | (i11 << 16) | i9;
        C2635m c2635m2 = C2635m.f28814a;
        return Float.intBitsToFloat(i16);
    }

    public static short b(short s8) {
        return s8;
    }
}
