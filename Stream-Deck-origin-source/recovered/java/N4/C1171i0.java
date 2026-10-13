package N4;

import java.util.List;

/* JADX INFO: renamed from: N4.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1171i0 extends AbstractC1183j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1183j0 f7137e;

    public C1171i0(AbstractC1183j0 abstractC1183j0, int i8, int i9) {
        this.f7137e = abstractC1183j0;
        this.f7135c = i8;
        this.f7136d = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1296t.a(i8, this.f7136d, "index");
        return this.f7137e.get(i8 + this.f7135c);
    }

    @Override // N4.AbstractC1123e0
    public final int o() {
        return this.f7137e.t() + this.f7135c + this.f7136d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7136d;
    }

    @Override // N4.AbstractC1183j0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // N4.AbstractC1123e0
    public final int t() {
        return this.f7137e.t() + this.f7135c;
    }

    @Override // N4.AbstractC1123e0
    public final Object[] y() {
        return this.f7137e.y();
    }

    @Override // N4.AbstractC1183j0
    /* JADX INFO: renamed from: z */
    public final AbstractC1183j0 subList(int i8, int i9) {
        AbstractC1296t.d(i8, i9, this.f7136d);
        int i10 = this.f7135c;
        return this.f7137e.subList(i8 + i10, i9 + i10);
    }
}
