package N4;

/* JADX INFO: renamed from: N4.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1159h0 extends AbstractC1329w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1183j0 f7118c;

    public C1159h0(AbstractC1183j0 abstractC1183j0, int i8) {
        super(abstractC1183j0.size(), i8);
        this.f7118c = abstractC1183j0;
    }

    @Override // N4.AbstractC1329w
    public final Object b(int i8) {
        return this.f7118c.get(i8);
    }
}
