package T4;

import C6.G;
import C6.q;
import C6.r;
import I6.h;
import Q6.k;
import S4.InterfaceC1635f;
import S4.InterfaceC1636g;
import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: T4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0278a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f9881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9882b;

        public C0278a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f9881a = obj;
            this.f9882b |= Integer.MIN_VALUE;
            return a.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9883a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            m76invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m76invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f9884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0) {
            super(1);
            this.f9884a = function0;
        }

        public final void b(Throwable th) {
            this.f9884a.invoke();
        }

        @Override // Q6.k
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC1636g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f9885a;

        public d(InterfaceC1795l interfaceC1795l) {
            this.f9885a = interfaceC1795l;
        }

        @Override // S4.InterfaceC1636g
        public final void a(Object obj) {
            this.f9885a.resumeWith(q.b(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements InterfaceC1635f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f9886a;

        public e(InterfaceC1795l interfaceC1795l) {
            this.f9886a = interfaceC1795l;
        }

        @Override // S4.InterfaceC1635f
        public final void d(Exception exception) {
            t.g(exception, "exception");
            this.f9886a.resumeWith(q.b(r.a(exception)));
        }
    }

    public static final Object a(U4.c cVar, Activity activity, U4.b bVar, G6.d dVar) {
        S4.k kVarA = cVar.a(activity, bVar);
        t.f(kVarA, "launchReviewFlow(activity, reviewInfo)");
        Object objD = d(kVarA, null, dVar, 2, null);
        return objD == H6.c.f() ? objD : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(U4.c cVar, G6.d dVar) {
        C0278a c0278a;
        if (dVar instanceof C0278a) {
            c0278a = (C0278a) dVar;
            int i8 = c0278a.f9882b;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0278a.f9882b = i8 - Integer.MIN_VALUE;
            } else {
                c0278a = new C0278a(dVar);
            }
        } else {
            c0278a = new C0278a(dVar);
        }
        Object objD = c0278a.f9881a;
        Object objF = H6.c.f();
        int i9 = c0278a.f9882b;
        if (i9 == 0) {
            r.b(objD);
            S4.k kVarB = cVar.b();
            t.f(kVarB, "requestReviewFlow()");
            c0278a.f9882b = 1;
            objD = d(kVarB, null, c0278a, 2, null);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objD);
        }
        t.f(objD, "runTask(requestReviewFlow())");
        return objD;
    }

    public static final Object c(S4.k kVar, Function0 function0, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        c1797m.J(new c(function0));
        if (!kVar.k()) {
            kVar.f(new d(c1797m));
            kVar.d(new e(c1797m));
        } else if (kVar.l()) {
            c1797m.resumeWith(q.b(kVar.i()));
        } else {
            Exception excH = kVar.h();
            t.d(excH);
            c1797m.resumeWith(q.b(r.a(excH)));
        }
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS;
    }

    public static /* synthetic */ Object d(S4.k kVar, Function0 function0, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function0 = b.f9883a;
        }
        return c(kVar, function0, dVar);
    }
}
