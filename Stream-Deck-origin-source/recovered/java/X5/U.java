package X5;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f11792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11793b;

    public U(D encodedParametersBuilder) {
        kotlin.jvm.internal.t.g(encodedParametersBuilder, "encodedParametersBuilder");
        this.f11792a = encodedParametersBuilder;
        this.f11793b = encodedParametersBuilder.b();
    }

    @Override // p115m6.C
    public Set a() {
        return V.d(this.f11792a).a();
    }

    @Override // p115m6.C
    public boolean b() {
        return this.f11793b;
    }

    @Override // X5.D
    public C build() {
        return V.d(this.f11792a);
    }

    @Override // p115m6.C
    public List c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        List listC = this.f11792a.c(AbstractC1673b.m(name, false, 1, null));
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C0938s.y(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1673b.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // p115m6.C
    public void clear() {
        this.f11792a.clear();
    }

    @Override // p115m6.C
    public void d(p115m6.B stringValues) {
        kotlin.jvm.internal.t.g(stringValues, "stringValues");
        V.c(this.f11792a, stringValues);
    }

    @Override // p115m6.C
    public void e(String name, Iterable values) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(values, "values");
        D d8 = this.f11792a;
        String strM = AbstractC1673b.m(name, false, 1, null);
        ArrayList arrayList = new ArrayList(C0938s.y(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1673b.n((String) it.next()));
        }
        d8.e(strM, arrayList);
    }

    @Override // p115m6.C
    public void f(String name, String value) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(value, "value");
        this.f11792a.f(AbstractC1673b.m(name, false, 1, null), AbstractC1673b.n(value));
    }

    @Override // p115m6.C
    public boolean isEmpty() {
        return this.f11792a.isEmpty();
    }

    @Override // p115m6.C
    public Set names() {
        Set setNames = this.f11792a.names();
        ArrayList arrayList = new ArrayList(C0938s.y(setNames, 10));
        Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1673b.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return D6.z.W0(arrayList);
    }
}
