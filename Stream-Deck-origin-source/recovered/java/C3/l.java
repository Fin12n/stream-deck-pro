package C3;

import A3.n;
import C6.G;
import D6.C0937q;
import D6.C0938s;
import D6.r;
import D6.z;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.M;
import p044e7.O;
import p044e7.x;
import p090k.zI.jULK;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f1375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f1376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f1377e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f1383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f1384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f1385e;

        public b() {
            this(false, null, null, null, false, 31, null);
        }

        public final List a() {
            return this.f1384d;
        }

        public final List b() {
            return this.f1383c;
        }

        public final boolean c() {
            return this.f1385e;
        }

        public final String d() {
            return this.f1382b;
        }

        public final boolean e() {
            return this.f1381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1381a == bVar.f1381a && t.c(this.f1382b, bVar.f1382b) && t.c(this.f1383c, bVar.f1383c) && t.c(this.f1384d, bVar.f1384d) && this.f1385e == bVar.f1385e;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f1381a) * 31;
            String str = this.f1382b;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f1383c.hashCode()) * 31) + this.f1384d.hashCode()) * 31) + Boolean.hashCode(this.f1385e);
        }

        public b(boolean z8, String str, List<a> defaultItems, List<a> customItems, boolean z9) {
            t.g(defaultItems, "defaultItems");
            t.g(customItems, "customItems");
            this.f1381a = z8;
            this.f1382b = str;
            this.f1383c = defaultItems;
            this.f1384d = customItems;
            this.f1385e = z9;
        }

        public String toString() {
            return "ViewState(isEditing=" + this.f1381a + ", selectedFaceplateName=" + this.f1382b + ", defaultItems=" + this.f1383c + ", customItems=" + this.f1384d + ", hasCustomFaceplates=" + this.f1385e + jULK.zXo;
        }

        public /* synthetic */ b(boolean z8, String str, List list, List list2, boolean z9, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? r.n() : list, (i8 & 8) != 0 ? r.n() : list2, (i8 & 16) != 0 ? false : z9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f1388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f1389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ boolean f1390e;

        public c(G6.d dVar) {
            super(5, dVar);
        }

        public static final List h(C3.b bVar, boolean z8, List list, boolean z9) {
            ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3.b bVar2 = (C3.b) it.next();
                arrayList.add(new a(bVar2, l(bVar, z8, bVar2), z9));
            }
            return arrayList;
        }

        public static /* synthetic */ List k(C3.b bVar, boolean z8, List list, boolean z9, int i8, Object obj) {
            if ((i8 & 8) != 0) {
                z9 = false;
            }
            return h(bVar, z8, list, z9);
        }

        public static final d l(C3.b bVar, boolean z8, C3.b bVar2) {
            if (t.c(bVar2.b(), bVar.b())) {
                return d.SELECTED;
            }
            return (z8 || (bVar2 instanceof C3.b.h)) ? d.UNLOCKED : d.LOCKED;
        }

        public final Object g(C3.b bVar, List list, boolean z8, boolean z9, G6.d dVar) {
            c cVar = new c(dVar);
            cVar.f1387b = bVar;
            cVar.f1388c = list;
            cVar.f1389d = z8;
            cVar.f1390e = z9;
            return cVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            String strD;
            Object next;
            C3.b bVarA;
            H6.c.f();
            if (this.f1386a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            C3.b bVar = (C3.b) this.f1387b;
            List list = (List) this.f1388c;
            boolean z8 = this.f1389d;
            boolean z9 = this.f1390e;
            List listK = k(bVar, z8, C3.b.f1260f.b(), false, 8, null);
            Iterator it = listK.iterator();
            do {
                strD = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((a) next).b() != d.SELECTED);
            a aVar = (a) next;
            if (aVar != null && (bVarA = aVar.a()) != null) {
                strD = e.d(bVarA);
            }
            return new b(z9, strD, listK, z.B0(C0937q.e(new a(null, z8 ? d.UNLOCKED : d.LOCKED, false, 4, null)), h(bVar, z8, list, z9)), !list.isEmpty());
        }

        @Override // Q6.r
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return g((C3.b) obj, (List) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (G6.d) obj5);
        }
    }

    public l(f faceplateManager, J coroutineScope, n purchaseService) {
        t.g(faceplateManager, "faceplateManager");
        t.g(coroutineScope, "coroutineScope");
        t.g(purchaseService, "purchaseService");
        this.f1373a = faceplateManager;
        this.f1374b = purchaseService;
        Boolean bool = Boolean.FALSE;
        x xVarA = O.a(bool);
        this.f1375c = xVarA;
        this.f1376d = l1.e(bool, null, 2, null);
        this.f1377e = AbstractC2262h.T(AbstractC2262h.m(faceplateManager.j(), faceplateManager.i(), purchaseService.d(), xVarA, new c(null)), coroutineScope, H.a.b(H.f20929a, 0L, 0L, 3, null), new b(false, null, null, null, false, 31, null));
    }

    public final void a(Uri imageUri, int i8) {
        t.g(imageUri, "imageUri");
        this.f1373a.f(imageUri, i8);
    }

    public final void b(C3.b.e eVar) {
        this.f1373a.g(eVar);
        if (((List) this.f1373a.i().getValue()).isEmpty()) {
            this.f1375c.setValue(Boolean.FALSE);
        }
    }

    public final f c() {
        return this.f1373a;
    }

    public final M d() {
        return this.f1377e;
    }

    public final boolean e(C3.b bVar) {
        return g() || (bVar instanceof C3.b.h);
    }

    public final InterfaceC3164l0 f() {
        return this.f1376d;
    }

    public final boolean g() {
        return this.f1374b.c();
    }

    public final void h(C3.b bVar) {
        if (e(bVar)) {
            if (bVar == null) {
                if (g()) {
                    this.f1376d.setValue(Boolean.TRUE);
                }
            } else if (((Boolean) this.f1375c.getValue()).booleanValue() && (bVar instanceof C3.b.e)) {
                b((C3.b.e) bVar);
            } else {
                this.f1373a.k(bVar);
            }
        }
    }

    public final void i() {
        if (g()) {
            x xVar = this.f1375c;
            xVar.setValue(Boolean.valueOf(!((Boolean) xVar.getValue()).booleanValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3.b f1378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f1379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f1380c;

        public a(C3.b bVar, d state, boolean z8) {
            t.g(state, "state");
            this.f1378a = bVar;
            this.f1379b = state;
            this.f1380c = z8;
        }

        public final C3.b a() {
            return this.f1378a;
        }

        public final d b() {
            return this.f1379b;
        }

        public final boolean c() {
            return this.f1380c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f1378a, aVar.f1378a) && this.f1379b == aVar.f1379b && this.f1380c == aVar.f1380c;
        }

        public int hashCode() {
            C3.b bVar = this.f1378a;
            return ((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f1379b.hashCode()) * 31) + Boolean.hashCode(this.f1380c);
        }

        public String toString() {
            return "FaceplateItem(faceplate=" + this.f1378a + ", state=" + this.f1379b + ", isEditing=" + this.f1380c + ")";
        }

        public /* synthetic */ a(C3.b bVar, d dVar, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this(bVar, dVar, (i8 & 4) != 0 ? false : z8);
        }
    }
}
