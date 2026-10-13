package io.sentry.protocol;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f27445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f27446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f27447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f27448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27449f;

    public m() {
    }

    public void f(Map map) {
        this.f27449f = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27444a != null) {
            x8.k("cookies").c(this.f27444a);
        }
        if (this.f27445b != null) {
            x8.k("headers").g(iLogger, this.f27445b);
        }
        if (this.f27446c != null) {
            x8.k("status_code").g(iLogger, this.f27446c);
        }
        if (this.f27447d != null) {
            x8.k("body_size").g(iLogger, this.f27447d);
        }
        if (this.f27448e != null) {
            x8.k("data").g(iLogger, this.f27448e);
        }
        Map map = this.f27449f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27449f.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(W0 w8, ILogger iLogger) {
            w8.x();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -891699686:
                        if (strF0.equals("status_code")) {
                            b8 = 0;
                        }
                        break;
                    case 3076010:
                        if (strF0.equals("data")) {
                            b8 = 1;
                        }
                        break;
                    case 795307910:
                        if (strF0.equals("headers")) {
                            b8 = 2;
                        }
                        break;
                    case 952189583:
                        if (strF0.equals("cookies")) {
                            b8 = 3;
                        }
                        break;
                    case 1252988030:
                        if (strF0.equals(WaYxBuDSBD.KjkHJYTS)) {
                            b8 = 4;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        mVar.f27446c = w8.T();
                        break;
                    case 1:
                        mVar.f27448e = w8.y1();
                        break;
                    case 2:
                        Map map = (Map) w8.y1();
                        if (map != null) {
                            mVar.f27445b = AbstractC2571c.b(map);
                        }
                        break;
                    case 3:
                        mVar.f27444a = w8.k0();
                        break;
                    case 4:
                        mVar.f27447d = w8.a0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            mVar.f(concurrentHashMap);
            w8.u();
            return mVar;
        }
    }

    public m(m mVar) {
        this.f27444a = mVar.f27444a;
        this.f27445b = AbstractC2571c.b(mVar.f27445b);
        this.f27449f = AbstractC2571c.b(mVar.f27449f);
        this.f27446c = mVar.f27446c;
        this.f27447d = mVar.f27447d;
        this.f27448e = mVar.f27448e;
    }
}
