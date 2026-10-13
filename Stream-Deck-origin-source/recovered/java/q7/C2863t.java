package q7;

import D6.C0938s;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: q7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2863t implements InterfaceC2866u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.o f32154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2865u f32155b;

    /* JADX INFO: renamed from: q7.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C2864t0();
        }
    }

    public C2863t(Q6.o compute) {
        kotlin.jvm.internal.t.g(compute, "compute");
        this.f32154a = compute;
        this.f32155b = new C2865u();
    }

    @Override // q7.InterfaceC2866u0
    public Object a(X6.d dVar, List types) {
        Object objB;
        kotlin.jvm.internal.t.g(dVar, WqXA.ikAIvN);
        kotlin.jvm.internal.t.g(types, "types");
        Object obj = this.f32155b.get(P6.a.a(dVar));
        kotlin.jvm.internal.t.f(obj, "get(...)");
        C2845j0 c2845j0 = (C2845j0) obj;
        Object objA = c2845j0.f32121a.get();
        if (objA == null) {
            objA = c2845j0.a(new a());
        }
        C2864t0 c2864t0 = (C2864t0) objA;
        ArrayList arrayList = new ArrayList(C0938s.y(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new W((X6.m) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c2864t0.f32156a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                C6.q.a aVar = C6.q.f1441b;
                objB = C6.q.b((p116m7.b) this.f32154a.invoke(dVar, types));
            } catch (Throwable th) {
                C6.q.a aVar2 = C6.q.f1441b;
                objB = C6.q.b(C6.r.a(th));
            }
            C6.q qVarA = C6.q.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, qVarA);
            obj2 = objPutIfAbsent == null ? qVarA : objPutIfAbsent;
        }
        kotlin.jvm.internal.t.f(obj2, "getOrPut(...)");
        return ((C6.q) obj2).j();
    }
}
