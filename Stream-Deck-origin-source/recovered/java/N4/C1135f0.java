package N4;

import java.io.Serializable;

/* JADX INFO: renamed from: N4.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1135f0 extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7092b;

    public C1135f0(Object obj, Object obj2) {
        this.f7091a = obj;
        this.f7092b = obj2;
    }

    @Override // N4.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f7091a;
    }

    @Override // N4.J, java.util.Map.Entry
    public final Object getValue() {
        return this.f7092b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
