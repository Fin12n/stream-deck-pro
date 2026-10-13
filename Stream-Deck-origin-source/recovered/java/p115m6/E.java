package p115m6;

import D6.M;
import D6.z;
import Q6.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class E implements B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f30072d;

    /* JADX WARN: Multi-variable type inference failed */
    public E() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // p115m6.B
    public Set a() {
        return l.a(this.f30072d.entrySet());
    }

    @Override // p115m6.B
    public final boolean b() {
        return this.f30071c;
    }

    @Override // p115m6.B
    public List c(String name) {
        t.g(name, "name");
        return f(name);
    }

    @Override // p115m6.B
    public boolean contains(String name) {
        t.g(name, "name");
        return f(name) != null;
    }

    @Override // p115m6.B
    public String d(String name) {
        t.g(name, "name");
        List listF = f(name);
        if (listF != null) {
            return (String) z.k0(listF);
        }
        return null;
    }

    @Override // p115m6.B
    public void e(o body) {
        t.g(body, "body");
        for (Map.Entry entry : this.f30072d.entrySet()) {
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        if (this.f30071c != b8.b()) {
            return false;
        }
        return F.d(a(), b8.a());
    }

    public final List f(String str) {
        return (List) this.f30072d.get(str);
    }

    public int hashCode() {
        return F.e(a(), Boolean.hashCode(this.f30071c) * 31);
    }

    @Override // p115m6.B
    public boolean isEmpty() {
        return this.f30072d.isEmpty();
    }

    @Override // p115m6.B
    public Set names() {
        return l.a(this.f30072d.keySet());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringValues(case=");
        sb.append(!this.f30071c);
        sb.append(") ");
        sb.append(a());
        return sb.toString();
    }

    public E(boolean z8, Map<String, ? extends List<String>> values) {
        t.g(values, "values");
        this.f30071c = z8;
        Map mapA = z8 ? m.a() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(value.get(i8));
            }
            mapA.put(key, arrayList);
        }
        this.f30072d = mapA;
    }

    public /* synthetic */ E(boolean z8, Map map, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? M.g() : map);
    }
}
