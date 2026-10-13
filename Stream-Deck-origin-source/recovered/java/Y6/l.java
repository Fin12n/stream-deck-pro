package Y6;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class l extends k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f12536a;

        public a(Iterator it) {
            this.f12536a = it;
        }

        @Override // Y6.g
        public Iterator iterator() {
            return this.f12536a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f12537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(1);
            this.f12537a = function0;
        }

        @Override // Q6.k
        public final Object invoke(Object it) {
            t.g(it, "it");
            return this.f12537a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f12538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj) {
            super(0);
            this.f12538a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f12538a;
        }
    }

    public static g c(Iterator it) {
        t.g(it, "<this>");
        return d(new a(it));
    }

    public static g d(g gVar) {
        t.g(gVar, "<this>");
        return gVar instanceof Y6.a ? gVar : new Y6.a(gVar);
    }

    public static g e() {
        return d.f12518a;
    }

    public static g f(Object obj, Q6.k nextFunction) {
        t.g(nextFunction, "nextFunction");
        return obj == null ? d.f12518a : new f(new c(obj), nextFunction);
    }

    public static g g(Function0 nextFunction) {
        t.g(nextFunction, "nextFunction");
        return d(new f(nextFunction, new b(nextFunction)));
    }
}
