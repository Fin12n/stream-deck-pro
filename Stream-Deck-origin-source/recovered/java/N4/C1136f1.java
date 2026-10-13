package N4;

import p219z4.AbstractC3206o;

/* JADX INFO: renamed from: N4.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1136f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y6 f7093a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f7095c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1339w9 f7097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1183j0 f7098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1183j0 f7099g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7094b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G6 f7096d = null;

    public /* synthetic */ C1136f1(C1112d1 c1112d1, AbstractC1124e1 abstractC1124e1) {
        this.f7093a = c1112d1.f7077a;
        this.f7095c = c1112d1.f7078b;
        this.f7097e = c1112d1.f7079c;
        this.f7098f = c1112d1.f7080d;
        this.f7099g = c1112d1.f7081e;
    }

    public final AbstractC1183j0 a() {
        return this.f7098f;
    }

    public final AbstractC1183j0 b() {
        return this.f7099g;
    }

    public final Y6 c() {
        return this.f7093a;
    }

    public final C1339w9 d() {
        return this.f7097e;
    }

    public final Boolean e() {
        return this.f7095c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1136f1)) {
            return false;
        }
        C1136f1 c1136f1 = (C1136f1) obj;
        return AbstractC3206o.a(this.f7093a, c1136f1.f7093a) && AbstractC3206o.a(null, null) && AbstractC3206o.a(this.f7095c, c1136f1.f7095c) && AbstractC3206o.a(null, null) && AbstractC3206o.a(this.f7097e, c1136f1.f7097e) && AbstractC3206o.a(this.f7098f, c1136f1.f7098f) && AbstractC3206o.a(this.f7099g, c1136f1.f7099g);
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f7093a, null, this.f7095c, null, this.f7097e, this.f7098f, this.f7099g);
    }
}
