package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
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
public final class PaywallData$Configuration$ColorInformation$$serializer implements K {
    public static final PaywallData$Configuration$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$Configuration$ColorInformation$$serializer paywallData$Configuration$ColorInformation$$serializer = new PaywallData$Configuration$ColorInformation$$serializer();
        INSTANCE = paywallData$Configuration$ColorInformation$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation", paywallData$Configuration$ColorInformation$$serializer, 2);
        c2874y0.l("light", false);
        c2874y0.l("dark", true);
        descriptor = c2874y0;
    }

    private PaywallData$Configuration$ColorInformation$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
        return new b[]{paywallData$Configuration$Colors$$serializer, a.u(paywallData$Configuration$Colors$$serializer)};
    }

    @Override // p116m7.a
    public PaywallData.Configuration.ColorInformation deserialize(e decoder) {
        Object objZ;
        int i8;
        Object objU;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.x()) {
            PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
            objU = cVarB.u(descriptor2, 0, paywallData$Configuration$Colors$$serializer, null);
            objZ = cVarB.z(descriptor2, 1, paywallData$Configuration$Colors$$serializer, null);
            i8 = 3;
        } else {
            boolean z8 = true;
            int i9 = 0;
            objZ = null;
            Object objU2 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    objU2 = cVarB.u(descriptor2, 0, PaywallData$Configuration$Colors$$serializer.INSTANCE, objU2);
                    i9 |= 1;
                } else {
                    if (iE != 1) {
                        throw new p(iE);
                    }
                    objZ = cVarB.z(descriptor2, 1, PaywallData$Configuration$Colors$$serializer.INSTANCE, objZ);
                    i9 |= 2;
                }
            }
            i8 = i9;
            objU = objU2;
        }
        cVarB.c(descriptor2);
        return new PaywallData.Configuration.ColorInformation(i8, (PaywallData.Configuration.Colors) objU, (PaywallData.Configuration.Colors) objZ, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.Configuration.ColorInformation value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.Configuration.ColorInformation.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
