package p166t;

import java.util.List;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2931e extends R1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33647e;

    public C2931e(List list, List list2, int i8, int i9, int i10) {
        this.f33643a = list;
        this.f33644b = list2;
        this.f33645c = i8;
        this.f33646d = i9;
        this.f33647e = i10;
    }

    @Override // t.R1.b
    public List a() {
        return this.f33643a;
    }

    @Override // t.R1.b
    public List b() {
        return this.f33644b;
    }

    @Override // t.R1.b
    public int c() {
        return this.f33647e;
    }

    @Override // t.R1.b
    public int d() {
        return this.f33645c;
    }

    @Override // t.R1.b
    public int e() {
        return this.f33646d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof R1.b) {
            R1.b bVar = (R1.b) obj;
            List list = this.f33643a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List list2 = this.f33644b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f33645c == bVar.d() && this.f33646d == bVar.e() && this.f33647e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List list = this.f33643a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.f33644b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f33645c) * 1000003) ^ this.f33646d) * 1000003) ^ this.f33647e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f33643a + ", bestSizesForStreamUseCase=" + this.f33644b + ", maxFpsForBestSizes=" + this.f33645c + ", maxFpsForStreamUseCase=" + this.f33646d + ", maxFpsForAllSizes=" + this.f33647e + "}";
    }
}
