package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import M6.eLZq.eGwOBWCdOTaKus;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p125n7.a;
import p7.c;
import p7.d;
import p7.e;
import q7.C2874y0;
import q7.I0;
import q7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallData$Configuration$Images$$serializer implements K {
    public static final PaywallData$Configuration$Images$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    private PaywallData$Configuration$Images$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new b[]{a.u(emptyStringToNullSerializer), a.u(emptyStringToNullSerializer), a.u(emptyStringToNullSerializer)};
    }

    @Override // p116m7.a
    public PaywallData.Configuration.Images deserialize(e decoder) {
        Object objZ;
        int i8;
        Object objZ2;
        Object objZ3;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objZ4 = null;
        if (cVarB.x()) {
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            objZ2 = cVarB.z(descriptor2, 0, emptyStringToNullSerializer, null);
            Object objZ5 = cVarB.z(descriptor2, 1, emptyStringToNullSerializer, null);
            objZ3 = cVarB.z(descriptor2, 2, emptyStringToNullSerializer, null);
            objZ = objZ5;
            i8 = 7;
        } else {
            boolean z8 = true;
            int i9 = 0;
            objZ = null;
            Object objZ6 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    objZ4 = cVarB.z(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, objZ4);
                    i9 |= 1;
                } else if (iE == 1) {
                    objZ = cVarB.z(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objZ);
                    i9 |= 2;
                } else {
                    if (iE != 2) {
                        throw new p(iE);
                    }
                    objZ6 = cVarB.z(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objZ6);
                    i9 |= 4;
                }
            }
            i8 = i9;
            objZ2 = objZ4;
            objZ3 = objZ6;
        }
        cVarB.c(descriptor2);
        return new PaywallData.Configuration.Images(i8, (String) objZ2, (String) objZ, (String) objZ3, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.Configuration.Images value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.Configuration.Images.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }

    static {
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = new PaywallData$Configuration$Images$$serializer();
        INSTANCE = paywallData$Configuration$Images$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images", paywallData$Configuration$Images$$serializer, 3);
        c2874y0.l(eGwOBWCdOTaKus.YNN, true);
        c2874y0.l("background", true);
        c2874y0.l("icon", true);
        descriptor = c2874y0;
    }
}
