package M4;

/* JADX INFO: renamed from: M4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1050d extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1052f f5555c;

    public C1050d(AbstractC1052f abstractC1052f, int i8) {
        super(abstractC1052f.size(), i8);
        this.f5555c = abstractC1052f;
    }

    @Override // M4.W
    public final Object b(int i8) {
        return this.f5555c.get(i8);
    }
}
