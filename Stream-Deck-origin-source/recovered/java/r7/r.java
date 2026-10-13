package r7;

import kotlin.jvm.internal.K;
import s7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f32588a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32589b = o7.i.a("kotlinx.serialization.json.JsonLiteral", o7.e.i.f30979a);

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        j jVarM = m.d(decoder).m();
        if (jVarM instanceof q) {
            return (q) jVarM;
        }
        throw C.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + K.b(jVarM.getClass()), jVarM.toString());
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, q value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        m.h(encoder);
        if (value.m()) {
            encoder.F(value.c());
            return;
        }
        if (value.o() != null) {
            encoder.r(value.o()).F(value.c());
            return;
        }
        Long lO = Z6.u.o(value.c());
        if (lO != null) {
            encoder.D(lO.longValue());
            return;
        }
        C6.A aH = Z6.z.h(value.c());
        if (aH != null) {
            encoder.r(p125n7.a.x(C6.A.f1408b).getDescriptor()).D(aH.m());
            return;
        }
        Double dJ = Z6.t.j(value.c());
        if (dJ != null) {
            encoder.g(dJ.doubleValue());
            return;
        }
        Boolean boolV0 = Z6.w.V0(value.c());
        if (boolV0 != null) {
            encoder.k(boolV0.booleanValue());
        } else {
            encoder.F(value.c());
        }
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32589b;
    }
}
