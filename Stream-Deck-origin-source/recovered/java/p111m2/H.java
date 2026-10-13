package p111m2;

import H1.s;
import android.view.View;
import java.util.ArrayList;
import p010b0.C1748a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f29689a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f29690b = c();

    public static void a(ComponentCallbacksC2681f componentCallbacksC2681f, ComponentCallbacksC2681f componentCallbacksC2681f2, boolean z8, C1748a c1748a, boolean z9) {
        s sVarX = z8 ? componentCallbacksC2681f2.x() : componentCallbacksC2681f.x();
        if (sVarX != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c1748a == null ? 0 : c1748a.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add((String) c1748a.f(i8));
                arrayList.add((View) c1748a.j(i8));
            }
            if (z9) {
                sVarX.c(arrayList2, arrayList, null);
            } else {
                sVarX.b(arrayList2, arrayList, null);
            }
        }
    }

    public static String b(C1748a c1748a, String str) {
        int size = c1748a.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equals(c1748a.j(i8))) {
                return (String) c1748a.f(i8);
            }
        }
        return null;
    }

    public static J c() {
        try {
            return (J) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(C1748a c1748a, C1748a c1748a2) {
        for (int size = c1748a.size() - 1; size >= 0; size--) {
            if (!c1748a2.containsKey((String) c1748a.j(size))) {
                c1748a.h(size);
            }
        }
    }

    public static void e(ArrayList arrayList, int i8) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i8);
        }
    }
}
