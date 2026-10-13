package p052f6;

import kotlin.jvm.internal.t;
import p205x6.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public static final j a() {
        return C2317h.j(new j(null, 1, null));
    }

    public static final void b(j plusAssign, B record) {
        t.g(plusAssign, "$this$plusAssign");
        t.g(record, "record");
        if (record.b() == C.HelloRequest) {
            throw new IllegalStateException("Check failed.");
        }
        j jVar = new j(null, 1, null);
        try {
            o.q(jVar, record.b(), (int) record.a().o1());
            if (record.a().o1() > 0) {
                jVar.o1(record.a().j2());
            }
            C2317h.A(plusAssign, jVar.M1());
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }
}
