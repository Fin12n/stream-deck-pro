package A5;

import D6.M;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f816c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f817d = new c(A5.b.d(), M.g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f819b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set f825f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f827h;

        public /* synthetic */ a(String str, c cVar, a aVar, AbstractC2633k abstractC2633k) {
            this(str, cVar, aVar);
        }

        public static /* synthetic */ boolean f(a aVar, m mVar, boolean z8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return aVar.e(mVar, z8);
        }

        public static /* synthetic */ void o(a aVar, m mVar, boolean z8, int i8, Object obj) throws f {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            aVar.n(mVar, z8);
        }

        public static /* synthetic */ void q(a aVar, String str, boolean z8, Q6.k kVar, int i8, Object obj) throws q {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            aVar.p(str, z8, kVar);
        }

        public final void a(m mVar) throws q {
            if (j().containsKey(mVar)) {
                h().add(mVar);
                return;
            }
            throw new q("Key `" + mVar + "` is not registered.", null, 2, null);
        }

        public final F5.j b(F5.j jVar, m key) throws q {
            t.g(jVar, "<this>");
            t.g(key, "key");
            c(jVar.getKey(), key);
            return jVar;
        }

        public final void c(m targetKey, m newKey) throws q {
            t.g(targetKey, "targetKey");
            t.g(newKey, "newKey");
            m(new F5.a(targetKey, newKey));
        }

        public final c d() {
            AbstractC2633k abstractC2633k = null;
            if (this.f824e == null) {
                return j.d(this.f821b.i(), this.f820a) ? this.f821b : new c(this.f820a, this.f821b.f819b, abstractC2633k);
            }
            Map map = this.f826g;
            if (map != null) {
                Map mapJ = j();
                for (Map.Entry entry : map.entrySet()) {
                    mapJ.put(entry.getKey(), new F5.g((m) entry.getKey(), ((a) entry.getValue()).d()));
                }
            }
            this.f826g = null;
            Set set = this.f825f;
            if (set != null) {
                if (set.isEmpty()) {
                    set = null;
                }
                if (set != null) {
                    j().put(A5.b.e(), new F5.g(A5.b.e(), set));
                }
            }
            this.f825f = null;
            c cVar = new c(this.f820a, j(), abstractC2633k);
            this.f824e = null;
            this.f821b = cVar;
            return cVar;
        }

        public final boolean e(m key, boolean z8) {
            a aVar;
            t.g(key, "key");
            Map map = this.f824e;
            boolean zContainsKey = map != null ? map.containsKey(key) : this.f821b.c(key);
            if (z8) {
                return zContainsKey || ((aVar = this.f822c) != null && f(aVar, key, false, 2, null));
            }
            return zContainsKey;
        }

        public final Set h() {
            Set set = this.f825f;
            Set set2 = set;
            if (set == null) {
                HashSet hashSet = new HashSet();
                F5.j jVar = (F5.j) j().remove(A5.b.e());
                F5.g gVar = jVar instanceof F5.g ? (F5.g) jVar : null;
                if (gVar != null) {
                    hashSet.addAll((Collection) gVar.i());
                }
                this.f825f = hashSet;
                set2 = hashSet;
            }
            return set2;
        }

        public final a i(m mVar) {
            Map mapL = l();
            Object obj = mapL.get(mVar);
            if (obj == null) {
                Object objRemove = j().remove(mVar);
                AbstractC2633k abstractC2633k = null;
                F5.g gVar = objRemove instanceof F5.g ? (F5.g) objRemove : null;
                Object objI = gVar != null ? gVar.i() : null;
                c cVarA = objI instanceof c ? (c) objI : null;
                if (cVarA == null) {
                    cVarA = c.f816c.a();
                }
                a aVar = new a(k(mVar), cVarA, this, abstractC2633k);
                mapL.put(mVar, aVar);
                obj = aVar;
            }
            return (a) obj;
        }

        public final Map j() {
            Map map = this.f824e;
            if (map != null) {
                return map;
            }
            HashMap map2 = new HashMap(this.f821b.f819b);
            this.f824e = map2;
            return map2;
        }

        public final String k(m mVar) {
            String strMo13getQualifieribIqLKo = mVar.mo13getQualifieribIqLKo();
            j jVarA = strMo13getQualifieribIqLKo != null ? j.a(strMo13getQualifieribIqLKo) : null;
            if (jVarA != null) {
                return jVarA.g();
            }
            throw new IllegalStateException("BUG! qualifier for subcomponent key must not be null");
        }

        public final Map l() {
            Map map = this.f826g;
            if (map != null) {
                return map;
            }
            HashMap map2 = new HashMap();
            this.f826g = map2;
            return map2;
        }

        public final F5.j m(F5.j service) throws q {
            t.g(service, "service");
            m key = service.getKey();
            if (!j().containsKey(key) || this.f827h) {
                j().put(key, service);
                return service;
            }
            throw new q("Entry with key `" + key + "` already exists.", null, 2, null);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        public final void n(m key, boolean z8) throws f {
            boolean z9;
            t.g(key, "key");
            if (j().remove(key) != null) {
                z9 = true;
            } else {
                Map map = this.f826g;
                if ((map != null ? (a) P.d(map).remove(key) : null) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (z8 || z9) {
                P.a(h()).remove(key);
                return;
            }
            throw new f(key, "Entry with key `" + key + "` doesn't exist.");
        }

        public final void p(String qualifier, boolean z8, Q6.k block) throws q {
            t.g(qualifier, "qualifier");
            t.g(block, "block");
            AbstractC2633k abstractC2633k = null;
            if (this.f827h && z8) {
                throw new q("You can either override existing or derive existing but not both.", null, 2, null);
            }
            A5.a aVar = new A5.a(c.class, false, qualifier, abstractC2633k);
            boolean z9 = j().containsKey(aVar) || l().containsKey(aVar);
            if (!z9 || this.f827h || z8) {
                if (z9 && this.f827h) {
                    o(this, aVar, false, 2, null);
                }
                block.invoke(i(aVar));
                return;
            }
            throw new q("Subcomponent with qualifier `" + j.f(qualifier) + "` already exists.", null, 2, null);
        }

        public a(String qualifier, c base, a aVar) {
            t.g(qualifier, "qualifier");
            t.g(base, "base");
            this.f820a = qualifier;
            this.f821b = base;
            this.f822c = aVar;
            if (aVar != null) {
                t.d(aVar);
                while (true) {
                    a aVar2 = aVar.f822c;
                    if (aVar2 == null) {
                        break;
                    }
                    t.d(aVar2);
                    aVar = aVar2;
                }
            } else {
                aVar = this;
            }
            this.f823d = aVar;
        }

        public final F5.i g(F5.i iVar) throws q {
            t.g(iVar, RaiWHuj.RByA);
            a(iVar.getKey());
            return iVar;
        }

        public /* synthetic */ a(String str, c cVar, a aVar, int i8, AbstractC2633k abstractC2633k) {
            this(str, (i8 & 2) != 0 ? c.f816c.a() : cVar, (i8 & 4) != 0 ? null : aVar, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a() {
            return c.f817d;
        }

        public b() {
        }
    }

    public /* synthetic */ c(String str, Map map, AbstractC2633k abstractC2633k) {
        this(str, map);
    }

    public static /* synthetic */ h e(c cVar, p pVar, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            pVar = o.f855d;
        }
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        return cVar.d(pVar, kVar);
    }

    public static /* synthetic */ c g(c cVar, String str, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = cVar.f818a;
        }
        return cVar.f(str, kVar);
    }

    public final boolean c(m typeKey) {
        t.g(typeKey, "typeKey");
        return this.f819b.containsKey(typeKey);
    }

    public final h d(p application, Q6.k kVar) {
        t.g(application, "application");
        return new h(application, null, this, null, kVar);
    }

    public final c f(String qualifier, Q6.k block) {
        t.g(qualifier, "qualifier");
        t.g(block, "block");
        a aVar = new a(qualifier, this, null, 4, null);
        block.invoke(aVar);
        return aVar.d();
    }

    public final F5.j h(m key) {
        t.g(key, "key");
        return (F5.j) this.f819b.get(key);
    }

    public final String i() {
        return this.f818a;
    }

    public final Set j() {
        return this.f819b.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c k(String qualifier) throws f {
        t.g(qualifier, "qualifier");
        A5.a aVar = new A5.a(c.class, false, qualifier, 0 == true ? 1 : 0);
        Object obj = this.f819b.get(aVar);
        F5.g gVar = obj instanceof F5.g ? (F5.g) obj : null;
        if (gVar != null) {
            Object objI = gVar.i();
            t.e(objI, "null cannot be cast to non-null type io.jentz.winter.Component");
            return (c) objI;
        }
        throw new f(aVar, "Subcomponent `" + j.f(qualifier) + "` doesn't exist.");
    }

    public c(String str, Map map) {
        this.f818a = str;
        this.f819b = map;
    }
}
