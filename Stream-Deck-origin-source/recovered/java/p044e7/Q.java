package p044e7;

import C6.G;
import C6.r;
import H6.c;
import I6.d;
import Q6.o;
import p053f7.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q implements InterfaceC2261g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2261g f20962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20963b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f20966c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20968e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20966c = obj;
            this.f20968e |= Integer.MIN_VALUE;
            return Q.this.a(this);
        }
    }

    public Q(InterfaceC2261g interfaceC2261g, o oVar) {
        this.f20962a = interfaceC2261g;
        this.f20963b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((p044e7.Q) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [f7.u] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(G6.d dVar) {
        a aVar;
        u uVar;
        Q q8;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f20968e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f20968e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f20966c;
        Object objF = c.f();
        ?? r8 = aVar.f20968e;
        try {
            if (r8 != 0) {
                if (r8 == 1) {
                    uVar = (u) aVar.f20965b;
                    q8 = (Q) aVar.f20964a;
                    r.b(obj);
                } else {
                    if (r8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            uVar = new u(this.f20962a, aVar.getContext());
            o oVar = this.f20963b;
            aVar.f20964a = this;
            aVar.f20965b = uVar;
            aVar.f20968e = 1;
            if (oVar.invoke(uVar, aVar) != objF) {
                q8 = this;
            }
            return objF;
            uVar.releaseIntercepted();
            InterfaceC2261g interfaceC2261g = q8.f20962a;
            r8 = interfaceC2261g instanceof Q;
            if (r8 == 0) {
                return G.f1419a;
            }
            aVar.f20964a = null;
            aVar.f20965b = null;
            aVar.f20968e = 2;
        } catch (Throwable th) {
            r8.releaseIntercepted();
            throw th;
        }
    }

    @Override // p044e7.InterfaceC2261g
    public Object emit(Object obj, G6.d dVar) {
        return this.f20962a.emit(obj, dVar);
    }
}
