package p191w0;

import E1.p;

/* JADX INFO: renamed from: w0.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3063h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35948d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f35949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35951c;

    public C3063h0(p pVar, boolean z8, boolean z9) {
        this.f35949a = pVar;
        this.f35950b = z8;
        this.f35951c = z9;
    }

    public final p a() {
        return this.f35949a;
    }

    public final boolean b() {
        return this.f35951c;
    }

    public final boolean c() {
        return this.f35950b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3063h0)) {
            return false;
        }
        C3063h0 c3063h0 = (C3063h0) obj;
        return this.f35949a == c3063h0.f35949a && this.f35950b == c3063h0.f35950b && this.f35951c == c3063h0.f35951c;
    }

    public int hashCode() {
        return (((this.f35949a.hashCode() * 31) + Boolean.hashCode(this.f35950b)) * 31) + Boolean.hashCode(this.f35951c);
    }
}
