package p166t;

import H.v1;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33649a;

        static {
            int[] iArr = new int[v1.b.values().length];
            f33649a = iArr;
            try {
                iArr[v1.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33649a[v1.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33649a[v1.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33649a[v1.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33649a[v1.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(v1.b bVar, int i8) {
        int i9 = a.f33649a[bVar.ordinal()];
        if (i9 != 1) {
            return (i9 == 2 && e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i8 == 2 ? 5 : 2;
    }

    public static int b(v1.b bVar, int i8) {
        int i9 = a.f33649a[bVar.ordinal()];
        if (i9 != 1) {
            return (i9 == 2 && e.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i8 == 2 ? 5 : 1;
    }
}
