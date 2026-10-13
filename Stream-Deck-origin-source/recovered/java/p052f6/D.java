package p052f6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p205x6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f21978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f21979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f21980c;

    public D() {
        this(null, null, null, 7, null);
    }

    public final k a() {
        return this.f21980c;
    }

    public final E b() {
        return this.f21978a;
    }

    public final H c() {
        return this.f21979b;
    }

    public D(E type, H version, k packet) {
        t.g(type, "type");
        t.g(version, "version");
        t.g(packet, "packet");
        this.f21978a = type;
        this.f21979b = version;
        this.f21980c = packet;
    }

    public /* synthetic */ D(E e8, H h8, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? E.Handshake : e8, (i8 & 2) != 0 ? H.TLS12 : h8, (i8 & 4) != 0 ? k.f37426i.a() : kVar);
    }
}
