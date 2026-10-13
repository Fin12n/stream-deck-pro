package p099l;

import N1.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p010b0.C;
import p108m.c;
import p108m.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f28836b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f28837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f28838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f28839c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C f28840d = new C();

        public a(Context context, ActionMode.Callback callback) {
            this.f28838b = context;
            this.f28837a = callback;
        }

        @Override // l.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f28837a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // l.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f28837a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // l.b.a
        public void c(b bVar) {
            this.f28837a.onDestroyActionMode(e(bVar));
        }

        @Override // l.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f28837a.onActionItemClicked(e(bVar), new c(this.f28838b, (b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f28839c.size();
            for (int i8 = 0; i8 < size; i8++) {
                f fVar = (f) this.f28839c.get(i8);
                if (fVar != null && fVar.f28836b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f28838b, bVar);
            this.f28839c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f28840d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            e eVar = new e(this.f28838b, (N1.a) menu);
            this.f28840d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f28835a = context;
        this.f28836b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f28836b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f28836b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new e(this.f28835a, (N1.a) this.f28836b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f28836b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f28836b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f28836b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f28836b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f28836b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f28836b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f28836b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f28836b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f28836b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f28836b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f28836b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z8) {
        this.f28836b.s(z8);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i8) {
        this.f28836b.n(i8);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i8) {
        this.f28836b.q(i8);
    }
}
