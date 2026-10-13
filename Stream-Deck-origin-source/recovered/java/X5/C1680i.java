package X5;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: X5.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1680i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11848c;

    public C1680i(String value, List<C1681j> params) {
        Double d8;
        Object next;
        String strD;
        Double dJ;
        kotlin.jvm.internal.t.g(value, "value");
        kotlin.jvm.internal.t.g(params, "params");
        this.f11846a = value;
        this.f11847b = params;
        Iterator<T> it = params.iterator();
        do {
            d8 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.t.c(((C1681j) next).c(), "q"));
        C1681j c1681j = (C1681j) next;
        double dDoubleValue = 1.0d;
        if (c1681j != null && (strD = c1681j.d()) != null && (dJ = Z6.t.j(strD)) != null) {
            double dDoubleValue2 = dJ.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d8 = dJ;
            }
            if (d8 != null) {
                dDoubleValue = d8.doubleValue();
            }
        }
        this.f11848c = dDoubleValue;
    }

    public final String a() {
        return this.f11846a;
    }

    public final List b() {
        return this.f11847b;
    }

    public final double c() {
        return this.f11848c;
    }

    public final String d() {
        return this.f11846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680i)) {
            return false;
        }
        C1680i c1680i = (C1680i) obj;
        return kotlin.jvm.internal.t.c(this.f11846a, c1680i.f11846a) && kotlin.jvm.internal.t.c(this.f11847b, c1680i.f11847b);
    }

    public int hashCode() {
        return (this.f11846a.hashCode() * 31) + this.f11847b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f11846a + ", params=" + this.f11847b + ')';
    }

    public /* synthetic */ C1680i(String str, List list, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? D6.r.n() : list);
    }
}
