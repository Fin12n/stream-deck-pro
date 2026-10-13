package p117n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class W extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f30338b;

    public W(Context context, Resources resources) {
        super(resources);
        this.f30338b = new WeakReference(context);
    }

    @Override // p117n.P, android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Drawable drawableA = a(i8);
        Context context = (Context) this.f30338b.get();
        if (drawableA != null && context != null) {
            O.g().w(context, i8, drawableA);
        }
        return drawableA;
    }
}
