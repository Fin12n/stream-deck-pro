package p063h;

import H1.h;
import H1.t;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import p009b.J;
import p111m2.ActivityC2686k;
import p117n.c0;
import p217z2.d;
import p217z2.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends ActivityC2686k implements c, t.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f23882B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Resources f23883C;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements d.c {
        public a() {
        }

        @Override // z2.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            b.this.l0().A(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: h.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0554b implements p027d.b {
        public C0554b() {
        }

        @Override // p027d.b
        public void a(Context context) {
            e eVarL0 = b.this.l0();
            eVarL0.s();
            eVarL0.w(b.this.l().b("androidx:appcompat"));
        }
    }

    public b() {
        n0();
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o0();
        l0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(l0().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        p063h.a aVarM0 = m0();
        if (getWindow().hasFeature(0)) {
            if (aVarM0 == null || !aVarM0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // H1.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p063h.a aVarM0 = m0();
        if (keyCode == 82 && aVarM0 != null && aVarM0.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i8) {
        return l0().j(i8);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return l0().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f23883C == null && c0.c()) {
            this.f23883C = new c0(this, super.getResources());
        }
        Resources resources = this.f23883C;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l0().t();
    }

    @Override // H1.t.a
    public Intent j() {
        return h.a(this);
    }

    public e l0() {
        if (this.f23882B == null) {
            this.f23882B = e.h(this, this);
        }
        return this.f23882B;
    }

    public p063h.a m0() {
        return l0().r();
    }

    public final void n0() {
        l().h("androidx:appcompat", new a());
        P(new C0554b());
    }

    public final void o0() {
        T.b(getWindow().getDecorView(), this);
        U.b(getWindow().getDecorView(), this);
        g.b(getWindow().getDecorView(), this);
        J.b(getWindow().getDecorView(), this);
    }

    @Override // p009b.ActivityC1747j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l0().v(configuration);
        if (this.f23883C != null) {
            this.f23883C.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        t0();
    }

    @Override // p111m2.ActivityC2686k, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l0().x();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (v0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // p111m2.ActivityC2686k, p009b.ActivityC1747j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        p063h.a aVarM0 = m0();
        if (menuItem.getItemId() != 16908332 || aVarM0 == null || (aVarM0.i() & 4) == 0) {
            return false;
        }
        return u0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return super.onMenuOpened(i8, menu);
    }

    @Override // p009b.ActivityC1747j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        l0().y(bundle);
    }

    @Override // p111m2.ActivityC2686k, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        l0().z();
    }

    @Override // p111m2.ActivityC2686k, android.app.Activity
    public void onStart() {
        super.onStart();
        l0().B();
    }

    @Override // p111m2.ActivityC2686k, android.app.Activity
    public void onStop() {
        super.onStop();
        l0().C();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i8) {
        super.onTitleChanged(charSequence, i8);
        l0().M(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        p063h.a aVarM0 = m0();
        if (getWindow().hasFeature(0)) {
            if (aVarM0 == null || !aVarM0.p()) {
                super.openOptionsMenu();
            }
        }
    }

    public void p0(t tVar) {
        tVar.m(this);
    }

    @Override // p063h.c
    public p099l.b r(l.b.a aVar) {
        return null;
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void setContentView(int i8) {
        o0();
        l0().G(i8);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(i8);
        l0().L(i8);
    }

    public boolean u0() {
        Intent intentJ = j();
        if (intentJ == null) {
            return false;
        }
        if (!x0(intentJ)) {
            w0(intentJ);
            return true;
        }
        t tVarS = t.s(this);
        p0(tVarS);
        s0(tVarS);
        tVarS.t();
        try {
            H1.a.h(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean v0(KeyEvent keyEvent) {
        return false;
    }

    public void w0(Intent intent) {
        h.e(this, intent);
    }

    public boolean x0(Intent intent) {
        return h.f(this, intent);
    }

    public b(int i8) {
        super(i8);
        n0();
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void setContentView(View view) {
        o0();
        l0().H(view);
    }

    @Override // p009b.ActivityC1747j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o0();
        l0().I(view, layoutParams);
    }

    public void t0() {
    }

    @Override // p063h.c
    public void e(p099l.b bVar) {
    }

    public void q0(P1.g gVar) {
    }

    public void r0(int i8) {
    }

    public void s0(t tVar) {
    }

    @Override // p063h.c
    public void v(p099l.b bVar) {
    }
}
