package s7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements InterfaceC2914v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f33190a = C2902i.f33285c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33191b;

    @Override // s7.InterfaceC2914v
    public void a(char c8) {
        e(1);
        char[] cArr = this.f33190a;
        int i8 = this.f33191b;
        this.f33191b = i8 + 1;
        cArr[i8] = c8;
    }

    @Override // s7.InterfaceC2914v
    public void b(String text) {
        kotlin.jvm.internal.t.g(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f33190a;
        int i8 = this.f33191b;
        int i9 = i8 + 1;
        cArr[i8] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        for (int i11 = i9; i11 < i10; i11++) {
            char c8 = cArr[i11];
            if (c8 < b0.a().length && b0.a()[c8] != 0) {
                d(i11 - i9, i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        this.f33191b = i10 + 1;
    }

    @Override // s7.InterfaceC2914v
    public void c(String text) {
        kotlin.jvm.internal.t.g(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f33190a, this.f33191b);
        this.f33191b += length;
    }

    public final void d(int i8, int i9, String str) {
        byte b8;
        int length = str.length();
        while (i8 < length) {
            int iF = f(i9, 2);
            char cCharAt = str.charAt(i8);
            if (cCharAt >= b0.a().length || (b8 = b0.a()[cCharAt]) == 0) {
                int i10 = iF + 1;
                this.f33190a[iF] = cCharAt;
                i9 = i10;
            } else if (b8 == 1) {
                String str2 = b0.b()[cCharAt];
                kotlin.jvm.internal.t.d(str2);
                int iF2 = f(iF, str2.length());
                str2.getChars(0, str2.length(), this.f33190a, iF2);
                i9 = iF2 + str2.length();
                this.f33191b = i9;
            } else {
                char[] cArr = this.f33190a;
                cArr[iF] = '\\';
                cArr[iF + 1] = (char) b8;
                i9 = iF + 2;
                this.f33191b = i9;
            }
            i8++;
        }
        int iF3 = f(i9, 1);
        this.f33190a[iF3] = '\"';
        this.f33191b = iF3 + 1;
    }

    public final void e(int i8) {
        f(this.f33191b, i8);
    }

    public final int f(int i8, int i9) {
        int i10 = i9 + i8;
        char[] cArr = this.f33190a;
        if (cArr.length <= i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, W6.n.d(i10, i8 * 2));
            kotlin.jvm.internal.t.f(cArrCopyOf, "copyOf(...)");
            this.f33190a = cArrCopyOf;
        }
        return i8;
    }

    public void g() {
        C2902i.f33285c.c(this.f33190a);
    }

    public String toString() {
        return new String(this.f33190a, 0, this.f33191b);
    }

    @Override // s7.InterfaceC2914v
    public void writeLong(long j8) {
        c(String.valueOf(j8));
    }
}
