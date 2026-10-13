package p063h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract int i();

    public Context j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    public boolean n(int i8, KeyEvent keyEvent) {
        return false;
    }

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public p099l.b t(l.b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0553a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23881a;

        public C0553a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23881a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22739t);
            this.f23881a = typedArrayObtainStyledAttributes.getInt(j.f22744u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0553a(int i8, int i9) {
            super(i8, i9);
            this.f23881a = 8388627;
        }

        public C0553a(int i8, int i9, int i10) {
            super(i8, i9);
            this.f23881a = i10;
        }

        public C0553a(int i8) {
            this(-2, -1, i8);
        }

        public C0553a(C0553a c0553a) {
            super((ViewGroup.MarginLayoutParams) c0553a);
            this.f23881a = 0;
            this.f23881a = c0553a.f23881a;
        }

        public C0553a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23881a = 0;
        }
    }

    public void m() {
    }

    public void h(boolean z8) {
    }

    public void l(Configuration configuration) {
    }

    public void q(boolean z8) {
    }

    public void r(boolean z8) {
    }

    public void s(CharSequence charSequence) {
    }
}
