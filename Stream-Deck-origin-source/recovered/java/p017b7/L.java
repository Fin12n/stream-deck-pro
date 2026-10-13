package p017b7;

import C6.m;
import G6.d;
import G6.f;
import J6.b;
import Q6.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum L {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ J6.a f15909f = b.a(a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15910a;

        static {
            int[] iArr = new int[L.values().length];
            try {
                iArr[L.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[L.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15910a = iArr;
        }
    }

    public final void b(o oVar, Object obj, d dVar) throws Throwable {
        int i8 = a.f15910a[ordinal()];
        if (i8 == 1) {
            p071h7.a.d(oVar, obj, dVar, null, 4, null);
            return;
        }
        if (i8 == 2) {
            f.b(oVar, obj, dVar);
        } else if (i8 == 3) {
            p071h7.b.a(oVar, obj, dVar);
        } else if (i8 != 4) {
            throw new m();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
