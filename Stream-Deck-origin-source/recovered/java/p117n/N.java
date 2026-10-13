package p117n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class N extends L implements M {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static Method f30276V;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public M f30277I;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z8) {
            popupWindow.setTouchModal(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends I {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f30278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f30279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public M f30280p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public MenuItem f30281q;

        public c(Context context, boolean z8) {
            super(context, z8);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f30278n = 21;
                this.f30279o = 22;
            } else {
                this.f30278n = 22;
                this.f30279o = 21;
            }
        }

        @Override // p117n.I
        public /* bridge */ /* synthetic */ int d(int i8, int i9, int i10, int i11, int i12) {
            return super.d(i8, i9, i10, i11, i12);
        }

        @Override // p117n.I
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i8) {
            return super.e(motionEvent, i8);
        }

        @Override // p117n.I, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p117n.I, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p117n.I, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p117n.I, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p117n.I, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            d dVar;
            int headersCount;
            int iPointToPosition;
            int i8;
            if (this.f30280p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    headersCount = 0;
                }
                g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = iPointToPosition - headersCount) < 0 || i8 >= dVar.getCount()) ? null : dVar.getItem(i8);
                MenuItem menuItem = this.f30281q;
                if (menuItem != item) {
                    e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f30280p.g(eVarB, menuItem);
                    }
                    this.f30281q = item;
                    if (item != null) {
                        this.f30280p.d(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.f30278n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i8 != this.f30279o) {
                return super.onKeyDown(i8, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (d) adapter).b().e(false);
            return true;
        }

        @Override // p117n.I, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(M m8) {
            this.f30280p = m8;
        }

        @Override // p117n.I, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f30276V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public N(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    public void N(Object obj) {
        a.a(this.f30242F, (Transition) obj);
    }

    public void O(Object obj) {
        a.b(this.f30242F, (Transition) obj);
    }

    public void P(M m8) {
        this.f30277I = m8;
    }

    public void Q(boolean z8) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f30242F, z8);
            return;
        }
        Method method = f30276V;
        if (method != null) {
            try {
                method.invoke(this.f30242F, Boolean.valueOf(z8));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // p117n.M
    public void d(e eVar, MenuItem menuItem) {
        M m8 = this.f30277I;
        if (m8 != null) {
            m8.d(eVar, menuItem);
        }
    }

    @Override // p117n.M
    public void g(e eVar, MenuItem menuItem) {
        M m8 = this.f30277I;
        if (m8 != null) {
            m8.g(eVar, menuItem);
        }
    }

    @Override // p117n.L
    public I s(Context context, boolean z8) {
        c cVar = new c(context, z8);
        cVar.setHoverListener(this);
        return cVar;
    }
}
