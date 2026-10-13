package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L5 extends I2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N5 f7958c;

    public L5(N5 n8, int i8) {
        super(n8.size(), i8);
        this.f7958c = n8;
    }

    @Override // O4.I2
    public final Object b(int i8) {
        return this.f7958c.get(i8);
    }
}
