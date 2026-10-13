package okhttp3.internal.publicsuffix;

import C6.G;
import D6.C0937q;
import D6.r;
import D6.z;
import E7.h;
import J7.g;
import J7.m;
import J7.p;
import Y6.n;
import Z6.w;
import com.amazon.a.a.o.c.a.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import v7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31008e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f31009f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f31010g = C0937q.e("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PublicSuffixDatabase f31011h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f31012a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f31013b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f31014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f31015d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i8) {
            int i9;
            int iD;
            boolean z8;
            int iD2;
            int length = bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = (i10 + length) / 2;
                while (i11 > -1 && bArr[i11] != 10) {
                    i11--;
                }
                int i12 = i11 + 1;
                int i13 = 1;
                while (true) {
                    i9 = i12 + i13;
                    if (bArr[i9] == 10) {
                        break;
                    }
                    i13++;
                }
                int i14 = i9 - i12;
                int i15 = i8;
                boolean z9 = false;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (z9) {
                        iD = 46;
                        z8 = false;
                    } else {
                        boolean z10 = z9;
                        iD = d.d(bArr2[i15][i16], 255);
                        z8 = z10;
                    }
                    iD2 = iD - d.d(bArr[i12 + i17], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i17++;
                    i16++;
                    if (i17 == i14) {
                        break;
                    }
                    if (bArr2[i15].length != i16) {
                        z9 = z8;
                    } else {
                        if (i15 == bArr2.length - 1) {
                            break;
                        }
                        i15++;
                        z9 = true;
                        i16 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i18 = i14 - i17;
                        int length2 = bArr2[i15].length - i16;
                        int length3 = bArr2.length;
                        for (int i19 = i15 + 1; i19 < length3; i19++) {
                            length2 += bArr2[i19].length;
                        }
                        if (length2 >= i18) {
                            if (length2 <= i18) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                t.f(UTF_8, "UTF_8");
                                return new String(bArr, i12, i14, UTF_8);
                            }
                        }
                    }
                    i10 = i9 + 1;
                }
                length = i11;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f31011h;
        }

        public a() {
        }
    }

    public final List b(List list) {
        String str;
        String strB;
        String str2;
        List listN;
        List listN2;
        if (this.f31012a.get() || !this.f31012a.compareAndSet(false, true)) {
            try {
                this.f31013b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f31014c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i8 = 0; i8 < size; i8++) {
            String str3 = (String) list.get(i8);
            Charset UTF_8 = StandardCharsets.UTF_8;
            t.f(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i8] = bytes;
        }
        int i9 = 0;
        while (true) {
            str = null;
            if (i9 >= size) {
                strB = null;
                break;
            }
            a aVar = f31008e;
            byte[] bArr2 = this.f31014c;
            if (bArr2 == null) {
                t.t("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = aVar.b(bArr2, bArr, i9);
            if (strB != null) {
                break;
            }
            i9++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str2 = null;
                break;
            }
            bArr3[i10] = f31009f;
            a aVar2 = f31008e;
            byte[] bArr4 = this.f31014c;
            if (bArr4 == null) {
                t.t("publicSuffixListBytes");
                bArr4 = null;
            }
            String strB2 = aVar2.b(bArr4, bArr3, i10);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i10++;
        }
        if (str2 != null) {
            int i11 = size - 1;
            for (int i12 = 0; i12 < i11; i12++) {
                a aVar3 = f31008e;
                byte[] bArr5 = this.f31015d;
                if (bArr5 == null) {
                    t.t("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strB3 = aVar3.b(bArr5, bArr, i12);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return w.z0('!' + str, new char[]{b.f16789a}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f31010g;
        }
        if (strB == null || (listN = w.z0(strB, new char[]{b.f16789a}, false, 0, 6, null)) == null) {
            listN = r.n();
        }
        if (str2 == null || (listN2 = w.z0(str2, new char[]{b.f16789a}, false, 0, 6, null)) == null) {
            listN2 = r.n();
        }
        return listN.size() > listN2.size() ? listN : listN2;
    }

    public final String c(String domain) {
        int size;
        int size2;
        t.g(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        t.f(unicodeDomain, "unicodeDomain");
        List listF = f(unicodeDomain);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return n.q(n.j(z.Z(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void d() {
        try {
            J j8 = new J();
            J j9 = new J();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                g gVarD = p.d(new m(p.k(resourceAsStream)));
                try {
                    j8.f28779a = gVarD.s1(gVarD.readInt());
                    j9.f28779a = gVarD.s1(gVarD.readInt());
                    G g8 = G.f1419a;
                    N6.a.a(gVarD, null);
                    synchronized (this) {
                        Object obj = j8.f28779a;
                        t.d(obj);
                        this.f31014c = (byte[]) obj;
                        Object obj2 = j9.f28779a;
                        t.d(obj2);
                        this.f31015d = (byte[]) obj2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        N6.a.a(gVarD, th);
                        throw th2;
                    }
                }
            }
            this.f31013b.countDown();
        } catch (Throwable th3) {
            this.f31013b.countDown();
            throw th3;
        }
    }

    public final void e() {
        boolean z8 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z8 = true;
                } catch (IOException e8) {
                    h.f2311a.g().k("Failed to read public suffix list", 5, e8);
                    if (!z8) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z8) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    public final List f(String str) {
        List listZ0 = w.z0(str, new char[]{b.f16789a}, false, 0, 6, null);
        return t.c(z.t0(listZ0), "") ? z.e0(listZ0, 1) : listZ0;
    }
}
