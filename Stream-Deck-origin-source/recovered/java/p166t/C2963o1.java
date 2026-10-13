package p166t;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p198x.d;
import p198x.k;

/* JADX INFO: renamed from: t.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2963o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f33807e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f33808f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f33809g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f33810h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C2963o1 f33811i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f33812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Size f33813b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f33814c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f33815d = new d();

    public C2963o1(Context context) {
        this.f33812a = (DisplayManager) context.getSystemService("display");
    }

    public static C2963o1 c(Context context) {
        if (f33811i == null) {
            synchronized (f33810h) {
                try {
                    if (f33811i == null) {
                        f33811i = new C2963o1(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33811i;
    }

    public final Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f33807e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f33814c.a(sizeB);
    }

    public final Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (P.d.c(size, f33808f) && (size = this.f33815d.a()) == null) {
            size = f33809g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public Display d(boolean z8) {
        Display[] displays = this.f33812a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z8);
        if (displayE == null && z8) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Display e(Display[] displayArr, boolean z8) {
        Display display = null;
        int i8 = -1;
        for (Display display2 : displayArr) {
            if (!z8 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i9 = point.x;
                int i10 = point.y;
                if (i9 * i10 > i8) {
                    display = display2;
                    i8 = i9 * i10;
                }
            }
        }
        return display;
    }

    public Size f() {
        if (this.f33813b != null) {
            return this.f33813b;
        }
        this.f33813b = a();
        return this.f33813b;
    }

    public void g() {
        this.f33813b = a();
    }
}
