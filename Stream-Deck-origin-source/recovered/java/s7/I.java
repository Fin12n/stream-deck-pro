package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC2896c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7.j f33187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(r7.c json, r7.j value) {
        super(json, value, null);
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(value, "value");
        this.f33187f = value;
        Z("primitive");
    }

    @Override // p7.c
    public int E(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return 0;
    }

    @Override // s7.AbstractC2896c
    public r7.j g0(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        if (tag == "primitive") {
            return v0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // s7.AbstractC2896c
    public r7.j v0() {
        return this.f33187f;
    }
}
