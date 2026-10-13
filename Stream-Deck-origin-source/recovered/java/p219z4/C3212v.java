package p219z4;

import android.os.Bundle;

/* JADX INFO: renamed from: z4.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3212v implements x4.a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3212v f39254c = a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39255b;

    /* JADX INFO: renamed from: z4.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f39256a;

        public /* synthetic */ a(AbstractC3214x abstractC3214x) {
        }

        public C3212v a() {
            return new C3212v(this.f39256a, null);
        }

        public a b(String str) {
            this.f39256a = str;
            return this;
        }
    }

    public /* synthetic */ C3212v(String str, AbstractC3215y abstractC3215y) {
        this.f39255b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f39255b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3212v) {
            return AbstractC3206o.a(this.f39255b, ((C3212v) obj).f39255b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3206o.b(this.f39255b);
    }
}
