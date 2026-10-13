package p116m7;

import C6.C0920i;
import C6.o;
import C6.q;
import D6.C0938s;
import X6.d;
import X6.f;
import X6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q7.AbstractC2868v0;
import q7.AbstractC2870w0;
import q7.C2829b0;
import q7.C2836f;
import q7.F0;
import q7.M;
import q7.O;
import q7.Z;
import t7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f30152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.f30152a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return ((m) this.f30152a.get(0)).f();
        }
    }

    public static final b a(d dVar, List list, Function0 function0) {
        if (t.c(dVar, K.b(Collection.class)) ? true : t.c(dVar, K.b(List.class)) ? true : t.c(dVar, K.b(List.class)) ? true : t.c(dVar, K.b(ArrayList.class))) {
            return new C2836f((b) list.get(0));
        }
        if (t.c(dVar, K.b(HashSet.class))) {
            return new O((b) list.get(0));
        }
        if (t.c(dVar, K.b(Set.class)) ? true : t.c(dVar, K.b(Set.class)) ? true : t.c(dVar, K.b(LinkedHashSet.class))) {
            return new C2829b0((b) list.get(0));
        }
        if (t.c(dVar, K.b(HashMap.class))) {
            return new M((b) list.get(0), (b) list.get(1));
        }
        if (t.c(dVar, K.b(Map.class)) ? true : t.c(dVar, K.b(Map.class)) ? true : t.c(dVar, K.b(LinkedHashMap.class))) {
            return new Z((b) list.get(0), (b) list.get(1));
        }
        if (t.c(dVar, K.b(Map.Entry.class))) {
            return p125n7.a.j((b) list.get(0), (b) list.get(1));
        }
        if (t.c(dVar, K.b(o.class))) {
            return p125n7.a.m((b) list.get(0), (b) list.get(1));
        }
        if (t.c(dVar, K.b(C6.u.class))) {
            return p125n7.a.p((b) list.get(0), (b) list.get(1), (b) list.get(2));
        }
        if (!AbstractC2868v0.n(dVar)) {
            return null;
        }
        Object objInvoke = function0.invoke();
        t.e(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return p125n7.a.a((d) objInvoke, (b) list.get(0));
    }

    public static final b b(d dVar, List list) {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        return AbstractC2868v0.c(dVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final b c(b bVar, boolean z8) {
        if (z8) {
            return p125n7.a.u(bVar);
        }
        t.e(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b d(d dVar, List serializers, Function0 elementClassifierIfArray) {
        t.g(dVar, "<this>");
        t.g(serializers, "serializers");
        t.g(elementClassifierIfArray, "elementClassifierIfArray");
        b bVarA = a(dVar, serializers, elementClassifierIfArray);
        return bVarA == null ? b(dVar, serializers) : bVarA;
    }

    public static final b e(d dVar) {
        t.g(dVar, "<this>");
        b bVarD = m.d(dVar);
        if (bVarD != null) {
            return bVarD;
        }
        AbstractC2870w0.f(dVar);
        throw new C0920i();
    }

    public static final b f(c cVar, m type) {
        t.g(cVar, "<this>");
        t.g(type, "type");
        b bVarG = g(cVar, type, true);
        if (bVarG != null) {
            return bVarG;
        }
        AbstractC2868v0.o(AbstractC2870w0.c(type));
        throw new C0920i();
    }

    public static final b g(c cVar, m mVar, boolean z8) {
        b bVarA;
        b bVarB;
        d dVarC = AbstractC2870w0.c(mVar);
        boolean zC = mVar.c();
        List listE = mVar.e();
        ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2870w0.g((X6.n) it.next()));
        }
        if (arrayList.isEmpty()) {
            bVarA = l.a(dVarC, zC);
        } else {
            Object objB = l.b(dVarC, arrayList, zC);
            if (q.g(objB)) {
                objB = null;
            }
            bVarA = (b) objB;
        }
        if (bVarA != null) {
            return bVarA;
        }
        if (arrayList.isEmpty()) {
            bVarB = c.c(cVar, dVarC, null, 2, null);
        } else {
            List listF = m.f(cVar, arrayList, z8);
            if (listF == null) {
                return null;
            }
            b bVarA2 = m.a(dVarC, listF, new a(arrayList));
            bVarB = bVarA2 == null ? cVar.b(dVarC, listF) : bVarA2;
        }
        if (bVarB != null) {
            return c(bVarB, zC);
        }
        return null;
    }

    public static final b h(d dVar) {
        t.g(dVar, "<this>");
        b bVarB = AbstractC2868v0.b(dVar);
        return bVarB == null ? F0.b(dVar) : bVarB;
    }

    public static final b i(c cVar, m type) {
        t.g(cVar, "<this>");
        t.g(type, "type");
        return g(cVar, type, false);
    }

    public static final List j(c cVar, List typeArguments, boolean z8) {
        t.g(cVar, "<this>");
        t.g(typeArguments, "typeArguments");
        if (z8) {
            ArrayList arrayList = new ArrayList(C0938s.y(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(m.c(cVar, (m) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C0938s.y(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            b bVarE = m.e(cVar, (m) it2.next());
            if (bVarE == null) {
                return null;
            }
            arrayList2.add(bVarE);
        }
        return arrayList2;
    }
}
