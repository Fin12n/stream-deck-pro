package D5;

import A5.h;
import A5.m;
import A5.q;
import D6.U;
import F5.d;
import F5.e;
import Q6.k;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: D5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0083a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f1918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f1919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f1920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0083a(d dVar, m mVar, k kVar) {
            super(0);
            this.f1918a = dVar;
            this.f1919b = mVar;
            this.f1920c = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            d dVar = this.f1918a;
            if (dVar != null) {
                return e.a(dVar, this.f1919b.isOptional(), this.f1920c);
            }
            return null;
        }
    }

    public static final h a(h hVar) throws q {
        t.g(hVar, "<this>");
        h hVarG = hVar.g();
        if (hVarG != null) {
            return hVarG;
        }
        throw new IllegalStateException("Parent graph must not be null");
    }

    public static final Set b(h hVar) throws q {
        Set setB;
        Set setI;
        t.g(hVar, "<this>");
        Set setJ = hVar.f().j();
        h hVarG = hVar.g();
        return (hVarG == null || (setB = b(hVarG)) == null || (setI = U.i(setJ, setB)) == null) ? setJ : setI;
    }

    public static final Function0 c(h hVar, m key, k kVar) {
        t.g(hVar, "<this>");
        t.g(key, "key");
        return new C0083a(hVar.a(key), key, kVar);
    }
}
