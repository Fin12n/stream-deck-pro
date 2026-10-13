package W6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends g implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11513e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f11514f = new i(1, 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final i a() {
            return i.f11514f;
        }

        public a() {
        }
    }

    public i(int i8, int i9) {
        super(i8, i9, 1);
    }

    public boolean D(int i8) {
        return s() <= i8 && i8 <= t();
    }

    @Override // W6.f
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Integer o() {
        return Integer.valueOf(t());
    }

    @Override // W6.f
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return Integer.valueOf(s());
    }

    @Override // W6.g
    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return s() == iVar.s() && t() == iVar.t();
    }

    @Override // W6.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (s() * 31) + t();
    }

    @Override // W6.g, W6.f
    public boolean isEmpty() {
        return s() > t();
    }

    @Override // W6.g
    public String toString() {
        return s() + ".." + t();
    }
}
