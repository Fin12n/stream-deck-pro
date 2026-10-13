package p048f2;

import C6.C0918g;
import C6.G;
import C6.r;
import I6.d;
import Q6.o;
import Q6.p;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p098k7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f21764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f21765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f21766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f21767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p098k7.a f21768f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21772d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21774f;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21772d = obj;
            this.f21774f |= Integer.MIN_VALUE;
            return q.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f21778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f21779e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21781g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21779e = obj;
            this.f21781g |= Integer.MIN_VALUE;
            return q.this.d(null, this);
        }
    }

    public q(File file, B serializer, u coordinator, Function0 onClose) {
        t.g(file, "file");
        t.g(serializer, "serializer");
        t.g(coordinator, "coordinator");
        t.g(onClose, "onClose");
        this.f21763a = file;
        this.f21764b = serializer;
        this.f21765c = coordinator;
        this.f21766d = onClose;
        this.f21767e = new AtomicBoolean(false);
        this.f21768f = c.b(false, 1, null);
    }

    private final void f() {
        if (this.f21767e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [f2.q] */
    /* JADX WARN: Type inference failed for: r0v14, types: [f2.q] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [f2.q$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [f2.q] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Q6.p] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p048f2.G
    public Object b(p pVar, G6.d dVar) throws Throwable {
        ?? aVar;
        Throwable th;
        InterfaceC2301d interfaceC2301d;
        ?? r8;
        ?? r9;
        if (dVar instanceof a) {
            a aVar2 = (a) dVar;
            int i8 = aVar2.f21774f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar2.f21774f = i8 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21772d;
        Object objF = H6.c.f();
        int i9 = aVar.f21774f;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = aVar.f21771c;
                interfaceC2301d = (InterfaceC2301d) aVar.f21770b;
                aVar = (q) aVar.f21769a;
                try {
                    r.b(obj);
                    r9 = aVar;
                    r8 = pVar;
                    try {
                        interfaceC2301d.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        p098k7.a.C0628a.c(r9.f21768f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        interfaceC2301d.close();
                    } catch (Throwable th4) {
                        C0918g.a(th, th4);
                    }
                    throw th;
                }
            }
            r.b(obj);
            f();
            boolean zB = p098k7.a.C0628a.b(this.f21768f, null, 1, null);
            try {
                o oVar = new o(this.f21763a, this.f21764b);
                try {
                    Boolean boolA = I6.b.a(zB);
                    aVar.f21769a = this;
                    aVar.f21770b = oVar;
                    aVar.f21771c = zB;
                    aVar.f21774f = 1;
                    Object objInvoke = pVar.invoke(oVar, boolA, aVar);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    obj = objInvoke;
                    r8 = zB;
                    r9 = this;
                    interfaceC2301d = oVar;
                    interfaceC2301d.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        p098k7.a.C0628a.c(r9.f21768f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    pVar = zB;
                    aVar = this;
                    interfaceC2301d = oVar;
                    interfaceC2301d.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                pVar = zB;
                aVar = this;
                if (pVar != 0) {
                    p098k7.a.C0628a.c(aVar.f21768f, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (pVar != 0) {
                p098k7.a.C0628a.c(aVar.f21768f, null, 1, null);
            }
            throw th;
        }
    }

    @Override // p048f2.G
    public u c() {
        return this.f21765c;
    }

    @Override // p048f2.InterfaceC2301d
    public void close() {
        this.f21767e.set(true);
        this.f21766d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, k7.a] */
    @Override // p048f2.G
    public Object d(o oVar, G6.d dVar) throws IOException {
        b bVar;
        File file;
        q qVar;
        p098k7.a aVar;
        r rVar;
        Throwable th;
        InterfaceC2301d interfaceC2301d;
        File file2;
        q qVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f21781g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f21781g = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f21779e;
        Object objF = H6.c.f();
        ?? r8 = bVar.f21781g;
        try {
            try {
                try {
                    try {
                        if (r8 == 0) {
                            r.b(obj);
                            f();
                            g(this.f21763a);
                            p098k7.a aVar2 = this.f21768f;
                            bVar.f21775a = this;
                            bVar.f21776b = oVar;
                            bVar.f21777c = aVar2;
                            bVar.f21781g = 1;
                            if (aVar2.b(null, bVar) != objF) {
                                qVar = this;
                                aVar = aVar2;
                            }
                            return objF;
                        }
                        if (r8 != 1) {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2301d = (InterfaceC2301d) bVar.f21778d;
                            File file3 = (File) bVar.f21777c;
                            aVar = (p098k7.a) bVar.f21776b;
                            qVar2 = (q) bVar.f21775a;
                            try {
                                r.b(obj);
                                file2 = file3;
                                G g8 = G.f1419a;
                                try {
                                    interfaceC2301d.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !n.a(file2, qVar2.f21763a)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + qVar2.f21763a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                G g9 = G.f1419a;
                                aVar.e(null);
                                return G.f1419a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC2301d.close();
                                } catch (Throwable th4) {
                                    C0918g.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        p098k7.a aVar3 = (p098k7.a) bVar.f21777c;
                        o oVar2 = (o) bVar.f21776b;
                        qVar = (q) bVar.f21775a;
                        r.b(obj);
                        aVar = aVar3;
                        oVar = oVar2;
                        bVar.f21775a = qVar;
                        bVar.f21776b = aVar;
                        bVar.f21777c = file;
                        bVar.f21778d = rVar;
                        bVar.f21781g = 2;
                        if (oVar.invoke(rVar, bVar) != objF) {
                            file2 = file;
                            qVar2 = qVar;
                            interfaceC2301d = rVar;
                            G g10 = G.f1419a;
                            interfaceC2301d.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + qVar2.f21763a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            G g11 = G.f1419a;
                            aVar.e(null);
                            return G.f1419a;
                        }
                        return objF;
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC2301d = rVar;
                        interfaceC2301d.close();
                        throw th;
                    }
                    rVar = new r(file, qVar.f21764b);
                } catch (IOException e8) {
                    e = e8;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(qVar.f21763a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                r8.e(null);
                throw th6;
            }
        } catch (IOException e9) {
            e = e9;
            file = objF;
        }
    }

    public final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}
