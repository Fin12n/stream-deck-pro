package E;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends C.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1978i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f1979j = b.OFF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f1980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E.b f1981h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        OFF,
        ON,
        PREVIEW;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ J6.a f1986e = J6.b.a(a());
    }

    public e(b mode) {
        t.g(mode, "mode");
        this.f1980g = mode;
        this.f1981h = E.b.VIDEO_STABILIZATION;
    }

    @Override // C.b
    public E.b c() {
        return this.f1981h;
    }

    public final b f() {
        return this.f1980g;
    }

    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.f1980g.name() + ')';
    }
}
