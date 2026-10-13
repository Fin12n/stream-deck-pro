package N4;

import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E6 f6283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f6285c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f6286d = null;

    public /* synthetic */ G6(D6 d8, F6 f8) {
        this.f6283a = d8.f6247a;
        this.f6284b = d8.f6248b;
    }

    public final E6 a() {
        return this.f6283a;
    }

    public final Integer b() {
        return this.f6284b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G6)) {
            return false;
        }
        G6 g8 = (G6) obj;
        return AbstractC3206o.a(this.f6283a, g8.f6283a) && AbstractC3206o.a(this.f6284b, g8.f6284b) && AbstractC3206o.a(null, null) && AbstractC3206o.a(null, null);
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f6283a, this.f6284b, null, null);
    }
}
