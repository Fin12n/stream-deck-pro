package p058g3;

import p004a3.C1705k;
import p010b0.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f23715b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f23716a = new o(20);

    public static g b() {
        return f23715b;
    }

    public C1705k a(String str) {
        if (str == null) {
            return null;
        }
        return (C1705k) this.f23716a.c(str);
    }

    public void c(String str, C1705k c1705k) {
        if (str == null) {
            return;
        }
        this.f23716a.d(str, c1705k);
    }
}
