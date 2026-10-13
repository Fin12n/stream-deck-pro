package com.revenuecat.purchases.models;

import C6.m;
import C6.o;
import S6.c;
import Z6.h;
import Z6.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PeriodKt {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o toPeriod(String str) {
        Period.Unit unit;
        double d8;
        double d9;
        double d10;
        h hVarC = new j("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").c(str);
        if (hVarC == null) {
            return new o(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        h.b bVarA = hVarC.a();
        String str2 = (String) bVarA.a().b().get(1);
        String str3 = (String) bVarA.a().b().get(2);
        String str4 = (String) bVarA.a().b().get(3);
        String str5 = (String) bVarA.a().b().get(4);
        int iIntValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str2)).intValue();
        int iIntValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str3)).intValue();
        int iIntValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str4)).intValue();
        int iIntValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str5)).intValue();
        if (iIntValue4 > 0) {
            unit = Period.Unit.DAY;
        } else if (iIntValue3 > 0) {
            unit = Period.Unit.WEEK;
        } else if (iIntValue2 > 0) {
            unit = Period.Unit.MONTH;
        } else {
            unit = iIntValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                d9 = ((double) iIntValue) * 12.0d;
                d10 = iIntValue2;
            } else if (i8 == 3) {
                d9 = (((double) iIntValue) * 52.142857142857146d) + (((double) iIntValue2) * 4.345238095238096d);
                d10 = iIntValue3;
            } else if (i8 == 4) {
                d9 = (((double) iIntValue) * 365.0d) + (((double) iIntValue2) * 30.0d) + (((double) iIntValue3) * 7.0d);
                d10 = iIntValue4;
            } else {
                if (i8 != 5) {
                    throw new m();
                }
                d8 = 0.0d;
            }
            d8 = d9 + d10;
        } else {
            d8 = iIntValue;
        }
        return new o(Integer.valueOf(c.c(d8)), unit);
    }
}
