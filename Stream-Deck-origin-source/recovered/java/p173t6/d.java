package p173t6;

import D6.r;
import D6.z;
import G6.g;
import Q6.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p115m6.AbstractC2694d;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private volatile /* synthetic */ Object _interceptors;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2692b f34281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f34283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f34286f;

    public d(h... phases) {
        t.g(phases, "phases");
        this.f34281a = AbstractC2694d.a(true);
        this.f34283c = r.t(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    public final List b() {
        int iP;
        int i8 = this.f34284d;
        if (i8 == 0) {
            m(r.n());
            return r.n();
        }
        List list = this.f34283c;
        int i9 = 0;
        if (i8 == 1 && (iP = r.p(list)) >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i10);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && !cVar.h()) {
                    List listI = cVar.i();
                    p(cVar);
                    return listI;
                }
                if (i10 == iP) {
                    break;
                }
                i10++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int iP2 = r.p(list);
        if (iP2 >= 0) {
            while (true) {
                Object obj2 = list.get(i9);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i9 == iP2) {
                    break;
                }
                i9++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    public final e c(Object obj, Object obj2, g gVar) {
        return f.a(obj, q(), obj2, gVar, g());
    }

    public final Object d(Object obj, Object obj2, G6.d dVar) {
        return c(obj, obj2, dVar.getContext()).a(obj2, dVar);
    }

    public final c e(h hVar) {
        List list = this.f34283c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar) {
                c cVar = new c(hVar, i.c.f34292a);
                list.set(i8, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.e() == hVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final int f(h hVar) {
        List list = this.f34283c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar || ((obj instanceof c) && ((c) obj).e() == hVar)) {
                return i8;
            }
        }
        return -1;
    }

    public boolean g() {
        return this.f34282b;
    }

    public final List h() {
        return (List) this._interceptors;
    }

    public final boolean i(h hVar) {
        List list = this.f34283c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj == hVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).e() == hVar) {
                return true;
            }
        }
        return false;
    }

    public final void j(h reference, h phase) throws b {
        i iVarF;
        h hVarA;
        t.g(reference, "reference");
        t.g(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF == -1) {
            throw new b("Phase " + reference + " was not registered for this pipeline");
        }
        int i8 = iF + 1;
        int iP = r.p(this.f34283c);
        if (i8 <= iP) {
            while (true) {
                Object obj = this.f34283c.get(i8);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (iVarF = cVar.f()) != null) {
                    i.a aVar = iVarF instanceof i.a ? (i.a) iVarF : null;
                    if (aVar != null && (hVarA = aVar.a()) != null && t.c(hVarA, reference)) {
                        iF = i8;
                    }
                    if (i8 == iP) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f34283c.add(iF + 1, new c(phase, new i.a(reference)));
    }

    public final void k(h reference, h phase) throws b {
        t.g(reference, "reference");
        t.g(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF != -1) {
            this.f34283c.add(iF, new c(phase, new i.b(reference)));
            return;
        }
        throw new b("Phase " + reference + " was not registered for this pipeline");
    }

    public final void l(h phase, p block) {
        t.g(phase, "phase");
        t.g(block, "block");
        c cVarE = e(phase);
        if (cVarE == null) {
            throw new b("Phase " + phase + " was not registered for this pipeline");
        }
        if (r(phase, block)) {
            this.f34284d++;
            return;
        }
        cVarE.a(block);
        this.f34284d++;
        n();
        a();
    }

    public final void m(List list) {
        o(list);
        this.f34285e = false;
        this.f34286f = null;
    }

    public final void n() {
        o(null);
        this.f34285e = false;
        this.f34286f = null;
    }

    public final void o(List list) {
        this._interceptors = list;
    }

    public final void p(c cVar) {
        o(cVar.i());
        this.f34285e = false;
        this.f34286f = cVar.e();
    }

    public final List q() {
        if (h() == null) {
            b();
        }
        this.f34285e = true;
        List listH = h();
        t.d(listH);
        return listH;
    }

    public final boolean r(h hVar, p pVar) {
        List listH = h();
        if (this.f34283c.isEmpty() || listH == null || this.f34285e || !P.l(listH)) {
            return false;
        }
        if (t.c(this.f34286f, hVar)) {
            listH.add(pVar);
            return true;
        }
        if (!t.c(hVar, z.t0(this.f34283c)) && f(hVar) != r.p(this.f34283c)) {
            return false;
        }
        c cVarE = e(hVar);
        t.d(cVarE);
        cVarE.a(pVar);
        listH.add(pVar);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(h phase, List<? extends p> interceptors) {
        this(phase);
        t.g(phase, "phase");
        t.g(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            l(phase, (p) it.next());
        }
    }

    public void a() {
    }
}
