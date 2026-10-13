package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements p116m7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f32098b = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2860r0 f32099a = new C2860r0("kotlin.Unit", C6.G.f1419a);

    public void a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        this.f32099a.deserialize(decoder);
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, C6.G value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        this.f32099a.serialize(encoder, value);
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        a(eVar);
        return C6.G.f1419a;
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32099a.getDescriptor();
    }
}
