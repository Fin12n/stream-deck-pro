package io.sentry.clientreport;

import io.sentry.EnumC2515k;
import io.sentry.util.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f27046a = new q(new q.a() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.q.a
        public final Object a() {
            return b.c();
        }
    });

    public static /* synthetic */ Map c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (EnumC2515k enumC2515k : EnumC2515k.values()) {
                concurrentHashMap.put(new d(fVar.getReason(), enumC2515k.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.i
    public List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) this.f27046a.a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new g(((d) entry.getKey()).b(), ((d) entry.getKey()).a(), lValueOf));
            }
        }
        return arrayList;
    }

    @Override // io.sentry.clientreport.i
    public void b(d dVar, Long l8) {
        AtomicLong atomicLong = (AtomicLong) ((Map) this.f27046a.a()).get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l8.longValue());
        }
    }
}
