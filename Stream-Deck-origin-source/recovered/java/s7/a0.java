package s7;

import C6.C0920i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends AbstractC2894a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f33253e;

    public a0(String source) {
        kotlin.jvm.internal.t.g(source, "source");
        this.f33253e = source;
    }

    @Override // s7.AbstractC2894a
    public String G(String keyToMatch, boolean z8) {
        kotlin.jvm.internal.t.g(keyToMatch, "keyToMatch");
        int i8 = this.f33249a;
        try {
            if (j() == 6 && kotlin.jvm.internal.t.c(I(z8), keyToMatch)) {
                t();
                if (j() == 5) {
                    return I(z8);
                }
            }
            return null;
        } finally {
            this.f33249a = i8;
            t();
        }
    }

    @Override // s7.AbstractC2894a
    public int J(int i8) {
        if (i8 < D().length()) {
            return i8;
        }
        return -1;
    }

    @Override // s7.AbstractC2894a
    public int L() {
        char cCharAt;
        int i8 = this.f33249a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < D().length() && ((cCharAt = D().charAt(i8)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i8++;
        }
        this.f33249a = i8;
        return i8;
    }

    @Override // s7.AbstractC2894a
    public boolean O() {
        int iL = L();
        if (iL == D().length() || iL == -1 || D().charAt(iL) != ',') {
            return false;
        }
        this.f33249a++;
        return true;
    }

    @Override // s7.AbstractC2894a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f33253e;
    }

    @Override // s7.AbstractC2894a
    public boolean e() {
        int i8 = this.f33249a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < D().length()) {
            char cCharAt = D().charAt(i8);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33249a = i8;
                return F(cCharAt);
            }
            i8++;
        }
        this.f33249a = i8;
        return false;
    }

    @Override // s7.AbstractC2894a
    public String i() {
        l('\"');
        int i8 = this.f33249a;
        int iX = Z6.w.X(D(), '\"', i8, false, 4, null);
        if (iX == -1) {
            q();
            y((byte) 1, false);
            throw new C0920i();
        }
        for (int i9 = i8; i9 < iX; i9++) {
            if (D().charAt(i9) == '\\') {
                return p(D(), this.f33249a, i9);
            }
        }
        this.f33249a = iX + 1;
        String strSubstring = D().substring(i8, iX);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // s7.AbstractC2894a
    public byte j() {
        byte bA;
        String strD = D();
        do {
            int i8 = this.f33249a;
            if (i8 == -1 || i8 >= strD.length()) {
                return (byte) 10;
            }
            int i9 = this.f33249a;
            this.f33249a = i9 + 1;
            bA = AbstractC2895b.a(strD.charAt(i9));
        } while (bA == 3);
        return bA;
    }

    @Override // s7.AbstractC2894a
    public void l(char c8) {
        if (this.f33249a == -1) {
            R(c8);
        }
        String strD = D();
        while (this.f33249a < strD.length()) {
            int i8 = this.f33249a;
            this.f33249a = i8 + 1;
            char cCharAt = strD.charAt(i8);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c8) {
                    return;
                } else {
                    R(c8);
                }
            }
        }
        this.f33249a = -1;
        R(c8);
    }
}
