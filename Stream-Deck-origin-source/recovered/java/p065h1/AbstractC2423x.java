package p065h1;

import D1.c;
import D6.z;
import Q0.h;
import Q6.k;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2251w;
import p056g1.F;
import p110m1.j;
import p110m1.l;
import p110m1.o;
import p110m1.q;
import p110m1.r;
import p110m1.w;

/* JADX INFO: renamed from: h1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2423x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f24365a = new h(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f24366b;

    /* JADX INFO: renamed from: h1.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24367a = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            boolean z8;
            p110m1.k kVarG = f8.G();
            if (kVarG != null) {
                z8 = kVarG.E() && kVarG.o(j.f29521a.w());
            }
            return Boolean.valueOf(z8);
        }
    }

    public static final boolean A(o oVar) {
        return oVar.v().E() || oVar.v().s();
    }

    public static final boolean B(o oVar) {
        return (oVar.y() || oVar.v().o(r.f29573a.l())) ? false : true;
    }

    public static final boolean C(o oVar, p110m1.k kVar) {
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            if (!oVar.m().o((w) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final View D(P p8, int i8) {
        Object next;
        Iterator<T> it = p8.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((F) ((Map.Entry) next).getKey()).o0() != i8);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (c) entry.getValue();
        }
        return null;
    }

    public static final String E(int i8) {
        m1.h.a aVar = p110m1.h.f29507b;
        if (p110m1.h.k(i8, aVar.a())) {
            return "android.widget.Button";
        }
        if (p110m1.h.k(i8, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (p110m1.h.k(i8, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (p110m1.h.k(i8, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (p110m1.h.k(i8, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final boolean o(p110m1.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof p110m1.a)) {
            return false;
        }
        p110m1.a aVar2 = (p110m1.a) obj;
        if (!t.c(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    public static final boolean p(o oVar) {
        return l.a(oVar.m(), r.f29573a.d()) == null;
    }

    public static final boolean q(o oVar) {
        if (oVar.v().o(j.f29521a.w()) && !t.c(l.a(oVar.v(), r.f29573a.g()), Boolean.TRUE)) {
            return true;
        }
        F fS = s(oVar.p(), a.f24367a);
        if (fS != null) {
            p110m1.k kVarG = fS.G();
            if (!(kVarG != null ? t.c(l.a(kVarG, r.f29573a.g()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    public static final E0 r(List list, int i8) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((E0) list.get(i9)).d() == i8) {
                return (E0) list.get(i9);
            }
        }
        return null;
    }

    public static final F s(F f8, k kVar) {
        for (F fM0 = f8.m0(); fM0 != null; fM0 = fM0.m0()) {
            if (((Boolean) kVar.invoke(fM0)).booleanValue()) {
                return fM0;
            }
        }
        return null;
    }

    public static final Map t(q qVar) {
        o oVarA = qVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (oVarA.p().f() && oVarA.p().I0()) {
            h hVarI = oVarA.i();
            u(new Region(S6.c.d(hVarI.i()), S6.c.d(hVarI.l()), S6.c.d(hVarI.j()), S6.c.d(hVarI.e())), oVarA, linkedHashMap, oVarA, new Region());
        }
        return linkedHashMap;
    }

    public static final void u(Region region, o oVar, Map map, o oVar2, Region region2) {
        InterfaceC2251w interfaceC2251wO;
        boolean z8 = (oVar2.p().f() && oVar2.p().I0()) ? false : true;
        if (!region.isEmpty() || oVar2.n() == oVar.n()) {
            if (!z8 || oVar2.w()) {
                h hVarU = oVar2.u();
                int iD = S6.c.d(hVarU.i());
                int iD2 = S6.c.d(hVarU.l());
                int iD3 = S6.c.d(hVarU.j());
                int iD4 = S6.c.d(hVarU.e());
                region2.set(iD, iD2, iD3, iD4);
                int iN = oVar2.n() == oVar.n() ? -1 : oVar2.n();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (oVar2.w()) {
                        o oVarQ = oVar2.q();
                        h hVarI = (oVarQ == null || (interfaceC2251wO = oVarQ.o()) == null || !interfaceC2251wO.f()) ? f24365a : oVarQ.i();
                        map.put(Integer.valueOf(iN), new F0(oVar2, new Rect(S6.c.d(hVarI.i()), S6.c.d(hVarI.l()), S6.c.d(hVarI.j()), S6.c.d(hVarI.e()))));
                        return;
                    } else {
                        if (iN == -1) {
                            map.put(Integer.valueOf(iN), new F0(oVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                map.put(Integer.valueOf(iN), new F0(oVar2, region2.getBounds()));
                List listS = oVar2.s();
                for (int size = listS.size() - 1; -1 < size; size--) {
                    u(region, oVar, map, (o) listS.get(size), region2);
                }
                if (A(oVar2)) {
                    region.op(iD, iD2, iD3, iD4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final boolean v() {
        return f24366b;
    }

    public static final String w(o oVar) {
        List list = (List) l.a(oVar.v(), r.f29573a.c());
        if (list != null) {
            return (String) z.k0(list);
        }
        return null;
    }

    public static final String x(o oVar) {
        List list = (List) l.a(oVar.v(), r.f29573a.z());
        if (list != null) {
            return C1.a.d(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public static final boolean y(o oVar) {
        return oVar.m().o(r.f29573a.r());
    }

    public static final boolean z(F f8, F f9) {
        F fM0 = f9.m0();
        if (fM0 == null) {
            return false;
        }
        return t.c(fM0, f8) || z(f8, fM0);
    }
}
