package p109m0;

import B0.d;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC2666d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f29353a = new d(new InterfaceC2666d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2666d.a f29355c;

    @Override // p109m0.InterfaceC2666d
    public void a(int i8, int i9, k kVar) {
        c(i8);
        c(i9);
        if (i9 < i8) {
            throw new IllegalArgumentException(("toIndex (" + i9 + ") should be not smaller than fromIndex (" + i8 + ')').toString());
        }
        int iB = AbstractC2667e.b(this.f29353a, i8);
        int iB2 = ((InterfaceC2666d.a) this.f29353a.r()[iB]).b();
        while (iB2 <= i9) {
            InterfaceC2666d.a aVar = (InterfaceC2666d.a) this.f29353a.r()[iB];
            kVar.invoke(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void b(int i8, Object obj) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i8).toString());
        }
        if (i8 == 0) {
            return;
        }
        InterfaceC2666d.a aVar = new InterfaceC2666d.a(k(), i8, obj);
        this.f29354b = k() + i8;
        this.f29353a.d(aVar);
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= k()) {
            throw new IndexOutOfBoundsException("Index " + i8 + ", size " + k());
        }
    }

    public final boolean d(InterfaceC2666d.a aVar, int i8) {
        return i8 < aVar.b() + aVar.a() && aVar.b() <= i8;
    }

    public final InterfaceC2666d.a e(int i8) {
        InterfaceC2666d.a aVar = this.f29355c;
        if (aVar != null && d(aVar, i8)) {
            return aVar;
        }
        d dVar = this.f29353a;
        InterfaceC2666d.a aVar2 = (InterfaceC2666d.a) dVar.r()[AbstractC2667e.b(dVar, i8)];
        this.f29355c = aVar2;
        return aVar2;
    }

    @Override // p109m0.InterfaceC2666d
    public InterfaceC2666d.a get(int i8) {
        c(i8);
        return e(i8);
    }

    @Override // p109m0.InterfaceC2666d
    public int k() {
        return this.f29354b;
    }
}
