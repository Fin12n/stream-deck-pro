package p012b2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f15828l;

    @Deprecated
    public c(Context context, int i8, Cursor cursor) {
        super(context, cursor);
        this.f15827k = i8;
        this.f15826j = i8;
        this.f15828l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p012b2.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15828l.inflate(this.f15827k, viewGroup, false);
    }

    @Override // p012b2.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15828l.inflate(this.f15826j, viewGroup, false);
    }

    @Deprecated
    public c(Context context, int i8, Cursor cursor, boolean z8) {
        super(context, cursor, z8);
        this.f15827k = i8;
        this.f15826j = i8;
        this.f15828l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i8, Cursor cursor, int i9) {
        super(context, cursor, i9);
        this.f15827k = i8;
        this.f15826j = i8;
        this.f15828l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
