package q7;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: q7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2873y implements InterfaceC2866u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.o f32161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f32162b;

    public C2873y(Q6.o compute) {
        kotlin.jvm.internal.t.g(compute, "compute");
        this.f32161a = compute;
        this.f32162b = new ConcurrentHashMap();
    }

    @Override // q7.InterfaceC2866u0
    public Object a(X6.d key, List types) {
        Object objB;
        Object objPutIfAbsent;
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f32162b;
        Class clsA = P6.a.a(key);
        Object c2864t0 = concurrentHashMap.get(clsA);
        if (c2864t0 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (c2864t0 = new C2864t0()))) != null) {
            c2864t0 = objPutIfAbsent;
        }
        C2864t0 c2864t1 = (C2864t0) c2864t0;
        ArrayList arrayList = new ArrayList(C0938s.y(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new W((X6.m) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c2864t1.f32156a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                C6.q.a aVar = C6.q.f1441b;
                objB = C6.q.b((p116m7.b) this.f32161a.invoke(key, types));
            } catch (Throwable th) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th));
            }
            C6.q qVarA = C6.q.a(objB);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, qVarA);
            obj = objPutIfAbsent2 == null ? qVarA : objPutIfAbsent2;
        }
        kotlin.jvm.internal.t.f(obj, "getOrPut(...)");
        return ((C6.q) obj).j();
    }
}
