package X5;

import D6.C0938s;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final List f12026q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Map f12028r0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11997c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f11999d = new x(100, "Continue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f12001e = new x(101, "Switching Protocols");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f12003f = new x(102, "Processing");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f12005g = new x(RCHTTPStatusCodes.SUCCESS, "OK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f12007h = new x(RCHTTPStatusCodes.CREATED, "Created");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f12009i = new x(202, "Accepted");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f12011j = new x(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f12013k = new x(204, RaiWHuj.bexcQKLTC);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f12015l = new x(205, "Reset Content");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x f12017m = new x(206, "Partial Content");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x f12019n = new x(207, "Multi-Status");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f12021o = new x(RCHTTPStatusCodes.UNSUCCESSFUL, "Multiple Choices");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x f12023p = new x(301, "Moved Permanently");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x f12025q = new x(302, "Found");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f12027r = new x(303, "See Other");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f12029s = new x(RCHTTPStatusCodes.NOT_MODIFIED, "Not Modified");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x f12030t = new x(305, "Use Proxy");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x f12031u = new x(306, "Switch Proxy");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f12032v = new x(307, "Temporary Redirect");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x f12033w = new x(308, "Permanent Redirect");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x f12034x = new x(RCHTTPStatusCodes.BAD_REQUEST, "Bad Request");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x f12035y = new x(401, "Unauthorized");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x f12036z = new x(402, "Payment Required");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final x f11981A = new x(403, "Forbidden");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final x f11982B = new x(RCHTTPStatusCodes.NOT_FOUND, "Not Found");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final x f11983C = new x(405, "Method Not Allowed");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final x f11984D = new x(406, "Not Acceptable");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final x f11985E = new x(407, "Proxy Authentication Required");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final x f11986F = new x(408, "Request Timeout");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final x f11987G = new x(409, "Conflict");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final x f11988H = new x(410, "Gone");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final x f11989I = new x(411, "Length Required");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final x f11990V = new x(412, yOZfxp.XrtxGWFlOz);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final x f11991W = new x(413, "Payload Too Large");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final x f11992X = new x(414, "Request-URI Too Long");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final x f11993Y = new x(415, "Unsupported Media Type");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final x f11994Z = new x(416, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final x f11995a0 = new x(417, "Expectation Failed");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final x f11996b0 = new x(422, "Unprocessable Entity");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final x f11998c0 = new x(423, "Locked");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final x f12000d0 = new x(424, "Failed Dependency");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final x f12002e0 = new x(425, "Too Early");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final x f12004f0 = new x(426, "Upgrade Required");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final x f12006g0 = new x(429, "Too Many Requests");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final x f12008h0 = new x(431, "Request Header Fields Too Large");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final x f12010i0 = new x(500, "Internal Server Error");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final x f12012j0 = new x(501, "Not Implemented");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final x f12014k0 = new x(502, "Bad Gateway");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final x f12016l0 = new x(503, "Service Unavailable");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final x f12018m0 = new x(504, "Gateway Timeout");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final x f12020n0 = new x(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final x f12022o0 = new x(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f12024p0 = new x(507, "Insufficient Storage");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final x A() {
            return x.f12005g;
        }

        public final x B() {
            return x.f12017m;
        }

        public final x C() {
            return x.f11991W;
        }

        public final x D() {
            return x.f12036z;
        }

        public final x E() {
            return x.f12033w;
        }

        public final x F() {
            return x.f11990V;
        }

        public final x G() {
            return x.f12003f;
        }

        public final x H() {
            return x.f11985E;
        }

        public final x I() {
            return x.f12008h0;
        }

        public final x J() {
            return x.f11986F;
        }

        public final x K() {
            return x.f11992X;
        }

        public final x L() {
            return x.f11994Z;
        }

        public final x M() {
            return x.f12015l;
        }

        public final x N() {
            return x.f12027r;
        }

        public final x O() {
            return x.f12016l0;
        }

        public final x P() {
            return x.f12031u;
        }

        public final x Q() {
            return x.f12001e;
        }

        public final x R() {
            return x.f12032v;
        }

        public final x S() {
            return x.f12002e0;
        }

        public final x T() {
            return x.f12006g0;
        }

        public final x U() {
            return x.f12035y;
        }

        public final x V() {
            return x.f11996b0;
        }

        public final x W() {
            return x.f11993Y;
        }

        public final x X() {
            return x.f12004f0;
        }

        public final x Y() {
            return x.f12030t;
        }

        public final x Z() {
            return x.f12022o0;
        }

        public final x a() {
            return x.f12009i;
        }

        public final x a0() {
            return x.f12020n0;
        }

        public final x b() {
            return x.f12014k0;
        }

        public final x c() {
            return x.f12034x;
        }

        public final x d() {
            return x.f11987G;
        }

        public final x e() {
            return x.f11999d;
        }

        public final x f() {
            return x.f12007h;
        }

        public final x g() {
            return x.f11995a0;
        }

        public final x h() {
            return x.f12000d0;
        }

        public final x i() {
            return x.f11981A;
        }

        public final x j() {
            return x.f12025q;
        }

        public final x k() {
            return x.f12018m0;
        }

        public final x l() {
            return x.f11988H;
        }

        public final x m() {
            return x.f12024p0;
        }

        public final x n() {
            return x.f12010i0;
        }

        public final x o() {
            return x.f11989I;
        }

        public final x p() {
            return x.f11998c0;
        }

        public final x q() {
            return x.f11983C;
        }

        public final x r() {
            return x.f12023p;
        }

        public final x s() {
            return x.f12019n;
        }

        public final x t() {
            return x.f12021o;
        }

        public final x u() {
            return x.f12013k;
        }

        public final x v() {
            return x.f12011j;
        }

        public final x w() {
            return x.f11984D;
        }

        public final x x() {
            return x.f11982B;
        }

        public final x y() {
            return x.f12012j0;
        }

        public final x z() {
            return x.f12029s;
        }

        public a() {
        }
    }

    static {
        List listA = y.a();
        f12026q0 = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(D6.L.d(C0938s.y(listA, 10)), 16));
        for (Object obj : listA) {
            linkedHashMap.put(Integer.valueOf(((x) obj).f12037a), obj);
        }
        f12028r0 = linkedHashMap;
    }

    public x(int i8, String description) {
        kotlin.jvm.internal.t.g(description, "description");
        this.f12037a = i8;
        this.f12038b = description;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f12037a == this.f12037a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f12037a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int compareTo(x other) {
        kotlin.jvm.internal.t.g(other, "other");
        return this.f12037a - other.f12037a;
    }

    public final String n0() {
        return this.f12038b;
    }

    public final int o0() {
        return this.f12037a;
    }

    public String toString() {
        return this.f12037a + ' ' + this.f12038b;
    }
}
