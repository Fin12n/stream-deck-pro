package p182v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import p174u.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34938a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(long j8);

        void b(Surface surface);

        void c(long j8);

        void d();

        void e(String str);

        void f(int i8);

        Object g();

        Surface getSurface();
    }

    public i(Surface surface) {
        this(-1, surface);
    }

    public static i i(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarI = Build.VERSION.SDK_INT >= 33 ? m.i((OutputConfiguration) obj) : l.h((OutputConfiguration) obj);
        if (aVarI == null) {
            return null;
        }
        return new i(aVarI);
    }

    public void a(Surface surface) {
        this.f34938a.b(surface);
    }

    public void b() {
        this.f34938a.d();
    }

    public Surface c() {
        return this.f34938a.getSurface();
    }

    public void d(long j8) {
        this.f34938a.c(j8);
    }

    public void e(int i8) {
        this.f34938a.f(i8);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f34938a.equals(((i) obj).f34938a);
        }
        return false;
    }

    public void f(String str) {
        this.f34938a.e(str);
    }

    public void g(long j8) {
        this.f34938a.a(j8);
    }

    public Object h() {
        return this.f34938a.g();
    }

    public int hashCode() {
        return this.f34938a.hashCode();
    }

    public i(int i8, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f34938a = new m(i8, surface);
        } else {
            this.f34938a = new l(i8, surface);
        }
    }

    public <T> i(Size size, Class<T> cls) {
        OutputConfiguration outputConfigurationA = d.a(size, cls);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f34938a = m.i(outputConfigurationA);
        } else {
            this.f34938a = l.h(outputConfigurationA);
        }
    }

    public i(OutputConfiguration outputConfiguration) {
        this.f34938a = m.i(outputConfiguration);
    }

    public i(a aVar) {
        this.f34938a = aVar;
    }
}
