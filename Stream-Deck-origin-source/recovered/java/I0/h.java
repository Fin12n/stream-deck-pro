package I0;

import D6.M;
import D6.r;
import Z6.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f3713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3715c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f3718c;

        public a(String str, Function0 function0) {
            this.f3717b = str;
            this.f3718c = function0;
        }

        @Override // I0.g.a
        public void a() {
            List list = (List) h.this.f3715c.remove(this.f3717b);
            if (list != null) {
                list.remove(this.f3718c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            h.this.f3715c.put(this.f3717b, list);
        }
    }

    public h(Map<String, ? extends List<? extends Object>> map, Q6.k kVar) {
        Map mapY;
        this.f3713a = kVar;
        this.f3714b = (map == null || (mapY = M.y(map)) == null) ? new LinkedHashMap() : mapY;
        this.f3715c = new LinkedHashMap();
    }

    @Override // I0.g
    public boolean a(Object obj) {
        return ((Boolean) this.f3713a.invoke(obj)).booleanValue();
    }

    @Override // I0.g
    public Map b() {
        Map mapY = M.y(this.f3714b);
        for (Map.Entry entry : this.f3715c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((Function0) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    mapY.put(str, r.h(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    Object objInvoke2 = ((Function0) list.get(i8)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    arrayList.add(objInvoke2);
                }
                mapY.put(str, arrayList);
            }
        }
        return mapY;
    }

    @Override // I0.g
    public Object c(String str) {
        List list = (List) this.f3714b.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.f3714b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // I0.g
    public g.a d(String str, Function0 function0) {
        if (w.b0(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map = this.f3715c;
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        ((List) arrayList).add(function0);
        return new a(str, function0);
    }
}
