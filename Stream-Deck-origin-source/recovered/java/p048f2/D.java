package p048f2;

import C6.G;
import C6.r;
import I6.d;
import I6.l;
import Q6.k;
import Q6.o;
import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.internal.t;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098k7.a f21553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2300c f21554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2260f f21555d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21558c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21560e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21558c = obj;
            this.f21560e |= Integer.MIN_VALUE;
            return D.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f21562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21563c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21565e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21563c = obj;
            this.f21565e |= Integer.MIN_VALUE;
            return D.this.a(null, this);
        }
    }

    public D(String filePath) {
        t.g(filePath, "filePath");
        this.f21552a = filePath;
        this.f21553b = p098k7.c.b(false, 1, null);
        this.f21554c = new C2300c(0);
        this.f21555d = AbstractC2262h.D(new c(null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p048f2.u
    public Object a(o oVar, G6.d dVar) throws Throwable {
        b bVar;
        p098k7.a aVar;
        Throwable th;
        boolean z8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f21565e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f21565e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f21563c;
        Object objF = H6.c.f();
        int i9 = bVar.f21565e;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = bVar.f21562b;
            aVar = (p098k7.a) bVar.f21561a;
            try {
                r.b(obj);
                if (z8) {
                    aVar.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z8) {
                    aVar.e(null);
                }
                throw th;
            }
        }
        r.b(obj);
        p098k7.a aVar2 = this.f21553b;
        boolean zC = aVar2.c(null);
        try {
            Object objA = I6.b.a(zC);
            bVar.f21561a = aVar2;
            bVar.f21562b = zC;
            bVar.f21565e = 1;
            Object objInvoke = oVar.invoke(objA, bVar);
            if (objInvoke == objF) {
                return objF;
            }
            aVar = aVar2;
            obj = objInvoke;
            z8 = zC;
            if (z8) {
                aVar.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            aVar = aVar2;
            th = th3;
            z8 = zC;
            if (z8) {
                aVar.e(null);
            }
            throw th;
        }
    }

    @Override // p048f2.u
    public InterfaceC2260f b() {
        return this.f21555d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p048f2.u
    public Object c(k kVar, G6.d dVar) throws Throwable {
        a aVar;
        p098k7.a aVar2;
        Throwable th;
        p098k7.a aVar3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21560e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21560e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21558c;
        Object objF = H6.c.f();
        int i9 = aVar.f21560e;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar2 = this.f21553b;
                aVar.f21556a = kVar;
                aVar.f21557b = aVar2;
                aVar.f21560e = 1;
                if (aVar2.b(null, aVar) != objF) {
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) aVar.f21556a;
                try {
                    r.b(obj);
                    aVar3.e(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p098k7.a aVar4 = (p098k7.a) aVar.f21557b;
            k kVar2 = (k) aVar.f21556a;
            r.b(obj);
            aVar2 = aVar4;
            kVar = kVar2;
            aVar.f21556a = aVar2;
            aVar.f21557b = null;
            aVar.f21560e = 2;
            Object objInvoke = kVar.invoke(aVar);
            if (objInvoke != objF) {
                p098k7.a aVar5 = aVar2;
                obj = objInvoke;
                aVar3 = aVar5;
                aVar3.e(null);
                return obj;
            }
            return objF;
        } catch (Throwable th3) {
            p098k7.a aVar6 = aVar2;
            th = th3;
            aVar3 = aVar6;
            aVar3.e(null);
            throw th;
        }
    }

    @Override // p048f2.u
    public Object d(G6.d dVar) {
        return I6.b.d(this.f21554c.d());
    }

    @Override // p048f2.u
    public Object e(G6.d dVar) {
        return I6.b.d(this.f21554c.b());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21566a;

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new c(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((c) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f21566a == 0) {
                r.b(obj);
                return G.f1419a;
            }
            throw new IllegalStateException(HRHLwtyqJWz.XaFo);
        }
    }
}
