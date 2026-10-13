package N4;

import p219z4.AbstractC3206o;

/* JADX INFO: renamed from: N4.w9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1339w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1183j0 f7369a;

    public /* synthetic */ C1339w9(C1317u9 c1317u9, AbstractC1328v9 abstractC1328v9) {
        this.f7369a = c1317u9.f7350a;
    }

    public final AbstractC1183j0 a() {
        return this.f7369a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1339w9) {
            return AbstractC3206o.a(this.f7369a, ((C1339w9) obj).f7369a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f7369a);
    }
}
