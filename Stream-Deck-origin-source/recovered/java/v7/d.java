package v7;

import C6.C0918g;
import C6.G;
import D6.C0934n;
import D6.C0938s;
import D6.I;
import D6.M;
import D6.z;
import E4.JFpq.XRlnZWSrAFn;
import I0.mIk.efuWFSeiT;
import J7.C1034e;
import J7.InterfaceC1035f;
import J7.g;
import J7.h;
import J7.s;
import R0.pkXL.Oitvkwcwn;
import W6.i;
import W6.n;
import Z6.j;
import Z6.v;
import Z6.w;
import com.revenuecat.purchases.common.Constants;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.O;
import p116m7.kKPq.toqHM;
import p179u4.eubL.OjEsfyJYzbPn;
import u7.A;
import u7.B;
import u7.C;
import u7.InterfaceC3045e;
import u7.r;
import u7.t;
import u7.u;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f35179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f35180b = t.f34815b.g(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f35181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f35182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f35183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f35184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f35185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f35186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f35187i;

    static {
        byte[] bArr = new byte[0];
        f35179a = bArr;
        f35181c = C.a.c(C.f34539a, bArr, null, 1, null);
        f35182d = A.a.b(A.f34507a, bArr, null, 0, 0, 7, null);
        s.a aVar = s.f4411d;
        h.a aVar2 = h.f4388d;
        f35183e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.t.d(timeZone);
        f35184f = timeZone;
        f35185g = new j(toqHM.HMoiwZqUbEG);
        f35186h = false;
        String name = x.class.getName();
        kotlin.jvm.internal.t.f(name, "OkHttpClient::class.java.name");
        f35187i = w.r0(w.q0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return z(str, i8, i9);
    }

    public static final int B(String str, int i8, int i9) {
        kotlin.jvm.internal.t.g(str, "<this>");
        int i10 = i9 - 1;
        if (i8 <= i10) {
            while (true) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i10 + 1;
                }
                if (i10 != i8) {
                    i10--;
                }
            }
        }
        return i8;
    }

    public static /* synthetic */ int C(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return B(str, i8, i9);
    }

    public static final int D(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        int length = str.length();
        while (i8 < length) {
            char cCharAt = str.charAt(i8);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        kotlin.jvm.internal.t.g(strArr, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(D7.a aVar, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        kotlin.jvm.internal.t.g(file, "file");
        J7.A aB = aVar.b(file);
        try {
            try {
                aVar.f(file);
                N6.a.a(aB, null);
                return true;
            } catch (IOException unused) {
                G g8 = G.f1419a;
                N6.a.a(aB, null);
                aVar.f(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(aB, th);
                throw th2;
            }
        }
    }

    public static final boolean G(Socket socket, g source) {
        kotlin.jvm.internal.t.g(socket, "<this>");
        kotlin.jvm.internal.t.g(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.f0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return v.v(name, "Authorization", true) || v.v(name, "Cookie", true) || v.v(name, "Proxy-Authorization", true) || v.v(name, "Set-Cookie", true);
    }

    public static final int I(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final int J(g gVar) {
        kotlin.jvm.internal.t.g(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int K(C1034e c1034e, byte b8) throws EOFException {
        kotlin.jvm.internal.t.g(c1034e, "<this>");
        int i8 = 0;
        while (!c1034e.f0() && c1034e.w0(0L) == b8) {
            i8++;
            c1034e.readByte();
        }
        return i8;
    }

    public static final boolean L(J7.C c8, int i8, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.g(c8, "<this>");
        kotlin.jvm.internal.t.g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = c8.r().e() ? c8.r().c() - jNanoTime : Long.MAX_VALUE;
        c8.r().d(Math.min(jC, timeUnit.toNanos(i8)) + jNanoTime);
        try {
            C1034e c1034e = new C1034e();
            while (c8.K0(c1034e, 8192L) != -1) {
                c1034e.b();
            }
            if (jC == Long.MAX_VALUE) {
                c8.r().a();
                return true;
            }
            c8.r().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                c8.r().a();
                return false;
            }
            c8.r().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                c8.r().a();
            } else {
                c8.r().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory M(final String name, final boolean z8) {
        kotlin.jvm.internal.t.g(name, "name");
        return new ThreadFactory() { // from class: v7.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.N(name, z8, runnable);
            }
        };
    }

    public static final Thread N(String name, boolean z8, Runnable runnable) {
        kotlin.jvm.internal.t.g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z8);
        return thread;
    }

    public static final List O(t tVar) {
        kotlin.jvm.internal.t.g(tVar, "<this>");
        i iVarV = n.v(0, tVar.size());
        ArrayList arrayList = new ArrayList(C0938s.y(iVarV, 10));
        Iterator it = iVarV.iterator();
        while (it.hasNext()) {
            int iNextInt = ((I) it).nextInt();
            arrayList.add(new C7.c(tVar.m(iNextInt), tVar.u(iNextInt)));
        }
        return arrayList;
    }

    public static final t P(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7.c cVar = (C7.c) it.next();
            aVar.c(cVar.a().L(), cVar.b().L());
        }
        return aVar.d();
    }

    public static final String Q(int i8) {
        String hexString = Integer.toHexString(i8);
        kotlin.jvm.internal.t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String R(long j8) {
        String hexString = Long.toHexString(j8);
        kotlin.jvm.internal.t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(u uVar, boolean z8) {
        String strH;
        kotlin.jvm.internal.t.g(uVar, "<this>");
        if (w.M(uVar.h(), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z8 && uVar.l() == u.f34818k.c(uVar.p())) {
            return strH;
        }
        return strH + ':' + uVar.l();
    }

    public static /* synthetic */ String T(u uVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return S(uVar, z8);
    }

    public static final List U(List list) {
        kotlin.jvm.internal.t.g(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(z.U0(list));
        kotlin.jvm.internal.t.f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map V(Map map) {
        kotlin.jvm.internal.t.g(map, "<this>");
        if (map.isEmpty()) {
            return M.g();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        kotlin.jvm.internal.t.f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long W(String str, long j8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    public static final int X(String str, int i8) {
        if (str != null) {
            try {
                long j8 = Long.parseLong(str);
                if (j8 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j8 < 0) {
                    return 0;
                }
                return (int) j8;
            } catch (NumberFormatException unused) {
            }
        }
        return i8;
    }

    public static final String Y(String str, int i8, int i9) {
        kotlin.jvm.internal.t.g(str, "<this>");
        int iZ = z(str, i8, i9);
        String strSubstring = str.substring(iZ, B(str, iZ, i9));
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Z(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return Y(str, i8, i9);
    }

    public static final void b0(InterfaceC1035f interfaceC1035f, int i8) {
        kotlin.jvm.internal.t.g(interfaceC1035f, "<this>");
        interfaceC1035f.writeByte((i8 >>> 16) & 255);
        interfaceC1035f.writeByte((i8 >>> 8) & 255);
        interfaceC1035f.writeByte(i8 & 255);
    }

    public static final int d(byte b8, int i8) {
        return b8 & i8;
    }

    public static final int e(short s8, int i8) {
        return s8 & i8;
    }

    public static final long f(int i8, long j8) {
        return ((long) i8) & j8;
    }

    public static final r.c g(final r rVar) {
        kotlin.jvm.internal.t.g(rVar, "<this>");
        return new r.c() { // from class: v7.b
            @Override // u7.r.c
            public final r a(InterfaceC3045e interfaceC3045e) {
                return d.h(rVar, interfaceC3045e);
            }
        };
    }

    public static final r h(r this_asFactory, InterfaceC3045e it) {
        kotlin.jvm.internal.t.g(this_asFactory, "$this_asFactory");
        kotlin.jvm.internal.t.g(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return f35185g.d(str);
    }

    public static final boolean j(u uVar, u other) {
        kotlin.jvm.internal.t.g(uVar, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        return kotlin.jvm.internal.t.c(uVar.h(), other.h()) && uVar.l() == other.l() && kotlin.jvm.internal.t.c(uVar.p(), other.p());
    }

    public static final void l(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        kotlin.jvm.internal.t.g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (!kotlin.jvm.internal.t.c(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        kotlin.jvm.internal.t.g(strArr, "<this>");
        kotlin.jvm.internal.t.g(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[C0934n.T(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c8, int i8, int i9) {
        kotlin.jvm.internal.t.g(str, "<this>");
        while (i8 < i9) {
            if (str.charAt(i8) == c8) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static final int q(String str, String delimiters, int i8, int i9) {
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(delimiters, "delimiters");
        while (i8 < i9) {
            if (w.L(delimiters, str.charAt(i8), false, 2, null)) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static /* synthetic */ int r(String str, char c8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = str.length();
        }
        return p(str, c8, i8, i9);
    }

    public static final boolean s(J7.C c8, int i8, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.g(c8, "<this>");
        kotlin.jvm.internal.t.g(timeUnit, "timeUnit");
        try {
            return L(c8, i8, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.t.g(strArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC2625c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(B b8) {
        kotlin.jvm.internal.t.g(b8, "<this>");
        String strC = b8.Y().c("Content-Length");
        if (strC != null) {
            return W(strC, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(D6.r.q(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.t.f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        kotlin.jvm.internal.t.g(strArr, "<this>");
        kotlin.jvm.internal.t.g(value, "value");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (comparator.compare(strArr[i8], value) == 0) {
                return i8;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (kotlin.jvm.internal.t.h(cCharAt, 31) <= 0 || kotlin.jvm.internal.t.h(cCharAt, 127) >= 0) {
                return i8;
            }
        }
        return -1;
    }

    public static final int z(String str, int i8, int i9) {
        kotlin.jvm.internal.t.g(str, "<this>");
        while (i8 < i9) {
            char cCharAt = str.charAt(i8);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static final Throwable a0(Exception exc, List suppressed) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.t.g(exc, XRlnZWSrAFn.cfQQqBPw);
        kotlin.jvm.internal.t.g(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            C0918g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        kotlin.jvm.internal.t.g(list, Oitvkwcwn.kQXfluq);
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int k(String str, long j8, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.g(str, OjEsfyJYzbPn.vHEKnbCQoFTMbux);
        if (j8 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + efuWFSeiT.iCFgK).toString());
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final String t(String str, Object... args) {
        kotlin.jvm.internal.t.g(str, SZCvugJaXc.fYpZsSHGAhVG);
        kotlin.jvm.internal.t.g(args, "args");
        O o8 = O.f28784a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.t.f(str2, "format(locale, format, *args)");
        return str2;
    }
}
