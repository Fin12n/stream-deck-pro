package L;

import A.J;
import A.T0;
import D6.M;
import H.AbstractC0977f;
import H.B;
import H.G;
import H.I;
import H.InterfaceC0984i0;
import H.g1;
import H.j1;
import H.l1;
import H.u1;
import H.v1;
import I.x;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f4783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G f4784d;

    public n(v1 useCaseConfigFactory, G g8) {
        t.g(useCaseConfigFactory, "useCaseConfigFactory");
        this.f4783c = useCaseConfigFactory;
        this.f4784d = g8;
    }

    @Override // L.m
    public l a(int i8, I cameraInfoInternal, List newUseCases, List attachedUseCases, B cameraConfig, int i9, Range targetFrameRate, boolean z8, boolean z9) {
        t.g(cameraInfoInternal, "cameraInfoInternal");
        t.g(newUseCases, "newUseCases");
        t.g(attachedUseCases, "attachedUseCases");
        t.g(cameraConfig, "cameraConfig");
        t.g(targetFrameRate, "targetFrameRate");
        Pair pairC = c(i8, cameraInfoInternal, attachedUseCases);
        Object second = pairC.second;
        t.f(second, "second");
        Map mapK = f.K(newUseCases, cameraConfig.j(), this.f4783c, i9, targetFrameRate);
        t.f(mapK, "getConfigs(...)");
        l lVarD = d(i8, cameraInfoInternal, newUseCases, (Map) second, mapK, z8, z9);
        Object first = pairC.first;
        t.f(first, "first");
        return new l(M.n((Map) first, lVarD.b()), lVarD.a());
    }

    @Override // L.m
    public void b(G cameraDeviceSurfaceManager) {
        t.g(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.f4784d = cameraDeviceSurfaceManager;
    }

    public final Pair c(int i8, I i9, List list) {
        ArrayList arrayList = new ArrayList();
        String strE = i9.e();
        t.f(strE, yOZfxp.hHVkZzmkt);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            g1 g1VarG = t8.g();
            if (g1VarG == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            G g8 = this.f4784d;
            if (g8 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iP = t8.p();
            Size sizeH = t8.h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            j1 j1VarB = g8.b(i8, strE, iP, sizeH, t8.l().N());
            t.f(j1VarB, "transformSurfaceConfig(...)");
            int iP2 = t8.p();
            Size sizeH2 = t8.h();
            t.d(sizeH2);
            J jB = g1VarG.b();
            List listN0 = U.g.n0(t8);
            InterfaceC0984i0 interfaceC0984i0D = g1VarG.d();
            int iT = t8.l().t(0);
            Range rangeR = t8.l().R(g1.f3033a);
            if (rangeR == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC0977f abstractC0977fA = AbstractC0977f.a(j1VarB, iP2, sizeH2, jB, listN0, interfaceC0984i0D, iT, rangeR, t8.l().X());
            t.f(abstractC0977fA, "create(...)");
            arrayList.add(abstractC0977fA);
            linkedHashMap2.put(abstractC0977fA, t8);
            linkedHashMap.put(t8, g1VarG);
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public final l d(int i8, I i9, List list, Map map, Map map2, boolean z8, boolean z9) {
        int iC;
        Rect rectH;
        String strE = i9.e();
        t.f(strE, kDsnNkYbBsI.GNluNCgEGa);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            iC = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectH = i9.h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            o oVar = new o(i9, rectH != null ? x.m(rectH) : null);
            Iterator it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                T0 t8 = (T0) it.next();
                Object obj = map2.get(t8);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f.b bVar = (f.b) obj;
                u1 u1VarH = t8.H(i9, bVar.f4768a, bVar.f4769b);
                t.f(u1VarH, "mergeConfigs(...)");
                linkedHashMap2.put(u1VarH, t8);
                List listM = oVar.m(u1VarH);
                t.f(listM, "getSortedSupportedOutputSizes(...)");
                linkedHashMap3.put(u1VarH, listM);
                if (u1VarH.W() == 2) {
                    z10 = true;
                }
            }
            G g8 = this.f4784d;
            if (g8 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            l1 l1VarE = g8.e(i8, strE, new ArrayList(map.keySet()), linkedHashMap3, z10, f.T(list), z8, z9);
            t.f(l1VarE, "getSuggestedStreamSpecs(...)");
            Map mapA = l1VarE.a();
            Map mapB = l1VarE.b();
            iC = l1VarE.c();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = mapA.get(entry.getKey());
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, obj2);
            }
            for (Map.Entry entry2 : mapB.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(obj3, entry2.getValue());
                }
            }
        }
        return new l(linkedHashMap, iC);
    }

    public /* synthetic */ n(v1 v1Var, G g8, int i8, AbstractC2633k abstractC2633k) {
        this(v1Var, (i8 & 2) != 0 ? null : g8);
    }
}
