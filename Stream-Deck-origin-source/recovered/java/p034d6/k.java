package p034d6;

import C6.C0920i;
import C6.G;
import C6.q;
import C6.r;
import G6.d;
import H6.c;
import I6.h;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectorProvider f19876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19878c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends CancellationException {
        public a() {
            super("Closed selector");
        }
    }

    public k() {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        t.f(selectorProviderProvider, "provider()");
        this.f19876a = selectorProviderProvider;
    }

    public final void A(SelectionKey key) {
        InterfaceC1795l interfaceC1795lG;
        t.g(key, "key");
        try {
            int i8 = key.readyOps();
            int iInterestOps = key.interestOps();
            g gVarZ = z(key);
            if (gVarZ == null) {
                key.cancel();
                this.f19878c++;
                return;
            }
            c cVarX = gVarZ.X();
            int[] iArrB = f.f19862b.b();
            int length = iArrB.length;
            for (int i9 = 0; i9 < length; i9++) {
                if ((iArrB[i9] & i8) != 0 && (interfaceC1795lG = cVarX.g(i9)) != null) {
                    q.a aVar = q.f1441b;
                    interfaceC1795lG.resumeWith(q.b(G.f1419a));
                }
            }
            int i10 = (~i8) & iInterestOps;
            if (i10 != iInterestOps) {
                key.interestOps(i10);
            }
            if (i10 != 0) {
                this.f19877b++;
            }
        } catch (Throwable th) {
            key.cancel();
            this.f19878c++;
            g gVarZ2 = z(key);
            if (gVarZ2 != null) {
                j(gVarZ2, th);
                r0(key, null);
            }
        }
    }

    @Override // p034d6.i
    public final Object S(g gVar, f fVar, d dVar) throws IOException {
        int iU0 = gVar.U0();
        int iD = fVar.d();
        if (gVar.isClosed()) {
            l.c();
            throw new C0920i();
        }
        if ((iU0 & iD) == 0) {
            l.d(iU0, iD);
            throw new C0920i();
        }
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        c1797m.J(b.f19879a);
        gVar.X().f(fVar, c1797m);
        if (!c1797m.isCancelled()) {
            i0(gVar);
        }
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS == c.f() ? objS : G.f1419a;
    }

    public final void Y(Set selectedKeys, Set keys) {
        t.g(selectedKeys, "selectedKeys");
        t.g(keys, "keys");
        int size = selectedKeys.size();
        this.f19877b = keys.size() - size;
        this.f19878c = 0;
        if (size > 0) {
            Iterator it = selectedKeys.iterator();
            while (it.hasNext()) {
                A((SelectionKey) it.next());
                it.remove();
            }
        }
    }

    @Override // p034d6.i
    public final SelectorProvider Z() {
        return this.f19876a;
    }

    public final void b(Selector selector, g selectable) {
        t.g(selector, "selector");
        t.g(selectable, "selectable");
        try {
            SelectableChannel selectableChannelE = selectable.e();
            SelectionKey selectionKeyKeyFor = selectableChannelE.keyFor(selector);
            int iU0 = selectable.U0();
            if (selectionKeyKeyFor == null) {
                if (iU0 != 0) {
                    selectableChannelE.register(selector, iU0, selectable);
                }
            } else if (selectionKeyKeyFor.interestOps() != iU0) {
                selectionKeyKeyFor.interestOps(iU0);
            }
            if (iU0 != 0) {
                this.f19877b++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = selectable.e().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            j(selectable, th);
        }
    }

    public abstract void i0(g gVar);

    public final void j(g attachment, Throwable cause) {
        t.g(attachment, "attachment");
        t.g(cause, "cause");
        c cVarX = attachment.X();
        for (f fVar : f.f19862b.a()) {
            InterfaceC1795l interfaceC1795lH = cVarX.h(fVar);
            if (interfaceC1795lH != null) {
                q.a aVar = q.f1441b;
                interfaceC1795lH.resumeWith(q.b(r.a(cause)));
            }
        }
    }

    public final void j0(int i8) {
        this.f19878c = i8;
    }

    public final void r0(SelectionKey selectionKey, g gVar) {
        selectionKey.attach(gVar);
    }

    public final void t(Selector selector, Throwable th) {
        t.g(selector, "selector");
        if (th == null) {
            th = new a();
        }
        Set<SelectionKey> setKeys = selector.keys();
        t.f(setKeys, "selector.keys()");
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            g gVar = objAttachment instanceof g ? (g) objAttachment : null;
            if (gVar != null) {
                j(gVar, th);
            }
            selectionKey.cancel();
        }
    }

    public final int v() {
        return this.f19878c;
    }

    public final int y() {
        return this.f19877b;
    }

    public final g z(SelectionKey selectionKey) {
        Object objAttachment = selectionKey.attachment();
        if (objAttachment instanceof g) {
            return (g) objAttachment;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19879a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }

        public final void b(Throwable th) {
        }
    }
}
