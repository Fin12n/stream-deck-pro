package A7;

import D6.r;
import J7.p;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.List;
import kotlin.jvm.internal.t;
import u7.A;
import u7.B;
import u7.C;
import u7.m;
import u7.n;
import u7.v;
import u7.w;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f860a;

    public a(n cookieJar) {
        t.g(cookieJar, "cookieJar");
        this.f860a = cookieJar;
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.x();
            }
            m mVar = (m) obj;
            if (i8 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.e());
            sb.append('=');
            sb.append(mVar.g());
            i8 = i9;
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // u7.v
    public B a(v.a chain) {
        C cB;
        t.g(chain, "chain");
        z zVarB = chain.b();
        z.a aVarI = zVarB.i();
        A a8 = zVarB.a();
        if (a8 != null) {
            w wVarB = a8.b();
            if (wVarB != null) {
                aVarI.c("Content-Type", wVarB.toString());
            }
            long jA = a8.a();
            if (jA != -1) {
                aVarI.c("Content-Length", String.valueOf(jA));
                aVarI.f("Transfer-Encoding");
            } else {
                aVarI.c("Transfer-Encoding", "chunked");
                aVarI.f("Content-Length");
            }
        }
        String str = cFAYKUlMj.bsOBWsH;
        boolean z8 = false;
        if (zVarB.d(str) == null) {
            aVarI.c(str, v7.d.T(zVarB.j(), false, 1, null));
        }
        if (zVarB.d("Connection") == null) {
            aVarI.c("Connection", "Keep-Alive");
        }
        if (zVarB.d("Accept-Encoding") == null && zVarB.d("Range") == null) {
            aVarI.c("Accept-Encoding", "gzip");
            z8 = true;
        }
        List listA = this.f860a.a(zVarB.j());
        if (!listA.isEmpty()) {
            aVarI.c("Cookie", b(listA));
        }
        if (zVarB.d("User-Agent") == null) {
            aVarI.c("User-Agent", "okhttp/4.12.0");
        }
        B bA = chain.a(aVarI.b());
        e.f(this.f860a, zVarB.j(), bA.Y());
        B.a aVarR = bA.r0().r(zVarB);
        if (z8 && Z6.v.v("gzip", B.A(bA, "Content-Encoding", null, 2, null), true) && e.b(bA) && (cB = bA.b()) != null) {
            J7.m mVar = new J7.m(cB.c());
            aVarR.k(bA.Y().s().g("Content-Encoding").g("Content-Length").d());
            aVarR.b(new h(B.A(bA, "Content-Type", null, 2, null), -1L, p.d(mVar)));
        }
        return aVarR.c();
    }
}
