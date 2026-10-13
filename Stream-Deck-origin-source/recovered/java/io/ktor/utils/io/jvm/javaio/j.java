package io.ktor.utils.io.jvm.javaio;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f25548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25549h;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25548g = obj;
            this.f25549h |= Integer.MIN_VALUE;
            return j.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:30:0x0096, B:33:0x00a1, B:26:0x0078), top: B:49:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [z6.g] */
    /* JADX WARN: Type inference failed for: r1v3, types: [z6.g] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:49:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object a(io.ktor.utils.io.g r18, java.io.OutputStream r19, long r20, G6.d r22) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.j.a(io.ktor.utils.io.g, java.io.OutputStream, long, G6.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(io.ktor.utils.io.g gVar, OutputStream outputStream, long j8, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MAX_VALUE;
        }
        return a(gVar, outputStream, j8, dVar);
    }
}
