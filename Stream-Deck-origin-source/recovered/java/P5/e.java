package P5;

import X5.C1674c;
import X5.InterfaceC1675d;
import Z6.v;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC1675d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8930a = new e();

    @Override // X5.InterfaceC1675d
    public boolean a(C1674c contentType) {
        t.g(contentType, "contentType");
        if (contentType.g(C1674c.a.f11811a.a())) {
            return true;
        }
        String string = contentType.i().toString();
        return v.H(string, "application/", false, 2, null) && v.u(string, "+json", false, 2, null);
    }
}
