package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface F extends InterfaceC2213i {
    float b(long j8, float f8, float f9, float f10);

    long c(float f8, float f9, float f10);

    default float d(float f8, float f9, float f10) {
        return b(c(f8, f9, f10), f8, f9, f10);
    }

    float e(long j8, float f8, float f9, float f10);

    @Override // p037e0.InterfaceC2213i
    default r0 a(j0 j0Var) {
        return new r0(this);
    }
}
