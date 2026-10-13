package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f32035a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32036b = new E0("kotlin.Float", o7.e.C0662e.f30975a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Float.valueOf(decoder.G());
    }

    public void b(p7.f encoder, float f8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.m(f8);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32036b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
