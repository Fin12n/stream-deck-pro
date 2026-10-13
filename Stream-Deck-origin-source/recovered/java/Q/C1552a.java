package Q;

/* JADX INFO: renamed from: Q.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1552a extends C1570t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F1.c.a f9000c;

    public C1552a(int i8, int i9, F1.c.a aVar) {
        this.f8998a = i8;
        this.f8999b = i9;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f9000c = aVar;
    }

    @Override // Q.C1570t.b
    public F1.c.a a() {
        return this.f9000c;
    }

    @Override // Q.C1570t.b
    public int b() {
        return this.f8998a;
    }

    @Override // Q.C1570t.b
    public int c() {
        return this.f8999b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1570t.b) {
            C1570t.b bVar = (C1570t.b) obj;
            if (this.f8998a == bVar.b() && this.f8999b == bVar.c() && this.f9000c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8998a ^ 1000003) * 1000003) ^ this.f8999b) * 1000003) ^ this.f9000c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f8998a + ", rotationDegrees=" + this.f8999b + ", completer=" + this.f9000c + "}";
    }
}
