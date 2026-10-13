package X5;

import D6.C0938s;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1673b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f11794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f11795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f11796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f11797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f11798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f11799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f11800g;

    /* JADX INFO: renamed from: X5.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f11801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb, boolean z8) {
            super(1);
            this.f11801a = sb;
            this.f11802b = z8;
        }

        public final void b(byte b8) {
            if (AbstractC1673b.f11794a.contains(Byte.valueOf(b8)) || AbstractC1673b.f11800g.contains(Byte.valueOf(b8))) {
                this.f11801a.append((char) b8);
            } else if (this.f11802b && b8 == 32) {
                this.f11801a.append('+');
            } else {
                this.f11801a.append(AbstractC1673b.u(b8));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: X5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0301b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f11803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0301b(StringBuilder sb) {
            super(1);
            this.f11803a = sb;
        }

        public final void b(byte b8) {
            this.f11803a.append(AbstractC1673b.u(b8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: X5.b$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f11804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f11805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f11806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, StringBuilder sb, boolean z9) {
            super(1);
            this.f11804a = z8;
            this.f11805b = sb;
            this.f11806c = z9;
        }

        public final void b(byte b8) {
            if (b8 == 32) {
                if (this.f11804a) {
                    this.f11805b.append('+');
                    return;
                } else {
                    this.f11805b.append("%20");
                    return;
                }
            }
            if (AbstractC1673b.f11794a.contains(Byte.valueOf(b8)) || (!this.f11806c && AbstractC1673b.f11797d.contains(Byte.valueOf(b8)))) {
                this.f11805b.append((char) b8);
            } else {
                this.f11805b.append(AbstractC1673b.u(b8));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).byteValue());
            return C6.G.f1419a;
        }
    }

    static {
        Character chValueOf = Character.valueOf(com.amazon.a.a.o.c.a.b.f16789a);
        List listB0 = D6.z.B0(D6.z.A0(new W6.c('a', 'z'), new W6.c('A', 'Z')), new W6.c('0', '9'));
        ArrayList arrayList = new ArrayList(C0938s.y(listB0, 10));
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f11794a = D6.z.W0(arrayList);
        f11795b = D6.z.W0(D6.z.B0(D6.z.A0(new W6.c('a', 'z'), new W6.c('A', 'Z')), new W6.c('0', '9')));
        f11796c = D6.z.W0(D6.z.B0(D6.z.A0(new W6.c('a', 'f'), new W6.c('A', 'F')), new W6.c('0', '9')));
        Set setG = D6.T.g(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', chValueOf, '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(C0938s.y(setG, 10));
        Iterator it2 = setG.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f11797d = arrayList2;
        f11798e = D6.T.g(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', chValueOf, '_', '~');
        f11799f = D6.U.i(f11795b, D6.T.g('!', '#', '$', '&', '+', '-', chValueOf, '^', '_', '`', '|', '~'));
        List listQ = D6.r.q('-', chValueOf, '_', '~');
        ArrayList arrayList3 = new ArrayList(C0938s.y(listQ, 10));
        Iterator it3 = listQ.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f11800g = arrayList3;
    }

    public static final int e(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        if ('a' > c8 || c8 >= 'g') {
            return -1;
        }
        return c8 - 'W';
    }

    public static final String f(CharSequence charSequence, int i8, int i9, int i10, boolean z8, Charset charset) throws L {
        int i11 = i9 - i8;
        if (i11 > 255) {
            i11 /= 3;
        }
        StringBuilder sb = new StringBuilder(i11);
        if (i10 > i8) {
            sb.append(charSequence, i8, i10);
        }
        byte[] bArr = null;
        while (i10 < i9) {
            char cCharAt = charSequence.charAt(i10);
            if (z8 && cCharAt == '+') {
                sb.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i9 - i10) / 3];
                }
                int i12 = 0;
                while (i10 < i9 && charSequence.charAt(i10) == '%') {
                    int i13 = i10 + 2;
                    if (i13 >= i9) {
                        throw new L("Incomplete trailing HEX escape: " + charSequence.subSequence(i10, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i10);
                    }
                    int i14 = i10 + 1;
                    int iE = e(charSequence.charAt(i14));
                    int iE2 = e(charSequence.charAt(i13));
                    if (iE == -1 || iE2 == -1) {
                        throw new L("Wrong HEX escape: %" + charSequence.charAt(i14) + charSequence.charAt(i13) + ", in " + ((Object) charSequence) + ", at " + i10);
                    }
                    bArr[i12] = (byte) ((iE * 16) + iE2);
                    i10 += 3;
                    i12++;
                }
                sb.append(new String(bArr, 0, i12, charset));
            } else {
                sb.append(cCharAt);
            }
            i10++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "sb.toString()");
        return string;
    }

    public static final String g(String str, int i8, int i9, boolean z8, Charset charset) {
        for (int i10 = i8; i10 < i9; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%' || (z8 && cCharAt == '+')) {
                return f(str, i8, i9, i10, z8, charset);
            }
        }
        if (i8 == 0 && i9 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i8, i9);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String h(String str, int i8, int i9, Charset charset) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(charset, "charset");
        return g(str, i8, i9, false, charset);
    }

    public static /* synthetic */ String i(String str, int i8, int i9, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            charset = Z6.c.f12941b;
        }
        return h(str, i8, i9, charset);
    }

    public static final String j(String str, int i8, int i9, boolean z8, Charset charset) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(charset, "charset");
        return g(str, i8, i9, z8, charset);
    }

    public static /* synthetic */ String k(String str, int i8, int i9, boolean z8, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            charset = Z6.c.f12941b;
        }
        return j(str, i8, i9, z8, charset);
    }

    public static final String l(String str, boolean z8) throws Throwable {
        kotlin.jvm.internal.t.g(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Z6.c.f12941b.newEncoder();
        kotlin.jvm.internal.t.f(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        s(p197w6.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new a(sb, z8));
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String m(String str, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return l(str, z8);
    }

    public static final String n(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str, boolean z8) throws Throwable {
        int i8;
        kotlin.jvm.internal.t.g(str, "<this>");
        StringBuilder sb = new StringBuilder();
        Charset charset = Z6.c.f12941b;
        int i9 = 0;
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if ((!z8 && cCharAt == '/') || f11795b.contains(Character.valueOf(cCharAt)) || f11798e.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i9++;
            } else {
                if (cCharAt == '%' && (i8 = i9 + 2) < str.length()) {
                    Set set = f11796c;
                    int i10 = i9 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i10))) && set.contains(Character.valueOf(str.charAt(i8)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i10));
                        sb.append(str.charAt(i8));
                        i9 += 3;
                    }
                }
                int i11 = Z6.b.e(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                kotlin.jvm.internal.t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
                int i12 = i11 + i9;
                s(p197w6.b.c(charsetEncoderNewEncoder, str, i9, i12), new C0301b(sb));
                i9 = i12;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String p(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return o(str, true);
    }

    public static /* synthetic */ String r(String str, boolean z8, boolean z9, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = false;
        }
        if ((i8 & 4) != 0) {
            charset = Z6.c.f12941b;
        }
        return q(str, z8, z9, charset);
    }

    public static final void s(p205x6.k kVar, Q6.k kVar2) throws Throwable {
        boolean z8 = true;
        p213y6.a aVarB = p213y6.g.b(kVar, 1);
        if (aVarB == null) {
            return;
        }
        while (true) {
            try {
                if (aVarB.k() > aVarB.i()) {
                    kVar2.invoke(Byte.valueOf(aVarB.l()));
                } else {
                    try {
                        aVarB = p213y6.g.c(kVar, aVarB);
                        if (aVarB == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z8 = false;
                        if (z8) {
                            p213y6.g.a(kVar, aVarB);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final char t(int i8) {
        return (char) ((i8 < 0 || i8 >= 10) ? ((char) (i8 + 65)) - '\n' : i8 + 48);
    }

    public static final String u(byte b8) {
        return Z6.v.q(new char[]{'%', t((b8 & 255) >> 4), t(b8 & 15)});
    }

    public static final String q(String str, boolean z8, boolean z9, Charset charset) throws Throwable {
        kotlin.jvm.internal.t.g(str, cFAYKUlMj.JJzmAl);
        kotlin.jvm.internal.t.g(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
        s(p197w6.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new c(z9, sb, z8));
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, cFAYKUlMj.YnTf);
        return string;
    }
}
