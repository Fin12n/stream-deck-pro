package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.common.HTTPClient;
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
public final class PaywallData$Configuration$Colors$$serializer implements K {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 11);
        c2874y0.l("background", false);
        c2874y0.l("text_1", false);
        c2874y0.l("text_2", true);
        c2874y0.l("text_3", true);
        c2874y0.l("call_to_action_background", false);
        c2874y0.l("call_to_action_foreground", false);
        c2874y0.l("call_to_action_secondary_background", true);
        c2874y0.l("accent_1", true);
        c2874y0.l("accent_2", true);
        c2874y0.l("accent_3", true);
        c2874y0.l("close_button", true);
        descriptor = c2874y0;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{serializer, serializer, a.u(serializer), a.u(serializer), serializer, serializer, a.u(serializer), a.u(serializer), a.u(serializer), a.u(serializer), a.u(serializer)};
    }

    @Override // p116m7.a
    public PaywallData.Configuration.Colors deserialize(e decoder) {
        Object objZ;
        Object objZ2;
        Object objU;
        Object objZ3;
        Object objU2;
        int i8;
        Object objZ4;
        Object objZ5;
        Object objZ6;
        Object objU3;
        Object objZ7;
        Object objU4;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i9 = 10;
        Object objU5 = null;
        if (cVarB.x()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            objU4 = cVarB.u(descriptor2, 0, serializer, null);
            Object objU6 = cVarB.u(descriptor2, 1, serializer, null);
            objZ7 = cVarB.z(descriptor2, 2, serializer, null);
            Object objZ8 = cVarB.z(descriptor2, 3, serializer, null);
            objU3 = cVarB.u(descriptor2, 4, serializer, null);
            Object objU7 = cVarB.u(descriptor2, 5, serializer, null);
            objZ6 = cVarB.z(descriptor2, 6, serializer, null);
            Object objZ9 = cVarB.z(descriptor2, 7, serializer, null);
            objZ5 = cVarB.z(descriptor2, 8, serializer, null);
            Object objZ10 = cVarB.z(descriptor2, 9, serializer, null);
            objZ4 = cVarB.z(descriptor2, 10, serializer, null);
            objU2 = objU6;
            objZ3 = objZ8;
            objU = objU7;
            objZ2 = objZ9;
            objZ = objZ10;
            i8 = 2047;
        } else {
            boolean z8 = true;
            int i10 = 0;
            objZ = null;
            Object objZ11 = null;
            objZ2 = null;
            objU = null;
            Object objZ12 = null;
            Object objZ13 = null;
            Object objU8 = null;
            objZ3 = null;
            Object objZ14 = null;
            objU2 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z8 = false;
                        i9 = 10;
                        break;
                    case 0:
                        objU5 = cVarB.u(descriptor2, 0, PaywallColor.Serializer.INSTANCE, objU5);
                        i10 |= 1;
                        i9 = 10;
                        break;
                    case 1:
                        objU2 = cVarB.u(descriptor2, 1, PaywallColor.Serializer.INSTANCE, objU2);
                        i10 |= 2;
                        i9 = 10;
                        break;
                    case 2:
                        objZ14 = cVarB.z(descriptor2, 2, PaywallColor.Serializer.INSTANCE, objZ14);
                        i10 |= 4;
                        i9 = 10;
                        break;
                    case 3:
                        objZ3 = cVarB.z(descriptor2, 3, PaywallColor.Serializer.INSTANCE, objZ3);
                        i10 |= 8;
                        i9 = 10;
                        break;
                    case 4:
                        objU8 = cVarB.u(descriptor2, 4, PaywallColor.Serializer.INSTANCE, objU8);
                        i10 |= 16;
                        i9 = 10;
                        break;
                    case 5:
                        objU = cVarB.u(descriptor2, 5, PaywallColor.Serializer.INSTANCE, objU);
                        i10 |= 32;
                        i9 = 10;
                        break;
                    case 6:
                        objZ13 = cVarB.z(descriptor2, 6, PaywallColor.Serializer.INSTANCE, objZ13);
                        i10 |= 64;
                        i9 = 10;
                        break;
                    case 7:
                        objZ2 = cVarB.z(descriptor2, 7, PaywallColor.Serializer.INSTANCE, objZ2);
                        i10 |= 128;
                        i9 = 10;
                        break;
                    case 8:
                        objZ11 = cVarB.z(descriptor2, 8, PaywallColor.Serializer.INSTANCE, objZ11);
                        i10 |= 256;
                        i9 = 10;
                        break;
                    case 9:
                        objZ = cVarB.z(descriptor2, 9, PaywallColor.Serializer.INSTANCE, objZ);
                        i10 |= 512;
                        i9 = 10;
                        break;
                    case 10:
                        objZ12 = cVarB.z(descriptor2, i9, PaywallColor.Serializer.INSTANCE, objZ12);
                        i10 |= 1024;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            i8 = i10;
            objZ4 = objZ12;
            objZ5 = objZ11;
            objZ6 = objZ13;
            objU3 = objU8;
            objZ7 = objZ14;
            objU4 = objU5;
        }
        cVarB.c(descriptor2);
        return new PaywallData.Configuration.Colors(i8, (PaywallColor) objU4, (PaywallColor) objU2, (PaywallColor) objZ7, (PaywallColor) objZ3, (PaywallColor) objU3, (PaywallColor) objU, (PaywallColor) objZ6, (PaywallColor) objZ2, (PaywallColor) objZ5, (PaywallColor) objZ, (PaywallColor) objZ4, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.Configuration.Colors value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.Configuration.Colors.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
