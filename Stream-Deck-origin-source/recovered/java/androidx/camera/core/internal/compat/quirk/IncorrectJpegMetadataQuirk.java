package androidx.camera.core.internal.compat.quirk;

import H.V0;
import android.os.Build;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f14171a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    public static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f14171a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return f();
    }

    public final boolean d(byte[] bArr) {
        byte b8;
        int i8 = 2;
        while (i8 + 4 <= bArr.length && (b8 = bArr[i8]) == -1) {
            if (b8 == -1 && bArr[i8 + 1] == -38) {
                return true;
            }
            i8 += (((bArr[i8 + 2] & 255) << 8) | (bArr[i8 + 3] & 255)) + 2;
        }
        return false;
    }

    public final int e(byte[] bArr) {
        int i8 = 2;
        while (true) {
            int i9 = i8 + 1;
            if (i9 > bArr.length) {
                return -1;
            }
            if (bArr[i8] == -1 && bArr[i9] == -40) {
                return i8;
            }
            i8 = i9;
        }
    }

    public byte[] g(d dVar) {
        int iE = 0;
        ByteBuffer byteBufferL = dVar.D()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return (d(bArr) || (iE = e(bArr)) != -1) ? Arrays.copyOfRange(bArr, iE, byteBufferL.limit()) : bArr;
    }
}
