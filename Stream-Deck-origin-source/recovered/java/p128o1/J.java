package p128o1;

import A1.t;
import C6.m;
import p216z1.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30766a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30766a = iArr;
        }
    }

    public static final z b(y yVar, x xVar) {
        if (yVar == null && xVar == null) {
            return null;
        }
        return AbstractC2738c.a(yVar, xVar);
    }

    public static final I c(I i8, I i9, float f8) {
        return new I(C.c(i8.M(), i9.M(), f8), u.b(i8.L(), i9.L(), f8));
    }

    public static final I d(I i8, t tVar) {
        return new I(C.h(i8.y()), u.e(i8.v(), tVar), i8.w());
    }

    public static final int e(t tVar, int i8) {
        l.a aVar = l.f39024b;
        if (l.j(i8, aVar.a())) {
            int i9 = a.f30766a[tVar.ordinal()];
            if (i9 == 1) {
                return aVar.b();
            }
            if (i9 == 2) {
                return aVar.c();
            }
            throw new m();
        }
        if (!l.j(i8, aVar.f())) {
            return i8;
        }
        int i10 = a.f30766a[tVar.ordinal()];
        if (i10 == 1) {
            return aVar.d();
        }
        if (i10 == 2) {
            return aVar.e();
        }
        throw new m();
    }
}
