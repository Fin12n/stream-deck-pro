package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
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
public final class PaywallEvent$CreationData$$serializer implements K {
    public static final PaywallEvent$CreationData$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallEvent$CreationData$$serializer paywallEvent$CreationData$$serializer = new PaywallEvent$CreationData$$serializer();
        INSTANCE = paywallEvent$CreationData$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData", paywallEvent$CreationData$$serializer, 2);
        c2874y0.l("id", false);
        c2874y0.l("date", false);
        descriptor = c2874y0;
    }

    private PaywallEvent$CreationData$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        return new b[]{UUIDSerializer.INSTANCE, DateSerializer.INSTANCE};
    }

    @Override // p116m7.a
    public PaywallEvent.CreationData deserialize(e decoder) {
        Object objU;
        Object objU2;
        int i8;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.x()) {
            objU = cVarB.u(descriptor2, 0, UUIDSerializer.INSTANCE, null);
            objU2 = cVarB.u(descriptor2, 1, DateSerializer.INSTANCE, null);
            i8 = 3;
        } else {
            boolean z8 = true;
            int i9 = 0;
            objU = null;
            Object objU3 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    objU = cVarB.u(descriptor2, 0, UUIDSerializer.INSTANCE, objU);
                    i9 |= 1;
                } else {
                    if (iE != 1) {
                        throw new p(iE);
                    }
                    objU3 = cVarB.u(descriptor2, 1, DateSerializer.INSTANCE, objU3);
                    i9 |= 2;
                }
            }
            objU2 = objU3;
            i8 = i9;
        }
        cVarB.c(descriptor2);
        return new PaywallEvent.CreationData(i8, (UUID) objU, (Date) objU2, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallEvent.CreationData value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallEvent.CreationData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
