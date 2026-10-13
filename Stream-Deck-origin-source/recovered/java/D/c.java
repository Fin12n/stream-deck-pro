package D;

import A.C0864c0;
import A.C0903w0;
import A.T0;
import C6.m;
import H.C1013x0;
import H.u1;
import H.v1;
import L.f;
import U.g;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, 256),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1680b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ J6.a f1678j = J6.b.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1671c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: D.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0066a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f1682b;

            static {
                int[] iArr = new int[v1.b.values().length];
                try {
                    iArr[v1.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v1.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v1.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v1.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f1681a = iArr;
                int[] iArr2 = new int[E.b.values().length];
                try {
                    iArr2[E.b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[E.b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[E.b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[E.b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f1682b = iArr2;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final E.b a(T0 t8) {
            Object next;
            t.g(t8, "<this>");
            Iterator<E> it = E.b.b().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (c.f1671c.d((E.b) next, t8)) {
                    return (E.b) next;
                }
            }
            next = null;
            return (E.b) next;
        }

        public final c b(T0 t8) {
            t.g(t8, "<this>");
            if (t8 instanceof C0903w0) {
                return c.PREVIEW;
            }
            if (t8 instanceof C0864c0) {
                return c.IMAGE_CAPTURE;
            }
            if (f.d0(t8)) {
                return c.VIDEO_CAPTURE;
            }
            return t8 instanceof g ? c.STREAM_SHARING : c.UNDEFINED;
        }

        public final c c(u1 u1Var) {
            t.g(u1Var, "<this>");
            int i8 = C0066a.f1681a[u1Var.O().ordinal()];
            if (i8 == 1) {
                return c.IMAGE_CAPTURE;
            }
            if (i8 == 2) {
                return c.PREVIEW;
            }
            if (i8 != 3) {
                return i8 != 4 ? c.UNDEFINED : c.STREAM_SHARING;
            }
            return c.VIDEO_CAPTURE;
        }

        public final boolean d(E.b bVar, T0 t8) {
            int i8 = C0066a.f1682b[bVar.ordinal()];
            if (i8 == 1) {
                return e(t8);
            }
            if (i8 == 2) {
                return f(t8);
            }
            if (i8 == 3) {
                return h(t8);
            }
            if (i8 == 4) {
                return g(t8);
            }
            throw new m();
        }

        public final boolean e(T0 t8) {
            return t8.e().y();
        }

        public final boolean f(T0 t8) {
            return t8.e().c0();
        }

        public final boolean g(T0 t8) {
            return t8.e().e(C1013x0.f3273U);
        }

        public final boolean h(T0 t8) {
            return t8.e().e(u1.f3223H) || t8.e().e(u1.f3224I);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1683a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1683a = iArr;
        }
    }

    c(Class cls, int i8) {
        this.f1679a = cls;
        this.f1680b = i8;
    }

    public final Class b() {
        return this.f1679a;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i8 = b.f1683a[ordinal()];
        if (i8 == 1) {
            return "Preview";
        }
        if (i8 == 2) {
            return "ImageCapture";
        }
        if (i8 == 3) {
            return "VideoCapture";
        }
        if (i8 == 4) {
            return "StreamSharing";
        }
        if (i8 == 5) {
            return "Undefined";
        }
        throw new m();
    }
}
