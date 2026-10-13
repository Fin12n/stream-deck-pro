package W;

import A.C0894s;
import Z.JTT.ryTuoS;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894s f10746b;

    public a(int i8, C0894s c0894s) {
        this.f10745a = i8;
        if (c0894s == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f10746b = c0894s;
    }

    @Override // W.h.a
    public C0894s b() {
        return this.f10746b;
    }

    @Override // W.h.a
    public int c() {
        return this.f10745a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h.a) {
            h.a aVar = (h.a) obj;
            if (this.f10745a == aVar.c() && this.f10746b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f10745a ^ 1000003) * 1000003) ^ this.f10746b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f10745a + ryTuoS.dPtTbYBaSDInQ + this.f10746b + "}";
    }
}
