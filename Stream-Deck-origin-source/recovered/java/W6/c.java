package W6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends W6.a implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11501e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f11502f = new c(1, 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public c(char c8, char c9) {
        super(c8, c9, 1);
    }

    @Override // W6.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Character c() {
        return Character.valueOf(s());
    }

    @Override // W6.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return s() == cVar.s() && t() == cVar.t();
    }

    @Override // W6.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (s() * 31) + t();
    }

    @Override // W6.a, W6.f
    public boolean isEmpty() {
        return t.h(s(), t()) > 0;
    }

    @Override // W6.a
    public String toString() {
        return s() + ".." + t();
    }

    @Override // W6.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Character o() {
        return Character.valueOf(t());
    }
}
