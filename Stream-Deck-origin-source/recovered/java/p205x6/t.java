package p205x6;

import java.nio.ByteBuffer;
import p213y6.a;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    public static final void a(s sVar, ByteBuffer bb) {
        kotlin.jvm.internal.t.g(sVar, "<this>");
        kotlin.jvm.internal.t.g(bb, "bb");
        int iLimit = bb.limit();
        a aVarD = g.d(sVar, 1, null);
        while (true) {
            try {
                bb.limit(bb.position() + Math.min(bb.remaining(), aVarD.g() - aVarD.k()));
                e.a(aVarD, bb);
                bb.limit(iLimit);
                if (!bb.hasRemaining()) {
                    sVar.c();
                    return;
                }
                aVarD = g.d(sVar, 1, aVarD);
            } catch (Throwable th) {
                sVar.c();
                throw th;
            }
        }
    }
}
