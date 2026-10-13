package t7;

import D6.r;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p116m7.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public /* synthetic */ c(AbstractC2633k abstractC2633k) {
        this();
    }

    public static /* synthetic */ p116m7.b c(c cVar, X6.d dVar, List list, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i8 & 2) != 0) {
            list = r.n();
        }
        return cVar.b(dVar, list);
    }

    public abstract void a(e eVar);

    public abstract p116m7.b b(X6.d dVar, List list);

    public abstract p116m7.a d(X6.d dVar, String str);

    public abstract k e(X6.d dVar, Object obj);

    public c() {
    }
}
