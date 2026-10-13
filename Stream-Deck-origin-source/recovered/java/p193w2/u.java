package p193w2;

import A2.i;
import A2.j;
import C6.G;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u implements j, i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f36890i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f36891j = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f36893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f36894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f36895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f36896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f36897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f36898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36899h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final u a(String query, int i8) {
            t.g(query, "query");
            TreeMap treeMap = u.f36891j;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
                if (entryCeilingEntry == null) {
                    G g8 = G.f1419a;
                    u uVar = new u(i8, null);
                    uVar.t(query, i8);
                    return uVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                u sqliteQuery = (u) entryCeilingEntry.getValue();
                sqliteQuery.t(query, i8);
                t.f(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = u.f36891j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            t.f(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i8 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i8;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ u(int i8, AbstractC2633k abstractC2633k) {
        this(i8);
    }

    public static final u j(String str, int i8) {
        return f36890i.a(str, i8);
    }

    @Override // A2.i
    public void E0(int i8, byte[] value) {
        t.g(value, "value");
        this.f36898g[i8] = 5;
        this.f36897f[i8] = value;
    }

    @Override // A2.i
    public void N(int i8, String value) {
        t.g(value, "value");
        this.f36898g[i8] = 4;
        this.f36896e[i8] = value;
    }

    @Override // A2.j
    public void b(i statement) {
        t.g(statement, "statement");
        int iO = o();
        if (1 > iO) {
            return;
        }
        int i8 = 1;
        while (true) {
            int i9 = this.f36898g[i8];
            if (i9 == 1) {
                statement.l1(i8);
            } else if (i9 == 2) {
                statement.v0(i8, this.f36894c[i8]);
            } else if (i9 == 3) {
                statement.c0(i8, this.f36895d[i8]);
            } else if (i9 == 4) {
                String str = this.f36896e[i8];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.N(i8, str);
            } else if (i9 == 5) {
                byte[] bArr = this.f36897f[i8];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.E0(i8, bArr);
            }
            if (i8 == iO) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // A2.j
    public String c() {
        String str = this.f36893b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // A2.i
    public void c0(int i8, double d8) {
        this.f36898g[i8] = 3;
        this.f36895d[i8] = d8;
    }

    @Override // A2.i
    public void l1(int i8) {
        this.f36898g[i8] = 1;
    }

    public int o() {
        return this.f36899h;
    }

    public final void t(String query, int i8) {
        t.g(query, "query");
        this.f36893b = query;
        this.f36899h = i8;
    }

    public final void v() {
        TreeMap treeMap = f36891j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f36892a), this);
            f36890i.b();
            G g8 = G.f1419a;
        }
    }

    @Override // A2.i
    public void v0(int i8, long j8) {
        this.f36898g[i8] = 2;
        this.f36894c[i8] = j8;
    }

    public u(int i8) {
        this.f36892a = i8;
        int i9 = i8 + 1;
        this.f36898g = new int[i9];
        this.f36894c = new long[i9];
        this.f36895d = new double[i9];
        this.f36896e = new String[i9];
        this.f36897f = new byte[i9][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
