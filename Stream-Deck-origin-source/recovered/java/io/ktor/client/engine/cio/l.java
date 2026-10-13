package io.ktor.client.engine.cio;

import M5.v;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.t;
import p115m6.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static final Throwable a(Throwable th, T5.e request) {
        t.g(th, WqXA.HgtosNfvr);
        t.g(request, "request");
        Throwable cause = th.getCause();
        Throwable thC = (cause != null ? H.a(cause) : null) instanceof SocketTimeoutException ? v.c(request, th.getCause()) : th.getCause();
        return thC == null ? th : thC;
    }
}
