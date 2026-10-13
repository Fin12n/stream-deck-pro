package R0;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: renamed from: R0.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1578b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1578b0 f9388a = new C1578b0();

    public final BlendModeColorFilter a(long j8, int i8) {
        AbstractC1576a0.a();
        return Z.a(AbstractC1602n0.j(j8), D.a(i8));
    }

    public final Y b(BlendModeColorFilter blendModeColorFilter) {
        return new Y(AbstractC1602n0.b(blendModeColorFilter.getColor()), D.b(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
