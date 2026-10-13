package N4;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: N4.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1363z0 extends AbstractC1183j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f7399c;

    public C1363z0(A0 a8) {
        this.f7399c = a8;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1296t.a(i8, this.f7399c.f6207e, "index");
        int i9 = i8 + i8;
        Object obj = this.f7399c.f6206d[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f7399c.f6206d[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7399c.f6207e;
    }
}
