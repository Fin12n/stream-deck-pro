package io.ktor.client.engine.cio;

import C6.G;
import C6.r;
import X5.C1685n;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.B0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;
import p017b7.X0;
import p035d7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.g f24845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.utils.io.g f24846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.ktor.utils.io.j f24847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p098k7.d f24848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p035d7.g f24849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1815v0 f24850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1815v0 f24851g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f24854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f24855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f24856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p035d7.g f24857f;

        /* JADX INFO: renamed from: io.ktor.client.engine.cio.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0571a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p035d7.g f24859b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0571a(p035d7.g gVar, G6.d dVar) {
                super(2, dVar);
                this.f24859b = gVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0571a(this.f24859b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0571a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f24858a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    return obj;
                }
                r.b(obj);
                p035d7.g gVar = this.f24859b;
                this.f24858a = 1;
                Object objL = gVar.l(this);
                return objL == objF ? objF : objL;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, e eVar, boolean z8, p035d7.g gVar, G6.d dVar) {
            super(2, dVar);
            this.f24854c = j8;
            this.f24855d = eVar;
            this.f24856e = z8;
            this.f24857f = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f24854c, this.f24855d, this.f24856e, this.f24857f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x005f  */
        /* JADX WARN: Code duplicated, block: B:34:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x007c A[Catch: all -> 0x00c3, PHI: r1
          0x007c: PHI (r1v7 io.ktor.client.engine.cio.o) = (r1v11 io.ktor.client.engine.cio.o), (r1v12 io.ktor.client.engine.cio.o) binds: [B:21:0x003c, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x00c3, blocks: (B:32:0x006b, B:35:0x007c), top: B:62:0x006b }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0096 A[Catch: p | ClosedChannelException | CancellationException -> 0x0020, p | ClosedChannelException | CancellationException -> 0x0020, p | ClosedChannelException | CancellationException -> 0x0020, all -> 0x00c0, PHI: r1
          0x0096: PHI (r1v6 io.ktor.client.engine.cio.o) = (r1v13 io.ktor.client.engine.cio.o), (r1v14 io.ktor.client.engine.cio.o) binds: [B:16:0x002f, B:36:0x0093] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:26:0x0047, B:29:0x005a, B:38:0x0096), top: B:58:0x0047 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
        
            if (io.ktor.client.engine.cio.p.n(r7, r8, r9, r10, false, r12) == r0) goto L42;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b3 -> B:58:0x0047). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            Throwable th2;
            o oVar;
            Throwable th3;
            o oVar2;
            o oVar3;
            p035d7.g gVar;
            g gVar2;
            o oVar4;
            p098k7.d dVar;
            Object objF = H6.c.f();
            int i8 = this.f24853b;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    long j8 = this.f24854c;
                    C0571a c0571a = new C0571a(this.f24857f, null);
                    this.f24853b = 1;
                    obj = X0.e(j8, c0571a, this);
                    if (obj != objF) {
                        oVar4 = (o) obj;
                        if (oVar4 == null) {
                            y.a.a(this.f24855d.f24849e, null, 1, null);
                            return G.f1419a;
                        }
                        dVar = this.f24855d.f24848d;
                        this.f24852a = oVar4;
                        this.f24853b = 2;
                        oVar3 = oVar4;
                        if (dVar.d(this) == objF) {
                            gVar = this.f24855d.f24849e;
                            gVar2 = new g(p141p6.a.c(null, 1, null), oVar3);
                            this.f24852a = oVar3;
                            this.f24853b = 3;
                            oVar2 = oVar3;
                            if (gVar.i(gVar2, this) != objF) {
                                T5.e eVarB = oVar2.b();
                                io.ktor.utils.io.j jVar = this.f24855d.f24847c;
                                G6.g gVarA = oVar2.a();
                                boolean z8 = this.f24856e;
                                this.f24852a = null;
                                this.f24853b = 4;
                                this = this;
                            }
                            return objF;
                        }
                    }
                    return objF;
                }
                try {
                    if (i8 != 1) {
                        try {
                            if (i8 != 2) {
                                if (i8 == 3) {
                                    o oVar5 = (o) this.f24852a;
                                    r.b(obj);
                                    oVar2 = oVar5;
                                } else {
                                    if (i8 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    r.b(obj);
                                    this = this;
                                    try {
                                        try {
                                            this.f24855d.f24847c.flush();
                                            long j9 = this.f24854c;
                                            C0571a c0571a2 = new C0571a(this.f24857f, null);
                                            this.f24853b = 1;
                                            obj = X0.e(j9, c0571a2, this);
                                            if (obj != objF) {
                                            }
                                            return objF;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                            this = this;
                                            th = th3;
                                            y.a.a(this.f24855d.f24849e, null, 1, null);
                                            throw th;
                                        }
                                    } catch (p035d7.p | ClosedChannelException | CancellationException unused) {
                                        y.a.a(this.f24855d.f24849e, null, 1, null);
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                        th = th3;
                                        y.a.a(this.f24855d.f24849e, null, 1, null);
                                        throw th;
                                    }
                                }
                                T5.e eVarB2 = oVar2.b();
                                io.ktor.utils.io.j jVar2 = this.f24855d.f24847c;
                                G6.g gVarA2 = oVar2.a();
                                boolean z9 = this.f24856e;
                                this.f24852a = null;
                                this.f24853b = 4;
                                this = this;
                            } else {
                                o oVar6 = (o) this.f24852a;
                                r.b(obj);
                                oVar3 = oVar6;
                            }
                            gVar = this.f24855d.f24849e;
                            gVar2 = new g(p141p6.a.c(null, 1, null), oVar3);
                            this.f24852a = oVar3;
                            this.f24853b = 3;
                            oVar2 = oVar3;
                            if (gVar.i(gVar2, this) != objF) {
                                T5.e eVarB3 = oVar2.b();
                                io.ktor.utils.io.j jVar3 = this.f24855d.f24847c;
                                G6.g gVarA3 = oVar2.a();
                                boolean z10 = this.f24856e;
                                this.f24852a = null;
                                this.f24853b = 4;
                                this = this;
                            }
                            return objF;
                        } catch (Throwable th6) {
                            th2 = th6;
                            oVar = i8;
                            oVar.c().v(th2);
                            throw th2;
                        }
                    }
                    r.b(obj);
                    oVar4 = (o) obj;
                    if (oVar4 == null) {
                        y.a.a(this.f24855d.f24849e, null, 1, null);
                        return G.f1419a;
                    }
                    try {
                        dVar = this.f24855d.f24848d;
                        this.f24852a = oVar4;
                        this.f24853b = 2;
                        oVar3 = oVar4;
                        if (dVar.d(this) == objF) {
                            gVar = this.f24855d.f24849e;
                            gVar2 = new g(p141p6.a.c(null, 1, null), oVar3);
                            this.f24852a = oVar3;
                            this.f24853b = 3;
                            oVar2 = oVar3;
                            if (gVar.i(gVar2, this) != objF) {
                                T5.e eVarB4 = oVar2.b();
                                io.ktor.utils.io.j jVar4 = this.f24855d.f24847c;
                                G6.g gVarA4 = oVar2.a();
                                boolean z11 = this.f24856e;
                                this.f24852a = null;
                                this.f24853b = 4;
                                this = this;
                            }
                            return objF;
                        }
                        return objF;
                    } catch (Throwable th7) {
                        th2 = th7;
                        oVar = oVar4;
                        oVar.c().v(th2);
                        throw th2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    this = this;
                    y.a.a(this.f24855d.f24849e, null, 1, null);
                    throw th;
                }
            } catch (p035d7.p | ClosedChannelException | CancellationException unused2) {
                this = this;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f24866g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p043e6.i f24868i;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.g f24869a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.g gVar) {
                super(1);
                this.f24869a = gVar;
            }

            public final void b(Throwable th) {
                io.ktor.utils.io.i.a(this.f24869a);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.engine.cio.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0572b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Y5.k f24870a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0572b(Y5.k kVar) {
                super(1);
                this.f24870a = kVar;
            }

            public final void b(C1685n buildHeaders) {
                t.g(buildHeaders, "$this$buildHeaders");
                buildHeaders.d(new Y5.a(this.f24870a.b()));
                this.f24870a.b().h();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C1685n) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p043e6.i iVar, G6.d dVar) {
            super(2, dVar);
            this.f24868i = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = e.this.new b(this.f24868i, dVar);
            bVar.f24866g = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:105:0x0268  */
        /* JADX WARN: Code duplicated, block: B:135:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:141:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:157:0x0310  */
        /* JADX WARN: Code duplicated, block: B:167:0x0341 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:10:0x0024, B:34:0x00ba, B:38:0x00d4, B:40:0x00dc, B:165:0x0333, B:167:0x0341, B:164:0x032b, B:30:0x009f, B:33:0x00af), top: B:186:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:170:0x0358  */
        /* JADX WARN: Code duplicated, block: B:172:0x035f  */
        /* JADX WARN: Code duplicated, block: B:175:0x0366  */
        /* JADX WARN: Code duplicated, block: B:184:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:196:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:219:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:225:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:40:0x00dc A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:10:0x0024, B:34:0x00ba, B:38:0x00d4, B:40:0x00dc, B:165:0x0333, B:167:0x0341, B:164:0x032b, B:30:0x009f, B:33:0x00af), top: B:186:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:44:0x010d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0115 A[Catch: all -> 0x0308, TRY_LEAVE, TryCatch #12 {all -> 0x0308, blocks: (B:45:0x0111, B:47:0x0115), top: B:204:0x0111 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0153 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #20 {all -> 0x0158, blocks: (B:51:0x014d, B:53:0x0153), top: B:219:0x014d }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[Catch: all -> 0x01f8, TryCatch #8 {all -> 0x01f8, blocks: (B:78:0x01d0, B:80:0x01e8, B:82:0x01ee), top: B:196:0x01d0 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:93:0x0212  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d0 -> B:38:0x00d4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 917
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(long j8, int i8, p043e6.i connection, boolean z8, p035d7.g tasks, G6.g parentContext) {
        t.g(connection, "connection");
        t.g(tasks, "tasks");
        t.g(parentContext, "parentContext");
        this.f24845a = parentContext.P1(B0.b(null, 1, null));
        this.f24846b = connection.a();
        this.f24847c = connection.b();
        this.f24848d = p098k7.f.b(i8, 0, 2, null);
        this.f24849e = p035d7.j.b(Integer.MAX_VALUE, null, null, 6, null);
        L l8 = L.LAZY;
        InterfaceC1815v0 interfaceC1815v0D = AbstractC1789i.d(this, null, l8, new a(j8, this, z8, tasks, null), 1, null);
        this.f24850f = interfaceC1815v0D;
        InterfaceC1815v0 interfaceC1815v0D2 = AbstractC1789i.d(this, null, l8, new b(connection, null), 1, null);
        this.f24851g = interfaceC1815v0D2;
        interfaceC1815v0D.start();
        interfaceC1815v0D2.start();
    }

    public final InterfaceC1815v0 g() {
        return this.f24850f;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f24845a;
    }
}
