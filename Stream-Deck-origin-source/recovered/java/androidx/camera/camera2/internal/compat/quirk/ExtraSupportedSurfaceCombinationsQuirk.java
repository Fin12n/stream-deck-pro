package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import H.i1;
import H.j1;
import P2.Lsk.mHPawN;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f14090a = d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f14091b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f14092c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", mHPawN.erSZKd, "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f14093d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));

    public static i1 d() {
        i1 i1Var = new i1();
        j1.d dVar = j1.d.YUV;
        i1Var.a(j1.c(dVar, j1.b.f3070c));
        i1Var.a(j1.c(j1.d.PRIV, j1.b.f3073f));
        i1Var.a(j1.c(dVar, j1.b.f3080m));
        return i1Var;
    }

    public static i1 e() {
        i1 i1Var = new i1();
        j1.d dVar = j1.d.PRIV;
        i1Var.a(j1.c(dVar, j1.b.f3073f));
        i1Var.a(j1.c(dVar, j1.b.f3070c));
        i1Var.a(j1.c(j1.d.YUV, j1.b.f3080m));
        return i1Var;
    }

    public static boolean h() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean i() {
        return h() || j() || k();
    }

    public static boolean j() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f14092c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean k() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f14093d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public List f(String str) {
        if (h()) {
            return g(str);
        }
        return (j() || k()) ? Collections.singletonList(f14091b) : Collections.EMPTY_LIST;
    }

    public final List g(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f14090a);
        }
        return arrayList;
    }
}
