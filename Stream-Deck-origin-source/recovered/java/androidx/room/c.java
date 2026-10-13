package androidx.room;

import A2.g;
import A2.k;
import C6.G;
import D6.M;
import D6.S;
import D6.T;
import D6.z;
import Z6.v;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p193w2.l;
import p193w2.r;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15375q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f15376r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f15377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f15381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p193w2.c f15382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f15384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile k f15385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f15386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f15387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p134p.b f15388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.room.d f15389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f15390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f15391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f15392p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void a(g database) {
            t.g(database, "database");
            if (database.F1()) {
                database.z0();
            } else {
                database.B();
            }
        }

        public final String b(String tableName, String triggerType) {
            t.g(tableName, "tableName");
            t.g(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f15393e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f15394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f15395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f15396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15397d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        public b(int i8) {
            this.f15394a = new long[i8];
            this.f15395b = new boolean[i8];
            this.f15396c = new int[i8];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f15397d) {
                        return null;
                    }
                    long[] jArr = this.f15394a;
                    int length = jArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length) {
                        int i10 = i9 + 1;
                        int i11 = 1;
                        boolean z8 = jArr[i8] > 0;
                        boolean[] zArr = this.f15395b;
                        if (z8 != zArr[i9]) {
                            int[] iArr = this.f15396c;
                            if (!z8) {
                                i11 = 2;
                            }
                            iArr[i9] = i11;
                        } else {
                            this.f15396c[i9] = 0;
                        }
                        zArr[i9] = z8;
                        i8++;
                        i9 = i10;
                    }
                    this.f15397d = false;
                    return (int[]) this.f15396c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z8;
            t.g(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : tableIds) {
                        long[] jArr = this.f15394a;
                        long j8 = jArr[i8];
                        jArr[i8] = 1 + j8;
                        if (j8 == 0) {
                            z8 = true;
                            this.f15397d = true;
                        }
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        public final boolean c(int... tableIds) {
            boolean z8;
            t.g(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z8 = false;
                    for (int i8 : tableIds) {
                        long[] jArr = this.f15394a;
                        long j8 = jArr[i8];
                        jArr[i8] = j8 - 1;
                        if (j8 == 1) {
                            z8 = true;
                            this.f15397d = true;
                        }
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z8;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f15395b, false);
                this.f15397d = true;
                G g8 = G.f1419a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0386c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f15398a;

        public AbstractC0386c(String[] tables) {
            t.g(tables, "tables");
            this.f15398a = tables;
        }

        public final String[] a() {
            return this.f15398a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC0386c f15399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f15400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f15401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f15402d;

        public d(AbstractC0386c observer, int[] tableIds, String[] tableNames) {
            t.g(observer, "observer");
            t.g(tableIds, "tableIds");
            t.g(tableNames, "tableNames");
            this.f15399a = observer;
            this.f15400b = tableIds;
            this.f15401c = tableNames;
            this.f15402d = !(tableNames.length == 0) ? S.c(tableNames[0]) : T.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f15400b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setD;
            t.g(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f15400b;
            int length = iArr.length;
            if (length != 0) {
                int i8 = 0;
                if (length != 1) {
                    Set setB = S.b();
                    int[] iArr2 = this.f15400b;
                    int length2 = iArr2.length;
                    int i9 = 0;
                    while (i8 < length2) {
                        int i10 = i9 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i8]))) {
                            setB.add(this.f15401c[i9]);
                        }
                        i8++;
                        i9 = i10;
                    }
                    setD = S.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f15402d : T.d();
                }
            } else {
                setD = T.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f15399a.c(setD);
        }

        public final void c(String[] tables) {
            Set setD;
            t.g(tables, "tables");
            int length = this.f15401c.length;
            if (length == 0) {
                setD = T.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        setD = T.d();
                        break;
                    } else {
                        if (v.v(tables[i8], this.f15401c[0], true)) {
                            setD = this.f15402d;
                            break;
                        }
                        i8++;
                    }
                }
            } else {
                Set setB = S.b();
                for (String str : tables) {
                    for (String str2 : this.f15401c) {
                        if (v.v(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = S.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f15399a.c(setD);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            p193w2.c cVar;
            Lock lockL = c.this.f().l();
            lockL.lock();
            try {
                try {
                    if (!c.this.d()) {
                        lockL.unlock();
                        p193w2.c cVar2 = c.this.f15382f;
                        if (cVar2 != null) {
                            cVar2.e();
                            return;
                        }
                        return;
                    }
                    if (!c.this.h().compareAndSet(true, false)) {
                        lockL.unlock();
                        p193w2.c cVar3 = c.this.f15382f;
                        if (cVar3 != null) {
                            cVar3.e();
                            return;
                        }
                        return;
                    }
                    if (c.this.f().s()) {
                        lockL.unlock();
                        p193w2.c cVar4 = c.this.f15382f;
                        if (cVar4 != null) {
                            cVar4.e();
                            return;
                        }
                        return;
                    }
                    g gVarM0 = c.this.f().n().M0();
                    gVarM0.z0();
                    try {
                        setD = a();
                        gVarM0.x0();
                        gVarM0.W0();
                        lockL.unlock();
                        cVar = c.this.f15382f;
                        if (cVar != null) {
                            cVar.e();
                        }
                        if (setD.isEmpty()) {
                            return;
                        }
                        p134p.b bVarG = c.this.g();
                        c cVar5 = c.this;
                        synchronized (bVarG) {
                            try {
                                Iterator it = cVar5.g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                                }
                                G g8 = G.f1419a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        gVarM0.W0();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    lockL.unlock();
                    p193w2.c cVar6 = c.this.f15382f;
                    if (cVar6 != null) {
                        cVar6.e();
                    }
                    throw th3;
                }
            } catch (SQLiteException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                setD = T.d();
                lockL.unlock();
                cVar = c.this.f15382f;
                if (cVar != null) {
                }
            } catch (IllegalStateException e9) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
                setD = T.d();
                lockL.unlock();
                cVar = c.this.f15382f;
                if (cVar != null) {
                }
            }
        }

        public final Set a() throws IllegalAccessException, IOException, InvocationTargetException {
            c cVar = c.this;
            Set setB = S.b();
            Cursor cursorA = r.A(cVar.f(), new A2.a(GOKsbdzhLhXAMt.RXrpabRMky), null, 2, null);
            while (cursorA.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorA.getInt(0)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        N6.a.a(cursorA, th);
                        throw th2;
                    }
                }
            }
            G g8 = G.f1419a;
            N6.a.a(cursorA, null);
            Set setA = S.a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (c.this.e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k kVarE = c.this.e();
            if (kVarE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarE.U();
            return setA;
        }
    }

    public c(r database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        String lowerCase;
        t.g(database, "database");
        t.g(shadowTablesMap, "shadowTablesMap");
        t.g(viewTables, "viewTables");
        t.g(tableNames, "tableNames");
        this.f15377a = database;
        this.f15378b = shadowTablesMap;
        this.f15379c = viewTables;
        this.f15383g = new AtomicBoolean(false);
        this.f15386j = new b(tableNames.length);
        this.f15387k = new l(database);
        this.f15388l = new p134p.b();
        this.f15390n = new Object();
        this.f15391o = new Object();
        this.f15380d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str = tableNames[i8];
            Locale US = Locale.US;
            t.f(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f15380d.put(lowerCase2, Integer.valueOf(i8));
            String str2 = (String) this.f15378b.get(tableNames[i8]);
            if (str2 != null) {
                t.f(US, "US");
                lowerCase = str2.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i8] = lowerCase2;
        }
        this.f15381e = strArr;
        for (Map.Entry entry : this.f15378b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            t.f(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            t.f(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f15380d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                t.f(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                t.f(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f15380d;
                map.put(lowerCase4, M.h(map, lowerCase3));
            }
        }
        this.f15392p = new e();
    }

    public final boolean d() {
        if (!this.f15377a.y()) {
            return false;
        }
        if (!this.f15384h) {
            this.f15377a.n().M0();
        }
        if (this.f15384h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k e() {
        return this.f15385i;
    }

    public final r f() {
        return this.f15377a;
    }

    public final p134p.b g() {
        return this.f15388l;
    }

    public final AtomicBoolean h() {
        return this.f15383g;
    }

    public final Map i() {
        return this.f15380d;
    }

    public final void j(g database) {
        t.g(database, "database");
        synchronized (this.f15391o) {
            if (this.f15384h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.L("PRAGMA temp_store = MEMORY;");
            database.L("PRAGMA recursive_triggers='ON';");
            database.L("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.f15385i = database.V("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f15384h = true;
            G g8 = G.f1419a;
        }
    }

    public final void k(String... tables) {
        t.g(tables, "tables");
        synchronized (this.f15388l) {
            try {
                for (Map.Entry entry : this.f15388l) {
                    t.f(entry, "(observer, wrapper)");
                    AbstractC0386c abstractC0386c = (AbstractC0386c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0386c.b()) {
                        dVar.c(tables);
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.f15391o) {
            this.f15384h = false;
            this.f15386j.d();
            k kVar = this.f15385i;
            if (kVar != null) {
                kVar.close();
                G g8 = G.f1419a;
            }
        }
    }

    public void m() {
        if (this.f15383g.compareAndSet(false, true)) {
            p193w2.c cVar = this.f15382f;
            if (cVar != null) {
                cVar.j();
            }
            this.f15377a.o().execute(this.f15392p);
        }
    }

    public void n(AbstractC0386c observer) {
        d dVar;
        t.g(observer, "observer");
        synchronized (this.f15388l) {
            dVar = (d) this.f15388l.y(observer);
        }
        if (dVar != null) {
            b bVar = this.f15386j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                t();
            }
        }
    }

    public final String[] o(String[] strArr) {
        Set setB = S.b();
        for (String str : strArr) {
            Map map = this.f15379c;
            Locale US = Locale.US;
            t.f(US, "US");
            String lowerCase = str.toLowerCase(US);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f15379c;
                t.f(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                t.d(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) S.a(setB).toArray(new String[0]);
    }

    public final void p(p193w2.c autoCloser) {
        t.g(autoCloser, "autoCloser");
        this.f15382f = autoCloser;
        autoCloser.l(new Runnable() { // from class: w2.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f36830a.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        t.g(context, "context");
        t.g(name, "name");
        t.g(serviceIntent, "serviceIntent");
        this.f15389m = new androidx.room.d(context, name, serviceIntent, this, this.f15377a.o());
    }

    public final void r(g gVar, int i8) {
        gVar.L("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.f15381e[i8];
        for (String str2 : f15376r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f15375q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i8 + " AND invalidated = 0; END";
            t.f(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.L(str3);
        }
    }

    public final void s(g gVar, int i8) {
        String str = this.f15381e[i8];
        for (String str2 : f15376r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f15375q.b(str, str2);
            t.f(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.L(str3);
        }
    }

    public final void t() {
        if (this.f15377a.y()) {
            u(this.f15377a.n().M0());
        }
    }

    public final void u(g database) {
        t.g(database, "database");
        if (database.w1()) {
            return;
        }
        try {
            Lock lockL = this.f15377a.l();
            lockL.lock();
            try {
                synchronized (this.f15390n) {
                    try {
                        int[] iArrA = this.f15386j.a();
                        if (iArrA != null) {
                            f15375q.a(database);
                            try {
                                int length = iArrA.length;
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < length) {
                                    int i10 = iArrA[i8];
                                    int i11 = i9 + 1;
                                    if (i10 == 1) {
                                        r(database, i9);
                                    } else if (i10 == 2) {
                                        s(database, i9);
                                    }
                                    i8++;
                                    i9 = i11;
                                }
                                database.x0();
                                database.W0();
                                G g8 = G.f1419a;
                            } catch (Throwable th) {
                                database.W0();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lockL.unlock();
            } catch (Throwable th3) {
                lockL.unlock();
                throw th3;
            }
        } catch (SQLiteException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        } catch (IllegalStateException e9) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
        }
    }

    public void c(AbstractC0386c observer) {
        d dVar;
        t.g(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f15380d;
            Locale locale = Locale.US;
            t.f(locale, RaiWHuj.HwKArblXflEn);
            String lowerCase = str.toLowerCase(locale);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrQ0 = z.Q0(arrayList);
        d dVar2 = new d(observer, iArrQ0, strArrO);
        synchronized (this.f15388l) {
            dVar = (d) this.f15388l.u(observer, dVar2);
        }
        if (dVar == null && this.f15386j.b(Arrays.copyOf(iArrQ0, iArrQ0.length))) {
            t();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(r database, String... tableNames) {
        this(database, M.g(), M.g(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        t.g(database, "database");
        t.g(tableNames, "tableNames");
    }
}
