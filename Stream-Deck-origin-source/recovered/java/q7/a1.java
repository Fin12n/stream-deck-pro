package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f32085a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32086b = Q.a("kotlin.ULong", p125n7.a.H(kotlin.jvm.internal.v.f28816a));

    public long a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return C6.A.b(decoder.w(getDescriptor()).t());
    }

    public void b(p7.f encoder, long j8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.r(getDescriptor()).D(j8);
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        return C6.A.a(a(eVar));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32086b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((C6.A) obj).m());
    }
}
