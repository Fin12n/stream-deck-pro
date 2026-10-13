package io.ktor.client.engine.cio;

import C6.G;
import C6.r;
import java.nio.ByteBuffer;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f24875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f24877g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f24878h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.j jVar, io.ktor.utils.io.g gVar, G6.d dVar) {
            super(2, dVar);
            this.f24877g = jVar;
            this.f24878h = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f24877g, this.f24878h, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0089  */
        /* JADX WARN: Code duplicated, block: B:26:0x008a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0098 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0023, B:23:0x0074, B:27:0x0090, B:29:0x0098, B:36:0x00c1, B:33:0x00ae, B:18:0x005e, B:22:0x0071, B:30:0x009b, B:15:0x0044), top: B:49:0x0009, outer: #2, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0023, B:23:0x0074, B:27:0x0090, B:29:0x0098, B:36:0x00c1, B:33:0x00ae, B:18:0x005e, B:22:0x0071, B:30:0x009b, B:15:0x0044), top: B:49:0x0009, outer: #2, inners: #3 }] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            if (r6.b(r1, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            if (io.ktor.utils.io.i.d(r7, r10) == r0) goto L35;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ab -> B:16:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00be -> B:16:0x0047). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            p221z6.g gVarA;
            Object objB0;
            io.ktor.utils.io.g gVar;
            io.ktor.utils.io.j jVar;
            ByteBuffer byteBuffer;
            io.ktor.utils.io.g gVar2;
            io.ktor.utils.io.j jVar2;
            ByteBuffer byteBuffer2;
            Object objT;
            Object objF = H6.c.f();
            int i8 = this.f24876f;
            try {
                try {
                    if (i8 == 0) {
                        r.b(obj);
                        gVarA = V5.b.a();
                        gVar = this.f24878h;
                        jVar = this.f24877g;
                        objB0 = gVarA.b0();
                        byteBuffer = (ByteBuffer) objB0;
                        byteBuffer.clear();
                        this.f24871a = gVarA;
                        this.f24872b = gVar;
                        this.f24873c = jVar;
                        this.f24874d = objB0;
                        this.f24875e = byteBuffer;
                        this.f24876f = 1;
                        objT = gVar.t(byteBuffer, this);
                        if (objT == objF) {
                            gVar2 = gVar;
                            obj = objT;
                            ByteBuffer byteBuffer3 = byteBuffer;
                            jVar2 = jVar;
                            byteBuffer2 = byteBuffer3;
                            if (((Number) obj).intValue() < 0) {
                                G g8 = G.f1419a;
                                gVarA.H1(objB0);
                                io.ktor.utils.io.k.a(this.f24877g);
                                return G.f1419a;
                            }
                            byteBuffer2.flip();
                            this.f24871a = gVarA;
                            this.f24872b = gVar2;
                            this.f24873c = jVar2;
                            this.f24874d = objB0;
                            this.f24875e = byteBuffer2;
                            this.f24876f = 2;
                        }
                        return objF;
                    }
                    if (i8 != 1) {
                        if (i8 == 2) {
                            byteBuffer2 = (ByteBuffer) this.f24875e;
                            objB0 = this.f24874d;
                            jVar2 = (io.ktor.utils.io.j) this.f24873c;
                            gVar2 = (io.ktor.utils.io.g) this.f24872b;
                            gVarA = (p221z6.g) this.f24871a;
                            try {
                                r.b(obj);
                            } catch (Throwable unused) {
                                this.f24871a = gVarA;
                                this.f24872b = gVar2;
                                this.f24873c = jVar2;
                                this.f24874d = objB0;
                                this.f24875e = byteBuffer2;
                                this.f24876f = 3;
                            }
                        } else {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            byteBuffer2 = (ByteBuffer) this.f24875e;
                            objB0 = this.f24874d;
                            jVar2 = (io.ktor.utils.io.j) this.f24873c;
                            gVar2 = (io.ktor.utils.io.g) this.f24872b;
                            gVarA = (p221z6.g) this.f24871a;
                            r.b(obj);
                        }
                        io.ktor.utils.io.j jVar3 = jVar2;
                        byteBuffer = byteBuffer2;
                        jVar = jVar3;
                        gVar = gVar2;
                        byteBuffer.clear();
                        this.f24871a = gVarA;
                        this.f24872b = gVar;
                        this.f24873c = jVar;
                        this.f24874d = objB0;
                        this.f24875e = byteBuffer;
                        this.f24876f = 1;
                        objT = gVar.t(byteBuffer, this);
                        if (objT == objF) {
                            gVar2 = gVar;
                            obj = objT;
                            ByteBuffer byteBuffer4 = byteBuffer;
                            jVar2 = jVar;
                            byteBuffer2 = byteBuffer4;
                            if (((Number) obj).intValue() < 0) {
                                G g9 = G.f1419a;
                                gVarA.H1(objB0);
                                io.ktor.utils.io.k.a(this.f24877g);
                                return G.f1419a;
                            }
                            byteBuffer2.flip();
                            this.f24871a = gVarA;
                            this.f24872b = gVar2;
                            this.f24873c = jVar2;
                            this.f24874d = objB0;
                            this.f24875e = byteBuffer2;
                            this.f24876f = 2;
                        }
                        return objF;
                    }
                    byteBuffer2 = (ByteBuffer) this.f24875e;
                    objB0 = this.f24874d;
                    jVar2 = (io.ktor.utils.io.j) this.f24873c;
                    gVar2 = (io.ktor.utils.io.g) this.f24872b;
                    gVarA = (p221z6.g) this.f24871a;
                    r.b(obj);
                    if (((Number) obj).intValue() < 0) {
                        G g10 = G.f1419a;
                        gVarA.H1(objB0);
                        io.ktor.utils.io.k.a(this.f24877g);
                        return G.f1419a;
                    }
                    byteBuffer2.flip();
                    this.f24871a = gVarA;
                    this.f24872b = gVar2;
                    this.f24873c = jVar2;
                    this.f24874d = objB0;
                    this.f24875e = byteBuffer2;
                    this.f24876f = 2;
                } catch (Throwable th) {
                    gVarA.H1(objB0);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f24877g.d(th2);
                    throw th2;
                } catch (Throwable th3) {
                    io.ktor.utils.io.k.a(this.f24877g);
                    throw th3;
                }
            }
        }
    }

    public static final InterfaceC1815v0 b(J j8, io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar) {
        return AbstractC1789i.d(j8, null, null, new a(jVar, gVar, null), 3, null);
    }
}
