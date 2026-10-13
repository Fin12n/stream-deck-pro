package p055g0;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.u;
import p037e0.C2217m;
import p037e0.InterfaceC2213i;
import p037e0.l0;
import p037e0.m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f22971f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22972g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2217m f22973h = new C2217m(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f22974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22975b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2217m f22976c = f22973h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22978e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C2217m a() {
            return Q.f22973h;
        }

        public final boolean b(float f8) {
            return Math.abs(f8) < 0.01f;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f22982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22983e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22985g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22983e = obj;
            this.f22985g |= Integer.MIN_VALUE;
            return Q.this.h(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f22987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f22988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f8, k kVar) {
            super(1);
            this.f22987b = f8;
            this.f22988c = kVar;
        }

        public final void b(long j8) {
            if (Q.this.f22975b == Long.MIN_VALUE) {
                Q.this.f22975b = j8;
            }
            C2217m c2217m = new C2217m(Q.this.i());
            long jB = this.f22987b == 0.0f ? Q.this.f22974a.b(new C2217m(Q.this.i()), Q.f22971f.a(), Q.this.f22976c) : S6.c.f((j8 - Q.this.f22975b) / this.f22987b);
            float f8 = ((C2217m) Q.this.f22974a.c(jB, c2217m, Q.f22971f.a(), Q.this.f22976c)).f();
            Q q8 = Q.this;
            q8.f22976c = (C2217m) q8.f22974a.g(jB, c2217m, Q.f22971f.a(), Q.this.f22976c);
            Q.this.f22975b = j8;
            float fI = Q.this.i() - f8;
            Q.this.j(f8);
            this.f22988c.invoke(Float.valueOf(fI));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).longValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f22990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(1);
            this.f22990b = kVar;
        }

        public final void b(long j8) {
            float fI = Q.this.i();
            Q.this.j(0.0f);
            this.f22990b.invoke(Float.valueOf(fI));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).longValue());
            return G.f1419a;
        }
    }

    public Q(InterfaceC2213i interfaceC2213i) {
        this.f22974a = interfaceC2213i.a(l0.i(C2635m.f28814a));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r12 r13 r14
      0x0082: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r2v4 g0.Q$b) = (r2v2 g0.Q$b), (r2v5 g0.Q$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r12v7 float) = (r12v4 float), (r12v8 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r13v7 Q6.k) = (r13v4 Q6.k), (r13v8 Q6.k) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r14v15 g0.Q) = (r14v9 g0.Q), (r14v16 g0.Q) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[PHI: r0 r2 r13 r14
      0x00a9: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r2v3 g0.Q$b) = (r2v4 g0.Q$b), (r2v5 g0.Q$b) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r13v5 Q6.k) = (r13v7 Q6.k), (r13v8 Q6.k) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r14v11 g0.Q) = (r14v15 g0.Q), (r14v16 g0.Q) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d1, B:42:0x00b1, B:45:0x00bc), top: B:55:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[EXC_TOP_SPLITTER, PHI: r0 r2 r12 r13 r14
      0x00a2: PHI (r0v10 ??) = (r0v14 ??), (r0v11 ??) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r2v5 g0.Q$b) = (r2v4 g0.Q$b), (r2v8 g0.Q$b) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r12v8 float) = (r12v7 float), (r12v13 float) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r13v8 Q6.k) = (r13v7 Q6.k), (r13v15 Q6.k) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r14v16 g0.Q) = (r14v15 g0.Q), (r14v18 g0.Q) binds: [B:34:0x009f, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [g0.Q] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [g0.Q] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(Q6.k r12, kotlin.jvm.functions.Function0 r13, G6.d r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.Q.h(Q6.k, kotlin.jvm.functions.Function0, G6.d):java.lang.Object");
    }

    public final float i() {
        return this.f22978e;
    }

    public final void j(float f8) {
        this.f22978e = f8;
    }
}
