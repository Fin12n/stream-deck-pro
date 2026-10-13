package p193w2;

import V.ocy.SVzBK;
import java.util.Map;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1800n0;
import p017b7.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final F a(r rVar) {
        Map mapK = rVar.k();
        Object objA = mapK.get("QueryDispatcher");
        if (objA == null) {
            objA = AbstractC1800n0.a(rVar.o());
            mapK.put("QueryDispatcher", objA);
        }
        t.e(objA, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (F) objA;
    }

    public static final F b(r rVar) {
        Map mapK = rVar.k();
        Object objA = mapK.get("TransactionDispatcher");
        if (objA == null) {
            objA = AbstractC1800n0.a(rVar.r());
            mapK.put("TransactionDispatcher", objA);
        }
        t.e(objA, SVzBK.IdyRri);
        return (F) objA;
    }
}
