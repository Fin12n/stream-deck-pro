package p166t;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2957m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33792b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f33793c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f33794d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f33795e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f33796f = new a();

    public C2957m1(Executor executor) {
        this.f33791a = executor;
    }

    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            S1 s8 = (S1) it.next();
            s8.l().s(s8);
        }
    }

    public final void a(S1 s8) {
        S1 s9;
        Iterator it = f().iterator();
        while (it.hasNext() && (s9 = (S1) it.next()) != s8) {
            s9.a();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f33796f;
    }

    public List d() {
        ArrayList arrayList;
        synchronized (this.f33792b) {
            arrayList = new ArrayList(this.f33793c);
        }
        return arrayList;
    }

    public List e() {
        ArrayList arrayList;
        synchronized (this.f33792b) {
            arrayList = new ArrayList(this.f33795e);
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        synchronized (this.f33792b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    public void g(S1 s8) {
        synchronized (this.f33792b) {
            this.f33793c.remove(s8);
            this.f33794d.remove(s8);
        }
    }

    public void h(S1 s8) {
        synchronized (this.f33792b) {
            this.f33794d.add(s8);
        }
    }

    public void i(S1 s8) {
        a(s8);
        synchronized (this.f33792b) {
            this.f33795e.remove(s8);
        }
    }

    public void j(S1 s8) {
        synchronized (this.f33792b) {
            this.f33793c.add(s8);
            this.f33795e.remove(s8);
        }
        a(s8);
    }

    public void k(S1 s8) {
        synchronized (this.f33792b) {
            this.f33795e.add(s8);
        }
    }

    /* JADX INFO: renamed from: t.m1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i8) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((S1) it.next()).g(i8);
            }
        }

        public final void c() {
            List listF;
            synchronized (C2957m1.this.f33792b) {
                listF = C2957m1.this.f();
                C2957m1.this.f33795e.clear();
                C2957m1.this.f33793c.clear();
                C2957m1.this.f33794d.clear();
            }
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                ((S1) it.next()).a();
            }
        }

        public final void d(final int i8) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2957m1.this.f33792b) {
                linkedHashSet.addAll(C2957m1.this.f33795e);
                linkedHashSet.addAll(C2957m1.this.f33793c);
            }
            C2957m1.this.f33791a.execute(new Runnable() { // from class: t.l1
                @Override // java.lang.Runnable
                public final void run() {
                    C2957m1.a.a(linkedHashSet, i8);
                }
            });
        }

        public final void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C2957m1.this.f33792b) {
                linkedHashSet.addAll(C2957m1.this.f33795e);
                linkedHashSet.addAll(C2957m1.this.f33793c);
            }
            C2957m1.this.f33791a.execute(new Runnable() { // from class: t.k1
                @Override // java.lang.Runnable
                public final void run() {
                    C2957m1.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i8) {
            e();
            d(i8);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
