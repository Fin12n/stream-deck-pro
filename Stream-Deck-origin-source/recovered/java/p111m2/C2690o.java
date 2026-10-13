package p111m2;

import T1.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: m2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2690o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f29942a;

    public C2690o(q qVar) {
        this.f29942a = qVar;
    }

    public static C2690o b(q qVar) {
        return new C2690o((q) f.h(qVar, "callbacks == null"));
    }

    public void a(ComponentCallbacksC2681f componentCallbacksC2681f) {
        q qVar = this.f29942a;
        qVar.f29948e.k(qVar, qVar, componentCallbacksC2681f);
    }

    public void c() {
        this.f29942a.f29948e.v();
    }

    public boolean d(MenuItem menuItem) {
        return this.f29942a.f29948e.y(menuItem);
    }

    public void e() {
        this.f29942a.f29948e.z();
    }

    public void f() {
        this.f29942a.f29948e.B();
    }

    public void g() {
        this.f29942a.f29948e.K();
    }

    public void h() {
        this.f29942a.f29948e.O();
    }

    public void i() {
        this.f29942a.f29948e.P();
    }

    public void j() {
        this.f29942a.f29948e.R();
    }

    public boolean k() {
        return this.f29942a.f29948e.Y(true);
    }

    public y l() {
        return this.f29942a.f29948e;
    }

    public void m() {
        this.f29942a.f29948e.O0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f29942a.f29948e.s0().onCreateView(view, str, context, attributeSet);
    }
}
