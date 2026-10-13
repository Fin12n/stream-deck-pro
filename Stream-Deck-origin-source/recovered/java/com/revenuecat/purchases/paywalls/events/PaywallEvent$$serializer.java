package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p7.c;
import p7.d;
import p7.e;
import q7.C2874y0;
import q7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallEvent$$serializer implements K {
    public static final PaywallEvent$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        c2874y0.l("creationData", false);
        c2874y0.l("data", false);
        c2874y0.l("type", false);
        descriptor = c2874y0;
    }

    private PaywallEvent$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        return new b[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEvent$Data$$serializer.INSTANCE, PaywallEvent.$childSerializers[2]};
    }

    @Override // p116m7.a
    public PaywallEvent deserialize(e decoder) {
        Object objU;
        int i8;
        Object objU2;
        Object objU3;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallEvent.$childSerializers;
        Object objU4 = null;
        if (cVarB.x()) {
            objU2 = cVarB.u(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, null);
            Object objU5 = cVarB.u(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, null);
            objU3 = cVarB.u(descriptor2, 2, bVarArr[2], null);
            objU = objU5;
            i8 = 7;
        } else {
            boolean z8 = true;
            int i9 = 0;
            objU = null;
            Object objU6 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    objU4 = cVarB.u(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, objU4);
                    i9 |= 1;
                } else if (iE == 1) {
                    objU = cVarB.u(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, objU);
                    i9 |= 2;
                } else {
                    if (iE != 2) {
                        throw new p(iE);
                    }
                    objU6 = cVarB.u(descriptor2, 2, bVarArr[2], objU6);
                    i9 |= 4;
                }
            }
            i8 = i9;
            objU2 = objU4;
            objU3 = objU6;
        }
        cVarB.c(descriptor2);
        return new PaywallEvent(i8, (PaywallEvent.CreationData) objU2, (PaywallEvent.Data) objU, (PaywallEventType) objU3, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallEvent value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallEvent.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
