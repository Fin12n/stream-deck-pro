package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.a f13692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f13693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.a f13694d;

    public f(e eVar) {
        this.f13691a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f13692b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f13691a;
        androidx.appcompat.app.a.C0340a c0340a = new androidx.appcompat.app.a.C0340a(eVar.u());
        c cVar = new c(c0340a.b(), p054g.g.f22512j);
        this.f13693c = cVar;
        cVar.h(this);
        this.f13691a.b(this.f13693c);
        c0340a.c(this.f13693c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0340a.d(viewY);
        } else {
            c0340a.e(eVar.w()).h(eVar.x());
        }
        c0340a.f(this);
        androidx.appcompat.app.a aVarA = c0340a.a();
        this.f13692b = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f13692b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f13692b.show();
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void c(e eVar, boolean z8) {
        if (z8 || eVar == this.f13691a) {
            a();
        }
        i.a aVar = this.f13694d;
        if (aVar != null) {
            aVar.c(eVar, z8);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean d(e eVar) {
        i.a aVar = this.f13694d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i8) {
        this.f13691a.M((g) this.f13693c.a().getItem(i8), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f13693c.c(this.f13691a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i8 == 82 || i8 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13692b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13692b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f13691a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f13691a.performShortcut(i8, keyEvent, 0);
    }
}
