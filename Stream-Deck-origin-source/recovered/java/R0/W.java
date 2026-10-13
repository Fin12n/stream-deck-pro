package R0;

import S0.AbstractC1628c;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f9345a = new W();

    public static final AbstractC1628c a(Bitmap bitmap) {
        AbstractC1628c abstractC1628cB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC1628cB = H.b(colorSpace)) == null) ? S0.g.f9615a.w() : abstractC1628cB;
    }

    public static final Bitmap b(int i8, int i9, int i10, boolean z8, AbstractC1628c abstractC1628c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i8, i9, J.d(i10), z8, H.a(abstractC1628c));
    }
}
