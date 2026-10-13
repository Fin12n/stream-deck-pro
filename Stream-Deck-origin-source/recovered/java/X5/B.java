package X5;

import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p016b6.d f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p016b6.d f11740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p016b6.i f11741c;

    static {
        p016b6.d dVarD = p016b6.j.d(p016b6.j.e(p016b6.j.d(p016b6.j.e(p016b6.j.d(p016b6.j.e(p016b6.k.b(), "."), p016b6.k.b()), "."), p016b6.k.b()), "."), p016b6.k.b());
        f11739a = dVarD;
        p016b6.d dVarE = p016b6.j.e(p016b6.j.f("[", p016b6.j.a(p016b6.j.c(p016b6.k.c(), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR))), "]");
        f11740b = dVarE;
        f11741c = p025c6.c.b(p016b6.j.b(dVarD, dVarE));
    }

    public static final boolean a(String host) {
        kotlin.jvm.internal.t.g(host, "host");
        return f11741c.a(host);
    }
}
