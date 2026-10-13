package Y3;

import C6.G;
import C6.r;
import D6.C0938s;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f12191i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.elgato.telemetry.datamaster.persistence.a f12193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1815v0 f12197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p098k7.a f12199h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: Y3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0310b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12203d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12205f;

        public C0310b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12203d = obj;
            this.f12205f |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f12206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f12207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, b bVar) {
            super(0);
            this.f12206a = j8;
            this.f12207b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Backing off for " + this.f12206a + "ms (failure count: " + this.f12207b.f12198g + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(0);
            this.f12208a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Flushed " + this.f12208a.size() + " events";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Exception f12210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.f12210b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to send events (attempt " + b.this.f12198g + "): " + this.f12210b.getMessage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12212b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12214d;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12212b = obj;
            this.f12214d |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12216b;

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            g gVar = b.this.new g(dVar);
            gVar.f12216b = obj;
            return gVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r7.d(r6) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            J j8;
            J j9;
            long j10;
            Object objF = H6.c.f();
            int i8 = this.f12215a;
            if (i8 == 0) {
                r.b(obj);
                j8 = (J) this.f12216b;
                if (K.h(j8)) {
                    return G.f1419a;
                }
                j10 = b.this.f12195d;
                this.f12216b = j8;
                this.f12215a = 1;
                if (U.a(j10, this) != objF) {
                    j9 = j8;
                    b bVar = b.this;
                    this.f12216b = j9;
                    this.f12215a = 2;
                }
                return objF;
            }
            if (i8 == 1) {
                j9 = (J) this.f12216b;
                r.b(obj);
                b bVar2 = b.this;
                this.f12216b = j9;
                this.f12215a = 2;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = (J) this.f12216b;
                r.b(obj);
            }
            j8 = j9;
            if (K.h(j8)) {
                return G.f1419a;
            }
            j10 = b.this.f12195d;
            this.f12216b = j8;
            this.f12215a = 1;
            if (U.a(j10, this) != objF) {
                j9 = j8;
                b bVar3 = b.this;
                this.f12216b = j9;
                this.f12215a = 2;
            }
            return objF;
        }
    }

    public b(m transport, com.elgato.telemetry.datamaster.persistence.a telemetryStore, int i8, long j8, boolean z8) {
        t.g(transport, "transport");
        t.g(telemetryStore, "telemetryStore");
        this.f12192a = transport;
        this.f12193b = telemetryStore;
        this.f12194c = i8;
        this.f12195d = j8;
        this.f12196e = z8;
        this.f12199h = p098k7.c.b(false, 1, null);
    }

    public final long c() {
        int i8 = this.f12198g;
        if (i8 == 0) {
            return 0L;
        }
        return Math.min((long) (Math.pow(2.0d, i8) * ((double) 1000)), 300000L);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0 A[Catch: all -> 0x0047, Exception -> 0x004a, PHI: r0 r8 r11
      0x00f0: PHI (r0v16 java.lang.Object) = (r0v19 java.lang.Object), (r0v1 java.lang.Object) binds: [B:51:0x00ed, B:28:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r8v10 ??) = (r8v26 ??), (r8v27 ??) binds: [B:51:0x00ed, B:28:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r11v5 Y3.b) = (r11v6 Y3.b), (r11v13 Y3.b) binds: [B:51:0x00ed, B:28:0x0070] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x004a, blocks: (B:16:0x0042, B:66:0x013e, B:50:0x00dd, B:53:0x00f0, B:55:0x00f8, B:59:0x010a, B:60:0x011b, B:62:0x0121, B:63:0x012f, B:25:0x0061, B:28:0x0070, B:31:0x007f), top: B:74:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8 A[Catch: all -> 0x0047, Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:16:0x0042, B:66:0x013e, B:50:0x00dd, B:53:0x00f0, B:55:0x00f8, B:59:0x010a, B:60:0x011b, B:62:0x0121, B:63:0x012f, B:25:0x0061, B:28:0x0070, B:31:0x007f), top: B:74:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121 A[Catch: all -> 0x0047, Exception -> 0x004a, LOOP:0: B:60:0x011b->B:62:0x0121, LOOP_END, TryCatch #1 {Exception -> 0x004a, blocks: (B:16:0x0042, B:66:0x013e, B:50:0x00dd, B:53:0x00f0, B:55:0x00f8, B:59:0x010a, B:60:0x011b, B:62:0x0121, B:63:0x012f, B:25:0x0061, B:28:0x0070, B:31:0x007f), top: B:74:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        if (p017b7.U.a(r12, r2) == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if (r0.g(r12, r2) == r3) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x013b -> B:66:0x013e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(G6.d dVar) throws Throwable {
        C0310b c0310b;
        b bVar;
        p098k7.a aVar;
        ?? r8;
        ?? r9;
        List list;
        ArrayList arrayList;
        Iterator it;
        ?? r10;
        List list2;
        m mVar;
        if (dVar instanceof C0310b) {
            c0310b = (C0310b) dVar;
            int i8 = c0310b.f12205f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0310b.f12205f = i8 - Integer.MIN_VALUE;
            } else {
                c0310b = new C0310b(dVar);
            }
        } else {
            c0310b = new C0310b(dVar);
        }
        Object objF = c0310b.f12203d;
        Object objF2 = H6.c.f();
        int i9 = c0310b.f12205f;
        ?? r11 = 2;
        ?? r12 = 2;
        try {
            try {
                try {
                    if (i9 == 0) {
                        r.b(objF);
                        p098k7.a aVar2 = this.f12199h;
                        c0310b.f12200a = this;
                        c0310b.f12201b = aVar2;
                        c0310b.f12205f = 1;
                        if (aVar2.b(null, c0310b) != objF2) {
                            aVar = aVar2;
                            bVar = this;
                        }
                        return objF2;
                    }
                    if (i9 == 1) {
                        aVar = (p098k7.a) c0310b.f12201b;
                        bVar = (b) c0310b.f12200a;
                        r.b(objF);
                    } else {
                        if (i9 == 2) {
                            p098k7.a aVar3 = (p098k7.a) c0310b.f12201b;
                            bVar = (b) c0310b.f12200a;
                            r.b(objF);
                            r8 = aVar3;
                            com.elgato.telemetry.datamaster.persistence.a aVar4 = bVar.f12193b;
                            int i10 = bVar.f12194c;
                            c0310b.f12200a = bVar;
                            c0310b.f12201b = r8;
                            c0310b.f12202c = null;
                            c0310b.f12205f = 3;
                            objF = aVar4.f(i10, c0310b);
                            r10 = r8;
                            if (objF != objF2) {
                                list2 = (List) objF;
                                r12 = r10;
                                if (!list2.isEmpty()) {
                                    mVar = bVar.f12192a;
                                    c0310b.f12200a = bVar;
                                    c0310b.f12201b = r10;
                                    c0310b.f12202c = list2;
                                    c0310b.f12205f = 4;
                                    if (mVar.a(list2, c0310b) == objF2) {
                                        list = list2;
                                        r9 = r10;
                                        com.elgato.telemetry.datamaster.persistence.a aVar5 = bVar.f12193b;
                                        arrayList = new ArrayList(C0938s.y(list, 10));
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((k) it.next()).c());
                                        }
                                        c0310b.f12200a = bVar;
                                        c0310b.f12201b = r9;
                                        c0310b.f12202c = list;
                                        c0310b.f12205f = 5;
                                        r11 = r9;
                                    }
                                }
                                G g8 = G.f1419a;
                                r12.e(null);
                                return g8;
                            }
                            return objF2;
                        }
                        if (i9 == 3) {
                            p098k7.a aVar6 = (p098k7.a) c0310b.f12201b;
                            bVar = (b) c0310b.f12200a;
                            r.b(objF);
                            r10 = aVar6;
                            list2 = (List) objF;
                            r12 = r10;
                            if (!list2.isEmpty()) {
                                mVar = bVar.f12192a;
                                c0310b.f12200a = bVar;
                                c0310b.f12201b = r10;
                                c0310b.f12202c = list2;
                                c0310b.f12205f = 4;
                                if (mVar.a(list2, c0310b) == objF2) {
                                    list = list2;
                                    r9 = r10;
                                    com.elgato.telemetry.datamaster.persistence.a aVar7 = bVar.f12193b;
                                    arrayList = new ArrayList(C0938s.y(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((k) it.next()).c());
                                    }
                                    c0310b.f12200a = bVar;
                                    c0310b.f12201b = r9;
                                    c0310b.f12202c = list;
                                    c0310b.f12205f = 5;
                                    r11 = r9;
                                }
                                return objF2;
                            }
                            G g9 = G.f1419a;
                            r12.e(null);
                            return g9;
                        }
                        if (i9 == 4) {
                            list = (List) c0310b.f12202c;
                            p098k7.a aVar8 = (p098k7.a) c0310b.f12201b;
                            bVar = (b) c0310b.f12200a;
                            r.b(objF);
                            r9 = aVar8;
                            com.elgato.telemetry.datamaster.persistence.a aVar9 = bVar.f12193b;
                            arrayList = new ArrayList(C0938s.y(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((k) it.next()).c());
                            }
                            c0310b.f12200a = bVar;
                            c0310b.f12201b = r9;
                            c0310b.f12202c = list;
                            c0310b.f12205f = 5;
                            r11 = r9;
                        } else {
                            if (i9 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = (List) c0310b.f12202c;
                            p098k7.a aVar10 = (p098k7.a) c0310b.f12201b;
                            bVar = (b) c0310b.f12200a;
                            r.b(objF);
                            r11 = aVar10;
                        }
                    }
                    bVar.f12198g = 0;
                    Z2.j.a.f(Z2.j.f12858c, "BatchSender", null, new d(list), 2, null);
                    r8 = r11;
                    com.elgato.telemetry.datamaster.persistence.a aVar11 = bVar.f12193b;
                    int i11 = bVar.f12194c;
                    c0310b.f12200a = bVar;
                    c0310b.f12201b = r8;
                    c0310b.f12202c = null;
                    c0310b.f12205f = 3;
                    objF = aVar11.f(i11, c0310b);
                    r10 = r8;
                    if (objF != objF2) {
                        list2 = (List) objF;
                        r12 = r10;
                        if (!list2.isEmpty()) {
                            mVar = bVar.f12192a;
                            c0310b.f12200a = bVar;
                            c0310b.f12201b = r10;
                            c0310b.f12202c = list2;
                            c0310b.f12205f = 4;
                            if (mVar.a(list2, c0310b) == objF2) {
                                list = list2;
                                r9 = r10;
                                com.elgato.telemetry.datamaster.persistence.a aVar12 = bVar.f12193b;
                                arrayList = new ArrayList(C0938s.y(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((k) it.next()).c());
                                }
                                c0310b.f12200a = bVar;
                                c0310b.f12201b = r9;
                                c0310b.f12202c = list;
                                c0310b.f12205f = 5;
                                r11 = r9;
                            }
                        }
                        G g10 = G.f1419a;
                        r12.e(null);
                        return g10;
                    }
                    return objF2;
                    long jC = bVar.c();
                    if (jC > 0 && bVar.f12198g > 0) {
                        Z2.j.a.f(Z2.j.f12858c, "BatchSender", null, new c(jC, bVar), 2, null);
                        c0310b.f12200a = bVar;
                        c0310b.f12201b = aVar;
                        c0310b.f12205f = 2;
                    }
                    r8 = aVar;
                    com.elgato.telemetry.datamaster.persistence.a aVar13 = bVar.f12193b;
                    int i12 = bVar.f12194c;
                    c0310b.f12200a = bVar;
                    c0310b.f12201b = r8;
                    c0310b.f12202c = null;
                    c0310b.f12205f = 3;
                    objF = aVar13.f(i12, c0310b);
                    r10 = r8;
                    if (objF != objF2) {
                        list2 = (List) objF;
                        r12 = r10;
                        if (!list2.isEmpty()) {
                            mVar = bVar.f12192a;
                            c0310b.f12200a = bVar;
                            c0310b.f12201b = r10;
                            c0310b.f12202c = list2;
                            c0310b.f12205f = 4;
                            if (mVar.a(list2, c0310b) == objF2) {
                                list = list2;
                                r9 = r10;
                                com.elgato.telemetry.datamaster.persistence.a aVar14 = bVar.f12193b;
                                arrayList = new ArrayList(C0938s.y(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((k) it.next()).c());
                                }
                                c0310b.f12200a = bVar;
                                c0310b.f12201b = r9;
                                c0310b.f12202c = list;
                                c0310b.f12205f = 5;
                                r11 = r9;
                            }
                        }
                        G g11 = G.f1419a;
                        r12.e(null);
                        return g11;
                    }
                    return objF2;
                } catch (Exception e8) {
                    e = e8;
                    r11 = aVar;
                    bVar.f12198g++;
                    Z2.j.a.h(Z2.j.f12858c, "BatchSender", null, bVar.new e(e), 2, null);
                    r12 = r11;
                } catch (Throwable th) {
                    th = th;
                    r12 = aVar;
                    r12.e(null);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r9.d(r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r9.d(r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(k kVar, G6.d dVar) {
        f fVar;
        b bVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f12214d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f12214d = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objD = fVar.f12212b;
        Object objF = H6.c.f();
        int i9 = fVar.f12214d;
        if (i9 == 0) {
            r.b(objD);
            com.elgato.telemetry.datamaster.persistence.a aVar = this.f12193b;
            fVar.f12211a = this;
            fVar.f12214d = 1;
            if (aVar.c(kVar, fVar) != objF) {
                bVar = this;
            }
            return objF;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                r.b(objD);
                return G.f1419a;
            }
            if (i9 == 3) {
                bVar = (b) fVar.f12211a;
                r.b(objD);
                if (((Number) objD).intValue() >= bVar.f12194c) {
                    return G.f1419a;
                }
                fVar.f12211a = null;
                fVar.f12214d = 4;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objD);
            }
            return G.f1419a;
        }
        bVar = (b) fVar.f12211a;
        r.b(objD);
        if (bVar.f12196e) {
            fVar.f12211a = null;
            fVar.f12214d = 2;
        } else {
            com.elgato.telemetry.datamaster.persistence.a aVar2 = bVar.f12193b;
            fVar.f12211a = bVar;
            fVar.f12214d = 3;
            objD = aVar2.d(fVar);
            if (objD != objF) {
                if (((Number) objD).intValue() >= bVar.f12194c) {
                    return G.f1419a;
                }
                fVar.f12211a = null;
                fVar.f12214d = 4;
            }
        }
        return objF;
    }

    public final void f(J scope) {
        t.g(scope, "scope");
        if (this.f12196e) {
            return;
        }
        this.f12197f = AbstractC1789i.d(scope, null, null, new g(null), 3, null);
    }

    public /* synthetic */ b(m mVar, com.elgato.telemetry.datamaster.persistence.a aVar, int i8, long j8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(mVar, aVar, (i9 & 4) != 0 ? 50 : i8, (i9 & 8) != 0 ? 30000L : j8, (i9 & 16) != 0 ? false : z8);
    }
}
