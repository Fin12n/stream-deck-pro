package D;

import A.AbstractC0890p0;
import A.D0;
import C6.m;
import H.I;
import V.ocy.SVzBK;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1669b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1670a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ b c(a aVar, D0 d8, I i8, F.c cVar, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                cVar = new F.a(i8);
            }
            return aVar.b(d8, i8, cVar);
        }

        public final b a(D0 d8, I cameraInfoInternal) {
            t.g(d8, "<this>");
            t.g(cameraInfoInternal, "cameraInfoInternal");
            return c(this, d8, cameraInfoInternal, null, 2, null);
        }

        public a() {
        }

        public final b b(D0 d8, I cameraInfoInternal, F.c resolver) {
            t.g(d8, "<this>");
            t.g(cameraInfoInternal, "cameraInfoInternal");
            t.g(resolver, "resolver");
            AbstractC0890p0.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + d8 + ", lensFacing = " + cameraInfoInternal.i());
            if (d8.h().isEmpty() && d8.g().isEmpty()) {
                return null;
            }
            F.b bVarA = resolver.a(d8);
            if (bVarA instanceof F.b.a) {
                b bVarA2 = ((F.b.a) bVarA).a();
                AbstractC0890p0.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + bVarA2);
                return bVarA2;
            }
            if (bVarA instanceof F.b.C0109b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (bVarA instanceof F.b.c) {
                throw new IllegalArgumentException(((F.b.c) bVarA).a() + " is not supported");
            }
            if (!(bVarA instanceof F.b.d)) {
                throw new m();
            }
            StringBuilder sb = new StringBuilder();
            F.b.d dVar = (F.b.d) bVarA;
            sb.append(dVar.b());
            sb.append(SVzBK.lafPeuRGFeX);
            sb.append(dVar.a());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public b(Set<? extends C.b> features) {
        t.g(features, "features");
        this.f1670a = features;
    }

    public static final b b(D0 d8, I i8) {
        return f1669b.a(d8, i8);
    }

    public final Set a() {
        return this.f1670a;
    }

    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.f1670a + ')';
    }
}
