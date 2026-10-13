package W5;

import C6.C0918g;
import C6.G;
import Q6.k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1776b0;
import p062g7.C2377p;
import p062g7.r;
import p133o6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11491a = new d();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends r implements InterfaceC1776b0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k f11492d;

        public a(k handler) {
            t.g(handler, "handler");
            this.f11492d = handler;
        }

        @Override // p017b7.InterfaceC1776b0
        public void d() {
            t();
        }

        public final k x() {
            return this.f11492d;
        }
    }

    public final void a(W5.a definition, Object obj) {
        G g8;
        t.g(definition, "definition");
        C2377p c2377p = (C2377p) this.f11491a.a(definition);
        Throwable th = null;
        if (c2377p != null) {
            Object objM = c2377p.m();
            t.e(objM, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th2 = null;
            for (r rVarN = (r) objM; !t.c(rVarN, c2377p); rVarN = rVarN.n()) {
                if (rVarN instanceof a) {
                    try {
                        k kVarX = ((a) rVarN).x();
                        t.e(kVarX, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        ((k) P.e(kVarX, 1)).invoke(obj);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C0918g.a(th2, th3);
                            g8 = G.f1419a;
                        } else {
                            g8 = null;
                        }
                        if (g8 == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }
}
