package p176u1;

import p128o1.AbstractC2743h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC3027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34349a;

    public B(int i8) {
        this.f34349a = i8;
    }

    @Override // p176u1.InterfaceC3027k
    public void a(C3030n c3030n) {
        if (c3030n.g() == -1) {
            c3030n.o(c3030n.k());
        }
        int iK = c3030n.k();
        String string = c3030n.toString();
        int i8 = this.f34349a;
        int i9 = 0;
        if (i8 <= 0) {
            int i10 = -i8;
            while (i9 < i10) {
                int iB = AbstractC2743h.b(string, iK);
                if (iB == -1) {
                    break;
                }
                i9++;
                iK = iB;
            }
        } else {
            while (i9 < i8) {
                int iA = AbstractC2743h.a(string, iK);
                if (iA == -1) {
                    break;
                }
                i9++;
                iK = iA;
            }
        }
        c3030n.o(iK);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f34349a == ((B) obj).f34349a;
    }

    public int hashCode() {
        return this.f34349a;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.f34349a + ')';
    }
}
