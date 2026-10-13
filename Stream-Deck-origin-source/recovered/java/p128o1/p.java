package p128o1;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f30836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30838c;

    public p(q qVar, int i8, int i9) {
        this.f30836a = qVar;
        this.f30837b = i8;
        this.f30838c = i9;
    }

    public final int a() {
        return this.f30838c;
    }

    public final q b() {
        return this.f30836a;
    }

    public final int c() {
        return this.f30837b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return t.c(this.f30836a, pVar.f30836a) && this.f30837b == pVar.f30837b && this.f30838c == pVar.f30838c;
    }

    public int hashCode() {
        return (((this.f30836a.hashCode() * 31) + Integer.hashCode(this.f30837b)) * 31) + Integer.hashCode(this.f30838c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f30836a + ", startIndex=" + this.f30837b + ", endIndex=" + this.f30838c + ')';
    }
}
