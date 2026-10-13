package T5;

import C6.G;
import X5.C1674c;
import X5.C1688q;
import X5.InterfaceC1690t;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final void b(InterfaceC1690t interfaceC1690t, String key, Object obj) {
        t.g(interfaceC1690t, "<this>");
        t.g(key, "key");
        if (obj != null) {
            interfaceC1690t.a().f(key, obj.toString());
            G g8 = G.f1419a;
        }
    }

    public static final void a(InterfaceC1690t interfaceC1690t, C1674c contentType) {
        t.g(interfaceC1690t, GIGvBf.BvWQxBbEGqp);
        t.g(contentType, "contentType");
        interfaceC1690t.a().f(C1688q.f11910a.c(), contentType.toString());
    }
}
