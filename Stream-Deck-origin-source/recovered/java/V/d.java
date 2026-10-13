package V;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10257c;

        public a(int i8, int i9, long j8) {
            this.f10255a = i8;
            this.f10256b = i9;
            this.f10257c = j8;
        }

        public int a() {
            return this.f10255a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
