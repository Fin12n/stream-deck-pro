package p215z0;

/* JADX INFO: renamed from: z0.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3162k0 extends InterfaceC3144b0, InterfaceC3164l0 {
    @Override // p215z0.InterfaceC3144b0
    long a();

    @Override // p215z0.InterfaceC3164l0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        w(((Number) obj).longValue());
    }

    void v(long j8);

    default void w(long j8) {
        v(j8);
    }

    @Override // p215z0.q1
    default Long getValue() {
        return Long.valueOf(a());
    }
}
