package p176u1;

/* JADX INFO: renamed from: u1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3026j implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34447b;

    public C3026j(int i8, int i9) {
        this.f34446a = i8;
        this.f34447b = i9;
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i8 + " and " + i9 + " respectively.").toString());
        }
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        int i8 = this.f34446a;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i9 + 1;
            i9 = (c3030n.k() <= i11 || !AbstractC3028l.b(c3030n.c((c3030n.k() - i11) + (-1)), c3030n.c(c3030n.k() - i11))) ? i11 : i9 + 2;
            if (i9 == c3030n.k()) {
                break;
            }
        }
        int i12 = this.f34447b;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 + 1;
            i13 = (c3030n.j() + i15 >= c3030n.h() || !AbstractC3028l.b(c3030n.c((c3030n.j() + i15) + (-1)), c3030n.c(c3030n.j() + i15))) ? i15 : i13 + 2;
            if (c3030n.j() + i13 == c3030n.h()) {
                break;
            }
        }
        c3030n.b(c3030n.j(), c3030n.j() + i13);
        c3030n.b(c3030n.k() - i9, c3030n.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3026j)) {
            return false;
        }
        C3026j c3026j = (C3026j) obj;
        return this.f34446a == c3026j.f34446a && this.f34447b == c3026j.f34447b;
    }

    public int hashCode() {
        return (this.f34446a * 31) + this.f34447b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f34446a + ", lengthAfterCursor=" + this.f34447b + ')';
    }
}
