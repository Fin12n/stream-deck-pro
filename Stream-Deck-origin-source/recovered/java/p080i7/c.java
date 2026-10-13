package p080i7;

import p017b7.F;
import p062g7.AbstractC2376o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f24774i = new c();

    public c() {
        super(l.f24787c, l.f24788d, l.f24789e, l.f24785a);
    }

    @Override // p080i7.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p017b7.F
    public F k1(int i8) {
        AbstractC2376o.a(i8);
        return i8 >= l.f24787c ? this : super.k1(i8);
    }

    @Override // p017b7.F
    public String toString() {
        return "Dispatchers.Default";
    }
}
