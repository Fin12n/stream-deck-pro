package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f32004a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32005b = new E0("kotlin.time.Duration", o7.e.i.f30979a);

    public long a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return p008a7.a.f13446b.c(decoder.s());
    }

    public void b(p7.f encoder, long j8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.F(p008a7.a.Q(j8));
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        return p008a7.a.e(a(eVar));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32005b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((p008a7.a) obj).U());
    }
}
