package J2;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4069b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4070c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4071d = new c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f4072e = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4073a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a(float f8) {
            if (f8 >= 0.0f) {
                if (f8 < 600.0f) {
                    return c.f4070c;
                }
                return f8 < 840.0f ? c.f4071d : c.f4072e;
            }
            throw new IllegalArgumentException((WaYxBuDSBD.lBwk + f8).toString());
        }

        public a() {
        }
    }

    public c(int i8) {
        this.f4073a = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f4073a == ((c) obj).f4073a;
    }

    public int hashCode() {
        return this.f4073a;
    }

    public String toString() {
        String str;
        if (t.c(this, f4070c)) {
            str = "COMPACT";
        } else if (t.c(this, f4071d)) {
            str = "MEDIUM";
        } else {
            str = t.c(this, f4072e) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowWidthSizeClass: " + str;
    }
}
