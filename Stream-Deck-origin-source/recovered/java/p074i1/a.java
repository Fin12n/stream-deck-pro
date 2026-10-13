package p074i1;

import D6.r;
import D6.z;
import Q0.f;
import Q0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p110m1.c;
import p110m1.k;
import p110m1.l;
import p110m1.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0567a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0567a f24578a = new C0567a();

        public C0567a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24579a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(List list) {
        List listN;
        long jX;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listN = r.n();
        } else {
            listN = new ArrayList();
            Object obj = list.get(0);
            int iP = r.p(list);
            int i8 = 0;
            while (i8 < iP) {
                i8++;
                Object obj2 = list.get(i8);
                o oVar = (o) obj2;
                o oVar2 = (o) obj;
                listN.add(f.d(g.a(Math.abs(f.o(oVar2.i().g()) - f.o(oVar.i().g())), Math.abs(f.p(oVar2.i().g()) - f.p(oVar.i().g())))));
                obj = obj2;
            }
        }
        if (listN.size() == 1) {
            jX = ((f) z.i0(listN)).x();
        } else {
            if (listN.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objI0 = z.i0(listN);
            int iP2 = r.p(listN);
            if (1 <= iP2) {
                int i9 = 1;
                while (true) {
                    objI0 = f.d(f.t(((f) objI0).x(), ((f) listN.get(i9)).x()));
                    if (i9 == iP2) {
                        break;
                    }
                    i9++;
                }
            }
            jX = ((f) objI0).x();
        }
        return f.f(jX) < f.e(jX);
    }

    public static final boolean b(o oVar) {
        k kVarM = oVar.m();
        p110m1.r rVar = p110m1.r.f29573a;
        return (l.a(kVarM, rVar.a()) == null && l.a(oVar.m(), rVar.v()) == null) ? false : true;
    }

    public static final boolean c(p110m1.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(o oVar, V1.l lVar) {
        k kVarM = oVar.m();
        p110m1.r rVar = p110m1.r.f29573a;
        p110m1.b bVar = (p110m1.b) l.a(kVarM, rVar.a());
        if (bVar != null) {
            lVar.Z(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (l.a(oVar.m(), rVar.v()) != null) {
            List listS = oVar.s();
            int size = listS.size();
            for (int i8 = 0; i8 < size; i8++) {
                o oVar2 = (o) listS.get(i8);
                if (oVar2.m().o(p110m1.r.f29573a.w())) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        lVar.Z(V1.l.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(o oVar, V1.l lVar) {
        k kVarM = oVar.m();
        p110m1.r rVar = p110m1.r.f29573a;
        c cVar = (c) l.a(kVarM, rVar.b());
        if (cVar != null) {
            lVar.a0(g(cVar, oVar));
        }
        o oVarQ = oVar.q();
        if (oVarQ == null || l.a(oVarQ.m(), rVar.v()) == null) {
            return;
        }
        p110m1.b bVar = (p110m1.b) l.a(oVarQ.m(), rVar.a());
        if ((bVar == null || !c(bVar)) && oVar.m().o(rVar.w())) {
            ArrayList arrayList = new ArrayList();
            List listS = oVarQ.s();
            int size = listS.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                o oVar2 = (o) listS.get(i9);
                if (oVar2.m().o(p110m1.r.f29573a.w())) {
                    arrayList.add(oVar2);
                    if (oVar2.p().n0() < oVar.p().n0()) {
                        i8++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            V1.l.f fVarA = V1.l.f.a(zA ? 0 : i8, 1, zA ? i8 : 0, 1, false, ((Boolean) oVar.m().y(p110m1.r.f29573a.w(), C0567a.f24578a)).booleanValue());
            if (fVarA != null) {
                lVar.a0(fVarA);
            }
        }
    }

    public static final V1.l.e f(p110m1.b bVar) {
        return V1.l.e.a(bVar.b(), bVar.a(), false, 0);
    }

    public static final V1.l.f g(c cVar, o oVar) {
        return V1.l.f.a(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) oVar.m().y(p110m1.r.f29573a.w(), b.f24579a)).booleanValue());
    }
}
