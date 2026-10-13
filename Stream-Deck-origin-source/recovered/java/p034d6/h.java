package p034d6;

import C6.q;
import C6.r;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1795l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19872d = AtomicIntegerFieldUpdater.newUpdater(h.class, "_interestedOps");
    private volatile /* synthetic */ int _interestedOps;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectableChannel f19873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f19875c;

    public h(SelectableChannel channel) {
        t.g(channel, "channel");
        this.f19873a = channel;
        this.f19874b = new AtomicBoolean(false);
        this.f19875c = new c();
        this._interestedOps = 0;
    }

    @Override // p034d6.g
    public int U0() {
        return this._interestedOps;
    }

    @Override // p034d6.g
    public c X() {
        return this.f19875c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19874b.compareAndSet(false, true)) {
            this._interestedOps = 0;
            c cVarX = X();
            for (f fVar : f.f19862b.a()) {
                InterfaceC1795l interfaceC1795lH = cVarX.h(fVar);
                if (interfaceC1795lH != null) {
                    q.a aVar = q.f1441b;
                    interfaceC1795lH.resumeWith(q.b(r.a(new b())));
                }
            }
        }
    }

    @Override // p017b7.InterfaceC1776b0
    public void d() {
        close();
    }

    @Override // p034d6.g
    public SelectableChannel e() {
        return this.f19873a;
    }

    @Override // p034d6.g
    public boolean isClosed() {
        return this.f19874b.get();
    }

    @Override // p034d6.g
    public void n0(f interest, boolean z8) {
        int i8;
        t.g(interest, "interest");
        int iD = interest.d();
        do {
            i8 = this._interestedOps;
        } while (!f19872d.compareAndSet(this, i8, z8 ? i8 | iD : (~iD) & i8));
    }
}
