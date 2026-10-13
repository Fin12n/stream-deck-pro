package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i8) {
            return new Price[i8];
        }
    }

    public Price(String formatted, long j8, String currencyCode) {
        t.g(formatted, "formatted");
        t.g(currencyCode, "currencyCode");
        this.formatted = formatted;
        this.amountMicros = j8;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j8, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = price.formatted;
        }
        if ((i8 & 2) != 0) {
            j8 = price.amountMicros;
        }
        if ((i8 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j8, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final long component2() {
        return this.amountMicros;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Price copy(String formatted, long j8, String currencyCode) {
        t.g(formatted, "formatted");
        t.g(currencyCode, "currencyCode");
        return new Price(formatted, j8, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return t.c(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && t.c(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return (((this.formatted.hashCode() * 31) + Long.hashCode(this.amountMicros)) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Price(formatted=" + this.formatted + ", amountMicros=" + this.amountMicros + ", currencyCode=" + this.currencyCode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        t.g(out, "out");
        out.writeString(this.formatted);
        out.writeLong(this.amountMicros);
        out.writeString(this.currencyCode);
    }
}
