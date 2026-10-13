package G;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0868e0;
import P2.Lsk.mHPawN;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2564a = new O.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2565b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(h0 h0Var);
    }

    public static /* synthetic */ void a(h0 h0Var, C0868e0 c0868e0) {
        boolean z8 = h0Var.i() != null;
        h0Var.k();
        if (!z8) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        C0864c0.e eVarI = h0Var.i();
        Objects.requireNonNull(eVarI);
        eVarI.d(c0868e0);
    }

    public static /* synthetic */ void b(h0 h0Var, C0864c0.h hVar) {
        h0Var.k();
        throw null;
    }

    public static /* synthetic */ void c(h0 h0Var, androidx.camera.core.d dVar) {
        C0864c0.e eVarI = h0Var.i();
        Objects.requireNonNull(eVarI);
        Objects.requireNonNull(dVar);
        eVarI.c(dVar);
    }

    public static /* synthetic */ void d(h0 h0Var, Bitmap bitmap) {
        h0Var.k();
        if (h0Var.i() != null) {
            h0Var.i().e(bitmap);
        }
    }

    public static /* synthetic */ void e(h0 h0Var, int i8) {
        h0Var.k();
        if (h0Var.i() != null) {
            h0Var.i().a(i8);
        }
    }

    public boolean f() {
        I.w.b();
        int i8 = this.f2564a;
        if (i8 <= 0) {
            return false;
        }
        this.f2564a = i8 - 1;
        return true;
    }

    public abstract Executor g();

    public abstract Rect h();

    public abstract C0864c0.e i();

    public abstract int j();

    public abstract C0864c0.f k();

    public abstract C0864c0.g l();

    public abstract int m();

    public abstract C0864c0.g n();

    public abstract Matrix o();

    public abstract List p();

    public boolean q() {
        Iterator it = this.f2565b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean r();

    public void t(final int i8) {
        g().execute(new Runnable() { // from class: G.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.e(this.f2561a, i8);
            }
        });
    }

    public void u(final C0868e0 c0868e0) {
        g().execute(new Runnable() { // from class: G.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.a(this.f2545a, c0868e0);
            }
        });
    }

    public void v(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: G.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.d(this.f2555a, bitmap);
            }
        });
    }

    public void w(final C0864c0.h hVar) {
        g().execute(new Runnable() { // from class: G.f0
            @Override // java.lang.Runnable
            public final void run() {
                h0.b(this.f2559a, hVar);
            }
        });
    }

    public void x(final androidx.camera.core.d dVar) {
        g().execute(new Runnable() { // from class: G.d0
            @Override // java.lang.Runnable
            public final void run() {
                h0.c(this.f2551a, dVar);
            }
        });
    }

    public void s(int i8, boolean z8) {
        if (this.f2565b.containsKey(Integer.valueOf(i8))) {
            this.f2565b.put(Integer.valueOf(i8), Boolean.valueOf(z8));
        } else {
            AbstractC0890p0.c(mHPawN.GquccxVyBAn, "The format is not supported in simultaneous capture");
        }
    }
}
