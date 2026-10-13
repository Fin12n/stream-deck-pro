package N5;

import D6.r;
import D6.z;
import J5.o;
import Q6.k;
import X5.C1674c;
import X5.C1688q;
import X5.O;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f7495a = p157r6.a.a("io.ktor.client.plugins.HttpCache");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p007a6.c f7496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f7497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f7498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p007a6.c cVar, k kVar, k kVar2) {
            super(1);
            this.f7496a = cVar;
            this.f7497b = kVar;
            this.f7498c = kVar2;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String header) {
            String string;
            String string2;
            t.g(header, "header");
            C1688q c1688q = C1688q.f11910a;
            if (t.c(header, c1688q.i())) {
                Long lA = this.f7496a.a();
                return (lA == null || (string2 = lA.toString()) == null) ? "" : string2;
            }
            if (t.c(header, c1688q.j())) {
                C1674c c1674cB = this.f7496a.b();
                return (c1674cB == null || (string = c1674cB.toString()) == null) ? "" : string;
            }
            if (t.c(header, c1688q.D())) {
                String strD = this.f7496a.c().d(c1688q.D());
                if (strD != null) {
                    return strD;
                }
                String str = (String) this.f7497b.invoke(c1688q.D());
                return str == null ? o.c() : str;
            }
            List listC = this.f7496a.c().c(header);
            if (listC == null && (listC = (List) this.f7498c.invoke(header)) == null) {
                listC = r.n();
            }
            return z.r0(listC, ";", null, null, 0, null, null, 62, null);
        }
    }

    public static final boolean b(O o8) {
        return t.c(o8.e(), "http") || t.c(o8.e(), "https");
    }

    public static final L7.a c() {
        return f7495a;
    }

    public static final k d(p007a6.c content, k headerExtractor, k allHeadersExtractor) {
        t.g(content, "content");
        t.g(headerExtractor, "headerExtractor");
        t.g(allHeadersExtractor, "allHeadersExtractor");
        return new a(content, headerExtractor, allHeadersExtractor);
    }
}
