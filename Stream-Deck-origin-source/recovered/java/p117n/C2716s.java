package p117n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p003a2.g;
import p054g.j;

/* JADX INFO: renamed from: n.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2716s extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f30430b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30431a;

    public C2716s(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet, i8, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        X xU = X.u(context, attributeSet, j.f22638Y1, i8, i9);
        if (xU.r(j.f22647a2)) {
            b(xU.a(j.f22647a2, false));
        }
        setBackgroundDrawable(xU.f(j.f22642Z1));
        xU.w();
    }

    public final void b(boolean z8) {
        if (f30430b) {
            this.f30431a = z8;
        } else {
            g.a(this, z8);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9) {
        if (f30430b && this.f30431a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i8, int i9, int i10, int i11) {
        if (f30430b && this.f30431a) {
            i9 -= view.getHeight();
        }
        super.update(view, i8, i9, i10, i11);
    }

    public C2716s(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        a(context, attributeSet, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9, int i10) {
        if (f30430b && this.f30431a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9, i10);
    }
}
