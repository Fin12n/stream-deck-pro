package G;

import A.AbstractC0890p0;
import A.C0868e0;
import H.C0980g0;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements X, androidx.camera.core.b.a, h0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0964x f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0965y f2537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f2538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2539e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f2535a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2540f = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0951j f2541a;

        public a(C0951j c0951j) {
            this.f2541a = c0951j;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (this.f2541a.b()) {
                return;
            }
            int iF = ((C0980g0) this.f2541a.a().get(0)).f();
            if (th instanceof C0868e0) {
                b0.this.f2537c.j(X.a.c(iF, (C0868e0) th));
            } else {
                b0.this.f2537c.j(X.a.c(iF, new C0868e0(2, "Failed to submit capture request", th)));
            }
            b0.this.f2536b.c();
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            b0.this.f2536b.c();
        }
    }

    public b0(InterfaceC0964x interfaceC0964x) {
        I.w.b();
        this.f2536b = interfaceC0964x;
        this.f2539e = new ArrayList();
    }

    public static /* synthetic */ void d(b0 b0Var) {
        b0Var.f2538d = null;
        b0Var.f();
    }

    @Override // G.h0.a
    public void a(h0 h0Var) {
        I.w.b();
        AbstractC0890p0.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f2535a.addFirst(h0Var);
        f();
    }

    @Override // androidx.camera.core.b.a
    public void b(androidx.camera.core.d dVar) {
        J.a.d().execute(new Runnable() { // from class: G.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f2522a.f();
            }
        });
    }

    public boolean e() {
        return this.f2538d != null;
    }

    public void f() {
        I.w.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (e()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f2540f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        if (this.f2537c.h() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        h0 h0Var = (h0) this.f2535a.poll();
        if (h0Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        U u8 = new U(h0Var, this);
        l(u8);
        T1.e eVarE = this.f2537c.e(h0Var, u8, u8.p());
        C0951j c0951j = (C0951j) eVarE.f9823a;
        Objects.requireNonNull(c0951j);
        Q q8 = (Q) eVarE.f9824b;
        Objects.requireNonNull(q8);
        this.f2537c.m(q8);
        u8.t(g(c0951j));
    }

    public final Y4.a g(C0951j c0951j) {
        I.w.b();
        this.f2536b.b();
        Y4.a aVarA = this.f2536b.a(c0951j.a());
        K.n.j(aVarA, new a(c0951j), J.a.d());
        return aVarA;
    }

    @Override // G.X
    public void h() {
        I.w.b();
        this.f2540f = false;
        f();
    }

    @Override // G.X
    public void i() {
        I.w.b();
        this.f2540f = true;
        U u8 = this.f2538d;
        if (u8 != null) {
            u8.n();
        }
    }

    @Override // G.X
    public void j() {
        I.w.b();
        C0868e0 c0868e0 = new C0868e0(3, "Camera is closed.", null);
        Iterator it = this.f2535a.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).u(c0868e0);
        }
        this.f2535a.clear();
        Iterator it2 = new ArrayList(this.f2539e).iterator();
        while (it2.hasNext()) {
            ((U) it2.next()).m(c0868e0);
        }
    }

    @Override // G.X
    public void k(C0965y c0965y) {
        I.w.b();
        this.f2537c = c0965y;
        c0965y.k(this);
    }

    public final void l(final U u8) {
        T1.f.i(!e());
        this.f2538d = u8;
        u8.p().a(new Runnable() { // from class: G.Z
            @Override // java.lang.Runnable
            public final void run() {
                b0.d(this.f2523a);
            }
        }, J.a.a());
        this.f2539e.add(u8);
        u8.q().a(new Runnable() { // from class: G.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2526a.f2539e.remove(u8);
            }
        }, J.a.a());
    }
}
