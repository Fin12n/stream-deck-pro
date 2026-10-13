package p215z0;

import C6.C0920i;
import C6.G;
import K0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T0 implements a, Iterable, R6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38666b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38671g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f38673i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38665a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f38667c = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f38672h = new ArrayList();

    public final int A() {
        return this.f38666b;
    }

    public final Object[] D() {
        return this.f38667c;
    }

    public final int E() {
        return this.f38668d;
    }

    public final HashMap F() {
        return this.f38673i;
    }

    public final int G() {
        return this.f38671g;
    }

    public final boolean H() {
        return this.f38670f;
    }

    public final S0 J() {
        if (this.f38670f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f38669e++;
        return new S0(this);
    }

    public final W0 K() {
        if (this.f38670f) {
            AbstractC3169o.v("Cannot start a writer when another writer is pending");
            throw new C0920i();
        }
        if (!(this.f38669e <= 0)) {
            AbstractC3169o.v("Cannot start a writer when a reader is pending");
            throw new C0920i();
        }
        this.f38670f = true;
        this.f38671g++;
        return new W0(this);
    }

    public final boolean L(C3147d c3147d) {
        int iU;
        return c3147d.b() && (iU = V0.U(this.f38672h, c3147d.a(), this.f38666b)) >= 0 && t.c(this.f38672h.get(iU), c3147d);
    }

    public final void M(int[] iArr, int i8, Object[] objArr, int i9, ArrayList arrayList, HashMap map) {
        this.f38665a = iArr;
        this.f38666b = i8;
        this.f38667c = objArr;
        this.f38668d = i9;
        this.f38672h = arrayList;
        this.f38673i = map;
    }

    public final Object N(int i8, int i9) {
        int iV = V0.V(this.f38665a, i8);
        int i10 = i8 + 1;
        return (i9 < 0 || i9 >= (i10 < this.f38666b ? V0.F(this.f38665a, i10) : this.f38667c.length) - iV) ? InterfaceC3163l.f38803a.a() : this.f38667c[iV + i9];
    }

    public final P O(int i8) {
        C3147d c3147dP;
        HashMap map = this.f38673i;
        if (map == null || (c3147dP = P(i8)) == null) {
            return null;
        }
        return (P) map.get(c3147dP);
    }

    public final C3147d P(int i8) {
        int i9;
        if (this.f38670f) {
            AbstractC3169o.v("use active SlotWriter to crate an anchor for location instead");
            throw new C0920i();
        }
        if (i8 < 0 || i8 >= (i9 = this.f38666b)) {
            return null;
        }
        return V0.G(this.f38672h, i8, i9);
    }

    public final C3147d c(int i8) {
        int i9;
        if (this.f38670f) {
            AbstractC3169o.v("use active SlotWriter to create an anchor location instead");
            throw new C0920i();
        }
        if (i8 < 0 || i8 >= (i9 = this.f38666b)) {
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        ArrayList arrayList = this.f38672h;
        int iU = V0.U(arrayList, i8, i9);
        if (iU >= 0) {
            return (C3147d) arrayList.get(iU);
        }
        C3147d c3147d = new C3147d(i8);
        arrayList.add(-(iU + 1), c3147d);
        return c3147d;
    }

    public boolean isEmpty() {
        return this.f38666b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new N(this, 0, this.f38666b);
    }

    public final int m(C3147d c3147d) {
        if (this.f38670f) {
            AbstractC3169o.v("Use active SlotWriter to determine anchor location instead");
            throw new C0920i();
        }
        if (c3147d.b()) {
            return c3147d.a();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed");
    }

    public final void o(S0 s8, HashMap map) {
        if (!(s8.v() == this && this.f38669e > 0)) {
            AbstractC3169o.v("Unexpected reader close()");
            throw new C0920i();
        }
        this.f38669e--;
        if (map != null) {
            synchronized (this) {
                try {
                    HashMap map2 = this.f38673i;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f38673i = map;
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void s(W0 w8, int[] iArr, int i8, Object[] objArr, int i9, ArrayList arrayList, HashMap map) {
        if (w8.e0() != this || !this.f38670f) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.f38670f = false;
        M(iArr, i8, objArr, i9, arrayList, map);
    }

    public final boolean t() {
        return this.f38666b > 0 && V0.D(this.f38665a, 0);
    }

    public final ArrayList u() {
        return this.f38672h;
    }

    public final int[] y() {
        return this.f38665a;
    }

    public final boolean I(int i8, C3147d c3147d) {
        if (this.f38670f) {
            AbstractC3169o.v("Writer is active");
            throw new C0920i();
        }
        if (!(i8 >= 0 && i8 < this.f38666b)) {
            AbstractC3169o.v(OjEsfyJYzbPn.SUfZXmmmVgEqA);
            throw new C0920i();
        }
        if (L(c3147d)) {
            int I8 = V0.I(this.f38665a, i8) + i8;
            int iA = c3147d.a();
            if (i8 <= iA && iA < I8) {
                return true;
            }
        }
        return false;
    }
}
