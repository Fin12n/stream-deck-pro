package R0;

import S0.AbstractC1628c;

/* JADX INFO: renamed from: R0.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1625z0 {
    public static final InterfaceC1621x0 a(int i8, int i9, int i10, boolean z8, AbstractC1628c abstractC1628c) {
        return J.a(i8, i9, i10, z8, abstractC1628c);
    }

    public static /* synthetic */ InterfaceC1621x0 b(int i8, int i9, int i10, boolean z8, AbstractC1628c abstractC1628c, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = C1623y0.f9449b.b();
        }
        if ((i11 & 8) != 0) {
            z8 = true;
        }
        if ((i11 & 16) != 0) {
            abstractC1628c = S0.g.f9615a.w();
        }
        return a(i8, i9, i10, z8, abstractC1628c);
    }
}
