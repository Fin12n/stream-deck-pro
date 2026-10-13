package H;

import A.AbstractC0865d;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: H.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1017z0 extends a1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3286m = InterfaceC0984i0.a.a("camerax.core.imageOutput.targetAspectRatio", AbstractC0865d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3295v;

    static void k(InterfaceC1017z0 interfaceC1017z0) {
        boolean zT = interfaceC1017z0.T();
        boolean z8 = interfaceC1017z0.D(null) != null;
        if (zT && z8) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC1017z0.w(null) != null) {
            if (zT || z8) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size D(Size size) {
        return (Size) f(f3290q, size);
    }

    default int E(int i8) {
        return ((Integer) f(f3288o, Integer.valueOf(i8))).intValue();
    }

    default boolean T() {
        return e(f3286m);
    }

    default int V() {
        return ((Integer) h(f3286m)).intValue();
    }

    default int d0(int i8) {
        return ((Integer) f(f3287n, Integer.valueOf(i8))).intValue();
    }

    default int e0(int i8) {
        return ((Integer) f(f3289p, Integer.valueOf(i8))).intValue();
    }

    default Size i(Size size) {
        return (Size) f(f3292s, size);
    }

    default List o(List list) {
        return (List) f(f3293t, list);
    }

    default T.c r() {
        return (T.c) h(f3294u);
    }

    default List s(List list) {
        List list2 = (List) f(f3295v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default T.c w(T.c cVar) {
        return (T.c) f(f3294u, cVar);
    }

    default Size z(Size size) {
        return (Size) f(f3291r, size);
    }

    static {
        Class cls = Integer.TYPE;
        f3287n = InterfaceC0984i0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f3288o = InterfaceC0984i0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f3289p = InterfaceC0984i0.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f3290q = InterfaceC0984i0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f3291r = InterfaceC0984i0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f3292s = InterfaceC0984i0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f3293t = InterfaceC0984i0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f3294u = InterfaceC0984i0.a.a("camerax.core.imageOutput.resolutionSelector", T.c.class);
        f3295v = InterfaceC0984i0.a.a(QhsKALGiniuQ.OKQMFPxorh, List.class);
    }
}
