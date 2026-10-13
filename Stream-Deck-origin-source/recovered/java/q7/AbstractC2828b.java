package q7;

/* JADX INFO: renamed from: q7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2828b implements p116m7.b {
    public final Object b(p7.c cVar) {
        return p7.c.a.c(cVar, getDescriptor(), 1, p116m7.f.a(this, cVar, cVar.f(getDescriptor(), 0)), null, 8, null);
    }

    public p116m7.a c(p7.c decoder, String str) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public p116m7.k d(p7.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        return encoder.a().e(e(), value);
    }

    @Override // p116m7.a
    public final Object deserialize(p7.e decoder) {
        Object objB;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        o7.f descriptor = getDescriptor();
        p7.c cVarB = decoder.b(descriptor);
        kotlin.jvm.internal.J j8 = new kotlin.jvm.internal.J();
        if (cVarB.x()) {
            objB = b(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int iE = cVarB.E(getDescriptor());
                if (iE == -1) {
                    if (objC != null) {
                        kotlin.jvm.internal.t.e(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                        objB = objC;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) j8.f28779a)).toString());
                }
                if (iE == 0) {
                    j8.f28779a = cVarB.f(getDescriptor(), iE);
                } else {
                    if (iE != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) j8.f28779a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iE);
                        throw new p116m7.j(sb.toString());
                    }
                    Object obj = j8.f28779a;
                    if (obj == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    j8.f28779a = obj;
                    objC = p7.c.a.c(cVarB, getDescriptor(), iE, p116m7.f.a(this, cVarB, (String) obj), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return objB;
    }

    public abstract X6.d e();

    @Override // p116m7.k
    public final void serialize(p7.f encoder, Object value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        p116m7.k kVarB = p116m7.f.b(this, encoder, value);
        o7.f descriptor = getDescriptor();
        p7.d dVarB = encoder.b(descriptor);
        dVarB.q(getDescriptor(), 0, kVarB.getDescriptor().a());
        o7.f descriptor2 = getDescriptor();
        kotlin.jvm.internal.t.e(kVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.i(descriptor2, 1, kVarB, value);
        dVarB.c(descriptor);
    }
}
