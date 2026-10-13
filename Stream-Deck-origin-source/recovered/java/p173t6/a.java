package p173t6;

import C6.r;
import G6.g;
import H6.c;
import I6.d;
import Q6.p;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f34268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34270e;

    /* JADX INFO: renamed from: t6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0775a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34272b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34274d;

        public C0775a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34272b = obj;
            this.f34274d |= Integer.MIN_VALUE;
            return a.this.j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object context, List<? extends p> interceptors, Object subject, g coroutineContext) {
        super(context);
        t.g(context, "context");
        t.g(interceptors, "interceptors");
        t.g(subject, "subject");
        t.g(coroutineContext, "coroutineContext");
        this.f34267b = interceptors;
        this.f34268c = coroutineContext;
        this.f34269d = subject;
    }

    @Override // p173t6.e
    public Object a(Object obj, G6.d dVar) {
        this.f34270e = 0;
        k(obj);
        return g(dVar);
    }

    @Override // p173t6.e
    public void b() {
        this.f34270e = -1;
    }

    @Override // p173t6.e
    public Object f() {
        return this.f34269d;
    }

    @Override // p173t6.e
    public Object g(G6.d dVar) {
        int i8 = this.f34270e;
        if (i8 < 0) {
            return f();
        }
        if (i8 < this.f34267b.size()) {
            return j(dVar);
        }
        b();
        return f();
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f34268c;
    }

    @Override // p173t6.e
    public Object h(Object obj, G6.d dVar) {
        k(obj);
        return g(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(G6.d dVar) {
        C0775a c0775a;
        a aVar;
        p pVar;
        Object objF;
        if (dVar instanceof C0775a) {
            c0775a = (C0775a) dVar;
            int i8 = c0775a.f34274d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0775a.f34274d = i8 - Integer.MIN_VALUE;
            } else {
                c0775a = new C0775a(dVar);
            }
        } else {
            c0775a = new C0775a(dVar);
        }
        Object obj = c0775a.f34272b;
        Object objF2 = c.f();
        int i9 = c0775a.f34274d;
        if (i9 == 0) {
            r.b(obj);
            aVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c0775a.f34271a;
            r.b(obj);
        }
        do {
            int i10 = aVar.f34270e;
            if (i10 != -1) {
                List list = aVar.f34267b;
                if (i10 >= list.size()) {
                    aVar.b();
                } else {
                    pVar = (p) list.get(i10);
                    aVar.f34270e = i10 + 1;
                    t.e(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    objF = aVar.f();
                    c0775a.f34271a = aVar;
                    c0775a.f34274d = 1;
                }
            }
            return aVar.f();
        } while (pVar.invoke(aVar, objF, c0775a) != objF2);
        return objF2;
    }

    public void k(Object obj) {
        t.g(obj, "<set-?>");
        this.f34269d = obj;
    }
}
