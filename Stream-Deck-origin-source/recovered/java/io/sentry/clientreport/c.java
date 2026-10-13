package io.sentry.clientreport;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f27047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27049c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(W0 w8, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            w8.x();
            Date dateS0 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("discarded_events")) {
                    arrayList.addAll(w8.O1(iLogger, new g.a()));
                } else if (strF0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                    dateS0 = w8.S0(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            w8.u();
            if (dateS0 == null) {
                throw c(DiagnosticsEntry.TIMESTAMP_KEY, iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateS0, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List<g> list) {
        this.f27047a = date;
        this.f27048b = list;
    }

    public List a() {
        return this.f27048b;
    }

    public void b(Map map) {
        this.f27049c = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).c(AbstractC2519l.g(this.f27047a));
        x8.k("discarded_events").g(iLogger, this.f27048b);
        Map map = this.f27049c;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27049c.get(str));
            }
        }
        x8.u();
    }
}
