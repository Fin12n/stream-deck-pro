package G5;

import C6.G;
import D6.z;
import J5.h;
import Q6.k;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f2808b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2809a = new a();

        public a() {
            super(1);
        }

        public final void b(b bVar) {
            t.g(bVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((b) obj);
            return G.f1419a;
        }
    }

    static {
        h hVarA;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
        t.f(serviceLoaderLoad, "load(it, it.classLoader)");
        List listR0 = z.R0(serviceLoaderLoad);
        f2807a = listR0;
        c cVar = (c) z.k0(listR0);
        if (cVar == null || (hVarA = cVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f2808b = hVarA;
    }

    public static final G5.a a(k block) {
        t.g(block, "block");
        return e.a(f2808b, block);
    }

    public static /* synthetic */ G5.a b(k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = a.f2809a;
        }
        return a(kVar);
    }
}
