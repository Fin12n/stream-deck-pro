package Q5;

import io.ktor.utils.io.g;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends H5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(G5.a client, g content, H5.b originCall) {
        super(client);
        t.g(client, "client");
        t.g(content, "content");
        t.g(originCall, "originCall");
        j(new c(this, originCall.f()));
        k(new d(this, content, originCall.g()));
    }
}
