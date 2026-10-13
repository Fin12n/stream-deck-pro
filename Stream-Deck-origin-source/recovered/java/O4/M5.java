package O4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class M5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f7971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N5 f7973e;

    public M5(N5 n8, int i8, int i9) {
        this.f7973e = n8;
        this.f7971c = i8;
        this.f7972d = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f7972d, "index");
        return this.f7973e.get(i8 + this.f7971c);
    }

    @Override // O4.M4
    public final int o() {
        return this.f7973e.t() + this.f7971c + this.f7972d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7972d;
    }

    @Override // O4.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // O4.M4
    public final int t() {
        return this.f7973e.t() + this.f7971c;
    }

    @Override // O4.M4
    public final Object[] y() {
        return this.f7973e.y();
    }

    @Override // O4.N5
    /* JADX INFO: renamed from: z */
    public final N5 subList(int i8, int i9) {
        G1.c(i8, i9, this.f7972d);
        N5 n8 = this.f7973e;
        int i10 = this.f7971c;
        return n8.subList(i8 + i10, i9 + i10);
    }
}
