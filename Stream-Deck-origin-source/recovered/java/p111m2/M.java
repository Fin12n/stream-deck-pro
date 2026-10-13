package p111m2;

import U1.I;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f29720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29721b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29722c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29723d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29724e = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f29725a;

        public a(d dVar) {
            this.f29725a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (M.this.f29721b.contains(this.f29725a)) {
                this.f29725a.e().a(this.f29725a.f().f29846I);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f29727a;

        public b(d dVar) {
            this.f29727a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.f29721b.remove(this.f29727a);
            M.this.f29722c.remove(this.f29727a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29730b;

        static {
            int[] iArr = new int[e.b.values().length];
            f29730b = iArr;
            try {
                iArr[e.b.f29741b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29730b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29730b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f29729a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29729a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29729a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29729a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f29732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f29733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ComponentCallbacksC2681f f29734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f29735d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashSet f29736e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f29737f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f29738g = false;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements P1.d.a {
            public a() {
            }

            @Override // P1.d.a
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum b {
            NONE,
            f29741b,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i8) {
                if (i8 == 0) {
                    return VISIBLE;
                }
                if (i8 == 4) {
                    return INVISIBLE;
                }
                if (i8 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i8);
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i8 = c.f29729a[ordinal()];
                if (i8 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (y.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i8 == 3) {
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i8 != 4) {
                    return;
                }
                if (y.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public e(c cVar, b bVar, ComponentCallbacksC2681f componentCallbacksC2681f, P1.d dVar) {
            this.f29732a = cVar;
            this.f29733b = bVar;
            this.f29734c = componentCallbacksC2681f;
            dVar.b(new a());
        }

        public final void a(Runnable runnable) {
            this.f29735d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f29737f = true;
            if (this.f29736e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f29736e).iterator();
            while (it.hasNext()) {
                ((P1.d) it.next()).a();
            }
        }

        public void c() {
            if (this.f29738g) {
                return;
            }
            if (y.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f29738g = true;
            Iterator it = this.f29735d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(P1.d dVar) {
            if (this.f29736e.remove(dVar) && this.f29736e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f29732a;
        }

        public final ComponentCallbacksC2681f f() {
            return this.f29734c;
        }

        public b g() {
            return this.f29733b;
        }

        public final boolean h() {
            return this.f29737f;
        }

        public final boolean i() {
            return this.f29738g;
        }

        public final void j(P1.d dVar) {
            l();
            this.f29736e.add(dVar);
        }

        public final void k(c cVar, b bVar) {
            int i8 = c.f29730b[bVar.ordinal()];
            if (i8 == 1) {
                if (this.f29732a == c.REMOVED) {
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29734c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f29733b + " to ADDING.");
                    }
                    this.f29732a = c.VISIBLE;
                    this.f29733b = b.f29741b;
                    return;
                }
                return;
            }
            if (i8 == 2) {
                if (y.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29734c + " mFinalState = " + this.f29732a + " -> REMOVED. mLifecycleImpact  = " + this.f29733b + " to REMOVING.");
                }
                this.f29732a = c.REMOVED;
                this.f29733b = b.REMOVING;
                return;
            }
            if (i8 == 3 && this.f29732a != c.REMOVED) {
                if (y.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29734c + " mFinalState = " + this.f29732a + " -> " + cVar + ". ");
                }
                this.f29732a = cVar;
            }
        }

        public abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {" + bGZGhbtQmA.AgXlEXzxdDjG + this.f29732a + "} {mLifecycleImpact = " + this.f29733b + "} {mFragment = " + this.f29734c + "}";
        }
    }

    public M(ViewGroup viewGroup) {
        this.f29720a = viewGroup;
    }

    public static M n(ViewGroup viewGroup, y yVar) {
        return o(viewGroup, yVar.w0());
    }

    public static M o(ViewGroup viewGroup, N n8) {
        Object tag = viewGroup.getTag(p102l2.b.f29137b);
        if (tag instanceof M) {
            return (M) tag;
        }
        M mA = n8.a(viewGroup);
        viewGroup.setTag(p102l2.b.f29137b, mA);
        return mA;
    }

    public final void a(e.c cVar, e.b bVar, E e8) {
        synchronized (this.f29721b) {
            try {
                P1.d dVar = new P1.d();
                e eVarH = h(e8.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar2 = new d(cVar, bVar, e8, dVar);
                this.f29721b.add(dVar2);
                dVar2.a(new a(dVar2));
                dVar2.a(new b(dVar2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(e.c cVar, E e8) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + e8.k());
        }
        a(cVar, e.b.f29741b, e8);
    }

    public void c(E e8) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + e8.k());
        }
        a(e.c.GONE, e.b.NONE, e8);
    }

    public void d(E e8) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + e8.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, e8);
    }

    public void e(E e8) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + e8.k());
        }
        a(e.c.VISIBLE, e.b.NONE, e8);
    }

    public abstract void f(List list, boolean z8);

    public void g() {
        if (this.f29724e) {
            return;
        }
        if (!I.w(this.f29720a)) {
            j();
            this.f29723d = false;
            return;
        }
        synchronized (this.f29721b) {
            try {
                if (!this.f29721b.isEmpty()) {
                    ArrayList<e> arrayList = new ArrayList(this.f29722c);
                    this.f29722c.clear();
                    for (e eVar : arrayList) {
                        if (y.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f29722c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f29721b);
                    this.f29721b.clear();
                    this.f29722c.addAll(arrayList2);
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).l();
                    }
                    f(arrayList2, this.f29723d);
                    this.f29723d = false;
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e h(ComponentCallbacksC2681f componentCallbacksC2681f) {
        for (e eVar : this.f29721b) {
            if (eVar.f().equals(componentCallbacksC2681f) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public final e i(ComponentCallbacksC2681f componentCallbacksC2681f) {
        for (e eVar : this.f29722c) {
            if (eVar.f().equals(componentCallbacksC2681f) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        if (y.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zW = I.w(this.f29720a);
        synchronized (this.f29721b) {
            try {
                q();
                Iterator it = this.f29721b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                for (e eVar : new ArrayList(this.f29722c)) {
                    if (y.E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zW ? "" : "Container " + this.f29720a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                for (e eVar2 : new ArrayList(this.f29721b)) {
                    if (y.E0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zW ? "" : "Container " + this.f29720a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.f29724e) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f29724e = false;
            g();
        }
    }

    public e.b l(E e8) {
        e eVarH = h(e8.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(e8.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f29720a;
    }

    public void p() {
        synchronized (this.f29721b) {
            try {
                q();
                this.f29724e = false;
                for (int size = this.f29721b.size() - 1; size >= 0; size--) {
                    e eVar = (e) this.f29721b.get(size);
                    e.c cVarC = e.c.c(eVar.f().f29846I);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarC != cVar) {
                        this.f29724e = eVar.f().d0();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        for (e eVar : this.f29721b) {
            if (eVar.g() == e.b.f29741b) {
                eVar.k(e.c.b(eVar.f().p1().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z8) {
        this.f29723d = z8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final E f29731h;

        public d(e.c cVar, e.b bVar, E e8, P1.d dVar) {
            super(cVar, bVar, e8.k(), dVar);
            this.f29731h = e8;
        }

        @Override // m2.M.e
        public void c() {
            super.c();
            this.f29731h.m();
        }

        @Override // m2.M.e
        public void l() {
            if (g() == e.b.f29741b) {
                ComponentCallbacksC2681f componentCallbacksC2681fK = this.f29731h.k();
                View viewFindFocus = componentCallbacksC2681fK.f29846I.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC2681fK.v1(viewFindFocus);
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC2681fK);
                    }
                }
                View viewP1 = f().p1();
                if (viewP1.getParent() == null) {
                    this.f29731h.b();
                    viewP1.setAlpha(0.0f);
                }
                if (viewP1.getAlpha() == 0.0f && viewP1.getVisibility() == 0) {
                    viewP1.setVisibility(4);
                }
                viewP1.setAlpha(componentCallbacksC2681fK.L());
                return;
            }
            if (g() == e.b.REMOVING) {
                ComponentCallbacksC2681f componentCallbacksC2681fK2 = this.f29731h.k();
                View viewP2 = componentCallbacksC2681fK2.p1();
                if (y.E0(2)) {
                    Log.v("FragmentManager", ajyWhveMDgQ.pksIvLKI + viewP2.findFocus() + " on view " + viewP2 + " for Fragment " + componentCallbacksC2681fK2);
                }
                viewP2.clearFocus();
            }
        }
    }
}
