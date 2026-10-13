package io.ktor.client.engine.cio;

import C6.G;
import C6.r;
import T0.Vl.PCRzgdeK;
import X5.C1686o;
import X5.C1688q;
import X5.C1692v;
import X5.C1693w;
import X5.InterfaceC1684m;
import X5.Q;
import X5.T;
import X5.x;
import Z.JTT.ryTuoS;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.ktor.utils.io.C;
import io.ktor.utils.io.q;
import io.ktor.utils.io.y;
import io.ktor.utils.io.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.C1802o0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f24968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G6.g f24970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p141p6.c f24971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T5.e f24972f;

        /* JADX INFO: renamed from: io.ktor.client.engine.cio.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0574a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24973a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f24974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C1693w f24975c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f24976d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f24977e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Y5.c f24978f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.g f24979g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0574a(C1693w c1693w, long j8, String str, Y5.c cVar, io.ktor.utils.io.g gVar, G6.d dVar) {
                super(2, dVar);
                this.f24975c = c1693w;
                this.f24976d = j8;
                this.f24977e = str;
                this.f24978f = cVar;
                this.f24979g = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                C0574a c0574a = new C0574a(this.f24975c, this.f24976d, this.f24977e, this.f24978f, this.f24979g, dVar);
                c0574a.f24974b = obj;
                return c0574a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c8, G6.d dVar) {
                return ((C0574a) create(c8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f24973a;
                if (i8 == 0) {
                    r.b(obj);
                    C c8 = (C) this.f24974b;
                    C1693w c1693w = this.f24975c;
                    long j8 = this.f24976d;
                    String str = this.f24977e;
                    Y5.c cVar = this.f24978f;
                    io.ktor.utils.io.g gVar = this.f24979g;
                    io.ktor.utils.io.j jVarMo220e = c8.mo220e();
                    this.f24973a = 1;
                    if (Y5.d.b(c1693w, j8, str, cVar, gVar, jVarMo220e, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, G6.g gVar2, p141p6.c cVar, T5.e eVar, G6.d dVar) {
            super(2, dVar);
            this.f24968b = gVar;
            this.f24969c = jVar;
            this.f24970d = gVar2;
            this.f24971e = cVar;
            this.f24972f = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f24968b, this.f24969c, this.f24970d, this.f24971e, this.f24972f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            String string;
            Object objF = H6.c.f();
            int i8 = this.f24967a;
            if (i8 == 0) {
                r.b(obj);
                io.ktor.utils.io.g gVar = this.f24968b;
                this.f24967a = 1;
                objH = Y5.h.h(gVar, this);
                if (objH == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                objH = obj;
            }
            Y5.k kVar = (Y5.k) objH;
            if (kVar == null) {
                throw new EOFException("Failed to parse HTTP response: unexpected EOF");
            }
            io.ktor.utils.io.g gVar2 = this.f24968b;
            io.ktor.utils.io.j jVar = this.f24969c;
            G6.g gVar3 = this.f24970d;
            p141p6.c cVar = this.f24971e;
            T5.e eVar = this.f24972f;
            try {
                x xVar = new x(kVar.j(), kVar.o().toString());
                Y5.e eVarB = kVar.b();
                C1688q c1688q = C1688q.f11910a;
                CharSequence charSequenceC = eVarB.c(c1688q.i());
                long j8 = (charSequenceC == null || (string = charSequenceC.toString()) == null) ? -1L : Long.parseLong(string);
                CharSequence charSequenceC2 = kVar.b().c(c1688q.A());
                String string2 = charSequenceC2 != null ? charSequenceC2.toString() : null;
                Y5.c cVarC = Y5.c.f12469e.c(kVar.b().c(c1688q.g()));
                C1686o c1686o = new C1686o(p.g(kVar.b()));
                C1693w c1693wG = C1693w.f11972d.g(kVar.t());
                x.a aVar = x.f11997c;
                if (t.c(xVar, aVar.Q())) {
                    T5.h hVar = new T5.h(xVar, cVar, c1686o, c1693wG, io.ktor.websocket.n.b(gVar2, jVar, 0L, true, gVar3, 4, null), gVar3);
                    kVar.close();
                    return hVar;
                }
                T5.h hVar2 = new T5.h(xVar, cVar, c1686o, c1693wG, (t.c(eVar.f(), C1692v.f11962b.c()) || D6.r.q(aVar.z(), aVar.u()).contains(xVar) || p.d(xVar)) ? io.ktor.utils.io.g.f25425a.a() : q.g(K.a(gVar3.P1(new I("Response"))), null, true, new C0574a(c1693wG, j8, string2, cVarC, gVar2, null), 1, null).mo219e(), gVar3);
                kVar.close();
                return hVar2;
            } catch (Throwable th) {
                try {
                    kVar.close();
                    throw th;
                } catch (Throwable th2) {
                    p205x6.l.a(th, th2);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f24984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24985f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24984e = obj;
            this.f24985f |= Integer.MIN_VALUE;
            return p.f(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.j jVar) {
            super(1);
            this.f24986a = jVar;
        }

        public final void b(Throwable th) {
            this.f24986a.d(th);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.utils.io.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f24989c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(this.f24989c, dVar);
            dVar2.f24988b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z zVar, G6.d dVar) {
            return ((d) create(zVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f24987a;
            if (i8 == 0) {
                r.b(obj);
                io.ktor.utils.io.g gVarMo220e = ((z) this.f24988b).mo220e();
                io.ktor.utils.io.j jVar = this.f24989c;
                this.f24987a = 1;
                if (io.ktor.utils.io.h.b(gVarMo220e, jVar, Long.MAX_VALUE, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            this.f24989c.flush();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f24994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24995f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24994e = obj;
            this.f24995f |= Integer.MIN_VALUE;
            return p.j(null, null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T5.e f24998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y f25000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f25001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f25002g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(T5.e eVar, io.ktor.utils.io.j jVar, y yVar, io.ktor.utils.io.j jVar2, boolean z8, G6.d dVar) {
            super(2, dVar);
            this.f24998c = eVar;
            this.f24999d = jVar;
            this.f25000e = yVar;
            this.f25001f = jVar2;
            this.f25002g = z8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new f(this.f24998c, this.f24999d, this.f25000e, this.f25001f, this.f25002g, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0081  */
        /* JADX WARN: Code duplicated, block: B:39:0x0086  */
        /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:77:0x010b  */
        /* JADX WARN: Code duplicated, block: B:81:0x0115  */
        /* JADX WARN: Code duplicated, block: B:84:0x0119  */
        /* JADX WARN: Code duplicated, block: B:87:0x011e  */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0157, code lost:
        
            if (r11.i0(r10) == r1) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            if (r11.i0(r10) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0100, code lost:
        
            if (r11.i0(r10) == r1) goto L104;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            io.ktor.utils.io.j jVarMo219e;
            Throwable thA;
            Throwable th2;
            f fVar;
            G g8;
            io.ktor.utils.io.j jVarMo219e2;
            Throwable thA2;
            Throwable thA3;
            y yVar;
            y yVar2;
            io.ktor.utils.io.j jVarMo219e3;
            Throwable thA4;
            Throwable thA5;
            Object objF = H6.c.f();
            try {
                switch (this.f24997b) {
                    case 0:
                        r.b(obj);
                        try {
                            p007a6.c cVarB = this.f24998c.b();
                            if (cVarB instanceof a6.c.b) {
                                g8 = G.f1419a;
                                this.f24999d.flush();
                                y yVar3 = this.f25000e;
                                if (yVar3 != null && (jVarMo219e2 = yVar3.mo219e()) != null) {
                                    I6.b.a(io.ktor.utils.io.k.a(jVarMo219e2));
                                }
                                y yVar4 = this.f25000e;
                                if (yVar4 != null) {
                                    this.f24996a = g8;
                                    this.f24997b = 1;
                                    break;
                                }
                                thA2 = this.f25001f.a();
                                if (thA2 != null && (thA3 = V5.e.a(thA2)) != null) {
                                    th2 = thA3 instanceof CancellationException ? null : thA3;
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                }
                                if (this.f25002g) {
                                    io.ktor.utils.io.k.a(this.f25001f);
                                }
                                return g8;
                            }
                            if (!(cVarB instanceof a6.c.a)) {
                                try {
                                    if (!(cVarB instanceof a6.c.d)) {
                                        fVar = this;
                                        if (cVarB instanceof a6.c.e) {
                                            io.ktor.utils.io.j jVar = fVar.f24999d;
                                            fVar.f24997b = 4;
                                            if (((a6.c.e) cVarB).d(jVar, this) == objF) {
                                            }
                                        } else if (cVarB instanceof p007a6.c.AbstractC0337c) {
                                            throw new H5.h(cVarB);
                                        }
                                        fVar.f24999d.flush();
                                        yVar = fVar.f25000e;
                                        if (yVar != null) {
                                            I6.b.a(io.ktor.utils.io.k.a(jVarMo219e3));
                                        }
                                        yVar2 = fVar.f25000e;
                                        if (yVar2 != null) {
                                            fVar.f24997b = 5;
                                            break;
                                        }
                                        thA4 = fVar.f25001f.a();
                                        if (thA4 != null) {
                                            if (thA5 instanceof CancellationException) {
                                            }
                                            if (th2 != null) {
                                                throw th2;
                                            }
                                        }
                                        if (fVar.f25002g) {
                                            io.ktor.utils.io.k.a(fVar.f25001f);
                                        }
                                        return G.f1419a;
                                    }
                                    io.ktor.utils.io.g gVarD = ((a6.c.d) cVarB).d();
                                    io.ktor.utils.io.j jVar2 = this.f24999d;
                                    this.f24997b = 3;
                                    fVar = this;
                                    if (io.ktor.utils.io.i.c(gVarD, jVar2, 0L, fVar, 2, null) != objF) {
                                        fVar.f24999d.flush();
                                        yVar = fVar.f25000e;
                                        if (yVar != null) {
                                            I6.b.a(io.ktor.utils.io.k.a(jVarMo219e3));
                                        }
                                        yVar2 = fVar.f25000e;
                                        if (yVar2 != null) {
                                            fVar.f24997b = 5;
                                            break;
                                        }
                                        thA4 = fVar.f25001f.a();
                                        if (thA4 != null) {
                                            if (thA5 instanceof CancellationException) {
                                            }
                                            if (th2 != null) {
                                                throw th2;
                                            }
                                        }
                                        if (fVar.f25002g) {
                                            io.ktor.utils.io.k.a(fVar.f25001f);
                                        }
                                        return G.f1419a;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    try {
                                        this.f24999d.d(th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        this.f24999d.flush();
                                        y yVar5 = this.f25000e;
                                        if (yVar5 != null && (jVarMo219e = yVar5.mo219e()) != null) {
                                            I6.b.a(io.ktor.utils.io.k.a(jVarMo219e));
                                        }
                                        y yVar6 = this.f25000e;
                                        if (yVar6 != null) {
                                            this.f24996a = th;
                                            this.f24997b = 6;
                                        }
                                    }
                                }
                                break;
                            } else {
                                io.ktor.utils.io.j jVar3 = this.f24999d;
                                byte[] bArrD = ((a6.c.a) cVarB).d();
                                this.f24997b = 2;
                                if (io.ktor.utils.io.k.b(jVar3, bArrD, this) != objF) {
                                    fVar = this;
                                    fVar.f24999d.flush();
                                    yVar = fVar.f25000e;
                                    if (yVar != null && (jVarMo219e3 = yVar.mo219e()) != null) {
                                        I6.b.a(io.ktor.utils.io.k.a(jVarMo219e3));
                                    }
                                    yVar2 = fVar.f25000e;
                                    if (yVar2 != null) {
                                        fVar.f24997b = 5;
                                        break;
                                    }
                                    thA4 = fVar.f25001f.a();
                                    if (thA4 != null && (thA5 = V5.e.a(thA4)) != null) {
                                        th2 = thA5 instanceof CancellationException ? null : thA5;
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    }
                                    if (fVar.f25002g) {
                                        io.ktor.utils.io.k.a(fVar.f25001f);
                                    }
                                    return G.f1419a;
                                }
                            }
                            return objF;
                            return objF;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        break;
                    case 1:
                        g8 = (G) this.f24996a;
                        r.b(obj);
                        thA2 = this.f25001f.a();
                        if (thA2 != null) {
                            if (thA3 instanceof CancellationException) {
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        if (this.f25002g) {
                            io.ktor.utils.io.k.a(this.f25001f);
                        }
                        return g8;
                    case 2:
                    case 3:
                    case 4:
                        r.b(obj);
                        fVar = this;
                        fVar.f24999d.flush();
                        yVar = fVar.f25000e;
                        if (yVar != null) {
                            I6.b.a(io.ktor.utils.io.k.a(jVarMo219e3));
                        }
                        yVar2 = fVar.f25000e;
                        if (yVar2 != null) {
                            fVar.f24997b = 5;
                            break;
                        }
                        thA4 = fVar.f25001f.a();
                        if (thA4 != null) {
                            if (thA5 instanceof CancellationException) {
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        if (fVar.f25002g) {
                            io.ktor.utils.io.k.a(fVar.f25001f);
                        }
                        return G.f1419a;
                    case 5:
                        r.b(obj);
                        fVar = this;
                        thA4 = fVar.f25001f.a();
                        if (thA4 != null) {
                            if (thA5 instanceof CancellationException) {
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        if (fVar.f25002g) {
                            io.ktor.utils.io.k.a(fVar.f25001f);
                        }
                        return G.f1419a;
                    case 6:
                        th = (Throwable) this.f24996a;
                        r.b(obj);
                        this = this;
                        Throwable thA6 = this.f25001f.a();
                        if (thA6 != null && (thA = V5.e.a(thA6)) != null) {
                            th2 = thA instanceof CancellationException ? null : thA;
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        if (this.f25002g) {
                            io.ktor.utils.io.k.a(this.f25001f);
                        }
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25007e;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25006d = obj;
            this.f25007e |= Integer.MIN_VALUE;
            return p.l(null, null, false, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y5.j f25008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y5.j jVar) {
            super(2);
            this.f25008a = jVar;
        }

        public final void b(String key, String value) throws p205x6.r {
            t.g(key, "key");
            t.g(value, "value");
            C1688q c1688q = C1688q.f11910a;
            if (t.c(key, c1688q.i()) || t.c(key, c1688q.n())) {
                return;
            }
            this.f25008a.c(key, value);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws p205x6.r {
            b((String) obj, (String) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T5.e f25010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f25011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f25012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f25013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ G6.g f25014f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(T5.e eVar, io.ktor.utils.io.j jVar, boolean z8, boolean z9, G6.g gVar, G6.d dVar) {
            super(2, dVar);
            this.f25010b = eVar;
            this.f25011c = jVar;
            this.f25012d = z8;
            this.f25013e = z9;
            this.f25014f = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new i(this.f25010b, this.f25011c, this.f25012d, this.f25013e, this.f25014f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((i) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (io.ktor.client.engine.cio.p.k(r3, r4, r5, false, r10, 8, null) == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f25009a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            T5.e eVar = this.f25010b;
            io.ktor.utils.io.j jVar = this.f25011c;
            boolean z8 = this.f25012d;
            boolean z9 = this.f25013e;
            this.f25009a = 1;
            if (p.l(eVar, jVar, z8, z9, this) != objF) {
            }
            return objF;
            T5.e eVar2 = this.f25010b;
            io.ktor.utils.io.j jVar2 = this.f25011c;
            G6.g gVar = this.f25014f;
            this.f25009a = 2;
        }
    }

    public static final boolean a(String str, p007a6.c body) {
        t.g(body, "body");
        return (str == null || (body instanceof a6.c.b)) ? false : true;
    }

    public static final io.ktor.utils.io.j b(io.ktor.utils.io.j jVar, G6.g coroutineContext, boolean z8) {
        t.g(jVar, "<this>");
        t.g(coroutineContext, "coroutineContext");
        return z8 ? jVar : i(jVar, coroutineContext, false, 2, null);
    }

    public static final boolean c(String str, String str2, String str3) {
        return str == null || t.c(str2, "chunked") || t.c(str3, "chunked");
    }

    public static final boolean d(x xVar) {
        t.g(xVar, "<this>");
        return xVar.o0() / 100 == 1;
    }

    public static final Object e(p141p6.c cVar, T5.e eVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, G6.g gVar2, G6.d dVar) {
        return AbstractC1785g.g(gVar2, new a(gVar, jVar, gVar2, cVar, eVar, null), dVar);
    }

    public static final Map g(Y5.e eVar) {
        t.g(eVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iE = eVar.e();
        for (int i8 = 0; i8 < iE; i8++) {
            String string = eVar.f(i8).toString();
            String string2 = eVar.i(i8).toString();
            List list = (List) linkedHashMap.get(string);
            if ((list != null ? Boolean.valueOf(list.add(string2)) : null) == null) {
                linkedHashMap.put(string, D6.r.t(string2));
            }
        }
        return linkedHashMap;
    }

    public static final io.ktor.utils.io.j h(io.ktor.utils.io.j jVar, G6.g coroutineContext, boolean z8) {
        t.g(jVar, "<this>");
        t.g(coroutineContext, "coroutineContext");
        if (z8) {
            G6.g.b bVarA = coroutineContext.A(InterfaceC1815v0.f15985O);
            t.d(bVarA);
            ((InterfaceC1815v0) bVarA).H0(new c(jVar));
        }
        return q.c(C1802o0.f15975a, coroutineContext, true, new d(jVar, null)).mo219e();
    }

    public static /* synthetic */ io.ktor.utils.io.j i(io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return h(jVar, gVar, z8);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object j(T5.e eVar, io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, G6.d dVar) {
        e eVar2;
        y yVar;
        T5.e eVar3;
        Object objD;
        io.ktor.utils.io.j jVar2;
        y yVar2;
        io.ktor.utils.io.j jVar3;
        io.ktor.utils.io.j jVarMo219e;
        io.ktor.utils.io.j jVar4 = jVar;
        G6.g gVar2 = gVar;
        boolean z9 = z8;
        if (dVar instanceof e) {
            eVar2 = (e) dVar;
            int i8 = eVar2.f24995f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar2.f24995f = i8 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(dVar);
            }
        } else {
            eVar2 = new e(dVar);
        }
        Object obj = eVar2.f24994e;
        Object objF = H6.c.f();
        int i9 = eVar2.f24995f;
        if (i9 == 0) {
            r.b(obj);
            if (eVar.b() instanceof a6.c.b) {
                if (z9) {
                    io.ktor.utils.io.k.a(jVar4);
                }
                return G.f1419a;
            }
            InterfaceC1684m interfaceC1684mE = eVar.e();
            C1688q c1688q = C1688q.f11910a;
            String strD = interfaceC1684mE.d(c1688q.i());
            yVar = null;
            if (strD == null) {
                Long lA = eVar.b().a();
                strD = lA != null ? lA.toString() : null;
            }
            if (c(strD, eVar.b().c().d(c1688q.A()), eVar.e().d(c1688q.A()))) {
                eVar3 = eVar;
                eVar2.f24990a = eVar3;
                eVar2.f24991b = jVar4;
                eVar2.f24992c = gVar2;
                eVar2.f24993d = z9;
                eVar2.f24995f = 1;
                objD = Y5.b.d(jVar4, gVar2, eVar2);
                if (objD == objF) {
                    return objF;
                }
            } else {
                eVar3 = eVar;
            }
            jVar2 = jVar4;
            boolean z10 = z9;
            T5.e eVar4 = eVar3;
            yVar2 = yVar;
            if (yVar2 != null || (jVarMo219e = yVar2.mo219e()) == null) {
                jVar3 = jVar2;
            } else {
                jVar3 = jVarMo219e;
            }
            AbstractC1789i.d(K.a(gVar2.P1(new I("Request body writer"))), null, null, new f(eVar4, jVar3, yVar2, jVar2, z10, null), 3, null);
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z11 = eVar2.f24993d;
        gVar2 = (G6.g) eVar2.f24992c;
        io.ktor.utils.io.j jVar5 = (io.ktor.utils.io.j) eVar2.f24991b;
        T5.e eVar5 = (T5.e) eVar2.f24990a;
        r.b(obj);
        z9 = z11;
        jVar4 = jVar5;
        objD = obj;
        eVar3 = eVar5;
        yVar = (y) objD;
        jVar2 = jVar4;
        boolean z12 = z9;
        T5.e eVar6 = eVar3;
        yVar2 = yVar;
        if (yVar2 != null) {
            jVar3 = jVar2;
        } else {
            jVar3 = jVar2;
        }
        AbstractC1789i.d(K.a(gVar2.P1(new I("Request body writer"))), null, null, new f(eVar6, jVar3, yVar2, jVar2, z12, null), 3, null);
        return G.f1419a;
    }

    public static /* synthetic */ Object k(T5.e eVar, io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, G6.d dVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        return j(eVar, jVar, gVar, z8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object l(T5.e eVar, io.ktor.utils.io.j jVar, boolean z8, boolean z9, G6.d dVar) {
        g gVar;
        boolean z10;
        Y5.j jVar2;
        T tB;
        io.ktor.utils.io.j jVar3 = jVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i8 = gVar.f25007e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f25007e = i8 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f25006d;
        Object objF = H6.c.f();
        int i9 = gVar.f25007e;
        if (i9 == 0) {
            r.b(obj);
            Y5.j jVar4 = new Y5.j();
            C1692v c1692vF = eVar.f();
            T tH = eVar.h();
            InterfaceC1684m interfaceC1684mE = eVar.e();
            p007a6.c cVarB = eVar.b();
            C1688q c1688q = C1688q.f11910a;
            String strD = interfaceC1684mE.d(c1688q.i());
            if (strD == null) {
                Long lA = cVarB.a();
                strD = lA != null ? lA.toString() : null;
            }
            String strD2 = interfaceC1684mE.d(c1688q.A());
            String strD3 = cVarB.c().d(c1688q.A());
            boolean zC = c(strD, strD3, strD2);
            String strD4 = interfaceC1684mE.d(c1688q.n());
            try {
                if (tH.j().isEmpty()) {
                    X5.I iA = Q.a(tH);
                    X5.K.j(iA, "/");
                    tB = iA.b();
                } else {
                    tB = tH;
                }
                jVar4.e(c1692vF, z8 ? tB.toString() : Q.h(tB), C1693w.f11972d.c().toString());
                if (!interfaceC1684mE.contains(c1688q.p())) {
                    jVar4.c(c1688q.p(), tH.l().d() == tH.k() ? tH.g() : Q.i(tH));
                }
                if (strD != null) {
                    C1692v.a aVar = C1692v.f11962b;
                    if ((!t.c(c1692vF, aVar.b()) && !t.c(c1692vF, aVar.c())) || !(cVarB instanceof a6.c.b)) {
                        jVar4.c(c1688q.i(), strD);
                    }
                }
                J5.o.d(interfaceC1684mE, cVarB, new h(jVar4));
                if (zC && strD2 == null && strD3 == null && !(cVarB instanceof a6.c.b)) {
                    jVar4.c(c1688q.A(), "chunked");
                }
                if (a(strD4, cVarB)) {
                    String strN = c1688q.n();
                    t.d(strD4);
                    jVar4.c(strN, strD4);
                }
                jVar4.b();
                p205x6.k kVarA = jVar4.a();
                gVar.f25003a = jVar3;
                gVar.f25004b = jVar4;
                z10 = z9;
                try {
                    gVar.f25005c = z10;
                    gVar.f25007e = 1;
                    if (jVar3.K(kVarA, gVar) == objF) {
                        return objF;
                    }
                    jVar2 = jVar4;
                    jVar3.flush();
                    jVar2.d();
                    return G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    jVar2 = jVar4;
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = z9;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = gVar.f25005c;
            jVar2 = (Y5.j) gVar.f25004b;
            io.ktor.utils.io.j jVar5 = (io.ktor.utils.io.j) gVar.f25003a;
            try {
                r.b(obj);
                z10 = z11;
                jVar3 = jVar5;
                try {
                    jVar3.flush();
                    jVar2.d();
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                z10 = z11;
                jVar3 = jVar5;
            }
        }
        if (z10) {
            try {
                io.ktor.utils.io.k.a(jVar3);
            } catch (Throwable th5) {
                jVar2.d();
                throw th5;
            }
        }
        throw th;
    }

    public static /* synthetic */ Object m(T5.e eVar, io.ktor.utils.io.j jVar, boolean z8, boolean z9, G6.d dVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z9 = true;
        }
        return l(eVar, jVar, z8, z9, dVar);
    }

    public static final Object n(T5.e eVar, io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, boolean z9, G6.d dVar) {
        Object objG = AbstractC1785g.g(gVar, new i(eVar, jVar, z8, z9, gVar, null), dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public static /* synthetic */ Object o(T5.e eVar, io.ktor.utils.io.j jVar, G6.g gVar, boolean z8, boolean z9, G6.d dVar, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            z9 = true;
        }
        return n(eVar, jVar, gVar, z8, z9, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0110 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #5 {all -> 0x0038, blocks: (B:14:0x0033, B:57:0x0140, B:50:0x0110, B:52:0x0118, B:54:0x0128, B:63:0x0157, B:64:0x015e), top: B:76:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[Catch: all -> 0x0038, TryCatch #5 {all -> 0x0038, blocks: (B:14:0x0033, B:57:0x0140, B:50:0x0110, B:52:0x0118, B:54:0x0128, B:63:0x0157, B:64:0x015e), top: B:76:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128 A[Catch: all -> 0x0038, TryCatch #5 {all -> 0x0038, blocks: (B:14:0x0033, B:57:0x0140, B:50:0x0110, B:52:0x0118, B:54:0x0128, B:63:0x0157, B:64:0x015e), top: B:76:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #5 {all -> 0x0038, blocks: (B:14:0x0033, B:57:0x0140, B:50:0x0110, B:52:0x0118, B:54:0x0128, B:63:0x0157, B:64:0x015e), top: B:76:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016a A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:58:0x0149, B:71:0x0169, B:48:0x010b, B:72:0x016a, B:73:0x0171, B:65:0x015f, B:69:0x0167, B:68:0x0164, B:14:0x0033, B:57:0x0140, B:50:0x0110, B:52:0x0118, B:54:0x0128, B:63:0x0157, B:64:0x015e), top: B:76:0x0023, inners: #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        if (r12 == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(T5.e eVar, io.ktor.utils.io.j jVar, io.ktor.utils.io.g gVar, G6.d dVar) throws Throwable {
        b bVar;
        Y5.j jVar2;
        Y5.j jVar3;
        Y5.k kVar;
        CharSequence charSequenceC;
        Closeable closeable;
        Closeable closeable2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f24985f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f24985f = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objH = bVar.f24984e;
        Object objF = H6.c.f();
        int i9 = bVar.f24985f;
        try {
            try {
                try {
                    if (i9 == 0) {
                        r.b(objH);
                        Y5.j jVar4 = new Y5.j();
                        try {
                            String strI = Q.i(eVar.h());
                            jVar4.e(new C1692v("CONNECT"), strI, C1693w.f11972d.c().toString());
                            C1688q c1688q = C1688q.f11910a;
                            jVar4.c(c1688q.p(), strI);
                            jVar4.c(ryTuoS.cSFSKOsLpnpY, "Keep-Alive");
                            String strD = eVar.e().d(c1688q.D());
                            if (strD != null) {
                                jVar4.c(c1688q.D(), strD);
                            }
                            String strD2 = eVar.e().d(c1688q.v());
                            if (strD2 != null) {
                                jVar4.c(c1688q.v(), strD2);
                            }
                            String strD3 = eVar.e().d(c1688q.w());
                            if (strD3 != null) {
                                jVar4.c(c1688q.w(), strD3);
                            }
                            jVar4.b();
                            p205x6.k kVarA = jVar4.a();
                            bVar.f24980a = jVar;
                            bVar.f24981b = gVar;
                            bVar.f24982c = jVar4;
                            bVar.f24985f = 1;
                            if (jVar.K(kVarA, bVar) != objF) {
                                jVar2 = jVar4;
                            }
                            closeable = kVar;
                            closeable2 = kVar;
                            return objF;
                        } catch (Throwable th) {
                            th = th;
                            eVar = jVar4;
                            eVar.d();
                            throw th;
                        }
                    }
                    if (i9 == 1) {
                        jVar2 = (Y5.j) bVar.f24982c;
                        gVar = (io.ktor.utils.io.g) bVar.f24981b;
                        jVar = (io.ktor.utils.io.j) bVar.f24980a;
                        r.b(objH);
                    } else {
                        if (i9 == 2) {
                            jVar2 = (Y5.j) bVar.f24981b;
                            io.ktor.utils.io.g gVar2 = (io.ktor.utils.io.g) bVar.f24980a;
                            r.b(objH);
                            gVar = gVar2;
                            jVar3 = jVar2;
                            kVar = (Y5.k) objH;
                            if (kVar != null) {
                                throw new EOFException("Failed to parse CONNECT response: unexpected EOF");
                            }
                            if (kVar.j() / RCHTTPStatusCodes.SUCCESS == 1) {
                                throw new IOException("Can not establish tunnel connection");
                            }
                            charSequenceC = kVar.b().c(C1688q.f11910a.i());
                            if (charSequenceC != null) {
                                long j8 = Long.parseLong(charSequenceC.toString());
                                bVar.f24980a = jVar3;
                                bVar.f24981b = kVar;
                                bVar.f24983d = 0;
                                bVar.f24985f = 3;
                                objH = gVar.B(j8, bVar);
                            }
                            closeable = kVar;
                            closeable.close();
                            jVar3.d();
                            return G.f1419a;
                        }
                        if (i9 != 3) {
                            throw new IllegalStateException(PCRzgdeK.lvNGcU);
                        }
                        Closeable closeable3 = (Closeable) bVar.f24981b;
                        jVar3 = (Y5.j) bVar.f24980a;
                        r.b(objH);
                        closeable2 = closeable3;
                    }
                    closeable = kVar;
                    closeable2 = kVar;
                    I6.b.e(((Number) objH).longValue());
                    closeable = closeable2;
                    closeable = kVar;
                    closeable.close();
                    jVar3.d();
                    return G.f1419a;
                    jVar.flush();
                    bVar.f24980a = gVar;
                    bVar.f24981b = jVar2;
                    bVar.f24982c = null;
                    bVar.f24985f = 2;
                    objH = Y5.h.h(gVar, bVar);
                    if (objH != objF) {
                        jVar3 = jVar2;
                        kVar = (Y5.k) objH;
                        if (kVar != null) {
                            throw new EOFException("Failed to parse CONNECT response: unexpected EOF");
                        }
                        if (kVar.j() / RCHTTPStatusCodes.SUCCESS == 1) {
                            throw new IOException("Can not establish tunnel connection");
                        }
                        charSequenceC = kVar.b().c(C1688q.f11910a.i());
                        if (charSequenceC != null) {
                            long j9 = Long.parseLong(charSequenceC.toString());
                            bVar.f24980a = jVar3;
                            bVar.f24981b = kVar;
                            bVar.f24983d = 0;
                            bVar.f24985f = 3;
                            objH = gVar.B(j9, bVar);
                        }
                        closeable = kVar;
                        closeable.close();
                        jVar3.d();
                        return G.f1419a;
                    }
                    closeable = kVar;
                    closeable2 = kVar;
                    return objF;
                } catch (Throwable th2) {
                    th = th2;
                    eVar = jVar;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            try {
                eVar.close();
            } catch (Throwable th5) {
                p205x6.l.a(th4, th5);
            }
            throw th4;
        }
    }
}
