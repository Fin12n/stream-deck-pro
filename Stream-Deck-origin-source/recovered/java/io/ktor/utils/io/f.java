package io.ktor.utils.io;

import C6.G;
import E4.JFpq.XRlnZWSrAFn;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.I;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements InterfaceC2442c, io.ktor.utils.io.g, io.ktor.utils.io.j, io.ktor.utils.io.A, io.ktor.utils.io.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f25270h = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesRead");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f25271i = AtomicLongFieldUpdater.newUpdater(f.class, "_totalBytesWritten");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25272j = AtomicIntegerFieldUpdater.newUpdater(f.class, "_availableForRead");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25273k = AtomicIntegerFieldUpdater.newUpdater(f.class, "channelSize");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25274l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_closed");
    private volatile /* synthetic */ int _availableForRead;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _lastReadView;
    private volatile /* synthetic */ long _totalBytesRead;
    private volatile /* synthetic */ long _totalBytesWritten;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p205x6.j f25276c;
    private volatile /* synthetic */ int channelSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p205x6.k f25277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.ktor.utils.io.internal.a f25278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f25279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p205x6.j f25280g;
    private volatile /* synthetic */ int lastReadAvailable$delegate;
    private volatile /* synthetic */ Object lastReadView$delegate;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class A extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f25282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25283c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25285e;

        public A(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25283c = obj;
            this.f25285e |= Integer.MIN_VALUE;
            return f.W0(f.this, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class B extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25288c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25290e;

        public B(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25288c = obj;
            this.f25290e |= Integer.MIN_VALUE;
            return f.X0(f.this, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f25292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25293c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25295e;

        public C(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25293c = obj;
            this.f25295e |= Integer.MIN_VALUE;
            return f.Y0(f.this, (short) 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.f$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2443a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25298c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25300e;

        public C2443a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25298c = obj;
            this.f25300e |= Integer.MIN_VALUE;
            return f.this.Y(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.f$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2444b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2444b(int i8) {
            super(0);
            this.f25302b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.j() < this.f25302b && !f.this.J());
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.f$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2445c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25305c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25307e;

        public C2445c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25305c = obj;
            this.f25307e |= Integer.MIN_VALUE;
            return f.this.Z(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(0);
            this.f25309b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.n0() < this.f25309b && !f.this.o0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25312c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25314e;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25312c = obj;
            this.f25314e |= Integer.MIN_VALUE;
            return f.this.c0(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0576f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f25316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25318d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25320f;

        public C0576f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25318d = obj;
            this.f25320f |= Integer.MIN_VALUE;
            return f.this.h0(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25322b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25324d;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25322b = obj;
            this.f25324d |= Integer.MIN_VALUE;
            return f.this.s(null, 0L, 0L, 0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f25327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f25328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ I f25329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f25330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f25331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f25332h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j8, long j9, I i8, long j10, ByteBuffer byteBuffer, long j11, G6.d dVar) {
            super(2, dVar);
            this.f25327c = j8;
            this.f25328d = j9;
            this.f25329e = i8;
            this.f25330f = j10;
            this.f25331g = byteBuffer;
            this.f25332h = j11;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            h hVar = new h(this.f25327c, this.f25328d, this.f25329e, this.f25330f, this.f25331g, this.f25332h, dVar);
            hVar.f25326b = obj;
            return hVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.A a8, G6.d dVar) {
            return ((h) create(a8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            io.ktor.utils.io.A a8;
            Object objF = H6.c.f();
            int i8 = this.f25325a;
            if (i8 == 0) {
                C6.r.b(obj);
                io.ktor.utils.io.A a9 = (io.ktor.utils.io.A) this.f25326b;
                int iH = (int) W6.n.h(this.f25327c + this.f25328d, 4088L);
                this.f25326b = a9;
                this.f25325a = 1;
                if (a9.n(iH, this) == objF) {
                    return objF;
                }
                a8 = a9;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a8 = (io.ktor.utils.io.A) this.f25326b;
                C6.r.b(obj);
            }
            p213y6.a aVarW = a8.w(1);
            if (aVarW == null) {
                aVarW = p213y6.a.f38436j.a();
            }
            if (aVarW.k() - aVarW.i() > this.f25328d) {
                this.f25329e.f28778a = Math.min(((long) (aVarW.k() - aVarW.i())) - this.f25328d, Math.min(this.f25330f, ((long) this.f25331g.limit()) - this.f25332h));
                p189v6.c.d(aVarW.h(), this.f25331g, this.f25328d, this.f25329e.f28778a, this.f25332h);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25335c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25337e;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25335c = obj;
            this.f25337e |= Integer.MIN_VALUE;
            return f.this.u0(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25342e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25344g;

        public j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25342e = obj;
            this.f25344g |= Integer.MIN_VALUE;
            return f.w0(f.this, null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25346b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25348d;

        public k(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25346b = obj;
            this.f25348d |= Integer.MIN_VALUE;
            return f.this.y0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25353e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25355g;

        public l(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25353e = obj;
            this.f25355g |= Integer.MIN_VALUE;
            return f.z0(f.this, null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25361f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25363h;

        public m(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25361f = obj;
            this.f25363h |= Integer.MIN_VALUE;
            return f.this.A0(null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25365b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25367d;

        public n(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25365b = obj;
            this.f25367d |= Integer.MIN_VALUE;
            return f.this.C0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25369b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25371d;

        public o(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25369b = obj;
            this.f25371d |= Integer.MIN_VALUE;
            return f.this.E0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25375d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25377f;

        public p(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25375d = obj;
            this.f25377f |= Integer.MIN_VALUE;
            return f.this.G0(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25381d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25383f;

        public q(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25381d = obj;
            this.f25383f |= Integer.MIN_VALUE;
            return f.this.I0(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25385b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25387d;

        public r(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25385b = obj;
            this.f25387d |= Integer.MIN_VALUE;
            return f.K0(f.this, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25389b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25391d;

        public s(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25389b = obj;
            this.f25391d |= Integer.MIN_VALUE;
            return f.L0(f.this, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f25393b;

        public t(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            t tVar = f.this.new t(dVar);
            tVar.f25393b = ((Number) obj).intValue();
            return tVar;
        }

        public final Object g(int i8, G6.d dVar) {
            return ((t) create(Integer.valueOf(i8), dVar)).invokeSuspend(G.f1419a);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), (G6.d) obj2);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f25392a;
            if (i8 == 0) {
                C6.r.b(obj);
                int i9 = this.f25393b;
                f fVar = f.this;
                this.f25392a = 1;
                obj = fVar.n(i9, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return f.this.r0();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends kotlin.jvm.internal.u implements Q6.k {
        public u() {
            super(1);
        }

        public final void b(int i8) {
            f.this.V(i8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f25397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25398c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25400e;

        public v(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25398c = obj;
            this.f25400e |= Integer.MIN_VALUE;
            return f.R0(f.this, (byte) 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25403c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25405e;

        public w(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25403c = obj;
            this.f25405e |= Integer.MIN_VALUE;
            return f.S0(f.this, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25410e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25412g;

        public x(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25410e = obj;
            this.f25412g |= Integer.MIN_VALUE;
            return f.T0(f.this, null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25417e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25419g;

        public y(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25417e = obj;
            this.f25419g |= Integer.MIN_VALUE;
            return f.U0(f.this, null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class z extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25422c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25424e;

        public z(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25422c = obj;
            this.f25424e |= Integer.MIN_VALUE;
            return f.V0(f.this, 0, this);
        }
    }

    public f(p213y6.a aVar, boolean z8, p221z6.g pool) throws Throwable {
        kotlin.jvm.internal.t.g(aVar, bGZGhbtQmA.eZrqykAmP);
        kotlin.jvm.internal.t.g(pool, "pool");
        this.f25275b = z8;
        y6.a.d dVar = p213y6.a.f38436j;
        this._lastReadView = dVar.a();
        this._totalBytesRead = 0L;
        this._totalBytesWritten = 0L;
        this._availableForRead = 0;
        this.channelSize = 0;
        this._closed = null;
        this.f25276c = new p205x6.j(pool);
        this.f25277d = new p205x6.k(aVar, pool);
        this.lastReadAvailable$delegate = 0;
        this.lastReadView$delegate = dVar.a();
        this.f25278e = new io.ktor.utils.io.internal.a();
        this.f25279f = new Object();
        this.f25280g = new p205x6.j(null, 1, null);
        int iE = (int) p205x6.h.e(aVar);
        W(iE);
        f25272j.addAndGet(this, iE);
    }

    public static /* synthetic */ Object B0(f fVar, G6.d dVar) {
        if (!fVar.f25277d.p1(4)) {
            return fVar.C0(dVar);
        }
        int iA = p205x6.q.a(fVar.f25277d);
        fVar.V(4);
        return I6.b.d(iA);
    }

    public static /* synthetic */ Object D0(f fVar, G6.d dVar) {
        if (!fVar.f25277d.p1(8)) {
            return fVar.E0(dVar);
        }
        long jC = p205x6.q.c(fVar.f25277d);
        fVar.V(8);
        return I6.b.e(jC);
    }

    public static /* synthetic */ Object F0(f fVar, int i8, G6.d dVar) throws Throwable {
        e0(fVar, i8, null, 2, null);
        p205x6.j jVar = new p205x6.j(null, 1, null);
        int iMin = (int) Math.min(i8, fVar.f25277d.o1());
        int i9 = i8 - iMin;
        jVar.p1(fVar.f25277d, iMin);
        fVar.V(iMin);
        fVar.d0(i9, jVar);
        return i9 > 0 ? fVar.G0(jVar, i9, dVar) : jVar.M1();
    }

    public static /* synthetic */ Object H0(f fVar, long j8, G6.d dVar) throws Throwable {
        fVar.j0();
        p205x6.j jVar = new p205x6.j(null, 1, null);
        long jMin = Math.min(j8, fVar.f25277d.o1());
        jVar.q1(fVar.f25277d, jMin);
        fVar.V((int) jMin);
        if (j8 - ((long) jVar.P1()) != 0 && !fVar.J()) {
            return fVar.I0(jVar, j8, dVar);
        }
        fVar.k0(jVar);
        return jVar.M1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [C6.G, java.lang.Object] */
    public static /* synthetic */ Object K0(f fVar, Q6.o oVar, G6.d dVar) {
        r rVar;
        f fVar2;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i8 = rVar.f25387d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rVar.f25387d = i8 - Integer.MIN_VALUE;
            } else {
                rVar = fVar.new r(dVar);
            }
        } else {
            rVar = fVar.new r(dVar);
        }
        Object obj = rVar.f25385b;
        Object objF = H6.c.f();
        int i9 = rVar.f25387d;
        try {
            if (i9 == 0) {
                C6.r.b(obj);
                rVar.f25384a = fVar;
                rVar.f25387d = 1;
                Object objInvoke = oVar.invoke(fVar, rVar);
                fVar2 = fVar;
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f fVar3 = (f) rVar.f25384a;
                C6.r.b(obj);
                fVar2 = fVar3;
            }
            fVar2.f0();
            fVar = G.f1419a;
            return fVar;
        } catch (Throwable th) {
            fVar.f0();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object L0(f fVar, int i8, G6.d dVar) {
        s sVar;
        StringBuilder sb;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i9 = sVar.f25391d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sVar.f25391d = i9 - Integer.MIN_VALUE;
            } else {
                sVar = fVar.new s(dVar);
            }
        } else {
            sVar = fVar.new s(dVar);
        }
        Object obj = sVar.f25389b;
        Object objF = H6.c.f();
        int i10 = sVar.f25391d;
        if (i10 == 0) {
            C6.r.b(obj);
            StringBuilder sb2 = new StringBuilder();
            sVar.f25388a = sb2;
            sVar.f25391d = 1;
            Object objR = fVar.r(sb2, i8, sVar);
            if (objR == objF) {
                return objF;
            }
            obj = objR;
            sb = sb2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) sVar.f25388a;
            C6.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ Object M0(f fVar, Appendable appendable, int i8, G6.d dVar) throws Throwable {
        if (!fVar.J()) {
            return p213y6.f.b(appendable, i8, fVar.new t(null), fVar.new u(), dVar);
        }
        Throwable thA = fVar.a();
        if (thA == null) {
            return I6.b.a(false);
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object R0(f fVar, byte b8, G6.d dVar) throws Throwable {
        v vVar;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i8 = vVar.f25400e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                vVar.f25400e = i8 - Integer.MIN_VALUE;
            } else {
                vVar = fVar.new v(dVar);
            }
        } else {
            vVar = fVar.new v(dVar);
        }
        Object obj = vVar.f25398c;
        Object objF = H6.c.f();
        int i9 = vVar.f25400e;
        if (i9 == 0) {
            C6.r.b(obj);
            vVar.f25396a = fVar;
            vVar.f25397b = b8;
            vVar.f25400e = 1;
            if (fVar.Z(1, vVar) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b8 = vVar.f25397b;
            fVar = (f) vVar.f25396a;
            C6.r.b(obj);
        }
        fVar.f25276c.g1(b8);
        fVar.W(1);
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object S0(f fVar, p205x6.a aVar, G6.d dVar) throws Throwable {
        w wVar;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i8 = wVar.f25405e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                wVar.f25405e = i8 - Integer.MIN_VALUE;
            } else {
                wVar = fVar.new w(dVar);
            }
        } else {
            wVar = fVar.new w(dVar);
        }
        Object obj = wVar.f25403c;
        Object objF = H6.c.f();
        int i9 = wVar.f25405e;
        if (i9 == 0) {
            C6.r.b(obj);
            wVar.f25401a = fVar;
            wVar.f25402b = aVar;
            wVar.f25405e = 1;
            if (fVar.Z(1, wVar) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p205x6.a) wVar.f25402b;
            fVar = (f) wVar.f25401a;
            C6.r.b(obj);
        }
        int iK = aVar.k() - aVar.i();
        p205x6.u.c(fVar.f25276c, aVar, 0, 2, null);
        fVar.W(iK);
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object T0(io.ktor.utils.io.f r5, byte[] r6, int r7, int r8, G6.d r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.f.x
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.f$x r0 = (io.ktor.utils.io.f.x) r0
            int r1 = r0.f25412g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25412g = r1
            goto L18
        L13:
            io.ktor.utils.io.f$x r0 = new io.ktor.utils.io.f$x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25410e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25412g
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r5 = r0.f25409d
            int r6 = r0.f25408c
            java.lang.Object r7 = r0.f25407b
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.f25406a
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            C6.r.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            C6.r.b(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L49:
            if (r8 >= r5) goto L70
            r0.f25406a = r6
            r0.f25407b = r7
            r0.f25408c = r8
            r0.f25409d = r5
            r0.f25412g = r3
            java.lang.Object r9 = r6.Z(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            int r9 = r6.n0()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            x6.j r2 = r6.f25276c
            p205x6.u.b(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.W(r9)
            goto L49
        L70:
            C6.G r5 = C6.G.f1419a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.T0(io.ktor.utils.io.f, byte[], int, int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object U0(io.ktor.utils.io.f r5, java.nio.ByteBuffer r6, int r7, int r8, G6.d r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.f.y
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.f$y r0 = (io.ktor.utils.io.f.y) r0
            int r1 = r0.f25419g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25419g = r1
            goto L18
        L13:
            io.ktor.utils.io.f$y r0 = new io.ktor.utils.io.f$y
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25417e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25419g
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r5 = r0.f25416d
            int r6 = r0.f25415c
            java.lang.Object r7 = r0.f25414b
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.f25413a
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            C6.r.b(r9)
            r4 = r7
            r7 = r5
            r5 = r8
            r8 = r6
            r6 = r4
            goto L58
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            C6.r.b(r9)
        L45:
            if (r7 >= r8) goto L6c
            r0.f25413a = r5
            r0.f25414b = r6
            r0.f25415c = r8
            r0.f25416d = r7
            r0.f25419g = r3
            java.lang.Object r9 = r5.Z(r3, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            int r9 = r5.n0()
            int r2 = r8 - r7
            int r9 = java.lang.Math.min(r9, r2)
            x6.j r2 = r5.f25276c
            p205x6.u.e(r2, r6, r7, r9)
            int r7 = r7 + r9
            r5.W(r9)
            goto L45
        L6c:
            C6.G r5 = C6.G.f1419a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.U0(io.ktor.utils.io.f, java.nio.ByteBuffer, int, int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object V0(f fVar, int i8, G6.d dVar) throws Throwable {
        z zVar;
        if (dVar instanceof z) {
            zVar = (z) dVar;
            int i9 = zVar.f25424e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                zVar.f25424e = i9 - Integer.MIN_VALUE;
            } else {
                zVar = fVar.new z(dVar);
            }
        } else {
            zVar = fVar.new z(dVar);
        }
        Object obj = zVar.f25422c;
        Object objF = H6.c.f();
        int i10 = zVar.f25424e;
        if (i10 == 0) {
            C6.r.b(obj);
            zVar.f25420a = fVar;
            zVar.f25421b = i8;
            zVar.f25424e = 1;
            if (fVar.Z(4, zVar) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = zVar.f25421b;
            fVar = (f) zVar.f25420a;
            C6.r.b(obj);
        }
        p205x6.v.a(fVar.f25276c, i8);
        fVar.W(4);
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object W0(f fVar, long j8, G6.d dVar) throws Throwable {
        A a8;
        if (dVar instanceof A) {
            a8 = (A) dVar;
            int i8 = a8.f25285e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                a8.f25285e = i8 - Integer.MIN_VALUE;
            } else {
                a8 = fVar.new A(dVar);
            }
        } else {
            a8 = fVar.new A(dVar);
        }
        Object obj = a8.f25283c;
        Object objF = H6.c.f();
        int i9 = a8.f25285e;
        if (i9 == 0) {
            C6.r.b(obj);
            a8.f25281a = fVar;
            a8.f25282b = j8;
            a8.f25285e = 1;
            if (fVar.Z(8, a8) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = a8.f25282b;
            fVar = (f) a8.f25281a;
            C6.r.b(obj);
        }
        p205x6.v.c(fVar.f25276c, j8);
        fVar.W(8);
        return G.f1419a;
    }

    public static /* synthetic */ Object X(f fVar, int i8, G6.d dVar) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i8).toString());
        }
        long j8 = i8;
        if (j8 <= 4088) {
            fVar.f0();
            if (i8 == 0) {
                return I6.b.a(!fVar.J());
            }
            return fVar.f25277d.o1() >= j8 ? I6.b.a(true) : fVar.c0(i8, dVar);
        }
        throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i8).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object X0(f fVar, p205x6.k kVar, G6.d dVar) throws Throwable {
        B b8;
        if (dVar instanceof B) {
            b8 = (B) dVar;
            int i8 = b8.f25290e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                b8.f25290e = i8 - Integer.MIN_VALUE;
            } else {
                b8 = fVar.new B(dVar);
            }
        } else {
            b8 = fVar.new B(dVar);
        }
        Object obj = b8.f25288c;
        Object objF = H6.c.f();
        int i9 = b8.f25290e;
        if (i9 == 0) {
            C6.r.b(obj);
            b8.f25286a = fVar;
            b8.f25287b = kVar;
            b8.f25290e = 1;
            if (fVar.Z(1, b8) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (p205x6.k) b8.f25287b;
            fVar = (f) b8.f25286a;
            C6.r.b(obj);
        }
        int iO1 = (int) kVar.o1();
        fVar.f25276c.o1(kVar);
        fVar.W(iO1);
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object Y0(f fVar, short s8, G6.d dVar) throws Throwable {
        C c8;
        if (dVar instanceof C) {
            c8 = (C) dVar;
            int i8 = c8.f25295e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c8.f25295e = i8 - Integer.MIN_VALUE;
            } else {
                c8 = fVar.new C(dVar);
            }
        } else {
            c8 = fVar.new C(dVar);
        }
        Object obj = c8.f25293c;
        Object objF = H6.c.f();
        int i9 = c8.f25295e;
        if (i9 == 0) {
            C6.r.b(obj);
            c8.f25291a = fVar;
            c8.f25292b = s8;
            c8.f25295e = 1;
            if (fVar.Z(2, c8) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s8 = c8.f25292b;
            fVar = (f) c8.f25291a;
            C6.r.b(obj);
        }
        p205x6.v.e(fVar.f25276c, s8);
        fVar.W(2);
        return G.f1419a;
    }

    public static /* synthetic */ Object a0(f fVar, G6.d dVar) {
        Object objN = fVar.n(1, dVar);
        return objN == H6.c.f() ? objN : G.f1419a;
    }

    public static /* synthetic */ void e0(f fVar, int i8, p205x6.j jVar, int i9, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkClosed");
        }
        if ((i9 & 2) != 0) {
            jVar = null;
        }
        fVar.d0(i8, jVar);
    }

    public static /* synthetic */ Object g0(f fVar, long j8, G6.d dVar) throws Throwable {
        long jZ = fVar.f25277d.z(j8);
        fVar.V((int) jZ);
        if (jZ != j8 && !fVar.J()) {
            return fVar.h0(j8, jZ, dVar);
        }
        fVar.j0();
        return I6.b.e(jZ);
    }

    public static /* synthetic */ Object v0(f fVar, p213y6.a aVar, G6.d dVar) {
        kotlin.jvm.internal.t.e(aVar, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
        return fVar.u0(aVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object w0(f fVar, byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f25344g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f25344g = i10 - Integer.MIN_VALUE;
            } else {
                jVar = fVar.new j(dVar);
            }
        } else {
            jVar = fVar.new j(dVar);
        }
        Object obj = jVar.f25342e;
        Object objF = H6.c.f();
        int i11 = jVar.f25344g;
        if (i11 == 0) {
            C6.r.b(obj);
            Throwable thA = fVar.a();
            if (thA != null) {
                throw thA;
            }
            if (fVar.o0() && fVar.j() == 0) {
                return I6.b.d(-1);
            }
            if (i9 == 0) {
                return I6.b.d(0);
            }
            if (fVar.j() == 0) {
                jVar.f25338a = fVar;
                jVar.f25339b = bArr;
                jVar.f25340c = i8;
                jVar.f25341d = i9;
                jVar.f25344g = 1;
                if (fVar.c0(1, jVar) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = jVar.f25341d;
            i8 = jVar.f25340c;
            bArr = (byte[]) jVar.f25339b;
            fVar = (f) jVar.f25338a;
            C6.r.b(obj);
        }
        if (!fVar.f25277d.t()) {
            fVar.t0();
        }
        int iMin = (int) Math.min(i9, fVar.f25277d.o1());
        p205x6.o.b(fVar.f25277d, bArr, i8, iMin);
        fVar.V(iMin);
        return I6.b.d(iMin);
    }

    public static /* synthetic */ Object x0(f fVar, G6.d dVar) {
        if (fVar.f25277d.T0()) {
            return fVar.y0(dVar);
        }
        byte b8 = fVar.f25277d.readByte();
        fVar.V(1);
        return I6.b.b(b8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r5.A0(r6, r7 + r9, r8 - r9, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object z0(f fVar, byte[] bArr, int i8, int i9, G6.d dVar) throws EOFException {
        l lVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f25355g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f25355g = i10 - Integer.MIN_VALUE;
            } else {
                lVar = fVar.new l(dVar);
            }
        } else {
            lVar = fVar.new l(dVar);
        }
        Object objG = lVar.f25353e;
        Object objF = H6.c.f();
        int i11 = lVar.f25355g;
        if (i11 == 0) {
            C6.r.b(objG);
            lVar.f25349a = fVar;
            lVar.f25350b = bArr;
            lVar.f25351c = i8;
            lVar.f25352d = i9;
            lVar.f25355g = 1;
            objG = fVar.G(bArr, i8, i9, lVar);
            if (objG != objF) {
            }
            return objF;
        }
        if (i11 == 1) {
            i9 = lVar.f25352d;
            i8 = lVar.f25351c;
            bArr = (byte[]) lVar.f25350b;
            fVar = (f) lVar.f25349a;
            C6.r.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objG);
        }
        return G.f1419a;
        int iIntValue = ((Number) objG).intValue();
        if (iIntValue == i9) {
            return G.f1419a;
        }
        if (iIntValue == -1) {
            throw new EOFException("Unexpected end of stream");
        }
        lVar.f25349a = null;
        lVar.f25350b = null;
        lVar.f25355g = 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A0(byte[] r8, int r9, int r10, G6.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.f.m
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.f$m r0 = (io.ktor.utils.io.f.m) r0
            int r1 = r0.f25363h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25363h = r1
            goto L18
        L13:
            io.ktor.utils.io.f$m r0 = new io.ktor.utils.io.f$m
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f25361f
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25363h
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r8 = r0.f25360e
            int r9 = r0.f25359d
            int r10 = r0.f25358c
            java.lang.Object r2 = r0.f25357b
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.f25356a
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            C6.r.b(r11)
            r6 = r0
            r0 = r9
            r9 = r2
        L39:
            r2 = r6
            goto L6a
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            C6.r.b(r11)
            r11 = 0
            r4 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r4
            r4 = r7
        L4d:
            if (r8 >= r11) goto L7f
            int r2 = r10 + r8
            int r5 = r11 - r8
            r0.f25356a = r4
            r0.f25357b = r9
            r0.f25358c = r10
            r0.f25359d = r11
            r0.f25360e = r8
            r0.f25363h = r3
            java.lang.Object r2 = r4.G(r9, r2, r5, r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r6 = r0
            r0 = r11
            r11 = r2
            goto L39
        L6a:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r5 = -1
            if (r11 == r5) goto L77
            int r8 = r8 + r11
            r11 = r0
            r0 = r2
            goto L4d
        L77:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "Unexpected end of stream"
            r8.<init>(r9)
            throw r8
        L7f:
            C6.G r8 = C6.G.f1419a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.A0(byte[], int, int, G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.g
    public Object B(long j8, G6.d dVar) {
        return g0(this, j8, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object C(p205x6.a aVar, G6.d dVar) {
        return S0(this, aVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C0(G6.d dVar) {
        n nVar;
        f fVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i8 = nVar.f25367d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.f25367d = i8 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object obj = nVar.f25365b;
        Object objF = H6.c.f();
        int i9 = nVar.f25367d;
        if (i9 == 0) {
            C6.r.b(obj);
            nVar.f25364a = this;
            nVar.f25367d = 1;
            if (c0(4, nVar) == objF) {
                return objF;
            }
            fVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) nVar.f25364a;
            C6.r.b(obj);
        }
        int iA = p205x6.q.a(fVar.f25277d);
        fVar.V(4);
        return I6.b.d(iA);
    }

    @Override // io.ktor.utils.io.g
    public Object D(long j8, G6.d dVar) {
        return H0(this, j8, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object E(byte b8, G6.d dVar) {
        return R0(this, b8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E0(G6.d dVar) {
        o oVar;
        f fVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i8 = oVar.f25371d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.f25371d = i8 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f25369b;
        Object objF = H6.c.f();
        int i9 = oVar.f25371d;
        if (i9 == 0) {
            C6.r.b(obj);
            oVar.f25368a = this;
            oVar.f25371d = 1;
            if (c0(8, oVar) == objF) {
                return objF;
            }
            fVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) oVar.f25368a;
            C6.r.b(obj);
        }
        long jC = p205x6.q.c(fVar.f25277d);
        fVar.V(8);
        return I6.b.e(jC);
    }

    @Override // io.ktor.utils.io.t
    public void F() {
        f0();
    }

    @Override // io.ktor.utils.io.g
    public Object G(byte[] bArr, int i8, int i9, G6.d dVar) {
        return w0(this, bArr, i8, i9, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G0(p205x6.j jVar, int i8, G6.d dVar) throws Throwable {
        p pVar;
        f fVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i9 = pVar.f25377f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                pVar.f25377f = i9 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f25375d;
        Object objF = H6.c.f();
        int i10 = pVar.f25377f;
        if (i10 == 0) {
            C6.r.b(obj);
            fVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = pVar.f25374c;
            p205x6.j jVar2 = (p205x6.j) pVar.f25373b;
            fVar = (f) pVar.f25372a;
            C6.r.b(obj);
            i8 = i11;
            jVar = jVar2;
        }
        while (i8 > 0) {
            int iMin = (int) Math.min(i8, fVar.f25277d.o1());
            i8 -= iMin;
            jVar.p1(fVar.f25277d, iMin);
            fVar.V(iMin);
            fVar.d0(i8, jVar);
            if (i8 > 0) {
                pVar.f25372a = fVar;
                pVar.f25373b = jVar;
                pVar.f25374c = i8;
                pVar.f25377f = 1;
                if (fVar.c0(1, pVar) == objF) {
                    return objF;
                }
            }
        }
        fVar.d0(i8, jVar);
        return jVar.M1();
    }

    @Override // io.ktor.utils.io.g
    public Object H(p213y6.a aVar, G6.d dVar) {
        return v0(this, aVar, dVar);
    }

    @Override // io.ktor.utils.io.g
    public Object I(G6.d dVar) {
        return B0(this, dVar);
    }

    @Override // io.ktor.utils.io.g
    public boolean J() {
        if (s0()) {
            return true;
        }
        return o0() && this.channelSize == 0;
    }

    public Object J0(Q6.o oVar, G6.d dVar) {
        return K0(this, oVar, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object K(p205x6.k kVar, G6.d dVar) {
        return X0(this, kVar, dVar);
    }

    @Override // io.ktor.utils.io.j
    public boolean L() {
        return this.f25275b;
    }

    public final p213y6.a N0(int i8) {
        if (this.f25277d.T0()) {
            t0();
        }
        p213y6.a aVarK1 = this.f25277d.K1(i8);
        if (aVarK1 == null) {
            P0(p213y6.a.f38436j.a());
            O0(0);
            return aVarK1;
        }
        P0(aVarK1);
        O0(aVarK1.k() - aVarK1.i());
        return aVarK1;
    }

    public final void O0(int i8) {
        this.lastReadAvailable$delegate = i8;
    }

    public final void P0(p213y6.a aVar) {
        this.lastReadView$delegate = aVar;
    }

    public final long Q0(f dst, long j8) throws Throwable {
        kotlin.jvm.internal.t.g(dst, "dst");
        long jO1 = this.f25277d.o1();
        if (jO1 > j8) {
            return 0L;
        }
        dst.f25276c.o1(this.f25277d);
        int i8 = (int) jO1;
        dst.W(i8);
        V(i8);
        return jO1;
    }

    public final void T(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("Can't read negative amount of bytes: " + i8).toString());
        }
        int i9 = -i8;
        f25273k.getAndAdd(this, i9);
        f25270h.addAndGet(this, i8);
        f25272j.getAndAdd(this, i9);
        if (this.channelSize < 0) {
            throw new IllegalStateException(("Readable bytes count is negative: " + j() + ", " + i8 + " in " + this).toString());
        }
        if (j() >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + j() + ", " + i8 + " in " + this).toString());
    }

    public final void U(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("Can't write negative amount of bytes: " + i8).toString());
        }
        f25273k.getAndAdd(this, i8);
        f25271i.addAndGet(this, i8);
        if (this.channelSize >= 0) {
            return;
        }
        throw new IllegalStateException(("Readable bytes count is negative: " + this.channelSize + ", " + i8 + " in " + this).toString());
    }

    public final void V(int i8) {
        T(i8);
        this.f25278e.c();
    }

    public final void W(int i8) throws Throwable {
        U(i8);
        if (o0()) {
            this.f25276c.T0();
            i0();
        }
        if (L() || n0() == 0) {
            flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(int i8, G6.d dVar) {
        C2443a c2443a;
        f fVar;
        if (dVar instanceof C2443a) {
            c2443a = (C2443a) dVar;
            int i9 = c2443a.f25300e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2443a.f25300e = i9 - Integer.MIN_VALUE;
            } else {
                c2443a = new C2443a(dVar);
            }
        } else {
            c2443a = new C2443a(dVar);
        }
        Object obj = c2443a.f25298c;
        Object objF = H6.c.f();
        int i10 = c2443a.f25300e;
        if (i10 == 0) {
            C6.r.b(obj);
            fVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = c2443a.f25297b;
            fVar = (f) c2443a.f25296a;
            C6.r.b(obj);
        }
        while (fVar.j() < i8 && !fVar.J()) {
            io.ktor.utils.io.internal.a aVar = fVar.f25278e;
            C2444b c2444b = fVar.new C2444b(i8);
            c2443a.f25296a = fVar;
            c2443a.f25297b = i8;
            c2443a.f25300e = 1;
            if (aVar.d(c2444b, c2443a) == objF) {
                return objF;
            }
        }
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(int i8, G6.d dVar) {
        C2445c c2445c;
        f fVar;
        if (dVar instanceof C2445c) {
            c2445c = (C2445c) dVar;
            int i9 = c2445c.f25307e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2445c.f25307e = i9 - Integer.MIN_VALUE;
            } else {
                c2445c = new C2445c(dVar);
            }
        } else {
            c2445c = new C2445c(dVar);
        }
        Object obj = c2445c.f25305c;
        Object objF = H6.c.f();
        int i10 = c2445c.f25307e;
        if (i10 == 0) {
            C6.r.b(obj);
            fVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = c2445c.f25304b;
            fVar = (f) c2445c.f25303a;
            C6.r.b(obj);
        }
        while (fVar.n0() < i8 && !fVar.o0()) {
            if (!fVar.l0()) {
                io.ktor.utils.io.internal.a aVar = fVar.f25278e;
                d dVar2 = fVar.new d(i8);
                c2445c.f25303a = fVar;
                c2445c.f25304b = i8;
                c2445c.f25307e = 1;
                if (aVar.d(dVar2, c2445c) == objF) {
                    return objF;
                }
            }
        }
        return G.f1419a;
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.j
    public final Throwable a() {
        io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this._closed;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    public final Object b0(G6.d dVar) {
        return !this.f25277d.T0() ? I6.b.a(true) : c0(1, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object c(long j8, G6.d dVar) {
        return W0(this, j8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c0(int i8, G6.d dVar) throws Throwable {
        e eVar;
        f fVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i9 = eVar.f25314e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.f25314e = i9 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f25312c;
        Object objF = H6.c.f();
        int i10 = eVar.f25314e;
        if (i10 == 0) {
            C6.r.b(obj);
            if (i8 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            eVar.f25310a = this;
            eVar.f25311b = i8;
            eVar.f25314e = 1;
            if (Y(i8, eVar) == objF) {
                return objF;
            }
            fVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = eVar.f25311b;
            fVar = (f) eVar.f25310a;
            C6.r.b(obj);
        }
        fVar.t0();
        Throwable thA = fVar.a();
        if (thA == null) {
            return I6.b.a(!fVar.J() && fVar.j() >= i8);
        }
        throw thA;
    }

    @Override // io.ktor.utils.io.j
    public boolean d(Throwable th) {
        if (!F1.b.a(f25274l, this, null, th == null ? io.ktor.utils.io.o.a() : new io.ktor.utils.io.n(th))) {
            return false;
        }
        if (th != null) {
            this.f25277d.a2();
            this.f25276c.T0();
            this.f25280g.T0();
        } else {
            flush();
            this.f25276c.T0();
        }
        this.f25278e.b(th);
        return true;
    }

    public final void d0(int i8, p205x6.j jVar) throws Throwable {
        Throwable thA = a();
        if (thA != null) {
            if (jVar == null) {
                throw thA;
            }
            jVar.close();
            throw thA;
        }
        if (!o0() || j() >= i8) {
            return;
        }
        if (jVar != null) {
            jVar.close();
        }
        throw new EOFException(i8 + " bytes required but EOF reached");
    }

    @Override // io.ktor.utils.io.g
    public boolean f(Throwable th) {
        if (a() != null || o0()) {
            return false;
        }
        if (th == null) {
            th = new CancellationException("Channel cancelled");
        }
        return d(th);
    }

    public final void f0() {
        p213y6.a aVarQ0 = q0();
        int iP0 = p0() - (aVarQ0.k() - aVarQ0.i());
        if (q0() != p205x6.a.f37418g.a()) {
            p213y6.g.a(this.f25277d, q0());
        }
        if (iP0 > 0) {
            V(iP0);
        }
        O0(0);
        P0(p213y6.a.f38436j.a());
    }

    @Override // io.ktor.utils.io.j
    public void flush() {
        l0();
    }

    @Override // io.ktor.utils.io.j
    public Object g(ByteBuffer byteBuffer, int i8, int i9, G6.d dVar) {
        return U0(this, byteBuffer, i8, i9, dVar);
    }

    @Override // io.ktor.utils.io.w
    public int h(int i8) throws Throwable {
        Throwable thA = a();
        if (thA != null) {
            throw thA;
        }
        if (i8 == 0) {
            return 0;
        }
        int iY = this.f25277d.y(i8);
        V(i8);
        N0(1);
        return iY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.J() == false) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(long j8, long j9, G6.d dVar) throws Throwable {
        C0576f c0576f;
        f fVar;
        if (dVar instanceof C0576f) {
            c0576f = (C0576f) dVar;
            int i8 = c0576f.f25320f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0576f.f25320f = i8 - Integer.MIN_VALUE;
            } else {
                c0576f = new C0576f(dVar);
            }
        } else {
            c0576f = new C0576f(dVar);
        }
        Object objN = c0576f.f25318d;
        Object objF = H6.c.f();
        int i9 = c0576f.f25320f;
        if (i9 == 0) {
            C6.r.b(objN);
            fVar = this;
            c0576f.f25315a = fVar;
            c0576f.f25316b = j8;
            c0576f.f25317c = j9;
            c0576f.f25320f = 1;
            objN = fVar.n(1, c0576f);
            if (objN == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = c0576f.f25317c;
            long j11 = c0576f.f25316b;
            fVar = (f) c0576f.f25315a;
            C6.r.b(objN);
            j9 = j10;
            j8 = j11;
        }
        if (((Boolean) objN).booleanValue()) {
            long jZ = fVar.f25277d.z(j8 - j9);
            fVar.V((int) jZ);
            j9 += jZ;
            if (j9 < j8) {
            }
        }
        fVar.j0();
        return I6.b.e(j9);
    }

    @Override // io.ktor.utils.io.j
    public Object i(short s8, G6.d dVar) {
        return Y0(this, s8, dVar);
    }

    public final void i0() throws Throwable {
        if (o0()) {
            Throwable thA = a();
            if (thA != null) {
                throw thA;
            }
            throw new io.ktor.utils.io.p("Channel " + this + " is already closed");
        }
    }

    @Override // io.ktor.utils.io.g
    public int j() {
        return this._availableForRead;
    }

    public final void j0() throws Throwable {
        Throwable thA = a();
        if (thA != null) {
            throw thA;
        }
    }

    @Override // io.ktor.utils.io.g
    public Object k(G6.d dVar) {
        return D0(this, dVar);
    }

    public final void k0(p205x6.j jVar) throws Throwable {
        Throwable thA = a();
        if (thA == null) {
            return;
        }
        jVar.T0();
        throw thA;
    }

    @Override // io.ktor.utils.io.j
    public Object l(byte[] bArr, int i8, int i9, G6.d dVar) {
        return T0(this, bArr, i8, i9, dVar);
    }

    public final boolean l0() {
        if (this.f25276c.U1()) {
            this.f25278e.c();
            return false;
        }
        m0();
        this.f25278e.c();
        return true;
    }

    @Override // io.ktor.utils.io.g
    public boolean m() {
        return o0();
    }

    public final void m0() {
        synchronized (this.f25279f) {
            int iP1 = this.f25276c.P1();
            p213y6.a aVarA1 = this.f25276c.a1();
            kotlin.jvm.internal.t.d(aVarA1);
            this.f25280g.k1(aVarA1);
            f25272j.addAndGet(this, iP1);
        }
    }

    @Override // io.ktor.utils.io.A
    public Object n(int i8, G6.d dVar) {
        return X(this, i8, dVar);
    }

    public int n0() {
        return Math.max(0, 4088 - this.channelSize);
    }

    @Override // io.ktor.utils.io.g
    public Object o(G6.d dVar) {
        return a0(this, dVar);
    }

    public final boolean o0() {
        return this._closed != null;
    }

    @Override // io.ktor.utils.io.g
    public Object p(G6.d dVar) {
        return x0(this, dVar);
    }

    public final int p0() {
        return this.lastReadAvailable$delegate;
    }

    @Override // io.ktor.utils.io.g
    public Object q(int i8, G6.d dVar) {
        return F0(this, i8, dVar);
    }

    public final p213y6.a q0() {
        return (p213y6.a) this.lastReadView$delegate;
    }

    @Override // io.ktor.utils.io.g
    public Object r(Appendable appendable, int i8, G6.d dVar) {
        return M0(this, appendable, i8, dVar);
    }

    public final p205x6.k r0() {
        return this.f25277d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.ktor.utils.io.g
    public final Object s(ByteBuffer byteBuffer, long j8, long j9, long j10, long j11, G6.d dVar) {
        g gVar;
        I i8;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i9 = gVar.f25324d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f25324d = i9 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f25322b;
        Object objF = H6.c.f();
        int i10 = gVar.f25324d;
        if (i10 == 0) {
            C6.r.b(obj);
            I i11 = new I();
            Q6.o hVar = new h(j10, j9, i11, j11, byteBuffer, j8, null);
            gVar.f25321a = i11;
            gVar.f25324d = 1;
            if (J0(hVar, gVar) == objF) {
                return objF;
            }
            i8 = i11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = (I) gVar.f25321a;
            C6.r.b(obj);
        }
        return I6.b.e(i8.f28778a);
    }

    public final boolean s0() {
        io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this._closed;
        return (nVar != null ? nVar.a() : null) != null;
    }

    public final void t0() {
        synchronized (this.f25279f) {
            p213y6.g.e(this.f25277d, this.f25280g);
        }
    }

    @Override // io.ktor.utils.io.t
    public io.ktor.utils.io.A u() {
        return this;
    }

    @Override // io.ktor.utils.io.w
    public p213y6.a w(int i8) throws Throwable {
        Throwable thA = a();
        if (thA != null) {
            throw thA;
        }
        f0();
        return N0(i8);
    }

    @Override // io.ktor.utils.io.g
    public Object x(byte[] bArr, int i8, int i9, G6.d dVar) {
        return z0(this, bArr, i8, i9, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object y(int i8, G6.d dVar) {
        return V0(this, i8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y0(G6.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.f.k
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.f$k r0 = (io.ktor.utils.io.f.k) r0
            int r1 = r0.f25348d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25348d = r1
            goto L18
        L13:
            io.ktor.utils.io.f$k r0 = new io.ktor.utils.io.f$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25346b
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25348d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f25345a
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            C6.r.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            C6.r.b(r6)
            r2 = r5
        L39:
            r0.f25345a = r2
            r0.f25348d = r3
            java.lang.Object r6 = r2.c0(r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            x6.k r6 = r2.f25277d
            boolean r6 = r6.T0()
            if (r6 != 0) goto L5d
            x6.k r6 = r2.f25277d
            byte r6 = r6.readByte()
            java.lang.Byte r6 = I6.b.b(r6)
            r6.byteValue()
            r2.V(r3)
            return r6
        L5d:
            r6 = 2
            r4 = 0
            e0(r2, r3, r4, r6, r4)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.y0(G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.g
    public Object z(int i8, G6.d dVar) {
        return L0(this, i8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(p205x6.j jVar, long j8, G6.d dVar) throws Throwable {
        q qVar;
        f fVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i8 = qVar.f25383f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f25383f = i8 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f25381d;
        Object objF = H6.c.f();
        int i9 = qVar.f25383f;
        if (i9 == 0) {
            C6.r.b(obj);
            fVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException(XRlnZWSrAFn.dYVy);
            }
            long j9 = qVar.f25380c;
            p205x6.j jVar2 = (p205x6.j) qVar.f25379b;
            fVar = (f) qVar.f25378a;
            C6.r.b(obj);
            jVar = jVar2;
            j8 = j9;
        }
        while (jVar.P1() < j8) {
            long jMin = Math.min(j8 - ((long) jVar.P1()), fVar.f25277d.o1());
            jVar.q1(fVar.f25277d, jMin);
            fVar.V((int) jMin);
            fVar.k0(jVar);
            if (fVar.J() || jVar.P1() == ((int) j8)) {
                break;
            }
            qVar.f25378a = fVar;
            qVar.f25379b = jVar;
            qVar.f25380c = j8;
            qVar.f25383f = 1;
            if (fVar.c0(1, qVar) == objF) {
                return objF;
            }
        }
        fVar.k0(jVar);
        return jVar.M1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u0(p205x6.a aVar, G6.d dVar) throws Throwable {
        i iVar;
        f fVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f25337e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f25337e = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f25335c;
        Object objF = H6.c.f();
        int i9 = iVar.f25337e;
        if (i9 == 0) {
            C6.r.b(obj);
            Throwable thA = a();
            if (thA != null) {
                throw thA;
            }
            if (o0() && j() == 0) {
                return I6.b.d(-1);
            }
            if (aVar.g() - aVar.k() == 0) {
                return I6.b.d(0);
            }
            if (j() == 0) {
                iVar.f25333a = this;
                iVar.f25334b = aVar;
                iVar.f25337e = 1;
                if (c0(1, iVar) == objF) {
                    return objF;
                }
            }
            fVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException(GOKsbdzhLhXAMt.FYHIhc);
            }
            aVar = (p205x6.a) iVar.f25334b;
            fVar = (f) iVar.f25333a;
            C6.r.b(obj);
        }
        if (!fVar.f25277d.t()) {
            fVar.t0();
        }
        int iMin = (int) Math.min(aVar.g() - aVar.k(), fVar.f25277d.o1());
        p205x6.o.a(fVar.f25277d, aVar, iMin);
        fVar.V(iMin);
        return I6.b.d(iMin);
    }

    public /* synthetic */ f(p213y6.a aVar, boolean z8, p221z6.g gVar, int i8, AbstractC2633k abstractC2633k) {
        this(aVar, z8, (i8 & 4) != 0 ? p213y6.a.f38436j.c() : gVar);
    }
}
