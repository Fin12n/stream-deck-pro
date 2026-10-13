package p017b7;

import G6.g;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends G6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15900c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15901b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g.c {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public I(String str) {
        super(f15900c);
        this.f15901b = str;
    }

    public final String L0() {
        return this.f15901b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && t.c(this.f15901b, ((I) obj).f15901b);
    }

    public int hashCode() {
        return this.f15901b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f15901b + ')';
    }
}
