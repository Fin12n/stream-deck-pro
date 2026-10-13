package C7;

import D6.C0933m;
import D6.iIQ.BmWxZhjGfw;
import D6.z;
import J7.C;
import J7.C1034e;
import J7.p;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c[] f1493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f1494c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f1497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final J7.g f1498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f1499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1502h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C source, int i8) {
            this(source, i8, 0, 4, null);
            t.g(source, "source");
        }

        public final void a() {
            int i8 = this.f1496b;
            int i9 = this.f1502h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        public final void b() {
            C0933m.w(this.f1499e, null, 0, 0, 6, null);
            this.f1500f = this.f1499e.length - 1;
            this.f1501g = 0;
            this.f1502h = 0;
        }

        public final int c(int i8) {
            return this.f1500f + 1 + i8;
        }

        public final int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f1499e.length;
                while (true) {
                    length--;
                    i9 = this.f1500f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    c cVar = this.f1499e[length];
                    t.d(cVar);
                    int i11 = cVar.f1491c;
                    i8 -= i11;
                    this.f1502h -= i11;
                    this.f1501g--;
                    i10++;
                }
                c[] cVarArr = this.f1499e;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f1501g);
                this.f1500f += i10;
            }
            return i10;
        }

        public final List e() {
            List listR0 = z.R0(this.f1497c);
            this.f1497c.clear();
            return listR0;
        }

        public final J7.h f(int i8) throws IOException {
            if (h(i8)) {
                return d.f1492a.c()[i8].f1489a;
            }
            int iC = c(i8 - d.f1492a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f1499e;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    t.d(cVar);
                    return cVar.f1489a;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        public final void g(int i8, c cVar) {
            this.f1497c.add(cVar);
            int i9 = cVar.f1491c;
            if (i8 != -1) {
                c cVar2 = this.f1499e[c(i8)];
                t.d(cVar2);
                i9 -= cVar2.f1491c;
            }
            int i10 = this.f1496b;
            if (i9 > i10) {
                b();
                return;
            }
            int iD = d((this.f1502h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f1501g + 1;
                c[] cVarArr = this.f1499e;
                if (i11 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f1500f = this.f1499e.length - 1;
                    this.f1499e = cVarArr2;
                }
                int i12 = this.f1500f;
                this.f1500f = i12 - 1;
                this.f1499e[i12] = cVar;
                this.f1501g++;
            } else {
                this.f1499e[i8 + c(i8) + iD] = cVar;
            }
            this.f1502h += i9;
        }

        public final boolean h(int i8) {
            return i8 >= 0 && i8 <= d.f1492a.c().length - 1;
        }

        public final int i() {
            return v7.d.d(this.f1498d.readByte(), 255);
        }

        public final J7.h j() {
            int i8 = i();
            boolean z8 = (i8 & 128) == 128;
            long jM = m(i8, 127);
            if (!z8) {
                return this.f1498d.I(jM);
            }
            C1034e c1034e = new C1034e();
            k.f1652a.b(this.f1498d, jM, c1034e);
            return c1034e.a1();
        }

        public final void k() throws IOException {
            while (!this.f1498d.f0()) {
                int iD = v7.d.d(this.f1498d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f1496b = iM;
                    if (iM < 0 || iM > this.f1495a) {
                        throw new IOException("Invalid dynamic table size update " + this.f1496b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final void l(int i8) throws IOException {
            if (h(i8)) {
                this.f1497c.add(d.f1492a.c()[i8]);
                return;
            }
            int iC = c(i8 - d.f1492a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f1499e;
                if (iC < cVarArr.length) {
                    List list = this.f1497c;
                    c cVar = cVarArr[iC];
                    t.d(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        public final int m(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) == 0) {
                    return i9 + (i12 << i11);
                }
                i9 += (i12 & 127) << i11;
                i11 += 7;
            }
        }

        public final void n(int i8) {
            g(-1, new c(f(i8), j()));
        }

        public final void o() {
            g(-1, new c(d.f1492a.a(j()), j()));
        }

        public final void p(int i8) throws IOException {
            this.f1497c.add(new c(f(i8), j()));
        }

        public final void q() throws IOException {
            this.f1497c.add(new c(d.f1492a.a(j()), j()));
        }

        public a(C source, int i8, int i9) {
            t.g(source, "source");
            this.f1495a = i8;
            this.f1496b = i9;
            this.f1497c = new ArrayList();
            this.f1498d = p.d(source);
            c[] cVarArr = new c[8];
            this.f1499e = cVarArr;
            this.f1500f = cVarArr.length - 1;
        }

        public /* synthetic */ a(C c8, int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
            this(c8, i8, (i10 & 4) != 0 ? i8 : i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1034e f1505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f1509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1511i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1512j;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(int i8, C1034e out) {
            this(i8, false, out, 2, null);
            t.g(out, "out");
        }

        public final void a() {
            int i8 = this.f1508f;
            int i9 = this.f1512j;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    c(i9 - i8);
                }
            }
        }

        public final void b() {
            C0933m.w(this.f1509g, null, 0, 0, 6, null);
            this.f1510h = this.f1509g.length - 1;
            this.f1511i = 0;
            this.f1512j = 0;
        }

        public final int c(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f1509g.length;
                while (true) {
                    length--;
                    i9 = this.f1510h;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    c cVar = this.f1509g[length];
                    t.d(cVar);
                    i8 -= cVar.f1491c;
                    int i11 = this.f1512j;
                    c cVar2 = this.f1509g[length];
                    t.d(cVar2);
                    this.f1512j = i11 - cVar2.f1491c;
                    this.f1511i--;
                    i10++;
                }
                c[] cVarArr = this.f1509g;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f1511i);
                c[] cVarArr2 = this.f1509g;
                int i12 = this.f1510h;
                Arrays.fill(cVarArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.f1510h += i10;
            }
            return i10;
        }

        public final void d(c cVar) {
            int i8 = cVar.f1491c;
            int i9 = this.f1508f;
            if (i8 > i9) {
                b();
                return;
            }
            c((this.f1512j + i8) - i9);
            int i10 = this.f1511i + 1;
            c[] cVarArr = this.f1509g;
            if (i10 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f1510h = this.f1509g.length - 1;
                this.f1509g = cVarArr2;
            }
            int i11 = this.f1510h;
            this.f1510h = i11 - 1;
            this.f1509g[i11] = cVar;
            this.f1511i++;
            this.f1512j += i8;
        }

        public final void e(int i8) {
            this.f1503a = i8;
            int iMin = Math.min(i8, 16384);
            int i9 = this.f1508f;
            if (i9 == iMin) {
                return;
            }
            if (iMin < i9) {
                this.f1506d = Math.min(this.f1506d, iMin);
            }
            this.f1507e = true;
            this.f1508f = iMin;
            a();
        }

        public final void f(J7.h data) {
            t.g(data, "data");
            if (this.f1504b) {
                k kVar = k.f1652a;
                if (kVar.d(data) < data.H()) {
                    C1034e c1034e = new C1034e();
                    kVar.c(data, c1034e);
                    J7.h hVarA1 = c1034e.a1();
                    h(hVarA1.H(), 127, 128);
                    this.f1505c.R0(hVarA1);
                    return;
                }
            }
            h(data.H(), 127, 0);
            this.f1505c.R0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void g(List headerBlock) {
            int length;
            int length2;
            t.g(headerBlock, "headerBlock");
            if (this.f1507e) {
                int i8 = this.f1506d;
                if (i8 < this.f1508f) {
                    h(i8, 31, 32);
                }
                this.f1507e = false;
                this.f1506d = Integer.MAX_VALUE;
                h(this.f1508f, 31, 32);
            }
            int size = headerBlock.size();
            for (int i9 = 0; i9 < size; i9++) {
                c cVar = (c) headerBlock.get(i9);
                J7.h hVarJ = cVar.f1489a.J();
                J7.h hVar = cVar.f1490b;
                d dVar = d.f1492a;
                Integer num = (Integer) dVar.b().get(hVarJ);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (t.c(dVar.c()[iIntValue].f1490b, hVar)) {
                        length = length2;
                    } else if (t.c(dVar.c()[length2].f1490b, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f1509g.length;
                    for (int i10 = this.f1510h + 1; i10 < length3; i10++) {
                        c cVar2 = this.f1509g[i10];
                        t.d(cVar2);
                        if (t.c(cVar2.f1489a, hVarJ)) {
                            c cVar3 = this.f1509g[i10];
                            t.d(cVar3);
                            if (t.c(cVar3.f1490b, hVar)) {
                                length2 = d.f1492a.c().length + (i10 - this.f1510h);
                                break;
                            } else if (length == -1) {
                                length = (i10 - this.f1510h) + d.f1492a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, 128);
                } else if (length == -1) {
                    this.f1505c.writeByte(64);
                    f(hVarJ);
                    f(hVar);
                    d(cVar);
                } else if (!hVarJ.I(c.f1483e) || t.c(c.f1488j, hVarJ)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f1505c.writeByte(i8 | i10);
                return;
            }
            this.f1505c.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f1505c.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.f1505c.writeByte(i11);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(C1034e out) {
            this(0, false, out, 3, null);
            t.g(out, "out");
        }

        public b(int i8, boolean z8, C1034e out) {
            t.g(out, "out");
            this.f1503a = i8;
            this.f1504b = z8;
            this.f1505c = out;
            this.f1506d = Integer.MAX_VALUE;
            this.f1508f = i8;
            c[] cVarArr = new c[8];
            this.f1509g = cVarArr;
            this.f1510h = cVarArr.length - 1;
        }

        public /* synthetic */ b(int i8, boolean z8, C1034e c1034e, int i9, AbstractC2633k abstractC2633k) {
            this((i9 & 1) != 0 ? 4096 : i8, (i9 & 2) != 0 ? true : z8, c1034e);
        }
    }

    static {
        d dVar = new d();
        f1492a = dVar;
        c cVar = new c(c.f1488j, "");
        J7.h hVar = c.f1485g;
        c cVar2 = new c(hVar, "GET");
        c cVar3 = new c(hVar, "POST");
        J7.h hVar2 = c.f1486h;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        J7.h hVar3 = c.f1487i;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        J7.h hVar4 = c.f1484f;
        f1493b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, ajyWhveMDgQ.XoZThBByNEizUB), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c(BmWxZhjGfw.mxMGTKUy, ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c(QhsKALGiniuQ.NHZtGHRJ, ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f1494c = dVar.d();
    }

    public final J7.h a(J7.h name) throws IOException {
        t.g(name, "name");
        int iH = name.H();
        for (int i8 = 0; i8 < iH; i8++) {
            byte bE = name.e(i8);
            if (65 <= bE && bE < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.L());
            }
        }
        return name;
    }

    public final Map b() {
        return f1494c;
    }

    public final c[] c() {
        return f1493b;
    }

    public final Map d() {
        c[] cVarArr = f1493b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            c[] cVarArr2 = f1493b;
            if (!linkedHashMap.containsKey(cVarArr2[i8].f1489a)) {
                linkedHashMap.put(cVarArr2[i8].f1489a, Integer.valueOf(i8));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.f(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }
}
