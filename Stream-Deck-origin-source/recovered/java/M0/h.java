package M0;

import D6.r;
import Q6.k;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5073e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5074f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f5075g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q0.h f5077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f5078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5079d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int b() {
            int i8;
            synchronized (this) {
                h.f5075g++;
                i8 = h.f5075g;
            }
            return i8;
        }

        public a() {
        }
    }

    public h(List<? extends j> list, Q0.h hVar, k kVar) {
        this.f5076a = list;
        this.f5077b = hVar;
        this.f5078c = kVar;
        this.f5079d = f5073e.b();
    }

    public final List c() {
        return this.f5076a;
    }

    public final Q0.h d() {
        return this.f5077b;
    }

    public final k e() {
        return this.f5078c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return t.c(this.f5076a, hVar.f5076a) && t.c(this.f5077b, hVar.f5077b) && t.c(this.f5078c, hVar.f5078c);
    }

    public int hashCode() {
        int iHashCode = this.f5076a.hashCode() * 31;
        Q0.h hVar = this.f5077b;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        k kVar = this.f5078c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public /* synthetic */ h(List list, Q0.h hVar, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? r.n() : list, (i8 & 2) != 0 ? null : hVar, kVar);
    }
}
