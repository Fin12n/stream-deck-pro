package E;

import android.util.Range;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends C.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f1970j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Range f1971k = new Range(30, 30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f1974i = b.FPS_RANGE;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public c(int i8, int i9) {
        this.f1972g = i8;
        this.f1973h = i9;
    }

    @Override // C.b
    public b c() {
        return this.f1974i;
    }

    public final int f() {
        return this.f1973h;
    }

    public final int g() {
        return this.f1972g;
    }

    public String toString() {
        return "FpsRangeFeature(minFps=" + this.f1972g + ", maxFps=" + this.f1973h + ')';
    }
}
