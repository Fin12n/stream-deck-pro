package p005a4;

import C6.m;
import X3.f;
import io.sentry.EnumC2596z2;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13394a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.f11712d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.Fatal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13394a = iArr;
        }
    }

    public static final EnumC2596z2 a(f fVar) {
        t.g(fVar, "<this>");
        int i8 = a.f13394a[fVar.ordinal()];
        if (i8 == 1) {
            return EnumC2596z2.DEBUG;
        }
        if (i8 == 2) {
            return EnumC2596z2.INFO;
        }
        if (i8 == 3) {
            return EnumC2596z2.WARNING;
        }
        if (i8 == 4) {
            return EnumC2596z2.ERROR;
        }
        if (i8 == 5) {
            return EnumC2596z2.FATAL;
        }
        throw new m();
    }
}
