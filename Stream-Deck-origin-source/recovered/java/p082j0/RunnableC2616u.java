package p082j0;

import U1.InterfaceC1662y;
import U1.X;
import U1.c0;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: j0.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2616u extends X.b implements Runnable, InterfaceC1662y, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f28062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0 f28065f;

    public RunnableC2616u(e0 e0Var) {
        super(!e0Var.c() ? 1 : 0);
        this.f28062c = e0Var;
    }

    @Override // U1.InterfaceC1662y
    public c0 a(View view, c0 c0Var) {
        this.f28065f = c0Var;
        this.f28062c.k(c0Var);
        if (this.f28063d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f28064e) {
            this.f28062c.j(c0Var);
            e0.i(this.f28062c, c0Var, 0, 2, null);
        }
        return this.f28062c.c() ? c0.f10088b : c0Var;
    }

    @Override // U1.X.b
    public void c(X x8) {
        this.f28063d = false;
        this.f28064e = false;
        c0 c0Var = this.f28065f;
        if (x8.a() != 0 && c0Var != null) {
            this.f28062c.j(c0Var);
            this.f28062c.k(c0Var);
            e0.i(this.f28062c, c0Var, 0, 2, null);
        }
        this.f28065f = null;
        super.c(x8);
    }

    @Override // U1.X.b
    public void d(X x8) {
        this.f28063d = true;
        this.f28064e = true;
        super.d(x8);
    }

    @Override // U1.X.b
    public c0 e(c0 c0Var, List list) {
        e0.i(this.f28062c, c0Var, 0, 2, null);
        return this.f28062c.c() ? c0.f10088b : c0Var;
    }

    @Override // U1.X.b
    public X.a f(X x8, X.a aVar) {
        this.f28063d = false;
        return super.f(x8, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f28063d) {
            this.f28063d = false;
            this.f28064e = false;
            c0 c0Var = this.f28065f;
            if (c0Var != null) {
                this.f28062c.j(c0Var);
                e0.i(this.f28062c, c0Var, 0, 2, null);
                this.f28065f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
