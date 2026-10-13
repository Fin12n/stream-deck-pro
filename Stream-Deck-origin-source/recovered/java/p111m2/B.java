package p111m2;

import android.util.Log;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B extends O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P.c f29628i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29632e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f29629b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f29630c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f29631d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29633f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29634g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29635h = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements P.c {
        @Override // androidx.lifecycle.P.c
        public O a(Class cls) {
            return new B(true);
        }
    }

    public B(boolean z8) {
        this.f29632e = z8;
    }

    public static B k(Q q8) {
        return (B) new P(q8, f29628i).b(B.class);
    }

    @Override // androidx.lifecycle.O
    public void d() {
        if (y.E0(3)) {
            Log.d("FragmentManager", hJroAgFztiMK.eaItRRS + this);
        }
        this.f29633f = true;
    }

    public void e(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (this.f29635h) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f29629b.containsKey(componentCallbacksC2681f.f29862f)) {
                return;
            }
            this.f29629b.put(componentCallbacksC2681f.f29862f, componentCallbacksC2681f);
            if (y.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC2681f);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b8 = (B) obj;
            if (this.f29629b.equals(b8.f29629b) && this.f29630c.equals(b8.f29630c) && this.f29631d.equals(b8.f29631d)) {
                return true;
            }
        }
        return false;
    }

    public void f(String str) {
        if (y.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str);
    }

    public void g(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (y.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC2681f);
        }
        h(componentCallbacksC2681f.f29862f);
    }

    public final void h(String str) {
        B b8 = (B) this.f29630c.get(str);
        if (b8 != null) {
            b8.d();
            this.f29630c.remove(str);
        }
        Q q8 = (Q) this.f29631d.get(str);
        if (q8 != null) {
            q8.a();
            this.f29631d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.f29629b.hashCode() * 31) + this.f29630c.hashCode()) * 31) + this.f29631d.hashCode();
    }

    public ComponentCallbacksC2681f i(String str) {
        return (ComponentCallbacksC2681f) this.f29629b.get(str);
    }

    public B j(ComponentCallbacksC2681f componentCallbacksC2681f) {
        B b8 = (B) this.f29630c.get(componentCallbacksC2681f.f29862f);
        if (b8 != null) {
            return b8;
        }
        B b9 = new B(this.f29632e);
        this.f29630c.put(componentCallbacksC2681f.f29862f, b9);
        return b9;
    }

    public Collection l() {
        return new ArrayList(this.f29629b.values());
    }

    public Q m(ComponentCallbacksC2681f componentCallbacksC2681f) {
        Q q8 = (Q) this.f29631d.get(componentCallbacksC2681f.f29862f);
        if (q8 != null) {
            return q8;
        }
        Q q9 = new Q();
        this.f29631d.put(componentCallbacksC2681f.f29862f, q9);
        return q9;
    }

    public boolean n() {
        return this.f29633f;
    }

    public void o(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (this.f29635h) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f29629b.remove(componentCallbacksC2681f.f29862f) == null || !y.E0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC2681f);
        }
    }

    public void p(boolean z8) {
        this.f29635h = z8;
    }

    public boolean q(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (this.f29629b.containsKey(componentCallbacksC2681f.f29862f)) {
            return this.f29632e ? this.f29633f : !this.f29634g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f29629b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f29630c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f29631d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
