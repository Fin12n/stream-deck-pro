package p182v;

import A.J;
import T1.f;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f34934a = new e(new g());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f34935b = Collections.singleton(J.f88d);

    @Override // v.e.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // v.e.a
    public Set b(J j8) {
        f.b(J.f88d.equals(j8), "DynamicRange is not supported: " + j8);
        return f34935b;
    }

    @Override // v.e.a
    public Set c() {
        return f34935b;
    }
}
