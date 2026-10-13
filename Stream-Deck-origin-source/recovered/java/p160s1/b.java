package p160s1;

import C6.G;
import D6.z;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p192w1.p;
import p192w1.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f32863a = p.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f32864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f32865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32872j;

    public b(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f32867e = i8;
        this.f32864b = new HashMap(0, 0.75f);
        this.f32865c = new LinkedHashSet();
    }

    public Object b(Object obj) {
        return null;
    }

    public void c(boolean z8, Object obj, Object obj2, Object obj3) {
    }

    public final Object d(Object obj) {
        synchronized (this.f32863a) {
            Object obj2 = this.f32864b.get(obj);
            if (obj2 != null) {
                this.f32865c.remove(obj);
                this.f32865c.add(obj);
                this.f32871i++;
                return obj2;
            }
            this.f32872j++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.f32863a) {
                try {
                    this.f32869g++;
                    Object objPut = this.f32864b.put(obj, objB);
                    this.f32865c.remove(obj);
                    this.f32865c.add(obj);
                    if (objPut != null) {
                        this.f32864b.put(obj, objPut);
                        obj2 = objPut;
                    } else {
                        this.f32866d = h() + g(obj, objB);
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, objB, obj2);
                return obj2;
            }
            j(this.f32867e);
            return objB;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f32863a) {
            try {
                this.f32868f++;
                this.f32866d = h() + g(obj, obj2);
                objPut = this.f32864b.put(obj, obj2);
                if (objPut != null) {
                    this.f32866d = h() - g(obj, objPut);
                }
                if (this.f32865c.contains(obj)) {
                    this.f32865c.remove(obj);
                }
                this.f32865c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            c(false, obj, objPut, obj2);
        }
        j(this.f32867e);
        return objPut;
    }

    public final Object f(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f32863a) {
            try {
                objRemove = this.f32864b.remove(obj);
                this.f32865c.remove(obj);
                if (objRemove != null) {
                    this.f32866d = h() - g(obj, objRemove);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int g(Object obj, Object obj2) {
        int i8 = i(obj, obj2);
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final int h() {
        int i8;
        synchronized (this.f32863a) {
            i8 = this.f32866d;
        }
        return i8;
    }

    public int i(Object obj, Object obj2) {
        return 1;
    }

    public void j(int i8) {
        Object objH0;
        Object obj;
        while (true) {
            synchronized (this.f32863a) {
                try {
                    if (h() >= 0 && (!this.f32864b.isEmpty() || h() == 0)) {
                        if (this.f32864b.isEmpty() != this.f32865c.isEmpty()) {
                            break;
                        }
                        if (h() <= i8 || this.f32864b.isEmpty()) {
                            objH0 = null;
                            obj = null;
                        } else {
                            objH0 = z.h0(this.f32865c);
                            obj = this.f32864b.get(objH0);
                            if (obj == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            P.d(this.f32864b).remove(objH0);
                            P.a(this.f32865c).remove(objH0);
                            int iH = h();
                            t.d(objH0);
                            t.d(obj);
                            this.f32866d = iH - g(objH0, obj);
                            this.f32870h++;
                        }
                        G g8 = G.f1419a;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objH0 == null && obj == null) {
                return;
            }
            t.d(objH0);
            t.d(obj);
            c(true, objH0, obj, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public String toString() {
        String str;
        synchronized (this.f32863a) {
            try {
                int i8 = this.f32871i;
                int i9 = this.f32872j + i8;
                str = "LruCache[maxSize=" + this.f32867e + LYdqVGvOGMNr.AwhTm + this.f32871i + ",misses=" + this.f32872j + ",hitRate=" + (i9 != 0 ? (i8 * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
