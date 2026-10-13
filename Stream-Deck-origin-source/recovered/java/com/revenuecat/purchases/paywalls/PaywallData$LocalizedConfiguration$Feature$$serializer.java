package com.revenuecat.purchases.paywalls;

import C6.InterfaceC0916e;
import com.amazon.a.a.o.b;
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
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements K {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        c2874y0.l(b.f16718S, false);
        c2874y0.l("content", true);
        c2874y0.l("icon_id", true);
        descriptor = c2874y0;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    @Override // q7.K
    public p116m7.b[] childSerializers() {
        N0 n8 = N0.f32043a;
        return new p116m7.b[]{n8, a.u(n8), a.u(n8)};
    }

    @Override // p116m7.a
    public PaywallData.LocalizedConfiguration.Feature deserialize(e decoder) {
        int i8;
        String str;
        Object objZ;
        Object objZ2;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strF = null;
        if (cVarB.x()) {
            String strF2 = cVarB.f(descriptor2, 0);
            N0 n8 = N0.f32043a;
            objZ = cVarB.z(descriptor2, 1, n8, null);
            objZ2 = cVarB.z(descriptor2, 2, n8, null);
            str = strF2;
            i8 = 7;
        } else {
            boolean z8 = true;
            int i9 = 0;
            Object objZ3 = null;
            Object objZ4 = null;
            while (z8) {
                int iE = cVarB.E(descriptor2);
                if (iE == -1) {
                    z8 = false;
                } else if (iE == 0) {
                    strF = cVarB.f(descriptor2, 0);
                    i9 |= 1;
                } else if (iE == 1) {
                    objZ3 = cVarB.z(descriptor2, 1, N0.f32043a, objZ3);
                    i9 |= 2;
                } else {
                    if (iE != 2) {
                        throw new p(iE);
                    }
                    objZ4 = cVarB.z(descriptor2, 2, N0.f32043a, objZ4);
                    i9 |= 4;
                }
            }
            i8 = i9;
            str = strF;
            objZ = objZ3;
            objZ2 = objZ4;
        }
        cVarB.c(descriptor2);
        return new PaywallData.LocalizedConfiguration.Feature(i8, str, (String) objZ, (String) objZ2, (I0) null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallData.LocalizedConfiguration.Feature value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public p116m7.b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
