package p166t;

import A.AbstractC0890p0;
import D6.L;
import D6.S;
import D6.T;
import D6.r;
import H.AbstractC0977f;
import H.C1013x0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.O0;
import H.c1;
import H.g1;
import H.j1;
import H.u1;
import H.v1;
import M6.eLZq.eGwOBWCdOTaKus;
import T1.f;
import U.i;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import p158s.a;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N1 f33398a = new N1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0984i0.a f33399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f33400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f33401d;

    static {
        Class cls = Long.TYPE;
        t.d(cls);
        InterfaceC0984i0.a aVarA = InterfaceC0984i0.a.a("camera2.streamSpec.streamUseCase", cls);
        t.f(aVarA, "create(...)");
        f33399b = aVarA;
        Map mapC = L.c();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            v1.b bVar = v1.b.PREVIEW;
            v1.b bVar2 = v1.b.METERING_REPEATING;
            v1.b bVar3 = v1.b.IMAGE_ANALYSIS;
            mapC.put(4L, T.g(bVar, bVar2, bVar3));
            mapC.put(1L, T.g(bVar, bVar2, bVar3));
            mapC.put(2L, S.c(v1.b.IMAGE_CAPTURE));
            mapC.put(3L, S.c(v1.b.VIDEO_CAPTURE));
        }
        f33400c = L.b(mapC);
        Map mapC2 = L.c();
        if (i8 >= 33) {
            v1.b bVar4 = v1.b.PREVIEW;
            v1.b bVar5 = v1.b.IMAGE_CAPTURE;
            v1.b bVar6 = v1.b.VIDEO_CAPTURE;
            mapC2.put(4L, T.g(bVar4, bVar5, bVar6));
            mapC2.put(3L, T.g(bVar4, bVar6));
        }
        f33401d = L.b(mapC2);
    }

    public static final boolean c(n characteristicsCompat, List surfaceConfigs) {
        long[] jArr;
        t.g(characteristicsCompat, "characteristicsCompat");
        t.g(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j8 : jArr) {
            hashSet.add(Long.valueOf(j8));
        }
        Iterator it = surfaceConfigs.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((j1) it.next()).i().b()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(List attachedSurfaces, List newUseCaseConfigs) {
        t.g(attachedSurfaces, "attachedSurfaces");
        t.g(newUseCaseConfigs, "newUseCaseConfigs");
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            AbstractC0977f abstractC0977f = (AbstractC0977f) it.next();
            List listB = abstractC0977f.b();
            t.f(listB, "getCaptureTypes(...)");
            v1.b bVar = (v1.b) listB.get(0);
            N1 n8 = f33398a;
            InterfaceC0984i0 interfaceC0984i0E = abstractC0977f.e();
            t.d(interfaceC0984i0E);
            t.d(bVar);
            if (n8.j(interfaceC0984i0E, bVar)) {
                return true;
            }
        }
        Iterator it2 = newUseCaseConfigs.iterator();
        while (it2.hasNext()) {
            u1 u1Var = (u1) it2.next();
            N1 n9 = f33398a;
            v1.b bVarO = u1Var.O();
            t.f(bVarO, "getCaptureType(...)");
            if (n9.j(u1Var, bVarO)) {
                return true;
            }
        }
        return false;
    }

    public static final a e(u1 useCaseConfig) {
        t.g(useCaseConfig, "useCaseConfig");
        O0 o0I0 = O0.i0();
        t.f(o0I0, "create(...)");
        InterfaceC0984i0.a aVar = a.f32605R;
        if (useCaseConfig.e(aVar)) {
            o0I0.L(aVar, useCaseConfig.h(aVar));
        }
        InterfaceC0984i0.a aVar2 = u1.f3220E;
        if (useCaseConfig.e(aVar2)) {
            o0I0.L(aVar2, useCaseConfig.h(aVar2));
        }
        InterfaceC0984i0.a aVar3 = C1013x0.f3269Q;
        if (useCaseConfig.e(aVar3)) {
            o0I0.L(aVar3, useCaseConfig.h(aVar3));
        }
        InterfaceC0984i0.a aVar4 = InterfaceC1015y0.f3283j;
        if (useCaseConfig.e(aVar4)) {
            o0I0.L(aVar4, useCaseConfig.h(aVar4));
        }
        return new a(o0I0);
    }

    public static final boolean h(n characteristicsCompat) {
        long[] jArr;
        t.g(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static final boolean k(n characteristicsCompat, List attachedSurfaces, Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap) {
        t.g(characteristicsCompat, "characteristicsCompat");
        t.g(attachedSurfaces, "attachedSurfaces");
        t.g(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        t.g(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<u1> arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            f.g(((AbstractC0977f) it.next()).e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f.g(((g1) f.g(suggestedStreamSpecMap.get((u1) it2.next()))).d());
        }
        long[] jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j8 : jArr) {
                hashSet.add(Long.valueOf(j8));
            }
            if (f33398a.i(attachedSurfaces, arrayList, hashSet)) {
                Iterator it3 = attachedSurfaces.iterator();
                while (it3.hasNext()) {
                    AbstractC0977f abstractC0977f = (AbstractC0977f) it3.next();
                    InterfaceC0984i0 interfaceC0984i0E = abstractC0977f.e();
                    N1 n8 = f33398a;
                    t.d(interfaceC0984i0E);
                    InterfaceC0984i0 interfaceC0984i0F = n8.f(interfaceC0984i0E, (Long) interfaceC0984i0E.h(a.f32605R));
                    if (interfaceC0984i0F != null) {
                        attachedSurfaceStreamSpecMap.put(abstractC0977f, abstractC0977f.k(interfaceC0984i0F));
                    }
                }
                for (u1 u1Var : arrayList) {
                    g1 g1Var = (g1) suggestedStreamSpecMap.get(u1Var);
                    t.d(g1Var);
                    InterfaceC0984i0 interfaceC0984i0D = g1Var.d();
                    N1 n9 = f33398a;
                    t.d(interfaceC0984i0D);
                    InterfaceC0984i0 interfaceC0984i0F2 = n9.f(interfaceC0984i0D, (Long) interfaceC0984i0D.h(a.f32605R));
                    if (interfaceC0984i0F2 != null) {
                        suggestedStreamSpecMap.put(u1Var, g1Var.i().d(interfaceC0984i0F2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void l(Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap, Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List surfaceConfigsWithStreamUseCase) {
        t.g(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        t.g(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        t.g(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        t.g(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        t.g(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i8 = 0; i8 < size; i8++) {
            long jB = ((j1) surfaceConfigsWithStreamUseCase.get(i8)).i().b();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i8))) {
                AbstractC0977f abstractC0977f = (AbstractC0977f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i8));
                t.d(abstractC0977f);
                InterfaceC0984i0 interfaceC0984i0E = abstractC0977f.e();
                N1 n8 = f33398a;
                t.d(interfaceC0984i0E);
                InterfaceC0984i0 interfaceC0984i0F = n8.f(interfaceC0984i0E, Long.valueOf(jB));
                if (interfaceC0984i0F != null) {
                    attachedSurfaceStreamSpecMap.put(abstractC0977f, abstractC0977f.k(interfaceC0984i0F));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i8))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i8));
                t.d(obj);
                u1 u1Var = (u1) obj;
                g1 g1Var = (g1) suggestedStreamSpecMap.get(u1Var);
                t.d(g1Var);
                InterfaceC0984i0 interfaceC0984i0D = g1Var.d();
                N1 n9 = f33398a;
                t.d(interfaceC0984i0D);
                InterfaceC0984i0 interfaceC0984i0F2 = n9.f(interfaceC0984i0D, Long.valueOf(jB));
                if (interfaceC0984i0F2 != null) {
                    g1 g1VarA = g1Var.i().d(interfaceC0984i0F2).a();
                    t.f(g1VarA, "build(...)");
                    suggestedStreamSpecMap.put(u1Var, g1VarA);
                }
            }
        }
    }

    public static final void m(Collection sessionConfigs, Collection useCaseConfigs, Map streamUseCaseMap) {
        t.g(sessionConfigs, "sessionConfigs");
        t.g(useCaseConfigs, "useCaseConfigs");
        t.g(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator it = sessionConfigs.iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            InterfaceC0984i0 interfaceC0984i0G = c1Var.g();
            InterfaceC0984i0.a aVar = f33399b;
            if (interfaceC0984i0G.e(aVar) && c1Var.o().size() != 1) {
                O o8 = O.f28784a;
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(c1Var.o().size())}, 1));
                t.f(str, "format(...)");
                AbstractC0890p0.c("StreamUseCaseUtil", str);
                return;
            }
            if (c1Var.g().e(aVar)) {
                Iterator it2 = sessionConfigs.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    c1 c1Var2 = (c1) it2.next();
                    if (((u1) arrayList.get(i8)).O() == v1.b.METERING_REPEATING) {
                        List listO = c1Var2.o();
                        t.f(listO, "getSurfaces(...)");
                        f.j(!listO.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(c1Var2.o().get(0), 1L);
                    } else {
                        InterfaceC0984i0 interfaceC0984i0G2 = c1Var2.g();
                        InterfaceC0984i0.a aVar2 = f33399b;
                        if (interfaceC0984i0G2.e(aVar2)) {
                            List listO2 = c1Var2.o();
                            t.f(listO2, "getSurfaces(...)");
                            if (!listO2.isEmpty()) {
                                Object obj = c1Var2.o().get(0);
                                Object objH = c1Var2.g().h(aVar2);
                                t.d(objH);
                                streamUseCaseMap.put(obj, objH);
                            }
                        }
                    }
                    i8++;
                }
                break;
            }
        }
        AbstractC0890p0.a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
    }

    public static final boolean n(R1.d featureSettings) {
        t.g(featureSettings, "featureSettings");
        return featureSettings.a() == 0 && featureSettings.b() == 8 && !featureSettings.f();
    }

    public final boolean b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                return false;
            }
        }
        return true;
    }

    public final InterfaceC0984i0 f(InterfaceC0984i0 interfaceC0984i0, Long l8) {
        InterfaceC0984i0.a aVar = f33399b;
        if (interfaceC0984i0.e(aVar) && t.c(interfaceC0984i0.h(aVar), l8)) {
            return null;
        }
        O0 o0J0 = O0.j0(interfaceC0984i0);
        t.f(o0J0, "from(...)");
        o0J0.L(aVar, l8);
        return new a(o0J0);
    }

    public final boolean g(v1.b bVar, long j8, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != v1.b.STREAM_SHARING) {
            Map map = f33400c;
            if (map.containsKey(Long.valueOf(j8))) {
                Object obj = map.get(Long.valueOf(j8));
                t.d(obj);
                if (((Set) obj).contains(bVar)) {
                    return true;
                }
            }
            return false;
        }
        Map map2 = f33401d;
        if (!map2.containsKey(Long.valueOf(j8))) {
            return false;
        }
        Object obj2 = map2.get(Long.valueOf(j8));
        t.d(obj2);
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((v1.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    public final boolean i(List list, List list2, Set set) {
        boolean z8;
        boolean z9;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0977f abstractC0977f = (AbstractC0977f) it.next();
            InterfaceC0984i0 interfaceC0984i0E = abstractC0977f.e();
            t.d(interfaceC0984i0E);
            InterfaceC0984i0.a aVar = a.f32605R;
            if (interfaceC0984i0E.e(aVar)) {
                InterfaceC0984i0 interfaceC0984i0E2 = abstractC0977f.e();
                t.d(interfaceC0984i0E2);
                Object objH = interfaceC0984i0E2.h(aVar);
                t.d(objH);
                if (((Number) objH).longValue() == 0) {
                    z9 = true;
                    z8 = false;
                } else {
                    z8 = true;
                    z9 = false;
                }
            } else {
                z9 = true;
                z8 = false;
            }
        } else {
            z8 = false;
            z9 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            u1 u1Var = (u1) it2.next();
            InterfaceC0984i0.a aVar2 = a.f32605R;
            if (u1Var.e(aVar2)) {
                Object objH2 = u1Var.h(aVar2);
                t.d(objH2);
                long jLongValue = ((Number) objH2).longValue();
                if (jLongValue != 0) {
                    if (z9) {
                        o();
                    }
                    linkedHashSet.add(Long.valueOf(jLongValue));
                    z8 = true;
                } else if (z8) {
                    o();
                }
            } else if (z8) {
                o();
            }
            z9 = true;
        }
        return !z9 && b(set, linkedHashSet);
    }

    public final boolean j(InterfaceC0984i0 interfaceC0984i0, v1.b bVar) {
        Object objF = interfaceC0984i0.f(u1.f3220E, Boolean.FALSE);
        t.d(objF);
        if (((Boolean) objF).booleanValue()) {
            return false;
        }
        InterfaceC0984i0.a aVar = C1013x0.f3269Q;
        if (!interfaceC0984i0.e(aVar)) {
            return false;
        }
        Object objH = interfaceC0984i0.h(aVar);
        t.d(objH);
        return e2.b(bVar, ((Number) objH).intValue()) == 5;
    }

    public final void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public static final boolean a(Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List list) {
        List listN;
        t.g(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        t.g(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        t.g(list, eGwOBWCdOTaKus.owIgPKLkSvJ);
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            long jB = ((j1) list.get(i8)).i().b();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i8))) {
                AbstractC0977f abstractC0977f = (AbstractC0977f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i8));
                N1 n8 = f33398a;
                t.d(abstractC0977f);
                v1.b bVar = abstractC0977f.b().size() == 1 ? (v1.b) abstractC0977f.b().get(0) : v1.b.STREAM_SHARING;
                t.d(bVar);
                List listB = abstractC0977f.b();
                t.f(listB, "getCaptureTypes(...)");
                if (!n8.g(bVar, jB, listB)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i8))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i8));
                t.d(obj);
                u1 u1Var = (u1) obj;
                N1 n9 = f33398a;
                v1.b bVarO = u1Var.O();
                t.f(bVarO, "getCaptureType(...)");
                if (u1Var.O() == v1.b.STREAM_SHARING) {
                    listN = ((i) u1Var).f0();
                    t.f(listN, "getCaptureTypes(...)");
                } else {
                    listN = r.n();
                }
                if (!n9.g(bVarO, jB, listN)) {
                    return false;
                }
            }
        }
        return true;
    }
}
