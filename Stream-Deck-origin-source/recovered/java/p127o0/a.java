package p127o0;

import L0.i;
import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p046f0.E;
import p046f0.G;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p073i0.l;
import p073i0.m;
import p110m1.h;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0657a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f30644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f30645d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0657a(boolean z8, boolean z9, h hVar, Function0 function0) {
            super(3);
            this.f30642a = z8;
            this.f30643b = z9;
            this.f30644c = hVar;
            this.f30645d = function0;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-2124609672);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2124609672, i8, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:68)");
            }
            i.a aVar = i.f4836a;
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l.a();
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarA = a.a(aVar, this.f30642a, (m) objG, (E) interfaceC3163l.e(G.a()), this.f30643b, this.f30644c, this.f30645d);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarA;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z8) {
            super(1);
            this.f30646a = z8;
        }

        public final void b(x xVar) {
            p110m1.u.T(xVar, this.f30646a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f30648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f30649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f30651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f30652f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, m mVar, E e8, boolean z9, h hVar, Function0 function0) {
            super(1);
            this.f30647a = z8;
            this.f30648b = mVar;
            this.f30649c = e8;
            this.f30650d = z9;
            this.f30651e = hVar;
            this.f30652f = function0;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("selectable");
            c2403m0.a().b("selected", Boolean.valueOf(this.f30647a));
            c2403m0.a().b("interactionSource", this.f30648b);
            c2403m0.a().b("indication", this.f30649c);
            c2403m0.a().b("enabled", Boolean.valueOf(this.f30650d));
            c2403m0.a().b("role", this.f30651e);
            c2403m0.a().b("onClick", this.f30652f);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f30655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f30656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z8, boolean z9, h hVar, Function0 function0) {
            super(1);
            this.f30653a = z8;
            this.f30654b = z9;
            this.f30655c = hVar;
            this.f30656d = function0;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("selectable");
            c2403m0.a().b("selected", Boolean.valueOf(this.f30653a));
            c2403m0.a().b("enabled", Boolean.valueOf(this.f30654b));
            c2403m0.a().b("role", this.f30655c);
            c2403m0.a().b("onClick", this.f30656d);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return C6.G.f1419a;
        }
    }

    public static final i a(i iVar, boolean z8, m mVar, E e8, boolean z9, h hVar, Function0 function0) {
        return AbstractC2401l0.b(iVar, AbstractC2401l0.c() ? new c(z8, mVar, e8, z9, hVar, function0) : AbstractC2401l0.a(), n.d(androidx.compose.foundation.d.c(i.f4836a, mVar, e8, z9, null, hVar, function0, 8, null), false, new b(z8), 1, null));
    }

    public static /* synthetic */ i b(i iVar, boolean z8, m mVar, E e8, boolean z9, h hVar, Function0 function0, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z9 = true;
        }
        boolean z10 = z9;
        if ((i8 & 16) != 0) {
            hVar = null;
        }
        return a(iVar, z8, mVar, e8, z10, hVar, function0);
    }

    public static final i c(i iVar, boolean z8, boolean z9, h hVar, Function0 function0) {
        return L0.h.a(iVar, AbstractC2401l0.c() ? new d(z8, z9, hVar, function0) : AbstractC2401l0.a(), new C0657a(z8, z9, hVar, function0));
    }
}
