package p111m2;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2676a extends G implements y.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f29749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f29750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29752w;

    public C2676a(y yVar) {
        super(yVar.p0(), yVar.r0() != null ? yVar.r0().o().getClassLoader() : null);
        this.f29751v = -1;
        this.f29752w = false;
        this.f29749t = yVar;
    }

    @Override // m2.y.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f29669i) {
            return true;
        }
        this.f29749t.g(this);
        return true;
    }

    @Override // p111m2.G
    public int f() {
        return o(false);
    }

    @Override // p111m2.G
    public int g() {
        return o(true);
    }

    @Override // p111m2.G
    public void h() {
        j();
        this.f29749t.Z(this, false);
    }

    @Override // p111m2.G
    public void i() {
        j();
        this.f29749t.Z(this, true);
    }

    @Override // p111m2.G
    public void k(int i8, ComponentCallbacksC2681f componentCallbacksC2681f, String str, int i9) {
        super.k(i8, componentCallbacksC2681f, str, i9);
        componentCallbacksC2681f.f29884t = this.f29749t;
    }

    @Override // p111m2.G
    public G l(ComponentCallbacksC2681f componentCallbacksC2681f) {
        y yVar = componentCallbacksC2681f.f29884t;
        if (yVar == null || yVar == this.f29749t) {
            return super.l(componentCallbacksC2681f);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC2681f.toString() + " is already attached to a FragmentManager.");
    }

    public void n(int i8) {
        if (this.f29669i) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i8);
            }
            int size = this.f29663c.size();
            for (int i9 = 0; i9 < size; i9++) {
                G.a aVar = (G.a) this.f29663c.get(i9);
                ComponentCallbacksC2681f componentCallbacksC2681f = aVar.f29681b;
                if (componentCallbacksC2681f != null) {
                    componentCallbacksC2681f.f29883s += i8;
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f29681b + " to " + aVar.f29681b.f29883s);
                    }
                }
            }
        }
    }

    public int o(boolean z8) {
        if (this.f29750u) {
            throw new IllegalStateException("commit already called");
        }
        if (y.E0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new L("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.f29750u = true;
        if (this.f29669i) {
            this.f29751v = this.f29749t.j();
        } else {
            this.f29751v = -1;
        }
        this.f29749t.W(this, z8);
        return this.f29751v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f29671k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f29751v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f29750u);
            if (this.f29668h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f29668h));
            }
            if (this.f29664d != 0 || this.f29665e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29664d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29665e));
            }
            if (this.f29666f != 0 || this.f29667g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29666f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29667g));
            }
            if (this.f29672l != 0 || this.f29673m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29672l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f29673m);
            }
            if (this.f29674n != 0 || this.f29675o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29674n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f29675o);
            }
        }
        if (this.f29663c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f29663c.size();
        for (int i8 = 0; i8 < size; i8++) {
            G.a aVar = (G.a) this.f29663c.get(i8);
            switch (aVar.f29680a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f29680a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i8);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f29681b);
            if (z8) {
                if (aVar.f29683d != 0 || aVar.f29684e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f29683d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f29684e));
                }
                if (aVar.f29685f != 0 || aVar.f29686g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f29685f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f29686g));
                }
            }
        }
    }

    public void r() {
        int size = this.f29663c.size();
        for (int i8 = 0; i8 < size; i8++) {
            G.a aVar = (G.a) this.f29663c.get(i8);
            ComponentCallbacksC2681f componentCallbacksC2681f = aVar.f29681b;
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.f29878n = this.f29752w;
                componentCallbacksC2681f.x1(false);
                componentCallbacksC2681f.w1(this.f29668h);
                componentCallbacksC2681f.z1(this.f29676p, this.f29677q);
            }
            switch (aVar.f29680a) {
                case 1:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, false);
                    this.f29749t.h(componentCallbacksC2681f);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f29680a);
                case 3:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.W0(componentCallbacksC2681f);
                    break;
                case 4:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.B0(componentCallbacksC2681f);
                    break;
                case 5:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, false);
                    this.f29749t.h1(componentCallbacksC2681f);
                    break;
                case 6:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.u(componentCallbacksC2681f);
                    break;
                case 7:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, false);
                    this.f29749t.l(componentCallbacksC2681f);
                    break;
                case 8:
                    this.f29749t.f1(componentCallbacksC2681f);
                    break;
                case 9:
                    this.f29749t.f1(null);
                    break;
                case 10:
                    this.f29749t.e1(componentCallbacksC2681f, aVar.f29688i);
                    break;
            }
        }
    }

    public void s() {
        for (int size = this.f29663c.size() - 1; size >= 0; size--) {
            G.a aVar = (G.a) this.f29663c.get(size);
            ComponentCallbacksC2681f componentCallbacksC2681f = aVar.f29681b;
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.f29878n = this.f29752w;
                componentCallbacksC2681f.x1(true);
                componentCallbacksC2681f.w1(y.a1(this.f29668h));
                componentCallbacksC2681f.z1(this.f29677q, this.f29676p);
            }
            switch (aVar.f29680a) {
                case 1:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, true);
                    this.f29749t.W0(componentCallbacksC2681f);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f29680a);
                case 3:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.h(componentCallbacksC2681f);
                    break;
                case 4:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.h1(componentCallbacksC2681f);
                    break;
                case 5:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, true);
                    this.f29749t.B0(componentCallbacksC2681f);
                    break;
                case 6:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.l(componentCallbacksC2681f);
                    break;
                case 7:
                    componentCallbacksC2681f.t1(aVar.f29683d, aVar.f29684e, aVar.f29685f, aVar.f29686g);
                    this.f29749t.d1(componentCallbacksC2681f, true);
                    this.f29749t.u(componentCallbacksC2681f);
                    break;
                case 8:
                    this.f29749t.f1(null);
                    break;
                case 9:
                    this.f29749t.f1(componentCallbacksC2681f);
                    break;
                case 10:
                    this.f29749t.e1(componentCallbacksC2681f, aVar.f29687h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public ComponentCallbacksC2681f t(ArrayList arrayList, ComponentCallbacksC2681f componentCallbacksC2681f) {
        ComponentCallbacksC2681f componentCallbacksC2681f2 = componentCallbacksC2681f;
        int i8 = 0;
        while (i8 < this.f29663c.size()) {
            G.a aVar = (G.a) this.f29663c.get(i8);
            int i9 = aVar.f29680a;
            if (i9 == 1) {
                arrayList.add(aVar.f29681b);
            } else if (i9 == 2) {
                ComponentCallbacksC2681f componentCallbacksC2681f3 = aVar.f29681b;
                int i10 = componentCallbacksC2681f3.f29889y;
                boolean z8 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ComponentCallbacksC2681f componentCallbacksC2681f4 = (ComponentCallbacksC2681f) arrayList.get(size);
                    if (componentCallbacksC2681f4.f29889y == i10) {
                        if (componentCallbacksC2681f4 == componentCallbacksC2681f3) {
                            z8 = true;
                        } else {
                            if (componentCallbacksC2681f4 == componentCallbacksC2681f2) {
                                this.f29663c.add(i8, new G.a(9, componentCallbacksC2681f4, true));
                                i8++;
                                componentCallbacksC2681f2 = null;
                            }
                            G.a aVar2 = new G.a(3, componentCallbacksC2681f4, true);
                            aVar2.f29683d = aVar.f29683d;
                            aVar2.f29685f = aVar.f29685f;
                            aVar2.f29684e = aVar.f29684e;
                            aVar2.f29686g = aVar.f29686g;
                            this.f29663c.add(i8, aVar2);
                            arrayList.remove(componentCallbacksC2681f4);
                            i8++;
                        }
                    }
                }
                if (z8) {
                    this.f29663c.remove(i8);
                    i8--;
                } else {
                    aVar.f29680a = 1;
                    aVar.f29682c = true;
                    arrayList.add(componentCallbacksC2681f3);
                }
            } else if (i9 == 3 || i9 == 6) {
                arrayList.remove(aVar.f29681b);
                ComponentCallbacksC2681f componentCallbacksC2681f5 = aVar.f29681b;
                if (componentCallbacksC2681f5 == componentCallbacksC2681f2) {
                    this.f29663c.add(i8, new G.a(9, componentCallbacksC2681f5));
                    i8++;
                    componentCallbacksC2681f2 = null;
                }
            } else if (i9 == 7) {
                arrayList.add(aVar.f29681b);
            } else if (i9 == 8) {
                this.f29663c.add(i8, new G.a(9, componentCallbacksC2681f2, true));
                aVar.f29682c = true;
                i8++;
                componentCallbacksC2681f2 = aVar.f29681b;
            }
            i8++;
        }
        return componentCallbacksC2681f2;
    }

    public String u() {
        return this.f29671k;
    }

    public void v() {
        if (this.f29679s != null) {
            for (int i8 = 0; i8 < this.f29679s.size(); i8++) {
                ((Runnable) this.f29679s.get(i8)).run();
            }
            this.f29679s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public ComponentCallbacksC2681f w(ArrayList arrayList, ComponentCallbacksC2681f componentCallbacksC2681f) {
        for (int size = this.f29663c.size() - 1; size >= 0; size--) {
            G.a aVar = (G.a) this.f29663c.get(size);
            int i8 = aVar.f29680a;
            if (i8 == 1) {
                arrayList.remove(aVar.f29681b);
            } else if (i8 != 3) {
                switch (i8) {
                    case 6:
                        arrayList.add(aVar.f29681b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f29681b);
                        break;
                    case 8:
                        componentCallbacksC2681f = null;
                        break;
                    case 9:
                        componentCallbacksC2681f = aVar.f29681b;
                        break;
                    case 10:
                        aVar.f29688i = aVar.f29687h;
                        break;
                }
            } else {
                arrayList.add(aVar.f29681b);
            }
        }
        return componentCallbacksC2681f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(vHKCAgr.GMOwg);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f29751v >= 0) {
            sb.append(" #");
            sb.append(this.f29751v);
        }
        if (this.f29671k != null) {
            sb.append(" ");
            sb.append(this.f29671k);
        }
        sb.append("}");
        return sb.toString();
    }
}
