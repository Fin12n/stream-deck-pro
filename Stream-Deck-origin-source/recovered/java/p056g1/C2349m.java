package p056g1;

import C6.j;
import C6.k;
import C6.l;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: g1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2349m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f23638b = k.a(l.NONE, b.f23641a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator f23639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f23640d;

    /* JADX INFO: renamed from: g1.m$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(F f8, F f9) {
            int iH = t.h(f8.J(), f9.J());
            return iH != 0 ? iH : t.h(f8.hashCode(), f9.hashCode());
        }
    }

    /* JADX INFO: renamed from: g1.m$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23641a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public C2349m(boolean z8) {
        this.f23637a = z8;
        a aVar = new a();
        this.f23639c = aVar;
        this.f23640d = new w0(aVar);
    }

    public final void a(F f8) {
        if (!f8.I0()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.f23637a) {
            Integer num = (Integer) c().get(f8);
            if (num == null) {
                c().put(f8, Integer.valueOf(f8.J()));
            } else {
                if (num.intValue() != f8.J()) {
                    throw new IllegalStateException("invalid node depth");
                }
            }
        }
        this.f23640d.add(f8);
    }

    public final boolean b(F f8) {
        boolean zContains = this.f23640d.contains(f8);
        if (!this.f23637a || zContains == c().containsKey(f8)) {
            return zContains;
        }
        throw new IllegalStateException("inconsistency in TreeSet");
    }

    public final Map c() {
        return (Map) this.f23638b.getValue();
    }

    public final boolean d() {
        return this.f23640d.isEmpty();
    }

    public final F e() {
        F f8 = (F) this.f23640d.first();
        f(f8);
        return f8;
    }

    public final boolean f(F f8) {
        if (!f8.I0()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f23640d.remove(f8);
        if (this.f23637a) {
            if (!t.c((Integer) c().remove(f8), zRemove ? Integer.valueOf(f8.J()) : null)) {
                throw new IllegalStateException("invalid node depth");
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.f23640d.toString();
    }
}
