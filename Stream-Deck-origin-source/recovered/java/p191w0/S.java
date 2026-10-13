package p191w0;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import I6.l;
import Q6.k;
import Q6.o;
import X.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p046f0.K;
import p098k7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f35672a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098k7.a f35673b = c.b(false, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f35674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1815v0 f35675b;

        public a(K k8, InterfaceC1815v0 interfaceC1815v0) {
            this.f35674a = k8;
            this.f35675b = interfaceC1815v0;
        }

        public final boolean a(a aVar) {
            return this.f35674a.compareTo(aVar.f35674a) >= 0;
        }

        public final void b() {
            InterfaceC1815v0.a.a(this.f35675b, null, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f35676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f35677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f35678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f35680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ K f35681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ S f35682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f35683h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K k8, S s8, k kVar, d dVar) {
            super(2, dVar);
            this.f35681f = k8;
            this.f35682g = s8;
            this.f35683h = kVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f35681f, this.f35682g, this.f35683h, dVar);
            bVar.f35680e = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, k7.a] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p098k7.a aVar;
            a aVar2;
            S s8;
            k kVar;
            Throwable th;
            S s9;
            a aVar3;
            p098k7.a aVar4;
            Object objF = H6.c.f();
            ?? r8 = this.f35679d;
            try {
                try {
                    if (r8 == 0) {
                        r.b(obj);
                        J j8 = (J) this.f35680e;
                        K k8 = this.f35681f;
                        g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        t.d(bVarA);
                        a aVar5 = new a(k8, (InterfaceC1815v0) bVarA);
                        this.f35682g.f(aVar5);
                        aVar = this.f35682g.f35673b;
                        k kVar2 = this.f35683h;
                        S s10 = this.f35682g;
                        this.f35680e = aVar5;
                        this.f35676a = aVar;
                        this.f35677b = kVar2;
                        this.f35678c = s10;
                        this.f35679d = 1;
                        if (aVar.b(null, this) != objF) {
                            aVar2 = aVar5;
                            s8 = s10;
                            kVar = kVar2;
                        }
                        return objF;
                    }
                    if (r8 != 1) {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s9 = (S) this.f35677b;
                        aVar4 = (p098k7.a) this.f35676a;
                        aVar3 = (a) this.f35680e;
                        try {
                            r.b(obj);
                            i.a(s9.f35672a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            i.a(s9.f35672a, aVar3, null);
                            throw th;
                        }
                    }
                    s8 = (S) this.f35678c;
                    kVar = (k) this.f35677b;
                    p098k7.a aVar6 = (p098k7.a) this.f35676a;
                    aVar2 = (a) this.f35680e;
                    r.b(obj);
                    aVar = aVar6;
                    this.f35680e = aVar2;
                    this.f35676a = aVar;
                    this.f35677b = s8;
                    this.f35678c = null;
                    this.f35679d = 2;
                    Object objInvoke = kVar.invoke(this);
                    if (objInvoke != objF) {
                        s9 = s8;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        i.a(s9.f35672a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    s9 = s8;
                    aVar3 = aVar2;
                    i.a(s9.f35672a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r8.e(null);
                throw th4;
            }
        }
    }

    public final Object d(K k8, k kVar, d dVar) {
        return p017b7.K.f(new b(k8, this, kVar, null), dVar);
    }

    public final boolean e(Function0 function0) {
        boolean zB = p098k7.a.C0628a.b(this.f35673b, null, 1, null);
        if (!zB) {
            return zB;
        }
        try {
            function0.invoke();
            return zB;
        } finally {
            p098k7.a.C0628a.c(this.f35673b, null, 1, null);
        }
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f35672a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f35672a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }
}
