package p115m6;

import C6.G;
import D6.z;
import E4.JFpq.XRlnZWSrAFn;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class D implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f30069b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {
        public a() {
            super(2);
        }

        public final void b(String name, List values) {
            t.g(name, "name");
            t.g(values, "values");
            D.this.e(name, values);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (List) obj2);
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // p115m6.C
    public Set a() {
        return l.a(this.f30069b.entrySet());
    }

    @Override // p115m6.C
    public final boolean b() {
        return this.f30068a;
    }

    @Override // p115m6.C
    public List c(String name) {
        t.g(name, "name");
        return (List) this.f30069b.get(name);
    }

    @Override // p115m6.C
    public void clear() {
        this.f30069b.clear();
    }

    @Override // p115m6.C
    public void d(B stringValues) {
        t.g(stringValues, "stringValues");
        stringValues.e(new a());
    }

    @Override // p115m6.C
    public void e(String name, Iterable values) {
        t.g(name, "name");
        t.g(values, "values");
        List listH = h(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n(str);
            listH.add(str);
        }
    }

    @Override // p115m6.C
    public void f(String name, String value) {
        t.g(name, "name");
        t.g(value, "value");
        n(value);
        h(name).add(value);
    }

    public boolean g(String name, String value) {
        t.g(name, "name");
        t.g(value, "value");
        List list = (List) this.f30069b.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    public final List h(String str) {
        List list = (List) this.f30069b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        m(str);
        this.f30069b.put(str, arrayList);
        return arrayList;
    }

    @Override // p115m6.C
    public boolean isEmpty() {
        return this.f30069b.isEmpty();
    }

    public final Map j() {
        return this.f30069b;
    }

    public void k(String name) {
        t.g(name, "name");
        this.f30069b.remove(name);
    }

    public void l(String name, String value) {
        t.g(name, "name");
        t.g(value, "value");
        n(value);
        List listH = h(name);
        listH.clear();
        listH.add(value);
    }

    public void m(String name) {
        t.g(name, "name");
    }

    public void n(String value) {
        t.g(value, "value");
    }

    @Override // p115m6.C
    public Set names() {
        return this.f30069b.keySet();
    }

    public D(boolean z8, int i8) {
        this.f30068a = z8;
        this.f30069b = z8 ? m.a() : new LinkedHashMap(i8);
    }

    public String i(String str) {
        t.g(str, XRlnZWSrAFn.UDVnyJTMzpOLDP);
        List listC = c(str);
        if (listC != null) {
            return (String) z.k0(listC);
        }
        return null;
    }

    public /* synthetic */ D(boolean z8, int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? 8 : i8);
    }
}
