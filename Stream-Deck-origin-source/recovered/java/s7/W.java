package s7;

import C6.C0920i;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W extends AbstractC2894a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2913u f33225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f33226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2898e f33228h;

    public /* synthetic */ W(InterfaceC2913u interfaceC2913u, char[] cArr, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC2913u, (i8 & 2) != 0 ? C2904k.f33288c.c() : cArr);
    }

    @Override // s7.AbstractC2894a
    public String G(String keyToMatch, boolean z8) {
        kotlin.jvm.internal.t.g(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // s7.AbstractC2894a
    public int J(int i8) {
        if (i8 < D().length()) {
            return i8;
        }
        this.f33249a = i8;
        u();
        return (this.f33249a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // s7.AbstractC2894a
    public String M(int i8, int i9) {
        return D().e(i8, i9);
    }

    @Override // s7.AbstractC2894a
    public boolean O() {
        int iL = L();
        if (iL >= D().length() || iL == -1 || D().charAt(iL) != ',') {
            return false;
        }
        this.f33249a++;
        return true;
    }

    @Override // s7.AbstractC2894a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C2898e D() {
        return this.f33228h;
    }

    public int U(char c8, int i8) {
        C2898e c2898eD = D();
        int length = c2898eD.length();
        while (i8 < length) {
            if (c2898eD.charAt(i8) == c8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public final void V(int i8) {
        char[] cArrB = D().b();
        if (i8 != 0) {
            int i9 = this.f33249a;
            C0933m.e(cArrB, cArrB, 0, i9, i9 + i8);
        }
        int length = D().length();
        while (i8 != length) {
            int iA = this.f33225e.a(cArrB, i8, length - i8);
            if (iA == -1) {
                D().f(i8);
                this.f33227g = -1;
                break;
            }
            i8 += iA;
        }
        this.f33249a = 0;
    }

    @Override // s7.AbstractC2894a
    public void d(int i8, int i9) {
        StringBuilder sbC = C();
        sbC.append(D().b(), i8, i9 - i8);
        kotlin.jvm.internal.t.f(sbC, "append(...)");
    }

    @Override // s7.AbstractC2894a
    public boolean e() {
        u();
        int i8 = this.f33249a;
        while (true) {
            int iJ = J(i8);
            if (iJ == -1) {
                this.f33249a = iJ;
                return false;
            }
            char cCharAt = D().charAt(iJ);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33249a = iJ;
                return F(cCharAt);
            }
            i8 = iJ + 1;
        }
    }

    @Override // s7.AbstractC2894a
    public String i() {
        l('\"');
        int i8 = this.f33249a;
        int iU = U('\"', i8);
        if (iU == -1) {
            int iJ = J(i8);
            if (iJ != -1) {
                return p(D(), this.f33249a, iJ);
            }
            AbstractC2894a.z(this, (byte) 1, false, 2, null);
            throw new C0920i();
        }
        for (int i9 = i8; i9 < iU; i9++) {
            if (D().charAt(i9) == '\\') {
                return p(D(), this.f33249a, i9);
            }
        }
        this.f33249a = iU + 1;
        return M(i8, iU);
    }

    @Override // s7.AbstractC2894a
    public byte j() {
        u();
        C2898e c2898eD = D();
        int i8 = this.f33249a;
        while (true) {
            int iJ = J(i8);
            if (iJ == -1) {
                this.f33249a = iJ;
                return (byte) 10;
            }
            int i9 = iJ + 1;
            byte bA = AbstractC2895b.a(c2898eD.charAt(iJ));
            if (bA != 3) {
                this.f33249a = i9;
                return bA;
            }
            i8 = i9;
        }
    }

    @Override // s7.AbstractC2894a
    public void u() {
        int length = D().length() - this.f33249a;
        if (length > this.f33227g) {
            return;
        }
        V(length);
    }

    public W(InterfaceC2913u reader, char[] buffer) {
        kotlin.jvm.internal.t.g(reader, "reader");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        this.f33225e = reader;
        this.f33226f = buffer;
        this.f33227g = 128;
        this.f33228h = new C2898e(buffer);
        V(0);
    }
}
