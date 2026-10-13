package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import p063h.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends l implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AlertController f13565f;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0340a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f13566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13567b;

        public C0340a(Context context) {
            this(context, a.n(context, 0));
        }

        public a a() {
            a aVar = new a(this.f13566a.f13526a, this.f13567b);
            this.f13566a.a(aVar.f13565f);
            aVar.setCancelable(this.f13566a.f13543r);
            if (this.f13566a.f13543r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f13566a.f13544s);
            aVar.setOnDismissListener(this.f13566a.f13545t);
            DialogInterface.OnKeyListener onKeyListener = this.f13566a.f13546u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f13566a.f13526a;
        }

        public C0340a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13566a;
            bVar.f13548w = listAdapter;
            bVar.f13549x = onClickListener;
            return this;
        }

        public C0340a d(View view) {
            this.f13566a.f13532g = view;
            return this;
        }

        public C0340a e(Drawable drawable) {
            this.f13566a.f13529d = drawable;
            return this;
        }

        public C0340a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f13566a.f13546u = onKeyListener;
            return this;
        }

        public C0340a g(ListAdapter listAdapter, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f13566a;
            bVar.f13548w = listAdapter;
            bVar.f13549x = onClickListener;
            bVar.f13519I = i8;
            bVar.f13518H = true;
            return this;
        }

        public C0340a h(CharSequence charSequence) {
            this.f13566a.f13531f = charSequence;
            return this;
        }

        public C0340a(Context context, int i8) {
            this.f13566a = new AlertController.b(new ContextThemeWrapper(context, a.n(context, i8)));
            this.f13567b = i8;
        }
    }

    public a(Context context, int i8) {
        super(context, n(context, i8));
        this.f13565f = new AlertController(getContext(), this, getWindow());
    }

    public static int n(Context context, int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p054g.a.f22386p, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView m() {
        return this.f13565f.d();
    }

    @Override // p063h.l, p009b.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13565f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (this.f13565f.f(i8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (this.f13565f.g(i8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    @Override // p063h.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f13565f.p(charSequence);
    }
}
