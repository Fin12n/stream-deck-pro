package H3;

import C6.m;
import X3.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3518a;

        static {
            int[] iArr = new int[V3.b.values().length];
            try {
                iArr[V3.b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[V3.b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[V3.b.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[V3.b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[V3.b.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3518a = iArr;
        }
    }

    public static final f b(V3.b bVar) {
        int i8 = a.f3518a[bVar.ordinal()];
        if (i8 == 1) {
            return f.Debug;
        }
        if (i8 == 2) {
            return f.Info;
        }
        if (i8 == 3) {
            return f.f11712d;
        }
        if (i8 == 4) {
            return f.Error;
        }
        if (i8 == 5) {
            return f.Fatal;
        }
        throw new m();
    }
}
