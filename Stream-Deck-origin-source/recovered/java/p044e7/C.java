package p044e7;

import C6.G;
import C6.r;
import G6.g;
import I6.h;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1801o;
import p017b7.AbstractC1823z0;
import p017b7.C1797m;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1815v0;
import p035d7.d;
import p053f7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C extends p053f7.b implements w, InterfaceC2260f, q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f20899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f20900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20904l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC1776b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f20905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f20907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final G6.d f20908d;

        public a(C c8, long j8, Object obj, G6.d<? super G> dVar) {
            this.f20905a = c8;
            this.f20906b = j8;
            this.f20907c = obj;
            this.f20908d = dVar;
        }

        @Override // p017b7.InterfaceC1776b0
        public void d() {
            this.f20905a.y(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20909a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20909a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f20914e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20916g;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20914e = obj;
            this.f20916g |= Integer.MIN_VALUE;
            return C.A(C.this, null, this);
        }
    }

    public C(int i8, int i9, d dVar) {
        this.f20897e = i8;
        this.f20898f = i9;
        this.f20899g = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((p044e7.Q) r9).a(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object A(C c8, InterfaceC2261g interfaceC2261g, G6.d dVar) throws Throwable {
        c cVar;
        C c9;
        Throwable th;
        E e8;
        InterfaceC2261g interfaceC2261g2;
        InterfaceC1815v0 interfaceC1815v0;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f20916g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f20916g = i8 - Integer.MIN_VALUE;
            } else {
                cVar = c8.new c(dVar);
            }
        } else {
            cVar = c8.new c(dVar);
        }
        Object obj = cVar.f20914e;
        Object objF = H6.c.f();
        int i9 = cVar.f20916g;
        if (i9 != 0) {
            if (i9 == 1) {
                e8 = (E) cVar.f20912c;
                InterfaceC2261g interfaceC2261g3 = (InterfaceC2261g) cVar.f20911b;
                C c10 = (C) cVar.f20910a;
                try {
                    r.b(obj);
                    interfaceC2261g2 = interfaceC2261g3;
                    c8 = c10;
                    try {
                        interfaceC1815v0 = (InterfaceC1815v0) cVar.getContext().A(InterfaceC1815v0.f15985O);
                    } catch (Throwable th2) {
                        c9 = c8;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c9 = c10;
                }
            } else {
                if (i9 != 2 && i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1815v0 interfaceC1815v1 = (InterfaceC1815v0) cVar.f20913d;
                e8 = (E) cVar.f20912c;
                InterfaceC2261g interfaceC2261g4 = (InterfaceC2261g) cVar.f20911b;
                c9 = (C) cVar.f20910a;
                try {
                    r.b(obj);
                    interfaceC2261g2 = interfaceC2261g4;
                    interfaceC1815v0 = interfaceC1815v1;
                    c8 = c9;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            c9.k(e8);
            throw th;
        }
        r.b(obj);
        E e9 = (E) c8.h();
        try {
            if (interfaceC2261g instanceof Q) {
                cVar.f20910a = c8;
                cVar.f20911b = interfaceC2261g;
                cVar.f20912c = e9;
                cVar.f20916g = 1;
            }
            interfaceC2261g2 = interfaceC2261g;
            e8 = e9;
            interfaceC1815v0 = (InterfaceC1815v0) cVar.getContext().A(InterfaceC1815v0.f15985O);
        } catch (Throwable th5) {
            c9 = c8;
            th = th5;
            e8 = e9;
        }
        while (true) {
            Object objU = c8.U(e8);
            if (objU == D.f20917a) {
                cVar.f20910a = c8;
                cVar.f20911b = interfaceC2261g2;
                cVar.f20912c = e8;
                cVar.f20913d = interfaceC1815v0;
                cVar.f20916g = 2;
                if (c8.x(e8, cVar) == objF) {
                    break;
                }
            } else {
                if (interfaceC1815v0 != null) {
                    AbstractC1823z0.m(interfaceC1815v0);
                }
                cVar.f20910a = c8;
                cVar.f20911b = interfaceC2261g2;
                cVar.f20912c = e8;
                cVar.f20913d = interfaceC1815v0;
                cVar.f20916g = 3;
                if (interfaceC2261g2.emit(objU, cVar) == objF) {
                    break;
                }
            }
        }
        return objF;
    }

    public static /* synthetic */ Object F(C c8, Object obj, G6.d dVar) throws Throwable {
        if (c8.d(obj)) {
            return G.f1419a;
        }
        Object objG = c8.G(obj, dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public final void B(long j8) {
        p053f7.d[] dVarArr;
        if (this.f22269b != 0 && (dVarArr = this.f22268a) != null) {
            for (p053f7.d dVar : dVarArr) {
                if (dVar != null) {
                    E e8 = (E) dVar;
                    long j9 = e8.f20918a;
                    if (j9 >= 0 && j9 < j8) {
                        e8.f20918a = j8;
                    }
                }
            }
        }
        this.f20902j = j8;
    }

    @Override // p053f7.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public E i() {
        return new E();
    }

    @Override // p053f7.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public E[] j(int i8) {
        return new E[i8];
    }

    public final void E() {
        Object[] objArr = this.f20900h;
        t.d(objArr);
        D.g(objArr, K(), null);
        this.f20903k--;
        long jK = K() + 1;
        if (this.f20901i < jK) {
            this.f20901i = jK;
        }
        if (this.f20902j < jK) {
            B(jK);
        }
    }

    public final Object G(Object obj, G6.d dVar) throws Throwable {
        Throwable th;
        G6.d[] dVarArrI;
        a aVar;
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        G6.d[] dVarArrI2 = p053f7.c.f22272a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        C6.q.a aVar2 = C6.q.f1441b;
                        c1797m.resumeWith(C6.q.b(G.f1419a));
                        dVarArrI = I(dVarArrI2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), obj, c1797m);
                        H(aVar);
                        this.f20904l++;
                        if (this.f20898f == 0) {
                            dVarArrI2 = I(dVarArrI2);
                        }
                        dVarArrI = dVarArrI2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC1801o.a(c1797m, aVar);
                }
                for (G6.d dVar2 : dVarArrI) {
                    if (dVar2 != null) {
                        C6.q.a aVar3 = C6.q.f1441b;
                        dVar2.resumeWith(C6.q.b(G.f1419a));
                    }
                }
                Object objS = c1797m.s();
                if (objS == H6.c.f()) {
                    h.c(dVar);
                }
                return objS == H6.c.f() ? objS : G.f1419a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f20900h;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        D.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [G6.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final G6.d[] I(G6.d[] dVarArr) {
        p053f7.d[] dVarArr2;
        E e8;
        G6.d dVar;
        int length = dVarArr.length;
        if (this.f22269b != 0 && (dVarArr2 = this.f22268a) != null) {
            int length2 = dVarArr2.length;
            int i8 = 0;
            while (i8 < length2) {
                p053f7.d dVar2 = dVarArr2[i8];
                if (dVar2 == null || (dVar = (e8 = (E) dVar2).f20919b) == null || T(e8) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        t.f(objArrCopyOf, "copyOf(...)");
                        dVarArr = objArrCopyOf;
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((G6.d[]) dVarArr)[length] = dVar;
                    e8.f20919b = null;
                    length++;
                }
                i8++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (G6.d[]) dVarArr;
    }

    public final long J() {
        return K() + ((long) this.f20903k);
    }

    public final long K() {
        return Math.min(this.f20902j, this.f20901i);
    }

    public final Object L() {
        Object[] objArr = this.f20900h;
        t.d(objArr);
        return D.f(objArr, (this.f20901i + ((long) O())) - 1);
    }

    public final Object M(long j8) {
        Object[] objArr = this.f20900h;
        t.d(objArr);
        Object objF = D.f(objArr, j8);
        return objF instanceof a ? ((a) objF).f20907c : objF;
    }

    public final long N() {
        return K() + ((long) this.f20903k) + ((long) this.f20904l);
    }

    public final int O() {
        return (int) ((K() + ((long) this.f20903k)) - this.f20901i);
    }

    public final int P() {
        return this.f20903k + this.f20904l;
    }

    public final Object[] Q(Object[] objArr, int i8, int i9) {
        if (i9 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i9];
        this.f20900h = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i10 = 0; i10 < i8; i10++) {
                long j8 = ((long) i10) + jK;
                D.g(objArr2, j8, D.f(objArr, j8));
            }
        }
        return objArr2;
    }

    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f20903k >= this.f20898f && this.f20902j <= this.f20901i) {
            int i8 = b.f20909a[this.f20899g.ordinal()];
            if (i8 == 1) {
                return false;
            }
            if (i8 == 2) {
                return true;
            }
        }
        H(obj);
        int i9 = this.f20903k + 1;
        this.f20903k = i9;
        if (i9 > this.f20898f) {
            E();
        }
        if (O() > this.f20897e) {
            V(this.f20901i + 1, this.f20902j, J(), N());
        }
        return true;
    }

    public final boolean S(Object obj) {
        if (this.f20897e == 0) {
            return true;
        }
        H(obj);
        int i8 = this.f20903k + 1;
        this.f20903k = i8;
        if (i8 > this.f20897e) {
            E();
        }
        this.f20902j = K() + ((long) this.f20903k);
        return true;
    }

    public final long T(E e8) {
        long j8 = e8.f20918a;
        if (j8 >= J() && (this.f20898f > 0 || j8 > K() || this.f20904l == 0)) {
            return -1L;
        }
        return j8;
    }

    public final Object U(E e8) {
        Object obj;
        G6.d[] dVarArrW = p053f7.c.f22272a;
        synchronized (this) {
            try {
                long jT = T(e8);
                if (jT < 0) {
                    obj = D.f20917a;
                } else {
                    long j8 = e8.f20918a;
                    Object objM = M(jT);
                    e8.f20918a = jT + 1;
                    dVarArrW = W(j8);
                    obj = objM;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (G6.d dVar : dVarArrW) {
            if (dVar != null) {
                C6.q.a aVar = C6.q.f1441b;
                dVar.resumeWith(C6.q.b(G.f1419a));
            }
        }
        return obj;
    }

    public final void V(long j8, long j9, long j10, long j11) {
        long jMin = Math.min(j9, j8);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f20900h;
            t.d(objArr);
            D.g(objArr, jK, null);
        }
        this.f20901i = j8;
        this.f20902j = j9;
        this.f20903k = (int) (j10 - jMin);
        this.f20904l = (int) (j11 - j10);
    }

    public final G6.d[] W(long j8) {
        long j9;
        long j10;
        long j11;
        p053f7.d[] dVarArr;
        if (j8 > this.f20902j) {
            return p053f7.c.f22272a;
        }
        long jK = K();
        long j12 = ((long) this.f20903k) + jK;
        if (this.f20898f == 0 && this.f20904l > 0) {
            j12++;
        }
        if (this.f22269b != 0 && (dVarArr = this.f22268a) != null) {
            for (p053f7.d dVar : dVarArr) {
                if (dVar != null) {
                    long j13 = ((E) dVar).f20918a;
                    if (j13 >= 0 && j13 < j12) {
                        j12 = j13;
                    }
                }
            }
        }
        if (j12 <= this.f20902j) {
            return p053f7.c.f22272a;
        }
        long J8 = J();
        int iMin = l() > 0 ? Math.min(this.f20904l, this.f20898f - ((int) (J8 - j12))) : this.f20904l;
        G6.d[] dVarArr2 = p053f7.c.f22272a;
        long j14 = ((long) this.f20904l) + J8;
        if (iMin > 0) {
            dVarArr2 = new G6.d[iMin];
            Object[] objArr = this.f20900h;
            t.d(objArr);
            j11 = 1;
            long j15 = J8;
            int i8 = 0;
            while (true) {
                if (J8 >= j14) {
                    j9 = jK;
                    j10 = j12;
                    J8 = j15;
                    break;
                }
                Object objF = D.f(objArr, J8);
                j9 = jK;
                p062g7.G g8 = D.f20917a;
                if (objF != g8) {
                    t.e(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i9 = i8 + 1;
                    j10 = j12;
                    dVarArr2[i8] = aVar.f20908d;
                    D.g(objArr, J8, g8);
                    D.g(objArr, j15, aVar.f20907c);
                    long j16 = j15 + 1;
                    if (i9 >= iMin) {
                        J8 = j16;
                        break;
                    }
                    i8 = i9;
                    j15 = j16;
                } else {
                    j10 = j12;
                }
                J8++;
                jK = j9;
                j12 = j10;
            }
        } else {
            j9 = jK;
            j10 = j12;
            j11 = 1;
        }
        G6.d[] dVarArr3 = dVarArr2;
        int i10 = (int) (J8 - j9);
        long j17 = l() == 0 ? J8 : j10;
        long jMax = Math.max(this.f20901i, J8 - ((long) Math.min(this.f20897e, i10)));
        if (this.f20898f == 0 && jMax < j14) {
            Object[] objArr2 = this.f20900h;
            t.d(objArr2);
            if (t.c(D.f(objArr2, jMax), D.f20917a)) {
                J8 += j11;
                jMax += j11;
            }
        }
        V(jMax, j17, J8, j14);
        z();
        return !(dVarArr3.length == 0) ? I(dVarArr3) : dVarArr3;
    }

    public final long X() {
        long j8 = this.f20901i;
        if (j8 < this.f20902j) {
            this.f20902j = j8;
        }
        return j8;
    }

    @Override // p053f7.q
    public InterfaceC2260f a(g gVar, int i8, d dVar) {
        return D.e(this, gVar, i8, dVar);
    }

    @Override // p044e7.w
    public void c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    V(J(), this.f20902j, J(), N());
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p044e7.B, p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        return A(this, interfaceC2261g, dVar);
    }

    @Override // p044e7.w
    public boolean d(Object obj) {
        int i8;
        boolean z8;
        G6.d[] dVarArrI = p053f7.c.f22272a;
        synchronized (this) {
            if (R(obj)) {
                dVarArrI = I(dVarArrI);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (G6.d dVar : dVarArrI) {
            if (dVar != null) {
                C6.q.a aVar = C6.q.f1441b;
                dVar.resumeWith(C6.q.b(G.f1419a));
            }
        }
        return z8;
    }

    @Override // p044e7.w, p044e7.InterfaceC2261g
    public Object emit(Object obj, G6.d dVar) {
        return F(this, obj, dVar);
    }

    public final Object x(E e8, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        synchronized (this) {
            try {
                if (T(e8) < 0) {
                    e8.f20919b = c1797m;
                } else {
                    C6.q.a aVar = C6.q.f1441b;
                    c1797m.resumeWith(C6.q.b(G.f1419a));
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS == H6.c.f() ? objS : G.f1419a;
    }

    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f20906b < K()) {
                return;
            }
            Object[] objArr = this.f20900h;
            t.d(objArr);
            if (D.f(objArr, aVar.f20906b) != aVar) {
                return;
            }
            D.g(objArr, aVar.f20906b, D.f20917a);
            z();
            G g8 = G.f1419a;
        }
    }

    public final void z() {
        if (this.f20898f != 0 || this.f20904l > 1) {
            Object[] objArr = this.f20900h;
            t.d(objArr);
            while (this.f20904l > 0 && D.f(objArr, (K() + ((long) P())) - 1) == D.f20917a) {
                this.f20904l--;
                D.g(objArr, K() + ((long) P()), null);
            }
        }
    }
}
