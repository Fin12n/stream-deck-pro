package I0;

import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f3721a = a(a.f3722a, b.f3723a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f3724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3725b;

        public c(o oVar, Q6.k kVar) {
            this.f3724a = oVar;
            this.f3725b = kVar;
        }

        @Override // I0.j
        public Object a(Object obj) {
            return this.f3725b.invoke(obj);
        }

        @Override // I0.j
        public Object b(l lVar, Object obj) {
            return this.f3724a.invoke(lVar, obj);
        }
    }

    public static final j a(o oVar, Q6.k kVar) {
        return new c(oVar, kVar);
    }

    public static final j b() {
        j jVar = f3721a;
        t.e(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return jVar;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3723a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3722a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Object obj) {
            return obj;
        }
    }
}
