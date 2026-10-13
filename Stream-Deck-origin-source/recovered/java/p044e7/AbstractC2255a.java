package p044e7;

import C6.G;
import C6.r;
import H6.c;
import I6.d;
import p053f7.u;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2255a implements InterfaceC2260f {

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0484a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20971b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20973d;

        public C0484a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20971b = obj;
            this.f20973d |= Integer.MIN_VALUE;
            return AbstractC2255a.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p044e7.InterfaceC2260f
    public final Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) throws Throwable {
        C0484a c0484a;
        Throwable th;
        u uVar;
        if (dVar instanceof C0484a) {
            c0484a = (C0484a) dVar;
            int i8 = c0484a.f20973d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0484a.f20973d = i8 - Integer.MIN_VALUE;
            } else {
                c0484a = new C0484a(dVar);
            }
        } else {
            c0484a = new C0484a(dVar);
        }
        Object obj = c0484a.f20971b;
        Object objF = c.f();
        int i9 = c0484a.f20973d;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) c0484a.f20970a;
            try {
                r.b(obj);
                uVar.releaseIntercepted();
                return G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                uVar.releaseIntercepted();
                throw th;
            }
        }
        r.b(obj);
        u uVar2 = new u(interfaceC2261g, c0484a.getContext());
        try {
            c0484a.f20970a = uVar2;
            c0484a.f20973d = 1;
            if (f(uVar2, c0484a) == objF) {
                return objF;
            }
            uVar = uVar2;
            uVar.releaseIntercepted();
            return G.f1419a;
        } catch (Throwable th3) {
            th = th3;
            uVar = uVar2;
            uVar.releaseIntercepted();
            throw th;
        }
    }

    public abstract Object f(InterfaceC2261g interfaceC2261g, G6.d dVar);
}
