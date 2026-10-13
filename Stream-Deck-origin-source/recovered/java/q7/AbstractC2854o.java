package q7;

/* JADX INFO: renamed from: q7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2854o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f32128a;

    static {
        boolean z8;
        try {
            Class.forName("java.lang.ClassValue");
            z8 = true;
        } catch (Throwable unused) {
            z8 = false;
        }
        f32128a = z8;
    }

    public static final J0 a(Q6.k factory) {
        kotlin.jvm.internal.t.g(factory, "factory");
        return f32128a ? new C2861s(factory) : new C2871x(factory);
    }

    public static final InterfaceC2866u0 b(Q6.o factory) {
        kotlin.jvm.internal.t.g(factory, "factory");
        return f32128a ? new C2863t(factory) : new C2873y(factory);
    }
}
