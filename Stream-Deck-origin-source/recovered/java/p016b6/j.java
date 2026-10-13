package p016b6;

import D6.r;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final d a(d grammar) {
        t.g(grammar, "grammar");
        return new b(grammar);
    }

    public static final d b(d dVar, d grammar) {
        t.g(dVar, "<this>");
        t.g(grammar, "grammar");
        return new h(r.q(dVar, grammar));
    }

    public static final d c(d dVar, String value) {
        t.g(dVar, "<this>");
        t.g(value, "value");
        return b(dVar, new p(value));
    }

    public static final d d(d dVar, d grammar) {
        t.g(dVar, "<this>");
        t.g(grammar, "grammar");
        return new n(r.q(dVar, grammar));
    }

    public static final d e(d dVar, String value) {
        t.g(dVar, "<this>");
        t.g(value, "value");
        return d(dVar, new p(value));
    }

    public static final d f(String str, d grammar) {
        t.g(str, "<this>");
        t.g(grammar, "grammar");
        return d(new p(str), grammar);
    }

    public static final d g(char c8, char c9) {
        return new l(c8, c9);
    }
}
