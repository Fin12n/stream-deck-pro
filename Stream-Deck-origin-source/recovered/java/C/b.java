package C;

import A.D0;
import A.J;
import C6.j;
import C6.k;
import C6.m;
import E.c;
import E.d;
import E.e;
import H.I;
import M6.eLZq.eGwOBWCdOTaKus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1240b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f1241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f1242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f1243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f1244f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1245a = k.b(new Function0() { // from class: C.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(b.b(this.f1239a));
        }
    });

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: C.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0051b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1246a;

        static {
            int[] iArr = new int[E.b.values().length];
            try {
                iArr[E.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[E.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1246a = iArr;
        }
    }

    public static final int b(b bVar) {
        return bVar.e(bVar.c());
    }

    public abstract E.b c();

    public boolean d(I cameraInfoInternal, D0 sessionConfig) {
        t.g(cameraInfoInternal, "cameraInfoInternal");
        t.g(sessionConfig, "sessionConfig");
        return true;
    }

    public final int e(E.b bVar) {
        int i8 = C0051b.f1246a[bVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        throw new m();
    }

    static {
        J j8 = J.f90f;
        t.f(j8, eGwOBWCdOTaKus.KOyeXBLIMBBiyQo);
        f1241c = new E.a(j8);
        f1242d = new c(60, 60);
        f1243e = new e(e.b.PREVIEW);
        f1244f = new d(1);
    }
}
