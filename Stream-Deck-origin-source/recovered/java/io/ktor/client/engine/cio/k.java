package io.ktor.client.engine.cio;

import D6.r;
import M5.u;
import X5.C1688q;
import X5.C1692v;
import X5.InterfaceC1684m;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final boolean a(T5.e eVar) {
        u.a aVar = (u.a) eVar.c(u.f5752d);
        if (aVar != null) {
            return (aVar.c() == null && aVar.e() == null) ? false : true;
        }
        return false;
    }

    public static final boolean b(T5.e eVar) {
        C1692v.a aVar;
        t.g(eVar, "<this>");
        List<InterfaceC1684m> listQ = r.q(eVar.e(), eVar.b().c());
        if (listQ == null || !listQ.isEmpty()) {
            for (InterfaceC1684m interfaceC1684m : listQ) {
                C1688q c1688q = C1688q.f11910a;
                if (t.c(interfaceC1684m.d(c1688q.g()), "close") || interfaceC1684m.contains(c1688q.C())) {
                }
            }
            aVar = C1692v.f11962b;
            if (!r.q(aVar.b(), aVar.c()).contains(eVar.f()) && !a(eVar)) {
                return false;
            }
        } else {
            aVar = C1692v.f11962b;
            if (!r.q(aVar.b(), aVar.c()).contains(eVar.f())) {
            }
        }
        return true;
    }
}
