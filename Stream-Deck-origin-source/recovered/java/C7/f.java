package C7;

import C6.G;
import J7.C1034e;
import J7.InterfaceC1035f;
import R0.pkXL.Oitvkwcwn;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final b f1518C = new b(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final m f1519D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f1520A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Set f1521B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y7.e f1529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y7.d f1530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y7.d f1531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y7.d f1532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C7.l f1533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f1537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f1540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f1541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Socket f1546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C7.j f1547z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y7.e f1549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f1550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public J7.g f1552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1035f f1553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f1554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C7.l f1555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1556i;

        public a(boolean z8, y7.e taskRunner) {
            t.g(taskRunner, "taskRunner");
            this.f1548a = z8;
            this.f1549b = taskRunner;
            this.f1554g = c.f1558b;
            this.f1555h = C7.l.f1660b;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f1548a;
        }

        public final String c() {
            String str = this.f1551d;
            if (str != null) {
                return str;
            }
            t.t("connectionName");
            return null;
        }

        public final c d() {
            return this.f1554g;
        }

        public final int e() {
            return this.f1556i;
        }

        public final C7.l f() {
            return this.f1555h;
        }

        public final Socket h() {
            Socket socket = this.f1550c;
            if (socket != null) {
                return socket;
            }
            t.t("socket");
            return null;
        }

        public final J7.g i() {
            J7.g gVar = this.f1552e;
            if (gVar != null) {
                return gVar;
            }
            t.t("source");
            return null;
        }

        public final y7.e j() {
            return this.f1549b;
        }

        public final a k(c listener) {
            t.g(listener, "listener");
            this.f1554g = listener;
            return this;
        }

        public final a l(int i8) {
            this.f1556i = i8;
            return this;
        }

        public final void m(String str) {
            t.g(str, "<set-?>");
            this.f1551d = str;
        }

        public final void n(InterfaceC1035f interfaceC1035f) {
            t.g(interfaceC1035f, "<set-?>");
            this.f1553f = interfaceC1035f;
        }

        public final void o(Socket socket) {
            t.g(socket, "<set-?>");
            this.f1550c = socket;
        }

        public final void p(J7.g gVar) {
            t.g(gVar, "<set-?>");
            this.f1552e = gVar;
        }

        public final a q(Socket socket, String peerName, J7.g source, InterfaceC1035f sink) {
            String str;
            t.g(socket, "socket");
            t.g(peerName, "peerName");
            t.g(source, "source");
            t.g(sink, "sink");
            o(socket);
            if (this.f1548a) {
                str = v7.d.f35187i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }

        public final InterfaceC1035f g() {
            InterfaceC1035f interfaceC1035f = this.f1553f;
            if (interfaceC1035f != null) {
                return interfaceC1035f;
            }
            t.t(WaYxBuDSBD.pAkTEgbJkartOIH);
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final m a() {
            return f.f1519D;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1557a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f1558b = new a();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends c {
            @Override // C7.f.c
            public void b(C7.i stream) {
                t.g(stream, "stream");
                stream.d(C7.b.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b {
            public /* synthetic */ b(AbstractC2633k abstractC2633k) {
                this();
            }

            public b() {
            }
        }

        public void a(f connection, m settings) {
            t.g(connection, "connection");
            t.g(settings, "settings");
        }

        public abstract void b(C7.i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d implements C7.h.c, Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C7.h f1559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f1560b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends y7.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f1561e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ J f1562f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z8, f fVar, J j8) {
                super(str, z8);
                this.f1561e = fVar;
                this.f1562f = j8;
            }

            @Override // y7.a
            public long f() {
                this.f1561e.g1().a(this.f1561e, (m) this.f1562f.f28779a);
                return -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends y7.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f1563e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C7.i f1564f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z8, f fVar, C7.i iVar) {
                super(str, z8);
                this.f1563e = fVar;
                this.f1564f = iVar;
            }

            @Override // y7.a
            public long f() {
                try {
                    this.f1563e.g1().b(this.f1564f);
                    return -1L;
                } catch (IOException e8) {
                    E7.h.f2311a.g().k("Http2Connection.Listener failure for " + this.f1563e.V0(), 4, e8);
                    try {
                        this.f1564f.d(C7.b.PROTOCOL_ERROR, e8);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends y7.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f1565e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f1566f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f1567g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z8, f fVar, int i8, int i9) {
                super(str, z8);
                this.f1565e = fVar;
                this.f1566f = i8;
                this.f1567g = i9;
            }

            @Override // y7.a
            public long f() {
                this.f1565e.j2(true, this.f1566f, this.f1567g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: C7.f$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0061d extends y7.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f1568e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f1569f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ m f1570g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061d(String str, boolean z8, d dVar, boolean z9, m mVar) {
                super(str, z8);
                this.f1568e = dVar;
                this.f1569f = z9;
                this.f1570g = mVar;
            }

            @Override // y7.a
            public long f() {
                this.f1568e.p(this.f1569f, this.f1570g);
                return -1L;
            }
        }

        public d(f fVar, C7.h reader) {
            t.g(reader, "reader");
            this.f1560b = fVar;
            this.f1559a = reader;
        }

        @Override // C7.h.c
        public void b() {
        }

        @Override // C7.h.c
        public void c(boolean z8, m settings) {
            t.g(settings, "settings");
            this.f1560b.f1530i.i(new C0061d(this.f1560b.V0() + " applyAndAckSettings", true, this, z8, settings), 0L);
        }

        @Override // C7.h.c
        public void d(boolean z8, int i8, J7.g source, int i9) {
            t.g(source, "source");
            if (this.f1560b.X1(i8)) {
                this.f1560b.M1(i8, source, i9, z8);
                return;
            }
            C7.i iVarP1 = this.f1560b.p1(i8);
            if (iVarP1 == null) {
                this.f1560b.l2(i8, C7.b.PROTOCOL_ERROR);
                long j8 = i9;
                this.f1560b.g2(j8);
                source.skip(j8);
                return;
            }
            iVarP1.w(source, i9);
            if (z8) {
                iVarP1.x(v7.d.f35180b, true);
            }
        }

        @Override // C7.h.c
        public void e(int i8, C7.b errorCode) {
            t.g(errorCode, "errorCode");
            if (this.f1560b.X1(i8)) {
                this.f1560b.U1(i8, errorCode);
                return;
            }
            C7.i iVarZ1 = this.f1560b.Z1(i8);
            if (iVarZ1 != null) {
                iVarZ1.y(errorCode);
            }
        }

        @Override // C7.h.c
        public void f(boolean z8, int i8, int i9, List headerBlock) {
            t.g(headerBlock, "headerBlock");
            if (this.f1560b.X1(i8)) {
                this.f1560b.P1(i8, headerBlock, z8);
                return;
            }
            f fVar = this.f1560b;
            synchronized (fVar) {
                C7.i iVarP1 = fVar.p1(i8);
                if (iVarP1 != null) {
                    G g8 = G.f1419a;
                    iVarP1.x(v7.d.P(headerBlock), z8);
                    return;
                }
                if (fVar.f1528g) {
                    return;
                }
                if (i8 <= fVar.a1()) {
                    return;
                }
                if (i8 % 2 == fVar.i1() % 2) {
                    return;
                }
                C7.i iVar = new C7.i(i8, fVar, false, z8, v7.d.P(headerBlock));
                fVar.b2(i8);
                fVar.q1().put(Integer.valueOf(i8), iVar);
                fVar.f1529h.i().i(new b(fVar.V0() + '[' + i8 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // C7.h.c
        public void h(int i8, long j8) {
            if (i8 == 0) {
                f fVar = this.f1560b;
                synchronized (fVar) {
                    fVar.f1545x = fVar.r1() + j8;
                    t.e(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    G g8 = G.f1419a;
                }
                return;
            }
            C7.i iVarP1 = this.f1560b.p1(i8);
            if (iVarP1 != null) {
                synchronized (iVarP1) {
                    iVarP1.a(j8);
                    G g9 = G.f1419a;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            q();
            return G.f1419a;
        }

        @Override // C7.h.c
        public void k(boolean z8, int i8, int i9) {
            if (!z8) {
                this.f1560b.f1530i.i(new c(this.f1560b.V0() + " ping", true, this.f1560b, i8, i9), 0L);
                return;
            }
            f fVar = this.f1560b;
            synchronized (fVar) {
                try {
                    if (i8 == 1) {
                        fVar.f1535n++;
                    } else if (i8 != 2) {
                        if (i8 == 3) {
                            fVar.f1538q++;
                            t.e(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        G g8 = G.f1419a;
                    } else {
                        fVar.f1537p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // C7.h.c
        public void l(int i8, int i9, int i10, boolean z8) {
        }

        @Override // C7.h.c
        public void m(int i8, int i9, List requestHeaders) throws Throwable {
            t.g(requestHeaders, "requestHeaders");
            this.f1560b.R1(i9, requestHeaders);
        }

        public final void p(boolean z8, m settings) {
            long jC;
            int i8;
            C7.i[] iVarArr;
            t.g(settings, "settings");
            J j8 = new J();
            C7.j jVarB1 = this.f1560b.B1();
            f fVar = this.f1560b;
            synchronized (jVarB1) {
                synchronized (fVar) {
                    try {
                        m mVarO1 = fVar.o1();
                        if (!z8) {
                            m mVar = new m();
                            mVar.g(mVarO1);
                            mVar.g(settings);
                            settings = mVar;
                        }
                        j8.f28779a = settings;
                        jC = ((long) settings.c()) - ((long) mVarO1.c());
                        iVarArr = (jC == 0 || fVar.q1().isEmpty()) ? null : (C7.i[]) fVar.q1().values().toArray(new C7.i[0]);
                        fVar.c2((m) j8.f28779a);
                        fVar.f1532k.i(new a(fVar.V0() + " onSettings", true, fVar, j8), 0L);
                        G g8 = G.f1419a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    fVar.B1().b((m) j8.f28779a);
                } catch (IOException e8) {
                    fVar.Q0(e8);
                }
                G g9 = G.f1419a;
            }
            if (iVarArr != null) {
                for (C7.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        G g10 = G.f1419a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [C7.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [C7.h, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void q() throws Throwable {
            C7.b bVar;
            C7.b bVar2 = C7.b.INTERNAL_ERROR;
            IOException e8 = null;
            try {
                try {
                    this.f1559a.j(this);
                    while (this.f1559a.c(false, this)) {
                    }
                    C7.b bVar3 = C7.b.NO_ERROR;
                    try {
                        this.f1560b.O0(bVar3, C7.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e9) {
                        e8 = e9;
                        C7.b bVar4 = C7.b.PROTOCOL_ERROR;
                        f fVar = this.f1560b;
                        fVar.O0(bVar4, bVar4, e8);
                        bVar = fVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f1560b.O0(bVar, bVar2, e8);
                    v7.d.m(this.f1559a);
                    throw th;
                }
            } catch (IOException e10) {
                e8 = e10;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f1560b.O0(bVar, bVar2, e8);
                v7.d.m(this.f1559a);
                throw th;
            }
            bVar2 = this.f1559a;
            v7.d.m(bVar2);
        }

        @Override // C7.h.c
        public void g(int i8, C7.b errorCode, J7.h hVar) {
            int i9;
            Object[] array;
            t.g(errorCode, "errorCode");
            t.g(hVar, toqHM.TrSmrMh);
            hVar.H();
            f fVar = this.f1560b;
            synchronized (fVar) {
                array = fVar.q1().values().toArray(new C7.i[0]);
                fVar.f1528g = true;
                G g8 = G.f1419a;
            }
            for (C7.i iVar : (C7.i[]) array) {
                if (iVar.j() > i8 && iVar.t()) {
                    iVar.y(C7.b.REFUSED_STREAM);
                    this.f1560b.Z1(iVar.j());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C1034e f1573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f1574h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f1575i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z8, f fVar, int i8, C1034e c1034e, int i9, boolean z9) {
            super(str, z8);
            this.f1571e = fVar;
            this.f1572f = i8;
            this.f1573g = c1034e;
            this.f1574h = i9;
            this.f1575i = z9;
        }

        @Override // y7.a
        public long f() {
            try {
                boolean zC = this.f1571e.f1533l.c(this.f1572f, this.f1573g, this.f1574h, this.f1575i);
                if (zC) {
                    this.f1571e.B1().i0(this.f1572f, C7.b.CANCEL);
                }
                if (!zC && !this.f1575i) {
                    return -1L;
                }
                synchronized (this.f1571e) {
                    this.f1571e.f1521B.remove(Integer.valueOf(this.f1572f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: C7.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0062f extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f1578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f1579h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0062f(String str, boolean z8, f fVar, int i8, List list, boolean z9) {
            super(str, z8);
            this.f1576e = fVar;
            this.f1577f = i8;
            this.f1578g = list;
            this.f1579h = z9;
        }

        @Override // y7.a
        public long f() {
            boolean zB = this.f1576e.f1533l.b(this.f1577f, this.f1578g, this.f1579h);
            if (zB) {
                try {
                    this.f1576e.B1().i0(this.f1577f, C7.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zB && !this.f1579h) {
                return -1L;
            }
            synchronized (this.f1576e) {
                this.f1576e.f1521B.remove(Integer.valueOf(this.f1577f));
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f1582g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z8, f fVar, int i8, List list) {
            super(str, z8);
            this.f1580e = fVar;
            this.f1581f = i8;
            this.f1582g = list;
        }

        @Override // y7.a
        public long f() {
            if (!this.f1580e.f1533l.a(this.f1581f, this.f1582g)) {
                return -1L;
            }
            try {
                this.f1580e.B1().i0(this.f1581f, C7.b.CANCEL);
                synchronized (this.f1580e) {
                    this.f1580e.f1521B.remove(Integer.valueOf(this.f1581f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C7.b f1585g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z8, f fVar, int i8, C7.b bVar) {
            super(str, z8);
            this.f1583e = fVar;
            this.f1584f = i8;
            this.f1585g = bVar;
        }

        @Override // y7.a
        public long f() {
            this.f1583e.f1533l.d(this.f1584f, this.f1585g);
            synchronized (this.f1583e) {
                this.f1583e.f1521B.remove(Integer.valueOf(this.f1584f));
                G g8 = G.f1419a;
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1586e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z8, f fVar) {
            super(str, z8);
            this.f1586e = fVar;
        }

        @Override // y7.a
        public long f() {
            this.f1586e.j2(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f1588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j8) {
            super(str, false, 2, null);
            this.f1587e = fVar;
            this.f1588f = j8;
        }

        @Override // y7.a
        public long f() {
            boolean z8;
            synchronized (this.f1587e) {
                if (this.f1587e.f1535n < this.f1587e.f1534m) {
                    z8 = true;
                } else {
                    this.f1587e.f1534m++;
                    z8 = false;
                }
            }
            if (z8) {
                this.f1587e.Q0(null);
                return -1L;
            }
            this.f1587e.j2(false, 1, 0);
            return this.f1588f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C7.b f1591g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z8, f fVar, int i8, C7.b bVar) {
            super(str, z8);
            this.f1589e = fVar;
            this.f1590f = i8;
            this.f1591g = bVar;
        }

        @Override // y7.a
        public long f() {
            try {
                this.f1589e.k2(this.f1590f, this.f1591g);
                return -1L;
            } catch (IOException e8) {
                this.f1589e.Q0(e8);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f1592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f1594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z8, f fVar, int i8, long j8) {
            super(str, z8);
            this.f1592e = fVar;
            this.f1593f = i8;
            this.f1594g = j8;
        }

        @Override // y7.a
        public long f() {
            try {
                this.f1592e.B1().r0(this.f1593f, this.f1594g);
                return -1L;
            } catch (IOException e8) {
                this.f1592e.Q0(e8);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f1519D = mVar;
    }

    public f(a builder) {
        t.g(builder, "builder");
        boolean zB = builder.b();
        this.f1522a = zB;
        this.f1523b = builder.d();
        this.f1524c = new LinkedHashMap();
        String strC = builder.c();
        this.f1525d = strC;
        this.f1527f = builder.b() ? 3 : 2;
        y7.e eVarJ = builder.j();
        this.f1529h = eVarJ;
        y7.d dVarI = eVarJ.i();
        this.f1530i = dVarI;
        this.f1531j = eVarJ.i();
        this.f1532k = eVarJ.i();
        this.f1533l = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, 16777216);
        }
        this.f1540s = mVar;
        m mVar2 = f1519D;
        this.f1541t = mVar2;
        this.f1545x = mVar2.c();
        this.f1546y = builder.h();
        this.f1547z = new C7.j(builder.g(), zB);
        this.f1520A = new d(this, new C7.h(builder.i(), zB));
        this.f1521B = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void f2(f fVar, boolean z8, y7.e eVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            eVar = y7.e.f38468i;
        }
        fVar.e2(z8, eVar);
    }

    public final C7.j B1() {
        return this.f1547z;
    }

    public final synchronized boolean C1(long j8) {
        if (this.f1528g) {
            return false;
        }
        return this.f1537p >= this.f1536o || j8 < this.f1539r;
    }

    public final C7.i D1(int i8, List list, boolean z8) throws Throwable {
        Throwable th;
        boolean z9 = !z8;
        synchronized (this.f1547z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f1527f > 1073741823) {
                                try {
                                    d2(C7.b.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                if (this.f1528g) {
                                    throw new C7.a();
                                }
                                int i9 = this.f1527f;
                                this.f1527f = i9 + 2;
                                C7.i iVar = new C7.i(i9, this, z9, false, null);
                                boolean z10 = !z8 || this.f1544w >= this.f1545x || iVar.r() >= iVar.q();
                                if (iVar.u()) {
                                    this.f1524c.put(Integer.valueOf(i9), iVar);
                                }
                                G g8 = G.f1419a;
                                if (i8 == 0) {
                                    this.f1547z.y(z9, i9, list);
                                } else {
                                    if (this.f1522a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f1547z.Y(i8, i9, list);
                                }
                                if (z10) {
                                    this.f1547z.flush();
                                }
                                return iVar;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final C7.i K1(List requestHeaders, boolean z8) {
        t.g(requestHeaders, "requestHeaders");
        return D1(0, requestHeaders, z8);
    }

    public final void M1(int i8, J7.g source, int i9, boolean z8) {
        t.g(source, "source");
        C1034e c1034e = new C1034e();
        long j8 = i9;
        source.S1(j8);
        source.K0(c1034e, j8);
        this.f1531j.i(new e(this.f1525d + '[' + i8 + "] onData", true, this, i8, c1034e, i9, z8), 0L);
    }

    public final void O0(C7.b connectionCode, C7.b streamCode, IOException iOException) {
        int i8;
        Object[] array;
        t.g(connectionCode, "connectionCode");
        t.g(streamCode, "streamCode");
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            d2(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f1524c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f1524c.values().toArray(new C7.i[0]);
                    this.f1524c.clear();
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C7.i[] iVarArr = (C7.i[]) array;
        if (iVarArr != null) {
            for (C7.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f1547z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f1546y.close();
        } catch (IOException unused4) {
        }
        this.f1530i.n();
        this.f1531j.n();
        this.f1532k.n();
    }

    public final void Q0(IOException iOException) {
        C7.b bVar = C7.b.PROTOCOL_ERROR;
        O0(bVar, bVar, iOException);
    }

    public final void R1(int i8, List requestHeaders) throws Throwable {
        Throwable th;
        t.g(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f1521B.contains(Integer.valueOf(i8))) {
                    this.f1521B.add(Integer.valueOf(i8));
                    this.f1531j.i(new g(this.f1525d + '[' + i8 + "] onRequest", true, this, i8, requestHeaders), 0L);
                    return;
                }
                try {
                    l2(i8, C7.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final boolean T0() {
        return this.f1522a;
    }

    public final void U1(int i8, C7.b errorCode) {
        t.g(errorCode, "errorCode");
        this.f1531j.i(new h(this.f1525d + '[' + i8 + "] onReset", true, this, i8, errorCode), 0L);
    }

    public final String V0() {
        return this.f1525d;
    }

    public final boolean X1(int i8) {
        return i8 != 0 && (i8 & 1) == 0;
    }

    public final synchronized C7.i Z1(int i8) {
        C7.i iVar;
        iVar = (C7.i) this.f1524c.remove(Integer.valueOf(i8));
        t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final int a1() {
        return this.f1526e;
    }

    public final void a2() {
        synchronized (this) {
            long j8 = this.f1537p;
            long j9 = this.f1536o;
            if (j8 < j9) {
                return;
            }
            this.f1536o = j9 + 1;
            this.f1539r = System.nanoTime() + ((long) 1000000000);
            G g8 = G.f1419a;
            this.f1530i.i(new i(this.f1525d + " ping", true, this), 0L);
        }
    }

    public final void b2(int i8) {
        this.f1526e = i8;
    }

    public final void c2(m mVar) {
        t.g(mVar, "<set-?>");
        this.f1541t = mVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        O0(C7.b.NO_ERROR, C7.b.CANCEL, null);
    }

    public final void d2(C7.b statusCode) {
        t.g(statusCode, "statusCode");
        synchronized (this.f1547z) {
            H h8 = new H();
            synchronized (this) {
                if (this.f1528g) {
                    return;
                }
                this.f1528g = true;
                int i8 = this.f1526e;
                h8.f28777a = i8;
                G g8 = G.f1419a;
                this.f1547z.v(i8, statusCode, v7.d.f35179a);
            }
        }
    }

    public final void e2(boolean z8, y7.e taskRunner) {
        t.g(taskRunner, "taskRunner");
        if (z8) {
            this.f1547z.c();
            this.f1547z.j0(this.f1540s);
            int iC = this.f1540s.c();
            if (iC != 65535) {
                this.f1547z.r0(0, iC - 65535);
            }
        }
        taskRunner.i().i(new y7.c(this.f1525d, true, this.f1520A), 0L);
    }

    public final void flush() {
        this.f1547z.flush();
    }

    public final c g1() {
        return this.f1523b;
    }

    public final synchronized void g2(long j8) {
        long j9 = this.f1542u + j8;
        this.f1542u = j9;
        long j10 = j9 - this.f1543v;
        if (j10 >= this.f1540s.c() / 2) {
            m2(0, j10);
            this.f1543v += j10;
        }
    }

    public final void h2(int i8, boolean z8, C1034e c1034e, long j8) {
        long j9;
        long j10;
        int iMin;
        long j11;
        if (j8 == 0) {
            this.f1547z.j(z8, i8, c1034e, 0);
            return;
        }
        while (j8 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j9 = this.f1544w;
                            j10 = this.f1545x;
                            if (j9 >= j10) {
                                if (!this.f1524c.containsKey(Integer.valueOf(i8))) {
                                    throw new IOException("stream closed");
                                }
                                t.e(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j8, j10 - j9), this.f1547z.z());
                j11 = iMin;
                this.f1544w += j11;
                G g8 = G.f1419a;
            }
            j8 -= j11;
            this.f1547z.j(z8 && j8 == 0, i8, c1034e, iMin);
        }
    }

    public final int i1() {
        return this.f1527f;
    }

    public final void i2(int i8, boolean z8, List alternating) {
        t.g(alternating, "alternating");
        this.f1547z.y(z8, i8, alternating);
    }

    public final void j2(boolean z8, int i8, int i9) {
        try {
            this.f1547z.A(z8, i8, i9);
        } catch (IOException e8) {
            Q0(e8);
        }
    }

    public final m k1() {
        return this.f1540s;
    }

    public final void k2(int i8, C7.b statusCode) {
        t.g(statusCode, "statusCode");
        this.f1547z.i0(i8, statusCode);
    }

    public final void l2(int i8, C7.b errorCode) {
        t.g(errorCode, "errorCode");
        this.f1530i.i(new k(this.f1525d + '[' + i8 + "] writeSynReset", true, this, i8, errorCode), 0L);
    }

    public final void m2(int i8, long j8) {
        this.f1530i.i(new l(this.f1525d + '[' + i8 + "] windowUpdate", true, this, i8, j8), 0L);
    }

    public final m o1() {
        return this.f1541t;
    }

    public final synchronized C7.i p1(int i8) {
        return (C7.i) this.f1524c.get(Integer.valueOf(i8));
    }

    public final Map q1() {
        return this.f1524c;
    }

    public final long r1() {
        return this.f1545x;
    }

    public final void P1(int i8, List list, boolean z8) {
        t.g(list, Oitvkwcwn.wTnuXmIWaApbJ);
        this.f1531j.i(new C0062f(this.f1525d + '[' + i8 + "] onHeaders", true, this, i8, list, z8), 0L);
    }
}
