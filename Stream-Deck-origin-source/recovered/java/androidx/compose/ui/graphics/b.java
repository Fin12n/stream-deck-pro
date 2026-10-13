package androidx.compose.ui.graphics;

import L0.i;
import Q6.k;
import R0.AbstractC1619w0;
import R0.N0;
import R0.O0;
import R0.T0;
import p065h1.AbstractC2401l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final i a(i iVar, k kVar) {
        return iVar.j(new BlockGraphicsLayerElement(kVar));
    }

    public static final i b(i iVar, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8) {
        return iVar.j(new GraphicsLayerElement(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, t8, z8, o8, j9, j10, i8, null));
    }

    public static /* synthetic */ i c(i iVar, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, T0 t8, boolean z8, O0 o8, long j9, long j10, int i8, int i9, Object obj) {
        return b(iVar, (i9 & 1) != 0 ? 1.0f : f8, (i9 & 2) != 0 ? 1.0f : f9, (i9 & 4) == 0 ? f10 : 1.0f, (i9 & 8) != 0 ? 0.0f : f11, (i9 & 16) != 0 ? 0.0f : f12, (i9 & 32) != 0 ? 0.0f : f13, (i9 & 64) != 0 ? 0.0f : f14, (i9 & 128) != 0 ? 0.0f : f15, (i9 & 256) == 0 ? f16 : 0.0f, (i9 & 512) != 0 ? 8.0f : f17, (i9 & 1024) != 0 ? f.f14706b.a() : j8, (i9 & 2048) != 0 ? N0.a() : t8, (i9 & 4096) != 0 ? false : z8, (i9 & 8192) != 0 ? null : o8, (i9 & 16384) != 0 ? AbstractC1619w0.a() : j9, (32768 & i9) != 0 ? AbstractC1619w0.a() : j10, (i9 & 65536) != 0 ? a.f14661a.a() : i8);
    }

    public static final i d(i iVar) {
        return AbstractC2401l0.c() ? iVar.j(c(i.f4836a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : iVar;
    }
}
