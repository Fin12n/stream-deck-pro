package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f32002a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32003b = new E0("kotlin.Double", o7.e.d.f30974a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void b(p7.f encoder, double d8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.g(d8);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32003b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
