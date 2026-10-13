package io.ktor.utils.io;

import C6.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25440c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25439b = obj;
            this.f25440c |= Integer.MIN_VALUE;
            return i.b(null, null, 0L, this);
        }
    }

    public static final boolean a(g gVar) {
        kotlin.jvm.internal.t.g(gVar, "<this>");
        return gVar.f(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(g gVar, j jVar, long j8, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f25440c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f25440c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f25439b;
        Object objF = H6.c.f();
        int i9 = aVar.f25440c;
        if (i9 == 0) {
            C6.r.b(objB);
            aVar.f25438a = jVar;
            aVar.f25440c = 1;
            objB = h.b(gVar, jVar, j8, aVar);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) aVar.f25438a;
            C6.r.b(objB);
        }
        long jLongValue = ((Number) objB).longValue();
        k.a(jVar);
        return I6.b.e(jLongValue);
    }

    public static /* synthetic */ Object c(g gVar, j jVar, long j8, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MAX_VALUE;
        }
        return b(gVar, jVar, j8, dVar);
    }

    public static final Object d(g gVar, G6.d dVar) {
        return gVar.B(Long.MAX_VALUE, dVar);
    }

    public static final Object e(g gVar, byte[] bArr, G6.d dVar) {
        return gVar.G(bArr, 0, bArr.length, dVar);
    }

    public static final Object f(g gVar, byte[] bArr, G6.d dVar) {
        Object objX = gVar.x(bArr, 0, bArr.length, dVar);
        return objX == H6.c.f() ? objX : G.f1419a;
    }

    public static final Object g(g gVar, G6.d dVar) {
        return gVar.z(Integer.MAX_VALUE, dVar);
    }
}
