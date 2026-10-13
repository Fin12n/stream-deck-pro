package p056g1;

import A1.d;
import A1.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23374a = f.b(1.0f, 0.0f, 2, null);

    public static final h0 b(F f8) {
        h0 h0VarL0 = f8.l0();
        if (h0VarL0 != null) {
            return h0VarL0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
