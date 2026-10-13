package androidx.camera.core;

import A.AbstractC0890p0;
import A.C0863c;
import A.E0;
import A.InterfaceC0870f0;
import H.A0;
import H.AbstractC0995o;
import H.InterfaceC1014y;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e implements A0, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0995o f14146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A0.a f14148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A0 f14150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A0.a f14151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f14152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray f14153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray f14154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f14156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f14157m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AbstractC0995o {
        public a() {
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            super.b(i8, interfaceC1014y);
            e.this.s(interfaceC1014y);
        }
    }

    public e(int i8, int i9, int i10, int i11) {
        this(d(i8, i9, i10, i11));
    }

    public static /* synthetic */ void a(e eVar, A0.a aVar) {
        eVar.getClass();
        aVar.a(eVar);
    }

    public static /* synthetic */ void c(e eVar, A0 a8) {
        synchronized (eVar.f14145a) {
            eVar.f14147c++;
        }
        eVar.p(a8);
    }

    public static A0 d(int i8, int i9, int i10, int i11) {
        return new C0863c(ImageReader.newInstance(i8, i9, i10, i11));
    }

    @Override // androidx.camera.core.b.a
    public void b(d dVar) {
        synchronized (this.f14145a) {
            e(dVar);
        }
    }

    @Override // H.A0
    public void close() {
        synchronized (this.f14145a) {
            try {
                if (this.f14149e) {
                    return;
                }
                Iterator it = new ArrayList(this.f14156l).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                this.f14156l.clear();
                this.f14150f.close();
                this.f14149e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(d dVar) {
        synchronized (this.f14145a) {
            try {
                int iIndexOf = this.f14156l.indexOf(dVar);
                if (iIndexOf >= 0) {
                    this.f14156l.remove(iIndexOf);
                    int i8 = this.f14155k;
                    if (iIndexOf <= i8) {
                        this.f14155k = i8 - 1;
                    }
                }
                this.f14157m.remove(dVar);
                if (this.f14147c > 0) {
                    p(this.f14150f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H.A0
    public int f() {
        int iF;
        synchronized (this.f14145a) {
            iF = this.f14150f.f();
        }
        return iF;
    }

    @Override // H.A0
    public int g() {
        int iG;
        synchronized (this.f14145a) {
            iG = this.f14150f.g();
        }
        return iG;
    }

    @Override // H.A0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f14145a) {
            surface = this.f14150f.getSurface();
        }
        return surface;
    }

    @Override // H.A0
    public d h() {
        synchronized (this.f14145a) {
            try {
                if (this.f14156l.isEmpty()) {
                    return null;
                }
                if (this.f14155k >= this.f14156l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < this.f14156l.size() - 1; i8++) {
                    if (!this.f14157m.contains(this.f14156l.get(i8))) {
                        arrayList.add((d) this.f14156l.get(i8));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                int size = this.f14156l.size();
                List list = this.f14156l;
                this.f14155k = size;
                d dVar = (d) list.get(size - 1);
                this.f14157m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H.A0
    public void i(A0.a aVar, Executor executor) {
        synchronized (this.f14145a) {
            this.f14151g = (A0.a) T1.f.g(aVar);
            this.f14152h = (Executor) T1.f.g(executor);
            this.f14150f.i(this.f14148d, executor);
        }
    }

    @Override // H.A0
    public int j() {
        int iJ;
        synchronized (this.f14145a) {
            iJ = this.f14150f.j();
        }
        return iJ;
    }

    @Override // H.A0
    public void k() {
        synchronized (this.f14145a) {
            this.f14150f.k();
            this.f14151g = null;
            this.f14152h = null;
            this.f14147c = 0;
        }
    }

    @Override // H.A0
    public int l() {
        int iL;
        synchronized (this.f14145a) {
            iL = this.f14150f.l();
        }
        return iL;
    }

    @Override // H.A0
    public d m() {
        synchronized (this.f14145a) {
            try {
                if (this.f14156l.isEmpty()) {
                    return null;
                }
                if (this.f14155k >= this.f14156l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f14156l;
                int i8 = this.f14155k;
                this.f14155k = i8 + 1;
                d dVar = (d) list.get(i8);
                this.f14157m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC0995o o() {
        return this.f14146b;
    }

    public void p(A0 a8) {
        d dVarM;
        synchronized (this.f14145a) {
            try {
                if (this.f14149e) {
                    return;
                }
                int size = this.f14154j.size() + this.f14156l.size();
                if (size >= a8.l()) {
                    AbstractC0890p0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        dVarM = a8.m();
                        if (dVarM != null) {
                            this.f14147c--;
                            size++;
                            this.f14154j.put(dVarM.e1().a(), dVarM);
                            q();
                        }
                    } catch (IllegalStateException e8) {
                        AbstractC0890p0.b("MetadataImageReader", "Failed to acquire next image.", e8);
                        dVarM = null;
                    }
                    if (dVarM == null || this.f14147c <= 0) {
                        break;
                    }
                } while (size < a8.l());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.f14145a) {
            try {
                for (int size = this.f14153i.size() - 1; size >= 0; size--) {
                    InterfaceC0870f0 interfaceC0870f0 = (InterfaceC0870f0) this.f14153i.valueAt(size);
                    long jA = interfaceC0870f0.a();
                    d dVar = (d) this.f14154j.get(jA);
                    if (dVar != null) {
                        this.f14154j.remove(jA);
                        this.f14153i.removeAt(size);
                        n(new E0(dVar, interfaceC0870f0));
                    }
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.f14145a) {
            try {
                if (this.f14154j.size() != 0 && this.f14153i.size() != 0) {
                    long jKeyAt = this.f14154j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f14153i.keyAt(0);
                    T1.f.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f14154j.size() - 1; size >= 0; size--) {
                            if (this.f14154j.keyAt(size) < jKeyAt2) {
                                ((d) this.f14154j.valueAt(size)).close();
                                this.f14154j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f14153i.size() - 1; size2 >= 0; size2--) {
                            if (this.f14153i.keyAt(size2) < jKeyAt) {
                                this.f14153i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(InterfaceC1014y interfaceC1014y) {
        synchronized (this.f14145a) {
            try {
                if (this.f14149e) {
                    return;
                }
                this.f14153i.put(interfaceC1014y.a(), new L.c(interfaceC1014y));
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(A0 a8) {
        this.f14145a = new Object();
        this.f14146b = new a();
        this.f14147c = 0;
        this.f14148d = new A0.a() { // from class: A.q0
            @Override // H.A0.a
            public final void a(H.A0 a9) {
                androidx.camera.core.e.c(this.f302a, a9);
            }
        };
        this.f14149e = false;
        this.f14153i = new LongSparseArray();
        this.f14154j = new LongSparseArray();
        this.f14157m = new ArrayList();
        this.f14150f = a8;
        this.f14155k = 0;
        this.f14156l = new ArrayList(l());
    }

    public final void n(E0 e8) {
        final A0.a aVar;
        Executor executor;
        synchronized (this.f14145a) {
            try {
                if (this.f14156l.size() < l()) {
                    e8.b(this);
                    this.f14156l.add(e8);
                    aVar = this.f14151g;
                    executor = this.f14152h;
                } else {
                    AbstractC0890p0.a(ZWZaxQrCHfNe.WxkxrVkrWUJNZ, "Maximum image number reached.");
                    e8.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: A.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.e.a(this.f304a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }
}
