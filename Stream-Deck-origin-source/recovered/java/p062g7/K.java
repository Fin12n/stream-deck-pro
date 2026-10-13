package p062g7;

import G6.g;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.T0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f23821a = new G("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f23822b = a.f23825a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f23823c = b.f23826a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f23824d = c.f23827a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23825a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof T0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23826a = new b();

        public b() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T0 invoke(T0 t8, g.b bVar) {
            if (t8 != null) {
                return t8;
            }
            if (bVar instanceof T0) {
                return (T0) bVar;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23827a = new c();

        public c() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O invoke(O o8, g.b bVar) {
            if (bVar instanceof T0) {
                T0 t8 = (T0) bVar;
                o8.a(t8, t8.a1(o8.f23830a));
            }
            return o8;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj == f23821a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(gVar);
            return;
        }
        Object objT = gVar.t(null, f23823c);
        t.e(objT, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((T0) objT).O0(gVar, obj);
    }

    public static final Object b(g gVar) {
        Object objT = gVar.t(0, f23822b);
        t.d(objT);
        return objT;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f23821a;
        }
        if (obj instanceof Integer) {
            return gVar.t(new O(gVar, ((Number) obj).intValue()), f23824d);
        }
        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((T0) obj).a1(gVar);
    }
}
