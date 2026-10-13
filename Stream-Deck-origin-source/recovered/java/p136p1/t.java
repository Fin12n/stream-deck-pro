package p136p1;

import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f31073a = new t();

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i8, int i9) {
        builder.setLineBreakConfig(s.a().setLineBreakStyle(i8).setLineBreakWordStyle(i9).build());
    }
}
