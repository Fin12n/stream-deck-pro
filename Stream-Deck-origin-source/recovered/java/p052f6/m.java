package p052f6;

import D6.C0938s;
import D6.z;
import Z6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22079c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f22080d = new m("2.5.4.10");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f22081e = new m("2.5.4.11");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f22082f = new m("2.5.4.6");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f22083g = new m("2.5.4.3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f22084h = new m("2.5.29.17");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f22085i = new m("2.5.29.19");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f22086j = new m("2.5.29.15");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f22087k = new m("2.5.29.37");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f22088l = new m("1.3.6.1.5.5.7.3.1");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f22089m = new m("1.3.6.1.5.5.7.3.2");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f22090n = new m("1 2 840 113549 1 1 1");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m f22091o = new m("1.2.840.10045.2.1");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f22092p = new m("1.2.840.10045.4.3.3");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f22093q = new m("1.2.840.10045.4.3.2");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f22094r = new m("1.2.840.113549.1.1.13");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f22095s = new m("1.2.840.113549.1.1.12");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f22096t = new m("1.2.840.113549.1.1.11");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f22097u = new m("1.2.840.113549.1.1.5");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f22098v = new m("1.2.840.10045.3.1.7");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f22100b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final m a() {
            return m.f22093q;
        }

        public final m b() {
            return m.f22092p;
        }

        public final m c() {
            return m.f22097u;
        }

        public final m d() {
            return m.f22096t;
        }

        public final m e() {
            return m.f22095s;
        }

        public final m f() {
            return m.f22094r;
        }

        public a() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && t.c(this.f22099a, ((m) obj).f22099a);
    }

    public final String g() {
        return this.f22099a;
    }

    public int hashCode() {
        return this.f22099a.hashCode();
    }

    public String toString() {
        return "OID(identifier=" + this.f22099a + ')';
    }

    public m(String identifier) {
        t.g(identifier, "identifier");
        this.f22099a = identifier;
        List listA0 = w.A0(identifier, new String[]{GOKsbdzhLhXAMt.wMKpu, " "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(C0938s.y(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(w.W0((String) it.next()).toString())));
        }
        this.f22100b = z.Q0(arrayList);
    }
}
