package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13659b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f13662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13663f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z8, int i8) {
        this.f13661d = z8;
        this.f13662e = layoutInflater;
        this.f13658a = eVar;
        this.f13663f = i8;
        a();
    }

    public void a() {
        g gVarV = this.f13658a.v();
        if (gVarV != null) {
            ArrayList arrayListZ = this.f13658a.z();
            int size = arrayListZ.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((g) arrayListZ.get(i8)) == gVarV) {
                    this.f13659b = i8;
                    return;
                }
            }
        }
        this.f13659b = -1;
    }

    public e b() {
        return this.f13658a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i8) {
        ArrayList arrayListZ = this.f13661d ? this.f13658a.z() : this.f13658a.E();
        int i9 = this.f13659b;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return (g) arrayListZ.get(i8);
    }

    public void d(boolean z8) {
        this.f13660c = z8;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListZ = this.f13661d ? this.f13658a.z() : this.f13658a.E();
        return this.f13659b < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13662e.inflate(this.f13663f, viewGroup, false);
        }
        int groupId = getItem(i8).getGroupId();
        int i9 = i8 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f13658a.G() && groupId != (i9 >= 0 ? getItem(i9).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f13660c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i8), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
