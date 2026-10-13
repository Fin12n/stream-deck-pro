package C5;

import A5.k;
import H.FL.dCqzKmEghGTQ;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final b a(A5.h hVar, Object instance) {
        t.g(hVar, dCqzKmEghGTQ.qDhpT);
        t.g(instance, "instance");
        Object objI = A5.h.i(hVar, new A5.a(b.class, true, k.a(K.b(instance.getClass())), null), null, 2, null);
        if (objI instanceof b) {
            return (b) objI;
        }
        return null;
    }

    public static final A5.h b(A5.h hVar, Object obj) {
        A5.h hVarA;
        t.g(hVar, "<this>");
        t.g(obj, ajyWhveMDgQ.XFxAT);
        b bVarA = a(hVar, obj);
        return (bVarA == null || (hVarA = bVarA.a(hVar, obj)) == null) ? hVar : hVarA;
    }
}
