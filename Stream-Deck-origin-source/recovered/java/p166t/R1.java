package p166t;

import A.AbstractC0890p0;
import A.C0904x;
import A.J;
import C6.H;
import D6.iIQ.BmWxZhjGfw;
import H.AbstractC0977f;
import H.AbstractC0994n0;
import H.K;
import H.c1;
import H.g1;
import H.h1;
import H.i1;
import H.j1;
import H.k1;
import H.l1;
import H.u1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import p174u.e;
import p174u.n;
import p174u.y;
import p198x.f;
import p198x.t;
import p198x.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class R1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C2966p1 f33430B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final D1 f33431C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final D.a f33432D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f33443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2937g f33444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f33445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f33446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f33447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f33448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f33450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f33451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f33452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f33453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f33454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k1 f33455w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2963o1 f33457y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33433a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33434b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f33435c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f33436d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33437e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f33438f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f33439g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f33440h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f33441i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f33442j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f33456x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x f33458z = new x();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33429A = new t();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i8) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static b f(List list, List list2, int i8, int i9, int i10) {
            return new C2931e(list, list2, i8, i9, i10);
        }

        public abstract List a();

        public abstract List b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class d {
        public static d j(int i8, boolean z8, int i9, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Range range, boolean z14) {
            return new C2934f(i8, z8, i9, z9, z10, z11, z12, z13, range, z14);
        }

        public abstract int a();

        public abstract int b();

        public abstract Range c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean k();
    }

    public R1(Context context, String str, p174u.t tVar, InterfaceC2937g interfaceC2937g, D.a aVar) throws C0904x {
        this.f33448p = false;
        this.f33449q = false;
        this.f33452t = false;
        this.f33453u = false;
        String str2 = (String) T1.f.g(str);
        this.f33443k = str2;
        this.f33444l = (InterfaceC2937g) T1.f.g(interfaceC2937g);
        this.f33446n = new f();
        this.f33457y = C2963o1.c(context);
        try {
            n nVarC = tVar.c(str2);
            this.f33445m = nVarC;
            Integer num = (Integer) nVarC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f33447o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) nVarC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i8 : iArr) {
                    if (i8 == 3) {
                        this.f33448p = true;
                    } else if (i8 == 6) {
                        this.f33449q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i8 == 16) {
                        this.f33452t = true;
                    } else if (i8 == 1) {
                        this.f33453u = true;
                    }
                }
            }
            C2966p1 c2966p1 = new C2966p1(this.f33445m);
            this.f33430B = c2966p1;
            this.f33431C = new D1(this.f33445m);
            q();
            if (this.f33452t) {
                t();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f33450r = zHasSystemFeature;
            if (zHasSystemFeature) {
                l();
            }
            if (c2966p1.d()) {
                k();
            }
            boolean zH = N1.h(this.f33445m);
            this.f33451s = zH;
            if (zH) {
                p();
            }
            boolean zA = h2.a(this.f33445m);
            this.f33454v = zA;
            if (zA) {
                o();
            }
            r();
            d();
            this.f33432D = aVar;
        } catch (e e8) {
            throw Y0.a(e8);
        }
    }

    public static Size[] D(StreamConfigurationMap streamConfigurationMap, int i8, Rational rational) {
        Size[] outputSizes;
        try {
            outputSizes = i8 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i8);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        if (rational == null) {
            return outputSizes;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            if (I.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public static int E(Range range, Range range2) {
        T1.f.j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int F(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static int J(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((J) it.next()).a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public static List R(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iU = ((u1) it.next()).U(0);
            if (!arrayList2.contains(Integer.valueOf(iU))) {
                arrayList2.add(Integer.valueOf(iU));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                u1 u1Var = (u1) it3.next();
                if (iIntValue == u1Var.U(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(u1Var)));
                }
            }
        }
        return arrayList;
    }

    public static boolean S(int i8, Range range, int i9) {
        return g1.f3033a.equals(range) || i9 >= i8 || i9 >= ((Integer) range.getUpper()).intValue();
    }

    public static boolean U(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC0977f) it.next()).d() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((u1) it2.next()).u() == 4101) {
                return true;
            }
        }
        return false;
    }

    public static Range f(Range range, Range range2, Range range3) {
        double dF = F(range2.intersect(range));
        double dF2 = F(range3.intersect(range));
        double dF3 = dF2 / ((double) F(range3));
        double dF4 = dF / ((double) F(range2));
        return (dF2 <= dF ? dF2 != dF ? dF4 >= 0.5d || dF3 <= dF4 : dF3 <= dF4 && (dF3 != dF4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dF3 < 0.5d && dF3 < dF4) ? range2 : range3;
    }

    public final Size A(StreamConfigurationMap streamConfigurationMap, int i8, boolean z8, Rational rational) {
        Size[] sizeArrA;
        Size[] sizeArrD = D(streamConfigurationMap, i8, rational);
        if (sizeArrD == null || sizeArrD.length == 0) {
            return null;
        }
        I.d dVar = new I.d();
        Size size = (Size) Collections.max(Arrays.asList(sizeArrD), dVar);
        Size size2 = P.d.f8829a;
        if (z8 && (sizeArrA = a.a(streamConfigurationMap, i8)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    public final int B(List list, boolean z8) {
        Iterator it = list.iterator();
        int iO = Integer.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC0977f abstractC0977f = (AbstractC0977f) it.next();
            iO = O(iO, abstractC0977f.d(), abstractC0977f.g(), z8);
        }
        return iO;
    }

    public List C(d dVar, List list, Map map, Map map2) {
        if (!N1.n(dVar)) {
            return null;
        }
        Iterator it = this.f33442j.iterator();
        while (it.hasNext()) {
            final List listD = ((i1) it.next()).d(list);
            if (listD != null) {
                boolean zA = N1.a(map, map2, listD);
                H h8 = new H(new Function0() { // from class: t.P1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(N1.c(this.f33413a.f33445m, listD));
                    }
                });
                if (zA && ((Boolean) h8.getValue()).booleanValue()) {
                    return listD;
                }
            }
        }
        return null;
    }

    public final Size G() {
        try {
            Size sizeH = H(Integer.parseInt(this.f33443k));
            if (sizeH != null) {
                return sizeH;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeI = I();
        return sizeI != null ? sizeI : P.d.f8832d;
    }

    public final Size H(int i8) {
        CamcorderProfile camcorderProfileA;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i9 = 0; i9 < 8; i9++) {
            int i10 = iArr[i9];
            if (this.f33444l.b(i8, i10) && (camcorderProfileA = this.f33444l.a(i8, i10)) != null) {
                return new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
            }
        }
        return null;
    }

    public final Size I() {
        Size[] outputSizes;
        try {
            outputSizes = this.f33445m.e().g().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new I.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = P.d.f8834f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    public l1 K(int i8, List list, Map map, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean zT;
        Range rangeN;
        X();
        boolean zL = D1.l(list, map.keySet());
        Map mapD = zL ? this.f33431C.d(map) : map;
        ArrayList arrayList = new ArrayList(mapD.keySet());
        List listR = R(arrayList);
        Map mapG = this.f33430B.g(list, arrayList, listR);
        AbstractC0890p0.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + mapG);
        boolean zU = U(list, mapD);
        if (z11) {
            rangeN = g1.f3033a;
            zT = false;
        } else {
            zT = T(list, arrayList);
            rangeN = N(list, arrayList, listR, zT);
        }
        Range range = rangeN;
        boolean z12 = zT;
        AbstractC0890p0.a("SupportedSurfaceCombination", "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z8 + ", mIsPreviewStabilizationSupported = " + this.f33454v + ", isFeatureComboInvocation = " + z10);
        if (z8 && !this.f33454v && z10) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return Y(w(mapG.values(), range, z8, zU, z10), h(i8, z9, mapG, z8, zU, zL, z10, false, range, z12), list, mapD, arrayList, listR, mapG, z11);
    }

    public final List L(d dVar) {
        if (this.f33439g.containsKey(dVar)) {
            return (List) this.f33439g.get(dVar);
        }
        List arrayList = new ArrayList();
        if (dVar.k()) {
            if (this.f33438f.isEmpty()) {
                m();
            }
            arrayList.addAll(this.f33438f);
        } else if (dVar.i()) {
            if (this.f33441i.isEmpty()) {
                s();
            }
            if (dVar.a() == 0) {
                arrayList.addAll(this.f33441i);
            }
        } else if (dVar.f()) {
            if (this.f33437e.isEmpty()) {
                n();
            }
            arrayList.addAll(this.f33437e);
        } else if (dVar.b() == 8) {
            int iA = dVar.a();
            if (iA == 1) {
                arrayList = this.f33435c;
            } else if (iA != 2) {
                arrayList.addAll(dVar.g() ? this.f33436d : this.f33433a);
            } else {
                arrayList.addAll(this.f33434b);
                arrayList.addAll(this.f33433a);
            }
        } else if (dVar.b() == 10 && dVar.a() == 0) {
            arrayList.addAll(this.f33440h);
        }
        this.f33439g.put(dVar, arrayList);
        return arrayList;
    }

    public final Pair M(d dVar, List list, List list2, List list3, List list4, int i8, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0977f abstractC0977f = (AbstractC0977f) it.next();
            arrayList.add(abstractC0977f.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC0977f);
            }
        }
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Size size = (Size) list2.get(i9);
            u1 u1Var = (u1) list3.get(((Integer) list4.get(i9)).intValue());
            int iU = u1Var.u();
            arrayList.add(j1.l(iU, size, P(iU), dVar.a(), dVar.k() ? j1.c.FEATURE_COMBINATION_TABLE : j1.c.CAPTURE_SESSION_TABLES, u1Var.N()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), u1Var);
            }
            i8 = O(i8, u1Var.u(), size, dVar.f());
        }
        return new Pair(arrayList, Integer.valueOf(i8));
    }

    public final Range N(List list, List list2, List list3, boolean z8) {
        Range rangeQ = g1.f3033a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rangeQ = Q(((AbstractC0977f) it.next()).i(), rangeQ, z8);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Range rangeR = ((u1) list2.get(((Integer) it2.next()).intValue())).R(g1.f3033a);
            Objects.requireNonNull(rangeR);
            rangeQ = Q(rangeR, rangeQ, z8);
        }
        return rangeQ;
    }

    public final int O(int i8, int i9, Size size, boolean z8) {
        return Math.min(i8, y(i9, size, z8));
    }

    public k1 P(int i8) {
        if (!this.f33456x.contains(Integer.valueOf(i8))) {
            c0(this.f33455w.n(), P.d.f8833e, i8);
            c0(this.f33455w.l(), P.d.f8835g, i8);
            b0(this.f33455w.h(), i8, null);
            b0(this.f33455w.f(), i8, I.a.f3595a);
            b0(this.f33455w.d(), i8, I.a.f3597c);
            d0(this.f33455w.p(), i8);
            this.f33456x.add(Integer.valueOf(i8));
        }
        return this.f33455w;
    }

    public final Range Q(Range range, Range range2, boolean z8) {
        Range range3 = g1.f3033a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z8) {
            T1.f.j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean T(List list, List list2) {
        Iterator it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((AbstractC0977f) it.next()).j(), boolValueOf));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((u1) it2.next()).X(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean V(d dVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0977f) it.next()).h());
        }
        I.d dVar2 = new I.d();
        for (u1 u1Var : map.keySet()) {
            List list2 = (List) map.get(u1Var);
            T1.f.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + u1Var + ".");
            Size size = (Size) Collections.min(list2, dVar2);
            int iU = u1Var.u();
            arrayList.add(j1.l(iU, size, P(iU), dVar.a(), j1.c.CAPTURE_SESSION_TABLES, u1Var.N()));
        }
        Map map2 = Collections.EMPTY_MAP;
        List list3 = Collections.EMPTY_LIST;
        return e(dVar, arrayList, map2, list3, list3);
    }

    public final void W(d dVar, Range range, Size size, int i8, h1 h1Var, boolean z8, Map map, List list) {
        j1.b bVarE = j1.l(i8, size, P(i8), dVar.a(), dVar.k() ? j1.c.FEATURE_COMBINATION_TABLE : j1.c.CAPTURE_SESSION_TABLES, h1Var).e();
        Range range2 = g1.f3033a;
        int iY = (!range2.equals(range) || z8) ? y(i8, size, dVar.f()) : Integer.MAX_VALUE;
        if (dVar.e()) {
            if (bVarE == j1.b.f3084q) {
                return;
            }
            if (!range2.equals(range) && iY < ((Integer) range.getUpper()).intValue()) {
                return;
            }
        }
        Set hashSet = (Set) map.get(bVarE);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(bVarE, hashSet);
        }
        if (hashSet.contains(Integer.valueOf(iY))) {
            return;
        }
        list.add(size);
        hashSet.add(Integer.valueOf(iY));
    }

    public final void X() {
        this.f33457y.g();
        if (this.f33455w == null) {
            r();
        } else {
            this.f33455w = k1.a(this.f33455w.b(), this.f33455w.n(), this.f33457y.f(), this.f33455w.l(), this.f33455w.j(), this.f33455w.h(), this.f33455w.f(), this.f33455w.d(), this.f33455w.p());
        }
    }

    public final l1 Z(d dVar, List list, Map map, List list2, List list3, Map map2, boolean z8) {
        HashMap map3;
        HashMap map4;
        int i8;
        List list4 = list;
        List list5 = list2;
        AbstractC0890p0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.k() && !V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f33443k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map mapI = i(map, dVar, z8);
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            u1 u1Var = (u1) list5.get(((Integer) it.next()).intValue());
            List list6 = (List) mapI.get(u1Var);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(c(list6, u1Var.u()));
        }
        List listJ = dVar.f() ? this.f33431C.j(arrayList) : u(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zD = N1.d(list4, list5);
        int iB = B(list4, dVar.f());
        List listC = null;
        if (!this.f33451s || zD) {
            map3 = map7;
            map4 = map8;
            i8 = iB;
        } else {
            Iterator it2 = listJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i8 = iB;
                    break;
                }
                Pair pairM = M(dVar, list4, (List) it2.next(), list5, list3, iB, map7, map8);
                map3 = map7;
                map4 = map8;
                i8 = iB;
                listC = C(dVar, (List) pairM.first, map3, map4);
                if (listC != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                iB = i8;
                list4 = list;
                map8 = map4;
            }
            AbstractC0890p0.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listC);
        }
        List list7 = listC;
        HashMap map9 = map3;
        HashMap map10 = map4;
        b bVarJ = j(dVar, list, list2, list3, listJ, list7, map2, i8, z8);
        AbstractC0890p0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + bVarJ);
        List listA = bVarJ.a();
        int iD = bVarJ.d();
        List listB = bVarJ.b();
        int iE = bVarJ.e();
        int iC = bVarJ.c();
        if (listA == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f33443k + " and Hardware level: " + this.f33447o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range rangeX = g1.f3033a;
        if (rangeX.equals(dVar.c())) {
            iC = iC;
            if (dVar.f()) {
                rangeX = x(D1.f33323f, iD, this.f33431C.f(listA));
            }
        } else {
            Range[] rangeArrF = dVar.f() ? this.f33431C.f(listA) : (Range[]) this.f33445m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range rangeX2 = x(dVar.c(), iD, rangeArrF);
            if (dVar.e() || dVar.h()) {
                T1.f.b(rangeX2.equals(dVar.c()), "Target FPS range " + dVar.c() + " is not supported. Max FPS supported by the calculated best combination: " + iD + ". Calculated best FPS range for device: " + rangeX2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrF));
            }
            rangeX = rangeX2;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            u1 u1Var2 = (u1) it3.next();
            Iterator it4 = it3;
            g1.a aVarH = g1.a((Size) listA.get(list3.indexOf(Integer.valueOf(list2.indexOf(u1Var2))))).g(dVar.f() ? 1 : 0).b((J) T1.f.g((J) map2.get(u1Var2))).d(N1.e(u1Var2)).h(dVar.d());
            if (!g1.f3033a.equals(rangeX)) {
                aVarH.c(rangeX);
            }
            map6.put(u1Var2, aVarH.a());
            it3 = it4;
        }
        if (list7 != null && iD == iE && listA.size() == listB.size()) {
            for (int i9 = 0; i9 < listA.size(); i9++) {
                if (((Size) listA.get(i9)).equals(listB.get(i9))) {
                }
            }
            if (!N1.k(this.f33445m, list, map6, map5)) {
                N1.l(map6, map5, map9, map10, list7);
            }
        }
        return new l1(map6, map5, iC);
    }

    public j1 a0(int i8, int i9, Size size, h1 h1Var) {
        return j1.l(i9, size, P(i9), i8, j1.c.CAPTURE_SESSION_TABLES, h1Var);
    }

    public final void b0(Map map, int i8, Rational rational) {
        Size sizeA = A(this.f33445m.e().g(), i8, true, rational);
        if (sizeA != null) {
            map.put(Integer.valueOf(i8), sizeA);
        }
    }

    public List c(List list, int i8) {
        Rational rational;
        int iA = this.f33458z.a(this.f33443k, this.f33445m);
        if (iA == 0) {
            rational = I.a.f3595a;
        } else if (iA != 1) {
            rational = null;
            if (iA == 2) {
                Size sizeG = P(256).g(256);
                if (sizeG != null) {
                    rational = new Rational(sizeG.getWidth(), sizeG.getHeight());
                }
            } else if (iA != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + iA);
            }
        } else {
            rational = I.a.f3597c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (I.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f33429A.a(j1.f(i8), list);
    }

    public final void c0(Map map, Size size, int i8) {
        if (this.f33450r) {
            Size sizeA = A(this.f33445m.e().g(), i8, false, null);
            Integer numValueOf = Integer.valueOf(i8);
            if (sizeA != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeA), new I.d());
            }
            map.put(numValueOf, size);
        }
    }

    public final void d() {
    }

    public final void d0(Map map, int i8) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f33452t || (streamConfigurationMap = (StreamConfigurationMap) this.f33445m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i8), A(streamConfigurationMap, i8, true, null));
    }

    public boolean e(d dVar, List list, Map map, List list2, List list3) {
        Iterator it = L(dVar).iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 = ((i1) it.next()).d(list) != null;
            if (z8) {
                break;
            }
        }
        if (!z8 || !dVar.k()) {
            return z8;
        }
        c1 c1VarG = g(dVar, list, map, list2, list3);
        boolean zA = this.f33432D.a(c1VarG);
        Iterator it2 = c1VarG.o().iterator();
        while (it2.hasNext()) {
            ((AbstractC0994n0) it2.next()).d();
        }
        return zA;
    }

    public final c1 g(d dVar, List list, Map map, List list2, List list3) {
        Range rangeC = dVar.c();
        c1.h hVar = new c1.h();
        for (int i8 = 0; i8 < list.size(); i8++) {
            j1 j1Var = (j1) list.get(i8);
            Size sizeH = j1Var.h(P(j1Var.g()));
            u1 u1Var = (u1) list2.get(((Integer) list3.get(i8)).intValue());
            J j8 = (J) map.get(j1Var);
            Objects.requireNonNull(j8);
            c1.b bVarB = D.a.b(u1Var, sizeH, j8);
            bVarB.s(g1.f3033a.equals(rangeC) ? E.c.f1971k : rangeC);
            if (dVar.g()) {
                bVarB.w(2);
            }
            hVar.b(bVarB.p());
            T1.f.j(hVar.f(), "Cannot create a combined SessionConfig for feature combo after adding " + u1Var + " with " + j1Var + " due to [" + hVar.d() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.c();
    }

    public final d h(int i8, boolean z8, Map map, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Range range, boolean z14) {
        int iJ = J(map);
        if (i8 != 0 && z10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f33443k, K.a(i8)));
        }
        if (i8 != 0 && iJ == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f33443k, K.a(i8)));
        }
        if (i8 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f33443k, K.a(i8)));
        }
        if (z11 && z12) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z11 && !this.f33431C.m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z12 && range == g1.f3033a && z13) {
            range = E.c.f1971k;
        }
        return d.j(i8, z8, iJ, z9, z10, z11, z12, z13, range, z14);
    }

    public Map i(Map map, d dVar, boolean z8) {
        HashMap map2 = new HashMap();
        for (u1 u1Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List list = (List) map.get(u1Var);
            Objects.requireNonNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W(dVar, dVar.c(), (Size) it.next(), u1Var.u(), u1Var.N(), z8, map3, arrayList);
            }
            map2.put(u1Var, arrayList);
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[PHI: r6 r7 r10
      0x0112: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v3 boolean) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r10v3 java.util.List) = (r10v1 java.util.List), (r10v1 java.util.List), (r10v5 java.util.List), (r10v6 java.util.List) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    public final b j(final d dVar, List list, final List list2, final List list3, List list4, List list5, Map map, int i8, boolean z8) {
        d dVar2;
        Range rangeC = dVar.c();
        Iterator it = list4.iterator();
        int i9 = Integer.MAX_VALUE;
        boolean z9 = false;
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        int i11 = Integer.MAX_VALUE;
        List list6 = null;
        List list7 = null;
        while (true) {
            if (!it.hasNext()) {
                dVar2 = dVar;
                break;
            }
            List list8 = (List) it.next();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Pair pairM = M(dVar, list, list8, list2, list3, i8, map2, map3);
            final List list9 = (List) pairM.first;
            int iIntValue = ((Integer) pairM.second).intValue();
            boolean zS = S(i8, rangeC, iIntValue);
            final HashMap map4 = new HashMap();
            Iterator it2 = it;
            int i12 = 0;
            while (i12 < list9.size()) {
                j1 j1Var = (j1) list9.get(i12);
                J jC = J.f87c;
                int i13 = i12;
                if (map2.containsKey(Integer.valueOf(i13))) {
                    AbstractC0977f abstractC0977f = (AbstractC0977f) map2.get(Integer.valueOf(i13));
                    Objects.requireNonNull(abstractC0977f);
                    jC = abstractC0977f.c();
                } else {
                    if (map3.containsKey(Integer.valueOf(i13))) {
                        u1 u1Var = (u1) map3.get(Integer.valueOf(i13));
                        Objects.requireNonNull(u1Var);
                        jC = (J) map.get(u1Var);
                    }
                    map4.put(j1Var, jC);
                    i12 = i13 + 1;
                }
                map4.put(j1Var, jC);
                i12 = i13 + 1;
            }
            H h8 = new H(new Function0() { // from class: t.Q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.f33422a.e(dVar, list9, map4, list2, list3));
                }
            });
            if (z8 && ((Boolean) h8.getValue()).booleanValue() && (i9 == Integer.MAX_VALUE || i9 < iIntValue)) {
                i9 = iIntValue;
            }
            if (!z9 && ((Boolean) h8.getValue()).booleanValue()) {
                if (i10 == Integer.MAX_VALUE || i10 < iIntValue) {
                    i10 = iIntValue;
                    list6 = list8;
                }
                if (!zS) {
                    if (list5 == null) {
                    }
                    it = it2;
                } else {
                    if (z10 && !z8) {
                        dVar2 = dVar;
                        i10 = iIntValue;
                        list6 = list8;
                        break;
                    }
                    z9 = true;
                    i10 = iIntValue;
                    list6 = list8;
                    if (list5 == null) {
                    }
                    it = it2;
                }
            } else {
                if (list5 == null && !z10) {
                    dVar2 = dVar;
                    if (C(dVar2, list9, map2, map3) != null) {
                        if (i11 == Integer.MAX_VALUE || i11 < iIntValue) {
                            i11 = iIntValue;
                            list7 = list8;
                        }
                        if (!zS) {
                            continue;
                        } else {
                            if (z9 && !z8) {
                                i11 = iIntValue;
                                list7 = list8;
                                break;
                            }
                            z10 = true;
                            i11 = iIntValue;
                            list7 = list8;
                        }
                    } else {
                        continue;
                    }
                }
                it = it2;
            }
        }
        return (!dVar2.e() || g1.f3033a.equals(rangeC) || (i10 != Integer.MAX_VALUE && i10 >= ((Integer) rangeC.getUpper()).intValue())) ? b.f(list6, list7, i10, i11, i9) : b.f(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final void k() {
        this.f33440h.addAll(AbstractC2995z1.e());
    }

    public final void l() {
        this.f33435c.addAll(AbstractC2995z1.g());
    }

    public final void m() {
        this.f33438f.addAll(AbstractC2995z1.c());
    }

    public final void n() {
        if (this.f33431C.m()) {
            this.f33437e.clear();
            Size sizeI = this.f33431C.i();
            if (sizeI != null) {
                this.f33437e.addAll(AbstractC2995z1.b(sizeI, P(34)));
            }
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f33436d.addAll(AbstractC2995z1.l());
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f33442j.addAll(AbstractC2995z1.n());
        }
    }

    public final void q() {
        this.f33433a.addAll(AbstractC2995z1.d(this.f33447o, this.f33448p, this.f33449q));
        this.f33433a.addAll(this.f33446n.a(this.f33443k));
    }

    public final void r() {
        this.f33455w = k1.a(P.d.f8831c, new HashMap(), this.f33457y.f(), new HashMap(), G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final void s() {
        this.f33441i.addAll(AbstractC2995z1.o());
    }

    public final void t() {
        this.f33434b.addAll(AbstractC2995z1.p());
    }

    public final List u(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i9 = size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < size; i11++) {
                ((List) arrayList.get(i11)).add((Size) list2.get((i11 % i9) / size2));
            }
            if (i10 < list.size() - 1) {
                i9 = size2;
                size2 /= ((List) list.get(i10 + 1)).size();
            }
        }
        return arrayList;
    }

    public final boolean v(boolean z8, Boolean bool) {
        if (bool == null || bool.booleanValue() == z8) {
            return z8;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final c w(Collection collection, Range range, boolean z8, boolean z9, boolean z10) {
        int i8;
        if (!z10) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(J.f90f);
        if (range != null && ((Integer) range.getUpper()).intValue() == 60) {
            i8 = Contains;
            i8 = Contains;
            i8 = Contains + 1;
        }
        if (z8) {
            i8++;
        }
        if (z9) {
            i8++;
        }
        if (i8 > 1) {
            return c.WITH_FEATURE_COMBO;
        }
        return i8 == 1 ? c.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : c.WITHOUT_FEATURE_COMBO;
    }

    public final Range x(Range range, int i8, Range[] rangeArr) {
        Range rangeF = g1.f3033a;
        if (rangeF.equals(range) || rangeArr == null) {
            return rangeF;
        }
        Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i8)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i8)));
        int iF = 0;
        for (Range range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i8 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeF.equals(g1.f3033a)) {
                    rangeF = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int iF2 = F(range3.intersect(range2));
                    if (iF == 0) {
                        iF = iF2;
                    } else {
                        if (iF2 >= iF) {
                            rangeF = f(range2, rangeF, range3);
                            iF = F(range2.intersect(rangeF));
                        }
                        range3 = rangeF;
                    }
                } catch (IllegalArgumentException unused) {
                    if (iF != 0 || (E(range3, range2) >= E(rangeF, range2) && (E(range3, range2) != E(rangeF, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeF.getUpper()).intValue() && F(range3) >= F(rangeF))))) {
                    }
                }
                rangeF = range3;
            }
        }
        return rangeF;
    }

    public final int y(int i8, Size size, boolean z8) {
        T1.f.i(!z8 || i8 == 34);
        return z8 ? this.f33431C.h(size) : z(this.f33445m, i8, size);
    }

    public final int z(n nVar, int i8, Size size) {
        y yVarE = nVar.e();
        Objects.requireNonNull(yVarE);
        long jE = yVarE.e(i8, size);
        if (jE > 0) {
            return (int) (1.0E9d / jE);
        }
        if (!this.f33453u) {
            return Integer.MAX_VALUE;
        }
        AbstractC0890p0.l("SupportedSurfaceCombination", "minFrameDuration: " + jE + " is invalid for imageFormat = " + i8 + ", size = " + size);
        return 0;
    }

    public final l1 Y(c cVar, d dVar, List list, Map map, List list2, List list3, Map map2, boolean z8) {
        AbstractC0890p0.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z8);
        }
        if (iOrdinal != 2) {
            return Z(dVar, list, map, list2, list3, map2, z8);
        }
        try {
            return Z(dVar, list, map, list2, list3, map2, z8);
        } catch (IllegalArgumentException e8) {
            AbstractC0890p0.b("SupportedSurfaceCombination", BmWxZhjGfw.sqnecLbb, e8);
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z8);
        }
    }
}
