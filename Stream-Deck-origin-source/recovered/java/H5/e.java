package H5;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f3566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(G5.a client, T5.c request, U5.c response, byte[] responseBody) {
        super(client);
        t.g(client, "client");
        t.g(request, "request");
        t.g(response, "response");
        t.g(responseBody, "responseBody");
        this.f3566h = responseBody;
        j(new f(this, request));
        k(new g(this, responseBody, response));
        this.f3567i = true;
    }

    @Override // H5.b
    public boolean b() {
        return this.f3567i;
    }

    @Override // H5.b
    public Object h(G6.d dVar) {
        return io.ktor.utils.io.d.a(this.f3566h);
    }
}
