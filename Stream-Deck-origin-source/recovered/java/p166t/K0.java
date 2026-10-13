package p166t;

import A.C0904x;
import H.C0974d0;
import H.G;
import H.h1;
import H.j1;
import H.l1;
import T1.f;
import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p158s.n;
import p174u.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K0 implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f33363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2937g f33364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f33366e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements InterfaceC2937g {
        @Override // p166t.InterfaceC2937g
        public CamcorderProfile a(int i8, int i9) {
            return CamcorderProfile.get(i8, i9);
        }

        @Override // p166t.InterfaceC2937g
        public boolean b(int i8, int i9) {
            return CamcorderProfile.hasProfile(i8, i9);
        }
    }

    public K0(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    @Override // H.G
    public j1 b(int i8, String str, int i9, Size size, h1 h1Var) {
        R1 r8 = (R1) this.f33363b.get(str);
        f.b(r8 != null, "No such camera id in supported combination list: " + str);
        return r8.a0(i8, i9, size, h1Var);
    }

    @Override // H.C0
    public void d(List list) throws C0974d0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f33362a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f33363b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, i(str));
            }
            synchronized (this.f33362a) {
                try {
                    HashMap map2 = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (this.f33363b.containsKey(str2)) {
                            map2.put(str2, (R1) this.f33363b.get(str2));
                        } else {
                            map2.put(str2, (R1) map.get(str2));
                        }
                    }
                    this.f33363b.clear();
                    this.f33363b.putAll(map2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0904x | RuntimeException e8) {
            throw new C0974d0("Failed to create SupportedSurfaceCombination", e8);
        }
    }

    @Override // H.G
    public l1 e(int i8, String str, List list, Map map, boolean z8, boolean z9, boolean z10, boolean z11) {
        f.b(!map.isEmpty(), "No new use cases to be bound.");
        R1 r8 = (R1) this.f33363b.get(str);
        f.b(r8 != null, "No such camera id in supported combination list: " + str);
        return r8.K(i8, list, map, z8, z9, z10, z11);
    }

    public final R1 i(String str) {
        D.a nVar = D.a.f1667b;
        if (Build.VERSION.SDK_INT >= 35) {
            nVar = new n(this.f33366e, str, this.f33365d);
        }
        return new R1(this.f33366e, str, this.f33365d, this.f33364c, nVar);
    }

    public K0(Context context, InterfaceC2937g interfaceC2937g, Object obj, Set set) throws C0904x {
        this.f33362a = new Object();
        this.f33363b = new HashMap();
        f.g(interfaceC2937g);
        this.f33364c = interfaceC2937g;
        this.f33366e = context;
        if (obj instanceof t) {
            this.f33365d = (t) obj;
        } else {
            this.f33365d = t.a(context);
        }
        try {
            d(new ArrayList(set));
        } catch (C0974d0 e8) {
            if (!(e8.getCause() instanceof C0904x)) {
                throw new C0904x(3, e8);
            }
            throw ((C0904x) e8.getCause());
        }
    }
}
