package q7;

import io.sentry.exception.uXy.SZCvugJaXc;

/* JADX INFO: renamed from: q7.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2837f0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2837f0 f32101a = new C2837f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32102b = new E0("kotlin.Long", o7.e.g.f30977a);

    public void b(p7.f encoder, long j8) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        encoder.D(j8);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32102b;
    }

    @Override // p116m7.k
    public /* bridge */ /* synthetic */ void serialize(p7.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(p7.e eVar) {
        kotlin.jvm.internal.t.g(eVar, SZCvugJaXc.gQpai);
        return Long.valueOf(eVar.t());
    }
}
