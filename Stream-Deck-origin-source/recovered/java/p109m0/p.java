package p109m0;

import C6.G;
import H0.c;
import I0.d;
import Q6.o;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f29442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f29444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, int i8, Object obj) {
            super(2);
            this.f29442a = qVar;
            this.f29443b = i8;
            this.f29444c = obj;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(980966366, i8, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
            }
            this.f29442a.i(this.f29443b, this.f29444c, interfaceC3163l, 64);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f29445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f29446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f29448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29449e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, Object obj, int i8, Object obj2, int i9) {
            super(2);
            this.f29445a = qVar;
            this.f29446b = obj;
            this.f29447c = i8;
            this.f29448d = obj2;
            this.f29449e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            p.a(this.f29445a, this.f29446b, this.f29447c, this.f29448d, interfaceC3163l, F0.a(this.f29449e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(q qVar, Object obj, int i8, Object obj2, InterfaceC3163l interfaceC3163l, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1439843069);
        if ((i9 & 14) == 0) {
            i10 = (interfaceC3163lP.R(qVar) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            i10 |= interfaceC3163lP.R(obj) ? 32 : 16;
        }
        if ((i9 & 896) == 0) {
            i10 |= interfaceC3163lP.i(i8) ? 256 : 128;
        }
        if ((i9 & 7168) == 0) {
            i10 |= interfaceC3163lP.R(obj2) ? 2048 : 1024;
        }
        if ((i10 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1439843069, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((d) obj).f(obj2, c.b(interfaceC3163lP, 980966366, true, new a(qVar, i8, obj2)), interfaceC3163lP, 568);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(qVar, obj, i8, obj2, i9));
        }
    }
}
