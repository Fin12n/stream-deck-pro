package s7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC2897d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f33201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(r7.c json, Q6.k nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(nodeConsumer, "nodeConsumer");
        this.f33201f = new ArrayList();
    }

    @Override // s7.AbstractC2897d, q7.AbstractC2851m0
    public String e0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // s7.AbstractC2897d
    public r7.j v0() {
        return new r7.d(this.f33201f);
    }

    @Override // s7.AbstractC2897d
    public void z0(String key, r7.j element) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(element, "element");
        this.f33201f.add(Integer.parseInt(key), element);
    }
}
