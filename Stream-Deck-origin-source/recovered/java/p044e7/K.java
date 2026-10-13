package p044e7;

import C6.C0920i;
import C6.G;
import C6.r;
import H6.c;
import I6.d;
import I6.l;
import Q6.o;
import kotlin.jvm.internal.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements H {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M f20935c;

        /* JADX INFO: renamed from: e7.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0482a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ F f20936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f20937b;

            /* JADX INFO: renamed from: e7.K$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0483a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f20938a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f20940c;

                public C0483a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f20938a = obj;
                    this.f20940c |= Integer.MIN_VALUE;
                    return C0482a.this.a(0, this);
                }
            }

            public C0482a(F f8, InterfaceC2261g interfaceC2261g) {
                this.f20936a = f8;
                this.f20937b = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i8, G6.d dVar) {
                C0483a c0483a;
                if (dVar instanceof C0483a) {
                    c0483a = (C0483a) dVar;
                    int i9 = c0483a.f20940c;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0483a.f20940c = i9 - Integer.MIN_VALUE;
                    } else {
                        c0483a = new C0483a(dVar);
                    }
                } else {
                    c0483a = new C0483a(dVar);
                }
                Object obj = c0483a.f20938a;
                Object objF = c.f();
                int i10 = c0483a.f20940c;
                if (i10 == 0) {
                    r.b(obj);
                    if (i8 > 0) {
                        F f8 = this.f20936a;
                        if (!f8.f28775a) {
                            f8.f28775a = true;
                            InterfaceC2261g interfaceC2261g = this.f20937b;
                            F f9 = F.START;
                            c0483a.f20940c = 1;
                            if (interfaceC2261g.emit(f9, c0483a) == objF) {
                                return objF;
                            }
                        }
                    }
                    return G.f1419a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return G.f1419a;
            }

            @Override // p044e7.InterfaceC2261g
            public /* bridge */ /* synthetic */ Object emit(Object obj, G6.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m8, G6.d dVar) {
            super(2, dVar);
            this.f20935c = m8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f20935c, dVar);
            aVar.f20934b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((a) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f20933a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f20934b;
                F f8 = new F();
                M m8 = this.f20935c;
                C0482a c0482a = new C0482a(f8, interfaceC2261g);
                this.f20933a = 1;
                if (m8.collect(c0482a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            throw new C0920i();
        }
    }

    @Override // p044e7.H
    public InterfaceC2260f a(M m8) {
        return AbstractC2262h.D(new a(m8, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
