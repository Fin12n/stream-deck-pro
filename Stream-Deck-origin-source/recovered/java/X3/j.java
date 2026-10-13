package X3;

import D6.C0938s;
import D6.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import r7.n;
import r7.u;
import r7.w;
import r7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11726a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f11727b = o7.i.c("PropertyValue", new o7.f[0], null, 4, null);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        r7.i iVar = decoder instanceof r7.i ? (r7.i) decoder : null;
        if (iVar != null) {
            return b(iVar.m());
        }
        throw new p116m7.j("PropertyValue can only be deserialized from JSON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i b(r7.j jVar) {
        if (jVar instanceof y) {
            if (jVar instanceof u) {
                return i.Companion.g("");
            }
            y yVar = (y) jVar;
            if (r7.k.f(yVar) != null) {
                return i.Companion.a(r7.k.e(yVar));
            }
            if (r7.k.m(yVar) != null) {
                return i.Companion.d(r7.k.l(yVar));
            }
            if (r7.k.s(yVar) != null) {
                return i.Companion.f(r7.k.r(yVar));
            }
            return r7.k.i(yVar) != null ? i.Companion.c(r7.k.h(yVar)) : i.Companion.g(yVar.c());
        }
        if (jVar instanceof r7.d) {
            i.b bVar = i.Companion;
            Iterable iterable = (Iterable) jVar;
            ArrayList arrayList = new ArrayList(C0938s.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(f11726a.b((r7.j) it.next()));
            }
            return bVar.e(arrayList);
        }
        if (!(jVar instanceof w)) {
            throw new C6.m();
        }
        i.b bVar2 = i.Companion;
        Map map = (Map) jVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), f11726a.b((r7.j) entry.getValue()));
        }
        return bVar2.b(linkedHashMap);
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, i value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        n nVar = encoder instanceof n ? (n) encoder : null;
        if (nVar == null) {
            throw new p116m7.j("PropertyValue can only be serialized to JSON");
        }
        nVar.y(value.b());
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f11727b;
    }
}
