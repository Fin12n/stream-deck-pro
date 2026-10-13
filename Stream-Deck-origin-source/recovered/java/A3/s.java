package A3;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z6.j f806a = new Z6.j("\\(.*?\\)");

    public static final V3.i b(r.b bVar, boolean z8) {
        t.g(bVar, "<this>");
        return new V3.i(new V3.h.d(V3.c.e.f10659b.b(), Boolean.valueOf(z8)));
    }

    public static final V3.i c(r.b bVar, String date) {
        t.g(bVar, "<this>");
        t.g(date, "date");
        return new V3.i(new V3.h.d(V3.c.e.PRO_EXPIRATION_DATE.b(), date));
    }

    public static final V3.i d(r.b bVar, boolean z8) {
        t.g(bVar, "<this>");
        return new V3.i(new V3.h.d(V3.c.e.PRO_FREE_TRIAL.b(), Boolean.valueOf(z8)));
    }

    public static final V3.i e(r.b bVar, String date) {
        t.g(bVar, "<this>");
        t.g(date, "date");
        return new V3.i(new V3.h.d(V3.c.e.PRO_LATEST_PURCHASE_DATE.b(), date));
    }

    public static final V3.i f(r.b bVar, String date) {
        t.g(bVar, "<this>");
        t.g(date, "date");
        return new V3.i(new V3.h.d(V3.c.e.PRO_ORIGINAL_PURCHASE_DATE.b(), date));
    }

    public static final V3.i g(r.b bVar, String id) {
        t.g(bVar, "<this>");
        t.g(id, "id");
        return new V3.i(new V3.h.d(V3.c.e.PRO_PRODUCT_IDENTIFIER.b(), id));
    }

    public static final V3.i h(r.b bVar, boolean z8) {
        t.g(bVar, "<this>");
        return new V3.i(new V3.h.d(V3.c.e.PRO_PROMOTIONAL.b(), Boolean.valueOf(z8)));
    }

    public static final V3.i i(r.b bVar, String date) {
        t.g(bVar, "<this>");
        t.g(date, "date");
        return new V3.i(new V3.h.d(V3.c.e.PRO_UNSUBSCRIBE_DETECTED_AT.b(), date));
    }

    public static final V3.i j(r.b bVar, boolean z8) {
        t.g(bVar, "<this>");
        return new V3.i(new V3.h.d(V3.c.e.PRO_WILL_RENEW.b(), Boolean.valueOf(z8)));
    }
}
