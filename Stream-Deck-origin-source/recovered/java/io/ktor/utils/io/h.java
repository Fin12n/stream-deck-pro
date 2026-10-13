package io.ktor.utils.io;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f25436h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f25437i;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25436h = obj;
            this.f25437i |= Integer.MIN_VALUE;
            return h.c(null, null, 0L, this);
        }
    }

    public static final Object b(g gVar, j jVar, long j8, G6.d dVar) {
        if (gVar == jVar) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j8 == 0) {
            return I6.b.e(0L);
        }
        if ((gVar instanceof C2429a) && (jVar instanceof C2429a)) {
            return ((C2429a) jVar).w0((C2429a) gVar, j8, null, dVar);
        }
        return ((gVar instanceof f) && (jVar instanceof f)) ? io.ktor.utils.io.internal.k.b((f) gVar, (f) jVar, Long.MAX_VALUE, dVar) : c(gVar, jVar, j8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:30:0x00bb, B:32:0x00c4, B:47:0x00ff, B:21:0x0067), top: B:59:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(io.ktor.utils.io.g r19, io.ktor.utils.io.j r20, long r21, G6.d r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.c(io.ktor.utils.io.g, io.ktor.utils.io.j, long, G6.d):java.lang.Object");
    }
}
