package M3;

import C6.v;
import D6.C0938s;
import D6.M;
import D6.z;
import M6.eLZq.eGwOBWCdOTaKus;
import V.ocy.SVzBK;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f5491p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f5500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f5501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f5502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f5505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5506o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a(List list) {
            Long lValueOf;
            Object next;
            Date dateA;
            Object objPrevious;
            Date dateA2;
            e.h hVar;
            Iterator it = list.iterator();
            do {
                lValueOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((e.h) next) instanceof e.c));
            e.h hVar2 = (e.h) next;
            if (hVar2 == null || (dateA = hVar2.a()) == null) {
                return 0L;
            }
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                hVar = (e.h) objPrevious;
                if (hVar instanceof e.d) {
                    break;
                }
            } while (!(hVar instanceof e.C0185e));
            e.h hVar3 = (e.h) objPrevious;
            if (hVar3 != null && (dateA2 = hVar3.a()) != null) {
                lValueOf = Long.valueOf(dateA2.getTime() - dateA.getTime());
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            return 0L;
        }

        public final List b(List list) {
            Long lValueOf;
            Object next;
            Date dateA;
            Object next2;
            Date dateA2;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                Iterator it2 = list2.iterator();
                do {
                    lValueOf = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((e.h) next) instanceof e.g));
                e.h hVar = (e.h) next;
                if (hVar != null && (dateA = hVar.a()) != null) {
                    Iterator it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!(((e.h) next2) instanceof e.c));
                    e.h hVar2 = (e.h) next2;
                    if (hVar2 != null && (dateA2 = hVar2.a()) != null) {
                        lValueOf = Long.valueOf(dateA2.getTime() - dateA.getTime());
                    }
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            return arrayList;
        }

        public final long c(List list) {
            if (list.size() < 2) {
                return 0L;
            }
            return ((e.h) z.t0(list)).a().getTime() - ((e.h) z.i0(list)).a().getTime();
        }

        public final r d(m.C1038c state) {
            int i8;
            int i9;
            int i10;
            int i11;
            d dVarA;
            kotlin.jvm.internal.t.g(state, "state");
            e eVarG = state.g();
            M3.a aVarA = h.a(state.d());
            boolean z8 = (aVarA != null ? aVarA.a() : null) != null;
            M3.a aVarA2 = h.a(state.d());
            String message = (aVarA2 == null || (dVarA = aVarA2.a()) == null) ? null : dVarA.getMessage();
            M3.a aVarA3 = h.a(state.d());
            String description = aVarA3 != null ? aVarA3.getDescription() : null;
            long jC = c(eVarG.b());
            long jA = a(eVarG.b());
            List listB = eVarG.b();
            if (listB == null || !listB.isEmpty()) {
                Iterator it = listB.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if ((((e.h) it.next()) instanceof e.g) && (i12 = i12 + 1) < 0) {
                        D6.r.w();
                    }
                }
                i8 = i12;
            } else {
                i8 = 0;
            }
            List listB2 = eVarG.b();
            if (listB2 == null || !listB2.isEmpty()) {
                Iterator it2 = listB2.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    if ((((e.h) it2.next()) instanceof e.b) && (i13 = i13 + 1) < 0) {
                        D6.r.w();
                    }
                }
                i9 = i13;
            } else {
                i9 = 0;
            }
            List listB3 = eVarG.b();
            if (listB3 == null || !listB3.isEmpty()) {
                Iterator it3 = listB3.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    if ((((e.h) it3.next()) instanceof e.C0185e) && (i14 = i14 + 1) < 0) {
                        D6.r.w();
                    }
                }
                i10 = i14;
            } else {
                i10 = 0;
            }
            List listB4 = eVarG.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB4) {
                if (obj instanceof e.g) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((e.g) it4.next()).a());
            }
            List listB5 = eVarG.b();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listB5) {
                e eVar = eVarG;
                if (obj2 instanceof e.f) {
                    arrayList3.add(obj2);
                }
                eVarG = eVar;
            }
            e eVar2 = eVarG;
            ArrayList arrayList4 = new ArrayList(C0938s.y(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(((e.f) it5.next()).a());
            }
            b bVar = new b(arrayList2, arrayList4);
            List listE = e(eVar2.b());
            ArrayList arrayList5 = new ArrayList(C0938s.y(listE, 10));
            Iterator it6 = listE.iterator();
            while (it6.hasNext()) {
                List list = (List) it6.next();
                if (list == null || !list.isEmpty()) {
                    Iterator it7 = list.iterator();
                    int i15 = 0;
                    while (it7.hasNext()) {
                        if ((((e.h) it7.next()) instanceof e.a) && (i15 = i15 + 1) < 0) {
                            D6.r.w();
                        }
                    }
                    i11 = i15;
                } else {
                    i11 = 0;
                }
                b bVar2 = bVar;
                Iterator it8 = it6;
                arrayList5.add(Long.valueOf(i11));
                bVar = bVar2;
                it6 = it8;
            }
            return new r(z8, message, description, jC, jA, i8, i9, i10, bVar, new b(arrayList5), new b(b(listE)), state.l(), String.valueOf(state.k()), state.i(), state.j());
        }

        public final List e(List list) {
            List list2;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e.h hVar = (e.h) it.next();
                if (hVar instanceof e.g) {
                    arrayList.add(D6.r.t(hVar));
                } else if (!(hVar instanceof e.i) && (list2 = (List) z.u0(arrayList)) != null) {
                    list2.add(hVar);
                }
            }
            return arrayList;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5510d;

        public b(long j8, long j9, long j10, long j11) {
            this.f5507a = j8;
            this.f5508b = j9;
            this.f5509c = j10;
            this.f5510d = j11;
        }

        public final long a() {
            return this.f5509c;
        }

        public final long b() {
            return this.f5508b;
        }

        public final long c() {
            return this.f5510d;
        }

        public final long d() {
            return this.f5507a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5507a == bVar.f5507a && this.f5508b == bVar.f5508b && this.f5509c == bVar.f5509c && this.f5510d == bVar.f5510d;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f5507a) * 31) + Long.hashCode(this.f5508b)) * 31) + Long.hashCode(this.f5509c)) * 31) + Long.hashCode(this.f5510d);
        }

        public String toString() {
            return "Stat(min=" + this.f5507a + SVzBK.jEzi + this.f5508b + ", avg=" + this.f5509c + ", med=" + this.f5510d + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(List<Long> array) {
            kotlin.jvm.internal.t.g(array, "array");
            Long l8 = (Long) z.x0(array);
            long jLongValue = l8 != null ? l8.longValue() : 0L;
            Long l9 = (Long) z.v0(array);
            this(jLongValue, l9 != null ? l9.longValue() : 0L, (long) z.a0(array), s.a(array));
        }

        public b(List<? extends Date> start, List<? extends Date> end) {
            kotlin.jvm.internal.t.g(start, "start");
            kotlin.jvm.internal.t.g(end, "end");
            List<C6.o> listB = s.b(start, end);
            ArrayList arrayList = new ArrayList(C0938s.y(listB, 10));
            for (C6.o oVar : listB) {
                arrayList.add(Long.valueOf(((Date) oVar.b()).getTime() - ((Date) oVar.a()).getTime()));
            }
            this(arrayList);
        }
    }

    public r(boolean z8, String str, String str2, long j8, long j9, int i8, int i9, int i10, b discoverySessionTimeSpan, b connectionAttemptsPerDiscoverySession, b timeFromDiscoveryStartToConnected, String str3, String str4, String str5, String str6) {
        kotlin.jvm.internal.t.g(discoverySessionTimeSpan, "discoverySessionTimeSpan");
        kotlin.jvm.internal.t.g(connectionAttemptsPerDiscoverySession, "connectionAttemptsPerDiscoverySession");
        kotlin.jvm.internal.t.g(timeFromDiscoveryStartToConnected, "timeFromDiscoveryStartToConnected");
        this.f5492a = z8;
        this.f5493b = str;
        this.f5494c = str2;
        this.f5495d = j8;
        this.f5496e = j9;
        this.f5497f = i8;
        this.f5498g = i9;
        this.f5499h = i10;
        this.f5500i = discoverySessionTimeSpan;
        this.f5501j = connectionAttemptsPerDiscoverySession;
        this.f5502k = timeFromDiscoveryStartToConnected;
        this.f5503l = str3;
        this.f5504m = str4;
        this.f5505n = str5;
        this.f5506o = str6;
    }

    public final long a() {
        return this.f5496e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f5492a == rVar.f5492a && kotlin.jvm.internal.t.c(this.f5493b, rVar.f5493b) && kotlin.jvm.internal.t.c(this.f5494c, rVar.f5494c) && this.f5495d == rVar.f5495d && this.f5496e == rVar.f5496e && this.f5497f == rVar.f5497f && this.f5498g == rVar.f5498g && this.f5499h == rVar.f5499h && kotlin.jvm.internal.t.c(this.f5500i, rVar.f5500i) && kotlin.jvm.internal.t.c(this.f5501j, rVar.f5501j) && kotlin.jvm.internal.t.c(this.f5502k, rVar.f5502k) && kotlin.jvm.internal.t.c(this.f5503l, rVar.f5503l) && kotlin.jvm.internal.t.c(this.f5504m, rVar.f5504m) && kotlin.jvm.internal.t.c(this.f5505n, rVar.f5505n) && kotlin.jvm.internal.t.c(this.f5506o, rVar.f5506o);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f5492a) * 31;
        String str = this.f5493b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5494c;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.f5495d)) * 31) + Long.hashCode(this.f5496e)) * 31) + Integer.hashCode(this.f5497f)) * 31) + Integer.hashCode(this.f5498g)) * 31) + Integer.hashCode(this.f5499h)) * 31) + this.f5500i.hashCode()) * 31) + this.f5501j.hashCode()) * 31) + this.f5502k.hashCode()) * 31;
        String str3 = this.f5503l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5504m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5505n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5506o;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Map b() {
        C6.o oVarA = v.a("closed_with_error", String.valueOf(this.f5492a));
        String str = this.f5493b;
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA2 = v.a("error_description", str);
        String str2 = this.f5494c;
        if (str2 == null) {
            str2 = "-1";
        }
        C6.o oVarA3 = v.a("close_reason", str2);
        C6.o oVarA4 = v.a("session_time_span", String.valueOf(this.f5495d));
        C6.o oVarA5 = v.a("connected_time_span", String.valueOf(this.f5496e));
        C6.o oVarA6 = v.a("discovery_sessions_count", String.valueOf(this.f5497f));
        C6.o oVarA7 = v.a("connecting_failed_count", String.valueOf(this.f5498g));
        C6.o oVarA8 = v.a("connection_failed_count", String.valueOf(this.f5499h));
        C6.o oVarA9 = v.a("discovery_session_time_span_min", String.valueOf(this.f5500i.d()));
        C6.o oVarA10 = v.a(eGwOBWCdOTaKus.jMMEaSq, String.valueOf(this.f5500i.b()));
        C6.o oVarA11 = v.a("discovery_session_time_span_avg", String.valueOf(this.f5500i.a()));
        C6.o oVarA12 = v.a("discovery_session_time_span_med", String.valueOf(this.f5500i.c()));
        C6.o oVarA13 = v.a("connection_attempts_per_discovery_session_min", String.valueOf(this.f5501j.d()));
        C6.o oVarA14 = v.a("connection_attempts_per_discovery_session_max", String.valueOf(this.f5501j.b()));
        C6.o oVarA15 = v.a("connection_attempts_per_discovery_session_avg", String.valueOf(this.f5501j.a()));
        C6.o oVarA16 = v.a("connection_attempts_per_discovery_session_med", String.valueOf(this.f5501j.c()));
        C6.o oVarA17 = v.a("time_from_discovery_start_to_connected_min", String.valueOf(this.f5502k.d()));
        C6.o oVarA18 = v.a("time_from_discovery_start_to_connected_max", String.valueOf(this.f5502k.b()));
        C6.o oVarA19 = v.a("time_from_discovery_start_to_connected_avg", String.valueOf(this.f5502k.a()));
        C6.o oVarA20 = v.a("time_from_discovery_start_to_connected_med", String.valueOf(this.f5502k.c()));
        String str3 = this.f5505n;
        if (str3 == null) {
            str3 = "-1";
        }
        C6.o oVarA21 = v.a("server_os_name", str3);
        String str4 = this.f5506o;
        if (str4 == null) {
            str4 = "-1";
        }
        C6.o oVarA22 = v.a("server_os_version", str4);
        String str5 = this.f5503l;
        if (str5 == null) {
            str5 = "-1";
        }
        return M.j(oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, oVarA8, oVarA9, oVarA10, oVarA11, oVarA12, oVarA13, oVarA14, oVarA15, oVarA16, oVarA17, oVarA18, oVarA19, oVarA20, oVarA21, oVarA22, v.a("server_version", str5), v.a("server_protocol_version", String.valueOf(this.f5504m)));
    }

    public String toString() {
        return "StreamDeckConnectionMetrics(closedWithError=" + this.f5492a + ", closedErrorDescription=" + this.f5493b + ", closeReason=" + this.f5494c + ", sessionTimeSpan=" + this.f5495d + ", connectedTimeSpan=" + this.f5496e + ", discoverySessionsCount=" + this.f5497f + ", connectingFailedCount=" + this.f5498g + ", connectionFailedCount=" + this.f5499h + ", discoverySessionTimeSpan=" + this.f5500i + ", connectionAttemptsPerDiscoverySession=" + this.f5501j + SZCvugJaXc.sPvpzVks + this.f5502k + ", serverVersion=" + this.f5503l + ", serverProtocolVersion=" + this.f5504m + ", serverOSName=" + this.f5505n + ", serverOSVersion=" + this.f5506o + ")";
    }
}
