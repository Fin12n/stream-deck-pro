package p044e7;

import G6.g;
import p035d7.d;
import p053f7.h;
import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f20917a = new G("NO_VALUE");

    public static final w a(int i8, int i9, d dVar) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        if (i8 > 0 || i9 > 0 || dVar == d.SUSPEND) {
            int i10 = i9 + i8;
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            return new C(i8, i10, dVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + dVar).toString());
    }

    public static /* synthetic */ w b(int i8, int i9, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            dVar = d.SUSPEND;
        }
        return a(i8, i9, dVar);
    }

    public static final InterfaceC2260f e(B b8, g gVar, int i8, d dVar) {
        return ((i8 == 0 || i8 == -3) && dVar == d.SUSPEND) ? b8 : new h(b8, gVar, i8, dVar);
    }

    public static final Object f(Object[] objArr, long j8) {
        return objArr[((int) j8) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j8, Object obj) {
        objArr[((int) j8) & (objArr.length - 1)] = obj;
    }
}
