package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC2897d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r7.j f33188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(r7.c json, Q6.k nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(nodeConsumer, "nodeConsumer");
        c0("primitive");
    }

    @Override // s7.AbstractC2897d
    public r7.j v0() {
        r7.j jVar = this.f33188f;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // s7.AbstractC2897d
    public void z0(String key, r7.j element) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f33188f != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f33188f = element;
        w0().invoke(element);
    }
}
