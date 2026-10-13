package p005a4;

import X3.e;
import X3.f;
import android.content.Context;
import io.sentry.C2491e;
import io.sentry.C2557s2;
import io.sentry.H;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.M1;
import io.sentry.V;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.v0;
import io.sentry.protocol.F;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13393a;

    public g(Context context) {
        t.g(context, "context");
        this.f13393a = context;
    }

    public static final void h(e eVar, Throwable error, V scope) {
        f fVarB;
        Map mapA;
        Map mapC;
        t.g(error, "$error");
        t.g(scope, "scope");
        if (eVar != null && (mapC = eVar.c()) != null) {
            for (Map.Entry entry : mapC.entrySet()) {
                scope.d((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (eVar != null && (mapA = eVar.a()) != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                scope.a((String) entry2.getKey(), entry2.getValue().toString());
            }
        }
        if (eVar != null && (fVarB = eVar.b()) != null) {
            scope.l(h.a(fVarB));
        }
        M1.i(error);
    }

    public static final void i(b configuration, SentryAndroidOptions options) {
        t.g(configuration, "$configuration");
        t.g(options, "options");
        options.setDsn(configuration.b());
        options.setEnvironment(configuration.d());
        options.setDebug(configuration.c());
        options.setSampleRate(Double.valueOf(configuration.e()));
        options.setTracesSampleRate(Double.valueOf(0.0d));
        options.setAttachStacktrace(configuration.a());
        options.setEnableUserInteractionBreadcrumbs(true);
        options.setBeforeSend(new J2.c() { // from class: a4.f
            @Override // io.sentry.J2.c
            public final C2557s2 a(C2557s2 c2557s2, H h8) {
                return g.j(c2557s2, h8);
            }
        });
    }

    public static final C2557s2 j(C2557s2 event, H h8) {
        t.g(event, "event");
        t.g(h8, "<anonymous parameter 1>");
        return event;
    }

    @Override // p005a4.i
    public void a(final Throwable error, final e eVar) {
        t.g(error, "error");
        M1.I(new InterfaceC2549q1() { // from class: a4.e
            @Override // io.sentry.InterfaceC2549q1
            public final void a(V v8) {
                g.h(eVar, error, v8);
            }
        });
    }

    @Override // p005a4.i
    public void b(final b configuration) {
        t.g(configuration, "configuration");
        v0.g(this.f13393a, new M1.a() { // from class: a4.d
            @Override // io.sentry.M1.a
            public final void a(J2 j8) {
                g.i(configuration, (SentryAndroidOptions) j8);
            }
        });
    }

    @Override // p005a4.i
    public void c(String message, String category, f level, String str, Map map) {
        t.g(message, "message");
        t.g(category, "category");
        t.g(level, "level");
        C2491e c2491e = new C2491e();
        c2491e.B(message);
        c2491e.y(category);
        c2491e.A(h.a(level));
        if (str != null) {
            c2491e.C(str);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2491e.z((String) entry.getKey(), entry.getValue());
            }
        }
        M1.e(c2491e);
    }

    @Override // p005a4.i
    public void d(String id) {
        t.g(id, "id");
        F f8 = new F();
        f8.l(id);
        M1.F(f8);
    }
}
