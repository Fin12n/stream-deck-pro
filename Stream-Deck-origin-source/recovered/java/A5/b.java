package A5;

import P2.Lsk.mHPawN;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f811a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f812b = k.b("application scope");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f813c = k.b("prototype");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f814d = k.b("singleton");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f815e = new a(Set.class, true, k.b(mHPawN.ToNjKqHNm), null);

    public static final c a(String qualifier, Q6.k block) {
        t.g(qualifier, "qualifier");
        t.g(block, "block");
        c.a aVar = new c.a(qualifier, null, null, 6, null);
        block.invoke(aVar);
        return aVar.d();
    }

    public static /* synthetic */ c b(String str, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = f812b;
        }
        return a(str, kVar);
    }

    public static final h c() {
        return c.e(c.f816c.a(), null, null, 3, null);
    }

    public static final String d() {
        return f812b;
    }

    public static final m e() {
        return f815e;
    }

    public static final String f() {
        return f813c;
    }

    public static final String g() {
        return f814d;
    }

    public static final Object h() {
        return f811a;
    }
}
