package p044e7;

import C6.G;
import G6.g;
import I6.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p053f7.b;
import p053f7.q;
import p053f7.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N extends b implements x, InterfaceC2260f, q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20949f = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20950e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f20955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f20956f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20958h;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20956f = obj;
            this.f20958h |= Integer.MIN_VALUE;
            return N.this.collect(null, this);
        }
    }

    public N(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p053f7.q
    public InterfaceC2260f a(g gVar, int i8, p035d7.d dVar) {
        return O.d(this, gVar, i8, dVar);
    }

    @Override // p044e7.x
    public boolean b(Object obj, Object obj2) {
        if (obj == null) {
            obj = t.f22340a;
        }
        if (obj2 == null) {
            obj2 = t.f22340a;
        }
        return q(obj, obj2);
    }

    @Override // p044e7.w
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x0043, PHI: r2 r6 r7 r8 r11
      0x00ac: PHI (r2v8 b7.v0) = (r2v6 b7.v0), (r2v7 b7.v0), (r2v7 b7.v0), (r2v13 b7.v0) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v7 ??) = (r6v14 ??), (r6v15 ??), (r6v16 ??), (r6v17 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 e7.g) = (r7v0 e7.g), (r7v1 e7.g), (r7v1 e7.g), (r7v6 e7.g) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v6 ??) = (r8v13 ??), (r8v14 ??), (r8v15 ??), (r8v16 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [f7.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e7.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [f7.b] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // p044e7.B, p044e7.InterfaceC2260f
    public java.lang.Object collect(p044e7.InterfaceC2261g r11, G6.d r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p044e7.N.collect(e7.g, G6.d):java.lang.Object");
    }

    @Override // p044e7.w
    public boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p044e7.w, p044e7.InterfaceC2261g
    public Object emit(Object obj, G6.d dVar) {
        setValue(obj);
        return G.f1419a;
    }

    @Override // p044e7.x, p044e7.M
    public Object getValue() {
        p062g7.G g8 = t.f22340a;
        Object obj = f20949f.get(this);
        if (obj == g8) {
            return null;
        }
        return obj;
    }

    @Override // p053f7.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public P i() {
        return new P();
    }

    @Override // p053f7.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public P[] j(int i8) {
        return new P[i8];
    }

    public final boolean q(Object obj, Object obj2) {
        int i8;
        p053f7.d[] dVarArrM;
        synchronized (this) {
            Object obj3 = f20949f.get(this);
            if (obj != null && !kotlin.jvm.internal.t.c(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.t.c(obj3, obj2)) {
                return true;
            }
            f20949f.set(this, obj2);
            int i9 = this.f20950e;
            if ((i9 & 1) != 0) {
                this.f20950e = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f20950e = i10;
            p053f7.d[] dVarArrM2 = m();
            G g8 = G.f1419a;
            while (true) {
                P[] pArr = (P[]) dVarArrM2;
                if (pArr != null) {
                    for (P p8 : pArr) {
                        if (p8 != null) {
                            p8.g();
                        }
                    }
                }
                synchronized (this) {
                    i8 = this.f20950e;
                    if (i8 == i10) {
                        this.f20950e = i10 + 1;
                        return true;
                    }
                    dVarArrM = m();
                    G g9 = G.f1419a;
                }
                dVarArrM2 = dVarArrM;
                i10 = i8;
            }
        }
    }

    @Override // p044e7.x
    public void setValue(Object obj) {
        if (obj == null) {
            obj = t.f22340a;
        }
        q(null, obj);
    }
}
