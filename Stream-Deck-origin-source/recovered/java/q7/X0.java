package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f32079a = new X0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32080b = Q.a("kotlin.UInt", p125n7.a.G(kotlin.jvm.internal.s.f28815a));

    public int a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return C6.y.b(decoder.w(getDescriptor()).o());
    }

    public void b(p7.f encoder, int i8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.r(getDescriptor()).A(i8);
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        return C6.y.a(a(eVar));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32080b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((C6.y) obj).j());
    }
}
