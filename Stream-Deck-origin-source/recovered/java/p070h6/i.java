package p070h6;

import kotlin.jvm.internal.t;
import p205x6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f24540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f24542c;

    public i(j type, int i8, k packet) {
        t.g(type, "type");
        t.g(packet, "packet");
        this.f24540a = type;
        this.f24541b = i8;
        this.f24542c = packet;
    }

    public final k a() {
        return this.f24542c;
    }

    public final j b() {
        return this.f24540a;
    }
}
