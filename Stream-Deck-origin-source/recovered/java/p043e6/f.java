package p043e6;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.k;
import Q6.o;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.q;
import io.ktor.utils.io.v;
import io.ktor.utils.io.y;
import io.ktor.utils.io.z;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.t;
import p017b7.I;
import p017b7.J;
import p017b7.Z;
import p034d6.g;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f20817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f20818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WritableByteChannel f20819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r.d f20820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i f20821g;

        /* JADX INFO: renamed from: e6.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0480a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f20822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f20823b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f20824c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f20825d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f20826e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f20827f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Object f20828g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f20829h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f20830i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ r.d f20831j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ z f20832k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2442c f20833l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ WritableByteChannel f20834m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ g f20835n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ i f20836o;

            /* JADX INFO: renamed from: e6.f$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0481a extends l implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f20837a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2442c f20838b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0481a(InterfaceC2442c interfaceC2442c, d dVar) {
                    super(1, dVar);
                    this.f20838b = interfaceC2442c;
                }

                @Override // I6.a
                public final d create(d dVar) {
                    return new C0481a(this.f20838b, dVar);
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(d dVar) {
                    return ((C0481a) create(dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    c.f();
                    if (this.f20837a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f20838b.d(new SocketTimeoutException());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0480a(r.d dVar, z zVar, InterfaceC2442c interfaceC2442c, WritableByteChannel writableByteChannel, g gVar, i iVar, d dVar2) {
                super(2, dVar2);
                this.f20831j = dVar;
                this.f20832k = zVar;
                this.f20833l = interfaceC2442c;
                this.f20834m = writableByteChannel;
                this.f20835n = gVar;
                this.f20836o = iVar;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0480a c0480a = new C0480a(this.f20831j, this.f20832k, this.f20833l, this.f20834m, this.f20835n, this.f20836o, dVar);
                c0480a.f20830i = obj;
                return c0480a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v vVar, d dVar) {
                return ((C0480a) create(vVar, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00db  */
            /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:48:0x011d  */
            /* JADX WARN: Code duplicated, block: B:50:0x0121  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a7 -> B:36:0x00d5). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c9 -> B:24:0x00a2). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011f -> B:41:0x00f1). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0136 -> B:57:0x0156). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0153 -> B:57:0x0156). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e6.f.a.C0480a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, InterfaceC2442c interfaceC2442c, WritableByteChannel writableByteChannel, r.d dVar, i iVar, d dVar2) {
            super(2, dVar2);
            this.f20817c = gVar;
            this.f20818d = interfaceC2442c;
            this.f20819e = writableByteChannel;
            this.f20820f = dVar;
            this.f20821g = iVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f20817c, this.f20818d, this.f20819e, this.f20820f, this.f20821g, dVar);
            aVar.f20816b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z zVar, d dVar) {
            return ((a) create(zVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objF = c.f();
            int i8 = this.f20815a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    z zVar = (z) this.f20816b;
                    this.f20817c.n0(p034d6.f.f19867g, false);
                    InterfaceC2442c interfaceC2442c = this.f20818d;
                    C0480a c0480a = new C0480a(this.f20820f, zVar, interfaceC2442c, this.f20819e, this.f20817c, this.f20821g, null);
                    this.f20815a = 1;
                    if (interfaceC2442c.e(c0480a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                this.f20817c.n0(p034d6.f.f19867g, false);
                if (this.f20819e instanceof SocketChannel) {
                    try {
                        if (l.b()) {
                            ((SocketChannel) this.f20819e).shutdownOutput();
                        } else {
                            ((SocketChannel) this.f20819e).socket().shutdownOutput();
                        }
                    } catch (ClosedChannelException unused) {
                    }
                }
                return G.f1419a;
            } catch (Throwable th) {
                this.f20817c.n0(p034d6.f.f19867g, false);
                if (!(this.f20819e instanceof SocketChannel)) {
                    throw th;
                }
                try {
                    if (l.b()) {
                        ((SocketChannel) this.f20819e).shutdownOutput();
                    } else {
                        ((SocketChannel) this.f20819e).socket().shutdownOutput();
                    }
                    throw th;
                } catch (ClosedChannelException unused2) {
                    throw th;
                }
            }
        }
    }

    public static final y a(J j8, InterfaceC2442c channel, WritableByteChannel nioChannel, g selectable, i selector, r.d dVar) {
        t.g(j8, "<this>");
        t.g(channel, "channel");
        t.g(nioChannel, "nioChannel");
        t.g(selectable, "selectable");
        t.g(selector, "selector");
        return q.b(j8, Z.d().P1(new I("cio-to-nio-writer")), channel, new a(selectable, channel, nioChannel, dVar, selector, null));
    }
}
