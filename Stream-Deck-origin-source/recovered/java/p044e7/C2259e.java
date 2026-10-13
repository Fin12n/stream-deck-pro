package p044e7;

import C6.G;
import C6.r;
import H6.c;
import I6.d;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.J;
import p053f7.t;

/* JADX INFO: renamed from: e7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2259e implements InterfaceC2260f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2260f f20983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f20985c;

    /* JADX INFO: renamed from: e7.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2261g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f20987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f20988c;

        /* JADX INFO: renamed from: e7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0485a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f20989a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f20991c;

            public C0485a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f20989a = obj;
                this.f20991c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(J j8, InterfaceC2261g interfaceC2261g) {
            this.f20987b = j8;
            this.f20988c = interfaceC2261g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        public final Object emit(Object obj, G6.d dVar) {
            C0485a c0485a;
            if (dVar instanceof C0485a) {
                c0485a = (C0485a) dVar;
                int i8 = c0485a.f20991c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0485a.f20991c = i8 - Integer.MIN_VALUE;
                } else {
                    c0485a = new C0485a(dVar);
                }
            } else {
                c0485a = new C0485a(dVar);
            }
            Object obj2 = c0485a.f20989a;
            Object objF = c.f();
            int i9 = c0485a.f20991c;
            if (i9 == 0) {
                r.b(obj2);
                Object objInvoke = C2259e.this.f20984b.invoke(obj);
                Object obj3 = this.f20987b.f28779a;
                if (obj3 != t.f22340a && ((Boolean) C2259e.this.f20985c.invoke(obj3, objInvoke)).booleanValue()) {
                    return G.f1419a;
                }
                this.f20987b.f28779a = objInvoke;
                InterfaceC2261g interfaceC2261g = this.f20988c;
                c0485a.f20991c = 1;
                if (interfaceC2261g.emit(obj, c0485a) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return G.f1419a;
        }
    }

    public C2259e(InterfaceC2260f interfaceC2260f, k kVar, o oVar) {
        this.f20983a = interfaceC2260f;
        this.f20984b = kVar;
        this.f20985c = oVar;
    }

    @Override // p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        J j8 = new J();
        j8.f28779a = t.f22340a;
        Object objCollect = this.f20983a.collect(new a(j8, interfaceC2261g), dVar);
        return objCollect == c.f() ? objCollect : G.f1419a;
    }
}
