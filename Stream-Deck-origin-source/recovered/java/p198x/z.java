package p198x;

import H.AbstractC0994n0;
import H.C0980g0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import p158s.a;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37174a;

    public z() {
        this.f37174a = e.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public C0980g0 a(C0980g0 c0980g0) {
        C0980g0.a aVar = new C0980g0.a();
        aVar.t(c0980g0.k());
        Iterator it = c0980g0.i().iterator();
        while (it.hasNext()) {
            aVar.f((AbstractC0994n0) it.next());
        }
        aVar.e(c0980g0.g());
        a.C0723a c0723a = new a.C0723a();
        c0723a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0723a.c());
        return aVar.h();
    }

    public boolean b(List list, boolean z8) {
        if (!this.f37174a || !z8) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
