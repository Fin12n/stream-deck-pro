package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f32139a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32140b = new E0("kotlin.Char", o7.e.c.f30973a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return Character.valueOf(decoder.k());
    }

    public void b(p7.f encoder, char c8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.p(c8);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32140b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
