package p215z0;

import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f38641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38642d;

    public P(int i8, String str) {
        this.f38639a = i8;
        this.f38640b = str;
    }

    public final void a(Object obj) {
        ArrayList arrayList = this.f38641c;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f38641c = arrayList;
        arrayList.add(obj);
    }

    public final void b(W0 w8, int i8, int i9) {
        C3147d c3147dG1;
        ArrayList arrayList = this.f38641c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f38641c = arrayList;
        }
        int i10 = 0;
        if (i8 >= 0 && (c3147dG1 = w8.g1(i8)) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                if (!t.c(obj, c3147dG1) && (!(obj instanceof P) || !((P) obj).e(c3147dG1))) {
                    i10++;
                }
            }
            i10 = -1;
        }
        arrayList.add(i10, w8.F(i9));
    }

    public final ArrayList c() {
        return this.f38641c;
    }

    public final int d() {
        return this.f38639a;
    }

    public final boolean e(C3147d c3147d) {
        ArrayList arrayList = this.f38641c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = arrayList.get(i8);
                if (t.c(obj, c3147d)) {
                    return true;
                }
                if ((obj instanceof P) && ((P) obj).e(c3147d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final P f() {
        Object obj;
        P pF;
        ArrayList arrayList = this.f38641c;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if ((obj instanceof P) && !((P) obj).f38642d) {
                break;
            }
            size--;
        }
        P p8 = obj instanceof P ? (P) obj : null;
        return (p8 == null || (pF = p8.f()) == null) ? this : pF;
    }

    public final boolean g(C3147d c3147d) {
        ArrayList arrayList = this.f38641c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C3147d) {
                    if (t.c(obj, c3147d)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof P) && !((P) obj).g(c3147d)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f38641c = null;
                return false;
            }
        }
        return true;
    }

    public final void h(T0 t8, int i8) {
        f().a(t8.c(i8));
    }

    public final void i(W0 w8, int i8) {
        f().a(w8.F(i8));
    }
}
