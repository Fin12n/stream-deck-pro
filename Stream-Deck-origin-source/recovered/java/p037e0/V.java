package p037e0;

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
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p098k7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20066a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098k7.a f20067b = c.b(false, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f20068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1815v0 f20069b;

        public a(T t8, InterfaceC1815v0 interfaceC1815v0) {
            this.f20068a = t8;
            this.f20069b = interfaceC1815v0;
        }

        public final boolean a(a aVar) {
            return this.f20068a.compareTo(aVar.f20068a) >= 0;
        }

        public final void b() {
            this.f20069b.z(new U());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f20074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T f20075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ V f20076g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f20077h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t8, V v8, k kVar, d dVar) {
            super(2, dVar);
            this.f20075f = t8;
            this.f20076g = v8;
            this.f20077h = kVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f20075f, this.f20076g, this.f20077h, dVar);
            bVar.f20074e = obj;
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
            V v8;
            k kVar;
            Throwable th;
            V v9;
            a aVar3;
            p098k7.a aVar4;
            Object objF = H6.c.f();
            ?? r8 = this.f20073d;
            try {
                try {
                    if (r8 == 0) {
                        r.b(obj);
                        J j8 = (J) this.f20074e;
                        T t8 = this.f20075f;
                        g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        t.d(bVarA);
                        a aVar5 = new a(t8, (InterfaceC1815v0) bVarA);
                        this.f20076g.f(aVar5);
                        aVar = this.f20076g.f20067b;
                        k kVar2 = this.f20077h;
                        V v10 = this.f20076g;
                        this.f20074e = aVar5;
                        this.f20070a = aVar;
                        this.f20071b = kVar2;
                        this.f20072c = v10;
                        this.f20073d = 1;
                        if (aVar.b(null, this) != objF) {
                            aVar2 = aVar5;
                            v8 = v10;
                            kVar = kVar2;
                        }
                        return objF;
                    }
                    if (r8 != 1) {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v9 = (V) this.f20071b;
                        aVar4 = (p098k7.a) this.f20070a;
                        aVar3 = (a) this.f20074e;
                        try {
                            r.b(obj);
                            i.a(v9.f20066a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            i.a(v9.f20066a, aVar3, null);
                            throw th;
                        }
                    }
                    v8 = (V) this.f20072c;
                    kVar = (k) this.f20071b;
                    p098k7.a aVar6 = (p098k7.a) this.f20070a;
                    aVar2 = (a) this.f20074e;
                    r.b(obj);
                    aVar = aVar6;
                    this.f20074e = aVar2;
                    this.f20070a = aVar;
                    this.f20071b = v8;
                    this.f20072c = null;
                    this.f20073d = 2;
                    Object objInvoke = kVar.invoke(this);
                    if (objInvoke != objF) {
                        v9 = v8;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        i.a(v9.f20066a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    v9 = v8;
                    aVar3 = aVar2;
                    i.a(v9.f20066a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r8.e(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object e(V v8, T t8, k kVar, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            t8 = T.Default;
        }
        return v8.d(t8, kVar, dVar);
    }

    public final Object d(T t8, k kVar, d dVar) {
        return K.f(new b(t8, this, kVar, null), dVar);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f20066a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f20066a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }
}
