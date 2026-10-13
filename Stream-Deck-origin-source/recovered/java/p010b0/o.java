package p010b0;

import C6.G;
import D6.z;
import java.util.Map;
import kotlin.jvm.internal.t;
import p019c0.b;
import p019c0.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15632i;

    public o(int i8) {
        this.f15624a = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f15625b = new c(0, 0.75f);
        this.f15626c = new b();
    }

    public Object a(Object key) {
        t.g(key, "key");
        return null;
    }

    public void b(boolean z8, Object key, Object oldValue, Object obj) {
        t.g(key, "key");
        t.g(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objD;
        t.g(key, "key");
        synchronized (this.f15626c) {
            Object objA = this.f15625b.a(key);
            if (objA != null) {
                this.f15631h++;
                return objA;
            }
            this.f15632i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f15626c) {
                try {
                    this.f15629f++;
                    objD = this.f15625b.d(key, objA2);
                    if (objD != null) {
                        this.f15625b.d(key, objD);
                    } else {
                        this.f15627d += e(key, objA2);
                        G g8 = G.f1419a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            g(this.f15624a);
            return objA2;
        }
    }

    public final Object d(Object key, Object value) {
        Object objD;
        t.g(key, "key");
        t.g(value, "value");
        synchronized (this.f15626c) {
            try {
                this.f15628e++;
                this.f15627d += e(key, value);
                objD = this.f15625b.d(key, value);
                if (objD != null) {
                    this.f15627d -= e(key, objD);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        g(this.f15624a);
        return objD;
    }

    public final int e(Object obj, Object obj2) {
        int iF = f(obj, obj2);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public int f(Object key, Object value) {
        t.g(key, "key");
        t.g(value, "value");
        return 1;
    }

    public void g(int i8) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f15626c) {
                try {
                    if (this.f15627d < 0 || (this.f15625b.c() && this.f15627d != 0)) {
                        break;
                    }
                    if (this.f15627d > i8 && !this.f15625b.c()) {
                        Map.Entry entry = (Map.Entry) z.j0(this.f15625b.b());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f15625b.e(key);
                        this.f15627d -= e(key, value);
                        this.f15630g++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        synchronized (this.f15626c) {
            try {
                int i8 = this.f15631h;
                int i9 = this.f15632i + i8;
                str = "LruCache[maxSize=" + this.f15624a + ",hits=" + this.f15631h + ",misses=" + this.f15632i + ",hitRate=" + (i9 != 0 ? (i8 * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
