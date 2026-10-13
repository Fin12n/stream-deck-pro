package p099l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f28829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b.a f28830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f28831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f28834i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z8) {
        this.f28828c = context;
        this.f28829d = actionBarContextView;
        this.f28830e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f28834i = eVarT;
        eVarT.S(this);
        this.f28833h = z8;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f28830e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f28829d.l();
    }

    @Override // p099l.b
    public void c() {
        if (this.f28832g) {
            return;
        }
        this.f28832g = true;
        this.f28830e.c(this);
    }

    @Override // p099l.b
    public View d() {
        WeakReference weakReference = this.f28831f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p099l.b
    public Menu e() {
        return this.f28834i;
    }

    @Override // p099l.b
    public MenuInflater f() {
        return new g(this.f28829d.getContext());
    }

    @Override // p099l.b
    public CharSequence g() {
        return this.f28829d.getSubtitle();
    }

    @Override // p099l.b
    public CharSequence i() {
        return this.f28829d.getTitle();
    }

    @Override // p099l.b
    public void k() {
        this.f28830e.b(this, this.f28834i);
    }

    @Override // p099l.b
    public boolean l() {
        return this.f28829d.j();
    }

    @Override // p099l.b
    public void m(View view) {
        this.f28829d.setCustomView(view);
        this.f28831f = view != null ? new WeakReference(view) : null;
    }

    @Override // p099l.b
    public void n(int i8) {
        o(this.f28828c.getString(i8));
    }

    @Override // p099l.b
    public void o(CharSequence charSequence) {
        this.f28829d.setSubtitle(charSequence);
    }

    @Override // p099l.b
    public void q(int i8) {
        r(this.f28828c.getString(i8));
    }

    @Override // p099l.b
    public void r(CharSequence charSequence) {
        this.f28829d.setTitle(charSequence);
    }

    @Override // p099l.b
    public void s(boolean z8) {
        super.s(z8);
        this.f28829d.setTitleOptional(z8);
    }
}
