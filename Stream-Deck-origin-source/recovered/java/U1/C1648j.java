package U1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: U1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1648j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1649k f10144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f10147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f10152j;

    /* JADX INFO: renamed from: U1.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8);
    }

    /* JADX INFO: renamed from: U1.j$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i8);
    }

    public C1648j(Context context, InterfaceC1649k interfaceC1649k) {
        this(context, interfaceC1649k, new b() { // from class: U1.h
            @Override // U1.C1648j.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i8) {
                C1648j.c(context2, iArr, motionEvent, i8);
            }
        }, new a() { // from class: U1.i
            @Override // U1.C1648j.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
                return C1648j.f(velocityTracker, motionEvent, i8);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = M.g(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
        iArr[1] = M.f(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
        F.a(velocityTracker, motionEvent);
        F.b(velocityTracker, 1000);
        return F.d(velocityTracker, i8);
    }

    public final boolean d(MotionEvent motionEvent, int i8) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f10150h == source && this.f10151i == deviceId && this.f10149g == i8) {
            return false;
        }
        this.f10145c.a(this.f10143a, this.f10152j, motionEvent, i8);
        this.f10150h = source;
        this.f10151i = deviceId;
        this.f10149g = i8;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i8) {
        if (this.f10147e == null) {
            this.f10147e = VelocityTracker.obtain();
        }
        return this.f10146d.a(this.f10147e, motionEvent, i8);
    }

    public void g(MotionEvent motionEvent, int i8) {
        boolean zD = d(motionEvent, i8);
        if (this.f10152j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f10147e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10147e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i8) * this.f10144b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f10148f) && fSignum != 0.0f)) {
            this.f10144b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f10152j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i9 = iArr[1];
        float fMax = Math.max(-i9, Math.min(fE, i9));
        this.f10148f = this.f10144b.a(fMax) ? fMax : 0.0f;
    }

    public C1648j(Context context, InterfaceC1649k interfaceC1649k, b bVar, a aVar) {
        this.f10149g = -1;
        this.f10150h = -1;
        this.f10151i = -1;
        this.f10152j = new int[]{Integer.MAX_VALUE, 0};
        this.f10143a = context;
        this.f10144b = interfaceC1649k;
        this.f10145c = bVar;
        this.f10146d = aVar;
    }
}
