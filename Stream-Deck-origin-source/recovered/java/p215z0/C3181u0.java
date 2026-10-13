package p215z0;

import C6.j;
import C6.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: z0.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3181u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f38943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f38944f;

    /* JADX INFO: renamed from: z0.u0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            HashMap mapL = AbstractC3169o.L();
            C3181u0 c3181u0 = C3181u0.this;
            int size = c3181u0.b().size();
            for (int i8 = 0; i8 < size; i8++) {
                W w8 = (W) c3181u0.b().get(i8);
                AbstractC3169o.O(mapL, AbstractC3169o.E(w8), w8);
            }
            return mapL;
        }
    }

    public C3181u0(List<W> list, int i8) {
        this.f38939a = list;
        this.f38940b = i8;
        if (i8 < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.f38942d = new ArrayList();
        HashMap map = new HashMap();
        int size = list.size();
        int iC = 0;
        for (int i9 = 0; i9 < size; i9++) {
            W w8 = (W) this.f38939a.get(i9);
            map.put(Integer.valueOf(w8.b()), new M(i9, iC, w8.c()));
            iC += w8.c();
        }
        this.f38943e = map;
        this.f38944f = k.b(new a());
    }

    public final int a() {
        return this.f38941c;
    }

    public final List b() {
        return this.f38939a;
    }

    public final HashMap c() {
        return (HashMap) this.f38944f.getValue();
    }

    public final W d(int i8, Object obj) {
        return (W) AbstractC3169o.N(c(), obj != null ? new V(Integer.valueOf(i8), obj) : Integer.valueOf(i8));
    }

    public final int e() {
        return this.f38940b;
    }

    public final List f() {
        return this.f38942d;
    }

    public final int g(W w8) {
        M m8 = (M) this.f38943e.get(Integer.valueOf(w8.b()));
        if (m8 != null) {
            return m8.b();
        }
        return -1;
    }

    public final boolean h(W w8) {
        return this.f38942d.add(w8);
    }

    public final void i(W w8, int i8) {
        this.f38943e.put(Integer.valueOf(w8.b()), new M(-1, i8, 0));
    }

    public final void j(int i8, int i9, int i10) {
        if (i8 > i9) {
            for (M m8 : this.f38943e.values()) {
                int iB = m8.b();
                if (i8 <= iB && iB < i8 + i10) {
                    m8.e((iB - i8) + i9);
                } else if (i9 <= iB && iB < i8) {
                    m8.e(iB + i10);
                }
            }
            return;
        }
        if (i9 > i8) {
            for (M m9 : this.f38943e.values()) {
                int iB2 = m9.b();
                if (i8 <= iB2 && iB2 < i8 + i10) {
                    m9.e((iB2 - i8) + i9);
                } else if (i8 + 1 <= iB2 && iB2 < i9) {
                    m9.e(iB2 - i10);
                }
            }
        }
    }

    public final void k(int i8, int i9) {
        if (i8 > i9) {
            for (M m8 : this.f38943e.values()) {
                int iC = m8.c();
                if (iC == i8) {
                    m8.f(i9);
                } else if (i9 <= iC && iC < i8) {
                    m8.f(iC + 1);
                }
            }
            return;
        }
        if (i9 > i8) {
            for (M m9 : this.f38943e.values()) {
                int iC2 = m9.c();
                if (iC2 == i8) {
                    m9.f(i9);
                } else if (i8 + 1 <= iC2 && iC2 < i9) {
                    m9.f(iC2 - 1);
                }
            }
        }
    }

    public final void l(int i8) {
        this.f38941c = i8;
    }

    public final int m(W w8) {
        M m8 = (M) this.f38943e.get(Integer.valueOf(w8.b()));
        if (m8 != null) {
            return m8.c();
        }
        return -1;
    }

    public final boolean n(int i8, int i9) {
        int iB;
        M m8 = (M) this.f38943e.get(Integer.valueOf(i8));
        if (m8 == null) {
            return false;
        }
        int iB2 = m8.b();
        int iA = i9 - m8.a();
        m8.d(i9);
        if (iA == 0) {
            return true;
        }
        for (M m9 : this.f38943e.values()) {
            if (m9.b() >= iB2 && !t.c(m9, m8) && (iB = m9.b() + iA) >= 0) {
                m9.e(iB);
            }
        }
        return true;
    }

    public final int o(W w8) {
        M m8 = (M) this.f38943e.get(Integer.valueOf(w8.b()));
        return m8 != null ? m8.a() : w8.c();
    }
}
