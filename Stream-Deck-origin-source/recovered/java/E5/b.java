package E5;

import D6.C0934n;
import D6.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterable, R6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2233b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2234c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2235a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a() {
            return b.f2234c;
        }

        public a() {
        }
    }

    public b(List list) {
        this.f2235a = list;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f2235a.iterator();
    }

    public final boolean m() {
        return !this.f2235a.isEmpty();
    }

    public b() {
        this(r.n());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(E5.a... plugins) {
        this(C0934n.r0(plugins));
        t.g(plugins, "plugins");
    }
}
