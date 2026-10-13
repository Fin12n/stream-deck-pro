package O5;

import C6.C0918g;
import C6.G;
import C6.r;
import D6.z;
import I6.l;
import Q6.o;
import X5.T;
import Z6.v;
import io.ktor.utils.io.InterfaceC2442c;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.F;
import p017b7.J;
import p017b7.K;
import p017b7.Z;
import p115m6.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements O5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f8727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p133o6.b f8728d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8730b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8732d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8730b = obj;
            this.f8732d |= Integer.MIN_VALUE;
            return f.this.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f8733a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8735c;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8733a = obj;
            this.f8735c |= Integer.MIN_VALUE;
            return f.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f8741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8744i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f8745j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8747l;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8745j = obj;
            this.f8747l |= Integer.MIN_VALUE;
            return f.this.m(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f8753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f8754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f8755h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f8756i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f8757j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f8758k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8759l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8760m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8761n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8763p;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8761n = obj;
            this.f8763p |= Integer.MIN_VALUE;
            return f.this.l(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f8764a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p098k7.a invoke() {
            return p098k7.c.b(false, 1, null);
        }
    }

    /* JADX INFO: renamed from: O5.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0244f extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8766b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T f8768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ O5.b f8769e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0244f(T t8, O5.b bVar, G6.d dVar) {
            super(2, dVar);
            this.f8768d = t8;
            this.f8769e = bVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return f.this.new C0244f(this.f8768d, this.f8769e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0244f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        
            if (r3.o(r1, r9, r8) == r0) goto L21;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strK;
            Object objF = H6.c.f();
            int i8 = this.f8766b;
            if (i8 != 0) {
                if (i8 == 1) {
                    strK = (String) this.f8765a;
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
            strK = f.this.k(this.f8768d);
            f fVar = f.this;
            this.f8765a = strK;
            this.f8766b = 1;
            obj = fVar.m(strK, this);
            if (obj != objF) {
            }
            return objF;
            O5.b bVar = this.f8769e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (!t.c(((O5.b) obj2).i(), bVar.i())) {
                    arrayList.add(obj2);
                }
            }
            List listC0 = z.C0(arrayList, this.f8769e);
            f fVar2 = f.this;
            this.f8765a = null;
            this.f8766b = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f8776g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f8778i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f8779j;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f8780a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f8781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2442c f8782c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List f8783d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f f8784e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2442c interfaceC2442c, List list, f fVar, G6.d dVar) {
                super(2, dVar);
                this.f8782c = interfaceC2442c;
                this.f8783d = list;
                this.f8784e = fVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f8782c, this.f8783d, this.f8784e, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0043  */
            /* JADX WARN: Code duplicated, block: B:21:0x0057 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x003d->B:24:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
            
                if (r6.y(r1, r5) == r0) goto L18;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                O5.b bVar;
                f fVar;
                InterfaceC2442c interfaceC2442c;
                Object objF = H6.c.f();
                int i8 = this.f8781b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.f8780a;
                        r.b(obj);
                    }
                    while (it.hasNext()) {
                        bVar = (O5.b) it.next();
                        fVar = this.f8784e;
                        interfaceC2442c = this.f8782c;
                        this.f8780a = it;
                        this.f8781b = 2;
                        if (fVar.n(interfaceC2442c, bVar, this) == objF) {
                            return objF;
                        }
                    }
                    io.ktor.utils.io.k.a(this.f8782c);
                    return G.f1419a;
                }
                r.b(obj);
                InterfaceC2442c interfaceC2442c2 = this.f8782c;
                int size = this.f8783d.size();
                this.f8781b = 1;
                it = this.f8783d.iterator();
                while (it.hasNext()) {
                    bVar = (O5.b) it.next();
                    fVar = this.f8784e;
                    interfaceC2442c = this.f8782c;
                    this.f8780a = it;
                    this.f8781b = 2;
                    if (fVar.n(interfaceC2442c, bVar, this) == objF) {
                        return objF;
                    }
                }
                io.ktor.utils.io.k.a(this.f8782c);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f8785a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p098k7.a invoke() {
                return p098k7.c.b(false, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, List list, G6.d dVar) {
            super(2, dVar);
            this.f8778i = str;
            this.f8779j = list;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            g gVar = f.this.new g(this.f8778i, this.f8779j, dVar);
            gVar.f8776g = obj;
            return gVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v15, types: [k7.a] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [k7.a] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v2, types: [k7.a] */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r9;
            Object objE;
            ?? r8;
            f fVar;
            String str;
            J j8;
            List list;
            InterfaceC2442c interfaceC2442cC;
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2;
            Throwable th;
            Closeable closeable;
            Object objB;
            ?? r10;
            Closeable closeable2;
            Object objF = H6.c.f();
            int i8 = this.f8775f;
            ?? r11 = 1;
            r11 = 1;
            try {
                try {
                    try {
                        try {
                            try {
                                if (i8 == 0) {
                                    r.b(obj);
                                    J j9 = (J) this.f8776g;
                                    p098k7.a aVar = (p098k7.a) f.this.f8728d.b(this.f8778i, b.f8785a);
                                    fVar = f.this;
                                    str = this.f8778i;
                                    List list2 = this.f8779j;
                                    this.f8776g = j9;
                                    this.f8770a = aVar;
                                    this.f8771b = fVar;
                                    this.f8772c = str;
                                    this.f8773d = list2;
                                    this.f8775f = 1;
                                    if (aVar.b(null, this) != objF) {
                                        j8 = j9;
                                        r9 = aVar;
                                        list = list2;
                                    }
                                    return objF;
                                }
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    closeable2 = (Closeable) this.f8770a;
                                    r10 = (p098k7.a) this.f8776g;
                                    try {
                                        r.b(obj);
                                        objB = obj;
                                        closeable2 = closeable2;
                                        r10 = r10;
                                        objE = I6.b.e(((Number) objB).longValue());
                                        closeable2.close();
                                        r8 = r10;
                                        r8.e(null);
                                        return objE;
                                    } catch (Throwable th2) {
                                        Closeable closeable3 = closeable2;
                                        th = th2;
                                        closeable = closeable3;
                                        r11 = r10;
                                        try {
                                            closeable.close();
                                            throw th;
                                        } catch (Throwable th3) {
                                            p205x6.l.a(th, th3);
                                            throw th;
                                        }
                                    }
                                }
                                list = (List) this.f8773d;
                                str = (String) this.f8772c;
                                fVar = (f) this.f8771b;
                                p098k7.a aVar2 = (p098k7.a) this.f8770a;
                                J j10 = (J) this.f8776g;
                                r.b(obj);
                                j8 = j10;
                                r9 = aVar2;
                                objB = io.ktor.utils.io.jvm.javaio.j.b(interfaceC2442cC, bufferedOutputStream2, 0L, this, 2, null);
                                if (objB != objF) {
                                    r10 = r9;
                                    closeable2 = bufferedOutputStream2;
                                    objE = I6.b.e(((Number) objB).longValue());
                                    closeable2.close();
                                    r8 = r10;
                                    r8.e(null);
                                    return objE;
                                }
                                return objF;
                            } catch (Throwable th4) {
                                th = th4;
                                BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                                th = th;
                                closeable = bufferedOutputStream3;
                                r11 = r9;
                                closeable.close();
                                throw th;
                            }
                            AbstractC1789i.d(j8, null, null, new a(interfaceC2442cC, list, fVar, null), 3, null);
                            this.f8776g = r9;
                            this.f8770a = bufferedOutputStream;
                            this.f8771b = null;
                            this.f8772c = null;
                            this.f8773d = null;
                            this.f8774e = 0;
                            this.f8775f = 2;
                            bufferedOutputStream2 = bufferedOutputStream;
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedOutputStream2 = bufferedOutputStream;
                        }
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(fVar.f8726b, str)), 8192);
                    } catch (Exception e8) {
                        e = e8;
                        N5.e.c().b("Exception during saving a cache to a file: " + C0918g.b(e));
                        objE = G.f1419a;
                        r8 = r9;
                    }
                    interfaceC2442cC = io.ktor.utils.io.e.c(false, 1, null);
                } catch (Throwable th6) {
                    th = th6;
                    r9.e(null);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                r9 = r11;
                N5.e.c().b("Exception during saving a cache to a file: " + C0918g.b(e));
                objE = G.f1419a;
                r8 = r9;
                r8.e(null);
                return objE;
            } catch (Throwable th7) {
                th = th7;
                r9 = r11;
                r9.e(null);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f8790e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8792g;

        public h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8790e = obj;
            this.f8792g |= Integer.MIN_VALUE;
            return f.this.n(null, null, this);
        }
    }

    public f(File directory, F dispatcher) {
        t.g(directory, "directory");
        t.g(dispatcher, "dispatcher");
        this.f8726b = directory;
        this.f8727c = dispatcher;
        this.f8728d = new p133o6.b(0, 1, null);
        directory.mkdirs();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // O5.a
    public Object a(T t8, Map map, G6.d dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f8732d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f8732d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objM = aVar.f8730b;
        Object objF = H6.c.f();
        int i9 = aVar.f8732d;
        if (i9 == 0) {
            r.b(objM);
            String strK = k(t8);
            aVar.f8729a = map;
            aVar.f8732d = 1;
            objM = m(strK, aVar);
            if (objM == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) aVar.f8729a;
            r.b(objM);
        }
        for (Object obj : (Set) objM) {
            O5.b bVar = (O5.b) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!t.c(bVar.i().get(str), (String) entry.getValue())) {
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // O5.a
    public Object b(T t8, G6.d dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f8735c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f8735c = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objM = bVar.f8733a;
        Object objF = H6.c.f();
        int i9 = bVar.f8735c;
        if (i9 == 0) {
            r.b(objM);
            String strK = k(t8);
            bVar.f8735c = 1;
            objM = m(strK, bVar);
            if (objM == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objM);
        }
        return z.W0((Iterable) objM);
    }

    @Override // O5.a
    public Object c(T t8, O5.b bVar, G6.d dVar) {
        Object objG = AbstractC1785g.g(this.f8727c, new C0244f(t8, bVar, null), dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public final String k(T t8) {
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(v.s(t8.toString()));
        t.f(bArrDigest, "getInstance(\"MD5\").diges…ng().encodeToByteArray())");
        return p.c(bArrDigest);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x025b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0276 A[PHI: r0 r1 r5 r7
      0x0276: PHI (r0v7 int) = (r0v4 int), (r0v9 int) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r5v8 java.lang.String) = (r5v4 java.lang.String), (r5v11 java.lang.String) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r7v4 io.ktor.utils.io.g) = (r7v2 io.ktor.utils.io.g), (r7v7 io.ktor.utils.io.g) binds: [B:38:0x0272, B:27:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0295  */
    /* JADX WARN: Code duplicated, block: B:49:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x031f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0338  */
    /* JADX WARN: Code duplicated, block: B:64:0x035b A[PHI: r0 r1 r5 r7 r8 r9 r10
      0x035b: PHI (r0v28 p6.c) = (r0v25 p6.c), (r0v30 p6.c) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r1v36 java.lang.Object) = (r1v35 java.lang.Object), (r1v1 java.lang.Object) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r5v30 X5.n) = (r5v26 X5.n), (r5v33 X5.n) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r7v28 X5.w) = (r7v24 X5.w), (r7v31 X5.w) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r8v23 X5.x) = (r8v19 X5.x), (r8v26 X5.x) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r9v16 java.lang.String) = (r9v12 java.lang.String), (r9v19 java.lang.String) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r10v15 io.ktor.utils.io.g) = (r10v13 io.ktor.utils.io.g), (r10v18 io.ktor.utils.io.g) binds: [B:62:0x0357, B:20:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x037b  */
    /* JADX WARN: Code duplicated, block: B:73:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0415  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0307 -> B:23:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0415 -> B:16:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(io.ktor.utils.io.g r24, G6.d r25) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.f.l(io.ktor.utils.io.g, G6.d):java.lang.Object");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0191 */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:51:0x0127, B:59:0x015c, B:49:0x0114), top: B:89:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, k7.a] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0142 -> B:55:0x014b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m(java.lang.String r18, G6.d r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.f.m(java.lang.String, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00df A[PHI: r9 r10
      0x00df: PHI (r9v12 O5.b) = (r9v9 O5.b), (r9v16 O5.b) binds: [B:39:0x018c, B:23:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r10v11 io.ktor.utils.io.c) = (r10v8 io.ktor.utils.io.c), (r10v14 io.ktor.utils.io.c) binds: [B:39:0x018c, B:23:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:38:0x016e A[PHI: r9 r10
      0x016e: PHI (r9v9 O5.b) = (r9v6 O5.b), (r9v11 O5.b) binds: [B:36:0x016a, B:25:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r10v8 io.ktor.utils.io.c) = (r10v5 io.ktor.utils.io.c), (r10v10 io.ktor.utils.io.c) binds: [B:36:0x016a, B:25:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0211  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0211 -> B:45:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x02e4 -> B:69:0x0283). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(io.ktor.utils.io.InterfaceC2442c r9, O5.b r10, G6.d r11) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.f.n(io.ktor.utils.io.c, O5.b, G6.d):java.lang.Object");
    }

    public final Object o(String str, List list, G6.d dVar) {
        return K.f(new g(str, list, null), dVar);
    }

    public /* synthetic */ f(File file, F f8, int i8, AbstractC2633k abstractC2633k) {
        this(file, (i8 & 2) != 0 ? Z.b() : f8);
    }
}
