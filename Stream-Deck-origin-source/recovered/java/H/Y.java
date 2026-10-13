package H;

import A.AbstractC0890p0;
import A.C0886n0;
import A.C0904x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Y implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2921a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2922b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2923c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y4.a f2924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F1.c.a f2925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f2926f;

    public static /* synthetic */ void i(Y y8, J j8) {
        synchronized (y8.f2921a) {
            try {
                y8.f2923c.remove(j8);
                if (y8.f2923c.isEmpty()) {
                    T1.f.g(y8.f2925e);
                    y8.f2925e.c(null);
                    y8.f2925e = null;
                    y8.f2924d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object j(Y y8, F1.c.a aVar) {
        synchronized (y8.f2921a) {
            y8.f2925e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // H.C0
    public void d(List list) throws C0974d0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f2921a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f2922b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f2926f.d(str));
            }
            synchronized (this.f2921a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f2922b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<J> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((J) this.f2922b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (this.f2922b.containsKey(str2)) {
                            linkedHashMap.put(str2, (J) this.f2922b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (J) map.get(str2));
                        }
                    }
                    this.f2922b.clear();
                    this.f2922b.putAll(linkedHashMap);
                    for (J j8 : arrayList) {
                        if (j8 != null) {
                            j8.o();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0904x e8) {
            throw new C0974d0("Failed to create CameraInternal", e8);
        }
    }

    public Y4.a k() {
        synchronized (this.f2921a) {
            try {
                if (this.f2922b.isEmpty()) {
                    Y4.a aVarP = this.f2924d;
                    if (aVarP == null) {
                        aVarP = K.n.p(null);
                    }
                    return aVarP;
                }
                Y4.a aVarA = this.f2924d;
                if (aVarA == null) {
                    aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: H.W
                        @Override // F1.c.InterfaceC0112c
                        public final Object a(F1.c.a aVar) {
                            return Y.j(this.f2908a, aVar);
                        }
                    });
                    this.f2924d = aVarA;
                }
                this.f2923c.addAll(this.f2922b.values());
                for (final J j8 : this.f2922b.values()) {
                    j8.a().a(new Runnable() { // from class: H.X
                        @Override // java.lang.Runnable
                        public final void run() {
                            Y.i(this.f2915a, j8);
                        }
                    }, J.a.a());
                }
                this.f2922b.clear();
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public J l(String str) {
        J j8;
        synchronized (this.f2921a) {
            try {
                j8 = (J) this.f2922b.get(str);
                if (j8 == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }

    public LinkedHashSet m() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f2921a) {
            linkedHashSet = new LinkedHashSet(this.f2922b.values());
        }
        return linkedHashSet;
    }

    public void n(H h8) {
        this.f2926f = h8;
        synchronized (this.f2921a) {
            try {
                for (String str : h8.c()) {
                    AbstractC0890p0.a("CameraRepository", "Added camera: " + str);
                    J j8 = (J) this.f2922b.put(str, h8.d(str));
                    if (j8 != null) {
                        j8.a();
                    }
                }
            } catch (C0904x e8) {
                throw new C0886n0(e8);
            }
        }
    }
}
