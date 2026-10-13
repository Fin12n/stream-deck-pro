package p017b7;

import p062g7.H;
import p062g7.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f15915a = H.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f15916b = b();

    public static final T a() {
        return f15916b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b() {
        if (!f15915a) {
            return O.f15912i;
        }
        H0 h0C = Z.c();
        return (w.c(h0C) || !(h0C instanceof T)) ? O.f15912i : (T) h0C;
    }
}
