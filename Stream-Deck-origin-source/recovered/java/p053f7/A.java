package p053f7;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import H6.c;
import I6.l;
import Q6.o;
import p044e7.InterfaceC2261g;
import p062g7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements InterfaceC2261g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f22263c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f22266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2261g interfaceC2261g, d dVar) {
            super(2, dVar);
            this.f22266c = interfaceC2261g;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f22266c, dVar);
            aVar.f22265b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22264a;
            if (i8 == 0) {
                r.b(obj);
                Object obj2 = this.f22265b;
                InterfaceC2261g interfaceC2261g = this.f22266c;
                this.f22264a = 1;
                if (interfaceC2261g.emit(obj2, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public A(InterfaceC2261g interfaceC2261g, g gVar) {
        this.f22261a = gVar;
        this.f22262b = K.b(gVar);
        this.f22263c = new a(interfaceC2261g, null);
    }

    @Override // p044e7.InterfaceC2261g
    public Object emit(Object obj, d dVar) {
        Object objC = f.c(this.f22261a, obj, this.f22262b, this.f22263c, dVar);
        return objC == c.f() ? objC : G.f1419a;
    }
}
