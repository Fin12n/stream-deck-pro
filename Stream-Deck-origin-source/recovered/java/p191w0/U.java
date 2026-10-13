package p191w0;

import R0.C1598l0;
import R0.T0;
import p207y0.l;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f35700a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f35701b = l.f37908a.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35702c = 0;

    public final T a(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        long jO;
        long jO2;
        long jO3;
        interfaceC3163l.f(-352515689);
        long jI = (i9 & 1) != 0 ? AbstractC3091w.i(l.f37908a.a(), interfaceC3163l, 6) : j8;
        long jI2 = (i9 & 2) != 0 ? AbstractC3091w.i(l.f37908a.j(), interfaceC3163l, 6) : j9;
        long jI3 = (i9 & 4) != 0 ? AbstractC3091w.i(l.f37908a.l(), interfaceC3163l, 6) : j10;
        long jI4 = (i9 & 8) != 0 ? AbstractC3091w.i(l.f37908a.n(), interfaceC3163l, 6) : j11;
        long jI5 = (i9 & 16) != 0 ? AbstractC3091w.i(l.f37908a.p(), interfaceC3163l, 6) : j12;
        long jI6 = (i9 & 32) != 0 ? AbstractC3091w.i(l.f37908a.s(), interfaceC3163l, 6) : j13;
        if ((i9 & 64) != 0) {
            l lVar = l.f37908a;
            jO = C1598l0.o(AbstractC3091w.i(lVar.d(), interfaceC3163l, 6), lVar.e(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jO = j14;
        }
        if ((i9 & 128) != 0) {
            l lVar2 = l.f37908a;
            jO2 = C1598l0.o(AbstractC3091w.i(lVar2.f(), interfaceC3163l, 6), lVar2.g(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jO2 = j15;
        }
        if ((i9 & 256) != 0) {
            l lVar3 = l.f37908a;
            jO3 = C1598l0.o(AbstractC3091w.i(lVar3.h(), interfaceC3163l, 6), lVar3.i(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jO3 = j16;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-352515689, i8, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:439)");
        }
        T t8 = new T(jI, jI2, jI3, jI4, jI5, jI6, jO, jO2, jO3, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return t8;
    }

    public final float b() {
        return f35701b;
    }

    public final T0 c(InterfaceC3163l interfaceC3163l, int i8) {
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-496871597, i8, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:395)");
        }
        T0 t0D = z0.d(l.f37908a.c(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        return t0D;
    }
}
