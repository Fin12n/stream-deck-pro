package H;

/* JADX INFO: renamed from: H.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1015y0 extends a1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3285l;

    static {
        Class cls = Integer.TYPE;
        f3283j = InterfaceC0984i0.a.a("camerax.core.imageInput.inputFormat", cls);
        f3284k = InterfaceC0984i0.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f3285l = InterfaceC0984i0.a.a("camerax.core.imageInput.inputDynamicRange", A.J.class);
    }

    default int Q() {
        return ((Integer) f(f3284k, 0)).intValue();
    }

    default A.J n() {
        return (A.J) T1.f.g((A.J) f(f3285l, A.J.f87c));
    }

    default int u() {
        return ((Integer) h(f3283j)).intValue();
    }

    default boolean y() {
        return e(f3285l);
    }
}
