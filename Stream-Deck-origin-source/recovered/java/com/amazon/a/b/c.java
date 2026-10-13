package com.amazon.a.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16837a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f16839c;

    private boolean b() {
        return this.f16838b.b(com.amazon.a.a.m.c.f16554b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f16838b.a(com.amazon.a.a.m.c.f16555c);
        if (cVar == null) {
            return e.f16845e;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16837a.a("Fetched failure content from store: " + cVar);
        }
        this.f16838b.c(com.amazon.a.a.m.c.f16555c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16837a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f16837a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16837a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f16839c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
