package p193w2;

import A2.j;
import D6.M;
import D6.T;
import Q6.k;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f36836o = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile A2.g f36837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f36838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f36839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A2.h f36840d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f36844h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p193w2.c f36847k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f36849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f36850n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.room.c f36841e = g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f36845i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ReentrantReadWriteLock f36846j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ThreadLocal f36848l = new ThreadLocal();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f36851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f36852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f36854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f36855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f36856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f36857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f36858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Executor f36859i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public A2.h.c f36860j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f36861k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public d f36862l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Intent f36863m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f36864n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f36865o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f36866p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public TimeUnit f36867q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final e f36868r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Set f36869s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Set f36870t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f36871u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public File f36872v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Callable f36873w;

        public a(Context context, Class<r> klass, String str) {
            t.g(context, "context");
            t.g(klass, "klass");
            this.f36851a = context;
            this.f36852b = klass;
            this.f36853c = str;
            this.f36854d = new ArrayList();
            this.f36856f = new ArrayList();
            this.f36857g = new ArrayList();
            this.f36862l = d.AUTOMATIC;
            this.f36864n = true;
            this.f36866p = -1L;
            this.f36868r = new e();
            this.f36869s = new LinkedHashSet();
        }

        public r a() {
            Executor executor = this.f36858h;
            if (executor == null && this.f36859i == null) {
                Executor executorF = p126o.c.f();
                this.f36859i = executorF;
                this.f36858h = executorF;
            } else if (executor != null && this.f36859i == null) {
                this.f36859i = executor;
            } else if (executor == null) {
                this.f36858h = this.f36859i;
            }
            Set set = this.f36870t;
            if (set != null) {
                t.d(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f36869s.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            A2.h.c wVar = this.f36860j;
            if (wVar == null) {
                wVar = new B2.f();
            }
            if (wVar != null) {
                if (this.f36866p > 0) {
                    if (this.f36853c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j8 = this.f36866p;
                    TimeUnit timeUnit = this.f36867q;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f36858h;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    wVar = new p193w2.e(wVar, new p193w2.c(j8, timeUnit, executor2));
                }
                String str = this.f36871u;
                if (str != null || this.f36872v != null || this.f36873w != null) {
                    if (this.f36853c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i8 = str == null ? 0 : 1;
                    File file = this.f36872v;
                    int i9 = file == null ? 0 : 1;
                    Callable callable = this.f36873w;
                    if (i8 + i9 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    wVar = new w(str, file, callable, wVar);
                }
            } else {
                wVar = null;
            }
            A2.h.c cVar = wVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f36851a;
            String str2 = this.f36853c;
            e eVar = this.f36868r;
            List list = this.f36854d;
            boolean z8 = this.f36861k;
            d dVarC = this.f36862l.c(context);
            Executor executor3 = this.f36858h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f36859i;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            p193w2.h hVar = new p193w2.h(context, str2, cVar, eVar, (List<? extends b>) list, z8, dVarC, executor3, executor4, this.f36863m, this.f36864n, this.f36865o, (Set<Integer>) this.f36869s, this.f36871u, this.f36872v, (Callable<InputStream>) this.f36873w, this.f36855e, (List<? extends Object>) this.f36856f, (List<Object>) this.f36857g);
            r rVar = (r) q.b(this.f36852b, "_Impl");
            rVar.t(hVar);
            return rVar;
        }

        public a b() {
            this.f36864n = false;
            this.f36865o = true;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public void a(A2.g db) {
            t.g(db, "db");
        }

        public void b(A2.g db) {
            t.g(db, "db");
        }

        public void c(A2.g gVar) {
            t.g(gVar, cFAYKUlMj.nlfBhWF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final boolean b(ActivityManager activityManager) {
            return A2.c.b(activityManager);
        }

        public final d c(Context context) {
            t.g(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f36878a = new LinkedHashMap();

        public final void a(p201x2.a aVar) {
            int i8 = aVar.f37192a;
            int i9 = aVar.f37193b;
            Map map = this.f36878a;
            Integer numValueOf = Integer.valueOf(i8);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i9))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i9)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i9), aVar);
        }

        public void b(p201x2.a... migrations) {
            t.g(migrations, "migrations");
            for (p201x2.a aVar : migrations) {
                a(aVar);
            }
        }

        public final boolean c(int i8, int i9) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i8))) {
                return false;
            }
            Map mapG = (Map) mapF.get(Integer.valueOf(i8));
            if (mapG == null) {
                mapG = M.g();
            }
            return mapG.containsKey(Integer.valueOf(i9));
        }

        public List d(int i8, int i9) {
            if (i8 == i9) {
                return D6.r.n();
            }
            return e(new ArrayList(), i9 > i8, i8, i9);
        }

        public final List e(List list, boolean z8, int i8, int i9) {
            boolean z9;
            do {
                if (z8) {
                    if (i8 >= i9) {
                        return list;
                    }
                } else if (i8 <= i9) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f36878a.get(Integer.valueOf(i8));
                if (treeMap != null) {
                    Iterator it = (z8 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z9 = false;
                            break;
                        }
                        Integer targetVersion = (Integer) it.next();
                        if (!z8) {
                            t.f(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i9 <= iIntValue && iIntValue < i8) {
                                Object obj = treeMap.get(targetVersion);
                                t.d(obj);
                                list.add(obj);
                                i8 = targetVersion.intValue();
                                z9 = true;
                                break;
                                break;
                            }
                        } else {
                            int i10 = i8 + 1;
                            t.f(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i10 <= iIntValue2 && iIntValue2 <= i9) {
                                Object obj2 = treeMap.get(targetVersion);
                                t.d(obj2);
                                list.add(obj2);
                                i8 = targetVersion.intValue();
                                z9 = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z9);
            return null;
        }

        public Map f() {
            return this.f36878a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {
        public void a(A2.g db) {
            t.g(db, "db");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {
        public g() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A2.g it) {
            t.g(it, "it");
            r.this.u();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {
        public h() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A2.g it) {
            t.g(it, "it");
            r.this.v();
            return null;
        }
    }

    public r() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        t.f(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f36849m = mapSynchronizedMap;
        this.f36850n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor A(r rVar, j jVar, CancellationSignal cancellationSignal, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i8 & 2) != 0) {
            cancellationSignal = null;
        }
        return rVar.z(jVar, cancellationSignal);
    }

    public void B() {
        n().M0().x0();
    }

    public final Object C(Class cls, A2.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof i) {
            return C(cls, ((i) hVar).b());
        }
        return null;
    }

    public void c() {
        if (!this.f36842f && x()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!s() && this.f36848l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        p193w2.c cVar = this.f36847k;
        if (cVar == null) {
            u();
        } else {
            cVar.g(new g());
        }
    }

    public A2.k f(String sql) {
        t.g(sql, "sql");
        c();
        d();
        return n().M0().V(sql);
    }

    public abstract androidx.room.c g();

    public abstract A2.h h(p193w2.h hVar);

    public void i() {
        p193w2.c cVar = this.f36847k;
        if (cVar == null) {
            v();
        } else {
            cVar.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        t.g(autoMigrationSpecs, "autoMigrationSpecs");
        return D6.r.n();
    }

    public final Map k() {
        return this.f36849m;
    }

    public final Lock l() {
        ReentrantReadWriteLock.ReadLock lock = this.f36846j.readLock();
        t.f(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c m() {
        return this.f36841e;
    }

    public A2.h n() {
        A2.h hVar = this.f36840d;
        if (hVar != null) {
            return hVar;
        }
        t.t("internalOpenHelper");
        return null;
    }

    public Executor o() {
        Executor executor = this.f36838b;
        if (executor != null) {
            return executor;
        }
        t.t("internalQueryExecutor");
        return null;
    }

    public Set p() {
        return T.d();
    }

    public Map q() {
        return M.g();
    }

    public Executor r() {
        Executor executor = this.f36839c;
        if (executor != null) {
            return executor;
        }
        t.t("internalTransactionExecutor");
        return null;
    }

    public boolean s() {
        return n().M0().w1();
    }

    public void t(p193w2.h configuration) {
        t.g(configuration, "configuration");
        this.f36840d = h(configuration);
        Set setP = p();
        BitSet bitSet = new BitSet();
        Iterator it = setP.iterator();
        while (true) {
            int i8 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f36823s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i9 = size - 1;
                        if (cls.isAssignableFrom(configuration.f36823s.get(size).getClass())) {
                            bitSet.set(size);
                            i8 = size;
                            break;
                        } else if (i9 < 0) {
                            break;
                        } else {
                            size = i9;
                        }
                    }
                }
                if (i8 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f36845i.put(cls, configuration.f36823s.get(i8));
            } else {
                int size2 = configuration.f36823s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i10 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i10 < 0) {
                            break;
                        } else {
                            size2 = i10;
                        }
                    }
                }
                for (p201x2.a aVar : j(this.f36845i)) {
                    if (!configuration.f36808d.c(aVar.f37192a, aVar.f37193b)) {
                        configuration.f36808d.b(aVar);
                    }
                }
                v vVar = (v) C(v.class, n());
                if (vVar != null) {
                    vVar.t(configuration);
                }
                p193w2.d dVar = (p193w2.d) C(p193w2.d.class, n());
                if (dVar != null) {
                    this.f36847k = dVar.f36776b;
                    m().p(dVar.f36776b);
                }
                boolean z8 = configuration.f36811g == d.WRITE_AHEAD_LOGGING;
                n().setWriteAheadLoggingEnabled(z8);
                this.f36844h = configuration.f36809e;
                this.f36838b = configuration.f36812h;
                this.f36839c = new A(configuration.f36813i);
                this.f36842f = configuration.f36810f;
                this.f36843g = z8;
                if (configuration.f36814j != null) {
                    if (configuration.f36806b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    m().q(configuration.f36805a, configuration.f36806b, configuration.f36814j);
                }
                Map mapQ = q();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapQ.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f36822r.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i11 = size3 - 1;
                            if (cls3.isAssignableFrom(configuration.f36822r.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i11 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i11;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f36850n.put(cls3, configuration.f36822r.get(size3));
                    }
                }
                int size4 = configuration.f36822r.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i12 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f36822r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i12 < 0) {
                        return;
                    } else {
                        size4 = i12;
                    }
                }
            }
        }
    }

    public final void u() {
        c();
        A2.g gVarM0 = n().M0();
        m().u(gVarM0);
        if (gVarM0.F1()) {
            gVarM0.z0();
        } else {
            gVarM0.B();
        }
    }

    public final void v() {
        n().M0().W0();
        if (s()) {
            return;
        }
        m().m();
    }

    public void w(A2.g db) {
        t.g(db, "db");
        m().j(db);
    }

    public final boolean x() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean y() {
        A2.g gVar = this.f36837a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor z(j query, CancellationSignal cancellationSignal) {
        t.g(query, "query");
        c();
        d();
        return cancellationSignal != null ? n().M0().e0(query, cancellationSignal) : n().M0().N1(query);
    }
}
