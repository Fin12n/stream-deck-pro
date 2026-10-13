package O5;

import C6.G;
import X5.T;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements O5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p133o6.b f8817b = new p133o6.b(0, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8818a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set invoke() {
            return p133o6.c.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8819a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set invoke() {
            return p133o6.c.a();
        }
    }

    @Override // O5.a
    public Object a(T t8, Map map, G6.d dVar) {
        for (Object obj : (Set) this.f8817b.b(t8, a.f8818a)) {
            O5.b bVar = (O5.b) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!t.c(bVar.i().get(str), (String) entry.getValue())) {
                }
            }
            return obj;
        }
        return null;
    }

    @Override // O5.a
    public Object b(T t8, G6.d dVar) {
        Set set = (Set) this.f8817b.get(t8);
        return set == null ? D6.T.d() : set;
    }

    @Override // O5.a
    public Object c(T t8, O5.b bVar, G6.d dVar) {
        Set set = (Set) this.f8817b.b(t8, b.f8819a);
        if (!set.add(bVar)) {
            set.remove(bVar);
            set.add(bVar);
        }
        return G.f1419a;
    }
}
