package q7;

import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f32043a = new N0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32044b = new E0("kotlin.String", o7.e.i.f30979a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.s();
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32044b;
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, String str) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(str, GIGvBf.MCOJCvB);
        encoder.F(str);
    }
}
