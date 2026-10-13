package androidx.lifecycle;

import p017b7.AbstractC1789i;
import p017b7.B0;
import p017b7.Z;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1728k extends AbstractC1727j implements InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1726i f15297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f15298b;

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15300b;

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = C1728k.this.new a(dVar);
            aVar.f15300b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f15299a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            p017b7.J j8 = (p017b7.J) this.f15300b;
            if (C1728k.this.a().b().compareTo(AbstractC1726i.b.INITIALIZED) >= 0) {
                C1728k.this.a().a(C1728k.this);
            } else {
                B0.e(j8.getCoroutineContext(), null, 1, null);
            }
            return C6.G.f1419a;
        }
    }

    public C1728k(AbstractC1726i lifecycle, G6.g coroutineContext) {
        kotlin.jvm.internal.t.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        this.f15297a = lifecycle;
        this.f15298b = coroutineContext;
        if (a().b() == AbstractC1726i.b.DESTROYED) {
            B0.e(getCoroutineContext(), null, 1, null);
        }
    }

    public AbstractC1726i a() {
        return this.f15297a;
    }

    public final void b() {
        AbstractC1789i.d(this, Z.c().o1(), null, new a(null), 2, null);
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f15298b;
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p source, AbstractC1726i.a event) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(event, "event");
        if (a().b().compareTo(AbstractC1726i.b.DESTROYED) <= 0) {
            a().d(this);
            B0.e(getCoroutineContext(), null, 1, null);
        }
    }
}
