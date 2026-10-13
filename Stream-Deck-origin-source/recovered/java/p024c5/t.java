package p024c5;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p063h.s;
import p078i5.a;
import p078i5.b;
import p078i5.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class t implements c, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16269a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f16270b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16271c;

    public t(Executor executor) {
        this.f16271c = executor;
    }

    public static /* synthetic */ void c(Map.Entry entry, a aVar) {
        s.a(entry.getKey());
        throw null;
    }

    public void a() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f16270b;
                if (queue != null) {
                    this.f16270b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                d((a) it.next());
            }
        }
    }

    public final synchronized Set b(a aVar) {
        Map map;
        try {
            map = (Map) this.f16269a.get(aVar.a());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    public void d(a aVar) {
        B.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f16270b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (Map.Entry entry : b(aVar)) {
                    ((Executor) entry.getValue()).execute(s.a(entry, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
