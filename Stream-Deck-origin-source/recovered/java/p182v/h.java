package p182v;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f34936a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }

        public b(int i8, int i9, int i10) {
            super(i8, i9, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        Object a();
    }

    public h(int i8, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f34936a = new b(i8, i9, i10);
        } else {
            this.f34936a = new a(i8, i9, i10);
        }
    }

    public static h b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new h(new b(obj)) : new h(new a(obj));
    }

    public Object a() {
        return this.f34936a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f34936a.equals(((h) obj).f34936a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34936a.hashCode();
    }

    public String toString() {
        return this.f34936a.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputConfiguration f34937a;

        public a(Object obj) {
            this.f34937a = (InputConfiguration) obj;
        }

        @Override // v.h.c
        public Object a() {
            return this.f34937a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f34937a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f34937a.hashCode();
        }

        public String toString() {
            return this.f34937a.toString();
        }

        public a(int i8, int i9, int i10) {
            this(new InputConfiguration(i8, i9, i10));
        }
    }

    public h(c cVar) {
        this.f34936a = cVar;
    }
}
