package U0;

import A1.n;
import A1.s;
import R0.AbstractC1615u0;
import R0.InterfaceC1621x0;
import androidx.compose.ui.graphics.painter.BitmapPainter;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final BitmapPainter a(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, int i8) {
        BitmapPainter bitmapPainter = new BitmapPainter(interfaceC1621x0, j8, j9, null);
        bitmapPainter.k(i8);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j8 = n.f446b.a();
        }
        long j10 = j8;
        if ((i9 & 4) != 0) {
            j9 = s.a(interfaceC1621x0.g(), interfaceC1621x0.f());
        }
        long j11 = j9;
        if ((i9 & 8) != 0) {
            i8 = AbstractC1615u0.f9427a.a();
        }
        return a(interfaceC1621x0, j10, j11, i8);
    }
}
