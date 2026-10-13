package io.ktor.utils.io.internal;

import io.ktor.utils.io.C2429a;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2429a f25504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f25505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p213y6.a f25506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f25507d;

    public n(C2429a channel) {
        t.g(channel, "channel");
        this.f25504a = channel.q1();
        y6.a.d dVar = p213y6.a.f38436j;
        this.f25505b = dVar.a().h();
        this.f25506c = dVar.a();
        this.f25507d = this.f25504a.x0().f25472b;
    }
}
