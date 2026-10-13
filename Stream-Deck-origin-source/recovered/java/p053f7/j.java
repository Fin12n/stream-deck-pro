package p053f7;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import G6.h;
import H6.c;
import I6.l;
import Q6.o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.J;
import p035d7.t;
import p035d7.v;
import p035d7.x;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable f22306d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f22308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f22309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2260f interfaceC2260f, x xVar, d dVar) {
            super(2, dVar);
            this.f22308b = interfaceC2260f;
            this.f22309c = xVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f22308b, this.f22309c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22307a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260f = this.f22308b;
                x xVar = this.f22309c;
                this.f22307a = 1;
                if (interfaceC2260f.collect(xVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public /* synthetic */ j(Iterable iterable, g gVar, int i8, p035d7.d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(iterable, (i9 & 2) != 0 ? h.f2820a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? p035d7.d.SUSPEND : dVar);
    }

    @Override // p053f7.e
    public Object h(v vVar, d dVar) {
        x xVar = new x(vVar);
        Iterator it = this.f22306d.iterator();
        while (it.hasNext()) {
            AbstractC1789i.d(vVar, null, null, new a((InterfaceC2260f) it.next(), xVar, null), 3, null);
        }
        return G.f1419a;
    }

    @Override // p053f7.e
    public e i(g gVar, int i8, p035d7.d dVar) {
        return new j(this.f22306d, gVar, i8, dVar);
    }

    @Override // p053f7.e
    public x m(J j8) {
        return t.b(j8, this.f22273a, this.f22274b, k());
    }

    public j(Iterable<? extends InterfaceC2260f> iterable, g gVar, int i8, p035d7.d dVar) {
        super(gVar, i8, dVar);
        this.f22306d = iterable;
    }
}
