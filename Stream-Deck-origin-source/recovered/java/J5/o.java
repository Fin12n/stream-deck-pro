package J5;

import C6.G;
import D6.T;
import D6.z;
import X5.C1674c;
import X5.C1685n;
import X5.C1688q;
import X5.InterfaceC1684m;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4349a = "Ktor client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f4350b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1684m f4351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p007a6.c f4352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1684m interfaceC1684m, p007a6.c cVar) {
            super(1);
            this.f4351a = interfaceC1684m;
            this.f4352b = cVar;
        }

        public final void b(C1685n buildHeaders) {
            t.g(buildHeaders, "$this$buildHeaders");
            buildHeaders.d(this.f4351a);
            buildHeaders.d(this.f4352b.c());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C1685n) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f4353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Q6.o oVar) {
            super(2);
            this.f4353a = oVar;
        }

        public final void b(String key, List values) {
            t.g(key, "key");
            t.g(values, "values");
            C1688q c1688q = C1688q.f11910a;
            if (t.c(c1688q.i(), key) || t.c(c1688q.j(), key)) {
                return;
            }
            if (!o.f4350b.contains(key)) {
                this.f4353a.invoke(key, z.r0(values, t.c(c1688q.k(), key) ? "; " : com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null));
                return;
            }
            Q6.o oVar = this.f4353a;
            Iterator it = values.iterator();
            while (it.hasNext()) {
                oVar.invoke(key, (String) it.next());
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return G.f1419a;
        }
    }

    static {
        C1688q c1688q = C1688q.f11910a;
        f4350b = T.g(c1688q.l(), c1688q.o(), c1688q.t(), c1688q.q(), c1688q.s());
    }

    public static final Object b(G6.d dVar) {
        G6.g.b bVarA = dVar.getContext().A(j.f4340b);
        t.d(bVarA);
        return ((j) bVarA).a();
    }

    public static final String c() {
        return f4349a;
    }

    public static final boolean e() {
        return !p115m6.z.f30119a.a();
    }

    public static final void d(InterfaceC1684m requestHeaders, p007a6.c content, Q6.o oVar) {
        String strD;
        String strD2;
        t.g(requestHeaders, "requestHeaders");
        t.g(content, "content");
        t.g(oVar, BpgIURjN.zdpoZOReAMTkvIc);
        V5.f.a(new a(requestHeaders, content)).e(new b(oVar));
        C1688q c1688q = C1688q.f11910a;
        if (requestHeaders.d(c1688q.D()) == null && content.c().d(c1688q.D()) == null && e()) {
            oVar.invoke(c1688q.D(), f4349a);
        }
        C1674c c1674cB = content.b();
        if ((c1674cB == null || (strD = c1674cB.toString()) == null) && (strD = content.c().d(c1688q.j())) == null) {
            strD = requestHeaders.d(c1688q.j());
        }
        Long lA = content.a();
        if ((lA == null || (strD2 = lA.toString()) == null) && (strD2 = content.c().d(c1688q.i())) == null) {
            strD2 = requestHeaders.d(c1688q.i());
        }
        if (strD != null) {
            oVar.invoke(c1688q.j(), strD);
        }
        if (strD2 != null) {
            oVar.invoke(c1688q.i(), strD2);
        }
    }
}
