package p166t;

import A.AbstractC0890p0;
import A.J;
import H.AbstractC0977f;
import H.u1;
import T1.f;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p174u.n;
import p179u4.eubL.OjEsfyJYzbPn;
import p182v.c;
import p182v.e;

/* JADX INFO: renamed from: t.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2966p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f33823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33824c;

    /* JADX INFO: renamed from: t.p1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static J a(n nVar) {
            Long l8 = (Long) nVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l8 != null) {
                return c.b(l8.longValue());
            }
            return null;
        }
    }

    public C2966p1(n nVar) {
        this.f33822a = nVar;
        this.f33823b = e.a(nVar);
        int[] iArr = (int[]) nVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z8 = false;
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == 18) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f33824c = z8;
    }

    public static boolean a(J j8, J j9) {
        f.j(j9.e(), "Fully specified range is not actually fully specified.");
        if (j8.b() == 2 && j9.b() == 1) {
            return false;
        }
        if (j8.b() == 2 || j8.b() == 0 || j8.b() == j9.b()) {
            return j8.a() == 0 || j8.a() == j9.a();
        }
        return false;
    }

    public static boolean b(J j8, J j9, Set set) {
        if (set.contains(j9)) {
            return a(j8, j9);
        }
        AbstractC0890p0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", j8, j9));
        return false;
    }

    public static J c(J j8, Collection collection, Set set) {
        if (j8.b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            J j9 = (J) it.next();
            f.h(j9, "Fully specified DynamicRange cannot be null.");
            int iB = j9.b();
            f.j(j9.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(j8, j9, set)) {
                return j9;
            }
        }
        return null;
    }

    public static boolean e(J j8) {
        return Objects.equals(j8, J.f87c);
    }

    public static boolean f(J j8) {
        if (j8.b() == 2) {
            return true;
        }
        if (j8.b() == 0 || j8.a() != 0) {
            return j8.b() == 0 && j8.a() != 0;
        }
        return true;
    }

    public static void j(Set set, J j8, e eVar) {
        f.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setB = eVar.b(j8);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", j8, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean d() {
        return this.f33824c;
    }

    public Map g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AbstractC0977f) it.next()).c());
        }
        Set setC = this.f33823b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, (J) it2.next(), this.f33823b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            u1 u1Var = (u1) list2.get(((Integer) it3.next()).intValue());
            J jN = u1Var.n();
            if (e(jN)) {
                arrayList3.add(u1Var);
            } else if (f(jN)) {
                arrayList2.add(u1Var);
            } else {
                arrayList.add(u1Var);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<u1> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (u1 u1Var2 : arrayList4) {
            J jI = i(setC, linkedHashSet, linkedHashSet2, u1Var2, hashSet);
            map.put(u1Var2, jI);
            if (!linkedHashSet.contains(jI)) {
                linkedHashSet2.add(jI);
            }
        }
        return map;
    }

    public final J i(Set set, Set set2, Set set3, u1 u1Var, Set set4) {
        J jN = u1Var.n();
        J jH = h(jN, set4, set2, set3, u1Var.S());
        if (jH == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", u1Var.S(), jN, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, jH, this.f33823b);
        return jH;
    }

    public final J h(J j8, Set set, Set set2, Set set3, String str) {
        J jA;
        String str2;
        if (j8.e()) {
            if (!set.contains(j8)) {
                return null;
            }
            return j8;
        }
        int iB = j8.b();
        int iA = j8.a();
        if (iB == 1 && iA == 0) {
            J j9 = J.f88d;
            if (!set.contains(j9)) {
                return null;
            }
            return j9;
        }
        J jC = c(j8, set2, set);
        if (jC != null) {
            AbstractC0890p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, j8, jC));
            return jC;
        }
        J jC2 = c(j8, set3, set);
        if (jC2 != null) {
            AbstractC0890p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, j8, jC2));
            return jC2;
        }
        J j10 = J.f88d;
        if (b(j8, j10, set)) {
            AbstractC0890p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, j8, j10));
            return j10;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                jA = a.a(this.f33822a);
                if (jA != null) {
                    linkedHashSet.add(jA);
                }
            } else {
                jA = null;
            }
            linkedHashSet.add(J.f90f);
            J jC3 = c(j8, linkedHashSet, set);
            if (jC3 != null) {
                if (jC3.equals(jA)) {
                    str2 = "recommended";
                } else {
                    str2 = "required";
                }
                AbstractC0890p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, str2, j8, jC3));
                return jC3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J j11 = (J) it.next();
            f.j(j11.e(), "Candidate dynamic range must be fully specified.");
            if (!j11.equals(J.f88d) && a(j8, j11)) {
                AbstractC0890p0.a("DynamicRangeResolver", String.format(OjEsfyJYzbPn.bLF, str, j8, j11));
                return j11;
            }
        }
        return null;
    }
}
