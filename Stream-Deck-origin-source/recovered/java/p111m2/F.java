package p111m2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29657a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f29658b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f29659c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B f29660d;

    public void A(B b8) {
        this.f29660d = b8;
    }

    public D B(String str, D d8) {
        return d8 != null ? (D) this.f29659c.put(str, d8) : (D) this.f29659c.remove(str);
    }

    public void a(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (this.f29657a.contains(componentCallbacksC2681f)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC2681f);
        }
        synchronized (this.f29657a) {
            this.f29657a.add(componentCallbacksC2681f);
        }
        componentCallbacksC2681f.f29874l = true;
    }

    public void b() {
        this.f29658b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f29658b.get(str) != null;
    }

    public void d(int i8) {
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                e8.t(i8);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f29658b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (E e8 : this.f29658b.values()) {
                printWriter.print(str);
                if (e8 != null) {
                    ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                    printWriter.println(componentCallbacksC2681fK);
                    componentCallbacksC2681fK.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f29657a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size; i8++) {
                ComponentCallbacksC2681f componentCallbacksC2681f = (ComponentCallbacksC2681f) this.f29657a.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC2681f.toString());
            }
        }
    }

    public ComponentCallbacksC2681f f(String str) {
        E e8 = (E) this.f29658b.get(str);
        if (e8 != null) {
            return e8.k();
        }
        return null;
    }

    public ComponentCallbacksC2681f g(int i8) {
        for (int size = this.f29657a.size() - 1; size >= 0; size--) {
            ComponentCallbacksC2681f componentCallbacksC2681f = (ComponentCallbacksC2681f) this.f29657a.get(size);
            if (componentCallbacksC2681f != null && componentCallbacksC2681f.f29888x == i8) {
                return componentCallbacksC2681f;
            }
        }
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                if (componentCallbacksC2681fK.f29888x == i8) {
                    return componentCallbacksC2681fK;
                }
            }
        }
        return null;
    }

    public ComponentCallbacksC2681f h(String str) {
        if (str != null) {
            for (int size = this.f29657a.size() - 1; size >= 0; size--) {
                ComponentCallbacksC2681f componentCallbacksC2681f = (ComponentCallbacksC2681f) this.f29657a.get(size);
                if (componentCallbacksC2681f != null && str.equals(componentCallbacksC2681f.f29890z)) {
                    return componentCallbacksC2681f;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                if (str.equals(componentCallbacksC2681fK.f29890z)) {
                    return componentCallbacksC2681fK;
                }
            }
        }
        return null;
    }

    public ComponentCallbacksC2681f i(String str) {
        ComponentCallbacksC2681f componentCallbacksC2681fM;
        for (E e8 : this.f29658b.values()) {
            if (e8 != null && (componentCallbacksC2681fM = e8.k().m(str)) != null) {
                return componentCallbacksC2681fM;
            }
        }
        return null;
    }

    public int j(ComponentCallbacksC2681f componentCallbacksC2681f) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC2681f.f29845H;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f29657a.indexOf(componentCallbacksC2681f);
        for (int i8 = iIndexOf - 1; i8 >= 0; i8--) {
            ComponentCallbacksC2681f componentCallbacksC2681f2 = (ComponentCallbacksC2681f) this.f29657a.get(i8);
            if (componentCallbacksC2681f2.f29845H == viewGroup && (view2 = componentCallbacksC2681f2.f29846I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f29657a.size()) {
                return -1;
            }
            ComponentCallbacksC2681f componentCallbacksC2681f3 = (ComponentCallbacksC2681f) this.f29657a.get(iIndexOf);
            if (componentCallbacksC2681f3.f29845H == viewGroup && (view = componentCallbacksC2681f3.f29846I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                arrayList.add(e8);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                arrayList.add(e8.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        return new ArrayList(this.f29659c.values());
    }

    public E n(String str) {
        return (E) this.f29658b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f29657a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f29657a) {
            arrayList = new ArrayList(this.f29657a);
        }
        return arrayList;
    }

    public B p() {
        return this.f29660d;
    }

    public D q(String str) {
        return (D) this.f29659c.get(str);
    }

    public void s(E e8) {
        ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
        if (componentCallbacksC2681fK.f29840C) {
            this.f29660d.o(componentCallbacksC2681fK);
        }
        if (((E) this.f29658b.put(componentCallbacksC2681fK.f29862f, null)) != null && y.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC2681fK);
        }
    }

    public void t() {
        Iterator it = this.f29657a.iterator();
        while (it.hasNext()) {
            E e8 = (E) this.f29658b.get(((ComponentCallbacksC2681f) it.next()).f29862f);
            if (e8 != null) {
                e8.m();
            }
        }
        for (E e9 : this.f29658b.values()) {
            if (e9 != null) {
                e9.m();
                ComponentCallbacksC2681f componentCallbacksC2681fK = e9.k();
                if (componentCallbacksC2681fK.f29876m && !componentCallbacksC2681fK.b0()) {
                    if (componentCallbacksC2681fK.f29878n && !this.f29659c.containsKey(componentCallbacksC2681fK.f29862f)) {
                        e9.r();
                    }
                    s(e9);
                }
            }
        }
    }

    public void u(ComponentCallbacksC2681f componentCallbacksC2681f) {
        synchronized (this.f29657a) {
            this.f29657a.remove(componentCallbacksC2681f);
        }
        componentCallbacksC2681f.f29874l = false;
    }

    public void v() {
        this.f29658b.clear();
    }

    public void w(List list) {
        this.f29657a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC2681f componentCallbacksC2681fF = f(str);
                if (componentCallbacksC2681fF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (y.E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + componentCallbacksC2681fF);
                }
                a(componentCallbacksC2681fF);
            }
        }
    }

    public void x(ArrayList arrayList) {
        this.f29659c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d8 = (D) it.next();
            this.f29659c.put(d8.f29637b, d8);
        }
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f29658b.size());
        for (E e8 : this.f29658b.values()) {
            if (e8 != null) {
                ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                e8.r();
                arrayList.add(componentCallbacksC2681fK.f29862f);
                if (y.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC2681fK + ": " + componentCallbacksC2681fK.f29854b);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f29657a) {
            try {
                if (this.f29657a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f29657a.size());
                for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29657a) {
                    arrayList.add(componentCallbacksC2681f.f29862f);
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC2681f.f29862f + "): " + componentCallbacksC2681f);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(E e8) {
        ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
        if (!c(componentCallbacksC2681fK.f29862f)) {
            this.f29658b.put(componentCallbacksC2681fK.f29862f, e8);
            if (componentCallbacksC2681fK.f29841D) {
                if (componentCallbacksC2681fK.f29840C) {
                    this.f29660d.e(componentCallbacksC2681fK);
                } else {
                    this.f29660d.o(componentCallbacksC2681fK);
                }
                componentCallbacksC2681fK.f29841D = false;
            }
            if (y.E0(2)) {
                Log.v(ajyWhveMDgQ.pnuzNzmq, "Added fragment to active set " + componentCallbacksC2681fK);
            }
        }
    }
}
