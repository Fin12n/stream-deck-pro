package p053f7;

import G6.d;
import Q6.p;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22349a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22350a = new a();

        public a() {
            super(3, InterfaceC2261g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, d dVar) {
            return interfaceC2261g.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f22350a;
        t.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f22349a = (p) P.e(aVar, 3);
    }
}
