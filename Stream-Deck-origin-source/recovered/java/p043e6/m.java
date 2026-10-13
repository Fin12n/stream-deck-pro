package p043e6;

import C6.C0918g;
import C6.G;
import Q6.k;
import io.ktor.utils.io.B;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.j;
import io.ktor.utils.io.y;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.ByteChannel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.B0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p034d6.h;
import p034d6.i;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends h implements p043e6.b, p043e6.a, p043e6.c, J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SelectableChannel f20848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f20849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f20850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r.d f20851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f20852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f20853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f20854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1818x f20855l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(Throwable th) throws IllegalAccessException, InvocationTargetException {
            m.this.Y();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f20858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2442c interfaceC2442c) {
            super(0);
            this.f20858b = interfaceC2442c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final B invoke() {
            if (m.this.A0() != null) {
                m mVar = m.this;
                InterfaceC2442c interfaceC2442c = this.f20858b;
                ReadableByteChannel readableByteChannel = (ReadableByteChannel) mVar.e();
                m mVar2 = m.this;
                return e.d(mVar, interfaceC2442c, readableByteChannel, mVar2, mVar2.H0(), m.this.A0(), m.this.f20851h);
            }
            m mVar3 = m.this;
            InterfaceC2442c interfaceC2442c2 = this.f20858b;
            ReadableByteChannel readableByteChannel2 = (ReadableByteChannel) mVar3.e();
            m mVar4 = m.this;
            return e.c(mVar3, interfaceC2442c2, readableByteChannel2, mVar4, mVar4.H0(), m.this.f20851h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f20860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2442c interfaceC2442c) {
            super(0);
            this.f20860b = interfaceC2442c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            m mVar = m.this;
            InterfaceC2442c interfaceC2442c = this.f20860b;
            WritableByteChannel writableByteChannel = (WritableByteChannel) mVar.e();
            m mVar2 = m.this;
            return f.a(mVar, interfaceC2442c, writableByteChannel, mVar2, mVar2.H0(), m.this.f20851h);
        }
    }

    public /* synthetic */ m(SelectableChannel selectableChannel, i iVar, g gVar, r.d dVar, int i8, AbstractC2633k abstractC2633k) {
        this(selectableChannel, iVar, gVar, (i8 & 8) != 0 ? null : dVar);
    }

    public final InterfaceC1815v0 A(String str, InterfaceC2442c interfaceC2442c, AtomicReference atomicReference, Function0 function0) throws ClosedChannelException {
        if (this.f20852i.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            interfaceC2442c.d(closedChannelException);
            throw closedChannelException;
        }
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) function0.invoke();
        if (!X.i.a(atomicReference, null, interfaceC1815v0)) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " channel has already been set");
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
            throw illegalStateException;
        }
        if (!this.f20852i.get()) {
            interfaceC2442c.A(interfaceC1815v0);
            interfaceC1815v0.H0(new a());
            return interfaceC1815v0;
        }
        ClosedChannelException closedChannelException2 = new ClosedChannelException();
        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        interfaceC2442c.d(closedChannelException2);
        throw closedChannelException2;
    }

    public final g A0() {
        return this.f20850g;
    }

    public final i H0() {
        return this.f20849f;
    }

    public InterfaceC1818x O0() {
        return this.f20855l;
    }

    public final void Y() throws IllegalAccessException, InvocationTargetException {
        if (this.f20852i.get() && j0(this.f20853j) && j0(this.f20854k)) {
            Throwable thR0 = r0(this.f20853j);
            Throwable thR1 = r0(this.f20854k);
            Throwable thI0 = i0(i0(thR0, thR1), z());
            if (thI0 == null) {
                O0().i1();
            } else {
                O0().v(thI0);
            }
        }
    }

    @Override // p043e6.a
    public final B b(InterfaceC2442c channel) {
        t.g(channel, "channel");
        return (B) A("reading", channel, this.f20854k, new b(channel));
    }

    @Override // p034d6.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IllegalAccessException, InvocationTargetException {
        j jVarMo219e;
        if (this.f20852i.compareAndSet(false, true)) {
            y yVar = (y) this.f20853j.get();
            if (yVar != null && (jVarMo219e = yVar.mo219e()) != null) {
                io.ktor.utils.io.k.a(jVarMo219e);
            }
            B b8 = (B) this.f20854k.get();
            if (b8 != null) {
                InterfaceC1815v0.a.a(b8, null, 1, null);
            }
            Y();
        }
    }

    @Override // p034d6.h, p017b7.InterfaceC1776b0
    public void d() throws IllegalAccessException, InvocationTargetException {
        close();
    }

    @Override // p034d6.h, p034d6.g
    public SelectableChannel e() {
        return this.f20848e;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return O0();
    }

    public final Throwable i0(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null) {
            return th2;
        }
        if (th2 == null || th == th2) {
            return th;
        }
        C0918g.a(th, th2);
        return th;
    }

    public final boolean j0(AtomicReference atomicReference) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) atomicReference.get();
        return interfaceC1815v0 == null || interfaceC1815v0.y();
    }

    public final Throwable r0(AtomicReference atomicReference) {
        CancellationException cancellationExceptionR0;
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) atomicReference.get();
        if (interfaceC1815v0 != null) {
            if (!interfaceC1815v0.isCancelled()) {
                interfaceC1815v0 = null;
            }
            if (interfaceC1815v0 != null && (cancellationExceptionR0 = interfaceC1815v0.r0()) != null) {
                return cancellationExceptionR0.getCause();
            }
        }
        return null;
    }

    @Override // p043e6.c
    public final y t(InterfaceC2442c channel) {
        t.g(channel, "channel");
        return (y) A("writing", channel, this.f20853j, new c(channel));
    }

    public final Throwable z() {
        try {
            ((ByteChannel) e()).close();
            super.close();
            this.f20849f.t1(this);
            return null;
        } catch (Throwable th) {
            this.f20849f.t1(this);
            return th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SelectableChannel channel, i selector, g gVar, r.d dVar) {
        super(channel);
        t.g(channel, "channel");
        t.g(selector, "selector");
        this.f20848e = channel;
        this.f20849f = selector;
        this.f20850g = gVar;
        this.f20851h = dVar;
        this.f20852i = new AtomicBoolean();
        this.f20853j = new AtomicReference();
        this.f20854k = new AtomicReference();
        this.f20855l = B0.b(null, 1, null);
    }
}
