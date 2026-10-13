package H6;

import C6.r;
import G6.g;
import I6.h;
import I6.j;
import Q6.o;
import Q6.p;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f3585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f3586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G6.d dVar, o oVar, Object obj) {
            super(dVar);
            this.f3585b = oVar;
            this.f3586c = obj;
            t.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // I6.a
        public Object invokeSuspend(Object obj) {
            int i8 = this.f3584a;
            if (i8 == 0) {
                this.f3584a = 1;
                r.b(obj);
                t.e(this.f3585b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((o) P.e(this.f3585b, 2)).invoke(this.f3586c, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3584a = 2;
            r.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: H6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0135b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f3588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f3589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0135b(G6.d dVar, g gVar, o oVar, Object obj) {
            super(dVar, gVar);
            this.f3588b = oVar;
            this.f3589c = obj;
            t.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // I6.a
        public Object invokeSuspend(Object obj) {
            int i8 = this.f3587a;
            if (i8 == 0) {
                this.f3587a = 1;
                r.b(obj);
                t.e(this.f3588b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((o) P.e(this.f3588b, 2)).invoke(this.f3589c, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3587a = 2;
            r.b(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends j {
        @Override // I6.a
        public Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G6.d dVar) {
            super(dVar);
            t.e(dVar, cFAYKUlMj.xJrm);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(G6.d dVar, g gVar) {
            super(dVar, gVar);
            t.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // I6.a
        public Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static G6.d a(o oVar, Object obj, G6.d completion) {
        t.g(oVar, "<this>");
        t.g(completion, "completion");
        G6.d<?> dVarA = h.a(completion);
        if (oVar instanceof I6.a) {
            return ((I6.a) oVar).create(obj, dVarA);
        }
        g context = dVarA.getContext();
        return context == G6.h.f2820a ? new a(dVarA, oVar, obj) : new C0135b(dVarA, context, oVar, obj);
    }

    public static final G6.d b(G6.d dVar) {
        g context = dVar.getContext();
        return context == G6.h.f2820a ? new c(dVar) : new d(dVar, context);
    }

    public static G6.d c(G6.d dVar) {
        G6.d<Object> dVarIntercepted;
        t.g(dVar, "<this>");
        I6.d dVar2 = dVar instanceof I6.d ? (I6.d) dVar : null;
        return (dVar2 == null || (dVarIntercepted = dVar2.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static Object d(o oVar, Object obj, G6.d completion) {
        t.g(oVar, "<this>");
        t.g(completion, "completion");
        return ((o) P.e(oVar, 2)).invoke(obj, b(h.a(completion)));
    }

    public static Object e(p pVar, Object obj, Object obj2, G6.d completion) {
        t.g(pVar, "<this>");
        t.g(completion, "completion");
        return ((p) P.e(pVar, 3)).invoke(obj, obj2, b(h.a(completion)));
    }
}
