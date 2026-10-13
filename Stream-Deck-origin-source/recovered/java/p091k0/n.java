package p091k0;

import C6.G;
import H0.c;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.u;
import p109m0.InterfaceC2666d;
import p109m0.t;
import p109m0.z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f28427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f28428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.a f28429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28430d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f28432b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-824725566, i8, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            i iVar = n.this.f28428b;
            int i9 = this.f28432b;
            n nVar = n.this;
            InterfaceC2666d.a aVar = iVar.j().get(i9);
            ((h) aVar.c()).a().i(nVar.f(), Integer.valueOf(i9 - aVar.b()), interfaceC3163l, 0);
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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f28435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28436d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, Object obj, int i9) {
            super(2);
            this.f28434b = i8;
            this.f28435c = obj;
            this.f28436d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            n.this.i(this.f28434b, this.f28435c, interfaceC3163l, F0.a(this.f28436d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public n(y yVar, i iVar, androidx.compose.foundation.lazy.a aVar, t tVar) {
        this.f28427a = yVar;
        this.f28428b = iVar;
        this.f28429c = aVar;
        this.f28430d = tVar;
    }

    @Override // p109m0.q
    public Object a(int i8) {
        Object objA = b().a(i8);
        return objA == null ? this.f28428b.l(i8) : objA;
    }

    @Override // p091k0.m
    public t b() {
        return this.f28430d;
    }

    @Override // p109m0.q
    public int c(Object obj) {
        return b().c(obj);
    }

    @Override // p109m0.q
    public int d() {
        return this.f28428b.k();
    }

    @Override // p109m0.q
    public Object e(int i8) {
        return this.f28428b.i(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return kotlin.jvm.internal.t.c(this.f28428b, ((n) obj).f28428b);
        }
        return false;
    }

    @Override // p091k0.m
    public androidx.compose.foundation.lazy.a f() {
        return this.f28429c;
    }

    @Override // p091k0.m
    public List g() {
        return this.f28428b.m();
    }

    public int hashCode() {
        return this.f28428b.hashCode();
    }

    @Override // p109m0.q
    public void i(int i8, Object obj, InterfaceC3163l interfaceC3163l, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-462424778);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-462424778, i9, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        z.a(obj, i8, this.f28427a.w(), c.b(interfaceC3163lP, -824725566, true, new a(i8)), interfaceC3163lP, ((i9 << 3) & 112) | 3592);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8, obj, i9));
        }
    }
}
