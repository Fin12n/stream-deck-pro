package io.ktor.utils.io;

import C6.C0920i;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;

/* JADX INFO: renamed from: io.ktor.utils.io.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2429a implements InterfaceC2442c, g, j, io.ktor.utils.io.v, io.ktor.utils.io.t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0575a f25027l = new C0575a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25028m = AtomicReferenceFieldUpdater.newUpdater(C2429a.class, Object.class, "_state");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25029n = AtomicReferenceFieldUpdater.newUpdater(C2429a.class, Object.class, "_closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25030o = AtomicReferenceFieldUpdater.newUpdater(C2429a.class, Object.class, "_readOp");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25031p = AtomicReferenceFieldUpdater.newUpdater(C2429a.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC1815v0 attachedJob;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p221z6.g f25033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.internal.g f25037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final io.ktor.utils.io.internal.n f25038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f25039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f25040j;
    private volatile io.ktor.utils.io.internal.e joining;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Q6.k f25041k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$A */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class A extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25045d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25047f;

        public A(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25045d = obj;
            this.f25047f |= Integer.MIN_VALUE;
            return C2429a.K1(C2429a.this, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$B */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class B extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f25048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25053f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25055h;

        public B(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25053f = obj;
            this.f25055h |= Integer.MIN_VALUE;
            return C2429a.R1(C2429a.this, (byte) 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$C */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25058c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25060e;

        public C(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25058c = obj;
            this.f25060e |= Integer.MIN_VALUE;
            return C2429a.this.W1(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$D */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class D extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25063c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25065e;

        public D(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25063c = obj;
            this.f25065e |= Integer.MIN_VALUE;
            return C2429a.this.X1(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$E */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class E extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25070e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25072g;

        public E(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25070e = obj;
            this.f25072g |= Integer.MIN_VALUE;
            return C2429a.this.Y1(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$F */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class F extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25078f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25080h;

        public F(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25078f = obj;
            this.f25080h |= Integer.MIN_VALUE;
            return C2429a.Z1(C2429a.this, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$G */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class G extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f25081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25086f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25088h;

        public G(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25086f = obj;
            this.f25088h |= Integer.MIN_VALUE;
            return C2429a.a2(C2429a.this, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$H */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class H extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25091c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25093e;

        public H(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25091c = obj;
            this.f25093e |= Integer.MIN_VALUE;
            return C2429a.this.c2(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$I */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class I extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public short f25094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25099f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25101h;

        public I(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25099f = obj;
            this.f25101h |= Integer.MIN_VALUE;
            return C2429a.d2(C2429a.this, (short) 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$J */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class J extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25106e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25108g;

        public J(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25106e = obj;
            this.f25108g |= Integer.MIN_VALUE;
            return C2429a.this.f2(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$K */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class K extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25111c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25113e;

        public K(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25111c = obj;
            this.f25113e |= Integer.MIN_VALUE;
            return C2429a.this.e2(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$L */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class L extends kotlin.jvm.internal.u implements Q6.k {
        public L() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d ucont) throws Throwable {
            Throwable thC;
            kotlin.jvm.internal.t.g(ucont, "ucont");
            int i8 = C2429a.this.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.c cVarC0 = C2429a.this.C0();
                if (cVarC0 != null && (thC = cVarC0.c()) != null) {
                    AbstractC2441b.b(thC);
                    throw new C0920i();
                }
                if (!C2429a.this.h2(i8)) {
                    C6.q.a aVar = C6.q.f1441b;
                    ucont.resumeWith(C6.q.b(C6.G.f1419a));
                    break;
                }
                C2429a c2429a = C2429a.this;
                G6.d dVarC = H6.b.c(ucont);
                C2429a c2429a2 = C2429a.this;
                while (true) {
                    if (c2429a.H0() != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!c2429a2.h2(i8)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2429a.f25031p;
                    if (F1.b.a(atomicReferenceFieldUpdater, c2429a, null, dVarC)) {
                        if (!c2429a2.h2(i8) && F1.b.a(atomicReferenceFieldUpdater, c2429a, dVarC, null)) {
                            break;
                        }
                        break;
                    }
                }
            }
            C2429a.this.B0(i8);
            if (C2429a.this.D1()) {
                C2429a.this.v1();
            }
            return H6.c.f();
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0575a {
        public /* synthetic */ C0575a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0575a() {
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2430b extends kotlin.jvm.internal.u implements Q6.k {
        public C2430b() {
            super(1);
        }

        public final void b(Throwable th) {
            C2429a.this.attachedJob = null;
            if (th == null) {
                return;
            }
            C2429a.this.f(io.ktor.utils.io.s.a(th));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2431c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25117b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25119d;

        public C2431c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25117b = obj;
            this.f25119d |= Integer.MIN_VALUE;
            return C2429a.this.p0(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2432d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25123d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25125f;

        public C2432d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25123d = obj;
            this.f25125f |= Integer.MIN_VALUE;
            return C2429a.this.r0(0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2433e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f25131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f25132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f25133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f25134i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f25135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f25136k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f25137l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f25138m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f25139n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f25141p;

        public C2433e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25139n = obj;
            this.f25141p |= Integer.MIN_VALUE;
            return C2429a.this.w0(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2434f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25145d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25147f;

        public C2434f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25145d = obj;
            this.f25147f |= Integer.MIN_VALUE;
            return C2429a.this.z0(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2435g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25153f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25155h;

        public C2435g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25153f = obj;
            this.f25155h |= Integer.MIN_VALUE;
            return C2429a.I0(C2429a.this, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2436h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25157b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25159d;

        public C2436h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25157b = obj;
            this.f25159d |= Integer.MIN_VALUE;
            return C2429a.K0(C2429a.this, null, 0L, 0L, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2437i extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f25160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f25161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f25162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f25163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f25164e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2437i(long j8, long j9, ByteBuffer byteBuffer, long j10, kotlin.jvm.internal.H h8) {
            super(1);
            this.f25160a = j8;
            this.f25161b = j9;
            this.f25162c = byteBuffer;
            this.f25163d = j10;
            this.f25164e = h8;
        }

        public final void b(ByteBuffer nioBuffer) {
            kotlin.jvm.internal.t.g(nioBuffer, "nioBuffer");
            if (nioBuffer.remaining() > this.f25160a) {
                ByteBuffer byteBufferDuplicate = nioBuffer.duplicate();
                kotlin.jvm.internal.t.d(byteBufferDuplicate);
                byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) this.f25160a));
                int iLimit = byteBufferDuplicate.limit();
                byteBufferDuplicate.limit((int) Math.min(byteBufferDuplicate.limit(), Math.min(this.f25161b, ((long) this.f25162c.limit()) - this.f25163d) + this.f25160a));
                this.f25164e.f28777a = byteBufferDuplicate.remaining();
                p189v6.d.c(byteBufferDuplicate, this.f25162c, (int) this.f25163d);
                byteBufferDuplicate.limit(iLimit);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ByteBuffer) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2438j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25169e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25171g;

        public C2438j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25169e = obj;
            this.f25171g |= Integer.MIN_VALUE;
            return C2429a.this.Y0(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2439k extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25174c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25176e;

        public C2439k(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25174c = obj;
            this.f25176e |= Integer.MIN_VALUE;
            return C2429a.this.W0(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$l, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C2440l extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25179c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25181e;

        public C2440l(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25179c = obj;
            this.f25181e |= Integer.MIN_VALUE;
            return C2429a.this.X0(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$m */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25185d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25187f;

        public m(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25185d = obj;
            this.f25187f |= Integer.MIN_VALUE;
            return C2429a.this.Z0(0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$n */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25190c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25192e;

        public n(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25190c = obj;
            this.f25192e |= Integer.MIN_VALUE;
            return C2429a.this.p(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$o */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25196d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25198f;

        public o(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25196d = obj;
            this.f25198f |= Integer.MIN_VALUE;
            return C2429a.this.b1(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$p */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25204f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25206h;

        public p(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25204f = obj;
            this.f25206h |= Integer.MIN_VALUE;
            return C2429a.this.c1(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$q */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25209c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25211e;

        public q(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25209c = obj;
            this.f25211e |= Integer.MIN_VALUE;
            return C2429a.this.I(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$r */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25214c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25216e;

        public r(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25214c = obj;
            this.f25216e |= Integer.MIN_VALUE;
            return C2429a.this.k(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$s */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f25221e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25223g;

        public s(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25221e = obj;
            this.f25223g |= Integer.MIN_VALUE;
            return C2429a.this.e1(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$t */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25229f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f25231h;

        public t(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25229f = obj;
            this.f25231h |= Integer.MIN_VALUE;
            return C2429a.this.g1(0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$u */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25234c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25236e;

        public u(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25234c = obj;
            this.f25236e |= Integer.MIN_VALUE;
            return C2429a.this.i1(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$v */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f25239c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25241e;

        public v(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25239c = obj;
            this.f25241e |= Integer.MIN_VALUE;
            return C2429a.this.j1(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$w */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25243b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25245d;

        public w(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25243b = obj;
            this.f25245d |= Integer.MIN_VALUE;
            return C2429a.k1(C2429a.this, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$x */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f25248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f25251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f25252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f25253h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f25254i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f25255j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f25256k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f25258m;

        public x(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f25256k = obj;
            this.f25258m |= Integer.MIN_VALUE;
            return C2429a.this.n1(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$y */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.J f25259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f25260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ char[] f25261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f25262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f25263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.F f25264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.F f25265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Appendable f25266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f25267i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(kotlin.jvm.internal.J j8, int i8, char[] cArr, kotlin.jvm.internal.H h8, kotlin.jvm.internal.H h9, kotlin.jvm.internal.F f8, kotlin.jvm.internal.F f9, Appendable appendable, kotlin.jvm.internal.H h10) {
            super(1);
            this.f25259a = j8;
            this.f25260b = i8;
            this.f25261c = cArr;
            this.f25262d = h8;
            this.f25263e = h9;
            this.f25264f = f8;
            this.f25265g = f9;
            this.f25266h = appendable;
            this.f25267i = h10;
        }

        public final void b(ByteBuffer buffer) throws IOException {
            kotlin.jvm.internal.t.g(buffer, "buffer");
            int iPosition = buffer.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f25259a.f28779a;
            if (byteBuffer != null) {
                int iLimit = buffer.limit();
                buffer.limit(Math.min(buffer.limit(), buffer.position() + byteBuffer.remaining()));
                byteBuffer.put(buffer);
                byteBuffer.flip();
                buffer.limit(iLimit);
            } else {
                byteBuffer = buffer;
            }
            int i8 = this.f25260b;
            long jA = p197w6.e.a(byteBuffer, this.f25261c, 0, i8 == Integer.MAX_VALUE ? this.f25261c.length : Math.min(this.f25261c.length, i8 - this.f25262d.f28777a));
            kotlin.jvm.internal.J j8 = this.f25259a;
            ByteBuffer byteBuffer2 = (ByteBuffer) j8.f28779a;
            if (byteBuffer2 != null) {
                kotlin.jvm.internal.H h8 = this.f25267i;
                buffer.position((iPosition + byteBuffer2.position()) - h8.f28777a);
                io.ktor.utils.io.internal.f.d().H1(byteBuffer2);
                j8.f28779a = null;
                h8.f28777a = 0;
            }
            int i9 = (int) (jA >> 32);
            int i10 = (int) (jA & 4294967295L);
            this.f25263e.f28777a = Math.max(1, i10);
            if (i10 == -1) {
                this.f25264f.f28775a = true;
            }
            if (i10 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 13) {
                buffer.position(buffer.position() + 1);
                this.f25265g.f28775a = true;
            }
            if (i10 != -1 && buffer.hasRemaining() && buffer.get(buffer.position()) == 10) {
                buffer.position(buffer.position() + 1);
                this.f25264f.f28775a = true;
            }
            Appendable appendable = this.f25266h;
            if (appendable instanceof StringBuilder) {
                ((StringBuilder) appendable).append(this.f25261c, 0, i9);
            } else {
                this.f25266h.append(CharBuffer.wrap(this.f25261c, 0, i9), 0, i9);
            }
            this.f25262d.f28777a += i9;
            if (i9 == 0 && buffer.remaining() < i10) {
                kotlin.jvm.internal.J j9 = this.f25259a;
                Object objB0 = io.ktor.utils.io.internal.f.d().b0();
                this.f25267i.f28777a = buffer.remaining();
                ((ByteBuffer) objB0).put(buffer);
                j9.f28779a = objB0;
            }
            int i11 = this.f25260b;
            if (i11 != Integer.MAX_VALUE && this.f25262d.f28777a >= i11 && !this.f25264f.f28775a) {
                throw new p197w6.d("Line is longer than limit");
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            b((ByteBuffer) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$z */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class z extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.F f25268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(kotlin.jvm.internal.F f8) {
            super(1);
            this.f25268a = f8;
        }

        public final void b(ByteBuffer it) {
            kotlin.jvm.internal.t.g(it, "it");
            if (it.get(it.position()) == 10) {
                it.position(it.position() + 1);
                this.f25268a.f28775a = true;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ByteBuffer) obj);
            return C6.G.f1419a;
        }
    }

    public C2429a(boolean z8, p221z6.g pool, int i8) {
        kotlin.jvm.internal.t.g(pool, "pool");
        this.f25032b = z8;
        this.f25033c = pool;
        this.f25034d = i8;
        this._state = io.ktor.utils.io.internal.h.a.f25473c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f25037g = new io.ktor.utils.io.internal.g(this);
        this.f25038h = new io.ktor.utils.io.internal.n(this);
        this.f25039i = new io.ktor.utils.io.internal.b();
        this.f25040j = new io.ktor.utils.io.internal.b();
        this.f25041k = new L();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0152  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    public static /* synthetic */ Object I0(C2429a c2429a, Q6.o oVar, G6.d dVar) throws Throwable {
        C2435g c2435g;
        kotlin.jvm.internal.J j8;
        C2429a c2429a2;
        Throwable th;
        C2429a c2429a3;
        Q6.o oVar2;
        kotlin.jvm.internal.J j9;
        kotlin.jvm.internal.J j10;
        Throwable thA;
        C2429a c2429a4;
        Throwable th2;
        Object objInvoke;
        kotlin.jvm.internal.J j11;
        kotlin.jvm.internal.J j12;
        Object objInvoke2;
        Object objInvoke3;
        io.ktor.utils.io.internal.h hVarE0;
        io.ktor.utils.io.internal.h hVarE1;
        if (dVar instanceof C2435g) {
            c2435g = (C2435g) dVar;
            int i8 = c2435g.f25155h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2435g.f25155h = i8 - Integer.MIN_VALUE;
            } else {
                c2435g = c2429a.new C2435g(dVar);
            }
        } else {
            c2435g = c2429a.new C2435g(dVar);
        }
        Object obj = c2435g.f25153f;
        Object objF = H6.c.f();
        boolean z8 = true;
        switch (c2435g.f25155h) {
            case 0:
                C6.r.b(obj);
                Throwable thA2 = c2429a.a();
                if (thA2 != null) {
                    io.ktor.utils.io.internal.d dVar2 = new io.ktor.utils.io.internal.d(thA2);
                    c2435g.f25155h = 1;
                    Object objInvoke4 = oVar.invoke(dVar2, c2435g);
                    if (objInvoke4 != objF) {
                        return objInvoke4;
                    }
                } else {
                    if (c2429a.E0() != io.ktor.utils.io.internal.h.f.f25483c) {
                        j8 = new kotlin.jvm.internal.J();
                        if (c2429a.B1() != null) {
                            try {
                                if (c2429a.E0().f25472b._availableForRead$internal == 0) {
                                    c2429a.s1();
                                    c2429a.H1();
                                } else {
                                    c2435g.f25148a = c2429a;
                                    c2435g.f25149b = oVar;
                                    c2435g.f25150c = j8;
                                    c2435g.f25151d = c2429a;
                                    c2435g.f25152e = j8;
                                    c2435g.f25155h = 3;
                                    Object objInvoke5 = oVar.invoke(c2429a, c2435g);
                                    if (objInvoke5 != objF) {
                                        c2429a3 = c2429a;
                                        oVar2 = oVar;
                                        c2429a2 = c2429a3;
                                        j9 = j8;
                                        obj = objInvoke5;
                                        j10 = j9;
                                        j9.f28779a = obj;
                                        c2429a2.s1();
                                        c2429a2.H1();
                                        j8 = j10;
                                        oVar = oVar2;
                                        c2429a = c2429a3;
                                        if (!z8) {
                                            thA = c2429a.a();
                                            if (thA != null) {
                                                io.ktor.utils.io.internal.d dVar3 = new io.ktor.utils.io.internal.d(thA);
                                                c2435g.f25148a = null;
                                                c2435g.f25149b = null;
                                                c2435g.f25150c = null;
                                                c2435g.f25151d = null;
                                                c2435g.f25152e = null;
                                                c2435g.f25155h = 4;
                                                objInvoke3 = oVar.invoke(dVar3, c2435g);
                                                if (objInvoke3 != objF) {
                                                    return objInvoke3;
                                                }
                                            } else if (c2429a.E0() == io.ktor.utils.io.internal.h.f.f25483c) {
                                                io.ktor.utils.io.internal.l lVar = io.ktor.utils.io.internal.l.f25503b;
                                                c2435g.f25148a = null;
                                                c2435g.f25149b = null;
                                                c2435g.f25150c = null;
                                                c2435g.f25151d = null;
                                                c2435g.f25152e = null;
                                                c2435g.f25155h = 5;
                                                objInvoke2 = oVar.invoke(lVar, c2435g);
                                                if (objInvoke2 != objF) {
                                                    return objInvoke2;
                                                }
                                            } else {
                                                try {
                                                    c2435g.f25148a = c2429a;
                                                    c2435g.f25149b = j8;
                                                    c2435g.f25150c = j8;
                                                    c2435g.f25151d = null;
                                                    c2435g.f25152e = null;
                                                    c2435g.f25155h = 6;
                                                    objInvoke = oVar.invoke(c2429a, c2435g);
                                                    if (objInvoke != objF) {
                                                        c2429a4 = c2429a;
                                                        j11 = j8;
                                                        obj = objInvoke;
                                                        j12 = j11;
                                                        j11.f28779a = obj;
                                                        hVarE1 = c2429a4.E0();
                                                        if (!hVarE1.a() && hVarE1 != io.ktor.utils.io.internal.h.f.f25483c) {
                                                            if ((hVarE1 instanceof io.ktor.utils.io.internal.h.d) || (hVarE1 instanceof io.ktor.utils.io.internal.h.e)) {
                                                                c2429a4.s1();
                                                            }
                                                            c2429a4.H1();
                                                        }
                                                        j8 = j12;
                                                    }
                                                } catch (Throwable th3) {
                                                    c2429a4 = c2429a;
                                                    th2 = th3;
                                                    hVarE0 = c2429a4.E0();
                                                    if (!hVarE0.a() && hVarE0 != io.ktor.utils.io.internal.h.f.f25483c) {
                                                        if ((hVarE0 instanceof io.ktor.utils.io.internal.h.d) || (hVarE0 instanceof io.ktor.utils.io.internal.h.e)) {
                                                            c2429a4.s1();
                                                        }
                                                        c2429a4.H1();
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        }
                                        return j8.f28779a;
                                    }
                                }
                            } catch (Throwable th4) {
                                c2429a2 = c2429a;
                                th = th4;
                                c2429a2.s1();
                                c2429a2.H1();
                                throw th;
                            }
                        }
                        z8 = false;
                        if (!z8) {
                            thA = c2429a.a();
                            if (thA != null) {
                                io.ktor.utils.io.internal.d dVar4 = new io.ktor.utils.io.internal.d(thA);
                                c2435g.f25148a = null;
                                c2435g.f25149b = null;
                                c2435g.f25150c = null;
                                c2435g.f25151d = null;
                                c2435g.f25152e = null;
                                c2435g.f25155h = 4;
                                objInvoke3 = oVar.invoke(dVar4, c2435g);
                                if (objInvoke3 != objF) {
                                    return objInvoke3;
                                }
                            } else if (c2429a.E0() == io.ktor.utils.io.internal.h.f.f25483c) {
                                io.ktor.utils.io.internal.l lVar2 = io.ktor.utils.io.internal.l.f25503b;
                                c2435g.f25148a = null;
                                c2435g.f25149b = null;
                                c2435g.f25150c = null;
                                c2435g.f25151d = null;
                                c2435g.f25152e = null;
                                c2435g.f25155h = 5;
                                objInvoke2 = oVar.invoke(lVar2, c2435g);
                                if (objInvoke2 != objF) {
                                    return objInvoke2;
                                }
                            } else {
                                c2435g.f25148a = c2429a;
                                c2435g.f25149b = j8;
                                c2435g.f25150c = j8;
                                c2435g.f25151d = null;
                                c2435g.f25152e = null;
                                c2435g.f25155h = 6;
                                objInvoke = oVar.invoke(c2429a, c2435g);
                                if (objInvoke != objF) {
                                    c2429a4 = c2429a;
                                    j11 = j8;
                                    obj = objInvoke;
                                    j12 = j11;
                                    j11.f28779a = obj;
                                    hVarE1 = c2429a4.E0();
                                    if (!hVarE1.a()) {
                                        if (hVarE1 instanceof io.ktor.utils.io.internal.h.d) {
                                            c2429a4.s1();
                                        } else {
                                            c2429a4.s1();
                                        }
                                        c2429a4.H1();
                                    }
                                    j8 = j12;
                                }
                            }
                        }
                        return j8.f28779a;
                    }
                    io.ktor.utils.io.internal.l lVar3 = io.ktor.utils.io.internal.l.f25503b;
                    c2435g.f25155h = 2;
                    Object objInvoke6 = oVar.invoke(lVar3, c2435g);
                    if (objInvoke6 != objF) {
                        return objInvoke6;
                    }
                }
                return objF;
            case 1:
                C6.r.b(obj);
                return obj;
            case 2:
                C6.r.b(obj);
                return obj;
            case 3:
                j9 = (kotlin.jvm.internal.J) c2435g.f25152e;
                c2429a2 = (C2429a) c2435g.f25151d;
                j10 = (kotlin.jvm.internal.J) c2435g.f25150c;
                oVar2 = (Q6.o) c2435g.f25149b;
                c2429a3 = (C2429a) c2435g.f25148a;
                try {
                    C6.r.b(obj);
                    j9.f28779a = obj;
                    c2429a2.s1();
                    c2429a2.H1();
                    j8 = j10;
                    oVar = oVar2;
                    c2429a = c2429a3;
                    if (!z8) {
                        thA = c2429a.a();
                        if (thA != null) {
                            io.ktor.utils.io.internal.d dVar5 = new io.ktor.utils.io.internal.d(thA);
                            c2435g.f25148a = null;
                            c2435g.f25149b = null;
                            c2435g.f25150c = null;
                            c2435g.f25151d = null;
                            c2435g.f25152e = null;
                            c2435g.f25155h = 4;
                            objInvoke3 = oVar.invoke(dVar5, c2435g);
                            if (objInvoke3 != objF) {
                                return objInvoke3;
                            }
                        } else if (c2429a.E0() == io.ktor.utils.io.internal.h.f.f25483c) {
                            io.ktor.utils.io.internal.l lVar4 = io.ktor.utils.io.internal.l.f25503b;
                            c2435g.f25148a = null;
                            c2435g.f25149b = null;
                            c2435g.f25150c = null;
                            c2435g.f25151d = null;
                            c2435g.f25152e = null;
                            c2435g.f25155h = 5;
                            objInvoke2 = oVar.invoke(lVar4, c2435g);
                            if (objInvoke2 != objF) {
                                return objInvoke2;
                            }
                        } else {
                            c2435g.f25148a = c2429a;
                            c2435g.f25149b = j8;
                            c2435g.f25150c = j8;
                            c2435g.f25151d = null;
                            c2435g.f25152e = null;
                            c2435g.f25155h = 6;
                            objInvoke = oVar.invoke(c2429a, c2435g);
                            if (objInvoke != objF) {
                                c2429a4 = c2429a;
                                j11 = j8;
                                obj = objInvoke;
                                j12 = j11;
                                j11.f28779a = obj;
                                hVarE1 = c2429a4.E0();
                                if (!hVarE1.a()) {
                                    if (hVarE1 instanceof io.ktor.utils.io.internal.h.d) {
                                        c2429a4.s1();
                                    } else {
                                        c2429a4.s1();
                                    }
                                    c2429a4.H1();
                                }
                                j8 = j12;
                            }
                        }
                        return objF;
                    }
                    return j8.f28779a;
                } catch (Throwable th5) {
                    th = th5;
                    c2429a2.s1();
                    c2429a2.H1();
                    throw th;
                }
            case 4:
                C6.r.b(obj);
                return obj;
            case 5:
                C6.r.b(obj);
                return obj;
            case 6:
                j11 = (kotlin.jvm.internal.J) c2435g.f25150c;
                j12 = (kotlin.jvm.internal.J) c2435g.f25149b;
                c2429a4 = (C2429a) c2435g.f25148a;
                try {
                    C6.r.b(obj);
                    j11.f28779a = obj;
                    hVarE1 = c2429a4.E0();
                    if (!hVarE1.a()) {
                        if (hVarE1 instanceof io.ktor.utils.io.internal.h.d) {
                            c2429a4.s1();
                        } else {
                            c2429a4.s1();
                        }
                        c2429a4.H1();
                    }
                    j8 = j12;
                    return j8.f28779a;
                } catch (Throwable th6) {
                    th2 = th6;
                    hVarE0 = c2429a4.E0();
                    if (!hVarE0.a()) {
                        if (hVarE0 instanceof io.ktor.utils.io.internal.h.d) {
                            c2429a4.s1();
                        } else {
                            c2429a4.s1();
                        }
                        c2429a4.H1();
                    }
                    throw th2;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static /* synthetic */ Object K0(C2429a c2429a, ByteBuffer byteBuffer, long j8, long j9, long j10, long j11, G6.d dVar) {
        C2436h c2436h;
        kotlin.jvm.internal.H h8;
        if (dVar instanceof C2436h) {
            c2436h = (C2436h) dVar;
            int i8 = c2436h.f25159d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2436h.f25159d = i8 - Integer.MIN_VALUE;
            } else {
                c2436h = c2429a.new C2436h(dVar);
            }
        } else {
            c2436h = c2429a.new C2436h(dVar);
        }
        Object obj = c2436h.f25157b;
        Object objF = H6.c.f();
        int i9 = c2436h.f25159d;
        if (i9 == 0) {
            C6.r.b(obj);
            kotlin.jvm.internal.H h9 = new kotlin.jvm.internal.H();
            int iH = (int) W6.n.h(j10 + j9, 4088L);
            try {
                Q6.k c2437i = new C2437i(j9, j11, byteBuffer, j8, h9);
                c2436h.f25156a = h9;
                c2436h.f25159d = 1;
                if (c2429a.N0(iH, c2437i, c2436h) == objF) {
                    return objF;
                }
            } catch (EOFException unused) {
            }
            h8 = h9;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8 = (kotlin.jvm.internal.H) c2436h.f25156a;
            try {
                C6.r.b(obj);
            } catch (EOFException unused2) {
            }
        }
        return I6.b.e(h8.f28777a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object K1(C2429a c2429a, int i8, Q6.k kVar, G6.d dVar) {
        A a8;
        if (dVar instanceof A) {
            a8 = (A) dVar;
            int i9 = a8.f25047f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                a8.f25047f = i9 - Integer.MIN_VALUE;
            } else {
                a8 = c2429a.new A(dVar);
            }
        } else {
            a8 = c2429a.new A(dVar);
        }
        Object obj = a8.f25045d;
        Object objF = H6.c.f();
        int i10 = a8.f25047f;
        if (i10 == 0) {
            C6.r.b(obj);
            if (i8 <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i8 > 4088) {
                throw new IllegalArgumentException(("Min(" + i8 + ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = a8.f25044c;
            Q6.k kVar2 = (Q6.k) a8.f25043b;
            C2429a c2429a2 = (C2429a) a8.f25042a;
            C6.r.b(obj);
            i8 = i11;
            c2429a = c2429a2;
            kVar = kVar2;
        }
        while (c2429a.O1(i8, kVar) < 0) {
            a8.f25042a = c2429a;
            a8.f25043b = kVar;
            a8.f25044c = i8;
            a8.f25047f = 1;
            if (c2429a.r0(i8, kVar, a8) == objF) {
                return objF;
            }
        }
        return C6.G.f1419a;
    }

    public static /* synthetic */ Object O0(C2429a c2429a, int i8, Q6.k kVar, G6.d dVar) throws Throwable {
        int i9;
        if (i8 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        ByteBuffer byteBufferB1 = c2429a.B1();
        boolean z8 = false;
        if (byteBufferB1 != null) {
            io.ktor.utils.io.internal.j jVar = c2429a.E0().f25472b;
            try {
                if (jVar._availableForRead$internal != 0 && (i9 = jVar._availableForRead$internal) > 0 && i9 >= i8) {
                    int iPosition = byteBufferB1.position();
                    int iLimit = byteBufferB1.limit();
                    kVar.invoke(byteBufferB1);
                    if (iLimit != byteBufferB1.limit()) {
                        throw new IllegalStateException("Buffer limit modified.");
                    }
                    int iPosition2 = byteBufferB1.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                    }
                    if (!jVar.m(iPosition2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c2429a.s0(byteBufferB1, jVar, iPosition2);
                    z8 = true;
                }
                c2429a.s1();
                c2429a.H1();
            } catch (Throwable th) {
                c2429a.s1();
                c2429a.H1();
                throw th;
            }
        }
        if (z8) {
            return C6.G.f1419a;
        }
        if (!c2429a.J() || i8 <= 0) {
            Object objZ0 = c2429a.Z0(i8, kVar, dVar);
            return objZ0 == H6.c.f() ? objZ0 : C6.G.f1419a;
        }
        throw new EOFException("Got EOF but at least " + i8 + " bytes were expected");
    }

    public static /* synthetic */ Object Q1(C2429a c2429a, byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = c2429a.joining;
        if (eVar != null && (c2429aR1 = c2429a.r1(c2429a, eVar)) != null) {
            return c2429aR1.P1(bArr, i8, i9, dVar);
        }
        int iN1 = c2429a.N1(bArr, i8, i9);
        return iN1 > 0 ? I6.b.d(iN1) : c2429a.f2(bArr, i8, i9, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[PHI: r2 r6 r8 r9 r10
      0x00fa: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v14 java.nio.ByteBuffer) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r6v2 io.ktor.utils.io.internal.j) = (r6v1 io.ktor.utils.io.internal.j), (r6v4 io.ktor.utils.io.internal.j) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r8v13 io.ktor.utils.io.a) = (r8v11 io.ktor.utils.io.a), (r8v19 io.ktor.utils.io.a) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r9v14 int) = (r9v12 int), (r9v21 int) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r10v13 byte) = (r10v12 byte), (r10v17 byte) binds: [B:47:0x00f7, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:94:0x00e6 A[EXC_TOP_SPLITTER, PHI: r2 r6 r8 r9 r10
      0x00e6: PHI (r2v9 java.nio.ByteBuffer) = (r2v3 java.nio.ByteBuffer), (r2v10 java.nio.ByteBuffer) binds: [B:45:0x00e2, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r6v1 io.ktor.utils.io.internal.j) = (r6v0 io.ktor.utils.io.internal.j), (r6v2 io.ktor.utils.io.internal.j) binds: [B:45:0x00e2, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r8v11 io.ktor.utils.io.a) = (r8v0 io.ktor.utils.io.a), (r8v13 io.ktor.utils.io.a) binds: [B:45:0x00e2, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r9v12 int) = (r9v5 int), (r9v14 int) binds: [B:45:0x00e2, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r10v12 byte) = (r10v4 byte), (r10v13 byte) binds: [B:45:0x00e2, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f7 -> B:49:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object R1(io.ktor.utils.io.C2429a r8, byte r9, G6.d r10) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.R1(io.ktor.utils.io.a, byte, G6.d):java.lang.Object");
    }

    public static /* synthetic */ int S0(C2429a c2429a, p205x6.a aVar, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = aVar.g() - aVar.k();
        }
        return c2429a.Q0(aVar, i8, i9);
    }

    public static /* synthetic */ Object S1(C2429a c2429a, ByteBuffer byteBuffer, G6.d dVar) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = c2429a.joining;
        if (eVar != null && (c2429aR1 = c2429a.r1(c2429a, eVar)) != null) {
            Object objB = c2429aR1.b(byteBuffer, dVar);
            return objB == H6.c.f() ? objB : C6.G.f1419a;
        }
        c2429a.L1(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return C6.G.f1419a;
        }
        Object objW1 = c2429a.W1(byteBuffer, dVar);
        return objW1 == H6.c.f() ? objW1 : C6.G.f1419a;
    }

    public static /* synthetic */ Object T0(C2429a c2429a, ByteBuffer byteBuffer, G6.d dVar) throws Throwable {
        int iP0 = c2429a.P0(byteBuffer);
        if (iP0 == 0 && c2429a.C0() != null) {
            iP0 = c2429a.E0().f25472b.e() ? c2429a.P0(byteBuffer) : -1;
        } else if (iP0 <= 0 && byteBuffer.hasRemaining()) {
            return c2429a.W0(byteBuffer, dVar);
        }
        return I6.b.d(iP0);
    }

    public static /* synthetic */ Object T1(C2429a c2429a, p205x6.a aVar, G6.d dVar) throws Throwable {
        c2429a.M1(aVar);
        if (aVar.k() <= aVar.i()) {
            return C6.G.f1419a;
        }
        Object objX1 = c2429a.X1(aVar, dVar);
        return objX1 == H6.c.f() ? objX1 : C6.G.f1419a;
    }

    public static /* synthetic */ Object U0(C2429a c2429a, p213y6.a aVar, G6.d dVar) {
        int iS0 = S0(c2429a, aVar, 0, 0, 6, null);
        if (iS0 == 0 && c2429a.C0() != null) {
            iS0 = c2429a.E0().f25472b.e() ? S0(c2429a, aVar, 0, 0, 6, null) : -1;
        } else if (iS0 <= 0 && aVar.g() > aVar.k()) {
            return c2429a.X0(aVar, dVar);
        }
        return I6.b.d(iS0);
    }

    public static /* synthetic */ Object U1(C2429a c2429a, byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = c2429a.joining;
        if (eVar != null && (c2429aR1 = c2429a.r1(c2429a, eVar)) != null) {
            Object objL = c2429aR1.l(bArr, i8, i9, dVar);
            return objL == H6.c.f() ? objL : C6.G.f1419a;
        }
        while (i9 > 0) {
            int iN1 = c2429a.N1(bArr, i8, i9);
            if (iN1 == 0) {
                break;
            }
            i8 += iN1;
            i9 -= iN1;
        }
        if (i9 == 0) {
            return C6.G.f1419a;
        }
        Object objY1 = c2429a.Y1(bArr, i8, i9, dVar);
        return objY1 == H6.c.f() ? objY1 : C6.G.f1419a;
    }

    public static /* synthetic */ Object V0(C2429a c2429a, byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        int iR0 = c2429a.R0(bArr, i8, i9);
        if (iR0 == 0 && c2429a.C0() != null) {
            iR0 = c2429a.E0().f25472b.e() ? c2429a.R0(bArr, i8, i9) : -1;
        } else if (iR0 <= 0 && i9 != 0) {
            return c2429a.Y0(bArr, i8, i9, dVar);
        }
        return I6.b.d(iR0);
    }

    public static /* synthetic */ Object V1(C2429a c2429a, ByteBuffer byteBuffer, int i8, int i9, G6.d dVar) {
        Object objB = c2429a.b(p189v6.c.e(byteBuffer, i8, i9 - i8), dVar);
        return objB == H6.c.f() ? objB : C6.G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[PHI: r2 r3 r6 r8 r9
      0x00f5: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v15 java.nio.ByteBuffer) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r3v4 int) = (r3v2 int), (r3v8 int) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r6v5 io.ktor.utils.io.internal.j) = (r6v4 io.ktor.utils.io.internal.j), (r6v7 io.ktor.utils.io.internal.j) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r8v12 io.ktor.utils.io.a) = (r8v10 io.ktor.utils.io.a), (r8v18 io.ktor.utils.io.a) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r9v9 int) = (r9v7 int), (r9v13 int) binds: [B:47:0x00f2, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x00e1 A[EXC_TOP_SPLITTER, PHI: r2 r3 r6 r8 r9
      0x00e1: PHI (r2v9 java.nio.ByteBuffer) = (r2v3 java.nio.ByteBuffer), (r2v10 java.nio.ByteBuffer) binds: [B:45:0x00df, B:66:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r3v2 int) = (r3v0 int), (r3v4 int) binds: [B:45:0x00df, B:66:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r6v4 io.ktor.utils.io.internal.j) = (r6v1 io.ktor.utils.io.internal.j), (r6v5 io.ktor.utils.io.internal.j) binds: [B:45:0x00df, B:66:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r8v10 io.ktor.utils.io.a) = (r8v0 io.ktor.utils.io.a), (r8v12 io.ktor.utils.io.a) binds: [B:45:0x00df, B:66:0x0154] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r9v7 int) = (r9v0 int), (r9v9 int) binds: [B:45:0x00df, B:66:0x0154] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f2 -> B:49:0x00f5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object Z1(io.ktor.utils.io.C2429a r8, int r9, G6.d r10) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.Z1(io.ktor.utils.io.a, int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[PHI: r2 r7 r10 r11 r12
      0x00f9: PHI (r2v10 java.nio.ByteBuffer) = (r2v9 java.nio.ByteBuffer), (r2v14 java.nio.ByteBuffer) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r7v2 io.ktor.utils.io.internal.j) = (r7v1 io.ktor.utils.io.internal.j), (r7v4 io.ktor.utils.io.internal.j) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r10v12 io.ktor.utils.io.a) = (r10v10 io.ktor.utils.io.a), (r10v18 io.ktor.utils.io.a) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r11v8 int) = (r11v6 int), (r11v14 int) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r12v4 long) = (r12v3 long), (r12v6 long) binds: [B:47:0x00f6, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:96:0x00e5 A[EXC_TOP_SPLITTER, PHI: r2 r7 r10 r11 r12
      0x00e5: PHI (r2v9 java.nio.ByteBuffer) = (r2v3 java.nio.ByteBuffer), (r2v10 java.nio.ByteBuffer) binds: [B:45:0x00e1, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r7v1 io.ktor.utils.io.internal.j) = (r7v0 io.ktor.utils.io.internal.j), (r7v2 io.ktor.utils.io.internal.j) binds: [B:45:0x00e1, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r10v10 io.ktor.utils.io.a) = (r10v0 io.ktor.utils.io.a), (r10v12 io.ktor.utils.io.a) binds: [B:45:0x00e1, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r11v6 int) = (r11v3 int), (r11v8 int) binds: [B:45:0x00e1, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r12v3 long) = (r12v0 long), (r12v4 long) binds: [B:45:0x00e1, B:66:0x0156] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f6 -> B:49:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object a2(io.ktor.utils.io.C2429a r10, long r11, G6.d r13) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.a2(io.ktor.utils.io.a, long, G6.d):java.lang.Object");
    }

    public static /* synthetic */ Object b2(C2429a c2429a, p205x6.k kVar, G6.d dVar) {
        C2429a c2429aR1;
        C2429a c2429aR2;
        io.ktor.utils.io.internal.e eVar = c2429a.joining;
        if (eVar != null && (c2429aR2 = c2429a.r1(c2429a, eVar)) != null) {
            Object objK = c2429aR2.K(kVar, dVar);
            return objK == H6.c.f() ? objK : C6.G.f1419a;
        }
        while (!kVar.T0() && c2429a.I1(kVar) != 0) {
            try {
            } catch (Throwable th) {
                kVar.a2();
                throw th;
            }
        }
        if (kVar.o1() <= 0) {
            return C6.G.f1419a;
        }
        io.ktor.utils.io.internal.e eVar2 = c2429a.joining;
        if (eVar2 == null || (c2429aR1 = c2429a.r1(c2429a, eVar2)) == null) {
            Object objC2 = c2429a.c2(kVar, dVar);
            return objC2 == H6.c.f() ? objC2 : C6.G.f1419a;
        }
        Object objK2 = c2429aR1.K(kVar, dVar);
        return objK2 == H6.c.f() ? objK2 : C6.G.f1419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:19:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c1(byte[] r7, int r8, int r9, G6.d r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C2429a.p
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$p r0 = (io.ktor.utils.io.C2429a.p) r0
            int r1 = r0.f25206h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25206h = r1
            goto L18
        L13:
            io.ktor.utils.io.a$p r0 = new io.ktor.utils.io.a$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25204f
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25206h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.f25203e
            int r8 = r0.f25202d
            int r9 = r0.f25201c
            java.lang.Object r2 = r0.f25200b
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.f25199a
            io.ktor.utils.io.a r4 = (io.ktor.utils.io.C2429a) r4
            C6.r.b(r10)
            goto L5e
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            C6.r.b(r10)
            r10 = 0
            r4 = r6
        L44:
            r0.f25199a = r4
            r0.f25200b = r7
            r0.f25201c = r8
            r0.f25202d = r9
            r0.f25203e = r10
            r0.f25206h = r3
            java.lang.Object r2 = r4.h1(r3, r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r7
            r7 = r10
            r10 = r5
            r5 = r9
            r9 = r8
            r8 = r5
        L5e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L76
            int r9 = r9 + r7
            int r7 = r8 - r7
            int r10 = r4.R0(r2, r9, r7)
            if (r10 < r7) goto L72
            C6.G r7 = C6.G.f1419a
            return r7
        L72:
            r8 = r9
            r9 = r7
            r7 = r2
            goto L44
        L76:
            d7.p r7 = new d7.p
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unexpected EOF: expected "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = " more bytes"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.c1(byte[], int, int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d1(C2429a c2429a, int i8, G6.d dVar) throws Throwable {
        Throwable thB;
        io.ktor.utils.io.internal.c cVarC0 = c2429a.C0();
        if (cVarC0 != null && (thB = cVarC0.b()) != null) {
            AbstractC2441b.b(thB);
            throw new C0920i();
        }
        if (i8 == 0) {
            return p205x6.k.f37426i.a();
        }
        p205x6.j jVar = new p205x6.j(null, 1, 0 == true ? 1 : 0);
        ByteBuffer byteBuffer = (ByteBuffer) io.ktor.utils.io.internal.f.d().b0();
        while (i8 > 0) {
            try {
                byteBuffer.clear();
                if (byteBuffer.remaining() > i8) {
                    byteBuffer.limit(i8);
                }
                int iP0 = c2429a.P0(byteBuffer);
                if (iP0 == 0) {
                    break;
                }
                byteBuffer.flip();
                p205x6.t.a(jVar, byteBuffer);
                i8 -= iP0;
            } catch (Throwable th) {
                io.ktor.utils.io.internal.f.d().H1(byteBuffer);
                jVar.T0();
                throw th;
            }
        }
        if (i8 != 0) {
            return c2429a.e1(i8, jVar, byteBuffer, dVar);
        }
        io.ktor.utils.io.internal.f.d().H1(byteBuffer);
        return jVar.M1();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[PHI: r2 r6 r8 r9 r10
      0x00f7: PHI (r2v7 int) = (r2v6 int), (r2v13 int) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r6v4 io.ktor.utils.io.internal.j) = (r6v3 io.ktor.utils.io.internal.j), (r6v6 io.ktor.utils.io.internal.j) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v13 io.ktor.utils.io.a) = (r8v11 io.ktor.utils.io.a), (r8v19 io.ktor.utils.io.a) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r9v13 short) = (r9v11 short), (r9v20 short) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v11 java.nio.ByteBuffer) = (r10v10 java.nio.ByteBuffer), (r10v14 java.nio.ByteBuffer) binds: [B:47:0x00f4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:94:0x00e3 A[EXC_TOP_SPLITTER, PHI: r2 r6 r8 r9 r10
      0x00e3: PHI (r2v6 int) = (r2v1 int), (r2v7 int) binds: [B:45:0x00e2, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r6v3 io.ktor.utils.io.internal.j) = (r6v1 io.ktor.utils.io.internal.j), (r6v4 io.ktor.utils.io.internal.j) binds: [B:45:0x00e2, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r8v11 io.ktor.utils.io.a) = (r8v0 io.ktor.utils.io.a), (r8v13 io.ktor.utils.io.a) binds: [B:45:0x00e2, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r9v11 short) = (r9v0 short), (r9v13 short) binds: [B:45:0x00e2, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r10v10 java.nio.ByteBuffer) = (r10v3 java.nio.ByteBuffer), (r10v11 java.nio.ByteBuffer) binds: [B:45:0x00e2, B:66:0x0158] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f4 -> B:49:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object d2(io.ktor.utils.io.C2429a r8, short r9, G6.d r10) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.d2(io.ktor.utils.io.a, short, G6.d):java.lang.Object");
    }

    public static /* synthetic */ Object f1(C2429a c2429a, long j8, G6.d dVar) throws Throwable {
        if (!c2429a.m()) {
            return c2429a.g1(j8, dVar);
        }
        Throwable thA = c2429a.a();
        if (thA == null) {
            return c2429a.p1(j8);
        }
        AbstractC2441b.b(thA);
        throw new C0920i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object k1(C2429a c2429a, int i8, G6.d dVar) {
        w wVar;
        StringBuilder sb;
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i9 = wVar.f25245d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                wVar.f25245d = i9 - Integer.MIN_VALUE;
            } else {
                wVar = c2429a.new w(dVar);
            }
        } else {
            wVar = c2429a.new w(dVar);
        }
        Object obj = wVar.f25243b;
        Object objF = H6.c.f();
        int i10 = wVar.f25245d;
        if (i10 == 0) {
            C6.r.b(obj);
            StringBuilder sb2 = new StringBuilder();
            wVar.f25242a = sb2;
            wVar.f25245d = 1;
            Object objR = c2429a.r(sb2, i8, wVar);
            if (objR == objF) {
                return objF;
            }
            obj = objR;
            sb = sb2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) wVar.f25242a;
            C6.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    public static /* synthetic */ Object q0(C2429a c2429a, G6.d dVar) throws Throwable {
        Object objH1 = c2429a.h1(1, dVar);
        return objH1 == H6.c.f() ? objH1 : C6.G.f1419a;
    }

    public static /* synthetic */ Object y0(C2429a c2429a, long j8, G6.d dVar) throws Throwable {
        long j9 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(("max shouldn't be negative: " + j8).toString());
        }
        ByteBuffer byteBufferB1 = c2429a.B1();
        if (byteBufferB1 != null) {
            io.ktor.utils.io.internal.j jVar = c2429a.E0().f25472b;
            try {
                if (jVar._availableForRead$internal != 0) {
                    int iL = jVar.l((int) Math.min(2147483647L, j8));
                    c2429a.s0(byteBufferB1, jVar, iL);
                    j9 = iL;
                }
            } finally {
                c2429a.s1();
                c2429a.H1();
            }
        }
        long j10 = j9;
        return (j10 == j8 || c2429a.J()) ? I6.b.e(j10) : c2429a.z0(j10, j8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:21:0x005b, B:32:0x0083), top: B:39:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0065 A[EDGE_INSN: B:42:0x0065->B:24:0x0065 BREAK  A[LOOP:0: B:15:0x0048->B:33:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:29:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object z0(long r10, long r12, G6.d r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.C2429a.C2434f
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.a$f r0 = (io.ktor.utils.io.C2429a.C2434f) r0
            int r1 = r0.f25147f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25147f = r1
            goto L18
        L13:
            io.ktor.utils.io.a$f r0 = new io.ktor.utils.io.a$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25145d
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25147f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r10 = r0.f25144c
            java.lang.Object r12 = r0.f25143b
            kotlin.jvm.internal.I r12 = (kotlin.jvm.internal.I) r12
            java.lang.Object r13 = r0.f25142a
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.C2429a) r13
            C6.r.b(r14)
            goto L7a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            C6.r.b(r14)
            kotlin.jvm.internal.I r14 = new kotlin.jvm.internal.I
            r14.<init>()
            r14.f28778a = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L48:
            long r4 = r12.f28778a
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto Lab
            java.nio.ByteBuffer r14 = r13.B1()
            if (r14 != 0) goto L55
            goto L65
        L55:
            io.ktor.utils.io.internal.h r2 = r13.E0()
            io.ktor.utils.io.internal.j r2 = r2.f25472b
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L83
            r13.s1()
            r13.H1()
        L65:
            boolean r14 = r13.J()
            if (r14 != 0) goto Lab
            r0.f25142a = r13
            r0.f25143b = r12
            r0.f25144c = r10
            r0.f25147f = r3
            java.lang.Object r14 = r13.h1(r3, r0)
            if (r14 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L48
            goto Lab
        L83:
            long r4 = r12.f28778a     // Catch: java.lang.Throwable -> La3
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> La3
            int r4 = (int) r4     // Catch: java.lang.Throwable -> La3
            int r4 = r2.l(r4)     // Catch: java.lang.Throwable -> La3
            r13.s0(r14, r2, r4)     // Catch: java.lang.Throwable -> La3
            long r5 = r12.f28778a     // Catch: java.lang.Throwable -> La3
            long r7 = (long) r4     // Catch: java.lang.Throwable -> La3
            long r5 = r5 + r7
            r12.f28778a = r5     // Catch: java.lang.Throwable -> La3
            r13.s1()
            r13.H1()
            goto L48
        La3:
            r10 = move-exception
            r13.s1()
            r13.H1()
            throw r10
        Lab:
            long r10 = r12.f28778a
            java.lang.Long r10 = I6.b.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.z0(long, long, G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC2442c
    public void A(InterfaceC1815v0 job) {
        kotlin.jvm.internal.t.g(job, "job");
        InterfaceC1815v0 interfaceC1815v0 = this.attachedJob;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.attachedJob = job;
        InterfaceC1815v0.a.d(job, true, false, new C2430b(), 2, null);
    }

    public final void A0(io.ktor.utils.io.internal.e eVar) {
        io.ktor.utils.io.internal.c cVarC0 = C0();
        if (cVarC0 == null) {
            return;
        }
        this.joining = null;
        if (!eVar.b()) {
            eVar.c().flush();
            eVar.a();
            return;
        }
        io.ktor.utils.io.internal.h hVarE0 = eVar.c().E0();
        boolean z8 = (hVarE0 instanceof io.ktor.utils.io.internal.h.g) || (hVarE0 instanceof io.ktor.utils.io.internal.h.e);
        if (cVarC0.b() == null && z8) {
            eVar.c().flush();
        } else {
            eVar.c().d(cVarC0.b());
        }
        eVar.a();
    }

    public void A1(long j8) {
        this.totalBytesWritten = j8;
    }

    @Override // io.ktor.utils.io.g
    public Object B(long j8, G6.d dVar) {
        return y0(this, j8, dVar);
    }

    public final void B0(int i8) {
        io.ktor.utils.io.internal.h hVarE0;
        io.ktor.utils.io.internal.h.f fVar;
        C2429a c2429aC;
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar != null && (c2429aC = eVar.c()) != null) {
            c2429aC.flush();
        }
        do {
            hVarE0 = E0();
            fVar = io.ktor.utils.io.internal.h.f.f25483c;
            if (hVarE0 == fVar) {
                return;
            } else {
                hVarE0.f25472b.e();
            }
        } while (hVarE0 != E0());
        int i9 = hVarE0.f25472b._availableForWrite$internal;
        if (hVarE0.f25472b._availableForRead$internal >= 1) {
            v1();
        }
        io.ktor.utils.io.internal.e eVar2 = this.joining;
        if (i9 >= i8) {
            if (eVar2 == null || E0() == fVar) {
                w1();
            }
        }
    }

    public final ByteBuffer B1() throws Throwable {
        Object obj;
        Throwable thB;
        io.ktor.utils.io.internal.h hVarD;
        Throwable thB2;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.h hVar = (io.ktor.utils.io.internal.h) obj;
            if (kotlin.jvm.internal.t.c(hVar, io.ktor.utils.io.internal.h.f.f25483c) ? true : kotlin.jvm.internal.t.c(hVar, io.ktor.utils.io.internal.h.a.f25473c)) {
                io.ktor.utils.io.internal.c cVarC0 = C0();
                if (cVarC0 == null || (thB = cVarC0.b()) == null) {
                    return null;
                }
                AbstractC2441b.b(thB);
                throw new C0920i();
            }
            io.ktor.utils.io.internal.c cVarC1 = C0();
            if (cVarC1 != null && (thB2 = cVarC1.b()) != null) {
                AbstractC2441b.b(thB2);
                throw new C0920i();
            }
            if (hVar.f25472b._availableForRead$internal == 0) {
                return null;
            }
            hVarD = hVar.d();
        } while (!F1.b.a(f25028m, this, obj, hVarD));
        ByteBuffer byteBufferB = hVarD.b();
        L0(byteBufferB, this.f25035e, hVarD.f25472b._availableForRead$internal);
        return byteBufferB;
    }

    @Override // io.ktor.utils.io.j
    public Object C(p205x6.a aVar, G6.d dVar) {
        return T1(this, aVar, dVar);
    }

    public final io.ktor.utils.io.internal.c C0() {
        return (io.ktor.utils.io.internal.c) this._closed;
    }

    public final ByteBuffer C1() throws Throwable {
        Object obj;
        io.ktor.utils.io.internal.h hVar;
        io.ktor.utils.io.internal.h.a aVar;
        io.ktor.utils.io.internal.h hVarE;
        G6.d dVarH0 = H0();
        if (dVarH0 != null) {
            throw new IllegalStateException("Write operation is already in progress: " + dVarH0);
        }
        io.ktor.utils.io.internal.h hVar2 = null;
        io.ktor.utils.io.internal.h.c cVarJ0 = null;
        do {
            obj = this._state;
            hVar = (io.ktor.utils.io.internal.h) obj;
            if (this.joining != null) {
                if (cVarJ0 != null) {
                    o1(cVarJ0);
                }
                return null;
            }
            if (C0() != null) {
                if (cVarJ0 != null) {
                    o1(cVarJ0);
                }
                io.ktor.utils.io.internal.c cVarC0 = C0();
                kotlin.jvm.internal.t.d(cVarC0);
                AbstractC2441b.b(cVarC0.c());
                throw new C0920i();
            }
            aVar = io.ktor.utils.io.internal.h.a.f25473c;
            if (hVar == aVar) {
                if (cVarJ0 == null) {
                    cVarJ0 = J0();
                }
                hVarE = cVarJ0.e();
            } else {
                if (hVar == io.ktor.utils.io.internal.h.f.f25483c) {
                    if (cVarJ0 != null) {
                        o1(cVarJ0);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    io.ktor.utils.io.internal.c cVarC1 = C0();
                    kotlin.jvm.internal.t.d(cVarC1);
                    AbstractC2441b.b(cVarC1.c());
                    throw new C0920i();
                }
                hVarE = hVar.e();
            }
        } while (!F1.b.a(f25028m, this, obj, hVarE));
        if (C0() != null) {
            t1();
            H1();
            io.ktor.utils.io.internal.c cVarC2 = C0();
            kotlin.jvm.internal.t.d(cVarC2);
            AbstractC2441b.b(cVarC2.c());
            throw new C0920i();
        }
        ByteBuffer byteBufferC = hVarE.c();
        if (cVarJ0 != null) {
            if (hVar == null) {
                kotlin.jvm.internal.t.t("old");
            } else {
                hVar2 = hVar;
            }
            if (hVar2 != aVar) {
                o1(cVarJ0);
            }
        }
        L0(byteBufferC, this.f25036f, hVarE.f25472b._availableForWrite$internal);
        return byteBufferC;
    }

    @Override // io.ktor.utils.io.g
    public Object D(long j8, G6.d dVar) {
        return f1(this, j8, dVar);
    }

    public final G6.d D0() {
        return (G6.d) this._readOp;
    }

    public final boolean D1() {
        if (this.joining != null) {
            return E0() == io.ktor.utils.io.internal.h.a.f25473c || (E0() instanceof io.ktor.utils.io.internal.h.b);
        }
        return false;
    }

    @Override // io.ktor.utils.io.j
    public Object E(byte b8, G6.d dVar) {
        return R1(this, b8, dVar);
    }

    public final io.ktor.utils.io.internal.h E0() {
        return (io.ktor.utils.io.internal.h) this._state;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0000 A[EDGE_INSN: B:80:0x0000->B:75:0x0000 BREAK  A[LOOP:1: B:28:0x006e->B:81:?], SYNTHETIC] */
    public final Object E1(int i8, G6.d dVar) {
        while (true) {
            io.ktor.utils.io.internal.h hVarE0 = E0();
            if (hVarE0.f25472b._availableForRead$internal >= i8 || !(this.joining == null || H0() == null || (hVarE0 != io.ktor.utils.io.internal.h.a.f25473c && !(hVarE0 instanceof io.ktor.utils.io.internal.h.b)))) {
                break;
            }
            io.ktor.utils.io.internal.c cVarC0 = C0();
            if (cVarC0 != null) {
                if (cVarC0.b() != null) {
                    C6.q.a aVar = C6.q.f1441b;
                    dVar.resumeWith(C6.q.b(C6.r.a(cVarC0.b())));
                    return H6.c.f();
                }
                boolean zE = E0().f25472b.e();
                boolean z8 = false;
                boolean z9 = E0().f25472b._availableForRead$internal >= i8;
                C6.q.a aVar2 = C6.q.f1441b;
                if (zE && z9) {
                    z8 = true;
                }
                dVar.resumeWith(C6.q.b(Boolean.valueOf(z8)));
                return H6.c.f();
            }
            while (true) {
                if (D0() != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (C0() != null) {
                    break;
                }
                io.ktor.utils.io.internal.h hVarE1 = E0();
                if (hVarE1.f25472b._availableForRead$internal >= i8 || !(this.joining == null || H0() == null || (hVarE1 != io.ktor.utils.io.internal.h.a.f25473c && !(hVarE1 instanceof io.ktor.utils.io.internal.h.b)))) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25030o;
                if (F1.b.a(atomicReferenceFieldUpdater, this, null, dVar)) {
                    if (C0() != null) {
                        if (!F1.b.a(atomicReferenceFieldUpdater, this, dVar, null)) {
                            break;
                            break;
                        }
                    } else {
                        io.ktor.utils.io.internal.h hVarE2 = E0();
                        if (hVarE2.f25472b._availableForRead$internal >= i8 || (this.joining != null && H0() != null && (hVarE2 == io.ktor.utils.io.internal.h.a.f25473c || (hVarE2 instanceof io.ktor.utils.io.internal.h.b)))) {
                            if (!F1.b.a(atomicReferenceFieldUpdater, this, dVar, null)) {
                                break;
                            }
                        }
                    }
                }
            }
            return H6.c.f();
        }
        C6.q.a aVar3 = C6.q.f1441b;
        dVar.resumeWith(C6.q.b(Boolean.TRUE));
        return H6.c.f();
    }

    @Override // io.ktor.utils.io.t
    public void F() {
        this.f25037g.a();
        io.ktor.utils.io.internal.h hVarE0 = E0();
        if ((hVarE0 instanceof io.ktor.utils.io.internal.h.d) || (hVarE0 instanceof io.ktor.utils.io.internal.h.e)) {
            s1();
            H1();
        }
    }

    public long F0() {
        return this.totalBytesRead;
    }

    public final boolean F1(io.ktor.utils.io.internal.e eVar) {
        if (!G1(true)) {
            return false;
        }
        A0(eVar);
        G6.d dVar = (G6.d) f25030o.getAndSet(this, null);
        if (dVar != null) {
            C6.q.a aVar = C6.q.f1441b;
            dVar.resumeWith(C6.q.b(C6.r.a(new IllegalStateException("Joining is in progress"))));
        }
        w1();
        return true;
    }

    @Override // io.ktor.utils.io.g
    public Object G(byte[] bArr, int i8, int i9, G6.d dVar) {
        return V0(this, bArr, i8, i9, dVar);
    }

    public long G0() {
        return this.totalBytesWritten;
    }

    public final boolean G1(boolean z8) {
        Object obj;
        io.ktor.utils.io.internal.h.f fVar;
        io.ktor.utils.io.internal.h.c cVarH = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.h hVar = (io.ktor.utils.io.internal.h) obj;
            io.ktor.utils.io.internal.c cVarC0 = C0();
            if (cVarH != null) {
                if ((cVarC0 != null ? cVarC0.b() : null) == null) {
                    cVarH.f25472b.j();
                }
                w1();
                cVarH = null;
            }
            fVar = io.ktor.utils.io.internal.h.f.f25483c;
            if (hVar == fVar) {
                return true;
            }
            if (hVar != io.ktor.utils.io.internal.h.a.f25473c) {
                if (cVarC0 != null && (hVar instanceof io.ktor.utils.io.internal.h.b) && (hVar.f25472b.k() || cVarC0.b() != null)) {
                    if (cVarC0.b() != null) {
                        hVar.f25472b.f();
                    }
                    cVarH = ((io.ktor.utils.io.internal.h.b) hVar).h();
                } else {
                    if (!z8 || !(hVar instanceof io.ktor.utils.io.internal.h.b) || !hVar.f25472b.k()) {
                        return false;
                    }
                    cVarH = ((io.ktor.utils.io.internal.h.b) hVar).h();
                }
            }
        } while (!F1.b.a(f25028m, this, obj, fVar));
        if (cVarH != null && E0() == fVar) {
            o1(cVarH);
        }
        return true;
    }

    @Override // io.ktor.utils.io.g
    public Object H(p213y6.a aVar, G6.d dVar) {
        return U0(this, aVar, dVar);
    }

    public final G6.d H0() {
        return (G6.d) this._writeOp;
    }

    public final boolean H1() {
        if (C0() == null || !G1(false)) {
            return false;
        }
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar != null) {
            A0(eVar);
        }
        v1();
        w1();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:19:0x0051, B:22:0x005c, B:25:0x0063, B:27:0x0069, B:30:0x006f), top: B:49:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:19:0x0051, B:22:0x005c, B:25:0x0063, B:27:0x0069, B:30:0x006f), top: B:49:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0098 -> B:42:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x009a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.utils.io.g
    public final java.lang.Object I(G6.d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C2429a.q
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$q r0 = (io.ktor.utils.io.C2429a.q) r0
            int r1 = r0.f25211e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25211e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$q r0 = new io.ktor.utils.io.a$q
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25209c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25211e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.f25208b
            java.lang.Object r4 = r0.f25207a
            io.ktor.utils.io.a r4 = (io.ktor.utils.io.C2429a) r4
            C6.r.b(r10)
            goto L9b
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            C6.r.b(r10)
            r10 = 4
            r4 = r9
            r2 = r10
        L3e:
            kotlin.jvm.internal.J r10 = new kotlin.jvm.internal.J
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.B1()
            r6 = 0
            if (r5 != 0) goto L4b
            goto L7e
        L4b:
            io.ktor.utils.io.internal.h r7 = r4.E0()
            io.ktor.utils.io.internal.j r7 = r7.f25472b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L5c
        L55:
            r4.s1()
            r4.H1()
            goto L7e
        L5c:
            boolean r8 = r7.m(r2)     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L63
            goto L55
        L63:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6d
            if (r6 >= r2) goto L6f
            r4.x1(r5, r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto Lc0
        L6f:
            int r6 = r5.getInt()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r6 = I6.b.d(r6)     // Catch: java.lang.Throwable -> L6d
            r10.f28779a = r6     // Catch: java.lang.Throwable -> L6d
            r4.s0(r5, r7, r2)     // Catch: java.lang.Throwable -> L6d
            r6 = r3
            goto L55
        L7e:
            if (r6 == 0) goto L8e
            java.lang.Object r10 = r10.f28779a
            if (r10 != 0) goto L8b
            java.lang.String r10 = "result"
            kotlin.jvm.internal.t.t(r10)
            r10 = 0
            return r10
        L8b:
            java.lang.Number r10 = (java.lang.Number) r10
            return r10
        L8e:
            r0.f25207a = r4
            r0.f25208b = r2
            r0.f25211e = r3
            java.lang.Object r10 = r4.h1(r2, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La4
            goto L3e
        La4:
            d7.p r10 = new d7.p
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EOF while "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " bytes expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lc0:
            r4.s1()
            r4.H1()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.I(G6.d):java.lang.Object");
    }

    public final int I1(p205x6.k kVar) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar == null || (c2429aR1 = r1(this, eVar)) == null) {
            c2429aR1 = this;
        }
        ByteBuffer byteBufferC1 = c2429aR1.C1();
        if (byteBufferC1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = c2429aR1.E0().f25472b;
        long jG0 = c2429aR1.G0();
        try {
            io.ktor.utils.io.internal.c cVarC0 = c2429aR1.C0();
            if (cVarC0 != null) {
                AbstractC2441b.b(cVarC0.c());
                throw new C0920i();
            }
            int iO = jVar.o((int) Math.min(kVar.o1(), byteBufferC1.remaining()));
            if (iO > 0) {
                byteBufferC1.limit(byteBufferC1.position() + iO);
                p205x6.i.c(kVar, byteBufferC1);
                c2429aR1.t0(byteBufferC1, jVar, iO);
            }
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            return iO;
        } catch (Throwable th) {
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            throw th;
        }
    }

    @Override // io.ktor.utils.io.g
    public boolean J() {
        return E0() == io.ktor.utils.io.internal.h.f.f25483c && C0() != null;
    }

    public final io.ktor.utils.io.internal.h.c J0() {
        io.ktor.utils.io.internal.h.c cVar = (io.ktor.utils.io.internal.h.c) this.f25033c.b0();
        cVar.f25472b.j();
        return cVar;
    }

    public final Object J1(int i8, G6.d dVar) throws Throwable {
        Throwable thC;
        if (!h2(i8)) {
            io.ktor.utils.io.internal.c cVarC0 = C0();
            if (cVarC0 == null || (thC = cVarC0.c()) == null) {
                return C6.G.f1419a;
            }
            AbstractC2441b.b(thC);
            throw new C0920i();
        }
        this.writeSuspensionSize = i8;
        if (this.attachedJob != null) {
            Object objInvoke = this.f25041k.invoke(dVar);
            if (objInvoke == H6.c.f()) {
                I6.h.c(dVar);
            }
            return objInvoke == H6.c.f() ? objInvoke : C6.G.f1419a;
        }
        io.ktor.utils.io.internal.b bVar = this.f25040j;
        this.f25041k.invoke(bVar);
        Object objE = bVar.e(H6.b.c(dVar));
        if (objE == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objE == H6.c.f() ? objE : C6.G.f1419a;
    }

    @Override // io.ktor.utils.io.j
    public Object K(p205x6.k kVar, G6.d dVar) {
        return b2(this, kVar, dVar);
    }

    @Override // io.ktor.utils.io.j
    public boolean L() {
        return this.f25032b;
    }

    public final void L0(ByteBuffer byteBuffer, int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(W6.n.g(i9 + i8, byteBuffer.capacity() - this.f25034d));
        byteBuffer.position(i8);
    }

    public final int L1(ByteBuffer byteBuffer) throws Throwable {
        C2429a c2429aR1;
        int iO;
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar == null || (c2429aR1 = r1(this, eVar)) == null) {
            c2429aR1 = this;
        }
        ByteBuffer byteBufferC1 = c2429aR1.C1();
        int i8 = 0;
        if (byteBufferC1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = c2429aR1.E0().f25472b;
        long jG0 = c2429aR1.G0();
        try {
            io.ktor.utils.io.internal.c cVarC0 = c2429aR1.C0();
            if (cVarC0 != null) {
                AbstractC2441b.b(cVarC0.c());
                throw new C0920i();
            }
            int iLimit = byteBuffer.limit();
            while (true) {
                int iPosition = iLimit - byteBuffer.position();
                if (iPosition == 0 || (iO = jVar.o(Math.min(iPosition, byteBufferC1.remaining()))) == 0) {
                    break;
                }
                if (iO <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBuffer.limit(byteBuffer.position() + iO);
                byteBufferC1.put(byteBuffer);
                i8 += iO;
                c2429aR1.L0(byteBufferC1, c2429aR1.v0(byteBufferC1, c2429aR1.f25036f + i8), jVar._availableForWrite$internal);
            }
            byteBuffer.limit(iLimit);
            c2429aR1.t0(byteBufferC1, jVar, i8);
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            return i8;
        } catch (Throwable th) {
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            throw th;
        }
    }

    public final void M0(ByteBuffer buffer, int i8) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        L0(buffer, this.f25036f, i8);
    }

    public final int M1(p205x6.a aVar) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar == null || (c2429aR1 = r1(this, eVar)) == null) {
            c2429aR1 = this;
        }
        ByteBuffer byteBufferC1 = c2429aR1.C1();
        int i8 = 0;
        if (byteBufferC1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = c2429aR1.E0().f25472b;
        long jG0 = c2429aR1.G0();
        try {
            io.ktor.utils.io.internal.c cVarC0 = c2429aR1.C0();
            if (cVarC0 != null) {
                AbstractC2441b.b(cVarC0.c());
                throw new C0920i();
            }
            while (true) {
                int iO = jVar.o(Math.min(aVar.k() - aVar.i(), byteBufferC1.remaining()));
                if (iO == 0) {
                    break;
                }
                p205x6.g.c(aVar, byteBufferC1, iO);
                i8 += iO;
                c2429aR1.L0(byteBufferC1, c2429aR1.v0(byteBufferC1, c2429aR1.f25036f + i8), jVar._availableForWrite$internal);
            }
            c2429aR1.t0(byteBufferC1, jVar, i8);
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            return i8;
        } catch (Throwable th) {
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            throw th;
        }
    }

    public Object N0(int i8, Q6.k kVar, G6.d dVar) {
        return O0(this, i8, kVar, dVar);
    }

    public final int N1(byte[] bArr, int i8, int i9) throws Throwable {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar == null || (c2429aR1 = r1(this, eVar)) == null) {
            c2429aR1 = this;
        }
        ByteBuffer byteBufferC1 = c2429aR1.C1();
        int i10 = 0;
        if (byteBufferC1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = c2429aR1.E0().f25472b;
        long jG0 = c2429aR1.G0();
        try {
            io.ktor.utils.io.internal.c cVarC0 = c2429aR1.C0();
            if (cVarC0 != null) {
                AbstractC2441b.b(cVarC0.c());
                throw new C0920i();
            }
            while (true) {
                int iO = jVar.o(Math.min(i9 - i10, byteBufferC1.remaining()));
                if (iO == 0) {
                    c2429aR1.t0(byteBufferC1, jVar, i10);
                    if (jVar.h() || c2429aR1.L()) {
                        c2429aR1.flush();
                    }
                    if (c2429aR1 != this) {
                        A1(G0() + (c2429aR1.G0() - jG0));
                    }
                    c2429aR1.t1();
                    c2429aR1.H1();
                    return i10;
                }
                if (iO <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferC1.put(bArr, i8 + i10, iO);
                i10 += iO;
                c2429aR1.L0(byteBufferC1, c2429aR1.v0(byteBufferC1, c2429aR1.f25036f + i10), jVar._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (jVar.h() || c2429aR1.L()) {
                c2429aR1.flush();
            }
            if (c2429aR1 != this) {
                A1(G0() + (c2429aR1.G0() - jG0));
            }
            c2429aR1.t1();
            c2429aR1.H1();
            throw th;
        }
    }

    public int O1(int i8, Q6.k block) throws Throwable {
        C2429a c2429aR1;
        int i9;
        int i10;
        kotlin.jvm.internal.t.g(block, "block");
        if (i8 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i8 > 4088) {
            throw new IllegalArgumentException(("Min(" + i8 + ") shouldn't be greater than 4088").toString());
        }
        io.ktor.utils.io.internal.e eVar = this.joining;
        if (eVar == null || (c2429aR1 = r1(this, eVar)) == null) {
            c2429aR1 = this;
        }
        ByteBuffer byteBufferC1 = c2429aR1.C1();
        int iPosition = 0;
        if (byteBufferC1 == null) {
            i10 = 0;
        } else {
            io.ktor.utils.io.internal.j jVar = c2429aR1.E0().f25472b;
            long jG0 = c2429aR1.G0();
            try {
                io.ktor.utils.io.internal.c cVarC0 = c2429aR1.C0();
                if (cVarC0 != null) {
                    AbstractC2441b.b(cVarC0.c());
                    throw new C0920i();
                }
                int iN = jVar.n(i8);
                if (iN <= 0) {
                    i9 = 0;
                } else {
                    c2429aR1.L0(byteBufferC1, c2429aR1.f25036f, iN);
                    int iPosition2 = byteBufferC1.position();
                    int iLimit = byteBufferC1.limit();
                    block.invoke(byteBufferC1);
                    if (iLimit != byteBufferC1.limit()) {
                        throw new IllegalStateException("Buffer limit modified");
                    }
                    iPosition = byteBufferC1.position() - iPosition2;
                    if (iPosition < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                    }
                    if (iPosition < 0) {
                        throw new IllegalStateException();
                    }
                    c2429aR1.t0(byteBufferC1, jVar, iPosition);
                    if (iPosition < iN) {
                        jVar.a(iN - iPosition);
                    }
                    i9 = 1;
                }
                if (jVar.h() || c2429aR1.L()) {
                    c2429aR1.flush();
                }
                if (c2429aR1 != this) {
                    A1(G0() + (c2429aR1.G0() - jG0));
                }
                c2429aR1.t1();
                c2429aR1.H1();
                int i11 = iPosition;
                iPosition = i9;
                i10 = i11;
            } catch (Throwable th) {
                if (jVar.h() || c2429aR1.L()) {
                    c2429aR1.flush();
                }
                if (c2429aR1 != this) {
                    A1(G0() + (c2429aR1.G0() - jG0));
                }
                c2429aR1.t1();
                c2429aR1.H1();
                throw th;
            }
        }
        if (iPosition == 0) {
            return -1;
        }
        return i10;
    }

    public final int P0(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBufferB1 = B1();
        int i8 = 0;
        if (byteBufferB1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = E0().f25472b;
        try {
            if (jVar._availableForRead$internal != 0) {
                int iCapacity = byteBufferB1.capacity() - this.f25034d;
                while (true) {
                    int iRemaining = byteBuffer.remaining();
                    if (iRemaining == 0) {
                        break;
                    }
                    int i9 = this.f25035e;
                    int iL = jVar.l(Math.min(iCapacity - i9, iRemaining));
                    if (iL == 0) {
                        break;
                    }
                    byteBufferB1.limit(i9 + iL);
                    byteBufferB1.position(i9);
                    byteBuffer.put(byteBufferB1);
                    s0(byteBufferB1, jVar, iL);
                    i8 += iL;
                }
            }
            return i8;
        } finally {
            s1();
            H1();
        }
    }

    public Object P1(byte[] bArr, int i8, int i9, G6.d dVar) {
        return Q1(this, bArr, i8, i9, dVar);
    }

    public final int Q0(p205x6.a aVar, int i8, int i9) throws Throwable {
        int iL;
        do {
            ByteBuffer byteBufferB1 = B1();
            boolean z8 = false;
            if (byteBufferB1 == null) {
                iL = 0;
            } else {
                io.ktor.utils.io.internal.j jVar = E0().f25472b;
                try {
                    if (jVar._availableForRead$internal == 0) {
                        s1();
                        H1();
                        iL = 0;
                    } else {
                        int iG = aVar.g() - aVar.k();
                        iL = jVar.l(Math.min(byteBufferB1.remaining(), Math.min(iG, i9)));
                        if (iL > 0) {
                            if (iG < byteBufferB1.remaining()) {
                                byteBufferB1.limit(byteBufferB1.position() + iG);
                            }
                            p205x6.e.a(aVar, byteBufferB1);
                            s0(byteBufferB1, jVar, iL);
                            z8 = true;
                        }
                        s1();
                        H1();
                    }
                } catch (Throwable th) {
                    s1();
                    H1();
                    throw th;
                }
            }
            i8 += iL;
            i9 -= iL;
            if (!z8 || aVar.g() <= aVar.k()) {
                break;
            }
        } while (E0().f25472b._availableForRead$internal > 0);
        return i8;
    }

    public final int R0(byte[] bArr, int i8, int i9) throws Throwable {
        ByteBuffer byteBufferB1 = B1();
        int i10 = 0;
        if (byteBufferB1 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.j jVar = E0().f25472b;
        try {
            if (jVar._availableForRead$internal != 0) {
                int iCapacity = byteBufferB1.capacity() - this.f25034d;
                while (true) {
                    int i11 = i9 - i10;
                    if (i11 == 0) {
                        break;
                    }
                    int i12 = this.f25035e;
                    int iL = jVar.l(Math.min(iCapacity - i12, i11));
                    if (iL == 0) {
                        break;
                    }
                    byteBufferB1.limit(i12 + iL);
                    byteBufferB1.position(i12);
                    byteBufferB1.get(bArr, i8 + i10, iL);
                    s0(byteBufferB1, jVar, iL);
                    i10 += iL;
                }
            }
            return i10;
        } finally {
            s1();
            H1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(ByteBuffer byteBuffer, G6.d dVar) throws Throwable {
        C2439k c2439k;
        C2429a c2429a;
        if (dVar instanceof C2439k) {
            c2439k = (C2439k) dVar;
            int i8 = c2439k.f25176e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2439k.f25176e = i8 - Integer.MIN_VALUE;
            } else {
                c2439k = new C2439k(dVar);
            }
        } else {
            c2439k = new C2439k(dVar);
        }
        Object objH1 = c2439k.f25174c;
        Object objF = H6.c.f();
        int i9 = c2439k.f25176e;
        if (i9 == 0) {
            C6.r.b(objH1);
            c2439k.f25172a = this;
            c2439k.f25173b = byteBuffer;
            c2439k.f25176e = 1;
            objH1 = h1(1, c2439k);
            if (objH1 != objF) {
                c2429a = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objH1);
            return objH1;
        }
        byteBuffer = (ByteBuffer) c2439k.f25173b;
        c2429a = (C2429a) c2439k.f25172a;
        C6.r.b(objH1);
        if (!((Boolean) objH1).booleanValue()) {
            return I6.b.d(-1);
        }
        c2439k.f25172a = null;
        c2439k.f25173b = null;
        c2439k.f25176e = 2;
        Object objT = c2429a.t(byteBuffer, c2439k);
        return objT == objF ? objF : objT;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[PHI: r2 r6
      0x0057: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:20:0x0054, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r6v3 java.nio.ByteBuffer) = (r6v1 java.nio.ByteBuffer), (r6v7 java.nio.ByteBuffer) binds: [B:20:0x0054, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:22:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W1(java.nio.ByteBuffer r6, G6.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C2429a.C
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$C r0 = (io.ktor.utils.io.C2429a.C) r0
            int r1 = r0.f25060e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25060e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$C r0 = new io.ktor.utils.io.a$C
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25058c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25060e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            C6.r.b(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f25057b
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r2 = r0.f25056a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r7)
            goto L57
        L40:
            C6.r.b(r7)
            r2 = r5
        L44:
            boolean r7 = r6.hasRemaining()
            if (r7 == 0) goto L76
            r0.f25056a = r2
            r0.f25057b = r6
            r0.f25060e = r4
            java.lang.Object r7 = r2.J1(r4, r0)
            if (r7 != r1) goto L57
            goto L6e
        L57:
            io.ktor.utils.io.internal.e r7 = r2.joining
            if (r7 == 0) goto L72
            io.ktor.utils.io.a r7 = r2.r1(r2, r7)
            if (r7 == 0) goto L72
            r2 = 0
            r0.f25056a = r2
            r0.f25057b = r2
            r0.f25060e = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            C6.G r6 = C6.G.f1419a
            return r6
        L72:
            r2.L1(r6)
            goto L44
        L76:
            C6.G r6 = C6.G.f1419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.W1(java.nio.ByteBuffer, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(p213y6.a aVar, G6.d dVar) throws Throwable {
        C2440l c2440l;
        C2429a c2429a;
        if (dVar instanceof C2440l) {
            c2440l = (C2440l) dVar;
            int i8 = c2440l.f25181e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2440l.f25181e = i8 - Integer.MIN_VALUE;
            } else {
                c2440l = new C2440l(dVar);
            }
        } else {
            c2440l = new C2440l(dVar);
        }
        Object objH1 = c2440l.f25179c;
        Object objF = H6.c.f();
        int i9 = c2440l.f25181e;
        if (i9 == 0) {
            C6.r.b(objH1);
            c2440l.f25177a = this;
            c2440l.f25178b = aVar;
            c2440l.f25181e = 1;
            objH1 = h1(1, c2440l);
            if (objH1 != objF) {
                c2429a = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objH1);
            return objH1;
        }
        aVar = (p213y6.a) c2440l.f25178b;
        c2429a = (C2429a) c2440l.f25177a;
        C6.r.b(objH1);
        if (!((Boolean) objH1).booleanValue()) {
            return I6.b.d(-1);
        }
        c2440l.f25177a = null;
        c2440l.f25178b = null;
        c2440l.f25181e = 2;
        Object objH = c2429a.H(aVar, c2440l);
        return objH == objF ? objF : objH;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[PHI: r2 r7
      0x005b: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:20:0x0058, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r7v3 x6.a) = (r7v1 x6.a), (r7v7 x6.a) binds: [B:20:0x0058, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X1(p205x6.a r7, G6.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.C2429a.D
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$D r0 = (io.ktor.utils.io.C2429a.D) r0
            int r1 = r0.f25065e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25065e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$D r0 = new io.ktor.utils.io.a$D
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25063c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25065e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            C6.r.b(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f25062b
            x6.a r7 = (p205x6.a) r7
            java.lang.Object r2 = r0.f25061a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r8)
            goto L5b
        L40:
            C6.r.b(r8)
            r2 = r6
        L44:
            int r8 = r7.k()
            int r5 = r7.i()
            if (r8 <= r5) goto L7a
            r0.f25061a = r2
            r0.f25062b = r7
            r0.f25065e = r4
            java.lang.Object r8 = r2.J1(r4, r0)
            if (r8 != r1) goto L5b
            goto L72
        L5b:
            io.ktor.utils.io.internal.e r8 = r2.joining
            if (r8 == 0) goto L76
            io.ktor.utils.io.a r8 = r2.r1(r2, r8)
            if (r8 == 0) goto L76
            r2 = 0
            r0.f25061a = r2
            r0.f25062b = r2
            r0.f25065e = r3
            java.lang.Object r7 = r8.C(r7, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            C6.G r7 = C6.G.f1419a
            return r7
        L76:
            r2.M1(r7)
            goto L44
        L7a:
            C6.G r7 = C6.G.f1419a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.X1(x6.a, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y0(byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        C2438j c2438j;
        C2429a c2429a;
        if (dVar instanceof C2438j) {
            c2438j = (C2438j) dVar;
            int i10 = c2438j.f25171g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2438j.f25171g = i10 - Integer.MIN_VALUE;
            } else {
                c2438j = new C2438j(dVar);
            }
        } else {
            c2438j = new C2438j(dVar);
        }
        Object objH1 = c2438j.f25169e;
        Object objF = H6.c.f();
        int i11 = c2438j.f25171g;
        if (i11 == 0) {
            C6.r.b(objH1);
            c2438j.f25165a = this;
            c2438j.f25166b = bArr;
            c2438j.f25167c = i8;
            c2438j.f25168d = i9;
            c2438j.f25171g = 1;
            objH1 = h1(1, c2438j);
            if (objH1 != objF) {
                c2429a = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objH1);
            return objH1;
        }
        i9 = c2438j.f25168d;
        i8 = c2438j.f25167c;
        bArr = (byte[]) c2438j.f25166b;
        c2429a = (C2429a) c2438j.f25165a;
        C6.r.b(objH1);
        if (!((Boolean) objH1).booleanValue()) {
            return I6.b.d(-1);
        }
        c2438j.f25165a = null;
        c2438j.f25166b = null;
        c2438j.f25171g = 2;
        Object objG = c2429a.G(bArr, i8, i9, c2438j);
        return objG == objF ? objF : objG;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Y1(byte[] r6, int r7, int r8, G6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.C2429a.E
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$E r0 = (io.ktor.utils.io.C2429a.E) r0
            int r1 = r0.f25072g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25072g = r1
            goto L18
        L13:
            io.ktor.utils.io.a$E r0 = new io.ktor.utils.io.a$E
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25070e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25072g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.f25069d
            int r7 = r0.f25068c
            java.lang.Object r8 = r0.f25067b
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f25066a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r9)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            C6.r.b(r9)
            r2 = r5
        L41:
            if (r8 <= 0) goto L63
            r0.f25066a = r2
            r0.f25067b = r6
            r0.f25068c = r7
            r0.f25069d = r8
            r0.f25072g = r3
            java.lang.Object r9 = r2.P1(r6, r7, r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L63:
            C6.G r6 = C6.G.f1419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.Y1(byte[], int, int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r2.N0(r6, r7, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z0(int i8, Q6.k kVar, G6.d dVar) throws Throwable {
        m mVar;
        C2429a c2429a;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i9 = mVar.f25187f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                mVar.f25187f = i9 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object objH1 = mVar.f25185d;
        Object objF = H6.c.f();
        int i10 = mVar.f25187f;
        if (i10 != 0) {
            if (i10 == 1) {
                i8 = mVar.f25184c;
                kVar = (Q6.k) mVar.f25183b;
                c2429a = (C2429a) mVar.f25182a;
                C6.r.b(objH1);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(objH1);
            }
            return C6.G.f1419a;
        }
        C6.r.b(objH1);
        int iD = W6.n.d(i8, 1);
        mVar.f25182a = this;
        mVar.f25183b = kVar;
        mVar.f25184c = i8;
        mVar.f25187f = 1;
        objH1 = h1(iD, mVar);
        if (objH1 != objF) {
            c2429a = this;
        }
        return objF;
        if (!((Boolean) objH1).booleanValue()) {
            if (i8 <= 0) {
                return C6.G.f1419a;
            }
            throw new EOFException("Got EOF but at least " + i8 + " bytes were expected");
        }
        mVar.f25182a = null;
        mVar.f25183b = null;
        mVar.f25187f = 2;
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.j
    public Throwable a() {
        io.ktor.utils.io.internal.c cVarC0 = C0();
        if (cVarC0 != null) {
            return cVarC0.b();
        }
        return null;
    }

    public final Object a1(ByteBuffer byteBuffer, G6.d dVar) throws Throwable {
        int iP0 = P0(byteBuffer);
        return !byteBuffer.hasRemaining() ? I6.b.d(iP0) : b1(byteBuffer, iP0, dVar);
    }

    @Override // io.ktor.utils.io.j
    public Object b(ByteBuffer byteBuffer, G6.d dVar) {
        return S1(this, byteBuffer, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:21:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b1(java.nio.ByteBuffer r6, int r7, G6.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.C2429a.o
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$o r0 = (io.ktor.utils.io.C2429a.o) r0
            int r1 = r0.f25198f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25198f = r1
            goto L18
        L13:
            io.ktor.utils.io.a$o r0 = new io.ktor.utils.io.a$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25196d
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25198f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r6 = r0.f25195c
            java.lang.Object r7 = r0.f25194b
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r2 = r0.f25193a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r8)
            goto L57
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            C6.r.b(r8)
            r2 = r5
        L3f:
            boolean r8 = r6.hasRemaining()
            if (r8 == 0) goto L88
            r0.f25193a = r2
            r0.f25194b = r6
            r0.f25195c = r7
            r0.f25198f = r3
            java.lang.Object r8 = r2.h1(r3, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r4 = r7
            r7 = r6
            r6 = r4
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L68
            int r8 = r2.P0(r7)
            int r6 = r6 + r8
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3f
        L68:
            d7.p r6 = new d7.p
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unexpected EOF: expected "
            r8.append(r0)
            int r7 = r7.remaining()
            r8.append(r7)
            java.lang.String r7 = " more bytes"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L88:
            java.lang.Integer r6 = I6.b.d(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.b1(java.nio.ByteBuffer, int, G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.j
    public Object c(long j8, G6.d dVar) {
        return a2(this, j8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[Catch: all -> 0x0030, PHI: r2 r6
      0x005d: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:26:0x005a, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r6v4 x6.k) = (r6v2 x6.k), (r6v7 x6.k) binds: [B:26:0x005a, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:28:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c2(p205x6.k r6, G6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C2429a.H
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$H r0 = (io.ktor.utils.io.C2429a.H) r0
            int r1 = r0.f25093e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25093e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$H r0 = new io.ktor.utils.io.a$H
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25091c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25093e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f25089a
            x6.k r6 = (p205x6.k) r6
            C6.r.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L75
        L30:
            r7 = move-exception
            goto L85
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f25090b
            x6.k r6 = (p205x6.k) r6
            java.lang.Object r2 = r0.f25089a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L5d
        L46:
            C6.r.b(r7)
            r2 = r5
        L4a:
            boolean r7 = r6.T0()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L7f
            r0.f25089a = r2     // Catch: java.lang.Throwable -> L30
            r0.f25090b = r6     // Catch: java.lang.Throwable -> L30
            r0.f25093e = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r2.e2(r4, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L5d
            goto L74
        L5d:
            io.ktor.utils.io.internal.e r7 = r2.joining     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L7b
            io.ktor.utils.io.a r7 = r2.r1(r2, r7)     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L7b
            r0.f25089a = r6     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f25090b = r2     // Catch: java.lang.Throwable -> L30
            r0.f25093e = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r7.K(r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            C6.G r7 = C6.G.f1419a     // Catch: java.lang.Throwable -> L30
            r6.a2()
            return r7
        L7b:
            r2.I1(r6)     // Catch: java.lang.Throwable -> L30
            goto L4a
        L7f:
            r6.a2()
            C6.G r6 = C6.G.f1419a
            return r6
        L85:
            r6.a2()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.c2(x6.k, G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.j
    public boolean d(Throwable th) {
        io.ktor.utils.io.internal.e eVar;
        if (C0() != null) {
            return false;
        }
        io.ktor.utils.io.internal.c cVarA = th == null ? io.ktor.utils.io.internal.c.f25455b.a() : new io.ktor.utils.io.internal.c(th);
        E0().f25472b.e();
        if (!F1.b.a(f25029n, this, null, cVarA)) {
            return false;
        }
        E0().f25472b.e();
        if (E0().f25472b.g() || th != null) {
            H1();
        }
        u1(th);
        if (E0() == io.ktor.utils.io.internal.h.f.f25483c && (eVar = this.joining) != null) {
            A0(eVar);
        }
        if (th == null) {
            this.f25040j.d(new io.ktor.utils.io.p("Byte channel was closed"));
            this.f25039i.c(Boolean.valueOf(E0().f25472b.e()));
            return true;
        }
        InterfaceC1815v0 interfaceC1815v0 = this.attachedJob;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f25039i.d(th);
        this.f25040j.d(th);
        return true;
    }

    @Override // io.ktor.utils.io.g
    public Object e(Q6.o oVar, G6.d dVar) {
        return I0(this, oVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:28:0x006d, B:20:0x004a, B:22:0x0053, B:25:0x005c, B:29:0x007b), top: B:37:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:28:0x006d, B:20:0x004a, B:22:0x0053, B:25:0x005c, B:29:0x007b), top: B:37:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:37:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object e1(int r6, p205x6.j r7, java.nio.ByteBuffer r8, G6.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.C2429a.s
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$s r0 = (io.ktor.utils.io.C2429a.s) r0
            int r1 = r0.f25223g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25223g = r1
            goto L18
        L13:
            io.ktor.utils.io.a$s r0 = new io.ktor.utils.io.a$s
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25221e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25223g
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r6 = r0.f25220d
            java.lang.Object r7 = r0.f25219c
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.f25218b
            x6.j r8 = (p205x6.j) r8
            java.lang.Object r2 = r0.f25217a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r9)     // Catch: java.lang.Throwable -> L3a
            r4 = r8
            r8 = r7
            r7 = r4
            goto L6d
        L3a:
            r6 = move-exception
            goto L87
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            C6.r.b(r9)
            r2 = r5
        L48:
            if (r6 <= 0) goto L7b
            r8.clear()     // Catch: java.lang.Throwable -> L57
            int r9 = r8.remaining()     // Catch: java.lang.Throwable -> L57
            if (r9 <= r6) goto L5c
            r8.limit(r6)     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r6 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
            goto L87
        L5c:
            r0.f25217a = r2     // Catch: java.lang.Throwable -> L57
            r0.f25218b = r7     // Catch: java.lang.Throwable -> L57
            r0.f25219c = r8     // Catch: java.lang.Throwable -> L57
            r0.f25220d = r6     // Catch: java.lang.Throwable -> L57
            r0.f25223g = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r9 = r2.a1(r8, r0)     // Catch: java.lang.Throwable -> L57
            if (r9 != r1) goto L6d
            return r1
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L57
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L57
            r8.flip()     // Catch: java.lang.Throwable -> L57
            p205x6.t.a(r7, r8)     // Catch: java.lang.Throwable -> L57
            int r6 = r6 - r9
            goto L48
        L7b:
            x6.k r6 = r7.M1()     // Catch: java.lang.Throwable -> L57
            z6.g r7 = io.ktor.utils.io.internal.f.d()
            r7.H1(r8)
            return r6
        L87:
            r8.T0()     // Catch: java.lang.Throwable -> L8b
            throw r6     // Catch: java.lang.Throwable -> L8b
        L8b:
            r6 = move-exception
            z6.g r8 = io.ktor.utils.io.internal.f.d()
            r8.H1(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.e1(int, x6.j, java.nio.ByteBuffer, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e2(int i8, G6.d dVar) throws Throwable {
        K k8;
        C2429a c2429a;
        Throwable thC;
        if (dVar instanceof K) {
            k8 = (K) dVar;
            int i9 = k8.f25113e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                k8.f25113e = i9 - Integer.MIN_VALUE;
            } else {
                k8 = new K(dVar);
            }
        } else {
            k8 = new K(dVar);
        }
        Object obj = k8.f25111c;
        Object objF = H6.c.f();
        int i10 = k8.f25113e;
        if (i10 == 0) {
            C6.r.b(obj);
            c2429a = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = k8.f25110b;
            c2429a = (C2429a) k8.f25109a;
            C6.r.b(obj);
        }
        while (c2429a.h2(i8)) {
            k8.f25109a = c2429a;
            k8.f25110b = i8;
            k8.f25113e = 1;
            C1797m c1797m = new C1797m(H6.b.c(k8), 1);
            c1797m.z();
            c2429a.g2(i8, c1797m);
            Object objS = c1797m.s();
            if (objS == H6.c.f()) {
                I6.h.c(k8);
            }
            if (objS == objF) {
                return objF;
            }
        }
        io.ktor.utils.io.internal.c cVarC0 = c2429a.C0();
        if (cVarC0 == null || (thC = cVarC0.c()) == null) {
            return C6.G.f1419a;
        }
        AbstractC2441b.b(thC);
        throw new C0920i();
    }

    @Override // io.ktor.utils.io.g
    public boolean f(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel has been cancelled");
        }
        return d(th);
    }

    @Override // io.ktor.utils.io.j
    public void flush() {
        B0(1);
    }

    @Override // io.ktor.utils.io.j
    public Object g(ByteBuffer byteBuffer, int i8, int i9, G6.d dVar) {
        return V1(this, byteBuffer, i8, i9, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[PHI: r2 r4 r5 r6 r13
      0x00af: PHI (r2v3 kotlin.jvm.internal.I) = (r2v4 kotlin.jvm.internal.I), (r2v4 kotlin.jvm.internal.I), (r2v6 kotlin.jvm.internal.I) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r4v3 x6.j) = (r4v14 x6.j), (r4v15 x6.j), (r4v16 x6.j) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r5v1 io.ktor.utils.io.a) = (r5v2 io.ktor.utils.io.a), (r5v2 io.ktor.utils.io.a), (r5v4 io.ktor.utils.io.a) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r6v1 y6.a) = (r6v2 y6.a), (r6v2 y6.a), (r6v5 y6.a) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r13v2 x6.s) = (r13v15 x6.s), (r13v16 x6.s), (r13v17 x6.s) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:36:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object g1(long r12, G6.d r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.g1(long, G6.d):java.lang.Object");
    }

    public final void g2(int i8, InterfaceC1795l interfaceC1795l) throws Throwable {
        Throwable thC;
        while (true) {
            io.ktor.utils.io.internal.c cVarC0 = C0();
            if (cVarC0 != null && (thC = cVarC0.c()) != null) {
                AbstractC2441b.b(thC);
                throw new C0920i();
            }
            if (!h2(i8)) {
                C6.q.a aVar = C6.q.f1441b;
                interfaceC1795l.resumeWith(C6.q.b(C6.G.f1419a));
                break;
            }
            while (true) {
                if (H0() != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (!h2(i8)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25031p;
                if (F1.b.a(atomicReferenceFieldUpdater, this, null, interfaceC1795l)) {
                    if (!h2(i8) && F1.b.a(atomicReferenceFieldUpdater, this, interfaceC1795l, null)) {
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        B0(i8);
        if (D1()) {
            v1();
        }
    }

    @Override // io.ktor.utils.io.u
    public ByteBuffer h(int i8, int i9) {
        io.ktor.utils.io.internal.h hVarE0 = E0();
        int i10 = hVarE0.f25472b._availableForRead$internal;
        int i11 = this.f25035e;
        if (i10 < i9 + i8) {
            return null;
        }
        if (hVarE0.a() || !((hVarE0 instanceof io.ktor.utils.io.internal.h.d) || (hVarE0 instanceof io.ktor.utils.io.internal.h.e))) {
            if (B1() == null) {
                return null;
            }
            return h(i8, i9);
        }
        ByteBuffer byteBufferB = hVarE0.b();
        L0(byteBufferB, v0(byteBufferB, i11 + i8), i10 - i8);
        if (byteBufferB.remaining() >= i9) {
            return byteBufferB;
        }
        return null;
    }

    public final Object h1(int i8, G6.d dVar) throws Throwable {
        if (E0().f25472b._availableForRead$internal >= i8) {
            return I6.b.a(true);
        }
        io.ktor.utils.io.internal.c cVarC0 = C0();
        if (cVarC0 == null) {
            return i8 == 1 ? i1(1, dVar) : j1(i8, dVar);
        }
        Throwable thB = cVarC0.b();
        if (thB != null) {
            AbstractC2441b.b(thB);
            throw new C0920i();
        }
        io.ktor.utils.io.internal.j jVar = E0().f25472b;
        boolean z8 = jVar.e() && jVar._availableForRead$internal >= i8;
        if (D0() == null) {
            return I6.b.a(z8);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    public final boolean h2(int i8) {
        io.ktor.utils.io.internal.e eVar = this.joining;
        io.ktor.utils.io.internal.h hVarE0 = E0();
        if (C0() != null) {
            return false;
        }
        if (eVar == null) {
            return hVarE0.f25472b._availableForWrite$internal < i8 && hVarE0 != io.ktor.utils.io.internal.h.a.f25473c;
        }
        return (hVarE0 == io.ktor.utils.io.internal.h.f.f25483c || (hVarE0 instanceof io.ktor.utils.io.internal.h.g) || (hVarE0 instanceof io.ktor.utils.io.internal.h.e)) ? false : true;
    }

    @Override // io.ktor.utils.io.j
    public Object i(short s8, G6.d dVar) {
        return d2(this, s8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i1(int i8, G6.d dVar) throws Throwable {
        u uVar;
        C2429a c2429a;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i9 = uVar.f25236e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                uVar.f25236e = i9 - Integer.MIN_VALUE;
            } else {
                uVar = new u(dVar);
            }
        } else {
            uVar = new u(dVar);
        }
        Object obj = uVar.f25234c;
        Object objF = H6.c.f();
        int i10 = uVar.f25236e;
        if (i10 == 0) {
            C6.r.b(obj);
            io.ktor.utils.io.internal.h hVarE0 = E0();
            if (hVarE0.f25472b._availableForRead$internal >= i8 || !(this.joining == null || H0() == null || (hVarE0 != io.ktor.utils.io.internal.h.a.f25473c && !(hVarE0 instanceof io.ktor.utils.io.internal.h.b)))) {
                return I6.b.a(true);
            }
            try {
                uVar.f25232a = this;
                uVar.f25233b = i8;
                uVar.f25236e = 1;
                io.ktor.utils.io.internal.b bVar = this.f25039i;
                E1(i8, bVar);
                Object objE = bVar.e(H6.b.c(uVar));
                if (objE == H6.c.f()) {
                    I6.h.c(uVar);
                }
                return objE == objF ? objF : objE;
            } catch (Throwable th) {
                th = th;
                c2429a = this;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2429a = (C2429a) uVar.f25232a;
            try {
                C6.r.b(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        c2429a.y1(null);
        throw th;
    }

    @Override // io.ktor.utils.io.g
    public int j() {
        return E0().f25472b._availableForRead$internal;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:39:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object j1(int r6, G6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C2429a.v
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$v r0 = (io.ktor.utils.io.C2429a.v) r0
            int r1 = r0.f25241e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25241e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$v r0 = new io.ktor.utils.io.a$v
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25239c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25241e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f25238b
            java.lang.Object r2 = r0.f25237a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r7)
            goto L95
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            C6.r.b(r7)
            r2 = r5
        L3c:
            io.ktor.utils.io.internal.h r7 = r2.E0()
            io.ktor.utils.io.internal.j r7 = r7.f25472b
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L4b
            java.lang.Boolean r6 = I6.b.a(r4)
            return r6
        L4b:
            io.ktor.utils.io.internal.c r7 = r2.C0()
            if (r7 == 0) goto L88
            java.lang.Throwable r0 = r7.b()
            if (r0 != 0) goto L7b
            io.ktor.utils.io.internal.h r7 = r2.E0()
            io.ktor.utils.io.internal.j r7 = r7.f25472b
            boolean r0 = r7.e()
            if (r0 == 0) goto L68
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L68
            r3 = r4
        L68:
            G6.d r6 = r2.D0()
            if (r6 != 0) goto L73
            java.lang.Boolean r6 = I6.b.a(r3)
            return r6
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L7b:
            java.lang.Throwable r6 = r7.b()
            io.ktor.utils.io.AbstractC2441b.a(r6)
            C6.i r6 = new C6.i
            r6.<init>()
            throw r6
        L88:
            r0.f25237a = r2
            r0.f25238b = r6
            r0.f25241e = r4
            java.lang.Object r7 = r2.i1(r6, r0)
            if (r7 != r1) goto L95
            return r1
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3c
            java.lang.Boolean r6 = I6.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.j1(int, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {all -> 0x006e, blocks: (B:19:0x0052, B:22:0x005d, B:25:0x0064, B:27:0x006a, B:30:0x0070), top: B:49:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:19:0x0052, B:22:0x005d, B:25:0x0064, B:27:0x006a, B:30:0x0070), top: B:49:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0099 -> B:42:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x009b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.utils.io.g
    public final java.lang.Object k(G6.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.C2429a.r
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.a$r r0 = (io.ktor.utils.io.C2429a.r) r0
            int r1 = r0.f25216e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25216e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$r r0 = new io.ktor.utils.io.a$r
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f25214c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25216e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.f25213b
            java.lang.Object r4 = r0.f25212a
            io.ktor.utils.io.a r4 = (io.ktor.utils.io.C2429a) r4
            C6.r.b(r11)
            goto L9c
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            C6.r.b(r11)
            r11 = 8
            r4 = r10
            r2 = r11
        L3f:
            kotlin.jvm.internal.J r11 = new kotlin.jvm.internal.J
            r11.<init>()
            java.nio.ByteBuffer r5 = r4.B1()
            r6 = 0
            if (r5 != 0) goto L4c
            goto L7f
        L4c:
            io.ktor.utils.io.internal.h r7 = r4.E0()
            io.ktor.utils.io.internal.j r7 = r7.f25472b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L5d
        L56:
            r4.s1()
            r4.H1()
            goto L7f
        L5d:
            boolean r8 = r7.m(r2)     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L64
            goto L56
        L64:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6e
            if (r6 >= r2) goto L70
            r4.x1(r5, r2)     // Catch: java.lang.Throwable -> L6e
            goto L70
        L6e:
            r11 = move-exception
            goto Lc1
        L70:
            long r8 = r5.getLong()     // Catch: java.lang.Throwable -> L6e
            java.lang.Long r6 = I6.b.e(r8)     // Catch: java.lang.Throwable -> L6e
            r11.f28779a = r6     // Catch: java.lang.Throwable -> L6e
            r4.s0(r5, r7, r2)     // Catch: java.lang.Throwable -> L6e
            r6 = r3
            goto L56
        L7f:
            if (r6 == 0) goto L8f
            java.lang.Object r11 = r11.f28779a
            if (r11 != 0) goto L8c
            java.lang.String r11 = "result"
            kotlin.jvm.internal.t.t(r11)
            r11 = 0
            return r11
        L8c:
            java.lang.Number r11 = (java.lang.Number) r11
            return r11
        L8f:
            r0.f25212a = r4
            r0.f25213b = r2
            r0.f25216e = r3
            java.lang.Object r11 = r4.h1(r2, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto La5
            goto L3f
        La5:
            d7.p r11 = new d7.p
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EOF while "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " bytes expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        Lc1:
            r4.s1()
            r4.H1()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.k(G6.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.j
    public Object l(byte[] bArr, int i8, int i9, G6.d dVar) {
        return U1(this, bArr, i8, i9, dVar);
    }

    @Override // io.ktor.utils.io.g
    public boolean m() {
        return C0() != null;
    }

    public final Object m1(Appendable appendable, int i8, G6.d dVar) throws Throwable {
        if (E0() != io.ktor.utils.io.internal.h.f.f25483c) {
            return n1(appendable, i8, dVar);
        }
        Throwable thA = a();
        if (thA == null) {
            return I6.b.a(false);
        }
        throw thA;
    }

    @Override // io.ktor.utils.io.v
    public final Object n(int i8, G6.d dVar) throws Throwable {
        if (i8 < 0) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be negative: " + i8).toString());
        }
        if (i8 > 4088) {
            throw new IllegalArgumentException(("atLeast parameter shouldn't be larger than max buffer size of 4088: " + i8).toString());
        }
        if (E0().f25472b._availableForRead$internal >= i8) {
            if (E0().a() || (E0() instanceof io.ktor.utils.io.internal.h.g)) {
                B1();
            }
            return I6.b.a(true);
        }
        if (E0().a() || (E0() instanceof io.ktor.utils.io.internal.h.g)) {
            return p0(i8, dVar);
        }
        return i8 == 1 ? i1(1, dVar) : h1(i8, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:86|35|36|84|37|38|88|39|(9:42|20|43|23|(7:25|34|49|(1:51)|52|(1:54)|63)(6:34|49|(1:51)|52|(1:54)|63)|64|(4:66|68|70|73)(3:68|70|73)|74|75)) */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        r20 = r9;
        r21 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        r9 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012e, code lost:
    
        r0 = r16;
        r12 = r17;
        r8 = r18;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        r12 = r7;
        r7 = r8;
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        if (r1.N0(1, r5, r4) == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0080, code lost:
    
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011c -> B:20:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n1(Appendable appendable, int i8, G6.d dVar) {
        x xVar;
        C2429a c2429a;
        kotlin.jvm.internal.H h8;
        Appendable appendable2;
        int i9;
        char[] cArr;
        kotlin.jvm.internal.J j8;
        kotlin.jvm.internal.H h9;
        kotlin.jvm.internal.F f8;
        kotlin.jvm.internal.F f9;
        kotlin.jvm.internal.H h10;
        x xVar2;
        C2429a c2429a2;
        kotlin.jvm.internal.F f10;
        kotlin.jvm.internal.F f11;
        kotlin.jvm.internal.F f12;
        kotlin.jvm.internal.F f13;
        kotlin.jvm.internal.H h11;
        kotlin.jvm.internal.F f14;
        kotlin.jvm.internal.F f15;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i10 = xVar.f25258m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f25258m = i10 - Integer.MIN_VALUE;
                c2429a = this;
            } else {
                c2429a = this;
                xVar = c2429a.new x(dVar);
            }
        } else {
            c2429a = this;
            xVar = c2429a.new x(dVar);
        }
        Object obj = xVar.f25256k;
        Object objF = H6.c.f();
        int i11 = xVar.f25258m;
        boolean z8 = true;
        if (i11 == 0) {
            C6.r.b(obj);
            h8 = new kotlin.jvm.internal.H();
            kotlin.jvm.internal.H h12 = new kotlin.jvm.internal.H();
            h12.f28777a = 1;
            kotlin.jvm.internal.F f16 = new kotlin.jvm.internal.F();
            kotlin.jvm.internal.F f17 = new kotlin.jvm.internal.F();
            appendable2 = appendable;
            i9 = i8;
            cArr = new char[8192];
            j8 = new kotlin.jvm.internal.J();
            h9 = new kotlin.jvm.internal.H();
            f8 = f17;
            f9 = f16;
            h10 = h12;
            xVar2 = xVar;
            c2429a2 = c2429a;
            if (c2429a2.J()) {
                f10 = f9;
                f11 = f8;
                if (j8.f28779a != null) {
                    p221z6.g gVarD = io.ktor.utils.io.internal.f.d();
                    Object obj2 = j8.f28779a;
                    kotlin.jvm.internal.t.d(obj2);
                    gVarD.H1(obj2);
                }
                if (c2429a2.J()) {
                }
                f12 = f11;
                f13 = f10;
            } else {
                f10 = f9;
                f11 = f8;
                if (j8.f28779a != null) {
                    p221z6.g gVarD2 = io.ktor.utils.io.internal.f.d();
                    Object obj3 = j8.f28779a;
                    kotlin.jvm.internal.t.d(obj3);
                    gVarD2.H1(obj3);
                }
                if (c2429a2.J()) {
                }
                f12 = f11;
                f13 = f10;
            }
            if (c2429a2.J()) {
            }
            return I6.b.a(z8);
        }
        if (i11 == 1) {
            int i12 = xVar.f25255j;
            kotlin.jvm.internal.H h13 = (kotlin.jvm.internal.H) xVar.f25254i;
            kotlin.jvm.internal.J j9 = (kotlin.jvm.internal.J) xVar.f25253h;
            char[] cArr2 = (char[]) xVar.f25252g;
            kotlin.jvm.internal.F f18 = (kotlin.jvm.internal.F) xVar.f25251f;
            kotlin.jvm.internal.F f19 = (kotlin.jvm.internal.F) xVar.f25250e;
            kotlin.jvm.internal.H h14 = (kotlin.jvm.internal.H) xVar.f25249d;
            kotlin.jvm.internal.H h15 = (kotlin.jvm.internal.H) xVar.f25248c;
            Appendable appendable3 = (Appendable) xVar.f25247b;
            C2429a c2429a3 = (C2429a) xVar.f25246a;
            try {
                C6.r.b(obj);
                h9 = h13;
                h8 = h15;
                appendable2 = appendable3;
                i9 = i12;
                j8 = j9;
                f9 = f19;
                xVar2 = xVar;
                c2429a2 = c2429a3;
                cArr = cArr2;
                f8 = f18;
            } catch (EOFException unused) {
                h9 = h13;
                h10 = h14;
                h8 = h15;
                appendable2 = appendable3;
                i9 = i12;
                j8 = j9;
                f9 = f19;
                xVar2 = xVar;
                c2429a2 = c2429a3;
                cArr = cArr2;
                f8 = f18;
                if (c2429a2.J()) {
                    f10 = f9;
                    f11 = f8;
                    if (j8.f28779a != null) {
                        p221z6.g gVarD3 = io.ktor.utils.io.internal.f.d();
                        Object obj4 = j8.f28779a;
                        kotlin.jvm.internal.t.d(obj4);
                        gVarD3.H1(obj4);
                    }
                    if (c2429a2.J()) {
                    }
                    f12 = f11;
                    f13 = f10;
                } else {
                    f10 = f9;
                    f11 = f8;
                    if (j8.f28779a != null) {
                        p221z6.g gVarD4 = io.ktor.utils.io.internal.f.d();
                        Object obj5 = j8.f28779a;
                        kotlin.jvm.internal.t.d(obj5);
                        gVarD4.H1(obj5);
                    }
                    if (c2429a2.J()) {
                    }
                    f12 = f11;
                    f13 = f10;
                }
                z8 = c2429a2.J() ? false : false;
                return I6.b.a(z8);
            }
            h10 = h14;
            if (c2429a2.J() || f8.f28775a || f9.f28775a || (i9 != Integer.MAX_VALUE && h8.f28777a > i9)) {
                f10 = f9;
                f11 = f8;
                if (j8.f28779a != null) {
                    p221z6.g gVarD5 = io.ktor.utils.io.internal.f.d();
                    Object obj6 = j8.f28779a;
                    kotlin.jvm.internal.t.d(obj6);
                    gVarD5.H1(obj6);
                }
                if (c2429a2.J() && f10.f28775a && !f11.f28775a) {
                    try {
                        z zVar = new z(f11);
                        xVar2.f25246a = c2429a2;
                        xVar2.f25247b = h8;
                        xVar2.f25248c = f10;
                        xVar2.f25249d = f11;
                        xVar2.f25250e = null;
                        xVar2.f25251f = null;
                        xVar2.f25252g = null;
                        xVar2.f25253h = null;
                        xVar2.f25254i = null;
                        xVar2.f25258m = 2;
                    } catch (EOFException unused2) {
                    }
                } else {
                    f12 = f11;
                    f13 = f10;
                }
                if ((c2429a2.J() || h8.f28777a <= 0) && !f12.f28775a && !f13.f28775a) {
                }
                return I6.b.a(z8);
            }
            int i13 = h10.f28777a;
            kotlin.jvm.internal.H h16 = h8;
            kotlin.jvm.internal.H h17 = h10;
            kotlin.jvm.internal.F f20 = f9;
            kotlin.jvm.internal.F f21 = f8;
            y yVar = new y(j8, i9, cArr, h16, h17, f21, f20, appendable2, h9);
            h8 = h16;
            h14 = h17;
            Appendable appendable4 = appendable2;
            kotlin.jvm.internal.H h18 = h9;
            xVar2.f25246a = c2429a2;
            xVar2.f25247b = appendable4;
            xVar2.f25248c = h8;
            xVar2.f25249d = h14;
            xVar2.f25250e = f20;
            xVar2.f25251f = f21;
            xVar2.f25252g = cArr;
            xVar2.f25253h = j8;
            xVar2.f25254i = h18;
            xVar2.f25255j = i9;
            xVar2.f25258m = 1;
            if (c2429a2.N0(i13, yVar, xVar2) != objF) {
                appendable2 = appendable4;
                h9 = h18;
                f8 = f21;
                f9 = f20;
                h10 = h14;
                if (c2429a2.J()) {
                    f10 = f9;
                    f11 = f8;
                    if (j8.f28779a != null) {
                        p221z6.g gVarD6 = io.ktor.utils.io.internal.f.d();
                        Object obj7 = j8.f28779a;
                        kotlin.jvm.internal.t.d(obj7);
                        gVarD6.H1(obj7);
                    }
                    if (c2429a2.J()) {
                    }
                    f12 = f11;
                    f13 = f10;
                } else {
                    f10 = f9;
                    f11 = f8;
                    if (j8.f28779a != null) {
                        p221z6.g gVarD7 = io.ktor.utils.io.internal.f.d();
                        Object obj8 = j8.f28779a;
                        kotlin.jvm.internal.t.d(obj8);
                        gVarD7.H1(obj8);
                    }
                    if (c2429a2.J()) {
                    }
                    f12 = f11;
                    f13 = f10;
                }
                if (c2429a2.J()) {
                }
                return I6.b.a(z8);
            }
            return objF;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f15 = (kotlin.jvm.internal.F) xVar.f25249d;
        f14 = (kotlin.jvm.internal.F) xVar.f25248c;
        h11 = (kotlin.jvm.internal.H) xVar.f25247b;
        c2429a2 = (C2429a) xVar.f25246a;
        try {
            C6.r.b(obj);
        } catch (EOFException unused3) {
        }
        f12 = f15;
        f13 = f14;
        h8 = h11;
        if (c2429a2.J()) {
        }
        return I6.b.a(z8);
        h11 = h8;
        f14 = f10;
        f15 = f11;
        f12 = f15;
        f13 = f14;
        h8 = h11;
        if (c2429a2.J()) {
        }
        return I6.b.a(z8);
    }

    @Override // io.ktor.utils.io.g
    public Object o(G6.d dVar) {
        return q0(this, dVar);
    }

    public final void o1(io.ktor.utils.io.internal.h.c cVar) {
        this.f25033c.H1(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0050, B:22:0x005b, B:25:0x0062, B:27:0x0068, B:30:0x006e), top: B:49:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x0050, B:22:0x005b, B:25:0x0062, B:27:0x0068, B:30:0x006e), top: B:49:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0097 -> B:42:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0099
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.utils.io.g
    public final java.lang.Object p(G6.d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C2429a.n
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$n r0 = (io.ktor.utils.io.C2429a.n) r0
            int r1 = r0.f25192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25192e = r1
            goto L18
        L13:
            io.ktor.utils.io.a$n r0 = new io.ktor.utils.io.a$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25190c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25192e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.f25189b
            java.lang.Object r4 = r0.f25188a
            io.ktor.utils.io.a r4 = (io.ktor.utils.io.C2429a) r4
            C6.r.b(r10)
            goto L9a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            C6.r.b(r10)
            r4 = r9
            r2 = r3
        L3d:
            kotlin.jvm.internal.J r10 = new kotlin.jvm.internal.J
            r10.<init>()
            java.nio.ByteBuffer r5 = r4.B1()
            r6 = 0
            if (r5 != 0) goto L4a
            goto L7d
        L4a:
            io.ktor.utils.io.internal.h r7 = r4.E0()
            io.ktor.utils.io.internal.j r7 = r7.f25472b
            int r8 = r7._availableForRead$internal     // Catch: java.lang.Throwable -> L6c
            if (r8 != 0) goto L5b
        L54:
            r4.s1()
            r4.H1()
            goto L7d
        L5b:
            boolean r8 = r7.m(r2)     // Catch: java.lang.Throwable -> L6c
            if (r8 != 0) goto L62
            goto L54
        L62:
            int r6 = r5.remaining()     // Catch: java.lang.Throwable -> L6c
            if (r6 >= r2) goto L6e
            r4.x1(r5, r2)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r10 = move-exception
            goto Lbf
        L6e:
            byte r6 = r5.get()     // Catch: java.lang.Throwable -> L6c
            java.lang.Byte r6 = I6.b.b(r6)     // Catch: java.lang.Throwable -> L6c
            r10.f28779a = r6     // Catch: java.lang.Throwable -> L6c
            r4.s0(r5, r7, r2)     // Catch: java.lang.Throwable -> L6c
            r6 = r3
            goto L54
        L7d:
            if (r6 == 0) goto L8d
            java.lang.Object r10 = r10.f28779a
            if (r10 != 0) goto L8a
            java.lang.String r10 = "result"
            kotlin.jvm.internal.t.t(r10)
            r10 = 0
            return r10
        L8a:
            java.lang.Number r10 = (java.lang.Number) r10
            return r10
        L8d:
            r0.f25188a = r4
            r0.f25189b = r2
            r0.f25192e = r3
            java.lang.Object r10 = r4.h1(r2, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La3
            goto L3d
        La3:
            d7.p r10 = new d7.p
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EOF while "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " bytes expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lbf:
            r4.s1()
            r4.H1()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.p(G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p0(int i8, G6.d dVar) throws Throwable {
        C2431c c2431c;
        C2429a c2429a;
        if (dVar instanceof C2431c) {
            c2431c = (C2431c) dVar;
            int i9 = c2431c.f25119d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2431c.f25119d = i9 - Integer.MIN_VALUE;
            } else {
                c2431c = new C2431c(dVar);
            }
        } else {
            c2431c = new C2431c(dVar);
        }
        Object objH1 = c2431c.f25117b;
        Object objF = H6.c.f();
        int i10 = c2431c.f25119d;
        if (i10 == 0) {
            C6.r.b(objH1);
            c2431c.f25116a = this;
            c2431c.f25119d = 1;
            objH1 = h1(i8, c2431c);
            if (objH1 == objF) {
                return objF;
            }
            c2429a = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2429a = (C2429a) c2431c.f25116a;
            C6.r.b(objH1);
        }
        boolean zBooleanValue = ((Boolean) objH1).booleanValue();
        if (zBooleanValue && c2429a.E0().a()) {
            c2429a.B1();
        }
        return I6.b.a(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p205x6.k p1(long j8) {
        p205x6.j jVar = new p205x6.j(null, 1, 0 == true ? 1 : 0);
        try {
            p213y6.a aVarD = p213y6.g.d(jVar, 1, null);
            while (true) {
                try {
                    if (aVarD.g() - aVarD.k() > j8) {
                        aVarD.u((int) j8);
                    }
                    j8 -= (long) S0(this, aVarD, 0, 0, 6, null);
                    if (j8 <= 0 || J()) {
                        break;
                    }
                    aVarD = p213y6.g.d(jVar, 1, aVarD);
                } catch (Throwable th) {
                    jVar.c();
                    throw th;
                }
            }
            jVar.c();
            return jVar.M1();
        } catch (Throwable th2) {
            jVar.T0();
            throw th2;
        }
    }

    @Override // io.ktor.utils.io.g
    public Object q(int i8, G6.d dVar) {
        return d1(this, i8, dVar);
    }

    public final C2429a q1() {
        C2429a c2429aR1;
        io.ktor.utils.io.internal.e eVar = this.joining;
        return (eVar == null || (c2429aR1 = r1(this, eVar)) == null) ? this : c2429aR1;
    }

    @Override // io.ktor.utils.io.g
    public Object r(Appendable appendable, int i8, G6.d dVar) {
        return m1(appendable, i8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r8.v(r6, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(int i8, Q6.k kVar, G6.d dVar) {
        C2432d c2432d;
        C2429a c2429a;
        if (dVar instanceof C2432d) {
            c2432d = (C2432d) dVar;
            int i9 = c2432d.f25125f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2432d.f25125f = i9 - Integer.MIN_VALUE;
            } else {
                c2432d = new C2432d(dVar);
            }
        } else {
            c2432d = new C2432d(dVar);
        }
        Object obj = c2432d.f25123d;
        Object objF = H6.c.f();
        int i10 = c2432d.f25125f;
        if (i10 == 0) {
            C6.r.b(obj);
            c2432d.f25120a = this;
            c2432d.f25121b = kVar;
            c2432d.f25122c = i8;
            c2432d.f25125f = 1;
            if (e2(i8, c2432d) != objF) {
                c2429a = this;
            }
            return objF;
        }
        if (i10 == 1) {
            i8 = c2432d.f25122c;
            kVar = (Q6.k) c2432d.f25121b;
            c2429a = (C2429a) c2432d.f25120a;
            C6.r.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
        }
        return C6.G.f1419a;
        io.ktor.utils.io.internal.e eVar = c2429a.joining;
        if (eVar == null || (r8 = c2429a.r1(c2429a, eVar)) == null) {
            return C6.G.f1419a;
        }
        c2432d.f25120a = null;
        c2432d.f25121b = null;
        c2432d.f25125f = 2;
    }

    public final C2429a r1(C2429a c2429a, io.ktor.utils.io.internal.e eVar) {
        while (c2429a.E0() == io.ktor.utils.io.internal.h.f.f25483c) {
            c2429a = eVar.c();
            eVar = c2429a.joining;
            if (eVar == null) {
                return c2429a;
            }
        }
        return null;
    }

    @Override // io.ktor.utils.io.g
    public Object s(ByteBuffer byteBuffer, long j8, long j9, long j10, long j11, G6.d dVar) {
        return K0(this, byteBuffer, j8, j9, j10, j11, dVar);
    }

    public final void s0(ByteBuffer byteBuffer, io.ktor.utils.io.internal.j jVar, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f25035e = v0(byteBuffer, this.f25035e + i8);
        jVar.a(i8);
        z1(F0() + ((long) i8));
        w1();
    }

    public final void s1() {
        Object obj;
        io.ktor.utils.io.internal.h hVarF;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.h hVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.h hVar2 = (io.ktor.utils.io.internal.h) obj;
            io.ktor.utils.io.internal.h.b bVar = (io.ktor.utils.io.internal.h.b) hVar;
            if (bVar != null) {
                bVar.f25472b.j();
                w1();
                hVar = null;
            }
            hVarF = hVar2.f();
            if ((hVarF instanceof io.ktor.utils.io.internal.h.b) && E0() == hVar2 && hVarF.f25472b.k()) {
                hVarF = io.ktor.utils.io.internal.h.a.f25473c;
                hVar = hVarF;
            }
            atomicReferenceFieldUpdater = f25028m;
        } while (!F1.b.a(atomicReferenceFieldUpdater, this, obj, hVarF));
        io.ktor.utils.io.internal.h.a aVar = io.ktor.utils.io.internal.h.a.f25473c;
        if (hVarF == aVar) {
            io.ktor.utils.io.internal.h.b bVar2 = (io.ktor.utils.io.internal.h.b) hVar;
            if (bVar2 != null) {
                o1(bVar2.h());
            }
            w1();
            return;
        }
        if ((hVarF instanceof io.ktor.utils.io.internal.h.b) && hVarF.f25472b.g() && hVarF.f25472b.k() && F1.b.a(atomicReferenceFieldUpdater, this, hVarF, aVar)) {
            hVarF.f25472b.j();
            o1(((io.ktor.utils.io.internal.h.b) hVarF).h());
            w1();
        }
    }

    @Override // io.ktor.utils.io.g
    public Object t(ByteBuffer byteBuffer, G6.d dVar) {
        return T0(this, byteBuffer, dVar);
    }

    public final void t0(ByteBuffer byteBuffer, io.ktor.utils.io.internal.j jVar, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f25036f = v0(byteBuffer, this.f25036f + i8);
        jVar.c(i8);
        A1(G0() + ((long) i8));
    }

    public final void t1() {
        Object obj;
        io.ktor.utils.io.internal.h hVarG;
        io.ktor.utils.io.internal.h.b bVar;
        io.ktor.utils.io.internal.h hVar = null;
        do {
            obj = this._state;
            hVarG = ((io.ktor.utils.io.internal.h) obj).g();
            if ((hVarG instanceof io.ktor.utils.io.internal.h.b) && hVarG.f25472b.g()) {
                hVarG = io.ktor.utils.io.internal.h.a.f25473c;
                hVar = hVarG;
            }
        } while (!F1.b.a(f25028m, this, obj, hVarG));
        if (hVarG != io.ktor.utils.io.internal.h.a.f25473c || (bVar = (io.ktor.utils.io.internal.h.b) hVar) == null) {
            return;
        }
        o1(bVar.h());
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + E0() + ')';
    }

    @Override // io.ktor.utils.io.t
    public io.ktor.utils.io.A u() {
        return this.f25037g;
    }

    public final void u0(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - this.f25034d;
        int iPosition = byteBuffer.position();
        for (int i8 = iCapacity; i8 < iPosition; i8++) {
            byteBuffer.put(i8 - iCapacity, byteBuffer.get(i8));
        }
    }

    public final void u1(Throwable th) {
        G6.d dVar = (G6.d) f25030o.getAndSet(this, null);
        if (dVar != null) {
            if (th != null) {
                C6.q.a aVar = C6.q.f1441b;
                dVar.resumeWith(C6.q.b(C6.r.a(th)));
            } else {
                dVar.resumeWith(C6.q.b(Boolean.valueOf(E0().f25472b._availableForRead$internal > 0)));
            }
        }
        G6.d dVar2 = (G6.d) f25031p.getAndSet(this, null);
        if (dVar2 != null) {
            C6.q.a aVar2 = C6.q.f1441b;
            if (th == null) {
                th = new io.ktor.utils.io.p("Byte channel was closed");
            }
            dVar2.resumeWith(C6.q.b(C6.r.a(th)));
        }
    }

    @Override // io.ktor.utils.io.j
    public Object v(int i8, Q6.k kVar, G6.d dVar) {
        return K1(this, i8, kVar, dVar);
    }

    public final int v0(ByteBuffer byteBuffer, int i8) {
        return i8 >= byteBuffer.capacity() - this.f25034d ? i8 - (byteBuffer.capacity() - this.f25034d) : i8;
    }

    public final void v1() {
        G6.d dVar = (G6.d) f25030o.getAndSet(this, null);
        if (dVar != null) {
            io.ktor.utils.io.internal.c cVarC0 = C0();
            Throwable thB = cVarC0 != null ? cVarC0.b() : null;
            if (thB != null) {
                C6.q.a aVar = C6.q.f1441b;
                dVar.resumeWith(C6.q.b(C6.r.a(thB)));
            } else {
                C6.q.a aVar2 = C6.q.f1441b;
                dVar.resumeWith(C6.q.b(Boolean.TRUE));
            }
        }
    }

    @Override // io.ktor.utils.io.u
    public void w(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        io.ktor.utils.io.internal.h hVarE0 = E0();
        if (hVarE0.f25472b.m(i8)) {
            if (i8 > 0) {
                s0(hVarE0.b(), hVarE0.f25472b, i8);
            }
        } else {
            throw new IllegalStateException("Unable to consume " + i8 + " bytes: not enough available bytes");
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x033a A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0340 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0349 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:159:0x036c  */
    /* JADX WARN: Code duplicated, block: B:160:0x036d  */
    /* JADX WARN: Code duplicated, block: B:163:0x037a  */
    /* JADX WARN: Code duplicated, block: B:164:0x037c A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0383  */
    /* JADX WARN: Code duplicated, block: B:168:0x0385 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:171:0x038c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0394  */
    /* JADX WARN: Code duplicated, block: B:177:0x039c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ff A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x032f -> B:49:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x039a -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x03bd -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object w0(io.ktor.utils.io.C2429a r27, long r28, io.ktor.utils.io.internal.e r30, G6.d r31) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.w0(io.ktor.utils.io.a, long, io.ktor.utils.io.internal.e, G6.d):java.lang.Object");
    }

    public final void w1() {
        G6.d dVarH0;
        io.ktor.utils.io.internal.c cVarC0;
        Object objA;
        do {
            dVarH0 = H0();
            if (dVarH0 == null) {
                return;
            }
            cVarC0 = C0();
            if (cVarC0 == null && this.joining != null) {
                io.ktor.utils.io.internal.h hVarE0 = E0();
                if (!(hVarE0 instanceof io.ktor.utils.io.internal.h.g) && !(hVarE0 instanceof io.ktor.utils.io.internal.h.e) && hVarE0 != io.ktor.utils.io.internal.h.f.f25483c) {
                    return;
                }
            }
        } while (!F1.b.a(f25031p, this, dVarH0, null));
        if (cVarC0 == null) {
            C6.q.a aVar = C6.q.f1441b;
            objA = C6.G.f1419a;
        } else {
            C6.q.a aVar2 = C6.q.f1441b;
            objA = C6.r.a(cVarC0.c());
        }
        dVarH0.resumeWith(C6.q.b(objA));
    }

    @Override // io.ktor.utils.io.g
    public final Object x(byte[] bArr, int i8, int i9, G6.d dVar) throws Throwable {
        int iR0 = R0(bArr, i8, i9);
        if (iR0 >= i9) {
            return C6.G.f1419a;
        }
        Object objC1 = c1(bArr, i8 + iR0, i9 - iR0, dVar);
        return objC1 == H6.c.f() ? objC1 : C6.G.f1419a;
    }

    public final io.ktor.utils.io.internal.h x0() {
        return E0();
    }

    public final void x1(ByteBuffer byteBuffer, int i8) {
        int iRemaining = byteBuffer.remaining();
        byteBuffer.limit(byteBuffer.position() + i8);
        int i9 = i8 - iRemaining;
        for (int i10 = 0; i10 < i9; i10++) {
            byteBuffer.put((byteBuffer.capacity() - 8) + i10, byteBuffer.get(i10));
        }
    }

    @Override // io.ktor.utils.io.j
    public Object y(int i8, G6.d dVar) {
        return Z1(this, i8, dVar);
    }

    public final void y1(G6.d dVar) {
        this._readOp = dVar;
    }

    @Override // io.ktor.utils.io.g
    public Object z(int i8, G6.d dVar) {
        return k1(this, i8, dVar);
    }

    public void z1(long j8) {
        this.totalBytesRead = j8;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[PHI: r2 r7 r8 r9
      0x005d: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:19:0x005a, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:19:0x005a, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:19:0x005a, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:19:0x005a, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.attributes.AttrNode.contains(AttrNode.java:98)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:60)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        */
    public final java.lang.Object f2(byte[] r7, int r8, int r9, G6.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.C2429a.J
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$J r0 = (io.ktor.utils.io.C2429a.J) r0
            int r1 = r0.f25108g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25108g = r1
            goto L18
        L13:
            io.ktor.utils.io.a$J r0 = new io.ktor.utils.io.a$J
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25106e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f25108g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            C6.r.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r8 = 0
            java.lang.String r8 = P2.Lsk.mHPawN.UsDb
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.f25105d
            int r8 = r0.f25104c
            java.lang.Object r9 = r0.f25103b
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.f25102a
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.C2429a) r2
            C6.r.b(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L5d
        L48:
            C6.r.b(r10)
            r2 = r6
        L4c:
            r0.f25102a = r2
            r0.f25103b = r7
            r0.f25104c = r8
            r0.f25105d = r9
            r0.f25108g = r4
            java.lang.Object r10 = r2.J1(r4, r0)
            if (r10 != r1) goto L5d
            goto L74
        L5d:
            io.ktor.utils.io.internal.e r10 = r2.joining
            if (r10 == 0) goto L76
            io.ktor.utils.io.a r10 = r2.r1(r2, r10)
            if (r10 == 0) goto L76
            r2 = 0
            r0.f25102a = r2
            r0.f25103b = r2
            r0.f25108g = r3
            java.lang.Object r7 = r10.f2(r7, r8, r9, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r7
        L76:
            int r10 = r2.N1(r7, r8, r9)
            if (r10 <= 0) goto L4c
            java.lang.Integer r7 = I6.b.d(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2429a.f2(byte[], int, int, G6.d):java.lang.Object");
    }

    public /* synthetic */ C2429a(boolean z8, p221z6.g gVar, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(z8, (i9 & 2) != 0 ? io.ktor.utils.io.internal.f.c() : gVar, (i9 & 4) != 0 ? 8 : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2429a(ByteBuffer content) {
        this(false, io.ktor.utils.io.internal.f.b(), 0);
        kotlin.jvm.internal.t.g(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        kotlin.jvm.internal.t.f(byteBufferSlice, "content.slice()");
        io.ktor.utils.io.internal.h.c cVar = new io.ktor.utils.io.internal.h.c(byteBufferSlice, 0);
        cVar.f25472b.i();
        this._state = cVar.e();
        t1();
        k.a(this);
        H1();
    }
}
