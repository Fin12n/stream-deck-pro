package io.ktor.websocket;

import C6.G;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1785g;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.utils.io.g f25739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f25740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f25742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f25743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f25744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p035d7.g f25745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1815v0 f25746h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        HEADER,
        BODY,
        CLOSED
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25751a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25751a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25753b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25755d;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25753b = obj;
            this.f25755d |= Integer.MIN_VALUE;
            return v.this.g(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25758c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25760e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25758c = obj;
            this.f25760e |= Integer.MIN_VALUE;
            return v.this.h(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25763c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25765e;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25763c = obj;
            this.f25765e |= Integer.MIN_VALUE;
            return v.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p221z6.g f25768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v f25769d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p221z6.g gVar, v vVar, G6.d dVar) {
            super(2, dVar);
            this.f25768c = gVar;
            this.f25769d = vVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new f(this.f25768c, this.f25769d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX INFO: Infinite loop detected, blocks: 4, insns: 0 */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            ByteBuffer byteBuffer;
            l e8;
            h e9;
            Object objF = H6.c.f();
            int i8 = this.f25767b;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f25768c.b0();
                    try {
                        v vVar = this.f25769d;
                        this.f25766a = byteBuffer2;
                        this.f25767b = 1;
                        if (vVar.i(byteBuffer2, this) == objF) {
                            return objF;
                        }
                    } catch (h e10) {
                        byteBuffer = byteBuffer2;
                        e9 = e10;
                        this.f25769d.f25745g.d(e9);
                        this.f25768c.H1(byteBuffer);
                        d7.y.a.a(this.f25769d.f25745g, null, 1, null);
                        return G.f1419a;
                    } catch (l e11) {
                        byteBuffer = byteBuffer2;
                        e8 = e11;
                        this.f25769d.f25745g.d(e8);
                        this.f25768c.H1(byteBuffer);
                        d7.y.a.a(this.f25769d.f25745g, null, 1, null);
                        return G.f1419a;
                    } catch (ClosedChannelException | CancellationException unused) {
                    } catch (p124n6.b unused2) {
                        byteBuffer = byteBuffer2;
                        d7.x.a.a(this.f25769d.f25745g, null, 1, null);
                        this.f25768c.H1(byteBuffer);
                        d7.y.a.a(this.f25769d.f25745g, null, 1, null);
                        return G.f1419a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                    byteBuffer = byteBuffer2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (ByteBuffer) this.f25766a;
                    try {
                        C6.r.b(obj);
                    } catch (h e12) {
                        e9 = e12;
                        this.f25769d.f25745g.d(e9);
                    } catch (l e13) {
                        e8 = e13;
                        this.f25769d.f25745g.d(e8);
                    } catch (ClosedChannelException | CancellationException unused3) {
                    } catch (p124n6.b unused4) {
                        d7.x.a.a(this.f25769d.f25745g, null, 1, null);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f25768c.H1(byteBuffer);
                d7.y.a.a(this.f25769d.f25745g, null, 1, null);
                return G.f1419a;
            } catch (Throwable th4) {
                this.f25768c.H1(objF);
                d7.y.a.a(this.f25769d.f25745g, null, 1, null);
                throw th4;
            }
        }
    }

    public v(io.ktor.utils.io.g byteChannel, G6.g coroutineContext, long j8, p221z6.g pool) {
        kotlin.jvm.internal.t.g(byteChannel, "byteChannel");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(pool, "pool");
        this.f25739a = byteChannel;
        this.f25740b = coroutineContext;
        this.f25741c = j8;
        this.f25742d = a.HEADER;
        this.f25743e = new g();
        this.f25744f = new p();
        this.f25745g = p035d7.j.b(8, null, null, 6, null);
        this.f25746h = AbstractC1785g.c(this, new I("ws-reader"), L.ATOMIC, new f(pool, this, null));
    }

    public final void M1(long j8) {
        this.f25741c = j8;
    }

    public final p035d7.x c() {
        return this.f25745g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(G6.d dVar) {
        c cVar;
        v vVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f25755d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f25755d = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f25753b;
        Object objF = H6.c.f();
        int i9 = cVar.f25755d;
        if (i9 == 0) {
            C6.r.b(obj);
            if (!this.f25744f.a()) {
                this.f25742d = this.f25743e.e() == i.CLOSE ? a.CLOSED : a.HEADER;
                g gVar = this.f25743e;
                io.ktor.websocket.e eVarA = io.ktor.websocket.e.f25649i.a(gVar.d(), gVar.e(), p115m6.w.e(this.f25744f.d(gVar.g())), gVar.h(), gVar.i(), gVar.j());
                p035d7.g gVar2 = this.f25745g;
                cVar.f25752a = this;
                cVar.f25755d = 1;
                if (gVar2.i(eVarA, cVar) == objF) {
                    return objF;
                }
                vVar = this;
            }
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vVar = (v) cVar.f25752a;
        C6.r.b(obj);
        vVar.f25743e.a();
        return G.f1419a;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f25740b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ByteBuffer byteBuffer, G6.d dVar) throws h {
        d dVar2;
        v vVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f25760e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f25760e = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f25758c;
        Object objF = H6.c.f();
        int i9 = dVar2.f25760e;
        if (i9 == 0) {
            C6.r.b(obj);
            vVar = this;
        } else {
            if (i9 != 1 && i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) dVar2.f25757b;
            vVar = (v) dVar2.f25756a;
            C6.r.b(obj);
        }
        while (byteBuffer.hasRemaining()) {
            int i10 = b.f25751a[vVar.f25742d.ordinal()];
            if (i10 == 1) {
                vVar.f25743e.b(byteBuffer);
                if (!vVar.f25743e.c()) {
                    return G.f1419a;
                }
                vVar.f25742d = a.BODY;
                if (vVar.f25743e.f() > 2147483647L || vVar.f25743e.f() > vVar.f25741c) {
                    throw new h(vVar.f25743e.f());
                }
                vVar.f25744f.c((int) vVar.f25743e.f(), byteBuffer);
                dVar2.f25756a = vVar;
                dVar2.f25757b = byteBuffer;
                dVar2.f25760e = 1;
                if (vVar.g(dVar2) == objF) {
                    return objF;
                }
            } else if (i10 == 2) {
                vVar.f25744f.b(byteBuffer);
                dVar2.f25756a = vVar;
                dVar2.f25757b = byteBuffer;
                dVar2.f25760e = 2;
                if (vVar.g(dVar2) == objF) {
                    return objF;
                }
            } else if (i10 == 3) {
                return G.f1419a;
            }
        }
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r2.h(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ByteBuffer byteBuffer, G6.d dVar) {
        e eVar;
        v vVar;
        v vVar2;
        Object objT;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f25765e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f25765e = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f25763c;
        Object objF = H6.c.f();
        int i9 = eVar.f25765e;
        if (i9 == 0) {
            C6.r.b(obj);
            byteBuffer.clear();
            vVar = this;
            if (vVar.f25742d != a.CLOSED) {
                io.ktor.utils.io.g gVar = vVar.f25739a;
                eVar.f25761a = vVar;
                eVar.f25762b = byteBuffer;
                eVar.f25765e = 1;
                objT = gVar.t(byteBuffer, eVar);
                if (objT != objF) {
                    vVar2 = vVar;
                    obj = objT;
                    if (((Number) obj).intValue() == -1) {
                        vVar2.f25742d = a.CLOSED;
                    } else {
                        byteBuffer.flip();
                        eVar.f25761a = vVar2;
                        eVar.f25762b = byteBuffer;
                        eVar.f25765e = 2;
                    }
                }
                return objF;
            }
            return G.f1419a;
        }
        if (i9 == 1) {
            byteBuffer = (ByteBuffer) eVar.f25762b;
            vVar2 = (v) eVar.f25761a;
            C6.r.b(obj);
            if (((Number) obj).intValue() == -1) {
                vVar2.f25742d = a.CLOSED;
            } else {
                byteBuffer.flip();
                eVar.f25761a = vVar2;
                eVar.f25762b = byteBuffer;
                eVar.f25765e = 2;
            }
            return G.f1419a;
        }
        if (i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        byteBuffer = (ByteBuffer) eVar.f25762b;
        vVar2 = (v) eVar.f25761a;
        C6.r.b(obj);
        vVar = vVar2;
        byteBuffer.compact();
        if (vVar.f25742d != a.CLOSED) {
            io.ktor.utils.io.g gVar2 = vVar.f25739a;
            eVar.f25761a = vVar;
            eVar.f25762b = byteBuffer;
            eVar.f25765e = 1;
            objT = gVar2.t(byteBuffer, eVar);
            if (objT != objF) {
                vVar2 = vVar;
                obj = objT;
                if (((Number) obj).intValue() == -1) {
                    vVar2.f25742d = a.CLOSED;
                } else {
                    byteBuffer.flip();
                    eVar.f25761a = vVar2;
                    eVar.f25762b = byteBuffer;
                    eVar.f25765e = 2;
                }
            }
            return objF;
        }
        return G.f1419a;
    }

    public /* synthetic */ v(io.ktor.utils.io.g gVar, G6.g gVar2, long j8, p221z6.g gVar3, int i8, AbstractC2633k abstractC2633k) {
        this(gVar, gVar2, j8, (i8 & 8) != 0 ? p124n6.a.a() : gVar3);
    }
}
