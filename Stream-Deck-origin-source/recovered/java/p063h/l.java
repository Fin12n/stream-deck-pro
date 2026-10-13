package p063h;

import U1.AbstractC1652n;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.T;
import p009b.J;
import p009b.q;
import p054g.a;
import p099l.b;
import p217z2.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l extends q implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f24002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1652n.a f24003e;

    public l(Context context) {
        this(context, 0);
    }

    public static int h(Context context, int i8) {
        if (i8 != 0) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.f22355A, typedValue, true);
        return typedValue.resourceId;
    }

    private void i() {
        T.b(getWindow().getDecorView(), this);
        g.b(getWindow().getDecorView(), this);
        J.b(getWindow().getDecorView(), this);
    }

    @Override // p009b.q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        g().x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1652n.b(this.f24003e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i8) {
        return g().j(i8);
    }

    public e g() {
        if (this.f24002d == null) {
            this.f24002d = e.i(this, this);
        }
        return this.f24002d;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        g().t();
    }

    public boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i8) {
        return g().F(i8);
    }

    @Override // p009b.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        g().s();
        super.onCreate(bundle);
        g().w(bundle);
    }

    @Override // p009b.q, android.app.Dialog
    public void onStop() {
        super.onStop();
        g().C();
    }

    @Override // p063h.c
    public b r(b.a aVar) {
        return null;
    }

    @Override // p009b.q, android.app.Dialog
    public void setContentView(int i8) {
        i();
        g().G(i8);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().M(charSequence);
    }

    public l(Context context, int i8) {
        super(context, h(context, i8));
        this.f24003e = new AbstractC1652n.a() { // from class: h.k
            @Override // U1.AbstractC1652n.a
            public final boolean o(KeyEvent keyEvent) {
                return this.f24001a.j(keyEvent);
            }
        };
        e eVarG = g();
        eVarG.L(h(context, i8));
        eVarG.w(null);
    }

    @Override // p009b.q, android.app.Dialog
    public void setContentView(View view) {
        i();
        g().H(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i8) {
        super.setTitle(i8);
        g().M(getContext().getString(i8));
    }

    @Override // p009b.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        g().I(view, layoutParams);
    }

    @Override // p063h.c
    public void e(b bVar) {
    }

    @Override // p063h.c
    public void v(b bVar) {
    }
}
