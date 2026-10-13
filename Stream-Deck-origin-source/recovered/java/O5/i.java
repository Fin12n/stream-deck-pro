package O5;

import C6.r;
import X5.C1693w;
import X5.InterfaceC1684m;
import X5.T;
import X5.x;
import java.util.Map;
import kotlin.jvm.internal.t;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends U5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f8797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1693w f8798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p141p6.c f8799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p141p6.c f8800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC1684m f8801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final G6.g f8802f;

        public a(O5.b bVar, G6.g gVar) {
            this.f8797a = bVar.g();
            this.f8798b = bVar.j();
            this.f8799c = bVar.e();
            this.f8800d = bVar.f();
            this.f8801e = bVar.d();
            this.f8802f = gVar;
        }

        @Override // X5.InterfaceC1689s
        public InterfaceC1684m a() {
            return this.f8801e;
        }

        @Override // U5.c
        public io.ktor.utils.io.g b() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // U5.c
        public p141p6.c d() {
            return this.f8799c;
        }

        @Override // U5.c
        public p141p6.c f() {
            return this.f8800d;
        }

        @Override // U5.c
        public x g() {
            return this.f8797a;
        }

        @Override // U5.c
        public H5.b g1() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // p017b7.J
        public G6.g getCoroutineContext() {
            return this.f8802f;
        }

        @Override // U5.c
        public C1693w h() {
            return this.f8798b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f8805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8806d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8805c = obj;
            this.f8806d |= Integer.MIN_VALUE;
            return i.c(null, null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f8812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8813g;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8812f = obj;
            this.f8813g |= Integer.MIN_VALUE;
            return i.b(null, null, null, false, this);
        }
    }

    public static final U5.c a(O5.b bVar, G5.a client, T5.c request, G6.g responseContext) {
        t.g(bVar, "<this>");
        t.g(client, "client");
        t.g(request, "request");
        t.g(responseContext, "responseContext");
        return new H5.e(client, request, new a(bVar, responseContext), bVar.b()).g();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object b(O5.a aVar, U5.c cVar, Map map, boolean z8, G6.d dVar) {
        c cVar2;
        U5.c cVar3;
        boolean z9;
        T t8;
        O5.a aVar2;
        Map map2;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i8 = cVar2.f8813g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.f8813g = i8 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        c cVar4 = cVar2;
        Object obj = cVar4.f8812f;
        Object objF = H6.c.f();
        int i9 = cVar4.f8813g;
        if (i9 == 0) {
            r.b(obj);
            T tO = cVar.g1().f().o();
            io.ktor.utils.io.g gVarB = cVar.b();
            cVar4.f8807a = aVar;
            cVar3 = cVar;
            cVar4.f8808b = cVar3;
            cVar4.f8809c = map;
            cVar4.f8810d = tO;
            z9 = z8;
            cVar4.f8811e = z9;
            cVar4.f8813g = 1;
            Object objA = io.ktor.utils.io.g.b.a(gVarB, 0L, cVar4, 1, null);
            if (objA != objF) {
                t8 = tO;
                obj = objA;
                aVar2 = aVar;
                map2 = map;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O5.b bVar = (O5.b) cVar4.f8807a;
            r.b(obj);
            return bVar;
        }
        boolean z10 = cVar4.f8811e;
        t8 = (T) cVar4.f8810d;
        Map map3 = (Map) cVar4.f8809c;
        U5.c cVar5 = (U5.c) cVar4.f8808b;
        aVar2 = (O5.a) cVar4.f8807a;
        r.b(obj);
        z9 = z10;
        map2 = map3;
        cVar3 = cVar5;
        byte[] bArrC = y.c((p205x6.k) obj, 0, 1, null);
        U5.e.c(cVar3);
        O5.b bVar2 = new O5.b(cVar3.g1().f().o(), cVar3.g(), cVar3.d(), cVar3.f(), cVar3.h(), N5.d.c(cVar3, z9, null, 2, null), cVar3.a(), map2, bArrC);
        cVar4.f8807a = bVar2;
        cVar4.f8808b = null;
        cVar4.f8809c = null;
        cVar4.f8810d = null;
        cVar4.f8813g = 2;
        return aVar2.c(t8, bVar2, cVar4) == objF ? objF : bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(h hVar, T t8, U5.c cVar, boolean z8, G6.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f8806d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f8806d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f8805c;
        Object objF = H6.c.f();
        int i9 = bVar.f8806d;
        if (i9 == 0) {
            r.b(objA);
            bVar.f8803a = hVar;
            bVar.f8804b = t8;
            bVar.f8806d = 1;
            objA = N5.d.a(z8, cVar, bVar);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8 = (T) bVar.f8804b;
            hVar = (h) bVar.f8803a;
            r.b(objA);
        }
        N5.c cVar2 = (N5.c) objA;
        hVar.d(t8, cVar2);
        return cVar2;
    }
}
