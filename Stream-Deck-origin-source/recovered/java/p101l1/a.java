package p101l1;

import R0.InterfaceC1621x0;
import R0.J;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC1621x0 a(InterfaceC1621x0.a aVar, Resources resources, int i8) {
        Drawable drawable = resources.getDrawable(i8, null);
        t.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return J.c(((BitmapDrawable) drawable).getBitmap());
    }
}
