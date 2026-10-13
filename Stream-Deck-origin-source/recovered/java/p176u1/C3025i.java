package p176u1;

/* JADX INFO: renamed from: u1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3025i implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34445b;

    public C3025i(int i8, int i9) {
        this.f34444a = i8;
        this.f34445b = i9;
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i8 + " and " + i9 + " respectively.").toString());
        }
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        int iJ = c3030n.j();
        int i8 = this.f34445b;
        int iH = iJ + i8;
        if (((iJ ^ iH) & (i8 ^ iH)) < 0) {
            iH = c3030n.h();
        }
        c3030n.b(c3030n.j(), Math.min(iH, c3030n.h()));
        int iK = c3030n.k();
        int i9 = this.f34444a;
        int i10 = iK - i9;
        if (((iK ^ i10) & (i9 ^ iK)) < 0) {
            i10 = 0;
        }
        c3030n.b(Math.max(0, i10), c3030n.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3025i)) {
            return false;
        }
        C3025i c3025i = (C3025i) obj;
        return this.f34444a == c3025i.f34444a && this.f34445b == c3025i.f34445b;
    }

    public int hashCode() {
        return (this.f34444a * 31) + this.f34445b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f34444a + ", lengthAfterCursor=" + this.f34445b + ')';
    }
}
