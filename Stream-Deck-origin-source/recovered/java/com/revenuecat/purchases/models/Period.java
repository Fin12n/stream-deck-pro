package com.revenuecat.purchases.models;

import C6.m;
import C6.o;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i8) {
            return new Period[i8];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Factory {
        public /* synthetic */ Factory(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Period create(String iso8601) {
            t.g(iso8601, "iso8601");
            o period = PeriodKt.toPeriod(iso8601);
            return new Period(((Number) period.c()).intValue(), (Unit) period.d(), iso8601);
        }

        private Factory() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i8, Unit unit, String iso8601) {
        t.g(unit, "unit");
        t.g(iso8601, "iso8601");
        this.value = i8;
        this.unit = unit;
        this.iso8601 = iso8601;
    }

    public static /* synthetic */ Period copy$default(Period period, int i8, Unit unit, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = period.value;
        }
        if ((i9 & 2) != 0) {
            unit = period.unit;
        }
        if ((i9 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i8, unit, str);
    }

    public final int component1() {
        return this.value;
    }

    public final Unit component2() {
        return this.unit;
    }

    public final String component3() {
        return this.iso8601;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && t.c(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInMonths() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            return ((double) this.value) / 30.0d;
        }
        if (i8 == 2) {
            return ((double) this.value) / 4.345238095238096d;
        }
        if (i8 == 3) {
            return this.value;
        }
        if (i8 == 4) {
            return ((double) this.value) * 12.0d;
        }
        if (i8 != 5) {
            throw new m();
        }
        LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
        return 0.0d;
    }

    public final double getValueInWeeks$purchases_defaultsRelease() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i8 == 2) {
            return this.value;
        }
        if (i8 == 3) {
            return ((double) this.value) * 4.345238095238096d;
        }
        if (i8 == 4) {
            return ((double) this.value) * 52.142857142857146d;
        }
        if (i8 != 5) {
            throw new m();
        }
        LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
        return 0.0d;
    }

    public final double getValueInYears$purchases_defaultsRelease() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            return ((double) this.value) / 365.0d;
        }
        if (i8 == 2) {
            return ((double) this.value) / 52.142857142857146d;
        }
        if (i8 == 3) {
            return ((double) this.value) / 12.0d;
        }
        if (i8 == 4) {
            return this.value;
        }
        if (i8 != 5) {
            throw new m();
        }
        LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
        return 0.0d;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        t.g(out, "out");
        out.writeInt(this.value);
        out.writeString(this.unit.name());
        out.writeString(this.iso8601);
    }

    public final Period copy(int i8, Unit unit, String iso8601) {
        t.g(unit, jULK.fZmPpIWFt);
        t.g(iso8601, "iso8601");
        return new Period(i8, unit, iso8601);
    }

    public String toString() {
        return "Period(value=" + this.value + cFAYKUlMj.bHpxfvZYD + this.unit + ", iso8601=" + this.iso8601 + ')';
    }
}
