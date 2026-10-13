package M4;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: M4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1059m extends AbstractC1052f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1060n f5573c;

    public C1059m(C1060n c1060n) {
        this.f5573c = c1060n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        U.a(i8, this.f5573c.f5576e, "index");
        int i9 = i8 + i8;
        Object obj = this.f5573c.f5575d[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f5573c.f5575d[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5573c.f5576e;
    }
}
