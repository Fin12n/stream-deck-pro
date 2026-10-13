package M5;

import Z.JTT.ryTuoS;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f5772a = p157r6.a.a("io.ktor.client.plugins.HttpTimeout");

    public static final L5.a a(T5.e request, Throwable th) {
        Object objC;
        kotlin.jvm.internal.t.g(request, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Connect timeout has expired [url=");
        sb.append(request.h());
        sb.append(", connect_timeout=");
        u.a aVar = (u.a) request.c(u.f5752d);
        if (aVar == null || (objC = aVar.c()) == null) {
            objC = "unknown";
        }
        sb.append(objC);
        sb.append(" ms]");
        return new L5.a(sb.toString(), th);
    }

    public static /* synthetic */ L5.a b(T5.e eVar, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        return a(eVar, th);
    }

    public static final long e(long j8) {
        if (j8 == Long.MAX_VALUE) {
            return 0L;
        }
        return j8;
    }

    public static final void f(T5.d dVar, Q6.k block) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        kotlin.jvm.internal.t.g(block, "block");
        u.b bVar = u.f5752d;
        u.a aVar = new u.a(null, null, null, 7, null);
        block.invoke(aVar);
        dVar.l(bVar, aVar);
    }

    public static final L5.b c(T5.e request, Throwable th) {
        Object objE;
        kotlin.jvm.internal.t.g(request, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Socket timeout has expired [url=");
        sb.append(request.h());
        sb.append(", socket_timeout=");
        u.a aVar = (u.a) request.c(u.f5752d);
        if (aVar == null || (objE = aVar.e()) == null) {
            objE = "unknown";
        }
        sb.append(objE);
        sb.append(ryTuoS.LQYotIZ);
        return new L5.b(sb.toString(), th);
    }
}
