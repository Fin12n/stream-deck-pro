package E;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends C.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1975i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f1977h = b.IMAGE_FORMAT;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public d(int i8) {
        this.f1976g = i8;
    }

    @Override // C.b
    public b c() {
        return this.f1977h;
    }

    public final int f() {
        return this.f1976g;
    }

    public final String g() {
        int i8 = this.f1976g;
        if (i8 == 0) {
            return "JPEG";
        }
        if (i8 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + this.f1976g + ')';
    }

    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + g() + ')';
    }
}
