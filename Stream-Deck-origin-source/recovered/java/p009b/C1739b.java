package p009b;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1739b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15492e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15496d;

    /* JADX INFO: renamed from: b.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C1739b(float f8, float f9, float f10, int i8) {
        this.f15493a = f8;
        this.f15494b = f9;
        this.f15495c = f10;
        this.f15496d = i8;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f15493a + ", touchY=" + this.f15494b + ", progress=" + this.f15495c + ", swipeEdge=" + this.f15496d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1739b(BackEvent backEvent) {
        t.g(backEvent, "backEvent");
        C1738a c1738a = C1738a.f15491a;
        this(c1738a.d(backEvent), c1738a.e(backEvent), c1738a.b(backEvent), c1738a.c(backEvent));
    }
}
