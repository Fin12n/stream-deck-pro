package S2;

import C6.G;
import Q6.o;
import Q6.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: S2.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0270a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f9718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f9719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f9720c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f9721d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0270a(j jVar, q qVar, o oVar, int i8) {
                super(2);
                this.f9718a = jVar;
                this.f9719b = qVar;
                this.f9720c = oVar;
                this.f9721d = i8;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                this.f9718a.c(this.f9719b, this.f9720c, interfaceC3163l, F0.a(this.f9721d | 1));
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        public static void a(j jVar, q provideSaveableState, o content, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(provideSaveableState, "provideSaveableState");
            t.g(content, "content");
            InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(463960570);
            if ((i8 & 112) == 0) {
                i9 = (interfaceC3163lP.l(content) ? 32 : 16) | i8;
            } else {
                i9 = i8;
            }
            if ((i9 & 81) == 16 && interfaceC3163lP.s()) {
                interfaceC3163lP.z();
            } else {
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(463960570, i9, -1, "cafe.adriel.voyager.core.lifecycle.ScreenLifecycleContentProvider.ProvideBeforeScreenContent (ScreenLifecycleOwner.kt:18)");
                }
                content.invoke(interfaceC3163lP, Integer.valueOf((i9 >> 3) & 14));
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
            P0 p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0270a(jVar, provideSaveableState, content, i8));
            }
        }
    }

    void c(q qVar, o oVar, InterfaceC3163l interfaceC3163l, int i8);
}
