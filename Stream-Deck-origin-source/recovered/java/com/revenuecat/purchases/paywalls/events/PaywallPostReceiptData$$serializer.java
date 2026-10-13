package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.common.HTTPClient;
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
public final class PaywallPostReceiptData$$serializer implements K {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 6);
        c2874y0.l("session_id", false);
        c2874y0.l("revision", false);
        c2874y0.l("display_mode", false);
        c2874y0.l("dark_mode", false);
        c2874y0.l("locale", false);
        c2874y0.l("offering_id", false);
        descriptor = c2874y0;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        N0 n8 = N0.f32043a;
        return new b[]{n8, U.f32069a, n8, C2842i.f32115a, n8, n8};
    }

    @Override // p116m7.a
    public PaywallPostReceiptData deserialize(e decoder) {
        String strF;
        String strF2;
        boolean z8;
        String str;
        String str2;
        int i8;
        int i9;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.x()) {
            strF = cVarB.f(descriptor2, 0);
            int iN = cVarB.n(descriptor2, 1);
            String strF3 = cVarB.f(descriptor2, 2);
            boolean zE = cVarB.e(descriptor2, 3);
            String strF4 = cVarB.f(descriptor2, 4);
            strF2 = cVarB.f(descriptor2, 5);
            z8 = zE;
            str = strF4;
            str2 = strF3;
            i8 = iN;
            i9 = 63;
        } else {
            strF = null;
            String strF5 = null;
            String strF6 = null;
            String strF7 = null;
            boolean z9 = true;
            boolean zE2 = false;
            int iN2 = 0;
            int i10 = 0;
            while (z9) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z9 = false;
                        continue;
                    case 0:
                        strF = cVarB.f(descriptor2, 0);
                        i10 |= 1;
                        continue;
                    case 1:
                        iN2 = cVarB.n(descriptor2, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        strF7 = cVarB.f(descriptor2, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        zE2 = cVarB.e(descriptor2, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strF6 = cVarB.f(descriptor2, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strF5 = cVarB.f(descriptor2, 5);
                        i10 |= 32;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            strF2 = strF5;
            z8 = zE2;
            str = strF6;
            str2 = strF7;
            i8 = iN2;
            i9 = i10;
        }
        String str3 = strF;
        cVarB.c(descriptor2);
        return new PaywallPostReceiptData(i9, str3, i8, str2, z8, str, strF2, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallPostReceiptData value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallPostReceiptData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
