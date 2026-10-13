package C7;

import com.revenuecat.purchases.common.Constants;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1482d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J7.h f1483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J7.h f1484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final J7.h f1485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J7.h f1486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J7.h f1487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J7.h f1488j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J7.h f1489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J7.h f1490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1491c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    static {
        J7.h.a aVar = J7.h.f4388d;
        f1483e = aVar.d(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        f1484f = aVar.d(":status");
        f1485g = aVar.d(":method");
        f1486h = aVar.d(":path");
        f1487i = aVar.d(":scheme");
        f1488j = aVar.d(":authority");
    }

    public c(J7.h name, J7.h value) {
        t.g(name, "name");
        t.g(value, "value");
        this.f1489a = name;
        this.f1490b = value;
        this.f1491c = name.H() + 32 + value.H();
    }

    public final J7.h a() {
        return this.f1489a;
    }

    public final J7.h b() {
        return this.f1490b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f1489a, cVar.f1489a) && t.c(this.f1490b, cVar.f1490b);
    }

    public int hashCode() {
        return (this.f1489a.hashCode() * 31) + this.f1490b.hashCode();
    }

    public String toString() {
        return this.f1489a.L() + ": " + this.f1490b.L();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        t.g(name, "name");
        t.g(value, "value");
        J7.h.a aVar = J7.h.f4388d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(J7.h name, String value) {
        this(name, J7.h.f4388d.d(value));
        t.g(name, "name");
        t.g(value, "value");
    }
}
