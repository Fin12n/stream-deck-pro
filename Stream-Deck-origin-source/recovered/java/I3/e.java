package I3;

import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3775a = new e();

    public final String a(D3.b layout) {
        t.g(layout, "layout");
        return "keypad_layout_option_" + layout.c() + "_" + layout.b() + "x" + layout.d();
    }

    public final String b(KnownHost.Device.KeypadOrientationOption option) {
        t.g(option, "option");
        return "orientation_option_" + option.name();
    }
}
