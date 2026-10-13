package A;

import H.AbstractC1009v0;
import H.C0973d;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: A.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0894s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f306c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1009v0 f308b;

    /* JADX INFO: renamed from: A.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ C0894s d(a aVar, String str, String str2, AbstractC1009v0 abstractC1009v0, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                str2 = null;
            }
            if ((i8 & 4) != 0) {
                abstractC1009v0 = null;
            }
            return aVar.b(str, str2, abstractC1009v0);
        }

        public final C0894s a(String primaryCameraId) {
            kotlin.jvm.internal.t.g(primaryCameraId, "primaryCameraId");
            return d(this, primaryCameraId, null, null, 6, null);
        }

        public final C0894s b(String primaryCameraId, String str, AbstractC1009v0 abstractC1009v0) {
            kotlin.jvm.internal.t.g(primaryCameraId, "primaryCameraId");
            List listT = D6.r.t(primaryCameraId);
            if (str != null) {
                listT.add(str);
            }
            return c(listT, abstractC1009v0);
        }

        public final C0894s c(List cameraIds, AbstractC1009v0 abstractC1009v0) {
            kotlin.jvm.internal.t.g(cameraIds, "cameraIds");
            return new C0894s(cameraIds, abstractC1009v0, null);
        }

        public final C0894s e(C0973d primaryInfo, C0973d c0973d) {
            kotlin.jvm.internal.t.g(primaryInfo, "primaryInfo");
            String strE = c0973d != null ? c0973d.e() : null;
            AbstractC1009v0 abstractC1009v0Y = primaryInfo.t().Y();
            kotlin.jvm.internal.t.f(abstractC1009v0Y, "getCompatibilityId(...)");
            String strE2 = primaryInfo.e();
            kotlin.jvm.internal.t.f(strE2, "getCameraId(...)");
            return b(strE2, strE, abstractC1009v0Y);
        }

        public a() {
        }
    }

    public /* synthetic */ C0894s(List list, AbstractC1009v0 abstractC1009v0, AbstractC2633k abstractC2633k) {
        this(list, abstractC1009v0);
    }

    public static final C0894s a(String str) {
        return f306c.a(str);
    }

    public static final C0894s b(C0973d c0973d, C0973d c0973d2) {
        return f306c.e(c0973d, c0973d2);
    }

    public final String c() {
        T1.f.j(this.f307a.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) D6.z.i0(this.f307a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0894s)) {
            return false;
        }
        C0894s c0894s = (C0894s) obj;
        return kotlin.jvm.internal.t.c(this.f307a, c0894s.f307a) && kotlin.jvm.internal.t.c(this.f308b, c0894s.f308b);
    }

    public int hashCode() {
        int iHashCode = this.f307a.hashCode() * 31;
        AbstractC1009v0 abstractC1009v0 = this.f308b;
        return iHashCode + (abstractC1009v0 != null ? abstractC1009v0.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0034  */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CameraIdentifier{cameraIds=");
        sb.append(D6.z.r0(this.f307a, com.amazon.a.a.o.b.f.f16777a, null, null, 0, null, null, 62, null));
        AbstractC1009v0 abstractC1009v0 = this.f308b;
        if (abstractC1009v0 != null) {
            str = ", compatId=" + abstractC1009v0;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C0894s(List list, AbstractC1009v0 abstractC1009v0) {
        this.f307a = list;
        this.f308b = abstractC1009v0;
        T1.f.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
