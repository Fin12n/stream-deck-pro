package io.ktor.utils.io.jvm.javaio;

import C6.G;
import C6.r;
import java.io.InputStream;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.utils.io.g f25524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1818x f25525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f25526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f25527d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d f25528g;

        /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0580a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f25529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f25530b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f25531c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f25533e;

            public C0580a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f25531c = obj;
                this.f25533e |= Integer.MIN_VALUE;
                return a.this.h(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1815v0 interfaceC1815v0, d dVar) {
            super(interfaceC1815v0);
            this.f25528g = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0061 A[PHI: r2 r10
          0x0061: PHI (r2v2 io.ktor.utils.io.jvm.javaio.d$a) = (r2v3 io.ktor.utils.io.jvm.javaio.d$a), (r2v8 io.ktor.utils.io.jvm.javaio.d$a) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r10v3 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            if (r10 == r1) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:25:0x0084). Please report as a decompilation issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object h(G6.d dVar) {
            C0580a c0580a;
            int iIntValue;
            a aVar;
            if (dVar instanceof C0580a) {
                c0580a = (C0580a) dVar;
                int i8 = c0580a.f25533e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0580a.f25533e = i8 - Integer.MIN_VALUE;
                } else {
                    c0580a = new C0580a(dVar);
                }
            } else {
                c0580a = new C0580a(dVar);
            }
            Object objG = c0580a.f25531c;
            Object objF = H6.c.f();
            int i9 = c0580a.f25533e;
            if (i9 == 0) {
                r.b(objG);
                iIntValue = 0;
                aVar = this;
                aVar.result = iIntValue;
                c0580a.f25529a = aVar;
                c0580a.f25530b = aVar;
                c0580a.f25533e = 1;
                objG = aVar.j(c0580a);
                if (objG == H6.c.f()) {
                    I6.h.c(c0580a);
                }
                if (objG != objF) {
                    t.e(objG, "null cannot be cast to non-null type kotlin.ByteArray");
                    io.ktor.utils.io.g gVar = aVar.f25528g.f25524a;
                    int iF = aVar.f();
                    int iE = aVar.e();
                    c0580a.f25529a = aVar;
                    c0580a.f25530b = null;
                    c0580a.f25533e = 2;
                    objG = gVar.G((byte[]) objG, iF, iE, c0580a);
                }
                return objF;
            }
            if (i9 == 1) {
                aVar = (a) c0580a.f25529a;
                r.b(objG);
                t.e(objG, "null cannot be cast to non-null type kotlin.ByteArray");
                io.ktor.utils.io.g gVar2 = aVar.f25528g.f25524a;
                int iF2 = aVar.f();
                int iE2 = aVar.e();
                c0580a.f25529a = aVar;
                c0580a.f25530b = null;
                c0580a.f25533e = 2;
                objG = gVar2.G((byte[]) objG, iF2, iE2, c0580a);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) c0580a.f25529a;
                r.b(objG);
            }
            iIntValue = ((Number) objG).intValue();
            if (iIntValue == -1) {
                aVar.f25528g.f25525b.i1();
                aVar.d(iIntValue);
                return G.f1419a;
            }
            aVar.result = iIntValue;
            c0580a.f25529a = aVar;
            c0580a.f25530b = aVar;
            c0580a.f25533e = 1;
            objG = aVar.j(c0580a);
            if (objG == H6.c.f()) {
                I6.h.c(c0580a);
            }
            if (objG != objF) {
                t.e(objG, "null cannot be cast to non-null type kotlin.ByteArray");
                io.ktor.utils.io.g gVar3 = aVar.f25528g.f25524a;
                int iF3 = aVar.f();
                int iE3 = aVar.e();
                c0580a.f25529a = aVar;
                c0580a.f25530b = null;
                c0580a.f25533e = 2;
                objG = gVar3.G((byte[]) objG, iF3, iE3, c0580a);
            }
            return objF;
        }
    }

    public d(InterfaceC1815v0 interfaceC1815v0, io.ktor.utils.io.g channel) {
        t.g(channel, "channel");
        this.f25524a = channel;
        this.f25525b = AbstractC1823z0.a(interfaceC1815v0);
        this.f25526c = new a(interfaceC1815v0, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f25524a.j();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            io.ktor.utils.io.i.a(this.f25524a);
            if (!this.f25525b.y()) {
                InterfaceC1815v0.a.a(this.f25525b, null, 1, null);
            }
            this.f25526c.k();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.f25527d;
            if (bArr == null) {
                bArr = new byte[1];
                this.f25527d = bArr;
            }
            int iM = this.f25526c.m(bArr, 0, 1);
            if (iM == -1) {
                return -1;
            }
            if (iM == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iM + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i8, int i9) {
        a aVar;
        aVar = this.f25526c;
        t.d(bArr);
        return aVar.m(bArr, i8, i9);
    }
}
