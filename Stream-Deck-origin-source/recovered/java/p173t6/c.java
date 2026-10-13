package p173t6;

import Q6.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34275e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f34276f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f34277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f34278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f34279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34280d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public c(h phase, i relation, List<p> interceptors) {
        t.g(phase, "phase");
        t.g(relation, "relation");
        t.g(interceptors, "interceptors");
        this.f34277a = phase;
        this.f34278b = relation;
        this.f34279c = interceptors;
        this.f34280d = true;
    }

    public final void a(p interceptor) {
        t.g(interceptor, "interceptor");
        if (this.f34280d) {
            d();
        }
        this.f34279c.add(interceptor);
    }

    public final void b(List destination) {
        t.g(destination, "destination");
        List list = this.f34279c;
        if (destination instanceof ArrayList) {
            ((ArrayList) destination).ensureCapacity(destination.size() + list.size());
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            destination.add(list.get(i8));
        }
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f34279c);
        return arrayList;
    }

    public final void d() {
        this.f34279c = c();
        this.f34280d = false;
    }

    public final h e() {
        return this.f34277a;
    }

    public final i f() {
        return this.f34278b;
    }

    public final int g() {
        return this.f34279c.size();
    }

    public final boolean h() {
        return this.f34279c.isEmpty();
    }

    public final List i() {
        this.f34280d = true;
        return this.f34279c;
    }

    public String toString() {
        return "Phase `" + this.f34277a.a() + "`, " + g() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(h phase, i relation) {
        t.g(phase, "phase");
        t.g(relation, "relation");
        List list = f34276f;
        t.e(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        this(phase, relation, P.c(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
