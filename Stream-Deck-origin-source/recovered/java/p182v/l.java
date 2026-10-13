package p182v;

import T1.f;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l extends k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f34939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f34940b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f34939a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f34939a, aVar.f34939a) && this.f34940b == aVar.f34940b;
        }

        public int hashCode() {
            int iHashCode = this.f34939a.hashCode() ^ 31;
            return Long.hashCode(this.f34940b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    public l(int i8, Surface surface) {
        this(new a(new OutputConfiguration(i8, surface)));
    }

    public static l h(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // v.i.a
    public void c(long j8) {
        ((a) this.f34941a).f34940b = j8;
    }

    @Override // v.i.a
    public void e(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // p182v.k, p182v.j, v.i.a
    public Object g() {
        f.a(this.f34941a instanceof a);
        return ((a) this.f34941a).f34939a;
    }

    public l(Object obj) {
        super(obj);
    }
}
