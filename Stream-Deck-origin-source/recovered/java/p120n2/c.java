package p120n2;

import D6.M;
import D6.T;
import D6.z;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p111m2.ComponentCallbacksC2681f;
import p111m2.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f30520a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0656c f30521b = C0656c.f30532d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
    }

    /* JADX INFO: renamed from: n2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0656c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f30531c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0656c f30532d = new C0656c(T.d(), null, M.g());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f30533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f30534b;

        /* JADX INFO: renamed from: n2.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        public C0656c(Set<? extends a> flags, b bVar, Map<String, ? extends Set<Class<? extends g>>> allowedViolations) {
            t.g(flags, "flags");
            t.g(allowedViolations, "allowedViolations");
            this.f30533a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends g>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f30534b = linkedHashMap;
        }

        public final Set a() {
            return this.f30533a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f30534b;
        }
    }

    public static final void d(String str, g violation) {
        t.g(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void f(ComponentCallbacksC2681f fragment, String previousFragmentId) {
        t.g(fragment, "fragment");
        t.g(previousFragmentId, "previousFragmentId");
        p120n2.a aVar = new p120n2.a(fragment, previousFragmentId);
        c cVar = f30520a;
        cVar.e(aVar);
        C0656c c0656cB = cVar.b(fragment);
        if (c0656cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.k(c0656cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0656cB, aVar);
        }
    }

    public static final void g(ComponentCallbacksC2681f fragment, ViewGroup viewGroup) {
        t.g(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f30520a;
        cVar.e(dVar);
        C0656c c0656cB = cVar.b(fragment);
        if (c0656cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.k(c0656cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0656cB, dVar);
        }
    }

    public static final void h(ComponentCallbacksC2681f fragment) {
        t.g(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f30520a;
        cVar.e(eVar);
        C0656c c0656cB = cVar.b(fragment);
        if (c0656cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.k(c0656cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0656cB, eVar);
        }
    }

    public static final void i(ComponentCallbacksC2681f fragment, ViewGroup container) {
        t.g(fragment, "fragment");
        t.g(container, "container");
        h hVar = new h(fragment, container);
        c cVar = f30520a;
        cVar.e(hVar);
        C0656c c0656cB = cVar.b(fragment);
        if (c0656cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.k(c0656cB, fragment.getClass(), hVar.getClass())) {
            cVar.c(c0656cB, hVar);
        }
    }

    public final C0656c b(ComponentCallbacksC2681f componentCallbacksC2681f) {
        while (componentCallbacksC2681f != null) {
            if (componentCallbacksC2681f.Z()) {
                y yVarH = componentCallbacksC2681f.H();
                t.f(yVarH, "declaringFragment.parentFragmentManager");
                if (yVarH.x0() != null) {
                    C0656c c0656cX0 = yVarH.x0();
                    t.d(c0656cX0);
                    return c0656cX0;
                }
            }
            componentCallbacksC2681f = componentCallbacksC2681f.G();
        }
        return f30521b;
    }

    public final void c(C0656c c0656c, final g gVar) {
        ComponentCallbacksC2681f componentCallbacksC2681fA = gVar.a();
        final String name = componentCallbacksC2681fA.getClass().getName();
        if (c0656c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        c0656c.b();
        if (c0656c.a().contains(a.PENALTY_DEATH)) {
            j(componentCallbacksC2681fA, new Runnable() { // from class: n2.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, gVar);
                }
            });
        }
    }

    public final void e(g gVar) {
        if (y.E0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public final void j(ComponentCallbacksC2681f componentCallbacksC2681f, Runnable runnable) {
        if (!componentCallbacksC2681f.Z()) {
            runnable.run();
            return;
        }
        Handler handlerR = componentCallbacksC2681f.H().r0().r();
        t.f(handlerR, "fragment.parentFragmentManager.host.handler");
        if (t.c(handlerR.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerR.post(runnable);
        }
    }

    public final boolean k(C0656c c0656c, Class cls, Class cls2) {
        Set set = (Set) c0656c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (t.c(cls2.getSuperclass(), g.class) || !z.b0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
