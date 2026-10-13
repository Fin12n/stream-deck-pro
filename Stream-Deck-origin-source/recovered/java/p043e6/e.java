package p043e6;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import io.ktor.utils.io.B;
import io.ktor.utils.io.C;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.I;
import p017b7.J;
import p017b7.Z;
import p034d6.f;
import p034d6.g;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f20796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f20797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f20798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f20800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r.d f20801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f20802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f20803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f20804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p221z6.g f20805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ReadableByteChannel f20806o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ i f20807p;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2442c f20809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2442c interfaceC2442c, G6.d dVar) {
                super(1, dVar);
                this.f20809b = interfaceC2442c;
            }

            @Override // I6.a
            public final G6.d create(G6.d dVar) {
                return new a(this.f20809b, dVar);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(G6.d dVar) {
                return ((a) create(dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f20808a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f20809b.d(new SocketTimeoutException());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r.d dVar, InterfaceC2442c interfaceC2442c, g gVar, ByteBuffer byteBuffer, p221z6.g gVar2, ReadableByteChannel readableByteChannel, i iVar, G6.d dVar2) {
            super(2, dVar2);
            this.f20801j = dVar;
            this.f20802k = interfaceC2442c;
            this.f20803l = gVar;
            this.f20804m = byteBuffer;
            this.f20805n = gVar2;
            this.f20806o = readableByteChannel;
            this.f20807p = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f20801j, this.f20802k, this.f20803l, this.f20804m, this.f20805n, this.f20806o, this.f20807p, dVar);
            bVar.f20800i = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((b) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00f8 A[Catch: all -> 0x004d, PHI: r1 r6 r7 r8 r9 r10 r11 r12
          0x00f8: PHI (r1v4 d6.i) = (r1v2 d6.i), (r1v10 d6.i) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r6v3 d6.g) = (r6v2 d6.g), (r6v10 d6.g) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r7v3 io.ktor.utils.io.c) = (r7v2 io.ktor.utils.io.c), (r7v8 io.ktor.utils.io.c) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r8v2 java.nio.ByteBuffer) = (r8v1 java.nio.ByteBuffer), (r8v6 java.nio.ByteBuffer) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r9v1 java.nio.channels.ReadableByteChannel) = (r9v0 java.nio.channels.ReadableByteChannel), (r9v5 java.nio.channels.ReadableByteChannel) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r10v4 io.ktor.network.util.b) = (r10v2 io.ktor.network.util.b), (r10v9 io.ktor.network.util.b) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r11v2 kotlin.jvm.internal.H) = (r11v1 kotlin.jvm.internal.H), (r11v7 kotlin.jvm.internal.H) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          0x00f8: PHI (r12v2 io.ktor.network.util.b) = (r12v1 io.ktor.network.util.b), (r12v3 io.ktor.network.util.b) binds: [B:49:0x0123, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x004d, blocks: (B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:84:0x0048, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0100 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:84:0x0048, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0120  */
        /* JADX WARN: Code duplicated, block: B:50:0x0125 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:84:0x0048, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:8:0x0016, B:68:0x018e, B:30:0x00a2, B:33:0x00bd, B:35:0x00c5, B:38:0x00e5, B:52:0x012c, B:54:0x0131, B:56:0x0138, B:65:0x0164, B:41:0x00eb, B:51:0x0127, B:69:0x0195, B:70:0x0198, B:20:0x006d, B:23:0x007a, B:25:0x007e, B:28:0x008a, B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:83:0x000a, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #1 {all -> 0x001c, blocks: (B:8:0x0016, B:68:0x018e, B:30:0x00a2, B:33:0x00bd, B:35:0x00c5, B:38:0x00e5, B:52:0x012c, B:54:0x0131, B:56:0x0138, B:65:0x0164, B:41:0x00eb, B:51:0x0127, B:69:0x0195, B:70:0x0198, B:20:0x006d, B:23:0x007a, B:25:0x007e, B:28:0x008a, B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:83:0x000a, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x014e A[Catch: ClosedChannelException -> 0x0161, TryCatch #0 {ClosedChannelException -> 0x0161, blocks: (B:59:0x0148, B:61:0x014e, B:62:0x0156), top: B:81:0x0148 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x0156 A[Catch: ClosedChannelException -> 0x0161, TRY_LEAVE, TryCatch #0 {ClosedChannelException -> 0x0161, blocks: (B:59:0x0148, B:61:0x014e, B:62:0x0156), top: B:81:0x0148 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0164 A[Catch: all -> 0x001c, TRY_ENTER, TryCatch #1 {all -> 0x001c, blocks: (B:8:0x0016, B:68:0x018e, B:30:0x00a2, B:33:0x00bd, B:35:0x00c5, B:38:0x00e5, B:52:0x012c, B:54:0x0131, B:56:0x0138, B:65:0x0164, B:41:0x00eb, B:51:0x0127, B:69:0x0195, B:70:0x0198, B:20:0x006d, B:23:0x007a, B:25:0x007e, B:28:0x008a, B:43:0x00f8, B:45:0x0100, B:48:0x0121, B:50:0x0125, B:15:0x0048), top: B:83:0x000a, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:33:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0123 -> B:43:0x00f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x018b -> B:9:0x0019). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e6.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20812c;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20811b = obj;
            this.f20812c |= Integer.MIN_VALUE;
            return e.e(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H f20813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableByteChannel f20814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(H h8, ReadableByteChannel readableByteChannel) {
            super(1);
            this.f20813a = h8;
            this.f20814b = readableByteChannel;
        }

        public final void b(ByteBuffer buffer) {
            t.g(buffer, "buffer");
            this.f20813a.f28777a = this.f20814b.read(buffer);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ByteBuffer) obj);
            return G.f1419a;
        }
    }

    public static final B c(J j8, InterfaceC2442c channel, ReadableByteChannel nioChannel, g selectable, i selector, r.d dVar) {
        t.g(j8, "<this>");
        t.g(channel, "channel");
        t.g(nioChannel, "nioChannel");
        t.g(selectable, "selectable");
        t.g(selector, "selector");
        return q.d(j8, Z.d().P1(new I("cio-from-nio-reader")), channel, new a(selectable, dVar, channel, nioChannel, selector, null));
    }

    public static final B d(J j8, InterfaceC2442c channel, ReadableByteChannel nioChannel, g selectable, i selector, p221z6.g pool, r.d dVar) {
        t.g(j8, "<this>");
        t.g(channel, "channel");
        t.g(nioChannel, "nioChannel");
        t.g(selectable, "selectable");
        t.g(selector, "selector");
        t.g(pool, "pool");
        return q.d(j8, Z.d().P1(new I("cio-from-nio-reader")), channel, new b(dVar, channel, selectable, (ByteBuffer) pool.b0(), pool, nioChannel, selector, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(j jVar, ReadableByteChannel readableByteChannel, G6.d dVar) {
        c cVar;
        H h8;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f20812c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f20812c = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f20811b;
        Object objF = H6.c.f();
        int i9 = cVar2.f20812c;
        if (i9 == 0) {
            r.b(obj);
            H h9 = new H();
            d dVar2 = new d(h9, readableByteChannel);
            cVar2.f20810a = h9;
            cVar2.f20812c = 1;
            if (j.a.a(jVar, 0, dVar2, cVar2, 1, null) == objF) {
                return objF;
            }
            h8 = h9;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8 = (H) cVar2.f20810a;
            r.b(obj);
        }
        return I6.b.d(h8.f28777a);
    }

    public static final Object f(g gVar, i iVar, G6.d dVar) {
        f fVar = f.READ;
        gVar.n0(fVar, true);
        Object objS = iVar.S(gVar, fVar, dVar);
        return objS == H6.c.f() ? objS : G.f1419a;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f20782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f20784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ g f20785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ r.d f20786i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f20787j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ReadableByteChannel f20788k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f20789l;

        /* JADX INFO: renamed from: e6.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0479a extends l implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20790a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2442c f20791b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0479a(InterfaceC2442c interfaceC2442c, G6.d dVar) {
                super(1, dVar);
                this.f20791b = interfaceC2442c;
            }

            @Override // I6.a
            public final G6.d create(G6.d dVar) {
                return new C0479a(this.f20791b, dVar);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(G6.d dVar) {
                return ((C0479a) create(dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f20790a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f20791b.d(new SocketTimeoutException());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, r.d dVar, InterfaceC2442c interfaceC2442c, ReadableByteChannel readableByteChannel, i iVar, G6.d dVar2) {
            super(2, dVar2);
            this.f20785h = gVar;
            this.f20786i = dVar;
            this.f20787j = interfaceC2442c;
            this.f20788k = readableByteChannel;
            this.f20789l = iVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f20785h, this.f20786i, this.f20787j, this.f20788k, this.f20789l, dVar);
            aVar.f20784g = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((a) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0130 A[Catch: all -> 0x0088, PHI: r1 r4 r5 r6 r7
          0x0130: PHI (r1v15 d6.i) = (r1v13 d6.i), (r1v16 d6.i) binds: [B:56:0x015f, B:48:0x012d] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r4v15 d6.g) = (r4v13 d6.g), (r4v16 d6.g) binds: [B:56:0x015f, B:48:0x012d] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r5v16 java.nio.channels.ReadableByteChannel) = (r5v14 java.nio.channels.ReadableByteChannel), (r5v17 java.nio.channels.ReadableByteChannel) binds: [B:56:0x015f, B:48:0x012d] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r6v14 io.ktor.utils.io.c) = (r6v12 io.ktor.utils.io.c), (r6v15 io.ktor.utils.io.c) binds: [B:56:0x015f, B:48:0x012d] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r7v15 io.ktor.network.util.b) = (r7v13 io.ktor.network.util.b), (r7v16 io.ktor.network.util.b) binds: [B:56:0x015f, B:48:0x012d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0088, blocks: (B:77:0x01c3, B:37:0x00f6, B:39:0x00fe, B:41:0x0108, B:44:0x011f, B:46:0x0127, B:48:0x012d, B:49:0x0130, B:52:0x0145, B:55:0x0159, B:58:0x0162, B:81:0x01cf, B:82:0x01d2, B:84:0x01da, B:93:0x0201, B:78:0x01c9, B:79:0x01cc, B:18:0x0083, B:23:0x00a0, B:26:0x00b9, B:29:0x00c5, B:31:0x00d1, B:34:0x00dd, B:7:0x002c, B:74:0x01b9, B:68:0x018d, B:71:0x01a3, B:76:0x01c1, B:59:0x0165, B:63:0x017c, B:65:0x0184, B:67:0x018a, B:12:0x004d, B:15:0x006a), top: B:103:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0143  */
        /* JADX WARN: Code duplicated, block: B:52:0x0145 A[Catch: all -> 0x0088, PHI: r1 r4 r5 r6 r7
          0x0145: PHI (r1v14 d6.i) = (r1v5 d6.i), (r1v15 d6.i) binds: [B:23:0x00a0, B:50:0x0141] A[DONT_GENERATE, DONT_INLINE]
          0x0145: PHI (r4v14 d6.g) = (r4v5 d6.g), (r4v15 d6.g) binds: [B:23:0x00a0, B:50:0x0141] A[DONT_GENERATE, DONT_INLINE]
          0x0145: PHI (r5v15 java.nio.channels.ReadableByteChannel) = (r5v6 java.nio.channels.ReadableByteChannel), (r5v16 java.nio.channels.ReadableByteChannel) binds: [B:23:0x00a0, B:50:0x0141] A[DONT_GENERATE, DONT_INLINE]
          0x0145: PHI (r6v13 io.ktor.utils.io.c) = (r6v4 io.ktor.utils.io.c), (r6v14 io.ktor.utils.io.c) binds: [B:23:0x00a0, B:50:0x0141] A[DONT_GENERATE, DONT_INLINE]
          0x0145: PHI (r7v14 io.ktor.network.util.b) = (r7v5 io.ktor.network.util.b), (r7v15 io.ktor.network.util.b) binds: [B:23:0x00a0, B:50:0x0141] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0088, blocks: (B:77:0x01c3, B:37:0x00f6, B:39:0x00fe, B:41:0x0108, B:44:0x011f, B:46:0x0127, B:48:0x012d, B:49:0x0130, B:52:0x0145, B:55:0x0159, B:58:0x0162, B:81:0x01cf, B:82:0x01d2, B:84:0x01da, B:93:0x0201, B:78:0x01c9, B:79:0x01cc, B:18:0x0083, B:23:0x00a0, B:26:0x00b9, B:29:0x00c5, B:31:0x00d1, B:34:0x00dd, B:7:0x002c, B:74:0x01b9, B:68:0x018d, B:71:0x01a3, B:76:0x01c1, B:59:0x0165, B:63:0x017c, B:65:0x0184, B:67:0x018a, B:12:0x004d, B:15:0x006a), top: B:103:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0158  */
        /* JADX WARN: Code duplicated, block: B:55:0x0159 A[Catch: all -> 0x0088, PHI: r1 r4 r5 r6 r7 r13
          0x0159: PHI (r1v13 d6.i) = (r1v7 d6.i), (r1v14 d6.i) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE]
          0x0159: PHI (r4v13 d6.g) = (r4v7 d6.g), (r4v14 d6.g) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE]
          0x0159: PHI (r5v14 java.nio.channels.ReadableByteChannel) = (r5v8 java.nio.channels.ReadableByteChannel), (r5v15 java.nio.channels.ReadableByteChannel) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE]
          0x0159: PHI (r6v12 io.ktor.utils.io.c) = (r6v6 io.ktor.utils.io.c), (r6v13 io.ktor.utils.io.c) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE]
          0x0159: PHI (r7v13 io.ktor.network.util.b) = (r7v7 io.ktor.network.util.b), (r7v14 io.ktor.network.util.b) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE]
          0x0159: PHI (r13v17 java.lang.Object) = (r13v0 java.lang.Object), (r13v21 java.lang.Object) binds: [B:18:0x0083, B:53:0x0156] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0088, blocks: (B:77:0x01c3, B:37:0x00f6, B:39:0x00fe, B:41:0x0108, B:44:0x011f, B:46:0x0127, B:48:0x012d, B:49:0x0130, B:52:0x0145, B:55:0x0159, B:58:0x0162, B:81:0x01cf, B:82:0x01d2, B:84:0x01da, B:93:0x0201, B:78:0x01c9, B:79:0x01cc, B:18:0x0083, B:23:0x00a0, B:26:0x00b9, B:29:0x00c5, B:31:0x00d1, B:34:0x00dd, B:7:0x002c, B:74:0x01b9, B:68:0x018d, B:71:0x01a3, B:76:0x01c1, B:59:0x0165, B:63:0x017c, B:65:0x0184, B:67:0x018a, B:12:0x004d, B:15:0x006a), top: B:103:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0161  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0127 -> B:37:0x00f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x012b -> B:37:0x00f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015f -> B:49:0x0130). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0161 -> B:37:0x00f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0184 -> B:76:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0188 -> B:76:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01b6 -> B:74:0x01b9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e6.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
