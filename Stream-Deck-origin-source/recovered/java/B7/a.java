package B7;

import J7.g;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0049a f1211c = new C0049a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1213b;

    /* JADX INFO: renamed from: B7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0049a {
        public /* synthetic */ C0049a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0049a() {
        }
    }

    public a(g source) {
        t.g(source, "source");
        this.f1212a = source;
        this.f1213b = 262144L;
    }

    public final u7.t a() {
        u7.t.a aVar = new u7.t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.d();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strS0 = this.f1212a.s0(this.f1213b);
        this.f1213b -= (long) strS0.length();
        return strS0;
    }
}
