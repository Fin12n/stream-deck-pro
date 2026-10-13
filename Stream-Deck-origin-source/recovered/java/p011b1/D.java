package p011b1;

import p056g1.C2355t;
import p056g1.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f15672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1759g f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f15674c = new A();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2355t f15675d = new C2355t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15676e;

    public D(F f8) {
        this.f15672a = f8;
        this.f15673b = new C1759g(f8.g());
    }

    public final int a(B b8, O o8, boolean z8) {
        int i8;
        boolean z9;
        if (this.f15676e) {
            return E.a(false, false);
        }
        boolean z10 = true;
        try {
            this.f15676e = true;
            C1760h c1760hB = this.f15674c.b(b8, o8);
            int iL = c1760hB.a().l();
            while (true) {
                if (i8 >= iL) {
                    z9 = true;
                    break;
                }
                z zVar = (z) c1760hB.a().m(i8);
                i8 = (zVar.j() || zVar.m()) ? 0 : i8 + 1;
                z9 = false;
                break;
            }
            int iL2 = c1760hB.a().l();
            for (int i9 = 0; i9 < iL2; i9++) {
                z zVar2 = (z) c1760hB.a().m(i9);
                if (z9 || AbstractC1767o.b(zVar2)) {
                    F.w0(this.f15672a, zVar2.i(), this.f15675d, N.g(zVar2.o(), N.f15698a.d()), false, 8, null);
                    if (!this.f15675d.isEmpty()) {
                        this.f15673b.a(zVar2.g(), this.f15675d);
                        this.f15675d.clear();
                    }
                }
            }
            this.f15673b.d();
            boolean zB = this.f15673b.b(c1760hB, z8);
            if (c1760hB.c()) {
                z10 = false;
                break;
            }
            int iL3 = c1760hB.a().l();
            int i10 = 0;
            while (true) {
                if (i10 >= iL3) {
                    z10 = false;
                    break;
                }
                z zVar3 = (z) c1760hB.a().m(i10);
                if (AbstractC1767o.j(zVar3) && zVar3.q()) {
                    break;
                }
                i10++;
            }
            return E.a(zB, z10);
        } finally {
            this.f15676e = false;
        }
    }

    public final void b() {
        if (this.f15676e) {
            return;
        }
        this.f15674c.a();
        this.f15673b.c();
    }
}
