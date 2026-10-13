package p134p;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f31017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f31018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f31019c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31020d = 0;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        public c c(c cVar) {
            return cVar.f31024d;
        }

        @Override // p.b.e
        public c d(c cVar) {
            return cVar.f31023c;
        }
    }

    /* JADX INFO: renamed from: p.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0663b extends e {
        public C0663b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        public c c(c cVar) {
            return cVar.f31023c;
        }

        @Override // p.b.e
        public c d(c cVar) {
            return cVar.f31024d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f31021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f31022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f31023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f31024d;

        public c(Object obj, Object obj2) {
            this.f31021a = obj;
            this.f31022b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f31021a.equals(cVar.f31021a) && this.f31022b.equals(cVar.f31022b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f31021a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f31022b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f31021a.hashCode() ^ this.f31022b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f31021a + com.amazon.a.a.o.b.f.f16778b + this.f31022b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f31025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31026b = true;

        public d() {
        }

        @Override // p.b.f
        public void b(c cVar) {
            c cVar2 = this.f31025a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f31024d;
                this.f31025a = cVar3;
                this.f31026b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f31026b) {
                this.f31026b = false;
                this.f31025a = b.this.f31017a;
            } else {
                c cVar = this.f31025a;
                this.f31025a = cVar != null ? cVar.f31023c : null;
            }
            return this.f31025a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31026b) {
                return b.this.f31017a != null;
            }
            c cVar = this.f31025a;
            return (cVar == null || cVar.f31023c == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f31028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f31029b;

        public e(c cVar, c cVar2) {
            this.f31028a = cVar2;
            this.f31029b = cVar;
        }

        @Override // p.b.f
        public void b(c cVar) {
            if (this.f31028a == cVar && cVar == this.f31029b) {
                this.f31029b = null;
                this.f31028a = null;
            }
            c cVar2 = this.f31028a;
            if (cVar2 == cVar) {
                this.f31028a = c(cVar2);
            }
            if (this.f31029b == cVar) {
                this.f31029b = f();
            }
        }

        public abstract c c(c cVar);

        public abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f31029b;
            this.f31029b = f();
            return cVar;
        }

        public final c f() {
            c cVar = this.f31029b;
            c cVar2 = this.f31028a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31029b != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {
        public abstract void b(c cVar);
    }

    public Map.Entry c() {
        return this.f31017a;
    }

    public Iterator descendingIterator() {
        C0663b c0663b = new C0663b(this.f31018b, this.f31017a);
        this.f31019c.put(c0663b, Boolean.FALSE);
        return c0663b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f31017a, this.f31018b);
        this.f31019c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public c m(Object obj) {
        c cVar = this.f31017a;
        while (cVar != null && !cVar.f31021a.equals(obj)) {
            cVar = cVar.f31023c;
        }
        return cVar;
    }

    public d o() {
        d dVar = new d();
        this.f31019c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry s() {
        return this.f31018b;
    }

    public int size() {
        return this.f31020d;
    }

    public c t(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f31020d++;
        c cVar2 = this.f31018b;
        if (cVar2 == null) {
            this.f31017a = cVar;
            this.f31018b = cVar;
            return cVar;
        }
        cVar2.f31023c = cVar;
        cVar.f31024d = cVar2;
        this.f31018b = cVar;
        return cVar;
    }

    public Object u(Object obj, Object obj2) {
        c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.f31022b;
        }
        t(obj, obj2);
        return null;
    }

    public Object y(Object obj) {
        c cVarM = m(obj);
        if (cVarM == null) {
            return null;
        }
        this.f31020d--;
        if (!this.f31019c.isEmpty()) {
            Iterator it = this.f31019c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(cVarM);
            }
        }
        c cVar = cVarM.f31024d;
        if (cVar != null) {
            cVar.f31023c = cVarM.f31023c;
        } else {
            this.f31017a = cVarM.f31023c;
        }
        c cVar2 = cVarM.f31023c;
        if (cVar2 != null) {
            cVar2.f31024d = cVar;
        } else {
            this.f31018b = cVar;
        }
        cVarM.f31023c = null;
        cVarM.f31024d = null;
        return cVarM.f31022b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(ajyWhveMDgQ.LfupFe);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
