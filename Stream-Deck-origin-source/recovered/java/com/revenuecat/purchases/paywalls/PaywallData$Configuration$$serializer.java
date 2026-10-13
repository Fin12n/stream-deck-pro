package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import java.net.URL;
import java.util.List;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p125n7.a;
import p7.c;
import p7.d;
import p7.e;
import q7.C2842i;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallData$Configuration$$serializer implements K {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 9);
        c2874y0.l("packages", false);
        c2874y0.l("default_package", true);
        c2874y0.l("images_webp", true);
        c2874y0.l("images", true);
        c2874y0.l("blurred_background_image", true);
        c2874y0.l("display_restore_purchases", true);
        c2874y0.l("tos_url", true);
        c2874y0.l("privacy_url", true);
        c2874y0.l("colors", false);
        descriptor = c2874y0;
    }

    private PaywallData$Configuration$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        b bVar = PaywallData.Configuration.$childSerializers[0];
        b bVarU = a.u(N0.f32043a);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        b bVarU2 = a.u(paywallData$Configuration$Images$$serializer);
        b bVarU3 = a.u(paywallData$Configuration$Images$$serializer);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        b bVarU4 = a.u(optionalURLSerializer);
        b bVarU5 = a.u(optionalURLSerializer);
        C2842i c2842i = C2842i.f32115a;
        return new b[]{bVar, bVarU, bVarU2, bVarU3, c2842i, c2842i, bVarU4, bVarU5, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE};
    }

    @Override // p116m7.a
    public PaywallData.Configuration deserialize(e decoder) {
        boolean z8;
        Object objZ;
        boolean z9;
        Object objU;
        Object objZ2;
        Object objZ3;
        Object objZ4;
        Object objZ5;
        int i8;
        Object objU2;
        char c8;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallData.Configuration.$childSerializers;
        int i9 = 7;
        if (cVarB.x()) {
            objU2 = cVarB.u(descriptor2, 0, bVarArr[0], null);
            objZ = cVarB.z(descriptor2, 1, N0.f32043a, null);
            PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
            objZ5 = cVarB.z(descriptor2, 2, paywallData$Configuration$Images$$serializer, null);
            objZ4 = cVarB.z(descriptor2, 3, paywallData$Configuration$Images$$serializer, null);
            boolean zE = cVarB.e(descriptor2, 4);
            boolean zE2 = cVarB.e(descriptor2, 5);
            OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
            objZ2 = cVarB.z(descriptor2, 6, optionalURLSerializer, null);
            objZ3 = cVarB.z(descriptor2, 7, optionalURLSerializer, null);
            objU = cVarB.u(descriptor2, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, null);
            i8 = 511;
            z8 = zE2;
            z9 = zE;
        } else {
            boolean z10 = true;
            boolean zE3 = false;
            int i10 = 0;
            Object objU3 = null;
            Object objZ6 = null;
            Object objZ7 = null;
            Object objZ8 = null;
            Object objZ9 = null;
            Object objU4 = null;
            boolean zE4 = false;
            Object objZ10 = null;
            while (z10) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z10 = false;
                        break;
                    case 0:
                        objU4 = cVarB.u(descriptor2, 0, bVarArr[0], objU4);
                        i10 |= 1;
                        i9 = 7;
                        break;
                    case 1:
                        objZ10 = cVarB.z(descriptor2, 1, N0.f32043a, objZ10);
                        i10 |= 2;
                        i9 = 7;
                        break;
                    case 2:
                        objZ9 = cVarB.z(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, objZ9);
                        i10 |= 4;
                        i9 = 7;
                        break;
                    case 3:
                        objZ8 = cVarB.z(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, objZ8);
                        i10 |= 8;
                        i9 = 7;
                        break;
                    case 4:
                        i10 |= 16;
                        zE4 = cVarB.e(descriptor2, 4);
                        i9 = 7;
                        break;
                    case 5:
                        c8 = 6;
                        zE3 = cVarB.e(descriptor2, 5);
                        i10 |= 32;
                        i9 = 7;
                        break;
                    case 6:
                        c8 = 6;
                        objZ6 = cVarB.z(descriptor2, 6, OptionalURLSerializer.INSTANCE, objZ6);
                        i10 |= 64;
                        i9 = 7;
                        break;
                    case 7:
                        objZ7 = cVarB.z(descriptor2, i9, OptionalURLSerializer.INSTANCE, objZ7);
                        i10 |= 128;
                        break;
                    case 8:
                        objU3 = cVarB.u(descriptor2, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, objU3);
                        i10 |= 256;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            boolean z11 = zE4;
            z8 = zE3;
            objZ = objZ10;
            z9 = z11;
            objU = objU3;
            objZ2 = objZ6;
            objZ3 = objZ7;
            objZ4 = objZ8;
            objZ5 = objZ9;
            i8 = i10;
            objU2 = objU4;
        }
        cVarB.c(descriptor2);
        return new PaywallData.Configuration(i8, (List) objU2, (String) objZ, (PaywallData.Configuration.Images) objZ5, (PaywallData.Configuration.Images) objZ4, z9, z8, (URL) objZ2, (URL) objZ3, (PaywallData.Configuration.ColorInformation) objU, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.Configuration value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.Configuration.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
