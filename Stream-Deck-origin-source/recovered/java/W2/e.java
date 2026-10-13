package W2;

import C6.G;
import D6.C0938s;
import D6.T;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f10836a = T.g(U2.c.Pop, U2.c.Replace);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10837a;

        /* JADX INFO: renamed from: W2.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0295a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f10838a;

            public C0295a(V2.b bVar) {
                this.f10838a = bVar;
            }

            @Override // p215z0.H
            public void d() {
                if (this.f10838a.m() == null || this.f10838a.g().a()) {
                    Iterator it = this.f10838a.f().values().iterator();
                    while (it.hasNext()) {
                        a.d((V2.b) it.next());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V2.b bVar) {
            super(1);
            this.f10837a = bVar;
        }

        public static final void d(V2.b bVar) {
            e.e(bVar);
            Iterator it = bVar.f().values().iterator();
            while (it.hasNext()) {
                d((V2.b) it.next());
            }
            bVar.f().clear();
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffectIgnoringConfiguration) {
            t.g(DisposableEffectIgnoringConfiguration, "$this$DisposableEffectIgnoringConfiguration");
            return new C0295a(this.f10837a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10839a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f10840a;

            public a(V2.b bVar) {
                this.f10840a = bVar;
            }

            @Override // p215z0.H
            public void d() {
                V2.b bVarM;
                R2.a aVarF;
                V2.c cVarG;
                V2.b bVarM2 = this.f10840a.m();
                if ((bVarM2 != null && (cVarG = bVarM2.g()) != null && !cVarG.a()) || (bVarM = this.f10840a.m()) == null || (aVarF = bVarM.f()) == null) {
                    return;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V2.b bVar) {
            super(1);
            this.f10839a = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffectIgnoringConfiguration) {
            R2.a aVarF;
            t.g(DisposableEffectIgnoringConfiguration, "$this$DisposableEffectIgnoringConfiguration");
            V2.b bVarM = this.f10839a.m();
            if (bVarM != null && (aVarF = bVarM.f()) != null) {
            }
            return new a(this.f10839a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V2.b bVar, int i8) {
            super(2);
            this.f10841a = bVar;
            this.f10842b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.a(this.f10841a, interfaceC3163l, F0.a(this.f10842b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10843a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f10844a;

            public a(V2.b bVar) {
                this.f10844a = bVar;
            }

            @Override // p215z0.H
            public void d() {
                e.e(this.f10844a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V2.b bVar) {
            super(1);
            this.f10843a = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffectIgnoringConfiguration) {
            t.g(DisposableEffectIgnoringConfiguration, "$this$DisposableEffectIgnoringConfiguration");
            return new a(this.f10843a);
        }
    }

    /* JADX INFO: renamed from: W2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0296e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0296e(V2.b bVar, int i8) {
            super(2);
            this.f10845a = bVar;
            this.f10846b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.b(this.f10845a, interfaceC3163l, F0.a(this.f10846b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f10848b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f10849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f10850b;

            public a(V2.b bVar, List list) {
                this.f10849a = bVar;
                this.f10850b = list;
            }

            @Override // p215z0.H
            public void d() {
                List listH = this.f10849a.h();
                ArrayList arrayList = new ArrayList(C0938s.y(listH, 10));
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T2.a) it.next()).getKey());
                }
                if (e.f10836a.contains(this.f10849a.j())) {
                    List list = this.f10850b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (!arrayList.contains(((T2.a) obj).getKey())) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        this.f10849a.d((T2.a) it2.next());
                    }
                    this.f10849a.c();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(V2.b bVar, List list) {
            super(1);
            this.f10847a = bVar;
            this.f10848b = list;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f10847a, this.f10848b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f10851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(V2.b bVar, int i8) {
            super(2);
            this.f10851a = bVar;
            this.f10852b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.c(this.f10851a, interfaceC3163l, F0.a(this.f10852b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(V2.b navigator, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1888863985);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1888863985, i8, -1, "cafe.adriel.voyager.navigator.internal.ChildrenNavigationDisposableEffect (NavigatorDisposable.kt:45)");
        }
        S2.e.a(navigator, new a(navigator), interfaceC3163lP, 8);
        S2.e.a(navigator, new b(navigator), interfaceC3163lP, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(navigator, i8));
        }
    }

    public static final void b(V2.b navigator, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-514805831);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-514805831, i8, -1, "cafe.adriel.voyager.navigator.internal.NavigatorDisposableEffect (NavigatorDisposable.kt:15)");
        }
        S2.e.a(navigator, new d(navigator), interfaceC3163lP, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0296e(navigator, i8));
        }
    }

    public static final void c(V2.b navigator, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(navigator, "navigator");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(628249098);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(628249098, i8, -1, "cafe.adriel.voyager.navigator.internal.StepDisposableEffect (NavigatorDisposable.kt:26)");
        }
        List listH = navigator.h();
        K.a(listH, new f(navigator, listH), interfaceC3163lP, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new g(navigator, i8));
        }
    }

    public static final void e(V2.b navigator) {
        t.g(navigator, "navigator");
        Iterator it = navigator.h().iterator();
        while (it.hasNext()) {
            navigator.d((T2.a) it.next());
        }
        X2.a.f11657a.a(navigator);
        navigator.c();
    }
}
