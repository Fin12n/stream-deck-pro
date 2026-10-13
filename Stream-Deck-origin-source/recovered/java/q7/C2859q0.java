package q7;

/* JADX INFO: renamed from: q7.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2859q0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116m7.b f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.f f32138b;

    public C2859q0(p116m7.b serializer) {
        kotlin.jvm.internal.t.g(serializer, "serializer");
        this.f32137a = serializer;
        this.f32138b = new H0(serializer.getDescriptor());
    }

    @Override // p116m7.a
    public Object deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.v() ? decoder.A(this.f32137a) : decoder.q();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2859q0.class == obj.getClass() && kotlin.jvm.internal.t.c(this.f32137a, ((C2859q0) obj).f32137a);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32138b;
    }

    public int hashCode() {
        return this.f32137a.hashCode();
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, Object obj) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        if (obj == null) {
            encoder.f();
        } else {
            encoder.s();
            encoder.n(this.f32137a, obj);
        }
    }
}
