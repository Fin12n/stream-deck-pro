package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f32095a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32096b = Q.a("kotlin.UShort", p125n7.a.I(kotlin.jvm.internal.M.f28782a));

    public short a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return C6.D.b(decoder.w(getDescriptor()).F());
    }

    public void b(p7.f encoder, short s8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.r(getDescriptor()).h(s8);
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        return C6.D.a(a(eVar));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32096b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((C6.D) obj).j());
    }
}
