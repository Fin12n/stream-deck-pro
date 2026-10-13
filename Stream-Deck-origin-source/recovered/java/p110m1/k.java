package p110m1;

import C6.InterfaceC0919h;
import R6.a;
import Z.JTT.ryTuoS;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p065h1.AbstractC2409p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k implements x, Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29547a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29549c;

    public final Object A(w wVar, Function0 function0) {
        Object obj = this.f29547a.get(wVar);
        return obj == null ? function0.invoke() : obj;
    }

    public final boolean D() {
        return this.f29549c;
    }

    public final boolean E() {
        return this.f29548b;
    }

    public final void F(k kVar) {
        for (Map.Entry entry : kVar.f29547a.entrySet()) {
            w wVar = (w) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f29547a.get(wVar);
            t.e(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = wVar.c(obj, value);
            if (objC != null) {
                this.f29547a.put(wVar, objC);
            }
        }
    }

    public final void G(boolean z8) {
        this.f29549c = z8;
    }

    public final void H(boolean z8) {
        this.f29548b = z8;
    }

    @Override // p110m1.x
    public void c(w wVar, Object obj) {
        if (!(obj instanceof a) || !o(wVar)) {
            this.f29547a.put(wVar, obj);
            return;
        }
        Object obj2 = this.f29547a.get(wVar);
        t.e(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        Map map = this.f29547a;
        a aVar2 = (a) obj;
        String strB = aVar2.b();
        if (strB == null) {
            strB = aVar.b();
        }
        InterfaceC0919h interfaceC0919hA = aVar2.a();
        if (interfaceC0919hA == null) {
            interfaceC0919hA = aVar.a();
        }
        map.put(wVar, new a(strB, interfaceC0919hA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return t.c(this.f29547a, kVar.f29547a) && this.f29548b == kVar.f29548b && this.f29549c == kVar.f29549c;
    }

    public int hashCode() {
        return (((this.f29547a.hashCode() * 31) + Boolean.hashCode(this.f29548b)) * 31) + Boolean.hashCode(this.f29549c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f29547a.entrySet().iterator();
    }

    public final void m(k kVar) {
        if (kVar.f29548b) {
            this.f29548b = true;
        }
        if (kVar.f29549c) {
            this.f29549c = true;
        }
        for (Map.Entry entry : kVar.f29547a.entrySet()) {
            w wVar = (w) entry.getKey();
            Object value = entry.getValue();
            if (!this.f29547a.containsKey(wVar)) {
                this.f29547a.put(wVar, value);
            } else if (value instanceof a) {
                Object obj = this.f29547a.get(wVar);
                t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map map = this.f29547a;
                String strB = aVar.b();
                if (strB == null) {
                    strB = ((a) value).b();
                }
                InterfaceC0919h interfaceC0919hA = aVar.a();
                if (interfaceC0919hA == null) {
                    interfaceC0919hA = ((a) value).a();
                }
                map.put(wVar, new a(strB, interfaceC0919hA));
            }
        }
    }

    public final boolean o(w wVar) {
        return this.f29547a.containsKey(wVar);
    }

    public final boolean s() {
        Set setKeySet = this.f29547a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((w) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final k t() {
        k kVar = new k();
        kVar.f29548b = this.f29548b;
        kVar.f29549c = this.f29549c;
        kVar.f29547a.putAll(this.f29547a);
        return kVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f29548b) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f29549c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f29547a.entrySet()) {
            w wVar = (w) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(wVar.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return AbstractC2409p0.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final Object y(w wVar, Function0 function0) {
        Object obj = this.f29547a.get(wVar);
        return obj == null ? function0.invoke() : obj;
    }

    public final Object u(w wVar) {
        Object obj = this.f29547a.get(wVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + wVar + ryTuoS.yLpkv);
    }
}
