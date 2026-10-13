package I1;

import T1.f;
import android.content.LocusId;
import android.os.Build;
import com.google.mlkit.common.internal.ckI.WqXA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f3728b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public b(String str) {
        this.f3727a = (String) f.k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3728b = a.a(str);
        } else {
            this.f3728b = null;
        }
    }

    public final String a() {
        return this.f3727a.length() + "_chars";
    }

    public LocusId b() {
        return this.f3728b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f3727a;
        if (str == null) {
            return bVar.f3727a == null;
        }
        return str.equals(bVar.f3727a);
    }

    public int hashCode() {
        String str = this.f3727a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }

    public static b c(LocusId locusId) {
        f.h(locusId, WqXA.WixNnJLv);
        return new b((String) f.k(a.b(locusId), "id cannot be empty"));
    }
}
