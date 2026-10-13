package io.ktor.utils.io.internal;

import C6.G;
import C6.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import p017b7.B0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25441a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0578a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25443b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25445d;

        public C0578a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25443b = obj;
            this.f25445d |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25447b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25449d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25447b = obj;
            this.f25449d |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public final void b(Throwable th) {
        InterfaceC1818x interfaceC1818x = (InterfaceC1818x) f25441a.getAndSet(this, null);
        if (interfaceC1818x == null) {
            return;
        }
        if (th != null) {
            interfaceC1818x.v(th);
        } else {
            interfaceC1818x.i1();
        }
    }

    public final void c() {
        InterfaceC1818x interfaceC1818x = (InterfaceC1818x) f25441a.getAndSet(this, null);
        if (interfaceC1818x != null) {
            interfaceC1818x.i1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Function0 function0, G6.d dVar) {
        C0578a c0578a;
        a aVar;
        if (dVar instanceof C0578a) {
            c0578a = (C0578a) dVar;
            int i8 = c0578a.f25445d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0578a.f25445d = i8 - Integer.MIN_VALUE;
            } else {
                c0578a = new C0578a(dVar);
            }
        } else {
            c0578a = new C0578a(dVar);
        }
        Object objE = c0578a.f25443b;
        Object objF = H6.c.f();
        int i9 = c0578a.f25445d;
        if (i9 == 0) {
            r.b(objE);
            c0578a.f25442a = this;
            c0578a.f25445d = 1;
            objE = e(function0, c0578a);
            if (objE == objF) {
                return objF;
            }
            aVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c0578a.f25442a;
            r.b(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            return G.f1419a;
        }
        aVar.c();
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Function0 function0, G6.d dVar) {
        b bVar;
        int i8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f25449d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f25449d = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f25447b;
        Object objF = H6.c.f();
        int i10 = bVar.f25449d;
        if (i10 == 0) {
            r.b(obj);
            InterfaceC1818x interfaceC1818xB = B0.b(null, 1, null);
            if (F1.b.a(f25441a, this, null, interfaceC1818xB) && ((Boolean) function0.invoke()).booleanValue()) {
                bVar.f25446a = 1;
                bVar.f25449d = 1;
                if (interfaceC1818xB.i0(bVar) == objF) {
                    return objF;
                }
                i8 = 1;
            } else {
                i8 = 0;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = bVar.f25446a;
            r.b(obj);
        }
        return I6.b.a(i8 != 0);
    }
}
