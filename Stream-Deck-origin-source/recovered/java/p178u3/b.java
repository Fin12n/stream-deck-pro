package p178u3;

import M3.a;
import M3.m;
import M3.p;
import N3.r;
import com.elgato.streamdeck.vsd2.Values;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(O3.b bVar, p.b.a state) {
        t.g(bVar, "<this>");
        t.g(state, "state");
        if (state.b()) {
            c(bVar, state.a());
        } else {
            b(bVar, state.a());
        }
    }

    public static final void b(O3.b bVar, a reason) {
        t.g(bVar, "<this>");
        t.g(reason, "reason");
        if (reason.a() == null) {
            return;
        }
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36946F, new String[0]), bVar.c().a(p194w3.b.f36952H, Values.Versions.STREAM_DECK_VERSION) + " (" + reason + ")", "Connecting error", reason.a(), null, 16, null));
    }

    public static final void c(O3.b bVar, a reason) {
        t.g(bVar, "<this>");
        t.g(reason, "reason");
        if (reason.a() == null) {
            return;
        }
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36949G, new String[0]), reason.toString(), "Connection error", reason.a(), null, 16, null));
    }

    public static final void d(O3.b bVar, Throwable error, Function0 onDismiss) {
        t.g(bVar, "<this>");
        t.g(error, "error");
        t.g(onDismiss, "onDismiss");
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36943E, new String[0]), error instanceof m.C1037b ? bVar.c().a(c.d(((m.C1037b) error).a()), new String[0]) : bVar.c().a(p194w3.b.f36996X, new String[0]), "Discovery error", error, onDismiss));
    }

    public static final void e(O3.b bVar, Function0 function0) {
        t.g(bVar, "<this>");
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36992V, new String[0]), bVar.c().a(p194w3.b.f36961K, new String[0]), "Purchase error", null, function0, 8, null));
    }

    public static /* synthetic */ void f(O3.b bVar, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        e(bVar, function0);
    }

    public static final void g(O3.b bVar, N3.m.c error, Function0 onDismiss) {
        t.g(bVar, "<this>");
        t.g(error, "error");
        t.g(onDismiss, "onDismiss");
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36943E, new String[0]), bVar.c().a(c.a(error), new String[0]), "Virtual device error", null, onDismiss, 8, null));
    }

    public static final void h(O3.b bVar, r.b error) {
        t.g(bVar, "<this>");
        t.g(error, "error");
        bVar.d(new O3.a(bVar.c().a(p194w3.b.f36943E, new String[0]), bVar.c().a(c.c(error), new String[0]), "Virtual device error", error.a(), null, 16, null));
    }
}
