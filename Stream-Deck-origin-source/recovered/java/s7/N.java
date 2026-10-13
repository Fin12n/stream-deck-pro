package s7;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class N extends AbstractC2897d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f33197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(r7.c json, Q6.k nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(nodeConsumer, "nodeConsumer");
        this.f33197f = new LinkedHashMap();
    }

    public final Map A0() {
        return this.f33197f;
    }

    @Override // q7.P0, p7.d
    public void t(o7.f descriptor, int i8, p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        if (obj != null || this.f33261d.i()) {
            super.t(descriptor, i8, serializer, obj);
        }
    }

    @Override // s7.AbstractC2897d
    public r7.j v0() {
        return new r7.w(this.f33197f);
    }

    @Override // s7.AbstractC2897d
    public void z0(String key, r7.j element) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(element, "element");
        this.f33197f.put(key, element);
    }
}
