package p046f0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: f0.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2290s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2290s f21497a = new C2290s();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C2275c.f21435a.a(context, attributeSet) : new B(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2275c.f21435a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i8) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i8);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i8);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2275c.f21435a.c(edgeEffect, f8, f9);
        }
        edgeEffect.onPull(f8, f9);
        return f8;
    }

    public final void e(EdgeEffect edgeEffect, float f8) {
        if (edgeEffect instanceof B) {
            ((B) edgeEffect).a(f8);
        } else {
            edgeEffect.onRelease();
        }
    }
}
