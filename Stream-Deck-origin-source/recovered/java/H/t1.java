package H;

import A.AbstractC0890p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3200b = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a(b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f3201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u1 f3202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g1 f3203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f3204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3205e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3206f = false;

        public b(c1 c1Var, u1 u1Var, g1 g1Var, List list) {
            this.f3201a = c1Var;
            this.f3202b = u1Var;
            this.f3203c = g1Var;
            this.f3204d = list;
        }

        public boolean a() {
            return this.f3206f;
        }

        public boolean b() {
            return this.f3205e;
        }

        public List c() {
            return this.f3204d;
        }

        public c1 d() {
            return this.f3201a;
        }

        public g1 e() {
            return this.f3203c;
        }

        public u1 f() {
            return this.f3202b;
        }

        public void g(boolean z8) {
            this.f3206f = z8;
        }

        public void h(boolean z8) {
            this.f3205e = z8;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f3201a + ", mUseCaseConfig=" + this.f3202b + ", mStreamSpec=" + this.f3203c + ", mCaptureTypes=" + this.f3204d + ", mAttached=" + this.f3205e + ", mActive=" + this.f3206f + '}';
        }
    }

    public t1(String str) {
        this.f3199a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    public c1.h e() {
        c1.h hVar = new c1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3200b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                hVar.b(bVar.d());
                arrayList.add(str);
            }
        }
        AbstractC0890p0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f3199a);
        return hVar;
    }

    public Collection f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: H.r1
            @Override // H.t1.a
            public final boolean a(t1.b bVar) {
                return t1.a(bVar);
            }
        }));
    }

    public c1.h g() {
        c1.h hVar = new c1.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3200b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC0890p0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f3199a);
        return hVar;
    }

    public Collection h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: H.p1
            @Override // H.t1.a
            public final boolean a(t1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: H.q1
            @Override // H.t1.a
            public final boolean a(t1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: H.s1
            @Override // H.t1.a
            public final boolean a(t1.b bVar) {
                return bVar.b();
            }
        }));
    }

    public final b k(String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        b bVar = (b) this.f3200b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(c1Var, u1Var, g1Var, list);
        this.f3200b.put(str, bVar2);
        return bVar2;
    }

    public final Collection l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3200b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).d());
            }
        }
        return arrayList;
    }

    public final Collection m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3200b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).f());
            }
        }
        return arrayList;
    }

    public final Collection n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3200b.entrySet()) {
            if (aVar == null || aVar.a((b) entry.getValue())) {
                arrayList.add((b) entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean o(String str) {
        if (this.f3200b.containsKey(str)) {
            return ((b) this.f3200b.get(str)).b();
        }
        return false;
    }

    public void p(String str) {
        this.f3200b.remove(str);
    }

    public void q(String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        k(str, c1Var, u1Var, g1Var, list).g(true);
    }

    public void r(String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        k(str, c1Var, u1Var, g1Var, list).h(true);
        u(str, c1Var, u1Var, g1Var, list);
    }

    public void s(String str) {
        if (this.f3200b.containsKey(str)) {
            b bVar = (b) this.f3200b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f3200b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f3200b.containsKey(str)) {
            b bVar = (b) this.f3200b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f3200b.remove(str);
        }
    }

    public void u(String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        if (this.f3200b.containsKey(str)) {
            b bVar = new b(c1Var, u1Var, g1Var, list);
            b bVar2 = (b) this.f3200b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f3200b.put(str, bVar);
        }
    }
}
