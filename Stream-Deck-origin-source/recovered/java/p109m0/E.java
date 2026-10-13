package p109m0;

import G6.d;
import p110m1.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface E {
    boolean a();

    default float b() {
        return e() + (h() * 500);
    }

    Object c(float f8, d dVar);

    Object d(int i8, d dVar);

    int e();

    b f();

    default float g() {
        return a() ? b() + 100 : b();
    }

    int h();
}
