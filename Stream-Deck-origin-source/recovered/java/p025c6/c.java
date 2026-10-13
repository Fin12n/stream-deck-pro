package p025c6;

import D6.r;
import Z6.j;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import p016b6.a;
import p016b6.b;
import p016b6.d;
import p016b6.e;
import p016b6.g;
import p016b6.h;
import p016b6.i;
import p016b6.l;
import p016b6.m;
import p016b6.o;
import p016b6.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final void a(Map map, String str, int i8) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer numValueOf = Integer.valueOf(i8);
        Object obj = map.get(str);
        t.d(obj);
        ((Collection) obj).add(numValueOf);
    }

    public static final i b(d dVar) {
        t.g(dVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new b(new j(d(dVar, linkedHashMap, 0, false, 6, null).b()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(d dVar, Map map, int i8, boolean z8) {
        char c8;
        if (dVar instanceof p) {
            return new a(j.f12967b.c(((p) dVar).c()), 0, false, 6, null);
        }
        if (dVar instanceof m) {
            return new a(((m) dVar).c(), 0, false, 6, null);
        }
        if (dVar instanceof g) {
            g gVar = (g) dVar;
            a aVarD = d(gVar.a(), map, i8 + 1, false, 4, null);
            a(map, gVar.c(), i8);
            return new a(aVarD.b(), aVarD.a(), true);
        }
        if (dVar instanceof p016b6.c) {
            StringBuilder sb = new StringBuilder();
            int iA = z8 ? i8 + 1 : i8;
            int i9 = 0;
            for (Object obj : ((p016b6.c) dVar).b()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    r.x();
                }
                a aVarC = c((d) obj, map, iA, true);
                if (i9 != 0 && (dVar instanceof h)) {
                    sb.append(f.f16779c);
                }
                sb.append(aVarC.b());
                iA += aVarC.a();
                i9 = i10;
            }
            int i11 = iA - i8;
            if (z8) {
                i11--;
            }
            String string = sb.toString();
            t.f(string, "expression.toString()");
            return new a(string, i11, z8);
        }
        if (dVar instanceof o) {
            if (dVar instanceof p016b6.f) {
                c8 = '?';
            } else if (dVar instanceof e) {
                c8 = '*';
            } else {
                if (!(dVar instanceof b)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + dVar).toString());
                }
                c8 = '+';
            }
            a aVarC2 = c(((o) dVar).a(), map, i8, true);
            return new a(aVarC2.b() + c8, aVarC2.a(), false, 4, null);
        }
        if (dVar instanceof a) {
            return new a('[' + j.f12967b.c(((a) dVar).c()) + ']', 0, false, 6, null);
        }
        if (!(dVar instanceof l)) {
            throw new IllegalStateException(("Unsupported grammar element: " + dVar).toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        l lVar = (l) dVar;
        sb2.append(lVar.c());
        sb2.append('-');
        sb2.append(lVar.d());
        sb2.append(']');
        return new a(sb2.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ a d(d dVar, Map map, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return c(dVar, map, i8, z8);
    }
}
