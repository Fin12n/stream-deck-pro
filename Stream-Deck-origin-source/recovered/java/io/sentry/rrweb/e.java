package io.sentry.rrweb;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends d implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f27567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f27569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f27570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f27573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27574k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(W0 w8, ILogger iLogger) {
            w8.x();
            e eVar = new e();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("data")) {
                    c(eVar, w8, iLogger);
                } else if (!aVar.a(eVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            eVar.t(map);
            w8.u();
            return eVar;
        }

        public final void c(e eVar, W0 w8, ILogger iLogger) {
            d.a aVar = new d.a();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "x":
                        eVar.f27569f = w8.nextFloat();
                        break;
                    case "y":
                        eVar.f27570g = w8.nextFloat();
                        break;
                    case "id":
                        eVar.f27568e = w8.nextInt();
                        break;
                    case "type":
                        eVar.f27567d = (b) w8.m1(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f27571h = w8.nextInt();
                        break;
                    case "pointerId":
                        eVar.f27572i = w8.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strF0, w8, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            w8.t0(iLogger, map, strF0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            eVar.p(map);
            w8.u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b implements InterfaceC2582w0 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

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

    public e() {
        super(d.b.MouseInteraction);
        this.f27571h = 2;
    }

    private void o(X0 x8, ILogger iLogger) {
        x8.x();
        new d.c().a(this, x8, iLogger);
        x8.k("type").g(iLogger, this.f27567d);
        x8.k("id").a(this.f27568e);
        x8.k("x").b(this.f27569f);
        x8.k("y").b(this.f27570g);
        x8.k("pointerType").a(this.f27571h);
        x8.k("pointerId").a(this.f27572i);
        Map map = this.f27574k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27574k.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void p(Map map) {
        this.f27574k = map;
    }

    public void q(int i8) {
        this.f27568e = i8;
    }

    public void r(b bVar) {
        this.f27567d = bVar;
    }

    public void s(int i8) {
        this.f27572i = i8;
    }

    public void t(Map map) {
        this.f27573j = map;
    }

    public void u(float f8) {
        this.f27569f = f8;
    }

    public void v(float f8) {
        this.f27570g = f8;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new io.sentry.rrweb.b.C0604b().a(this, x8, iLogger);
        x8.k(LYdqVGvOGMNr.hrTKMxz);
        o(x8, iLogger);
        Map map = this.f27573j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27573j.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
