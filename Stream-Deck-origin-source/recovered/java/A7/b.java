package A7;

import C6.C0918g;
import J7.InterfaceC1035f;
import J7.p;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import u7.A;
import u7.B;
import u7.C;
import u7.v;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f861a;

    public b(boolean z8) {
        this.f861a = z8;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:83:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, u7.B$a] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [u7.B$a] */
    @Override // u7.v
    public B a(v.a chain) throws IllegalAccessException, IOException, InvocationTargetException {
        boolean z8;
        ?? r9;
        ?? R7;
        B.a aVar;
        t.g(chain, "chain");
        g gVar = (g) chain;
        z7.c cVarG = gVar.g();
        t.d(cVarG);
        z zVarI = gVar.i();
        A a8 = zVarI.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cVarG.w(zVarI);
            ?? B8 = f.b(zVarI.h());
            try {
                if (B8 == 0 || a8 == null) {
                    cVarG.p();
                    z8 = true;
                    B8 = 0;
                } else {
                    if (Z6.v.v("100-continue", zVarI.d("Expect"), true)) {
                        cVarG.f();
                        B.a aVarR = cVarG.r(true);
                        try {
                            cVarG.t();
                            z8 = false;
                            aVar = aVarR;
                        } catch (IOException e8) {
                            e = e8;
                            z8 = true;
                            r9 = aVarR;
                            if (e instanceof C7.a) {
                                throw e;
                            }
                            if (!cVarG.k()) {
                                R7 = r9;
                                throw e;
                            }
                        }
                    } else {
                        z8 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        cVarG.p();
                        if (!cVarG.h().v()) {
                            B8 = aVar;
                            cVarG.o();
                            B8 = aVar;
                        }
                    } else if (a8.c()) {
                        cVarG.f();
                        a8.e(p.c(cVarG.c(zVarI, true)));
                    } else {
                        InterfaceC1035f interfaceC1035fC = p.c(cVarG.c(zVarI, false));
                        a8.e(interfaceC1035fC);
                        interfaceC1035fC.close();
                    }
                }
                if (a8 != null) {
                    B8 = aVar;
                    if (!a8.c()) {
                        B8 = aVar;
                        B8 = aVar;
                        B8 = aVar;
                        cVarG.e();
                    }
                } else {
                    B8 = aVar;
                    B8 = aVar;
                    B8 = aVar;
                    cVarG.e();
                }
                B8 = aVar;
                e = null;
                R7 = B8;
            } catch (IOException e9) {
                e = e9;
                r9 = B8;
            }
        } catch (IOException e10) {
            e = e10;
            z8 = true;
            r9 = 0;
        }
        if (R7 == 0) {
            try {
                R7 = cVarG.r(false);
                t.d(R7);
                if (z8) {
                    cVarG.t();
                    z8 = false;
                }
            } catch (IOException e11) {
                if (e == null) {
                    throw e11;
                }
                C0918g.a(e, e11);
                throw e;
            }
        }
        B bC = R7.r(zVarI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iT = bC.t();
        if (b(iT)) {
            B.a aVarR2 = cVarG.r(false);
            t.d(aVarR2);
            if (z8) {
                cVarG.t();
            }
            bC = aVarR2.r(zVarI).i(cVarG.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iT = bC.t();
        }
        cVarG.s(bC);
        B bC2 = (this.f861a && iT == 101) ? bC.r0().b(v7.d.f35181c).c() : bC.r0().b(cVarG.q(bC)).c();
        if (Z6.v.v("close", bC2.J0().d("Connection"), true) || Z6.v.v("close", B.A(bC2, "Connection", null, 2, null), true)) {
            cVarG.o();
        }
        if (iT == 204 || iT == 205) {
            C cB = bC2.b();
            if ((cB != null ? cB.b() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iT);
                sb.append(" had non-zero Content-Length: ");
                C cB2 = bC2.b();
                sb.append(cB2 != null ? Long.valueOf(cB2.b()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return bC2;
    }

    public final boolean b(int i8) {
        if (i8 == 100) {
            return true;
        }
        return 102 <= i8 && i8 < 200;
    }
}
