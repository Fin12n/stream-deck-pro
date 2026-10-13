package W2;

import C6.G;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: W2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0294a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f10828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0294a(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f10827a = z8;
            this.f10828b = function0;
            this.f10829c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f10827a, this.f10828b, interfaceC3163l, F0.a(this.f10829c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(boolean z8, Function0 onBack, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        t.g(onBack, "onBack");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1513004771);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.c(z8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(onBack) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1513004771, i9, -1, "cafe.adriel.voyager.navigator.internal.BackHandler (Actuals.kt:8)");
            }
            p018c.d.a(z8, onBack, interfaceC3163lP, i9 & 126, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0294a(z8, onBack, i8));
        }
    }
}
