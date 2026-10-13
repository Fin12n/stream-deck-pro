package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements e, com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f16478a = new com.amazon.a.a.o.c("PromptManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f16480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f16481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f16482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f16483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<b> f16484g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f16485h = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        if (this.f16485h.get()) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16478a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16478a.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.f16484g.add(bVar);
        if (this.f16483f != null) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16478a.a("Dialog currently showing, not presenting given dialog");
            }
        } else {
            Activity activityB = this.f16479b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        this.f16484g.remove(bVar);
        if (this.f16483f == bVar) {
            this.f16483f = null;
            Activity activityB = this.f16479b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        b();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        b bVar = this.f16483f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    @Override // com.amazon.a.a.i.e
    public void a(final b bVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16478a.a("Scheduling presentation: " + bVar);
        }
        this.f16482e.b(bVar);
        if (this.f16485h.get()) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16478a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        this.f16481d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.c(bVar);
            }

            public String toString() {
                return "Prompt Presentation on Main Thread: " + bVar + ", " + bVar.a();
            }
        });
    }

    @Override // com.amazon.a.a.e.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final b bVar) {
        this.f16481d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.d(bVar);
            }

            public String toString() {
                return "PromptManager:removeExpiredPrompt: " + bVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f16485h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16478a.a("PromptManager finishing....");
            }
            Iterator<b> it = this.f16484g.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                next.c();
            }
            b bVar = this.f16483f;
            if (bVar != null) {
                bVar.k();
            }
        }
    }

    private void b() {
        this.f16480c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.i.f.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                f.this.b(aVar.b());
            }
        });
    }

    private void a(Activity activity) {
        b bVarA = a();
        if (bVarA == null) {
            return;
        }
        a(bVarA, activity);
    }

    private void c() {
        this.f16480c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.i.f.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.FIRST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                f.this.d();
            }
        });
    }

    private b a() {
        if (this.f16484g.isEmpty()) {
            return null;
        }
        return this.f16484g.iterator().next();
    }

    private void a(b bVar, Activity activity) {
        this.f16483f = bVar;
        bVar.a(activity);
    }

    @Override // com.amazon.a.a.i.e
    public Dialog a(Activity activity, int i8) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16478a.a("onCreateDialog, id: " + i8 + ", activity: " + activity);
        }
        b bVar = this.f16483f;
        if (bVar == null) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16478a.a("Showing dialog is null, returning");
            }
            return null;
        }
        if (bVar.j() != i8) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16478a.a("Showing dialog id does not match given id: " + i8 + ", returning");
            }
            return null;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16478a.a("Creating dialog prompt: " + this.f16483f);
        }
        return this.f16483f.c(activity);
    }

    @Override // com.amazon.a.a.i.e
    public void a(Activity activity, boolean z8) {
        b bVar = this.f16483f;
        if (bVar != null) {
            bVar.a(activity, z8);
        }
    }
}
