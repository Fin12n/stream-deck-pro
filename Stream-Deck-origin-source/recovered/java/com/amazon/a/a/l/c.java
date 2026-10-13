package com.amazon.a.a.l;

import H.FL.dCqzKmEghGTQ;
import X.i;
import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16533a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f16534b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16535c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f16536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f16538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicReference<a> f16539g = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlockingQueue<com.amazon.a.a.l.a> f16540h = new LinkedBlockingQueue();

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f16538f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.l.c.1
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
                a aVar2 = (a) c.this.f16539g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }
        });
    }

    private int b() {
        return f16534b.nextInt(f16535c) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f16544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f16546c;

        public a(Intent intent, int i8) {
            this.f16544a = intent;
            this.f16545b = i8;
        }

        public void a(Activity activity) {
            c.f16533a.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f16544a, this.f16545b);
            this.f16546c = activity;
        }

        public void b(Activity activity) {
            c.f16533a.b("Context changed while awaiting result!");
            if (this.f16546c != null) {
                c.f16533a.b("Finishing activity from old context: " + this.f16546c);
                this.f16546c.finishActivity(this.f16545b);
            }
            a(activity);
        }

        public int a() {
            return this.f16545b;
        }
    }

    @Override // com.amazon.a.a.l.b
    public com.amazon.a.a.l.a a(Intent intent) {
        final a aVar = new a(intent, b());
        if (!i.a(this.f16539g, null, aVar)) {
            f16533a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        com.amazon.a.a.o.c cVar = f16533a;
        cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
        this.f16536d.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.l.c.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity activityB = c.this.f16537e.b();
                if (activityB == null) {
                    c.f16533a.a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                } else {
                    aVar.a(activityB);
                }
            }
        });
        try {
            cVar.a(jULK.zXE + aVar.a());
            return this.f16540h.take();
        } catch (InterruptedException unused) {
            f16533a.a("Interrupted while awaiting for request, returning null");
            return null;
        } finally {
            f16533a.a("Received Response: " + aVar.a());
            this.f16539g.set(null);
        }
    }

    @Override // com.amazon.a.a.l.b
    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16533a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f16539g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16533a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16533a.a(dCqzKmEghGTQ.XHkTpEczXPENes + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16533a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.f16540h.add(aVar);
        return true;
    }
}
