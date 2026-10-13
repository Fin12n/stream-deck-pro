package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p7.c;
import p7.d;
import p7.e;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;
import q7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallData$$serializer implements K {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 5);
        c2874y0.l("template_name", false);
        c2874y0.l("config", false);
        c2874y0.l("asset_base_url", false);
        c2874y0.l("revision", true);
        c2874y0.l("localized_strings", false);
        descriptor = c2874y0;
    }

    private PaywallData$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        return new b[]{N0.f32043a, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, U.f32069a, PaywallData.$childSerializers[4]};
    }

    @Override // p116m7.a
    public PaywallData deserialize(e decoder) {
        Object objU;
        int i8;
        int i9;
        String str;
        Object objU2;
        Object objU3;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallData.$childSerializers;
        if (cVarB.x()) {
            String strF = cVarB.f(descriptor2, 0);
            objU2 = cVarB.u(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, null);
            Object objU4 = cVarB.u(descriptor2, 2, URLSerializer.INSTANCE, null);
            int iN = cVarB.n(descriptor2, 3);
            objU3 = cVarB.u(descriptor2, 4, bVarArr[4], null);
            i8 = iN;
            objU = objU4;
            i9 = 31;
            str = strF;
        } else {
            boolean z8 = true;
            int iN2 = 0;
            String strF2 = null;
            Object objU5 = null;
            objU = null;
            Object objU6 = null;
            int i10 = 0;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    strF2 = cVarB.f(descriptor2, 0);
                    i10 |= 1;
                } else if (iE == 1) {
                    objU5 = cVarB.u(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, objU5);
                    i10 |= 2;
                } else if (iE == 2) {
                    objU = cVarB.u(descriptor2, 2, URLSerializer.INSTANCE, objU);
                    i10 |= 4;
                } else if (iE == 3) {
                    iN2 = cVarB.n(descriptor2, 3);
                    i10 |= 8;
                } else {
                    if (iE != 4) {
                        throw new p(iE);
                    }
                    objU6 = cVarB.u(descriptor2, 4, bVarArr[4], objU6);
                    i10 |= 16;
                }
            }
            i8 = iN2;
            i9 = i10;
            str = strF2;
            objU2 = objU5;
            objU3 = objU6;
        }
        cVarB.c(descriptor2);
        return new PaywallData(i9, str, (PaywallData.Configuration) objU2, (URL) objU, i8, (Map) objU3, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
