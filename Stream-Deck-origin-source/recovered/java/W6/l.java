package W6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends j implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11523e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f11524f = new l(1, 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final l a() {
            return l.f11524f;
        }

        public a() {
        }
    }

    public l(long j8, long j9) {
        super(j8, j9, 1L);
    }

    @Override // W6.f
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Long o() {
        return Long.valueOf(t());
    }

    @Override // W6.f
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return Long.valueOf(s());
    }

    @Override // W6.j
    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return s() == lVar.s() && t() == lVar.t();
    }

    @Override // W6.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (s() ^ (s() >>> 32))) + (t() ^ (t() >>> 32)));
    }

    @Override // W6.j, W6.f
    public boolean isEmpty() {
        return s() > t();
    }

    @Override // W6.j
    public String toString() {
        return s() + ".." + t();
    }
}
