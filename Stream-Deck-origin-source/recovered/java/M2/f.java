package M2;

import K2.j;
import K2.k;
import K2.m;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5131a = new f();

    public final K2.c a(k windowMetrics, FoldingFeature oemFeature) {
        K2.d.b bVarA;
        K2.c.C0164c c0164c;
        t.g(windowMetrics, "windowMetrics");
        t.g(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = K2.d.b.f4570b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = K2.d.b.f4570b.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            c0164c = K2.c.C0164c.f4563c;
        } else {
            if (state != 2) {
                return null;
            }
            c0164c = K2.c.C0164c.f4564d;
        }
        Rect bounds = oemFeature.getBounds();
        t.f(bounds, "oemFeature.bounds");
        if (!d(windowMetrics, new I2.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        t.f(bounds2, "oemFeature.bounds");
        return new K2.d(new I2.b(bounds2), bVarA, c0164c);
    }

    public final j b(k windowMetrics, WindowLayoutInfo info) {
        K2.c cVarA;
        t.g(windowMetrics, "windowMetrics");
        t.g(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        t.f(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                f fVar = f5131a;
                t.f(feature, "feature");
                cVarA = fVar.a(windowMetrics, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new j(arrayList);
    }

    public final j c(Context context, WindowLayoutInfo info) {
        t.g(context, "context");
        t.g(info, "info");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            return b(m.f4604b.a(context), info);
        }
        if (i8 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return b(m.f4604b.b((Activity) context), info);
    }

    public final boolean d(k kVar, I2.b bVar) {
        Rect rectA = kVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != rectA.width() && bVar.a() != rectA.height()) {
            return false;
        }
        if (bVar.d() >= rectA.width() || bVar.a() >= rectA.height()) {
            return (bVar.d() == rectA.width() && bVar.a() == rectA.height()) ? false : true;
        }
        return false;
    }
}
