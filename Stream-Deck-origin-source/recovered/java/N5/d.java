package N5;

import C6.r;
import D6.M;
import D6.z;
import X5.AbstractC1677f;
import X5.AbstractC1687p;
import X5.AbstractC1691u;
import X5.C1680i;
import X5.C1685n;
import X5.C1688q;
import X5.InterfaceC1684m;
import Z6.v;
import Z6.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p180u5.FCkZ.BpgIURjN;
import p205x6.k;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f7492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7493d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7492c = obj;
            this.f7493d |= Integer.MIN_VALUE;
            return d.a(false, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7494a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p141p6.c invoke() {
            return p141p6.a.c(null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(boolean z8, U5.c cVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f7493d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f7493d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f7492c;
        Object objF = H6.c.f();
        int i9 = aVar2.f7493d;
        if (i9 == 0) {
            r.b(objA);
            io.ktor.utils.io.g gVarB = cVar.b();
            aVar2.f7491b = cVar;
            aVar2.f7490a = z8;
            aVar2.f7493d = 1;
            objA = io.ktor.utils.io.g.b.a(gVarB, 0L, aVar2, 1, null);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = aVar2.f7490a;
            cVar = (U5.c) aVar2.f7491b;
            r.b(objA);
        }
        byte[] bArrC = y.c((k) objA, 0, 1, null);
        U5.e.c(cVar);
        return new c(c(cVar, z8, null, 2, null), e(cVar), cVar, bArrC);
    }

    public static final p141p6.c b(U5.c cVar, boolean z8, Function0 fallback) {
        String str;
        Object next;
        String strD;
        List listA0;
        String str2;
        t.g(cVar, "<this>");
        t.g(fallback, "fallback");
        List listA = AbstractC1691u.a(cVar);
        Long lO = null;
        if (z8 && (listA == null || !listA.isEmpty())) {
            Iterator it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    str = "max-age";
                    break;
                }
                str = "s-maxage";
            } while (!v.H(((C1680i) it.next()).d(), "s-maxage", false, 2, null));
        } else {
            str = "max-age";
            break;
        }
        Iterator it2 = listA.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!v.H(((C1680i) next).d(), str, false, 2, null));
        C1680i c1680i = (C1680i) next;
        if (c1680i != null && (strD = c1680i.d()) != null && (listA0 = w.A0(strD, new String[]{com.amazon.a.a.o.b.f.f16778b}, false, 0, 6, null)) != null && (str2 = (String) listA0.get(1)) != null) {
            lO = Z6.u.o(str2);
        }
        if (lO != null) {
            return p141p6.b.a(cVar.d(), lO.longValue() * 1000);
        }
        String strD2 = cVar.a().d(C1688q.f11910a.o());
        if (strD2 == null) {
            return (p141p6.c) fallback.invoke();
        }
        if (t.c(strD2, "0") || w.b0(strD2)) {
            return (p141p6.c) fallback.invoke();
        }
        try {
            return AbstractC1677f.a(strD2);
        } catch (Throwable unused) {
            return (p141p6.c) fallback.invoke();
        }
    }

    public static /* synthetic */ p141p6.c c(U5.c cVar, boolean z8, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function0 = b.f7494a;
        }
        return b(cVar, z8, function0);
    }

    public static final Map e(U5.c cVar) {
        t.g(cVar, "<this>");
        List<String> listG = AbstractC1691u.g(cVar);
        if (listG == null) {
            return M.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1684m interfaceC1684mA = cVar.g1().f().a();
        for (String str : listG) {
            String strD = interfaceC1684mA.d(str);
            if (strD == null) {
                strD = "";
            }
            linkedHashMap.put(str, strD);
        }
        return linkedHashMap;
    }

    public static final i d(p141p6.c cacheExpires, InterfaceC1684m responseHeaders, T5.d request) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String strD;
        Integer numM;
        String strD2;
        List listA0;
        String str;
        t.g(cacheExpires, "cacheExpires");
        t.g(responseHeaders, "responseHeaders");
        t.g(request, "request");
        C1685n c1685nA = request.a();
        C1688q c1688q = C1688q.f11910a;
        List listC = responseHeaders.c(c1688q.f());
        Object obj = null;
        List listC2 = AbstractC1687p.c(listC != null ? z.r0(listC, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null) : null);
        List listC3 = c1685nA.c(c1688q.f());
        List listC4 = AbstractC1687p.c(listC3 != null ? z.r0(listC3, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null) : null);
        if (listC4.contains(N5.a.f7436a.b())) {
            e.c().b("\"no-cache\" is set for " + request.i() + ", should validate cached response");
            return i.ShouldValidate;
        }
        Iterator it = listC4.iterator();
        do {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!v.H(((C1680i) next).d(), "max-age=", false, 2, null));
        C1680i c1680i = (C1680i) next;
        if (c1680i == null || (strD2 = c1680i.d()) == null || (listA0 = w.A0(strD2, new String[]{com.amazon.a.a.o.b.f.f16778b}, false, 0, 6, null)) == null || (str = (String) listA0.get(1)) == null) {
            numValueOf = null;
        } else {
            Integer numM2 = Z6.u.m(str);
            numValueOf = Integer.valueOf(numM2 != null ? numM2.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            e.c().b("\"max-age\" is not set for " + request.i() + ", should validate cached response");
            return i.ShouldValidate;
        }
        N5.a aVar = N5.a.f7436a;
        if (listC2.contains(aVar.b())) {
            e.c().b("\"no-cache\" is set for " + request.i() + ", should validate cached response");
            return i.ShouldValidate;
        }
        long jB = cacheExpires.b() - p141p6.a.d();
        if (jB > 0) {
            e.c().b("Cached response is valid for " + request.i() + ", should not validate");
            return i.ShouldNotValidate;
        }
        if (listC2.contains(aVar.a())) {
            e.c().b("\"must-revalidate\" is set for " + request.i() + ", should validate cached response");
            return i.ShouldValidate;
        }
        for (Object obj2 : listC4) {
            if (v.H(((C1680i) obj2).d(), "max-stale=", false, 2, null)) {
                obj = obj2;
                break;
            }
        }
        C1680i c1680i2 = (C1680i) obj;
        if (c1680i2 != null && (strD = c1680i2.d()) != null) {
            String strSubstring = strD.substring(10);
            t.f(strSubstring, BpgIURjN.vAQoCaZJR);
            if (strSubstring != null && (numM = Z6.u.m(strSubstring)) != null) {
                iIntValue = numM.intValue();
            }
        }
        if (jB + (((long) iIntValue) * 1000) > 0) {
            e.c().b("Cached response is stale for " + request.i() + " but less than max-stale, should warn");
            return i.ShouldWarn;
        }
        e.c().b("Cached response is stale for " + request.i() + ", should validate cached response");
        return i.ShouldValidate;
    }
}
