package io.ktor.utils.io.internal;

import C6.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25497g;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25496f = obj;
            this.f25497g |= Integer.MIN_VALUE;
            return k.b(null, null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25502e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25501d = obj;
            this.f25502e |= Integer.MIN_VALUE;
            return k.c(null, null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d2 -> B:44:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(io.ktor.utils.io.f r18, io.ktor.utils.io.f r19, long r20, G6.d r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.k.b(io.ktor.utils.io.f, io.ktor.utils.io.f, long, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [y6.a] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static final Object c(io.ktor.utils.io.f fVar, io.ktor.utils.io.f fVar2, long j8, G6.d dVar) throws Throwable {
        b bVar;
        p213y6.a aVar;
        Object objH;
        io.ktor.utils.io.f fVar3;
        int iIntValue;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f25502e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f25502e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f25501d;
        Object objF = H6.c.f();
        int i9 = bVar.f25502e;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = (p213y6.a) p213y6.a.f38436j.c().b0();
                try {
                    aVar.u((int) W6.n.h(j8, aVar.f()));
                    bVar.f25498a = fVar2;
                    bVar.f25499b = aVar;
                    bVar.f25502e = 1;
                    objH = fVar.H(aVar, bVar);
                    fVar3 = fVar2;
                    if (objH == objF) {
                    }
                    return objF;
                } catch (Throwable th) {
                    th = th;
                    fVar2 = aVar;
                    fVar2.F(p213y6.a.f38436j.c());
                    throw th;
                }
            }
            if (i9 == 1) {
                p213y6.a aVar2 = (p213y6.a) bVar.f25499b;
                io.ktor.utils.io.f fVar4 = (io.ktor.utils.io.f) bVar.f25498a;
                r.b(obj);
                fVar3 = fVar4;
                objH = obj;
                aVar = aVar2;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = bVar.f25500c;
                p213y6.a aVar3 = (p213y6.a) bVar.f25498a;
                r.b(obj);
                fVar2 = aVar3;
            }
            Long lE = I6.b.e(iIntValue);
            fVar2.F(p213y6.a.f38436j.c());
            return lE;
            iIntValue = ((Number) objH).intValue();
            if (iIntValue == -1) {
                y6.a.d dVar2 = p213y6.a.f38436j;
                aVar.F(dVar2.c());
                Long lE2 = I6.b.e(0L);
                aVar.F(dVar2.c());
                return lE2;
            }
            bVar.f25498a = aVar;
            bVar.f25499b = null;
            bVar.f25500c = iIntValue;
            bVar.f25502e = 2;
            if (fVar3.C(aVar, bVar) != objF) {
                fVar2 = aVar;
                Long lE3 = I6.b.e(iIntValue);
                fVar2.F(p213y6.a.f38436j.c());
                return lE3;
            }
            return objF;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
