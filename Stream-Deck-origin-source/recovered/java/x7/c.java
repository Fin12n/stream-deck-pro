package x7;

import Z6.v;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.B;
import u7.C3044d;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37455c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f37456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f37457b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(B response, z request) {
            t.g(response, "response");
            t.g(request, "request");
            int iT = response.t();
            if (iT != 200 && iT != 410 && iT != 414 && iT != 501 && iT != 203 && iT != 204) {
                if (iT == 307) {
                    if (B.A(response, "Expires", null, 2, null) == null && response.c().c() == -1 && !response.c().b() && !response.c().a()) {
                        return false;
                    }
                } else if (iT != 308 && iT != 404 && iT != 405) {
                    switch (iT) {
                        case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (B.A(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.c().h() || request.b().h()) ? false : true;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f37458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z f37459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B f37460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Date f37461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f37462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Date f37463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f37464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Date f37465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f37466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f37467j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f37468k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f37469l;

        public b(long j8, z request, B b8) {
            t.g(request, "request");
            this.f37458a = j8;
            this.f37459b = request;
            this.f37460c = b8;
            this.f37469l = -1;
            if (b8 != null) {
                this.f37466i = b8.L0();
                this.f37467j = b8.H0();
                u7.t tVarY = b8.Y();
                int size = tVarY.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String strM = tVarY.m(i8);
                    String strU = tVarY.u(i8);
                    if (v.v(strM, "Date", true)) {
                        this.f37461d = A7.c.a(strU);
                        this.f37462e = strU;
                    } else if (v.v(strM, "Expires", true)) {
                        this.f37465h = A7.c.a(strU);
                    } else if (v.v(strM, "Last-Modified", true)) {
                        this.f37463f = A7.c.a(strU);
                        this.f37464g = strU;
                    } else if (v.v(strM, "ETag", true)) {
                        this.f37468k = strU;
                    } else if (v.v(strM, "Age", true)) {
                        this.f37469l = v7.d.X(strU, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f37461d;
            long jMax = date != null ? Math.max(0L, this.f37467j - date.getTime()) : 0L;
            int i8 = this.f37469l;
            if (i8 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i8));
            }
            long j8 = this.f37467j;
            return jMax + (j8 - this.f37466i) + (this.f37458a - j8);
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f37459b.b().i()) ? cVarC : new c(null, null);
        }

        public final c c() {
            String str;
            if (this.f37460c == null) {
                return new c(this.f37459b, null);
            }
            if (this.f37459b.g() && this.f37460c.y() == null) {
                return new c(this.f37459b, null);
            }
            if (!c.f37455c.a(this.f37460c, this.f37459b)) {
                return new c(this.f37459b, null);
            }
            C3044d c3044dB = this.f37459b.b();
            if (c3044dB.g() || e(this.f37459b)) {
                return new c(this.f37459b, null);
            }
            C3044d c3044dC = this.f37460c.c();
            long jA = a();
            long jD = d();
            if (c3044dB.c() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c3044dB.c()));
            }
            long millis = 0;
            long millis2 = c3044dB.e() != -1 ? TimeUnit.SECONDS.toMillis(c3044dB.e()) : 0L;
            if (!c3044dC.f() && c3044dB.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c3044dB.d());
            }
            if (!c3044dC.g()) {
                long j8 = millis2 + jA;
                if (j8 < millis + jD) {
                    B.a aVarR0 = this.f37460c.r0();
                    if (j8 >= jD) {
                        aVarR0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarR0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarR0.c());
                }
            }
            String str2 = this.f37468k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f37463f != null) {
                    str2 = this.f37464g;
                } else {
                    if (this.f37461d == null) {
                        return new c(this.f37459b, null);
                    }
                    str2 = this.f37462e;
                }
                str = "If-Modified-Since";
            }
            u7.t.a aVarS = this.f37459b.f().s();
            t.d(str2);
            aVarS.c(str, str2);
            return new c(this.f37459b.i().d(aVarS.d()).b(), this.f37460c);
        }

        public final long d() {
            B b8 = this.f37460c;
            t.d(b8);
            C3044d c3044dC = b8.c();
            if (c3044dC.c() != -1) {
                return TimeUnit.SECONDS.toMillis(c3044dC.c());
            }
            Date date = this.f37465h;
            if (date != null) {
                Date date2 = this.f37461d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f37467j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f37463f != null && this.f37460c.J0().j().m() == null) {
                Date date3 = this.f37461d;
                long time2 = date3 != null ? date3.getTime() : this.f37466i;
                Date date4 = this.f37463f;
                t.d(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        public final boolean e(z zVar) {
            return (zVar.d("If-Modified-Since") == null && zVar.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            B b8 = this.f37460c;
            t.d(b8);
            return b8.c().c() == -1 && this.f37465h == null;
        }
    }

    public c(z zVar, B b8) {
        this.f37456a = zVar;
        this.f37457b = b8;
    }

    public final B a() {
        return this.f37457b;
    }

    public final z b() {
        return this.f37456a;
    }
}
