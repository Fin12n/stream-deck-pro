package p079i6;

import Z6.w;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0568a f24737c = new C0568a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24738d = new a("1.6.0", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24740b;

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0568a {
        public /* synthetic */ C0568a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final a a(String rawVersion) {
            t.g(rawVersion, "rawVersion");
            try {
                List listZ0 = w.z0(rawVersion, new char[]{'-', '_'}, false, 0, 6, null);
                return listZ0.size() == 2 ? new a((String) listZ0.get(0), Integer.parseInt((String) listZ0.get(1))) : new a(rawVersion, -1);
            } catch (Throwable unused) {
                return a.f24738d;
            }
        }

        public C0568a() {
        }
    }

    public a(String major, int i8) {
        t.g(major, "major");
        this.f24739a = major;
        this.f24740b = i8;
    }

    public final String b() {
        return this.f24739a;
    }

    public final int c() {
        return this.f24740b;
    }
}
