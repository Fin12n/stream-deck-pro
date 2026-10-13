package p166t;

import A.C0886n0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import p174u.e;
import p174u.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {
    public static boolean a(t tVar, String str) throws C0886n0 {
        if (yOZfxp.dGfLlClpzovQV.equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) tVar.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i8 : iArr) {
                    if (i8 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (e e8) {
            throw new C0886n0(Y0.a(e8));
        }
    }
}
