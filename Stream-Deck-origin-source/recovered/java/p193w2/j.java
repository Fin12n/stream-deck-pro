package p193w2;

import A2.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r database) {
        super(database);
        t.g(database, "database");
    }

    public abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k kVarB = b();
        try {
            i(kVarB, obj);
            kVarB.V1();
        } finally {
            h(kVarB);
        }
    }
}
