package R5;

import X5.C1685n;
import X5.C1688q;
import X5.InterfaceC1684m;
import kotlin.jvm.internal.t;
import p115m6.AbstractC2696f;
import p115m6.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends T5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1684m f9510c;

    public e() {
        String str = AbstractC2696f.a(p.b(16));
        t.f(str, "StringBuilder().apply(builderAction).toString()");
        this.f9509b = str;
        C1685n c1685n = new C1685n(0, 1, null);
        C1688q c1688q = C1688q.f11910a;
        c1685n.f(c1688q.C(), "websocket");
        c1685n.f(c1688q.g(), "Upgrade");
        c1685n.f(c1688q.y(), str);
        c1685n.f(c1688q.z(), "13");
        this.f9510c = c1685n.o();
    }

    @Override // p007a6.c
    public InterfaceC1684m c() {
        return this.f9510c;
    }

    public String toString() {
        return "WebSocketContent";
    }
}
