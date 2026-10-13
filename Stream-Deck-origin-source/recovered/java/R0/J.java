package R0;

import S0.AbstractC1628c;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final InterfaceC1621x0 a(int i8, int i9, int i10, boolean z8, AbstractC1628c abstractC1628c) {
        d(i10);
        return new I(W.b(i8, i9, i10, z8, abstractC1628c));
    }

    public static final Bitmap b(InterfaceC1621x0 interfaceC1621x0) {
        if (interfaceC1621x0 instanceof I) {
            return ((I) interfaceC1621x0).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final InterfaceC1621x0 c(Bitmap bitmap) {
        return new I(bitmap);
    }

    public static final Bitmap.Config d(int i8) {
        C1623y0.a aVar = C1623y0.f9449b;
        if (C1623y0.i(i8, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C1623y0.i(i8, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C1623y0.i(i8, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        if (C1623y0.i(i8, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        return C1623y0.i(i8, aVar.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return C1623y0.f9449b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return C1623y0.f9449b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return C1623y0.f9449b.b();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return C1623y0.f9449b.c();
        }
        return config == Bitmap.Config.HARDWARE ? C1623y0.f9449b.d() : C1623y0.f9449b.b();
    }
}
