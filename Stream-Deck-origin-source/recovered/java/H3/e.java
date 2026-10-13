package H3;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import V3.f;
import V3.i;
import V3.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f3538a;

        /* JADX INFO: renamed from: H3.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0131a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f3539a;

            public C0131a(Function0 function0) {
                this.f3539a = function0;
            }

            @Override // p215z0.H
            public void d() {
                j jVar = (j) this.f3539a.invoke();
                if (jVar != null) {
                    f.b(jVar);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(1);
            this.f3538a = function0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            return new C0131a(this.f3538a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f3540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, int i8) {
            super(2);
            this.f3540a = function0;
            this.f3541b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.a(this.f3540a, interfaceC3163l, F0.a(this.f3541b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f3543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f3544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3164l0 interfaceC3164l0, i iVar, G6.d dVar) {
            super(2, dVar);
            this.f3543b = interfaceC3164l0;
            this.f3544c = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new c(this.f3543b, this.f3544c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f3542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f3543b.setValue(I6.b.a(true));
            f.a(this.f3544c);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, int i8) {
            super(2);
            this.f3545a = iVar;
            this.f3546b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.b(this.f3545a, interfaceC3163l, F0.a(this.f3546b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: H3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0132e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0132e f3547a = new C0132e();

        public C0132e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke() {
            return l1.e(Boolean.FALSE, null, 2, null);
        }
    }

    public static final void a(Function0 trackableServiceEventProvider, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        t.g(trackableServiceEventProvider, "trackableServiceEventProvider");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1776840917);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.l(trackableServiceEventProvider) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1776840917, i9, -1, "com.elgato.streamdeck.tracking.TrackOnDisappear (TrackingUtil.kt:40)");
            }
            G g8 = G.f1419a;
            interfaceC3163lP.f(-451723125);
            boolean z8 = (i9 & 14) == 4;
            Object objG = interfaceC3163lP.g();
            if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(trackableServiceEventProvider);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            K.a(g8, (k) objG, interfaceC3163lP, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(trackableServiceEventProvider, i8));
        }
    }

    public static final void b(i event, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(event, "event");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-940567325);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-940567325, i8, -1, "com.elgato.streamdeck.tracking.TrackOnce (TrackingUtil.kt:26)");
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], null, null, C0132e.f3547a, interfaceC3163lP, 3080, 6);
        if (!((Boolean) interfaceC3164l0.getValue()).booleanValue()) {
            K.d(G.f1419a, new c(interfaceC3164l0, event, null), interfaceC3163lP, 70);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(event, i8));
        }
    }
}
