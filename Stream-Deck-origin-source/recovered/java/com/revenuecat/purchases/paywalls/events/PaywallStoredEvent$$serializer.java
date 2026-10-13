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
import q7.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallStoredEvent$$serializer implements K {
    public static final PaywallStoredEvent$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallStoredEvent$$serializer paywallStoredEvent$$serializer = new PaywallStoredEvent$$serializer();
        INSTANCE = paywallStoredEvent$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallStoredEvent", paywallStoredEvent$$serializer, 2);
        c2874y0.l("event", false);
        c2874y0.l("userID", false);
        descriptor = c2874y0;
    }

    private PaywallStoredEvent$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        return new b[]{PaywallEvent$$serializer.INSTANCE, N0.f32043a};
    }

    @Override // p116m7.a
    public PaywallStoredEvent deserialize(e decoder) {
        Object objU;
        String strF;
        int i8;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.x()) {
            objU = cVarB.u(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, null);
            strF = cVarB.f(descriptor2, 1);
            i8 = 3;
        } else {
            boolean z8 = true;
            int i9 = 0;
            objU = null;
            String strF2 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    objU = cVarB.u(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, objU);
                    i9 |= 1;
                } else {
                    if (iE != 1) {
                        throw new p(iE);
                    }
                    strF2 = cVarB.f(descriptor2, 1);
                    i9 |= 2;
                }
            }
            strF = strF2;
            i8 = i9;
        }
        cVarB.c(descriptor2);
        return new PaywallStoredEvent(i8, (PaywallEvent) objU, strF, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallStoredEvent value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallStoredEvent.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
