package T5;

import C6.G;
import X5.C1685n;
import X5.I;
import X5.InterfaceC1690t;
import X5.K;
import X5.N;
import X5.Q;
import io.sentry.exception.uXy.SZCvugJaXc;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p115m6.AbstractC2695e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9910a = new a();

        public a() {
            super(1);
        }

        public final void b(I i8) {
            t.g(i8, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((I) obj);
            return G.f1419a;
        }
    }

    public static final C1685n a(InterfaceC1690t interfaceC1690t, Q6.k block) {
        t.g(interfaceC1690t, "<this>");
        t.g(block, "block");
        C1685n c1685nA = interfaceC1690t.a();
        block.invoke(c1685nA);
        return c1685nA;
    }

    public static final boolean b(e eVar) {
        t.g(eVar, "<this>");
        return eVar.b() instanceof T5.a;
    }

    public static final d c(d dVar, e request) {
        t.g(dVar, "<this>");
        t.g(request, "request");
        dVar.n(request.f());
        dVar.j(request.b());
        dVar.k((p181u6.a) dVar.c().e(j.a()));
        Q.k(dVar.i(), request.h());
        dVar.a().d(request.e());
        AbstractC2695e.a(dVar.c(), request.a());
        return dVar;
    }

    public static final void e(d dVar, String str, String str2, Integer num, String str3, Q6.k block) {
        t.g(dVar, "<this>");
        t.g(block, "block");
        K.i(dVar.i(), str, str2, num, str3, block);
    }

    public static /* synthetic */ void f(d dVar, String str, String str2, Integer num, String str3, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        if ((i8 & 4) != 0) {
            num = null;
        }
        if ((i8 & 8) != 0) {
            str3 = null;
        }
        if ((i8 & 16) != 0) {
            kVar = a.f9910a;
        }
        e(dVar, str, str2, num, str3, kVar);
    }

    public static final void d(d dVar, String urlString) {
        t.g(dVar, SZCvugJaXc.okJIcFuoYFLMD);
        t.g(urlString, "urlString");
        N.j(dVar.i(), urlString);
    }
}
