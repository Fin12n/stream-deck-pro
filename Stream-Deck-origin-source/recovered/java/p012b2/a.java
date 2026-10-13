package p012b2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b2.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f15817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0394a f15819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DataSetObserver f15820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p012b2.b f15821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FilterQueryProvider f15822i;

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0394a extends ContentObserver {
        public C0394a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z8) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f15814a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f15814a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        e(context, cursor, 1);
    }

    @Override // b2.b.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // b2.b.a
    public Cursor b() {
        return this.f15816c;
    }

    @Override // b2.b.a
    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f15822i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f15816c;
    }

    @Override // b2.b.a
    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i8) {
        if ((i8 & 1) == 1) {
            i8 |= 2;
            this.f15815b = true;
        } else {
            this.f15815b = false;
        }
        boolean z8 = cursor != null;
        this.f15816c = cursor;
        this.f15814a = z8;
        this.f15817d = context;
        this.f15818e = z8 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i8 & 2) == 2) {
            this.f15819f = new C0394a();
            this.f15820g = new b();
        } else {
            this.f15819f = null;
            this.f15820g = null;
        }
        if (z8) {
            C0394a c0394a = this.f15819f;
            if (c0394a != null) {
                cursor.registerContentObserver(c0394a);
            }
            DataSetObserver dataSetObserver = this.f15820g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f15814a || (cursor = this.f15816c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f15814a) {
            return null;
        }
        this.f15816c.moveToPosition(i8);
        if (view == null) {
            view = f(this.f15817d, this.f15816c, viewGroup);
        }
        d(view, this.f15817d, this.f15816c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f15821h == null) {
            this.f15821h = new p012b2.b(this);
        }
        return this.f15821h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i8) {
        Cursor cursor;
        if (!this.f15814a || (cursor = this.f15816c) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f15816c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        Cursor cursor;
        if (this.f15814a && (cursor = this.f15816c) != null && cursor.moveToPosition(i8)) {
            return this.f15816c.getLong(this.f15818e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f15814a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f15816c.moveToPosition(i8)) {
            if (view == null) {
                view = g(this.f15817d, this.f15816c, viewGroup);
            }
            d(view, this.f15817d, this.f15816c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i8);
    }

    public void h() {
        Cursor cursor;
        if (!this.f15815b || (cursor = this.f15816c) == null || cursor.isClosed()) {
            return;
        }
        this.f15814a = this.f15816c.requery();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f15816c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0394a c0394a = this.f15819f;
            if (c0394a != null) {
                cursor2.unregisterContentObserver(c0394a);
            }
            DataSetObserver dataSetObserver = this.f15820g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f15816c = cursor;
        if (cursor == null) {
            this.f15818e = -1;
            this.f15814a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0394a c0394a2 = this.f15819f;
        if (c0394a2 != null) {
            cursor.registerContentObserver(c0394a2);
        }
        DataSetObserver dataSetObserver2 = this.f15820g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f15818e = cursor.getColumnIndexOrThrow("_id");
        this.f15814a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z8) {
        e(context, cursor, z8 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i8) {
        e(context, cursor, i8);
    }
}
