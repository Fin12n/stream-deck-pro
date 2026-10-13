package O4;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5 f8048c;

    public T5(U5 u8) {
        this.f8048c = u8;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        G1.a(i8, this.f8048c.f8060e, "index");
        U5 u8 = this.f8048c;
        int i9 = i8 + i8;
        Object obj = u8.f8059d[i9];
        obj.getClass();
        Object obj2 = u8.f8059d[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8048c.f8060e;
    }
}
