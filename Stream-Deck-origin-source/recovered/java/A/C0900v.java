package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: A.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0900v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0900v f313c = new a().b(0).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0900v f314d = new a().b(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316b;

    /* JADX INFO: renamed from: A.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f317a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f318b;

        public C0900v a() {
            return new C0900v(this.f317a, this.f318b);
        }

        public a b(int i8) {
            T1.f.j(i8 != -1, "The specified lens facing is invalid.");
            this.f317a.add(new H.D0(i8));
            return this;
        }
    }

    public C0900v(LinkedHashSet linkedHashSet, String str) {
        this.f315a = linkedHashSet;
        this.f316b = str;
    }

    public LinkedHashSet a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((H.J) it.next()).c());
        }
        List listB = b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            H.J j8 = (H.J) it2.next();
            if (listB.contains(j8.c())) {
                linkedHashSet2.add(j8);
            }
        }
        return linkedHashSet2;
    }

    public List b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f315a.iterator();
        while (it.hasNext()) {
            arrayList = ((r) it.next()).b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet c() {
        return this.f315a;
    }

    public Integer d() {
        Integer num = null;
        for (r rVar : this.f315a) {
            if (rVar instanceof H.D0) {
                Integer numValueOf = Integer.valueOf(((H.D0) rVar).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final String e(Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cams:");
        sb.append(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H.I iR = ((H.J) it.next()).r();
            sb.append(String.format(" Id:%s  Lens:%s", iR.e(), Integer.valueOf(iR.i())));
        }
        return sb.toString();
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("PhyId:%s  Filters:%s", this.f316b, Integer.valueOf(this.f315a.size())));
        for (r rVar : this.f315a) {
            sb.append(" Id:");
            sb.append(rVar.a());
            if (rVar instanceof H.D0) {
                sb.append(" LensFilter:");
                sb.append(((H.D0) rVar).c());
            }
        }
        return sb.toString();
    }

    public H.J g(LinkedHashSet linkedHashSet) {
        Iterator it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (H.J) it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }
}
