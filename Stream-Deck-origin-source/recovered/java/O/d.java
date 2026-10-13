package O;

import H.Z0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f7533a;

    public d(Z0 z8) {
        this.f7533a = (IncorrectJpegMetadataQuirk) z8.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(androidx.camera.core.d dVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f7533a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.g(dVar);
        }
        ByteBuffer byteBufferL = dVar.D()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return bArr;
    }
}
