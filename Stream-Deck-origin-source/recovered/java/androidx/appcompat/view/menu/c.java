package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f13648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f13649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f13650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.a f13654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f13655i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13656a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarV = c.this.f13649c.v();
            if (gVarV != null) {
                ArrayList arrayListZ = c.this.f13649c.z();
                int size = arrayListZ.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (((g) arrayListZ.get(i8)) == gVarV) {
                        this.f13656a = i8;
                        return;
                    }
                }
            }
            this.f13656a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i8) {
            ArrayList arrayListZ = c.this.f13649c.z();
            int i9 = i8 + c.this.f13651e;
            int i10 = this.f13656a;
            if (i10 >= 0 && i9 >= i10) {
                i9++;
            }
            return (g) arrayListZ.get(i9);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f13649c.z().size() - c.this.f13651e;
            return this.f13656a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f13648b.inflate(cVar.f13653g, viewGroup, false);
            }
            ((j.a) view).d(getItem(i8), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i8) {
        this(i8, 0);
        this.f13647a = context;
        this.f13648b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f13655i == null) {
            this.f13655i = new a();
        }
        return this.f13655i;
    }

    public j b(ViewGroup viewGroup) {
        if (this.f13650d == null) {
            this.f13650d = (ExpandedMenuView) this.f13648b.inflate(p054g.g.f22509g, viewGroup, false);
            if (this.f13655i == null) {
                this.f13655i = new a();
            }
            this.f13650d.setAdapter((ListAdapter) this.f13655i);
            this.f13650d.setOnItemClickListener(this);
        }
        return this.f13650d;
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(e eVar, boolean z8) {
        i.a aVar = this.f13654h;
        if (aVar != null) {
            aVar.c(eVar, z8);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(boolean z8) {
        a aVar = this.f13655i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(i.a aVar) {
        this.f13654h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        if (this.f13652f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f13652f);
            this.f13647a = contextThemeWrapper;
            this.f13648b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f13647a != null) {
            this.f13647a = context;
            if (this.f13648b == null) {
                this.f13648b = LayoutInflater.from(context);
            }
        }
        this.f13649c = eVar;
        a aVar = this.f13655i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean k(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).b(null);
        i.a aVar = this.f13654h;
        if (aVar == null) {
            return true;
        }
        aVar.d(lVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
        this.f13649c.N(this.f13655i.getItem(i8), this, 0);
    }

    public c(int i8, int i9) {
        this.f13653g = i8;
        this.f13652f = i9;
    }
}
