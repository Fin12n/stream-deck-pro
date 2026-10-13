package com.revenuecat.purchases.common;

import Z6.v;
import com.revenuecat.purchases.PackageType;
import kotlin.jvm.internal.t;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                packageType = packageTypeArrValues[i8];
                if (t.c(packageType.getIdentifier(), str)) {
                    break;
                }
                i8++;
            } else {
                packageType = null;
                break;
            }
        }
        if (packageType == null) {
            if (v.H(str, bGZGhbtQmA.gHJuzdcdOiPW, false, 2, null)) {
                return PackageType.UNKNOWN;
            }
            return PackageType.CUSTOM;
        }
        return packageType;
    }
}
