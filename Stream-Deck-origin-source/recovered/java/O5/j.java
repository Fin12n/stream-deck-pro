package O5;

import X5.T;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p133o6.b f8814d = new p133o6.b(0, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8815a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set invoke() {
            return p133o6.c.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8816a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Set invoke() {
            return p133o6.c.a();
        }
    }

    @Override // O5.h
    public N5.c b(T url, Map varyKeys) {
        Object next;
        Map.Entry entry;
        String str;
        t.g(url, "url");
        t.g(varyKeys, "varyKeys");
        Iterator it = ((Set) this.f8814d.b(url, a.f8815a)).iterator();
        while (it.hasNext()) {
            next = it.next();
            N5.c cVar = (N5.c) next;
            if (!varyKeys.isEmpty()) {
                Iterator it2 = varyKeys.entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        entry = (Map.Entry) it2.next();
                        str = (String) entry.getKey();
                    }
                } while (t.c(cVar.e().get(str), (String) entry.getValue()));
            }
            return (N5.c) next;
        }
        next = null;
        return (N5.c) next;
    }

    @Override // O5.h
    public Set c(T url) {
        t.g(url, "url");
        Set set = (Set) this.f8814d.get(url);
        return set == null ? D6.T.d() : set;
    }

    @Override // O5.h
    public void d(T url, N5.c cVar) {
        t.g(url, "url");
        t.g(cVar, yOZfxp.KhhIy);
        Set set = (Set) this.f8814d.b(url, b.f8816a);
        if (set.add(cVar)) {
            return;
        }
        set.remove(cVar);
        set.add(cVar);
    }
}
