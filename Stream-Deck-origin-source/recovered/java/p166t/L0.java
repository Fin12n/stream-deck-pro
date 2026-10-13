package p166t;

import A.AbstractC0890p0;
import H.InterfaceC1001r0;
import H.Z0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class L0 implements InterfaceC1001r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f33383d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z0 f33384e;

    public L0(String str, Z0 z8) {
        boolean z9;
        int i8;
        this.f33381b = str;
        try {
            i8 = Integer.parseInt(str);
            z9 = true;
        } catch (NumberFormatException unused) {
            AbstractC0890p0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z9 = false;
            i8 = -1;
        }
        this.f33380a = z9;
        this.f33382c = i8;
        this.f33384e = z8;
    }
}
