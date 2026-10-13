package p205x6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p189v6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final void a(a aVar, ByteBuffer source) throws r {
        t.g(aVar, "<this>");
        t.g(source, "source");
        int iRemaining = source.remaining();
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < iRemaining) {
            throw new r("buffer content", iRemaining, iG);
        }
        d.c(source, byteBufferH, iK);
        aVar.a(iRemaining);
    }
}
