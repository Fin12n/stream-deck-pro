package p166t;

import android.util.Range;

/* JADX INFO: renamed from: t.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2934f extends R1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f33657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range f33658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f33659j;

    public C2934f(int i8, boolean z8, int i9, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Range range, boolean z14) {
        this.f33650a = i8;
        this.f33651b = z8;
        this.f33652c = i9;
        this.f33653d = z9;
        this.f33654e = z10;
        this.f33655f = z11;
        this.f33656g = z12;
        this.f33657h = z13;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f33658i = range;
        this.f33659j = z14;
    }

    @Override // t.R1.d
    public int a() {
        return this.f33650a;
    }

    @Override // t.R1.d
    public int b() {
        return this.f33652c;
    }

    @Override // t.R1.d
    public Range c() {
        return this.f33658i;
    }

    @Override // t.R1.d
    public boolean d() {
        return this.f33651b;
    }

    @Override // t.R1.d
    public boolean e() {
        return this.f33656g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof R1.d) {
            R1.d dVar = (R1.d) obj;
            if (this.f33650a == dVar.a() && this.f33651b == dVar.d() && this.f33652c == dVar.b() && this.f33653d == dVar.g() && this.f33654e == dVar.i() && this.f33655f == dVar.f() && this.f33656g == dVar.e() && this.f33657h == dVar.k() && this.f33658i.equals(dVar.c()) && this.f33659j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // t.R1.d
    public boolean f() {
        return this.f33655f;
    }

    @Override // t.R1.d
    public boolean g() {
        return this.f33653d;
    }

    @Override // t.R1.d
    public boolean h() {
        return this.f33659j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f33650a ^ 1000003) * 1000003) ^ (this.f33651b ? 1231 : 1237)) * 1000003) ^ this.f33652c) * 1000003) ^ (this.f33653d ? 1231 : 1237)) * 1000003) ^ (this.f33654e ? 1231 : 1237)) * 1000003) ^ (this.f33655f ? 1231 : 1237)) * 1000003) ^ (this.f33656g ? 1231 : 1237)) * 1000003) ^ (this.f33657h ? 1231 : 1237)) * 1000003) ^ this.f33658i.hashCode()) * 1000003) ^ (this.f33659j ? 1231 : 1237);
    }

    @Override // t.R1.d
    public boolean i() {
        return this.f33654e;
    }

    @Override // t.R1.d
    public boolean k() {
        return this.f33657h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f33650a + ", hasVideoCapture=" + this.f33651b + ", getRequiredMaxBitDepth=" + this.f33652c + ", isPreviewStabilizationOn=" + this.f33653d + ", isUltraHdrOn=" + this.f33654e + ", isHighSpeedOn=" + this.f33655f + ", isFeatureComboInvocation=" + this.f33656g + ", requiresFeatureComboQuery=" + this.f33657h + ", getTargetFpsRange=" + this.f33658i + ", isStrictFpsRequired=" + this.f33659j + "}";
    }
}
