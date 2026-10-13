package Y3;

import C6.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12325b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12326a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f12327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.f12327a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            k kVar = this.f12327a;
            StringBuilder sb = new StringBuilder();
            sb.append("📊 [MockTransport] " + kVar.b());
            t.f(sb, "append(...)");
            sb.append('\n');
            t.f(sb, "append(...)");
            for (Map.Entry entry : kVar.d().entrySet()) {
                sb.append("  " + ((String) entry.getKey()) + ": " + ((X3.i) entry.getValue()).a());
                t.f(sb, "append(...)");
                sb.append('\n');
                t.f(sb, "append(...)");
            }
            String string = sb.toString();
            t.f(string, "toString(...)");
            return string;
        }
    }

    @Override // Y3.m
    public Object a(List list, G6.d dVar) {
        this.f12326a.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z2.j.a.f(Z2.j.f12858c, "MockTransport", null, new b((k) it.next()), 2, null);
        }
        return G.f1419a;
    }
}
