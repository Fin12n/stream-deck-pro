package p040e3;

import C6.G;
import C6.m;
import C6.r;
import I6.h;
import I6.l;
import Q6.o;
import Q6.p;
import Z6.v;
import Z6.w;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.t;
import p004a3.AbstractC1712s;
import p004a3.C1705k;
import p004a3.K;
import p004a3.L;
import p004a3.Q;
import p017b7.AbstractC1785g;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.J;
import p017b7.Z;
import p121n3.j;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f20722a;

        public a(InterfaceC1795l interfaceC1795l) {
            this.f20722a = interfaceC1795l;
        }

        @Override // p004a3.L
        public final void onResult(Object obj) {
            if (this.f20722a.y()) {
                return;
            }
            this.f20722a.resumeWith(C6.q.b(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f20723a;

        public b(InterfaceC1795l interfaceC1795l) {
            this.f20723a = interfaceC1795l;
        }

        @Override // p004a3.L
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th) {
            if (this.f20723a.y()) {
                return;
            }
            InterfaceC1795l interfaceC1795l = this.f20723a;
            C6.q.a aVar = C6.q.f1441b;
            t.d(th);
            interfaceC1795l.resumeWith(C6.q.b(r.a(th)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1705k f20725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f20726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f20727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f20728e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1705k c1705k, Context context, String str, String str2, G6.d dVar) {
            super(2, dVar);
            this.f20725b = c1705k;
            this.f20726c = context;
            this.f20727d = str;
            this.f20728e = str2;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new c(this.f20725b, this.f20726c, this.f20727d, this.f20728e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20724a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            for (p058g3.c cVar : this.f20725b.g().values()) {
                Context context = this.f20726c;
                t.d(cVar);
                q.q(context, cVar, this.f20727d, this.f20728e);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1705k f20730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f20731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f20732d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1705k c1705k, Context context, String str, G6.d dVar) {
            super(2, dVar);
            this.f20730b = c1705k;
            this.f20731c = context;
            this.f20732d = str;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new d(this.f20730b, this.f20731c, this.f20732d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            for (K k8 : this.f20730b.j().values()) {
                t.d(k8);
                q.o(k8);
                q.p(this.f20731c, k8, this.f20732d);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f20737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20738f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20737e = obj;
            this.f20738f |= Integer.MIN_VALUE;
            return q.m(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20739a;

        public f(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(int i8, Throwable th, G6.d dVar) {
            return new f(dVar).invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g(((Number) obj).intValue(), (Throwable) obj2, (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20739a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f20743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f20744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f20745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f20746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f20747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f20748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f20749j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f20750k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p pVar, Context context, m mVar, String str, String str2, String str3, String str4, InterfaceC3164l0 interfaceC3164l0, G6.d dVar) {
            super(2, dVar);
            this.f20743d = pVar;
            this.f20744e = context;
            this.f20745f = mVar;
            this.f20746g = str;
            this.f20747h = str2;
            this.f20748i = str3;
            this.f20749j = str4;
            this.f20750k = interfaceC3164l0;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new g(this.f20743d, this.f20744e, this.f20745f, this.f20746g, this.f20747h, this.f20748i, this.f20749j, this.f20750k, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:23|45|25|26|27) */
        /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x005f A[PHI: r0 r4 r14
          0x005f: PHI (r0v7 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005f: PHI (r4v6 java.lang.Throwable) = (r4v7 java.lang.Throwable), (r4v11 java.lang.Throwable) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005f: PHI (r14v14 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r0 r4
          0x0067: PHI (r0v4 int) = (r0v7 int), (r0v8 int) binds: [B:22:0x0065, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0067: PHI (r4v4 java.lang.Throwable) = (r4v6 java.lang.Throwable), (r4v7 java.lang.Throwable) binds: [B:22:0x0065, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i8;
            Throwable th;
            int i9;
            Throwable th2;
            g gVar;
            Object objF = H6.c.f();
            int i10 = this.f20742c;
            if (i10 != 0) {
                try {
                    if (i10 == 1) {
                        i8 = this.f20741b;
                        th = (Throwable) this.f20740a;
                        r.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i9 = this.f20741b;
                        th2 = (Throwable) this.f20740a;
                        try {
                            r.b(obj);
                            gVar = this;
                        } catch (Throwable th3) {
                            th = th3;
                            i8 = i9 + 1;
                            if (!q.s(this.f20750k).A()) {
                                if (i8 != 0) {
                                    p pVar = this.f20743d;
                                    Integer numD = I6.b.d(i8);
                                    t.d(th);
                                    this.f20740a = th;
                                    this.f20741b = i8;
                                    this.f20742c = 1;
                                    obj = pVar.invoke(numD, th, this);
                                    if (obj == objF) {
                                    }
                                } else {
                                    Throwable th4 = th;
                                    i9 = i8;
                                    th2 = th4;
                                    Context context = this.f20744e;
                                    m mVar = this.f20745f;
                                    String strJ = q.j(this.f20746g);
                                    String strJ2 = q.j(this.f20747h);
                                    String strI = q.i(this.f20748i);
                                    String str = this.f20749j;
                                    this.f20740a = th2;
                                    this.f20741b = i9;
                                    this.f20742c = 2;
                                    gVar = this;
                                    obj = q.m(context, mVar, strJ, strJ2, strI, str, gVar);
                                }
                                return objF;
                            }
                            if (!q.s(this.f20750k).s()) {
                                q.s(this.f20750k).e(th);
                            }
                            return G.f1419a;
                        }
                    }
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    int i11 = i9;
                    th = th6;
                    i8 = i11 + 1;
                    if (!q.s(this.f20750k).A()) {
                        if (i8 != 0) {
                            p pVar2 = this.f20743d;
                            Integer numD2 = I6.b.d(i8);
                            t.d(th);
                            this.f20740a = th;
                            this.f20741b = i8;
                            this.f20742c = 1;
                            obj = pVar2.invoke(numD2, th, this);
                            if (obj == objF) {
                            }
                        } else {
                            Throwable th7 = th;
                            i9 = i8;
                            th2 = th7;
                            Context context2 = this.f20744e;
                            m mVar2 = this.f20745f;
                            String strJ3 = q.j(this.f20746g);
                            String strJ4 = q.j(this.f20747h);
                            String strI2 = q.i(this.f20748i);
                            String str2 = this.f20749j;
                            this.f20740a = th2;
                            this.f20741b = i9;
                            this.f20742c = 2;
                            gVar = this;
                            obj = q.m(context2, mVar2, strJ3, strJ4, strI2, str2, gVar);
                        }
                        return objF;
                    }
                    if (!q.s(this.f20750k).s()) {
                        q.s(this.f20750k).e(th);
                    }
                    return G.f1419a;
                }
                q.s(gVar.f20750k).c((C1705k) obj);
                int i12 = i9;
                th = th2;
                i8 = i12;
            } else {
                r.b(obj);
                i8 = 0;
                th = null;
            }
            if (!q.s(this.f20750k).A()) {
                if (i8 != 0) {
                    p pVar3 = this.f20743d;
                    Integer numD3 = I6.b.d(i8);
                    t.d(th);
                    this.f20740a = th;
                    this.f20741b = i8;
                    this.f20742c = 1;
                    obj = pVar3.invoke(numD3, th, this);
                    if (obj == objF) {
                    }
                } else {
                    Throwable th8 = th;
                    i9 = i8;
                    th2 = th8;
                    Context context3 = this.f20744e;
                    m mVar3 = this.f20745f;
                    String strJ5 = q.j(this.f20746g);
                    String strJ6 = q.j(this.f20747h);
                    String strI3 = q.i(this.f20748i);
                    String str3 = this.f20749j;
                    this.f20740a = th2;
                    this.f20741b = i9;
                    this.f20742c = 2;
                    gVar = this;
                    obj = q.m(context3, mVar3, strJ5, strJ6, strI3, str3, gVar);
                }
                return objF;
            }
            if (!q.s(this.f20750k).s() && th != null) {
                q.s(this.f20750k).e(th);
            }
            return G.f1419a;
        }
    }

    public static final Object h(Q q8, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        q8.d(new a(c1797m)).c(new b(c1797m));
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS;
    }

    public static final String i(String str) {
        if (w.b0(str) || v.H(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    public static final String j(String str) {
        if (str == null || w.b0(str)) {
            return null;
        }
        if (w.P(str, '/', false, 2, null)) {
            return str;
        }
        return str + "/";
    }

    public static final Object k(Context context, C1705k c1705k, String str, String str2, G6.d dVar) {
        if (c1705k.g().isEmpty()) {
            return G.f1419a;
        }
        Object objG = AbstractC1785g.g(Z.b(), new c(c1705k, context, str, str2, null), dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public static final Object l(Context context, C1705k c1705k, String str, G6.d dVar) {
        if (!c1705k.r()) {
            return G.f1419a;
        }
        Object objG = AbstractC1785g.g(Z.b(), new d(c1705k, context, str, null), dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(Context context, m mVar, String str, String str2, String str3, String str4, G6.d dVar) {
        e eVar;
        String str5;
        Context context2;
        C1705k c1705k;
        String str6;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f20738f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f20738f = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objH = eVar.f20737e;
        Object objF = H6.c.f();
        int i9 = eVar.f20738f;
        if (i9 == 0) {
            r.b(objH);
            Q qN = n(context, mVar, str4, false);
            if (qN == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + mVar + ".").toString());
            }
            eVar.f20733a = context;
            eVar.f20734b = str;
            eVar.f20735c = str2;
            eVar.f20736d = str3;
            eVar.f20738f = 1;
            objH = h(qN, eVar);
            if (objH != objF) {
            }
            return objF;
        }
        if (i9 == 1) {
            str3 = (String) eVar.f20736d;
            str2 = (String) eVar.f20735c;
            str = (String) eVar.f20734b;
            context = (Context) eVar.f20733a;
            r.b(objH);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1705k c1705k2 = (C1705k) eVar.f20733a;
                r.b(objH);
                return c1705k2;
            }
            c1705k = (C1705k) eVar.f20736d;
            str6 = (String) eVar.f20735c;
            str5 = (String) eVar.f20734b;
            context2 = (Context) eVar.f20733a;
            r.b(objH);
        }
        eVar.f20733a = c1705k;
        eVar.f20734b = null;
        eVar.f20735c = null;
        eVar.f20736d = null;
        eVar.f20738f = 3;
        if (k(context2, c1705k, str5, str6, eVar) != objF) {
            return objF;
        }
        return c1705k;
        C1705k c1705k3 = (C1705k) objH;
        eVar.f20733a = context;
        eVar.f20734b = str2;
        eVar.f20735c = str3;
        eVar.f20736d = c1705k3;
        eVar.f20738f = 2;
        if (l(context, c1705k3, str, eVar) != objF) {
            str5 = str2;
            context2 = context;
            c1705k = c1705k3;
            str6 = str3;
            eVar.f20733a = c1705k;
            eVar.f20734b = null;
            eVar.f20735c = null;
            eVar.f20736d = null;
            eVar.f20738f = 3;
            if (k(context2, c1705k, str5, str6, eVar) != objF) {
                return c1705k;
            }
        }
        return objF;
    }

    public static final Q n(Context context, m mVar, String str, boolean z8) {
        if (mVar instanceof m.a) {
            return t.c(str, "__LottieInternalDefaultCacheKey__") ? AbstractC1712s.s(context, ((m.a) mVar).f()) : AbstractC1712s.t(context, ((m.a) mVar).f(), str);
        }
        throw new m();
    }

    public static final void o(K k8) {
        if (k8.b() != null) {
            return;
        }
        String strC = k8.c();
        t.d(strC);
        if (!v.H(strC, "data:", false, 2, null) || w.Y(strC, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String strSubstring = strC.substring(w.X(strC, ',', 0, false, 6, null) + 1);
            t.f(strSubstring, "substring(...)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            k8.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e8) {
            p121n3.d.d("data URL did not have correct base64 format.", e8);
        }
    }

    public static final void p(Context context, K k8, String str) {
        if (k8.b() != null || str == null) {
            return;
        }
        String strC = k8.c();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + strC);
            t.d(inputStreamOpen);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                k8.g(j.l(BitmapFactory.decodeStream(inputStreamOpen, null, options), k8.f(), k8.d()));
            } catch (IllegalArgumentException e8) {
                p121n3.d.d("Unable to decode image.", e8);
            }
        } catch (IOException e9) {
            p121n3.d.d("Unable to open asset.", e9);
        }
    }

    public static final void q(Context context, p058g3.c cVar, String str, String str2) {
        String str3 = str + cVar.a() + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                t.d(typefaceCreateFromAsset);
                String strC = cVar.c();
                t.f(strC, "getStyle(...)");
                cVar.e(t(typefaceCreateFromAsset, strC));
            } catch (Exception e8) {
                p121n3.d.b("Failed to create " + cVar.a() + " typeface with style=" + cVar.c() + "!", e8);
            }
        } catch (Exception e9) {
            p121n3.d.b("Failed to find typeface in assets with path " + str3 + ".", e9);
        }
    }

    public static final k r(m spec, String str, String str2, String str3, String str4, p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        t.g(spec, "spec");
        interfaceC3163l.f(-1248473602);
        String str5 = (i9 & 2) != 0 ? null : str;
        String str6 = (i9 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i9 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i9 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        p fVar = (i9 & 32) != 0 ? new f(null) : pVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1248473602, i8, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:81)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        interfaceC3163l.f(1388713885);
        int i10 = i8 & 14;
        int i11 = i10 ^ 6;
        boolean z8 = (i11 > 4 && interfaceC3163l.R(spec)) || (i8 & 6) == 4;
        Object objG = interfaceC3163l.g();
        if (z8 || objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(new l(), null, 2, null);
            interfaceC3163l.H(objG);
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(1388714176);
        boolean z9 = ((i11 > 4 && interfaceC3163l.R(spec)) || (i8 & 6) == 4) | ((((57344 & i8) ^ 24576) > 16384 && interfaceC3163l.R(str8)) || (i8 & 24576) == 16384);
        Object objG2 = interfaceC3163l.g();
        if (z9 || objG2 == InterfaceC3163l.f38803a.a()) {
            objG2 = n(context, spec, str8, true);
            interfaceC3163l.H(objG2);
        }
        interfaceC3163l.N();
        p215z0.K.e(spec, str8, new g(fVar, context, spec, str5, str6, str7, str8, interfaceC3164l0, null), interfaceC3163l, i10 | 512 | ((i8 >> 9) & 112));
        l lVarS = s(interfaceC3164l0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return lVarS;
    }

    public static final l s(InterfaceC3164l0 interfaceC3164l0) {
        return (l) interfaceC3164l0.getValue();
    }

    public static final Typeface t(Typeface typeface, String str) {
        int i8 = 0;
        boolean zM = w.M(str, "Italic", false, 2, null);
        boolean zM2 = w.M(str, "Bold", false, 2, null);
        if (zM && zM2) {
            i8 = 3;
        } else if (zM) {
            i8 = 2;
        } else if (zM2) {
            i8 = 1;
        }
        return typeface.getStyle() == i8 ? typeface : Typeface.create(typeface, i8);
    }
}
