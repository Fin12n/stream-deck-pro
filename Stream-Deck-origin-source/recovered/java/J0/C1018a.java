package J0;

import C6.C0920i;
import java.util.List;

/* JADX INFO: renamed from: J0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1018a extends C1020c {

    /* JADX INFO: renamed from: J0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0146a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0146a(List list) {
            super(1);
            this.f3947a = list;
        }

        public final void b(Object obj) {
            List list = this.f3947a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((Q6.k) list.get(i8)).invoke(obj);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: J0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3949b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Q6.k kVar, Q6.k kVar2) {
            super(1);
            this.f3948a = kVar;
            this.f3949b = kVar2;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1020c invoke(n nVar) {
            int i8;
            synchronized (p.I()) {
                i8 = p.f4003e;
                p.f4003e = i8 + 1;
            }
            return new C1020c(i8, nVar, this.f3948a, this.f3949b);
        }
    }

    /* JADX INFO: renamed from: J0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f3950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q6.k kVar) {
            super(1);
            this.f3950a = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1025h invoke(n nVar) {
            int i8;
            synchronized (p.I()) {
                i8 = p.f4003e;
                p.f4003e = i8 + 1;
            }
            return new C1025h(i8, nVar, this.f3950a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1018a(int i8, n nVar) {
        Q6.k c0146a;
        synchronized (p.I()) {
            List list = p.f4007i;
            c0146a = (Q6.k) D6.z.G0(list);
            c0146a = c0146a == null ? new C0146a(list) : c0146a;
        }
        super(i8, nVar, null, c0146a);
    }

    @Override // J0.C1020c
    public AbstractC1029l C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // J0.C1020c
    public C1020c P(Q6.k kVar, Q6.k kVar2) {
        return (C1020c) p.b0(new b(kVar, kVar2));
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC1028k abstractC1028k) {
        y.b();
        throw new C0920i();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void d() {
        synchronized (p.I()) {
            q();
            C6.G g8 = C6.G.f1419a;
        }
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public void o() {
        p.B();
    }

    @Override // J0.C1020c, J0.AbstractC1028k
    public AbstractC1028k x(Q6.k kVar) {
        return p.b0(new c(kVar));
    }
}
