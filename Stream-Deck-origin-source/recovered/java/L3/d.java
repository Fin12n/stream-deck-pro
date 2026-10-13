package L3;

import C6.G;
import C6.r;
import Q6.k;
import X5.C1692v;
import X5.y;
import X6.m;
import Z2.j;
import Z2.p;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f4971a = j.f12858c.d("ElgatoMobileUpdates");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f4974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4975d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f4974c = obj;
            this.f4975d |= Integer.MIN_VALUE;
            return d.c(null, null, null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4976a = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4977a = new a();

            public a() {
                super(1);
            }

            public final void b(P5.b.a install) {
                t.g(install, "$this$install");
                p106l6.c.b(install, null, null, 3, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((P5.b.a) obj);
                return G.f1419a;
            }
        }

        public b() {
            super(1);
        }

        public final void b(G5.b config) {
            t.g(config, "$this$config");
            config.i(P5.b.f8896c, a.f4977a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G5.b) obj);
            return G.f1419a;
        }
    }

    public static final L3.b a(g gVar, int i8, i iVar) {
        if (i8 < gVar.c()) {
            return new L3.b.C0176b(gVar.c());
        }
        if (iVar.compareTo(gVar.b()) < 0) {
            return new L3.b.d(gVar.b());
        }
        return iVar.compareTo(gVar.a()) < 0 ? new L3.b.c(gVar.a()) : L3.b.a.f4967a;
    }

    public static final Object b(G5.a aVar, G6.d dVar) {
        String strA = com.elgato.streamdeck.a.C0419a.f17668a.a();
        i.b bVar = i.Companion;
        return c(aVar, strA, bVar.a(), bVar.b(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dd A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:37:0x00dd, B:39:0x00f9, B:41:0x0117, B:42:0x011e, B:20:0x0048, B:26:0x0078, B:28:0x0084, B:30:0x00b4, B:32:0x00b8, B:23:0x0055), top: B:47:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:37:0x00dd, B:39:0x00f9, B:41:0x0117, B:42:0x011e, B:20:0x0048, B:26:0x0078, B:28:0x0084, B:30:0x00b4, B:32:0x00b8, B:23:0x0055), top: B:47:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0117 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:37:0x00dd, B:39:0x00f9, B:41:0x0117, B:42:0x011e, B:20:0x0048, B:26:0x0078, B:28:0x0084, B:30:0x00b4, B:32:0x00b8, B:23:0x0055), top: B:47:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00f9, please report this as an issue */
    public static final Object c(G5.a aVar, String str, i iVar, int i8, G6.d dVar) {
        a aVar2;
        i iVar2;
        int i9;
        g gVar;
        L3.b bVarA;
        j jVar;
        String strC;
        p pVar;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f4975d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f4975d = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object objC = aVar2.f4974c;
        Object objF = H6.c.f();
        int i11 = aVar2.f4975d;
        try {
            if (i11 == 0) {
                r.b(objC);
                G5.a aVarB = aVar.b(b.f4976a);
                T5.d dVar2 = new T5.d();
                T5.f.d(dVar2, str);
                dVar2.n(C1692v.f11962b.b());
                U5.g gVar2 = new U5.g(dVar2, aVarB);
                aVar2.f4972a = iVar;
                aVar2.f4973b = i8;
                aVar2.f4975d = 1;
                objC = gVar2.c(aVar2);
                if (objC == objF) {
                }
                return objF;
            }
            if (i11 == 1) {
                i8 = aVar2.f4973b;
                iVar = (i) aVar2.f4972a;
                r.b(objC);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i9 = aVar2.f4973b;
                iVar2 = (i) aVar2.f4972a;
                r.b(objC);
            }
            if (objC != null) {
                throw new NullPointerException("null cannot be cast to non-null type com.elgato.streamdeck.updateInfo.MobileUpdaterResponse");
            }
            gVar = (g) objC;
            bVarA = a(gVar, i9, iVar2);
            jVar = f4971a;
            strC = jVar.c();
            pVar = p.Debug;
            if (jVar.a().a().compareTo(pVar) <= 0) {
                jVar.b(pVar, strC, null, "Received response " + gVar + LYdqVGvOGMNr.EXRJKWqbjDnCx + bVarA);
            }
            return bVarA;
            U5.c cVar = (U5.c) objC;
            if (!y.b(cVar.g())) {
                j jVar2 = f4971a;
                String str2 = "Failure fetching JSON (" + cVar.g() + ")";
                String strC2 = jVar2.c();
                p pVar2 = p.Error;
                if (jVar2.a().a().compareTo(pVar2) <= 0) {
                    jVar2.b(pVar2, strC2, null, str2);
                }
                return null;
            }
            H5.b bVarG1 = cVar.g1();
            m mVarI = K.i(g.class);
            p181u6.a aVarC = p181u6.b.c(X6.r.e(mVarI), K.b(g.class), mVarI);
            aVar2.f4972a = iVar;
            aVar2.f4973b = i8;
            aVar2.f4975d = 2;
            objC = bVarG1.a(aVarC, aVar2);
            if (objC != objF) {
                iVar2 = iVar;
                i9 = i8;
                if (objC != null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.elgato.streamdeck.updateInfo.MobileUpdaterResponse");
                }
                gVar = (g) objC;
                bVarA = a(gVar, i9, iVar2);
                jVar = f4971a;
                strC = jVar.c();
                pVar = p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, "Received response " + gVar + LYdqVGvOGMNr.EXRJKWqbjDnCx + bVarA);
                }
                return bVarA;
            }
            return objF;
        } catch (Throwable th) {
            V3.f.b(new V3.g.c(th));
            j jVar3 = f4971a;
            String strC3 = jVar3.c();
            p pVar3 = p.Error;
            if (jVar3.a().a().compareTo(pVar3) <= 0) {
                jVar3.b(pVar3, strC3, th, "Error fetching JSON");
            }
            return null;
        }
    }
}
