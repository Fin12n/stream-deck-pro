package M4;

import java.util.Objects;

/* JADX INFO: renamed from: M4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1058l extends AbstractC1052f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1052f f5570e = new C1058l(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f5571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f5572d;

    public C1058l(Object[] objArr, int i8) {
        this.f5571c = objArr;
        this.f5572d = i8;
    }

    @Override // M4.AbstractC1052f, M4.AbstractC1049c
    public final int c(Object[] objArr, int i8) {
        System.arraycopy(this.f5571c, 0, objArr, 0, this.f5572d);
        return this.f5572d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        U.a(i8, this.f5572d, "index");
        Object obj = this.f5571c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // M4.AbstractC1049c
    public final int o() {
        return this.f5572d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5572d;
    }

    @Override // M4.AbstractC1049c
    public final int t() {
        return 0;
    }

    @Override // M4.AbstractC1049c
    public final Object[] y() {
        return this.f5571c;
    }
}
