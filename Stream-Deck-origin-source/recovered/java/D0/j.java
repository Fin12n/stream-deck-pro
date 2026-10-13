package D0;

import D6.C0933m;
import D6.C0934n;
import H.FL.dCqzKmEghGTQ;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b implements C0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1709c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1710d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f1711e = new j(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1712b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return j.f1711e;
        }

        public a() {
        }
    }

    public j(Object[] objArr) {
        this.f1712b = objArr;
        G0.a.a(objArr.length <= 32);
    }

    @Override // java.util.Collection, java.util.List, C0.e
    public C0.e add(Object obj) {
        if (size() >= 32) {
            return new e(this.f1712b, l.c(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f1712b, size() + 1);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = obj;
        return new j(objArrCopyOf);
    }

    @Override // C0.e
    public C0.e.a builder() {
        return new f(this, null, this.f1712b, 0);
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f1712b.length;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public Object get(int i8) {
        G0.d.a(i8, size());
        return this.f1712b[i8];
    }

    @Override // C0.e
    public C0.e i(Q6.k kVar) {
        Object[] objArrCopyOf = this.f1712b;
        int size = size();
        int size2 = size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size2; i8++) {
            Object obj = this.f1712b[i8];
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (!z8) {
                    Object[] objArr = this.f1712b;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    t.f(objArrCopyOf, "copyOf(this, size)");
                    z8 = true;
                    size = i8;
                }
            } else if (z8) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f1711e : new j(C0933m.o(objArrCopyOf, 0, size));
    }

    @Override // D6.AbstractC0922b, java.util.List
    public int indexOf(Object obj) {
        return C0934n.Y(this.f1712b, obj);
    }

    @Override // D6.AbstractC0922b, java.util.List
    public int lastIndexOf(Object obj) {
        return C0934n.i0(this.f1712b, obj);
    }

    @Override // D6.AbstractC0922b, java.util.List
    public ListIterator listIterator(int i8) {
        G0.d.b(i8, size());
        return new c(this.f1712b, i8, size());
    }

    @Override // C0.e
    public C0.e q(int i8) {
        G0.d.a(i8, size());
        if (size() == 1) {
            return f1711e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f1712b, size() - 1);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        C0933m.i(this.f1712b, objArrCopyOf, i8, i8 + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // D6.AbstractC0922b, java.util.List, C0.e
    public C0.e set(int i8, Object obj) {
        G0.d.a(i8, size());
        Object[] objArr = this.f1712b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        t.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i8] = obj;
        return new j(objArrCopyOf);
    }

    public final Object[] t(int i8) {
        return new Object[i8];
    }

    @Override // D0.b, java.util.Collection, java.util.List, C0.e
    public C0.e addAll(Collection collection) {
        if (size() + collection.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f1712b, size() + collection.size());
            t.f(objArrCopyOf, dCqzKmEghGTQ.OchSejNdopUoYC);
            int size = size();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new j(objArrCopyOf);
        }
        C0.e.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // java.util.List, C0.e
    public C0.e add(int i8, Object obj) {
        G0.d.b(i8, size());
        if (i8 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrT = t(size() + 1);
            C0933m.m(this.f1712b, objArrT, 0, 0, i8, 6, null);
            C0933m.i(this.f1712b, objArrT, i8 + 1, i8, size());
            objArrT[i8] = obj;
            return new j(objArrT);
        }
        Object[] objArr = this.f1712b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        t.f(objArrCopyOf, "copyOf(this, size)");
        C0933m.i(this.f1712b, objArrCopyOf, i8 + 1, i8, size() - 1);
        objArrCopyOf[i8] = obj;
        return new e(objArrCopyOf, l.c(this.f1712b[31]), size() + 1, 0);
    }
}
