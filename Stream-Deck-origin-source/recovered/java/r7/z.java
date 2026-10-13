package r7;

import kotlin.jvm.internal.K;
import s7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f32602a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32603b = o7.i.e("kotlinx.serialization.json.JsonPrimitive", o7.e.i.f30979a, new o7.f[0], null, 8, null);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        j jVarM = m.d(decoder).m();
        if (jVarM instanceof y) {
            return (y) jVarM;
        }
        throw C.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + K.b(jVarM.getClass()), jVarM.toString());
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, y value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        m.h(encoder);
        if (value instanceof u) {
            encoder.n(v.f32593a, u.INSTANCE);
        } else {
            encoder.n(r.f32588a, (q) value);
        }
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32603b;
    }
}
