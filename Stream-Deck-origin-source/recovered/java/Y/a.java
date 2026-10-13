package Y;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0303a f12068k = new C0303a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f12072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureDetector f12078j;

    /* JADX INFO: renamed from: Y.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0303a {
        public /* synthetic */ C0303a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0303a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e8) {
            t.g(e8, "e");
            a.this.f12075g = e8.getX();
            a.this.f12076h = e8.getY();
            a.this.f12077i = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i8, b listener) {
        this(context, i8, 0, listener, 4, null);
        t.g(context, "context");
        t.g(listener, "listener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, b listener) {
        this(context, 0, 0, listener, 6, null);
        t.g(context, "context");
        t.g(listener, "listener");
    }

    public a(Context context, int i8, int i9, b listener) {
        t.g(context, "context");
        t.g(listener, "listener");
        this.f12069a = context;
        this.f12070b = i8;
        this.f12071c = i9;
        this.f12072d = listener;
        this.f12073e = true;
        this.f12074f = true;
        this.f12078j = new GestureDetector(context, new c());
    }

    public /* synthetic */ a(Context context, int i8, int i9, b bVar, int i10, AbstractC2633k abstractC2633k) {
        this(context, (i10 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i8, (i10 & 4) != 0 ? 0 : i9, bVar);
    }
}
