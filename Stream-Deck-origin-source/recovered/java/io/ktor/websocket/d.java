package io.ktor.websocket;

import io.jentz.winter.js.HRHLwtyqJWz;
import p017b7.I;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f25645a = p157r6.a.a("io.ktor.websocket.WebSocket");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f25646b = new I(HRHLwtyqJWz.uCKxtIGQ);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f25647c = new I("ws-outgoing-processor");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25648d = new a(a.EnumC0581a.NORMAL, "OK");

    public static final b a(w session, long j8, long j9) {
        kotlin.jvm.internal.t.g(session, "session");
        if (session instanceof b) {
            throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
        }
        return new c(session, j8, j9);
    }

    public static final L7.a e() {
        return f25645a;
    }
}
