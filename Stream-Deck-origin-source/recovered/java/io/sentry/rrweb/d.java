package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f27566c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public boolean a(d dVar, String str, W0 w8, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f27566c = (b) u.c((b) w8.m1(iLogger, new b.a()), "");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b implements InterfaceC2582w0 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2524m0 {
            @Override // io.sentry.InterfaceC2524m0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(W0 w8, ILogger iLogger) {
                return b.values()[w8.nextInt()];
            }
        }

        @Override // io.sentry.InterfaceC2582w0
        public void serialize(X0 x8, ILogger iLogger) {
            x8.a(ordinal());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public void a(d dVar, X0 x8, ILogger iLogger) {
            x8.k("source").g(iLogger, dVar.f27566c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f27566c = bVar;
    }
}
