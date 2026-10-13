package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X0 extends W0 {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final void a(Object obj) {
        ((AbstractC1899h1) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final void b(I2 i8, Map.Entry entry) {
        C1904i1 c1904i1 = (C1904i1) entry.getKey();
        G2 g8 = G2.f17953b;
        switch (c1904i1.f18581b.ordinal()) {
            case 0:
                i8.r(c1904i1.f18580a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                i8.v(c1904i1.f18580a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                i8.g(c1904i1.f18580a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                i8.F(c1904i1.f18580a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                i8.p(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                i8.D(c1904i1.f18580a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                i8.e(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                i8.f(c1904i1.f18580a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                i8.b(c1904i1.f18580a, (String) entry.getValue());
                break;
            case 9:
                i8.K(c1904i1.f18580a, entry.getValue(), U1.a().b(entry.getValue().getClass()));
                break;
            case 10:
                i8.I(c1904i1.f18580a, entry.getValue(), U1.a().b(entry.getValue().getClass()));
                break;
            case 11:
                i8.J(c1904i1.f18580a, (J0) entry.getValue());
                break;
            case 12:
                i8.c(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                i8.p(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                i8.y(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                i8.m(c1904i1.f18580a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                i8.C(c1904i1.f18580a, ((Integer) entry.getValue()).intValue());
                break;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                i8.s(c1904i1.f18580a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
