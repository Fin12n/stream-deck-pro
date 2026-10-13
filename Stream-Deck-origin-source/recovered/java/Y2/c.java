package Y2;

import C6.G;
import Q6.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p028d0.InterfaceC2204f;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12102a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q f12103b = H0.c.c(-1639863516, false, a.f12105a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q f12104c = H0.c.c(1525850468, false, b.f12106a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12105a = new a();

        public a() {
            super(4);
        }

        public final void b(InterfaceC2204f interfaceC2204f, T2.a it, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(interfaceC2204f, "$this$null");
            t.g(it, "it");
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1639863516, i8, -1, "cafe.adriel.voyager.transitions.ComposableSingletons$SlideTransitionKt.lambda-1.<anonymous> (SlideTransition.kt:29)");
            }
            it.m(interfaceC3163l, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((InterfaceC2204f) obj, (T2.a) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12106a = new b();

        public b() {
            super(4);
        }

        public final void b(InterfaceC2204f interfaceC2204f, T2.a it, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(interfaceC2204f, "$this$null");
            t.g(it, "it");
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1525850468, i8, -1, "cafe.adriel.voyager.transitions.ComposableSingletons$SlideTransitionKt.lambda-2.<anonymous> (SlideTransition.kt:54)");
            }
            it.m(interfaceC3163l, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((InterfaceC2204f) obj, (T2.a) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    public final q a() {
        return f12103b;
    }

    public final q b() {
        return f12104c;
    }
}
