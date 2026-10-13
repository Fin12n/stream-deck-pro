package N4;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f6623c;

    public X(Z z8, int i8) {
        this.f6623c = z8;
        this.f6621a = Z.j(z8, i8);
        this.f6622b = i8;
    }

    public final void a() {
        int i8 = this.f6622b;
        if (i8 == -1 || i8 >= this.f6623c.size() || !r.a(this.f6621a, Z.j(this.f6623c, this.f6622b))) {
            this.f6622b = this.f6623c.D(this.f6621a);
        }
    }

    @Override // N4.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f6621a;
    }

    @Override // N4.J, java.util.Map.Entry
    public final Object getValue() {
        Map mapP = this.f6623c.p();
        if (mapP != null) {
            return mapP.get(this.f6621a);
        }
        a();
        int i8 = this.f6622b;
        if (i8 == -1) {
            return null;
        }
        return Z.n(this.f6623c, i8);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapP = this.f6623c.p();
        if (mapP != null) {
            return mapP.put(this.f6621a, obj);
        }
        a();
        int i8 = this.f6622b;
        if (i8 == -1) {
            this.f6623c.put(this.f6621a, obj);
            return null;
        }
        Z z8 = this.f6623c;
        Object objN = Z.n(z8, i8);
        Z.r(z8, this.f6622b, obj);
        return objN;
    }
}
