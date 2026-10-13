package p182v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f34942a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(h hVar);

        Object b();

        void c(CaptureRequest captureRequest);
    }

    public o(int i8, List<i> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f34942a = new a(i8, list, executor, stateCallback);
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((i) it.next()).h());
        }
        return arrayList;
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i.i((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public void a(h hVar) {
        this.f34942a.a(hVar);
    }

    public void b(CaptureRequest captureRequest) {
        this.f34942a.c(captureRequest);
    }

    public Object e() {
        return this.f34942a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f34942a.equals(((o) obj).f34942a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34942a.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f34943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f34944b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f34943a = sessionConfiguration;
            this.f34944b = Collections.unmodifiableList(o.d(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // v.o.b
        public void a(h hVar) {
            this.f34943a.setInputConfiguration((InputConfiguration) hVar.a());
        }

        @Override // v.o.b
        public Object b() {
            return this.f34943a;
        }

        @Override // v.o.b
        public void c(CaptureRequest captureRequest) {
            this.f34943a.setSessionParameters(captureRequest);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f34943a, ((a) obj).f34943a);
            }
            return false;
        }

        public int hashCode() {
            return this.f34943a.hashCode();
        }

        public a(int i8, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i8, o.c(list), executor, stateCallback));
        }
    }
}
