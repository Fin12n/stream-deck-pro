package G;

import A.C0868e0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: G.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0966z implements Q.A {
    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q.B apply(Q.B b8) throws C0868e0 {
        Rect rectB = b8.b();
        Bitmap bitmapB = b((byte[]) b8.c(), rectB);
        I.f fVarD = b8.d();
        Objects.requireNonNull(fVarD);
        return Q.B.i(bitmapB, fVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b8.f(), I.x.t(b8.g(), rectB), b8.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) throws C0868e0 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e8) {
            throw new C0868e0(1, "Failed to decode JPEG.", e8);
        }
    }
}
