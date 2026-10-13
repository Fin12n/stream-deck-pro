package p089j7;

import C6.G;
import G6.g;
import Q6.p;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p017b7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28340a;

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class RunnableC0619a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f28341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f28342b;

        public RunnableC0619a(j jVar, a aVar) {
            this.f28341a = jVar;
            this.f28342b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f28341a.e(this.f28342b, G.f1419a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28343a = new b();

        public b() {
            super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void h(a aVar, j jVar, Object obj) {
            aVar.c(jVar, obj);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((a) obj, (j) obj2, obj3);
            return G.f1419a;
        }
    }

    public a(long j8) {
        this.f28340a = j8;
    }

    public final d b() {
        b bVar = b.f28343a;
        t.e(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new e(this, (p) P.e(bVar, 3), null, 4, null);
    }

    public final void c(j jVar, Object obj) {
        if (this.f28340a <= 0) {
            jVar.g(G.f1419a);
            return;
        }
        RunnableC0619a runnableC0619a = new RunnableC0619a(jVar, this);
        t.e(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        g context = jVar.getContext();
        jVar.c(U.c(context).o(this.f28340a, runnableC0619a, context));
    }
}
