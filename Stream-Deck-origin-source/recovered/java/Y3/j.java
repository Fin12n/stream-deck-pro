package Y3;

import C6.G;
import C6.r;
import D6.L;
import D6.M;
import Q6.o;
import android.content.Context;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.U;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12374h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.elgato.telemetry.datamaster.persistence.a f12376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1815v0 f12378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f12379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y3.i f12380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f12381g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements X3.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12390b = "$session_start";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f12391c = M.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Date f12392d;

        public c(long j8) {
            this.f12389a = j8;
            this.f12392d = new Date(j8);
        }

        @Override // X3.k
        public Date a() {
            return this.f12392d;
        }

        @Override // X3.k
        public Map b() {
            return this.f12391c;
        }

        @Override // X3.k
        public String c() {
            return this.f12390b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f12389a == ((c) obj).f12389a;
        }

        public int hashCode() {
            return Long.hashCode(this.f12389a);
        }

        public String toString() {
            return "SessionStartEvent(launchTimeMs=" + this.f12389a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f12393a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to clear background timestamp";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f12396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12397d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12399f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12397d = obj;
            this.f12399f |= Integer.MIN_VALUE;
            return j.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12400a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No active session to end";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f12401a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to persist background timestamp";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12402a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to persist graceful shutdown flag";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f12406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12407e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12409g;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12407e = obj;
            this.f12409g |= Integer.MIN_VALUE;
            return j.this.j(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: Y3.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0314j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0314j f12410a = new C0314j();

        public C0314j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Session already active";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f12411a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Detected unexpected termination from previous session";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12413b;

        public l(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            l lVar = j.this.new l(dVar);
            lVar.f12413b = obj;
            return lVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((l) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (r8.h(r4, r5, r7) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            J j8;
            J j9;
            Object objF = H6.c.f();
            int i8 = this.f12412a;
            if (i8 == 0) {
                r.b(obj);
                j8 = (J) this.f12413b;
                if (K.h(j8)) {
                    return G.f1419a;
                }
                this.f12413b = j8;
                this.f12412a = 1;
                if (U.a(60000L, this) != objF) {
                    j9 = j8;
                    com.elgato.telemetry.datamaster.persistence.a aVar = j.this.f12376b;
                    com.elgato.telemetry.datamaster.persistence.a.b bVar = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    this.f12413b = j9;
                    this.f12412a = 2;
                }
                return objF;
            }
            if (i8 == 1) {
                j9 = (J) this.f12413b;
                r.b(obj);
                com.elgato.telemetry.datamaster.persistence.a aVar2 = j.this.f12376b;
                com.elgato.telemetry.datamaster.persistence.a.b bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                this.f12413b = j9;
                this.f12412a = 2;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = (J) this.f12413b;
                r.b(obj);
            }
            j8 = j9;
            if (K.h(j8)) {
                return G.f1419a;
            }
            this.f12413b = j8;
            this.f12412a = 1;
            if (U.a(60000L, this) != objF) {
                j9 = j8;
                com.elgato.telemetry.datamaster.persistence.a aVar3 = j.this.f12376b;
                com.elgato.telemetry.datamaster.persistence.a.b bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                String strValueOf3 = String.valueOf(System.currentTimeMillis());
                this.f12413b = j9;
                this.f12412a = 2;
            }
            return objF;
        }
    }

    public j(Context context, com.elgato.telemetry.datamaster.persistence.a telemetryStore, o onEvent) {
        t.g(context, "context");
        t.g(telemetryStore, "telemetryStore");
        t.g(onEvent, "onEvent");
        this.f12375a = context;
        this.f12376b = telemetryStore;
        this.f12377c = onEvent;
        this.f12380f = new Y3.i();
    }

    public final long c(Long l8, long j8) {
        if (l8 != null) {
            return W6.n.e(j8 - l8.longValue(), 0L);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r1.invoke(r10, r2) == r3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(G6.d dVar) {
        e eVar;
        j jVar;
        Long lO;
        j jVar2;
        long j8;
        Object objA;
        long j9;
        j jVar3;
        String str;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f12399f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f12399f = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objE = eVar.f12397d;
        Object objF = H6.c.f();
        int i9 = eVar.f12399f;
        if (i9 == 0) {
            r.b(objE);
            if (!this.f12381g) {
                Z2.j.a.f(Z2.j.f12858c, "SessionManager", null, f.f12400a, 2, null);
                return G.f1419a;
            }
            InterfaceC1815v0 interfaceC1815v0 = this.f12378d;
            if (interfaceC1815v0 != null) {
                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
            }
            this.f12378d = null;
            i(true);
            b();
            com.elgato.telemetry.datamaster.persistence.a aVar = this.f12376b;
            com.elgato.telemetry.datamaster.persistence.a.b bVar = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
            eVar.f12394a = this;
            eVar.f12399f = 1;
            if (aVar.h(bVar, com.amazon.a.a.o.b.ag, eVar) != objF) {
                jVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            jVar = (j) eVar.f12394a;
            r.b(objE);
        } else {
            if (i9 == 2) {
                j8 = eVar.f12396c;
                jVar = (j) eVar.f12394a;
                r.b(objE);
                str = (String) objE;
                if (str != null) {
                    j jVar4 = jVar;
                    lO = Z6.u.o(str);
                    jVar2 = jVar4;
                } else {
                    jVar2 = jVar;
                    lO = null;
                }
                jVar2.f12379e = null;
                Y3.i iVar = jVar2.f12380f;
                eVar.f12394a = jVar2;
                eVar.f12395b = lO;
                eVar.f12396c = j8;
                eVar.f12399f = 3;
                objA = iVar.a(eVar);
                if (objA != objF) {
                    j9 = j8;
                    jVar3 = jVar2;
                    objE = objA;
                    Map map = (Map) objE;
                    o oVar = jVar3.f12377c;
                    b bVar2 = new b(j9, false, jVar3.c(lO, j9), map);
                    eVar.f12394a = null;
                    eVar.f12395b = null;
                    eVar.f12399f = 4;
                }
                return objF;
            }
            if (i9 == 3) {
                long j10 = eVar.f12396c;
                lO = (Long) eVar.f12395b;
                jVar3 = (j) eVar.f12394a;
                r.b(objE);
                j9 = j10;
                Map map2 = (Map) objE;
                o oVar2 = jVar3.f12377c;
                b bVar3 = new b(j9, false, jVar3.c(lO, j9), map2);
                eVar.f12394a = null;
                eVar.f12395b = null;
                eVar.f12399f = 4;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objE);
            }
        }
        return G.f1419a;
        jVar.f12381g = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l8 = jVar.f12379e;
        if (l8 == null) {
            com.elgato.telemetry.datamaster.persistence.a aVar2 = jVar.f12376b;
            com.elgato.telemetry.datamaster.persistence.a.b bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
            eVar.f12394a = jVar;
            eVar.f12396c = jCurrentTimeMillis;
            eVar.f12399f = 2;
            objE = aVar2.e(bVar4, eVar);
            if (objE != objF) {
                j8 = jCurrentTimeMillis;
                str = (String) objE;
                if (str != null) {
                    j jVar5 = jVar;
                    lO = Z6.u.o(str);
                    jVar2 = jVar5;
                } else {
                    jVar2 = jVar;
                    lO = null;
                }
                jVar2.f12379e = null;
                Y3.i iVar2 = jVar2.f12380f;
                eVar.f12394a = jVar2;
                eVar.f12395b = lO;
                eVar.f12396c = j8;
                eVar.f12399f = 3;
                objA = iVar2.a(eVar);
                if (objA != objF) {
                    j9 = j8;
                    jVar3 = jVar2;
                    objE = objA;
                    Map map3 = (Map) objE;
                    o oVar3 = jVar3.f12377c;
                    b bVar5 = new b(j9, false, jVar3.c(lO, j9), map3);
                    eVar.f12394a = null;
                    eVar.f12395b = null;
                    eVar.f12399f = 4;
                }
            }
        } else {
            j jVar6 = jVar;
            lO = l8;
            jVar2 = jVar6;
            j8 = jCurrentTimeMillis;
            jVar2.f12379e = null;
            Y3.i iVar3 = jVar2.f12380f;
            eVar.f12394a = jVar2;
            eVar.f12395b = lO;
            eVar.f12396c = j8;
            eVar.f12399f = 3;
            objA = iVar3.a(eVar);
            if (objA != objF) {
                j9 = j8;
                jVar3 = jVar2;
                objE = objA;
                Map map4 = (Map) objE;
                o oVar4 = jVar3.f12377c;
                b bVar6 = new b(j9, false, jVar3.c(lO, j9), map4);
                eVar.f12394a = null;
                eVar.f12395b = null;
                eVar.f12399f = 4;
            }
        }
        return objF;
    }

    public final boolean e() {
        return this.f12381g;
    }

    public final Y3.i f() {
        return this.f12380f;
    }

    public final void h() {
        b();
    }

    public final void i(boolean z8) {
        if (this.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).edit().putBoolean("com.elgato.telemetry.sessionEndedGracefully", z8).commit()) {
            return;
        }
        Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, h.f12402a, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0147  */
    /* JADX WARN: Code duplicated, block: B:46:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186 A[PHI: r4 r9 r11
      0x0186: PHI (r4v15 b7.J) = (r4v3 b7.J), (r4v3 b7.J), (r4v12 b7.J), (r4v17 b7.J) binds: [B:30:0x0102, B:31:0x0104, B:50:0x0184, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r9v9 long) = (r9v3 long), (r9v3 long), (r9v7 long), (r9v10 long) binds: [B:30:0x0102, B:31:0x0104, B:50:0x0184, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r11v13 Y3.j) = (r11v2 Y3.j), (r11v2 Y3.j), (r11v10 Y3.j), (r11v15 Y3.j) binds: [B:30:0x0102, B:31:0x0104, B:50:0x0184, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x019b A[PHI: r4 r9 r11
      0x019b: PHI (r4v18 b7.J) = (r4v15 b7.J), (r4v21 b7.J) binds: [B:52:0x0198, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r9v11 long) = (r9v9 long), (r9v13 long) binds: [B:52:0x0198, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r11v16 Y3.j) = (r11v13 Y3.j), (r11v18 Y3.j) binds: [B:52:0x0198, B:16:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cd A[PHI: r4 r6 r9
      0x01cd: PHI (r4v24 long) = (r4v22 long), (r4v25 long) binds: [B:59:0x01ca, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r6v6 b7.J) = (r6v3 b7.J), (r6v8 b7.J) binds: [B:59:0x01ca, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r9v17 Y3.j) = (r9v14 Y3.j), (r9v19 Y3.j) binds: [B:59:0x01ca, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01e6 A[PHI: r4 r6 r9
      0x01e6: PHI (r4v26 long) = (r4v24 long), (r4v28 long) binds: [B:62:0x01e3, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r6v9 b7.J) = (r6v6 b7.J), (r6v11 b7.J) binds: [B:62:0x01e3, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r9v20 Y3.j) = (r9v17 Y3.j), (r9v23 Y3.j) binds: [B:62:0x01e3, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0204  */
    /* JADX WARN: Code duplicated, block: B:70:0x020a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(long j8, J j9, G6.d dVar) {
        i iVar;
        J j10;
        long j11;
        j jVar;
        String str;
        Long lO;
        Object objE;
        Long l8;
        j jVar2;
        J j12;
        String str2;
        Long lO2;
        o oVar;
        b bVar;
        Y3.i iVar2;
        com.elgato.telemetry.datamaster.persistence.a aVar;
        com.elgato.telemetry.datamaster.persistence.a.b bVar2;
        J j13;
        long j14;
        j jVar3;
        com.elgato.telemetry.datamaster.persistence.a aVar2;
        com.elgato.telemetry.datamaster.persistence.a.b bVar3;
        String strValueOf;
        com.elgato.telemetry.datamaster.persistence.a aVar3;
        com.elgato.telemetry.datamaster.persistence.a.b bVar4;
        String strValueOf2;
        o oVar2;
        c cVar;
        j jVar4;
        J j15;
        InterfaceC1815v0 interfaceC1815v0;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f12409g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f12409g = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objE2 = iVar.f12407e;
        Object objF = H6.c.f();
        switch (iVar.f12409g) {
            case 0:
                r.b(objE2);
                if (this.f12381g) {
                    Z2.j.a.f(Z2.j.f12858c, "SessionManager", null, C0314j.f12410a, 2, null);
                    return G.f1419a;
                }
                com.elgato.telemetry.datamaster.persistence.a aVar4 = this.f12376b;
                com.elgato.telemetry.datamaster.persistence.a.b bVar5 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                iVar.f12403a = this;
                iVar.f12404b = j9;
                iVar.f12406d = j8;
                iVar.f12409g = 1;
                objE2 = aVar4.e(bVar5, iVar);
                if (objE2 != objF) {
                    j10 = j9;
                    j11 = j8;
                    jVar = this;
                    boolean z8 = jVar.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).getBoolean("com.elgato.telemetry.sessionEndedGracefully", true);
                    if (t.c((String) objE2, com.amazon.a.a.o.b.af) || z8) {
                        jVar.b();
                        iVar2 = jVar.f12380f;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 5;
                        if (iVar2.c(iVar) != objF) {
                            jVar.i(false);
                            aVar = jVar.f12376b;
                            bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                            iVar.f12403a = jVar;
                            iVar.f12404b = j10;
                            iVar.f12406d = j11;
                            iVar.f12409g = 6;
                            if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                                j13 = j10;
                                j14 = j11;
                                jVar3 = jVar;
                                aVar2 = jVar3.f12376b;
                                bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                                strValueOf = String.valueOf(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12406d = j14;
                                iVar.f12409g = 7;
                                if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                    aVar3 = jVar3.f12376b;
                                    bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                    strValueOf2 = String.valueOf(j14);
                                    iVar.f12403a = jVar3;
                                    iVar.f12404b = j13;
                                    iVar.f12406d = j14;
                                    iVar.f12409g = 8;
                                    if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                        jVar3.f12381g = true;
                                        jVar3.f12379e = I6.b.e(j14);
                                        oVar2 = jVar3.f12377c;
                                        cVar = new c(j14);
                                        iVar.f12403a = jVar3;
                                        iVar.f12404b = j13;
                                        iVar.f12409g = 9;
                                        if (oVar2.invoke(cVar, iVar) != objF) {
                                            jVar4 = jVar3;
                                            j15 = j13;
                                            interfaceC1815v0 = jVar4.f12378d;
                                            if (interfaceC1815v0 != null) {
                                                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                            }
                                            jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                            return G.f1419a;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        com.elgato.telemetry.datamaster.persistence.a aVar5 = jVar.f12376b;
                        com.elgato.telemetry.datamaster.persistence.a.b bVar6 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 2;
                        objE2 = aVar5.e(bVar6, iVar);
                        if (objE2 != objF) {
                            str = (String) objE2;
                            if (str != null) {
                                lO = Z6.u.o(str);
                            } else {
                                lO = null;
                            }
                            com.elgato.telemetry.datamaster.persistence.a aVar6 = jVar.f12376b;
                            com.elgato.telemetry.datamaster.persistence.a.b bVar7 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                            iVar.f12403a = jVar;
                            iVar.f12404b = j10;
                            iVar.f12405c = lO;
                            iVar.f12406d = j11;
                            iVar.f12409g = 3;
                            objE = aVar6.e(bVar7, iVar);
                            if (objE != objF) {
                                J j16 = j10;
                                l8 = lO;
                                objE2 = objE;
                                jVar2 = jVar;
                                j12 = j16;
                                str2 = (String) objE2;
                                if (str2 != null) {
                                    lO2 = Z6.u.o(str2);
                                } else {
                                    lO2 = null;
                                }
                                long jK = jVar2.k(l8, lO2, j11);
                                Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, k.f12411a, 2, null);
                                oVar = jVar2.f12377c;
                                bVar = new b(jK, true, jVar2.c(l8, jK), null, 8, null);
                                iVar.f12403a = jVar2;
                                iVar.f12404b = j12;
                                iVar.f12405c = null;
                                iVar.f12406d = j11;
                                iVar.f12409g = 4;
                                if (oVar.invoke(bVar, iVar) != objF) {
                                    j10 = j12;
                                    jVar = jVar2;
                                    jVar.b();
                                    iVar2 = jVar.f12380f;
                                    iVar.f12403a = jVar;
                                    iVar.f12404b = j10;
                                    iVar.f12406d = j11;
                                    iVar.f12409g = 5;
                                    if (iVar2.c(iVar) != objF) {
                                        jVar.i(false);
                                        aVar = jVar.f12376b;
                                        bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                                        iVar.f12403a = jVar;
                                        iVar.f12404b = j10;
                                        iVar.f12406d = j11;
                                        iVar.f12409g = 6;
                                        if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                                            j13 = j10;
                                            j14 = j11;
                                            jVar3 = jVar;
                                            aVar2 = jVar3.f12376b;
                                            bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                                            strValueOf = String.valueOf(j14);
                                            iVar.f12403a = jVar3;
                                            iVar.f12404b = j13;
                                            iVar.f12406d = j14;
                                            iVar.f12409g = 7;
                                            if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                                aVar3 = jVar3.f12376b;
                                                bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                                strValueOf2 = String.valueOf(j14);
                                                iVar.f12403a = jVar3;
                                                iVar.f12404b = j13;
                                                iVar.f12406d = j14;
                                                iVar.f12409g = 8;
                                                if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                                    jVar3.f12381g = true;
                                                    jVar3.f12379e = I6.b.e(j14);
                                                    oVar2 = jVar3.f12377c;
                                                    cVar = new c(j14);
                                                    iVar.f12403a = jVar3;
                                                    iVar.f12404b = j13;
                                                    iVar.f12409g = 9;
                                                    if (oVar2.invoke(cVar, iVar) != objF) {
                                                        jVar4 = jVar3;
                                                        j15 = j13;
                                                        interfaceC1815v0 = jVar4.f12378d;
                                                        if (interfaceC1815v0 != null) {
                                                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                                        }
                                                        jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                                        return G.f1419a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objF;
            case 1:
                j11 = iVar.f12406d;
                j10 = (J) iVar.f12404b;
                jVar = (j) iVar.f12403a;
                r.b(objE2);
                boolean z9 = jVar.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).getBoolean("com.elgato.telemetry.sessionEndedGracefully", true);
                if (t.c((String) objE2, com.amazon.a.a.o.b.af)) {
                    jVar.b();
                    iVar2 = jVar.f12380f;
                    iVar.f12403a = jVar;
                    iVar.f12404b = j10;
                    iVar.f12406d = j11;
                    iVar.f12409g = 5;
                    if (iVar2.c(iVar) != objF) {
                        jVar.i(false);
                        aVar = jVar.f12376b;
                        bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 6;
                        if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                            j13 = j10;
                            j14 = j11;
                            jVar3 = jVar;
                            aVar2 = jVar3.f12376b;
                            bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                            strValueOf = String.valueOf(j14);
                            iVar.f12403a = jVar3;
                            iVar.f12404b = j13;
                            iVar.f12406d = j14;
                            iVar.f12409g = 7;
                            if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                aVar3 = jVar3.f12376b;
                                bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                strValueOf2 = String.valueOf(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12406d = j14;
                                iVar.f12409g = 8;
                                if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                    jVar3.f12381g = true;
                                    jVar3.f12379e = I6.b.e(j14);
                                    oVar2 = jVar3.f12377c;
                                    cVar = new c(j14);
                                    iVar.f12403a = jVar3;
                                    iVar.f12404b = j13;
                                    iVar.f12409g = 9;
                                    if (oVar2.invoke(cVar, iVar) != objF) {
                                        jVar4 = jVar3;
                                        j15 = j13;
                                        interfaceC1815v0 = jVar4.f12378d;
                                        if (interfaceC1815v0 != null) {
                                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                        }
                                        jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                        return G.f1419a;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    jVar.b();
                    iVar2 = jVar.f12380f;
                    iVar.f12403a = jVar;
                    iVar.f12404b = j10;
                    iVar.f12406d = j11;
                    iVar.f12409g = 5;
                    if (iVar2.c(iVar) != objF) {
                        jVar.i(false);
                        aVar = jVar.f12376b;
                        bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 6;
                        if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                            j13 = j10;
                            j14 = j11;
                            jVar3 = jVar;
                            aVar2 = jVar3.f12376b;
                            bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                            strValueOf = String.valueOf(j14);
                            iVar.f12403a = jVar3;
                            iVar.f12404b = j13;
                            iVar.f12406d = j14;
                            iVar.f12409g = 7;
                            if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                aVar3 = jVar3.f12376b;
                                bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                strValueOf2 = String.valueOf(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12406d = j14;
                                iVar.f12409g = 8;
                                if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                    jVar3.f12381g = true;
                                    jVar3.f12379e = I6.b.e(j14);
                                    oVar2 = jVar3.f12377c;
                                    cVar = new c(j14);
                                    iVar.f12403a = jVar3;
                                    iVar.f12404b = j13;
                                    iVar.f12409g = 9;
                                    if (oVar2.invoke(cVar, iVar) != objF) {
                                        jVar4 = jVar3;
                                        j15 = j13;
                                        interfaceC1815v0 = jVar4.f12378d;
                                        if (interfaceC1815v0 != null) {
                                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                        }
                                        jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                        return G.f1419a;
                                    }
                                }
                            }
                        }
                    }
                }
                return objF;
            case 2:
                j11 = iVar.f12406d;
                j10 = (J) iVar.f12404b;
                jVar = (j) iVar.f12403a;
                r.b(objE2);
                str = (String) objE2;
                if (str != null) {
                    lO = Z6.u.o(str);
                } else {
                    lO = null;
                }
                com.elgato.telemetry.datamaster.persistence.a aVar7 = jVar.f12376b;
                com.elgato.telemetry.datamaster.persistence.a.b bVar8 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                iVar.f12403a = jVar;
                iVar.f12404b = j10;
                iVar.f12405c = lO;
                iVar.f12406d = j11;
                iVar.f12409g = 3;
                objE = aVar7.e(bVar8, iVar);
                if (objE != objF) {
                    J j17 = j10;
                    l8 = lO;
                    objE2 = objE;
                    jVar2 = jVar;
                    j12 = j17;
                    str2 = (String) objE2;
                    if (str2 != null) {
                        lO2 = Z6.u.o(str2);
                    } else {
                        lO2 = null;
                    }
                    long jK2 = jVar2.k(l8, lO2, j11);
                    Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, k.f12411a, 2, null);
                    oVar = jVar2.f12377c;
                    bVar = new b(jK2, true, jVar2.c(l8, jK2), null, 8, null);
                    iVar.f12403a = jVar2;
                    iVar.f12404b = j12;
                    iVar.f12405c = null;
                    iVar.f12406d = j11;
                    iVar.f12409g = 4;
                    if (oVar.invoke(bVar, iVar) != objF) {
                        j10 = j12;
                        jVar = jVar2;
                        jVar.b();
                        iVar2 = jVar.f12380f;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 5;
                        if (iVar2.c(iVar) != objF) {
                            jVar.i(false);
                            aVar = jVar.f12376b;
                            bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                            iVar.f12403a = jVar;
                            iVar.f12404b = j10;
                            iVar.f12406d = j11;
                            iVar.f12409g = 6;
                            if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                                j13 = j10;
                                j14 = j11;
                                jVar3 = jVar;
                                aVar2 = jVar3.f12376b;
                                bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                                strValueOf = String.valueOf(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12406d = j14;
                                iVar.f12409g = 7;
                                if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                    aVar3 = jVar3.f12376b;
                                    bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                    strValueOf2 = String.valueOf(j14);
                                    iVar.f12403a = jVar3;
                                    iVar.f12404b = j13;
                                    iVar.f12406d = j14;
                                    iVar.f12409g = 8;
                                    if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                        jVar3.f12381g = true;
                                        jVar3.f12379e = I6.b.e(j14);
                                        oVar2 = jVar3.f12377c;
                                        cVar = new c(j14);
                                        iVar.f12403a = jVar3;
                                        iVar.f12404b = j13;
                                        iVar.f12409g = 9;
                                        if (oVar2.invoke(cVar, iVar) != objF) {
                                            jVar4 = jVar3;
                                            j15 = j13;
                                            interfaceC1815v0 = jVar4.f12378d;
                                            if (interfaceC1815v0 != null) {
                                                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                            }
                                            jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                            return G.f1419a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objF;
            case 3:
                j11 = iVar.f12406d;
                l8 = (Long) iVar.f12405c;
                j12 = (J) iVar.f12404b;
                jVar2 = (j) iVar.f12403a;
                r.b(objE2);
                str2 = (String) objE2;
                if (str2 != null) {
                    lO2 = Z6.u.o(str2);
                } else {
                    lO2 = null;
                }
                long jK3 = jVar2.k(l8, lO2, j11);
                Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, k.f12411a, 2, null);
                oVar = jVar2.f12377c;
                bVar = new b(jK3, true, jVar2.c(l8, jK3), null, 8, null);
                iVar.f12403a = jVar2;
                iVar.f12404b = j12;
                iVar.f12405c = null;
                iVar.f12406d = j11;
                iVar.f12409g = 4;
                if (oVar.invoke(bVar, iVar) != objF) {
                    j10 = j12;
                    jVar = jVar2;
                    jVar.b();
                    iVar2 = jVar.f12380f;
                    iVar.f12403a = jVar;
                    iVar.f12404b = j10;
                    iVar.f12406d = j11;
                    iVar.f12409g = 5;
                    if (iVar2.c(iVar) != objF) {
                        jVar.i(false);
                        aVar = jVar.f12376b;
                        bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                        iVar.f12403a = jVar;
                        iVar.f12404b = j10;
                        iVar.f12406d = j11;
                        iVar.f12409g = 6;
                        if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                            j13 = j10;
                            j14 = j11;
                            jVar3 = jVar;
                            aVar2 = jVar3.f12376b;
                            bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                            strValueOf = String.valueOf(j14);
                            iVar.f12403a = jVar3;
                            iVar.f12404b = j13;
                            iVar.f12406d = j14;
                            iVar.f12409g = 7;
                            if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                                aVar3 = jVar3.f12376b;
                                bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                                strValueOf2 = String.valueOf(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12406d = j14;
                                iVar.f12409g = 8;
                                if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                    jVar3.f12381g = true;
                                    jVar3.f12379e = I6.b.e(j14);
                                    oVar2 = jVar3.f12377c;
                                    cVar = new c(j14);
                                    iVar.f12403a = jVar3;
                                    iVar.f12404b = j13;
                                    iVar.f12409g = 9;
                                    if (oVar2.invoke(cVar, iVar) != objF) {
                                        jVar4 = jVar3;
                                        j15 = j13;
                                        interfaceC1815v0 = jVar4.f12378d;
                                        if (interfaceC1815v0 != null) {
                                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                        }
                                        jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                        return G.f1419a;
                                    }
                                }
                            }
                        }
                    }
                }
                return objF;
            case 4:
                j11 = iVar.f12406d;
                j10 = (J) iVar.f12404b;
                jVar = (j) iVar.f12403a;
                r.b(objE2);
                jVar.b();
                iVar2 = jVar.f12380f;
                iVar.f12403a = jVar;
                iVar.f12404b = j10;
                iVar.f12406d = j11;
                iVar.f12409g = 5;
                if (iVar2.c(iVar) != objF) {
                    jVar.i(false);
                    aVar = jVar.f12376b;
                    bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                    iVar.f12403a = jVar;
                    iVar.f12404b = j10;
                    iVar.f12406d = j11;
                    iVar.f12409g = 6;
                    if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                        j13 = j10;
                        j14 = j11;
                        jVar3 = jVar;
                        aVar2 = jVar3.f12376b;
                        bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                        strValueOf = String.valueOf(j14);
                        iVar.f12403a = jVar3;
                        iVar.f12404b = j13;
                        iVar.f12406d = j14;
                        iVar.f12409g = 7;
                        if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                            aVar3 = jVar3.f12376b;
                            bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                            strValueOf2 = String.valueOf(j14);
                            iVar.f12403a = jVar3;
                            iVar.f12404b = j13;
                            iVar.f12406d = j14;
                            iVar.f12409g = 8;
                            if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                                jVar3.f12381g = true;
                                jVar3.f12379e = I6.b.e(j14);
                                oVar2 = jVar3.f12377c;
                                cVar = new c(j14);
                                iVar.f12403a = jVar3;
                                iVar.f12404b = j13;
                                iVar.f12409g = 9;
                                if (oVar2.invoke(cVar, iVar) != objF) {
                                    jVar4 = jVar3;
                                    j15 = j13;
                                    interfaceC1815v0 = jVar4.f12378d;
                                    if (interfaceC1815v0 != null) {
                                        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                    }
                                    jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                    return G.f1419a;
                                }
                            }
                        }
                    }
                }
                return objF;
            case 5:
                j11 = iVar.f12406d;
                j10 = (J) iVar.f12404b;
                jVar = (j) iVar.f12403a;
                r.b(objE2);
                jVar.i(false);
                aVar = jVar.f12376b;
                bVar2 = com.elgato.telemetry.datamaster.persistence.a.b.SessionActive;
                iVar.f12403a = jVar;
                iVar.f12404b = j10;
                iVar.f12406d = j11;
                iVar.f12409g = 6;
                if (aVar.h(bVar2, com.amazon.a.a.o.b.af, iVar) != objF) {
                    j13 = j10;
                    j14 = j11;
                    jVar3 = jVar;
                    aVar2 = jVar3.f12376b;
                    bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                    strValueOf = String.valueOf(j14);
                    iVar.f12403a = jVar3;
                    iVar.f12404b = j13;
                    iVar.f12406d = j14;
                    iVar.f12409g = 7;
                    if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                        aVar3 = jVar3.f12376b;
                        bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                        strValueOf2 = String.valueOf(j14);
                        iVar.f12403a = jVar3;
                        iVar.f12404b = j13;
                        iVar.f12406d = j14;
                        iVar.f12409g = 8;
                        if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                            jVar3.f12381g = true;
                            jVar3.f12379e = I6.b.e(j14);
                            oVar2 = jVar3.f12377c;
                            cVar = new c(j14);
                            iVar.f12403a = jVar3;
                            iVar.f12404b = j13;
                            iVar.f12409g = 9;
                            if (oVar2.invoke(cVar, iVar) != objF) {
                                jVar4 = jVar3;
                                j15 = j13;
                                interfaceC1815v0 = jVar4.f12378d;
                                if (interfaceC1815v0 != null) {
                                    InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                }
                                jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                                return G.f1419a;
                            }
                        }
                    }
                }
                return objF;
            case 6:
                j14 = iVar.f12406d;
                j13 = (J) iVar.f12404b;
                jVar3 = (j) iVar.f12403a;
                r.b(objE2);
                aVar2 = jVar3.f12376b;
                bVar3 = com.elgato.telemetry.datamaster.persistence.a.b.SessionStartTime;
                strValueOf = String.valueOf(j14);
                iVar.f12403a = jVar3;
                iVar.f12404b = j13;
                iVar.f12406d = j14;
                iVar.f12409g = 7;
                if (aVar2.h(bVar3, strValueOf, iVar) != objF) {
                    aVar3 = jVar3.f12376b;
                    bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                    strValueOf2 = String.valueOf(j14);
                    iVar.f12403a = jVar3;
                    iVar.f12404b = j13;
                    iVar.f12406d = j14;
                    iVar.f12409g = 8;
                    if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                        jVar3.f12381g = true;
                        jVar3.f12379e = I6.b.e(j14);
                        oVar2 = jVar3.f12377c;
                        cVar = new c(j14);
                        iVar.f12403a = jVar3;
                        iVar.f12404b = j13;
                        iVar.f12409g = 9;
                        if (oVar2.invoke(cVar, iVar) != objF) {
                            jVar4 = jVar3;
                            j15 = j13;
                            interfaceC1815v0 = jVar4.f12378d;
                            if (interfaceC1815v0 != null) {
                                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                            }
                            jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                            return G.f1419a;
                        }
                    }
                }
                return objF;
            case 7:
                j14 = iVar.f12406d;
                j13 = (J) iVar.f12404b;
                jVar3 = (j) iVar.f12403a;
                r.b(objE2);
                aVar3 = jVar3.f12376b;
                bVar4 = com.elgato.telemetry.datamaster.persistence.a.b.LastHeartbeat;
                strValueOf2 = String.valueOf(j14);
                iVar.f12403a = jVar3;
                iVar.f12404b = j13;
                iVar.f12406d = j14;
                iVar.f12409g = 8;
                if (aVar3.h(bVar4, strValueOf2, iVar) != objF) {
                    jVar3.f12381g = true;
                    jVar3.f12379e = I6.b.e(j14);
                    oVar2 = jVar3.f12377c;
                    cVar = new c(j14);
                    iVar.f12403a = jVar3;
                    iVar.f12404b = j13;
                    iVar.f12409g = 9;
                    if (oVar2.invoke(cVar, iVar) != objF) {
                        jVar4 = jVar3;
                        j15 = j13;
                        interfaceC1815v0 = jVar4.f12378d;
                        if (interfaceC1815v0 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                        }
                        jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                        return G.f1419a;
                    }
                }
                return objF;
            case 8:
                j14 = iVar.f12406d;
                j13 = (J) iVar.f12404b;
                jVar3 = (j) iVar.f12403a;
                r.b(objE2);
                jVar3.f12381g = true;
                jVar3.f12379e = I6.b.e(j14);
                oVar2 = jVar3.f12377c;
                cVar = new c(j14);
                iVar.f12403a = jVar3;
                iVar.f12404b = j13;
                iVar.f12409g = 9;
                if (oVar2.invoke(cVar, iVar) != objF) {
                    jVar4 = jVar3;
                    j15 = j13;
                    interfaceC1815v0 = jVar4.f12378d;
                    if (interfaceC1815v0 != null) {
                        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                    }
                    jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                    return G.f1419a;
                }
                return objF;
            case 9:
                J j18 = (J) iVar.f12404b;
                jVar4 = (j) iVar.f12403a;
                r.b(objE2);
                j15 = j18;
                interfaceC1815v0 = jVar4.f12378d;
                if (interfaceC1815v0 != null) {
                    InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                }
                jVar4.f12378d = AbstractC1789i.d(j15, null, null, jVar4.new l(null), 3, null);
                return G.f1419a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    public final long k(Long l8, Long l9, long j8) {
        Long lValueOf;
        Long lValueOf2 = Long.valueOf(this.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).getLong("com.elgato.telemetry.backgroundedAt", -1L));
        Long l10 = null;
        if (lValueOf2.longValue() == -1) {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            long jLongValue = lValueOf2.longValue();
            if (l8 != null && jLongValue < l8.longValue()) {
                lValueOf2 = null;
            }
        } else {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            lValueOf = Long.valueOf(lValueOf2.longValue() + 60000);
            if (lValueOf.longValue() > j8) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        if (l9 != null) {
            long jLongValue2 = l9.longValue();
            if (l8 != null && jLongValue2 < l8.longValue()) {
                l9 = null;
            }
            l10 = l9;
        }
        return l10 != null ? l10.longValue() : j8;
    }

    public final void b() {
        if (this.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).edit().remove(uYOhHhTXuF.wKhgBv).commit()) {
            return;
        }
        Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, d.f12393a, 2, null);
    }

    public final void g(long j8) {
        if (this.f12375a.getSharedPreferences("com.elgato.telemetry.session", 0).edit().putLong(QhsKALGiniuQ.kNiErYieiHPl, j8).commit()) {
            return;
        }
        Z2.j.a.h(Z2.j.f12858c, "SessionManager", null, g.f12401a, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements X3.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f12382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f12385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f12386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map f12387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Date f12388g;

        public b(long j8, boolean z8, long j9, Map<String, ? extends X3.i> sessionAttributes) {
            t.g(sessionAttributes, "sessionAttributes");
            this.f12382a = j8;
            this.f12383b = z8;
            this.f12384c = j9;
            this.f12385d = sessionAttributes;
            this.f12386e = "$session_end";
            Map mapC = L.c();
            X3.i.b bVar = X3.i.Companion;
            mapC.put("was_unexpected", bVar.a(z8));
            mapC.put("session_duration_ms", bVar.f(j9));
            mapC.putAll(sessionAttributes);
            this.f12387f = L.b(mapC);
            this.f12388g = new Date(j8);
        }

        @Override // X3.k
        public Date a() {
            return this.f12388g;
        }

        @Override // X3.k
        public Map b() {
            return this.f12387f;
        }

        @Override // X3.k
        public String c() {
            return this.f12386e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12382a == bVar.f12382a && this.f12383b == bVar.f12383b && this.f12384c == bVar.f12384c && t.c(this.f12385d, bVar.f12385d);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f12382a) * 31) + Boolean.hashCode(this.f12383b)) * 31) + Long.hashCode(this.f12384c)) * 31) + this.f12385d.hashCode();
        }

        public String toString() {
            return "SessionEndEvent(timestampMs=" + this.f12382a + ", wasUnexpected=" + this.f12383b + ", sessionDurationMs=" + this.f12384c + ", sessionAttributes=" + this.f12385d + ")";
        }

        public /* synthetic */ b(long j8, boolean z8, long j9, Map map, int i8, AbstractC2633k abstractC2633k) {
            this(j8, z8, j9, (i8 & 8) != 0 ? M.g() : map);
        }
    }
}
