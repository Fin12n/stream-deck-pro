package s7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2912t.a f33179a = new C2912t.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2912t.a f33180b = new C2912t.a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7.f f33181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r7.c f33182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o7.f fVar, r7.c cVar) {
            super(0);
            this.f33181a = fVar;
            this.f33182b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.b(this.f33181a, this.f33182b);
        }
    }

    public static final Map b(o7.f fVar, r7.c cVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(cVar, fVar);
        l(fVar, cVar);
        int iF = fVar.f();
        for (int i8 = 0; i8 < iF; i8++) {
            List listH = fVar.h(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof r7.s) {
                    arrayList.add(obj);
                }
            }
            r7.s sVar = (r7.s) D6.z.G0(arrayList);
            if (sVar != null && (strArrNames = sVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.t.f(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i8);
                }
            }
            if (zD) {
                lowerCase = fVar.g(i8).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.t.f(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i8);
            }
        }
        return linkedHashMap.isEmpty() ? D6.M.g() : linkedHashMap;
    }

    public static final void c(Map map, o7.f fVar, String str, int i8) {
        String str2 = kotlin.jvm.internal.t.c(fVar.e(), o7.j.b.f31003a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new B("The suggested name '" + str + "' for " + str2 + ' ' + fVar.g(i8) + " is already one of the names for " + str2 + ' ' + fVar.g(((Number) D6.M.h(map, str)).intValue()) + " in " + fVar);
    }

    public static final boolean d(r7.c cVar, o7.f fVar) {
        return cVar.e().g() && kotlin.jvm.internal.t.c(fVar.e(), o7.j.b.f31003a);
    }

    public static final Map e(r7.c cVar, o7.f descriptor) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return (Map) r7.A.a(cVar).b(descriptor, f33179a, new a(descriptor, cVar));
    }

    public static final C2912t.a f() {
        return f33179a;
    }

    public static final String g(o7.f fVar, r7.c json, int i8) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(json, "json");
        l(fVar, json);
        return fVar.g(i8);
    }

    public static final int h(o7.f fVar, r7.c json, String name) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.t.f(lowerCase, "toLowerCase(...)");
            return k(fVar, json, lowerCase);
        }
        l(fVar, json);
        int iD = fVar.d(name);
        return (iD == -3 && json.e().n()) ? k(fVar, json, name) : iD;
    }

    public static final int i(o7.f fVar, r7.c json, String name, String suffix) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(suffix, "suffix");
        int iH = h(fVar, json, name);
        if (iH != -3) {
            return iH;
        }
        throw new p116m7.j(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int j(o7.f fVar, r7.c cVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, cVar, str, str2);
    }

    public static final int k(o7.f fVar, r7.c cVar, String str) {
        Integer num = (Integer) e(cVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final r7.t l(o7.f fVar, r7.c json) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(json, "json");
        if (kotlin.jvm.internal.t.c(fVar.e(), o7.k.a.f31004a)) {
            json.e().k();
        }
        return null;
    }
}
