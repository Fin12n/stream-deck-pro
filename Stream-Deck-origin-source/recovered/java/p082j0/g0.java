package p082j0;

import C6.G;
import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p047f1.l;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f27995a = p047f1.e.a(a.f27996a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27996a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return f0.a(0, 0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f27997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(1);
            this.f27997a = kVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("onConsumedWindowInsetsChanged");
            c2403m0.a().b("block", this.f27997a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f27998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(3);
            this.f27998a = kVar;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-1608161351);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1608161351, i8, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            k kVar = this.f27998a;
            interfaceC3163l.f(1157296644);
            boolean zR = interfaceC3163l.R(kVar);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2610n(kVar);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            C2610n c2610n = (C2610n) objG;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return c2610n;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f27999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d0 d0Var) {
            super(1);
            this.f27999a = d0Var;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("windowInsetsPadding");
            c2403m0.a().b("insets", this.f27999a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f28000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d0 d0Var) {
            super(3);
            this.f28000a = d0Var;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-1415685722);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1415685722, i8, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            d0 d0Var = this.f28000a;
            interfaceC3163l.f(1157296644);
            boolean zR = interfaceC3163l.R(d0Var);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2617v(d0Var);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            C2617v c2617v = (C2617v) objG;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return c2617v;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final l a() {
        return f27995a;
    }

    public static final i b(i iVar, k kVar) {
        return h.a(iVar, AbstractC2401l0.c() ? new b(kVar) : AbstractC2401l0.a(), new c(kVar));
    }

    public static final i c(i iVar, d0 d0Var) {
        return h.a(iVar, AbstractC2401l0.c() ? new d(d0Var) : AbstractC2401l0.a(), new e(d0Var));
    }
}
