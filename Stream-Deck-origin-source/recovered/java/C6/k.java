package C6;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1433a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1433a = iArr;
        }
    }

    public static j a(l mode, Function0 initializer) {
        kotlin.jvm.internal.t.g(mode, "mode");
        kotlin.jvm.internal.t.g(initializer, "initializer");
        int i8 = a.f1433a[mode.ordinal()];
        if (i8 == 1) {
            return new t(initializer, null, 2, null);
        }
        if (i8 == 2) {
            return new s(initializer);
        }
        if (i8 == 3) {
            return new H(initializer);
        }
        throw new m();
    }

    public static j b(Function0 initializer) {
        kotlin.jvm.internal.t.g(initializer, "initializer");
        return new t(initializer, null, 2, null);
    }
}
