package p206y;

import A.AbstractC0890p0;
import A.C0886n0;
import A.InterfaceC0896t;
import H.C0974d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p166t.V0;
import p174u.e;
import p174u.t;
import p214z.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a implements B.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f37532b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37531a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f37534d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f37535e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f37536f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37537g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f37533c = new ArrayList();

    public a(t tVar) {
        this.f37532b = tVar;
        try {
            d(Arrays.asList(tVar.d()));
        } catch (C0974d0 | e e8) {
            AbstractC0890p0.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e8);
        }
    }

    @Override // B.a
    public int c() {
        int i8;
        synchronized (this.f37531a) {
            i8 = this.f37537g;
        }
        return i8;
    }

    @Override // H.C0
    public void d(List list) throws C0974d0 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f37532b.e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (V0.a(this.f37532b, str) && V0.a(this.f37532b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (C0886n0 unused) {
                            AbstractC0890p0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f37531a) {
                this.f37534d = map;
                this.f37535e = hashSet;
                AbstractC0890p0.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f37534d);
            }
        } catch (e e8) {
            throw new C0974d0("Failed to retrieve concurrent camera id info.", e8);
        }
    }

    @Override // B.a
    public void f(B.a.InterfaceC0021a interfaceC0021a) {
        synchronized (this.f37531a) {
            this.f37533c.add(interfaceC0021a);
        }
    }

    @Override // B.a
    public String g(String str) {
        synchronized (this.f37531a) {
            try {
                if (!this.f37534d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f37534d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f37536f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(h.a((InterfaceC0896t) it.next()).b())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B.a
    public void h(int i8) {
        synchronized (this.f37531a) {
            try {
                int i9 = this.f37537g;
                if (i8 == i9) {
                    return;
                }
                this.f37537g = i8;
                ArrayList arrayList = new ArrayList(this.f37533c);
                if (i9 == 2 && i8 != 2) {
                    this.f37536f.clear();
                }
                i(arrayList, i9, i8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(List list, int i8, int i9) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((B.a.InterfaceC0021a) it.next()).a(i8, i9);
        }
    }

    @Override // B.a
    public void shutdown() {
        synchronized (this.f37531a) {
            this.f37533c.clear();
            this.f37534d.clear();
            this.f37536f.clear();
            this.f37535e.clear();
            this.f37537g = 0;
        }
    }
}
