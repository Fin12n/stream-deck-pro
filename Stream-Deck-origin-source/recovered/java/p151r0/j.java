package p151r0;

import kotlin.jvm.internal.AbstractC2633k;
import p038e1.InterfaceC2247s;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32246c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32247d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f32248e = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2247s f32249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f32250b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return j.f32248e;
        }

        public a() {
        }
    }

    public j(InterfaceC2247s interfaceC2247s, E e8) {
        this.f32249a = interfaceC2247s;
        this.f32250b = e8;
    }

    public static /* synthetic */ j c(j jVar, InterfaceC2247s interfaceC2247s, E e8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i8 & 1) != 0) {
            interfaceC2247s = jVar.f32249a;
        }
        if ((i8 & 2) != 0) {
            e8 = jVar.f32250b;
        }
        return jVar.b(interfaceC2247s, e8);
    }

    public final j b(InterfaceC2247s interfaceC2247s, E e8) {
        return new j(interfaceC2247s, e8);
    }

    public final InterfaceC2247s d() {
        return this.f32249a;
    }

    public final E e() {
        return this.f32250b;
    }
}
