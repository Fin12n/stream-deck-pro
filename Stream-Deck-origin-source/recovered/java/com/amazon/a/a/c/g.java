package com.amazon.a.a.c;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16409a = new com.amazon.a.a.o.c(LYdqVGvOGMNr.DrEvtHorYU);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<b, e<?>> f16410b = new HashMap();

    @Override // com.amazon.a.a.c.f
    public <T extends a> void a(c<T> cVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "listener");
        com.amazon.a.a.o.a.a.a();
        b bVarA = cVar.a();
        f16409a.a("Registering listener for event: " + bVarA + ", " + cVar);
        e<?> eVar = this.f16410b.get(bVarA);
        if (eVar == null) {
            eVar = new e<>();
            this.f16410b.put(bVarA, eVar);
        }
        eVar.a(cVar);
    }

    @Override // com.amazon.a.a.c.f
    public void a(a aVar) {
        b bVarA = aVar.a();
        if (com.amazon.a.a.o.c.f16782a) {
            f16409a.a("Posting event: " + bVarA);
        }
        if (!this.f16410b.containsKey(bVarA)) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16409a.a("No registered listeners, returning");
                return;
            }
            return;
        }
        this.f16410b.get(bVarA).a(aVar);
    }
}
