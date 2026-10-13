package p044e7;

import C6.G;
import C6.r;
import H6.c;
import I6.d;
import Q6.o;
import java.util.Iterator;

/* JADX INFO: renamed from: e7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2263i {

    /* JADX INFO: renamed from: e7.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f20992a;

        /* JADX INFO: renamed from: e7.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0486a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f20993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f20994b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f20996d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f20997e;

            public C0486a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f20993a = obj;
                this.f20994b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(Iterable iterable) {
            this.f20992a = iterable;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            C0486a c0486a;
            InterfaceC2261g interfaceC2261g2;
            Iterator it;
            if (dVar instanceof C0486a) {
                c0486a = (C0486a) dVar;
                int i8 = c0486a.f20994b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0486a.f20994b = i8 - Integer.MIN_VALUE;
                } else {
                    c0486a = new C0486a(dVar);
                }
            } else {
                c0486a = new C0486a(dVar);
            }
            Object obj = c0486a.f20993a;
            Object objF = c.f();
            int i9 = c0486a.f20994b;
            if (i9 == 0) {
                r.b(obj);
                interfaceC2261g2 = interfaceC2261g;
                it = this.f20992a.iterator();
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0486a.f20997e;
                InterfaceC2261g interfaceC2261g3 = (InterfaceC2261g) c0486a.f20996d;
                r.b(obj);
                interfaceC2261g2 = interfaceC2261g3;
            }
            while (it.hasNext()) {
                Object next = it.next();
                c0486a.f20996d = interfaceC2261g2;
                c0486a.f20997e = it;
                c0486a.f20994b = 1;
                if (interfaceC2261g2.emit(next, c0486a) == objF) {
                    return objF;
                }
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.i$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f20998a;

        public b(Object obj) {
            this.f20998a = obj;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objEmit = interfaceC2261g.emit(this.f20998a, dVar);
            return objEmit == c.f() ? objEmit : G.f1419a;
        }
    }

    public static final InterfaceC2260f a(Iterable iterable) {
        return new a(iterable);
    }

    public static final InterfaceC2260f b(o oVar) {
        return new C2256b(oVar, null, 0, null, 14, null);
    }

    public static final InterfaceC2260f c(o oVar) {
        return new C2258d(oVar, null, 0, null, 14, null);
    }

    public static final InterfaceC2260f d(o oVar) {
        return new A(oVar);
    }

    public static final InterfaceC2260f e(Object obj) {
        return new b(obj);
    }
}
