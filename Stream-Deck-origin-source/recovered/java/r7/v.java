package r7;

import p181u6.GfRt.QhsKALGiniuQ;
import s7.C2917y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f32593a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32594b = o7.i.e("kotlinx.serialization.json.JsonNull", o7.j.b.f31003a, new o7.f[0], null, 8, null);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        m.g(decoder);
        if (decoder.v()) {
            throw new C2917y("Expected 'null' literal");
        }
        decoder.q();
        return u.INSTANCE;
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32594b;
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, u uVar) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(uVar, QhsKALGiniuQ.qbuBnqoJIpP);
        m.h(encoder);
        encoder.f();
    }
}
