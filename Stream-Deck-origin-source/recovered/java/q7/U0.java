package q7;

import kotlin.jvm.internal.C2627e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f32071a = new U0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32072b = Q.a("kotlin.UByte", p125n7.a.C(C2627e.f28802a));

    public byte a(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return C6.w.b(decoder.w(getDescriptor()).C());
    }

    public void b(p7.f encoder, byte b8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.r(getDescriptor()).j(b8);
    }

    @Override // p116m7.a
    public /* bridge */ /* synthetic */ Object deserialize(p7.e eVar) {
        return C6.w.a(a(eVar));
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32072b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((C6.w) obj).m());
    }
}
