package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.HTTPClient;
import java.util.List;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.p;
import p125n7.a;
import p7.c;
import p7.d;
import p7.e;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallData$LocalizedConfiguration$$serializer implements K {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 10);
        c2874y0.l(b.f16718S, false);
        c2874y0.l("subtitle", true);
        c2874y0.l("call_to_action", false);
        c2874y0.l("call_to_action_with_intro_offer", true);
        c2874y0.l("call_to_action_with_multiple_intro_offers", true);
        c2874y0.l("offer_details", true);
        c2874y0.l("offer_details_with_intro_offer", true);
        c2874y0.l("offer_details_with_multiple_intro_offers", true);
        c2874y0.l("offer_name", true);
        c2874y0.l("features", true);
        descriptor = c2874y0;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // q7.K
    public p116m7.b[] childSerializers() {
        p116m7.b[] bVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        p116m7.b bVarU = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU2 = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU3 = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU4 = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU5 = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU6 = a.u(emptyStringToNullSerializer);
        p116m7.b bVarU7 = a.u(emptyStringToNullSerializer);
        p116m7.b bVar = bVarArr[9];
        N0 n8 = N0.f32043a;
        return new p116m7.b[]{n8, bVarU, n8, bVarU2, bVarU3, bVarU4, bVarU5, bVarU6, bVarU7, bVar};
    }

    @Override // p116m7.a
    public PaywallData.LocalizedConfiguration deserialize(e decoder) {
        Object objZ;
        Object objZ2;
        int i8;
        Object objU;
        Object objZ3;
        Object objZ4;
        Object objZ5;
        Object objZ6;
        String str;
        Object objZ7;
        String strF;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        p116m7.b[] bVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        int i9 = 8;
        String strF2 = null;
        if (cVarB.x()) {
            String strF3 = cVarB.f(descriptor2, 0);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            objZ7 = cVarB.z(descriptor2, 1, emptyStringToNullSerializer, null);
            strF = cVarB.f(descriptor2, 2);
            Object objZ8 = cVarB.z(descriptor2, 3, emptyStringToNullSerializer, null);
            objZ6 = cVarB.z(descriptor2, 4, emptyStringToNullSerializer, null);
            objZ5 = cVarB.z(descriptor2, 5, emptyStringToNullSerializer, null);
            Object objZ9 = cVarB.z(descriptor2, 6, emptyStringToNullSerializer, null);
            objZ4 = cVarB.z(descriptor2, 7, emptyStringToNullSerializer, null);
            objZ3 = cVarB.z(descriptor2, 8, emptyStringToNullSerializer, null);
            objU = cVarB.u(descriptor2, 9, bVarArr[9], null);
            i8 = 1023;
            objZ2 = objZ8;
            objZ = objZ9;
            str = strF3;
        } else {
            boolean z8 = true;
            int i10 = 0;
            Object objU2 = null;
            Object objZ10 = null;
            objZ = null;
            Object objZ11 = null;
            Object objZ12 = null;
            Object objZ13 = null;
            objZ2 = null;
            Object objZ14 = null;
            String strF4 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z8 = false;
                        break;
                    case 0:
                        strF2 = cVarB.f(descriptor2, 0);
                        i10 |= 1;
                        i9 = 8;
                        break;
                    case 1:
                        objZ14 = cVarB.z(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objZ14);
                        i10 |= 2;
                        i9 = 8;
                        break;
                    case 2:
                        strF4 = cVarB.f(descriptor2, 2);
                        i10 |= 4;
                        i9 = 8;
                        break;
                    case 3:
                        objZ2 = cVarB.z(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objZ2);
                        i10 |= 8;
                        i9 = 8;
                        break;
                    case 4:
                        objZ13 = cVarB.z(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objZ13);
                        i10 |= 16;
                        i9 = 8;
                        break;
                    case 5:
                        objZ12 = cVarB.z(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, objZ12);
                        i10 |= 32;
                        i9 = 8;
                        break;
                    case 6:
                        objZ = cVarB.z(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, objZ);
                        i10 |= 64;
                        i9 = 8;
                        break;
                    case 7:
                        objZ11 = cVarB.z(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, objZ11);
                        i10 |= 128;
                        i9 = 8;
                        break;
                    case 8:
                        objZ10 = cVarB.z(descriptor2, i9, EmptyStringToNullSerializer.INSTANCE, objZ10);
                        i10 |= 256;
                        break;
                    case 9:
                        objU2 = cVarB.u(descriptor2, 9, bVarArr[9], objU2);
                        i10 |= 512;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            i8 = i10;
            objU = objU2;
            objZ3 = objZ10;
            objZ4 = objZ11;
            objZ5 = objZ12;
            objZ6 = objZ13;
            str = strF2;
            objZ7 = objZ14;
            strF = strF4;
        }
        cVarB.c(descriptor2);
        return new PaywallData.LocalizedConfiguration(i8, str, (String) objZ7, strF, (String) objZ2, (String) objZ6, (String) objZ5, (String) objZ, (String) objZ4, (String) objZ3, (List) objU, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.LocalizedConfiguration value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public p116m7.b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
