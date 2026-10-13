package p043e6;

import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f20843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f20845c;

    public i(n socket, g input, j output) {
        t.g(socket, "socket");
        t.g(input, "input");
        t.g(output, "output");
        this.f20843a = socket;
        this.f20844b = input;
        this.f20845c = output;
    }

    public final g a() {
        return this.f20844b;
    }

    public final j b() {
        return this.f20845c;
    }

    public final n c() {
        return this.f20843a;
    }
}
