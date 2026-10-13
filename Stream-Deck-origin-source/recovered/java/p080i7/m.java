package p080i7;

import G6.g;
import p017b7.F;
import p062g7.AbstractC2376o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f24793c = new m();

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        c.f24774i.q1(runnable, l.f24792h, false);
    }

    @Override // p017b7.F
    public void T0(g gVar, Runnable runnable) {
        c.f24774i.q1(runnable, l.f24792h, true);
    }

    @Override // p017b7.F
    public F k1(int i8) {
        AbstractC2376o.a(i8);
        return i8 >= l.f24788d ? this : super.k1(i8);
    }
}
