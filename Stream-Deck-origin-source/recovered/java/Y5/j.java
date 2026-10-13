package Y5;

import X5.C1692v;
import kotlin.jvm.internal.t;
import p205x6.r;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p205x6.j f12509a = new p205x6.j(null, 1, null);

    public final p205x6.k a() {
        return this.f12509a.M1();
    }

    public final void b() throws r {
        this.f12509a.g1((byte) 13);
        this.f12509a.g1((byte) 10);
    }

    public final void c(CharSequence name, CharSequence value) throws r {
        t.g(name, "name");
        t.g(value, "value");
        this.f12509a.append(name);
        this.f12509a.append(": ");
        this.f12509a.append(value);
        this.f12509a.g1((byte) 13);
        this.f12509a.g1((byte) 10);
    }

    public final void d() {
        this.f12509a.T0();
    }

    public final void e(C1692v method, CharSequence uri, CharSequence version) throws r {
        t.g(method, "method");
        t.g(uri, "uri");
        t.g(version, "version");
        y.i(this.f12509a, method.e(), 0, 0, null, 14, null);
        this.f12509a.g1((byte) 32);
        y.i(this.f12509a, uri, 0, 0, null, 14, null);
        this.f12509a.g1((byte) 32);
        y.i(this.f12509a, version, 0, 0, null, 14, null);
        this.f12509a.g1((byte) 13);
        this.f12509a.g1((byte) 10);
    }
}
