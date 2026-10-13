package p182v;

import H.InterfaceC0984i0;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import kotlin.jvm.internal.t;
import p158s.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f34929a = new b();

    public static final void a(a.C0723a options, InterfaceC0984i0.c priority) {
        t.g(options, "options");
        t.g(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
