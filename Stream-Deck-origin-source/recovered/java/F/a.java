package F;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0903w0;
import A.D0;
import A.T0;
import C6.m;
import D6.U;
import D6.r;
import D6.z;
import H.I;
import L.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0108a f2314b = new C0108a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f2315a;

    /* JADX INFO: renamed from: F.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0108a {
        public /* synthetic */ C0108a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0108a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2316a;

        static {
            int[] iArr = new int[E.b.values().length];
            try {
                iArr[E.b.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E.b.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E.b.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[E.b.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2316a = iArr;
        }
    }

    public a(I cameraInfoInternal) {
        t.g(cameraInfoInternal, "cameraInfoInternal");
        this.f2315a = cameraInfoInternal;
    }

    public static /* synthetic */ F.b c(a aVar, D0 d8, List list, int i8, List list2, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        if ((i9 & 8) != 0) {
            list2 = r.n();
        }
        return aVar.b(d8, list, i8, list2);
    }

    @Override // F.c
    public F.b a(D0 sessionConfig) {
        t.g(sessionConfig, "sessionConfig");
        List<T0> listK = sessionConfig.k();
        Set setH = sessionConfig.h();
        List listG = sessionConfig.g();
        if (setH.isEmpty() && listG.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (T0 t8 : listK) {
            if (D.c.f1671c.b(t8) == D.c.UNDEFINED) {
                return new F.b.c(t8);
            }
        }
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            F.b.d dVarD = d((C.b) it.next(), listK);
            if (dVarD != null) {
                return dVarD;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            F.b.d dVarD2 = d((C.b) obj, listK);
            if (dVarD2 != null) {
                AbstractC0890p0.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + dVarD2);
            } else {
                dVarD2 = null;
            }
            if (dVarD2 == null) {
                arrayList.add(obj);
            }
        }
        AbstractC0890p0.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }

    public final F.b b(D0 d8, List list, int i8, List list2) {
        if (i8 < list.size()) {
            int i9 = i8 + 1;
            F.b bVarB = b(d8, list, i9, z.C0(list2, list.get(i8)));
            return bVarB instanceof F.b.a ? bVarB : b(d8, list, i9, list2);
        }
        Set setI = U.i(d8.h(), list2);
        AbstractC0890p0.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setI + ", useCases = " + d8.k());
        return this.f2315a.n(new D.b(setI), d8) ? new F.b.a(new D.b(setI)) : F.b.C0109b.f2318a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    public final F.b.d d(C.b bVar, List list) {
        boolean z8;
        String string;
        boolean z9 = false;
        if (list != null && list.isEmpty()) {
            z8 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z8 = false;
                break;
            }
            if (((T0) it.next()) instanceof C0864c0) {
                z8 = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                T0 t8 = (T0) it2.next();
                if ((t8 instanceof C0903w0) || f.d0(t8)) {
                    z9 = true;
                    break;
                }
            }
        }
        int i8 = b.f2316a[bVar.c().ordinal()];
        if (i8 == 1) {
            string = D.c.IMAGE_CAPTURE.toString();
            if (z8) {
                string = null;
            }
        } else {
            if (i8 != 2 && i8 != 3 && i8 != 4) {
                throw new m();
            }
            string = D.c.PREVIEW + " or " + D.c.VIDEO_CAPTURE;
            if (z9) {
                string = null;
            }
        }
        if (string != null) {
            return new F.b.d(string, bVar);
        }
        return null;
    }
}
