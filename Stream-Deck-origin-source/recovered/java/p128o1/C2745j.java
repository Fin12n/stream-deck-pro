package p128o1;

import A1.d;
import C6.InterfaceC0916e;
import C6.j;
import C6.k;
import C6.l;
import D6.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p168t1.AbstractC3006k;
import p168t1.AbstractC3009n;
import p168t1.InterfaceC3008m;

/* JADX INFO: renamed from: o1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2745j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f30822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f30823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f30825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f30826e;

    /* JADX INFO: renamed from: o1.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            q qVarB;
            List listE = C2745j.this.e();
            if (listE.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listE.get(0);
                float fH = ((p) obj2).b().h();
                int iP = r.p(listE);
                int i8 = 1;
                if (1 <= iP) {
                    while (true) {
                        Object obj3 = listE.get(i8);
                        float fH2 = ((p) obj3).b().h();
                        if (Float.compare(fH, fH2) < 0) {
                            obj2 = obj3;
                            fH = fH2;
                        }
                        if (i8 == iP) {
                            break;
                        }
                        i8++;
                    }
                }
                obj = obj2;
            }
            p pVar = (p) obj;
            return Float.valueOf((pVar == null || (qVarB = pVar.b()) == null) ? 0.0f : qVarB.h());
        }
    }

    /* JADX INFO: renamed from: o1.j$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            q qVarB;
            List listE = C2745j.this.e();
            if (listE.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listE.get(0);
                float fC = ((p) obj2).b().c();
                int iP = r.p(listE);
                int i8 = 1;
                if (1 <= iP) {
                    while (true) {
                        Object obj3 = listE.get(i8);
                        float fC2 = ((p) obj3).b().c();
                        if (Float.compare(fC, fC2) < 0) {
                            obj2 = obj3;
                            fC = fC2;
                        }
                        if (i8 == iP) {
                            break;
                        }
                        i8++;
                    }
                }
                obj = obj2;
            }
            p pVar = (p) obj;
            return Float.valueOf((pVar == null || (qVarB = pVar.b()) == null) ? 0.0f : qVarB.c());
        }
    }

    public C2745j(C2739d c2739d, I i8, List<C2739d.b> list, d dVar, AbstractC3009n.b bVar) {
        this.f30822a = c2739d;
        this.f30823b = list;
        l lVar = l.NONE;
        this.f30824c = k.a(lVar, new b());
        this.f30825d = k.a(lVar, new a());
        t tVarL = i8.L();
        List listM = AbstractC2740e.m(c2739d, tVarL);
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        for (int i9 = 0; i9 < size; i9++) {
            C2739d.b bVar2 = (C2739d.b) listM.get(i9);
            C2739d c2739dN = AbstractC2740e.n(c2739d, bVar2.f(), bVar2.d());
            arrayList.add(new p(r.a(c2739dN.i(), i8.H(g((t) bVar2.e(), tVarL)), c2739dN.f(), AbstractC2746k.b(f(), bVar2.f(), bVar2.d()), dVar, bVar), bVar2.f(), bVar2.d()));
        }
        this.f30826e = arrayList;
    }

    @Override // p128o1.q
    public boolean a() {
        List list = this.f30826e;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((p) list.get(i8)).b().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p128o1.q
    public float c() {
        return ((Number) this.f30824c.getValue()).floatValue();
    }

    public final C2739d d() {
        return this.f30822a;
    }

    public final List e() {
        return this.f30826e;
    }

    public final List f() {
        return this.f30823b;
    }

    public final t g(t tVar, t tVar2) {
        return !p216z1.l.j(tVar.i(), p216z1.l.f39024b.f()) ? tVar : t.b(tVar, 0, tVar2.i(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // p128o1.q
    public float h() {
        return ((Number) this.f30825d.getValue()).floatValue();
    }

    @InterfaceC0916e
    public C2745j(C2739d c2739d, I i8, List<C2739d.b> list, d dVar, InterfaceC3008m.a aVar) {
        this(c2739d, i8, list, dVar, AbstractC3006k.a(aVar));
    }
}
