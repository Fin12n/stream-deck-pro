package p053f7;

import C6.G;
import C6.r;
import D6.z;
import G6.g;
import G6.h;
import H6.c;
import I6.l;
import Q6.o;
import java.util.ArrayList;
import kotlin.jvm.internal.t;
import p017b7.J;
import p017b7.K;
import p017b7.L;
import p017b7.N;
import p035d7.d;
import p035d7.v;
import p035d7.x;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f22275c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f22278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f22279d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2261g interfaceC2261g, e eVar, G6.d dVar) {
            super(2, dVar);
            this.f22278c = interfaceC2261g;
            this.f22279d = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f22278c, this.f22279d, dVar);
            aVar.f22277b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22276a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f22277b;
                InterfaceC2261g interfaceC2261g = this.f22278c;
                x xVarM = this.f22279d.m(j8);
                this.f22276a = 1;
                if (AbstractC2262h.t(interfaceC2261g, xVarM, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22281b;

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f22281b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((b) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22280a;
            if (i8 == 0) {
                r.b(obj);
                v vVar = (v) this.f22281b;
                e eVar = e.this;
                this.f22280a = 1;
                if (eVar.h(vVar, this) == objF) {
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

    public e(g gVar, int i8, d dVar) {
        this.f22273a = gVar;
        this.f22274b = i8;
        this.f22275c = dVar;
    }

    public static /* synthetic */ Object g(e eVar, InterfaceC2261g interfaceC2261g, G6.d dVar) {
        Object objF = K.f(new a(interfaceC2261g, eVar, null), dVar);
        return objF == c.f() ? objF : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p053f7.q
    public InterfaceC2260f a(g gVar, int i8, d dVar) {
        g gVarP1 = gVar.P1(this.f22273a);
        if (dVar == d.SUSPEND) {
            int i9 = this.f22274b;
            if (i9 != -3) {
                if (i8 == -3) {
                    i8 = i9;
                } else if (i9 != -2) {
                    if (i8 == -2) {
                        i8 = i9;
                    } else {
                        i8 += i9;
                        if (i8 < 0) {
                            i8 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            dVar = this.f22275c;
        }
        return (t.c(gVarP1, this.f22273a) && i8 == this.f22274b && dVar == this.f22275c) ? this : i(gVarP1, i8, dVar);
    }

    @Override // p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        return g(this, interfaceC2261g, dVar);
    }

    public String f() {
        return null;
    }

    public abstract Object h(v vVar, G6.d dVar);

    public abstract e i(g gVar, int i8, d dVar);

    public InterfaceC2260f j() {
        return null;
    }

    public final o k() {
        return new b(null);
    }

    public final int l() {
        int i8 = this.f22274b;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public x m(J j8) {
        return p035d7.t.e(j8, this.f22273a, l(), this.f22275c, L.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        if (this.f22273a != h.f2820a) {
            arrayList.add("context=" + this.f22273a);
        }
        if (this.f22274b != -3) {
            arrayList.add("capacity=" + this.f22274b);
        }
        if (this.f22275c != d.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f22275c);
        }
        return N.a(this) + '[' + z.r0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
