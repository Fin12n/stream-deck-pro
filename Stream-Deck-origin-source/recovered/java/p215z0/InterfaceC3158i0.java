package p215z0;

/* JADX INFO: renamed from: z0.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3158i0 extends L, InterfaceC3164l0 {
    @Override // p215z0.L
    float b();

    void k(float f8);

    @Override // p215z0.InterfaceC3164l0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        y(((Number) obj).floatValue());
    }

    default void y(float f8) {
        k(f8);
    }

    @Override // p215z0.q1
    default Float getValue() {
        return Float.valueOf(b());
    }
}
