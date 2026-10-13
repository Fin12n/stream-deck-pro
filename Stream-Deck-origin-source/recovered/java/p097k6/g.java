package p097k6;

import D6.C0934n;
import D6.C0938s;
import D6.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import p116m7.b;
import p116m7.m;
import p125n7.a;
import t7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final b a(Collection collection, c cVar) {
        Collection collection2 = collection;
        List listF0 = z.f0(collection2);
        ArrayList arrayList = new ArrayList(C0938s.y(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), cVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((b) obj).getDescriptor().a())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(C0938s.y(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((b) it2.next()).getDescriptor().a());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        b bVarJ = (b) z.G0(arrayList2);
        if (bVarJ == null) {
            bVarJ = a.J(O.f28784a);
        }
        if (bVarJ.getDescriptor().c()) {
            return bVarJ;
        }
        t.e(bVarJ, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return bVarJ;
        }
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (it3.next() == null) {
                return a.u(bVarJ);
            }
        }
        return bVarJ;
    }

    public static final b b(Object obj, c module) {
        b bVarB;
        t.g(module, "module");
        if (obj == null) {
            bVarB = a.u(a.J(O.f28784a));
        } else if (obj instanceof List) {
            bVarB = a.h(a((Collection) obj, module));
        } else if (obj instanceof Object[]) {
            Object objO = C0934n.O((Object[]) obj);
            if (objO == null || (bVarB = b(objO, module)) == null) {
                bVarB = a.h(a.J(O.f28784a));
            }
        } else if (obj instanceof Set) {
            bVarB = a.n(a((Collection) obj, module));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            bVarB = a.k(a(map.keySet(), module), a(map.values(), module));
        } else {
            b bVarC = c.c(module, K.b(obj.getClass()), null, 2, null);
            bVarB = bVarC == null ? m.b(K.b(obj.getClass())) : bVarC;
        }
        t.e(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return bVarB;
    }

    public static final b c(b bVar, p181u6.a aVar) {
        X6.m mVarA = aVar.a();
        return (mVarA == null || !mVarA.c()) ? bVar : a.u(bVar);
    }

    public static final b d(c cVar, p181u6.a typeInfo) {
        t.g(cVar, "<this>");
        t.g(typeInfo, "typeInfo");
        X6.m mVarA = typeInfo.a();
        if (mVarA != null) {
            b bVarE = mVarA.e().isEmpty() ? null : m.e(cVar, mVarA);
            if (bVarE != null) {
                return bVarE;
            }
        }
        b bVarC = c.c(cVar, typeInfo.b(), null, 2, null);
        return bVarC != null ? c(bVarC, typeInfo) : c(m.b(typeInfo.b()), typeInfo);
    }
}
