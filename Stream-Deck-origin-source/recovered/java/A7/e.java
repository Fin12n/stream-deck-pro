package A7;

import D6.M;
import J7.C1034e;
import Z6.v;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;
import p201x2.vAk.hJroAgFztiMK;
import u7.B;
import u7.m;
import u7.n;
import u7.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J7.h f865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J7.h f866b;

    static {
        J7.h.a aVar = J7.h.f4388d;
        f865a = aVar.d("\"\\");
        f866b = aVar.d("\t ,=");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    public static final void c(C1034e c1034e, List list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(c1034e);
                    strE2 = e(c1034e);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(c1034e);
                String strE3 = e(c1034e);
                if (strE3 == null) {
                    if (c1034e.f0()) {
                        list.add(new u7.h(strE2, (Map<String, String>) M.g()));
                        return;
                    }
                    return;
                }
                int iK = v7.d.K(c1034e, (byte) 61);
                boolean zG2 = g(c1034e);
                if (zG || !(zG2 || c1034e.f0())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iK2 = iK + v7.d.K(c1034e, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iK2 != 0) {
                                break;
                                break;
                            }
                            if (iK2 <= 1) {
                                return;
                            }
                            if (h(c1034e, (byte) 34)) {
                                strE = d(c1034e);
                            } else {
                                strE = e(c1034e);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(c1034e)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(c1034e);
                            if (!g(c1034e)) {
                                iK2 = v7.d.K(c1034e, (byte) 61);
                                if (iK2 != 0) {
                                    break;
                                }
                                if (iK2 <= 1 || g(c1034e)) {
                                    return;
                                }
                                if (h(c1034e, (byte) 34)) {
                                    strE = d(c1034e);
                                } else {
                                    strE = e(c1034e);
                                }
                                if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(c1034e) && !c1034e.f0()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new u7.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strE3 + v.z(com.amazon.a.a.o.b.f.f16778b, iK));
                    t.f(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new u7.h(strE2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    public static final String d(C1034e c1034e) throws EOFException {
        if (c1034e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C1034e c1034e2 = new C1034e();
        while (true) {
            long jG1 = c1034e.G1(f865a);
            if (jG1 == -1) {
                return null;
            }
            if (c1034e.w0(jG1) == 34) {
                c1034e2.I1(c1034e, jG1);
                c1034e.readByte();
                return c1034e2.o1();
            }
            if (c1034e.size() == jG1 + 1) {
                return null;
            }
            c1034e2.I1(c1034e, jG1);
            c1034e.readByte();
            c1034e2.I1(c1034e, 1L);
        }
    }

    public static final String e(C1034e c1034e) {
        long jG1 = c1034e.G1(f866b);
        if (jG1 == -1) {
            jG1 = c1034e.size();
        }
        if (jG1 != 0) {
            return c1034e.p1(jG1);
        }
        return null;
    }

    public static final void f(n nVar, u url, u7.t headers) {
        t.g(nVar, "<this>");
        t.g(url, "url");
        t.g(headers, "headers");
        if (nVar == n.f34792b) {
            return;
        }
        List listE = m.f34777j.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        nVar.b(url, listE);
    }

    public static final boolean g(C1034e c1034e) throws EOFException {
        boolean z8 = false;
        while (!c1034e.f0()) {
            byte bW0 = c1034e.w0(0L);
            if (bW0 == 44) {
                c1034e.readByte();
                z8 = true;
            } else {
                if (bW0 != 32 && bW0 != 9) {
                    break;
                }
                c1034e.readByte();
            }
        }
        return z8;
    }

    public static final boolean h(C1034e c1034e, byte b8) {
        return !c1034e.f0() && c1034e.w0(0L) == b8;
    }

    public static final List a(u7.t tVar, String str) {
        t.g(tVar, "<this>");
        t.g(str, toqHM.ZUUUqOGhFVH);
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (v.v(str, tVar.m(i8), true)) {
                try {
                    c(new C1034e().I0(tVar.u(i8)), arrayList);
                } catch (EOFException e8) {
                    E7.h.f2311a.g().k("Unable to parse challenge", 5, e8);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(B b8) {
        t.g(b8, hJroAgFztiMK.DWU);
        if (t.c(b8.J0().h(), "HEAD")) {
            return false;
        }
        int iT = b8.t();
        return (((iT >= 100 && iT < 200) || iT == 204 || iT == 304) && v7.d.v(b8) == -1 && !v.v("chunked", B.A(b8, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }
}
