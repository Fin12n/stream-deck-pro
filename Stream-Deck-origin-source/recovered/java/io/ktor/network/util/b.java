package io.ktor.network.util;

import C6.G;
import C6.r;
import G6.d;
import I6.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.U;
import p017b7.d1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f25020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f25021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f25022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1815v0 f25023f;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25024a;

        public a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return b.this.new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0080 A[EDGE_INSN: B:27:0x0080->B:30:0x0089 BREAK  A[LOOP:0: B:15:0x0029->B:38:?]] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            k kVar;
            Object objF = H6.c.f();
            int i8 = this.f25024a;
            try {
                if (i8 == 0 || i8 == 1) {
                    r.b(obj);
                    do {
                        if (b.this.isStarted == 0) {
                            b bVar = b.this;
                            bVar.lastActivityTime = ((Number) bVar.f25020c.invoke()).longValue();
                        }
                        jLongValue = (b.this.lastActivityTime + b.this.f25019b) - ((Number) b.this.f25020c.invoke()).longValue();
                        if (jLongValue <= 0 && b.this.isStarted != 0) {
                            this.f25024a = 2;
                            if (d1.a(this) != objF) {
                                kVar = b.this.f25022e;
                                this.f25024a = 3;
                                if (kVar.invoke(this) == objF) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            this.f25024a = 1;
                        }
                    } while (U.a(jLongValue, this) != objF);
                    return objF;
                }
                if (i8 == 2) {
                    r.b(obj);
                    kVar = b.this.f25022e;
                    this.f25024a = 3;
                    if (kVar.invoke(this) == objF) {
                        break;
                        return objF;
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
            } catch (Throwable unused) {
            }
            return G.f1419a;
        }
    }

    public b(String name, long j8, Function0 clock, J scope, k onTimeout) {
        t.g(name, "name");
        t.g(clock, "clock");
        t.g(scope, "scope");
        t.g(onTimeout, "onTimeout");
        this.f25018a = name;
        this.f25019b = j8;
        this.f25020c = clock;
        this.f25021d = scope;
        this.f25022e = onTimeout;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.f25023f = e();
    }

    public final void d() {
        InterfaceC1815v0 interfaceC1815v0 = this.f25023f;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
    }

    public final InterfaceC1815v0 e() {
        if (this.f25019b == Long.MAX_VALUE) {
            return null;
        }
        J j8 = this.f25021d;
        return AbstractC1789i.d(j8, j8.getCoroutineContext().P1(new I("Timeout " + this.f25018a)), null, new a(null), 2, null);
    }

    public final void f() {
        this.lastActivityTime = ((Number) this.f25020c.invoke()).longValue();
        this.isStarted = 1;
    }

    public final void g() {
        this.isStarted = 0;
    }
}
