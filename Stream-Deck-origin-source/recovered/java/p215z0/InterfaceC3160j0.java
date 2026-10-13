package p215z0;

/* JADX INFO: renamed from: z0.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3160j0 extends S, InterfaceC3164l0 {
    @Override // p215z0.S
    int f();

    void p(int i8);

    @Override // p215z0.InterfaceC3164l0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        x(((Number) obj).intValue());
    }

    default void x(int i8) {
        p(i8);
    }

    @Override // p215z0.q1
    default Integer getValue() {
        return Integer.valueOf(f());
    }
}
