package o7;

import kotlin.jvm.internal.t;
import q7.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final X6.d a(f fVar) {
        t.g(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f30967b;
        }
        if (fVar instanceof H0) {
            return a(((H0) fVar).k());
        }
        return null;
    }

    public static final f b(t7.c cVar, f descriptor) {
        p116m7.b bVarC;
        t.g(cVar, "<this>");
        t.g(descriptor, "descriptor");
        X6.d dVarA = a(descriptor);
        if (dVarA == null || (bVarC = t7.c.c(cVar, dVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }

    public static final f c(f fVar, X6.d context) {
        t.g(fVar, "<this>");
        t.g(context, "context");
        return new c(fVar, context);
    }
}
