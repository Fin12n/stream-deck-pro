package H;

import A.AbstractC0890p0;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V implements b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.z0 f2904d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements A.z0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f2905d;

        public a(long j8) {
            this.f2905d = j8;
        }

        @Override // A.z0
        public long b() {
            return this.f2905d;
        }

        @Override // A.z0
        public A.z0.c e(A.z0.b bVar) {
            return bVar.a() == 1 ? A.z0.c.f350d : A.z0.c.f351e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements b1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final A.z0 f2907d;

        public b(long j8) {
            this.f2907d = new V(j8);
        }

        @Override // A.z0
        public long b() {
            return this.f2907d.b();
        }

        @Override // H.b1
        public A.z0 d(long j8) {
            return new b(j8);
        }

        @Override // A.z0
        public A.z0.c e(A.z0.b bVar) {
            if (this.f2907d.e(bVar).d()) {
                return A.z0.c.f351e;
            }
            Throwable thB = bVar.b();
            if (thB instanceof AbstractC0976e0.b) {
                AbstractC0890p0.c("CameraX", jULK.QCv);
                if (((AbstractC0976e0.b) thB).a() > 0) {
                    return A.z0.c.f353g;
                }
            }
            return A.z0.c.f350d;
        }
    }

    public V(long j8) {
        this.f2904d = new n1(j8, new a(j8));
    }

    @Override // A.z0
    public long b() {
        return this.f2904d.b();
    }

    @Override // H.b1
    public A.z0 d(long j8) {
        return new V(j8);
    }

    @Override // A.z0
    public A.z0.c e(A.z0.b bVar) {
        return this.f2904d.e(bVar);
    }
}
