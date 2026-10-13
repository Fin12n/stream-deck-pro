package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p7.c;
import p7.d;
import p7.e;
import q7.C2842i;
import q7.C2874y0;
import q7.K;
import q7.N0;
import q7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallEvent$Data$$serializer implements K {
    public static final PaywallEvent$Data$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    private PaywallEvent$Data$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        N0 n8 = N0.f32043a;
        return new b[]{n8, U.f32069a, UUIDSerializer.INSTANCE, n8, n8, C2842i.f32115a};
    }

    @Override // p116m7.a
    public PaywallEvent.Data deserialize(e decoder) {
        boolean zE;
        int i8;
        int i9;
        String str;
        Object objU;
        String str2;
        String str3;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.x()) {
            String strF = cVarB.f(descriptor2, 0);
            int iN = cVarB.n(descriptor2, 1);
            objU = cVarB.u(descriptor2, 2, UUIDSerializer.INSTANCE, null);
            String strF2 = cVarB.f(descriptor2, 3);
            String strF3 = cVarB.f(descriptor2, 4);
            str = strF;
            zE = cVarB.e(descriptor2, 5);
            str2 = strF2;
            str3 = strF3;
            i8 = iN;
            i9 = 63;
        } else {
            boolean z8 = true;
            boolean zE2 = false;
            int i10 = 0;
            String strF4 = null;
            Object objU2 = null;
            String strF5 = null;
            String strF6 = null;
            int iN2 = 0;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z8 = false;
                        continue;
                    case 0:
                        strF4 = cVarB.f(descriptor2, 0);
                        i10 |= 1;
                        continue;
                    case 1:
                        iN2 = cVarB.n(descriptor2, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        objU2 = cVarB.u(descriptor2, 2, UUIDSerializer.INSTANCE, objU2);
                        i10 |= 4;
                        break;
                    case 3:
                        strF5 = cVarB.f(descriptor2, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strF6 = cVarB.f(descriptor2, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        zE2 = cVarB.e(descriptor2, 5);
                        i10 |= 32;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            zE = zE2;
            i8 = iN2;
            i9 = i10;
            str = strF4;
            objU = objU2;
            str2 = strF5;
            str3 = strF6;
        }
        cVarB.c(descriptor2);
        return new PaywallEvent.Data(i9, str, i8, (UUID) objU, str2, str3, zE, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallEvent.Data value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallEvent.Data.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }

    static {
        PaywallEvent$Data$$serializer paywallEvent$Data$$serializer = new PaywallEvent$Data$$serializer();
        INSTANCE = paywallEvent$Data$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallEvent.Data", paywallEvent$Data$$serializer, 6);
        c2874y0.l("offeringIdentifier", false);
        c2874y0.l("paywallRevision", false);
        c2874y0.l("sessionIdentifier", false);
        c2874y0.l(WaYxBuDSBD.DWTECHi, false);
        c2874y0.l("localeIdentifier", false);
        c2874y0.l("darkMode", false);
        descriptor = c2874y0;
    }
}
