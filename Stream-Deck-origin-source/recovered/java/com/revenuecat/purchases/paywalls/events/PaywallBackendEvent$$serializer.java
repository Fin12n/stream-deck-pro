package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import E4.JFpq.XRlnZWSrAFn;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.p;
import p7.c;
import p7.d;
import p7.e;
import q7.C2837f0;
import q7.C2842i;
import q7.C2874y0;
import q7.K;
import q7.N0;
import q7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0916e
public final class PaywallBackendEvent$$serializer implements K {
    public static final PaywallBackendEvent$$serializer INSTANCE;
    private static final /* synthetic */ C2874y0 descriptor;

    private PaywallBackendEvent$$serializer() {
    }

    @Override // q7.K
    public b[] childSerializers() {
        N0 n8 = N0.f32043a;
        U u8 = U.f32069a;
        return new b[]{n8, u8, n8, n8, n8, n8, u8, C2837f0.f32101a, n8, C2842i.f32115a, n8};
    }

    @Override // p116m7.a
    public PaywallBackendEvent deserialize(e decoder) {
        String strF;
        int i8;
        String strF2;
        boolean z8;
        String str;
        int i9;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        long j8;
        t.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 0;
        if (cVarB.x()) {
            strF = cVarB.f(descriptor2, 0);
            int iN = cVarB.n(descriptor2, 1);
            String strF3 = cVarB.f(descriptor2, 2);
            String strF4 = cVarB.f(descriptor2, 3);
            String strF5 = cVarB.f(descriptor2, 4);
            String strF6 = cVarB.f(descriptor2, 5);
            int iN2 = cVarB.n(descriptor2, 6);
            long jD = cVarB.D(descriptor2, 7);
            String strF7 = cVarB.f(descriptor2, 8);
            boolean zE = cVarB.e(descriptor2, 9);
            strF2 = cVarB.f(descriptor2, 10);
            z8 = zE;
            str = strF7;
            i9 = iN2;
            str2 = strF6;
            str3 = strF4;
            i8 = 2047;
            str4 = strF5;
            str5 = strF3;
            i10 = iN;
            j8 = jD;
        } else {
            strF = null;
            String strF8 = null;
            String strF9 = null;
            String strF10 = null;
            String strF11 = null;
            String strF12 = null;
            boolean z9 = true;
            int iN3 = 0;
            int iN4 = 0;
            long jD2 = 0;
            String strF13 = null;
            boolean zE2 = false;
            while (z9) {
                int iE = cVarB.E(descriptor2);
                switch (iE) {
                    case HTTPClient.NO_STATUS_CODE /* -1 */:
                        z9 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        strF = cVarB.f(descriptor2, 0);
                        continue;
                    case 1:
                        iN4 = cVarB.n(descriptor2, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        strF12 = cVarB.f(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        strF10 = cVarB.f(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        strF11 = cVarB.f(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        strF9 = cVarB.f(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        iN3 = cVarB.n(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        jD2 = cVarB.D(descriptor2, 7);
                        i11 |= 128;
                        break;
                    case 8:
                        strF8 = cVarB.f(descriptor2, 8);
                        i11 |= 256;
                        break;
                    case 9:
                        zE2 = cVarB.e(descriptor2, 9);
                        i11 |= 512;
                        break;
                    case 10:
                        strF13 = cVarB.f(descriptor2, 10);
                        i11 |= 1024;
                        break;
                    default:
                        throw new p(iE);
                }
            }
            i8 = i11;
            strF2 = strF13;
            z8 = zE2;
            str = strF8;
            i9 = iN3;
            str2 = strF9;
            str3 = strF10;
            str4 = strF11;
            str5 = strF12;
            i10 = iN4;
            j8 = jD2;
        }
        String str6 = strF;
        cVarB.c(descriptor2);
        return new PaywallBackendEvent(i8, str6, i10, str5, str3, str4, str2, i9, j8, str, z8, strF2, null);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, PaywallBackendEvent value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        f descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallBackendEvent.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // q7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }

    static {
        PaywallBackendEvent$$serializer paywallBackendEvent$$serializer = new PaywallBackendEvent$$serializer();
        INSTANCE = paywallBackendEvent$$serializer;
        C2874y0 c2874y0 = new C2874y0("com.revenuecat.purchases.paywalls.events.PaywallBackendEvent", paywallBackendEvent$$serializer, 11);
        c2874y0.l("id", false);
        c2874y0.l(DiagnosticsEntry.VERSION_KEY, false);
        c2874y0.l("type", false);
        c2874y0.l(Backend.APP_USER_ID, false);
        c2874y0.l("session_id", false);
        c2874y0.l("offering_id", false);
        c2874y0.l("paywall_revision", false);
        c2874y0.l(DiagnosticsEntry.TIMESTAMP_KEY, false);
        c2874y0.l("display_mode", false);
        c2874y0.l("dark_mode", false);
        c2874y0.l(XRlnZWSrAFn.IrB, false);
        descriptor = c2874y0;
    }
}
