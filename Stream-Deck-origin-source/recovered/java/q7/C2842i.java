package q7;

/* JADX INFO: renamed from: q7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2842i implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2842i f32115a = new C2842i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32116b = new E0("kotlin.Boolean", o7.e.a.f30971a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Boolean.valueOf(decoder.i());
    }

    public void b(p7.f encoder, boolean z8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.k(z8);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32116b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
