package Z5;

import C6.C0920i;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements CharSequence, Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p221z6.g f12915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f12916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char[] f12917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12921g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements CharSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f12924c;

        public a(int i8, int i9) {
            this.f12922a = i8;
            this.f12923b = i9;
        }

        public char a(int i8) {
            int i9 = this.f12922a + i8;
            if (i8 < 0) {
                throw new IllegalArgumentException(("index is negative: " + i8).toString());
            }
            if (i9 < this.f12923b) {
                return b.this.j(i9);
            }
            throw new IllegalArgumentException(("index (" + i8 + ") should be less than length (" + length() + ')').toString());
        }

        public int b() {
            return this.f12923b - this.f12922a;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i8) {
            return a(i8);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return b.this.n(this.f12922a, charSequence, 0, length());
        }

        public int hashCode() {
            String str = this.f12924c;
            return str != null ? str.hashCode() : b.this.l(this.f12922a, this.f12923b);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return b();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i8, int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException(("start is negative: " + i8).toString());
            }
            if (i8 > i9) {
                throw new IllegalArgumentException(("start (" + i8 + ") should be less or equal to end (" + i9 + ')').toString());
            }
            int i10 = this.f12923b;
            int i11 = this.f12922a;
            if (i9 <= i10 - i11) {
                return i8 == i9 ? "" : b.this.new a(i8 + i11, i11 + i9);
            }
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }

        @Override // java.lang.CharSequence
        public String toString() {
            String str = this.f12924c;
            if (str != null) {
                return str;
            }
            String string = b.this.g(this.f12922a, this.f12923b).toString();
            this.f12924c = string;
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Appendable
    public Appendable append(char c8) {
        char[] cArrM = m();
        char[] cArr = this.f12917c;
        t.d(cArr);
        int length = cArr.length;
        int i8 = this.f12920f;
        cArrM[length - i8] = c8;
        this.f12918d = null;
        this.f12920f = i8 - 1;
        this.f12921g = length() + 1;
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i8) {
        return i(i8);
    }

    public final char[] e() {
        List list;
        char[] cArr = (char[]) this.f12915a.b0();
        char[] cArr2 = this.f12917c;
        this.f12917c = cArr;
        this.f12920f = cArr.length;
        this.f12919e = false;
        if (cArr2 != null) {
            List list2 = this.f12916b;
            if (list2 == null) {
                list = list2;
                ArrayList arrayList = new ArrayList();
                this.f12916b = arrayList;
                arrayList.add(cArr2);
                list = arrayList;
            }
            list = list2;
            list.add(cArr);
        }
        return cArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return n(0, charSequence, 0, length());
    }

    public final char[] f(int i8) {
        List list = this.f12916b;
        if (list != null) {
            char[] cArr = this.f12917c;
            t.d(cArr);
            return (char[]) list.get(i8 / cArr.length);
        }
        if (i8 >= 2048) {
            p(i8);
            throw new C0920i();
        }
        char[] cArr2 = this.f12917c;
        if (cArr2 != null) {
            return cArr2;
        }
        p(i8);
        throw new C0920i();
    }

    public final CharSequence g(int i8, int i9) {
        if (i8 == i9) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i9 - i8);
        for (int i10 = i8 - (i8 % 2048); i10 < i9; i10 += 2048) {
            char[] cArrF = f(i10);
            int iMin = Math.min(i9 - i10, 2048);
            for (int iMax = Math.max(0, i8 - i10); iMax < iMin; iMax++) {
                sb.append(cArrF[iMax]);
            }
        }
        return sb;
    }

    public final int h() {
        char[] cArr = this.f12917c;
        t.d(cArr);
        return cArr.length - this.f12920f;
    }

    public int hashCode() {
        String str = this.f12918d;
        return str != null ? str.hashCode() : l(0, length());
    }

    public char i(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("index is negative: " + i8).toString());
        }
        if (i8 < length()) {
            return j(i8);
        }
        throw new IllegalArgumentException(("index " + i8 + " is not in range [0, " + length() + ')').toString());
    }

    public final char j(int i8) {
        char[] cArrF = f(i8);
        char[] cArr = this.f12917c;
        t.d(cArr);
        return cArrF[i8 % cArr.length];
    }

    public int k() {
        return this.f12921g;
    }

    public final int l(int i8, int i9) {
        int iJ = 0;
        while (i8 < i9) {
            iJ = (iJ * 31) + j(i8);
            i8++;
        }
        return iJ;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return k();
    }

    public final char[] m() {
        if (this.f12920f == 0) {
            return e();
        }
        char[] cArr = this.f12917c;
        t.d(cArr);
        return cArr;
    }

    public final boolean n(int i8, CharSequence charSequence, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (j(i8 + i11) != charSequence.charAt(i9 + i11)) {
                return false;
            }
        }
        return true;
    }

    public final void o() {
        List list = this.f12916b;
        if (list != null) {
            this.f12917c = null;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f12915a.H1(list.get(i8));
            }
        } else {
            char[] cArr = this.f12917c;
            if (cArr != null) {
                this.f12915a.H1(cArr);
            }
            this.f12917c = null;
        }
        this.f12919e = true;
        this.f12916b = null;
        this.f12918d = null;
        this.f12921g = 0;
        this.f12920f = 0;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException(("startIndex (" + i8 + ") should be less or equal to endIndex (" + i9 + ')').toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(("startIndex is negative: " + i8).toString());
        }
        if (i9 <= length()) {
            return new a(i8, i9);
        }
        throw new IllegalArgumentException(("endIndex (" + i9 + ") is greater than length (" + length() + ')').toString());
    }

    @Override // java.lang.CharSequence
    public String toString() {
        String str = this.f12918d;
        if (str != null) {
            return str;
        }
        String string = g(0, length()).toString();
        this.f12918d = string;
        return string;
    }

    public b(p221z6.g pool) {
        t.g(pool, "pool");
        this.f12915a = pool;
    }

    public final Void p(int i8) {
        if (this.f12919e) {
            throw new IllegalStateException(WqXA.jcUjrbURzednNS);
        }
        throw new IndexOutOfBoundsException(i8 + " is not in range [0; " + h() + ')');
    }

    public /* synthetic */ b(p221z6.g gVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? d.a() : gVar);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i8, int i9) {
        if (charSequence == null) {
            return this;
        }
        int i10 = i8;
        while (i10 < i9) {
            char[] cArrM = m();
            int length = cArrM.length;
            int i11 = this.f12920f;
            int i12 = length - i11;
            int iMin = Math.min(i9 - i10, i11);
            for (int i13 = 0; i13 < iMin; i13++) {
                cArrM[i12 + i13] = charSequence.charAt(i10 + i13);
            }
            i10 += iMin;
            this.f12920f -= iMin;
        }
        this.f12918d = null;
        this.f12921g = length() + (i9 - i8);
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }
}
