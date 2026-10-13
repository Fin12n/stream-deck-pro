package M4;

import java.util.List;

/* JADX INFO: renamed from: M4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1051e extends AbstractC1052f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f5556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f5557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1052f f5558e;

    public C1051e(AbstractC1052f abstractC1052f, int i8, int i9) {
        this.f5558e = abstractC1052f;
        this.f5556c = i8;
        this.f5557d = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        U.a(i8, this.f5557d, "index");
        return this.f5558e.get(i8 + this.f5556c);
    }

    @Override // M4.AbstractC1049c
    public final int o() {
        return this.f5558e.t() + this.f5556c + this.f5557d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5557d;
    }

    @Override // M4.AbstractC1052f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // M4.AbstractC1049c
    public final int t() {
        return this.f5558e.t() + this.f5556c;
    }

    @Override // M4.AbstractC1049c
    public final Object[] y() {
        return this.f5558e.y();
    }

    @Override // M4.AbstractC1052f
    /* JADX INFO: renamed from: z */
    public final AbstractC1052f subList(int i8, int i9) {
        U.c(i8, i9, this.f5557d);
        int i10 = this.f5556c;
        return this.f5558e.subList(i8 + i10, i9 + i10);
    }
}
