package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16650b = new com.amazon.a.a.o.c("KiwiCommand");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.amazon.a.a.j.a f16651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f16655g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f16658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h f16659k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.amazon.a.b.f f16656h = new com.amazon.a.b.f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16660l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f16651c = aVar;
        this.f16652d = str3;
        this.f16653e = str;
        this.f16654f = str2;
        HashMap map = new HashMap();
        this.f16655g = map;
        map.put(com.amazon.a.a.o.b.f16701B, str3);
        map.put(com.amazon.a.a.o.b.f16708I, str4);
        this.f16657i = true;
        this.f16658j = null;
        this.f16659k = null;
    }

    public h a(boolean z8) {
        this.f16660l = z8;
        return this;
    }

    @Override // com.amazon.a.a.n.a.a
    public String a_() {
        return this.f16653e;
    }

    public void b(com.amazon.d.a.h hVar) {
    }

    public abstract boolean b(j jVar);

    public void c(com.amazon.a.a.d.b bVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    public boolean d() {
        return true;
    }

    public boolean i() {
        return this.f16660l;
    }

    public com.amazon.a.a.j.a j() {
        return this.f16651c;
    }

    public String k() {
        return this.f16652d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }

    public void a(h hVar) {
        this.f16658j = hVar;
    }

    public void b(h hVar) {
        this.f16659k = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    public String c() {
        return this.f16654f;
    }

    public void a(String str, Object obj) {
        this.f16655g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    public Map<String, Object> b() {
        return this.f16655g;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e eVarA = com.amazon.a.a.a();
        if (eVarA == null) {
            f16650b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            eVarA.a((com.amazon.a.a.i.b) aVar);
        }
    }

    public void b(boolean z8) {
        this.f16657i = z8;
    }

    @Override // com.amazon.a.a.n.a.a
    public void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.ah.equals(this.f16654f) && (hVar = this.f16659k) != null) {
            hVar.a(this.f16660l);
            this.f16659k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e8) {
            f16650b.a("Error calling onResult: " + e8);
        }
        if (this.f16657i) {
            a(this.f16656h.a(bVar));
        }
        if (this.f16660l) {
            return;
        }
        this.f16651c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(j jVar) {
        boolean zB;
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f16731f);
        f16650b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            try {
                zB = b(jVar);
            } catch (Exception e8) {
                f16650b.a("Error calling onResult: " + e8);
                zB = false;
            }
            if (zB && (hVar = this.f16658j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f16660l) {
                    return;
                }
                if (zB) {
                    this.f16651c.b();
                    return;
                } else {
                    this.f16651c.c();
                    return;
                }
            }
        }
        if (this.f16660l) {
            return;
        }
        this.f16651c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    public void a(com.amazon.d.a.h hVar) {
        String str;
        h hVar2;
        f16650b.a("onFailure: result = " + hVar);
        if (hVar != null && (str = (String) hVar.f().get(com.amazon.a.a.o.b.an)) != null && str.equalsIgnoreCase(yOZfxp.CMAFgT) && (hVar2 = this.f16659k) != null) {
            hVar2.a(this.f16660l);
            this.f16659k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e8) {
            f16650b.a("Error calling onResult: " + e8);
        }
        if (this.f16657i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f16660l) {
            return;
        }
        this.f16651c.c();
    }
}
