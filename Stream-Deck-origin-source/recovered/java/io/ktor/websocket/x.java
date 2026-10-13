package io.ktor.websocket;

import C6.G;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25772c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25771b = obj;
            this.f25772c |= Integer.MIN_VALUE;
            return x.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r5.w0(r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w wVar, io.ktor.websocket.a aVar, G6.d dVar) {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i8 = aVar2.f25772c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar2.f25772c = i8 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object obj = aVar2.f25771b;
        Object objF = H6.c.f();
        int i9 = aVar2.f25772c;
        try {
            if (i9 == 0) {
                C6.r.b(obj);
                e.b bVar = new e.b(aVar);
                aVar2.f25770a = wVar;
                aVar2.f25772c = 1;
                if (wVar.q1(bVar, aVar2) == objF) {
                }
                return objF;
            }
            if (i9 == 1) {
                wVar = (w) aVar2.f25770a;
                C6.r.b(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
            aVar2.f25770a = null;
            aVar2.f25772c = 2;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object b(w wVar, io.ktor.websocket.a aVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.NORMAL, "");
        }
        return a(wVar, aVar, dVar);
    }

    public static final Object c(w wVar, Throwable th, G6.d dVar) {
        Object objA = a(wVar, th instanceof CancellationException ? new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.NORMAL, "") : new io.ktor.websocket.a(io.ktor.websocket.a.EnumC0581a.INTERNAL_ERROR, th.toString()), dVar);
        return objA == H6.c.f() ? objA : G.f1419a;
    }

    public static final Object d(w wVar, byte[] bArr, G6.d dVar) {
        Object objQ1 = wVar.q1(new e.a(true, bArr), dVar);
        return objQ1 == H6.c.f() ? objQ1 : G.f1419a;
    }
}
