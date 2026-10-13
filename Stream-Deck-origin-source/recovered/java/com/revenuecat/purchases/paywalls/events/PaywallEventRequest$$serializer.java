package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import java.util.List;
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
public final class PaywallEventRequest$$serializer implements K {
    public static final PaywallEventRequest$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallEventRequest$$serializer paywallEventRequest$$serializer = new PaywallEventRequest$$serializer();
        INSTANCE = paywallEventRequest$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallEventRequest", paywallEventRequest$$serializer, 1);
        c2874y0.l("events", false);
        descriptor = c2874y0;
    }

    private PaywallEventRequest$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        return new b[]{PaywallEventRequest.$childSerializers[0]};
    }

    @Override // p116m7.a
    public PaywallEventRequest deserialize(e decoder) {
        Object objU;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallEventRequest.$childSerializers;
        int i8 = 1;
        if (cVarB.x()) {
            objU = cVarB.u(descriptor2, 0, bVarArr[0], null);
        } else {
            boolean z8 = true;
            int i9 = 0;
            Object objU2 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else {
                    if (iE != 0) {
                        throw new p(iE);
                    }
                    objU2 = cVarB.u(descriptor2, 0, bVarArr[0], objU2);
                    i9 = 1;
                }
            }
            objU = objU2;
            i8 = i9;
        }
        cVarB.c(descriptor2);
        return new PaywallEventRequest(i8, (List) objU, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallEventRequest value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        dVarB.i(descriptor2, 0, PaywallEventRequest.$childSerializers[0], value.events);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
