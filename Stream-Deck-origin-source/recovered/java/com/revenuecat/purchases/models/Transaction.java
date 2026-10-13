package com.revenuecat.purchases.models;

import C6.InterfaceC0916e;
import H.FL.dCqzKmEghGTQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final String transactionIdentifier;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i8) {
            return new Transaction[i8];
        }
    }

    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate) {
        t.g(transactionIdentifier, "transactionIdentifier");
        t.g(revenuecatId, "revenuecatId");
        t.g(productIdentifier, "productIdentifier");
        t.g(productId, "productId");
        t.g(purchaseDate, "purchaseDate");
        this.transactionIdentifier = transactionIdentifier;
        this.revenuecatId = revenuecatId;
        this.productIdentifier = productIdentifier;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i8 & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        if ((i8 & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        if ((i8 & 8) != 0) {
            str4 = transaction.productId;
        }
        if ((i8 & 16) != 0) {
            date = transaction.purchaseDate;
        }
        Date date2 = date;
        String str5 = str3;
        return transaction.copy(str, str2, str5, str4, date2);
    }

    @InterfaceC0916e
    public static /* synthetic */ void getProductId$annotations() {
    }

    @InterfaceC0916e
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public final String component1() {
        return this.transactionIdentifier;
    }

    public final String component2() {
        return this.revenuecatId;
    }

    public final String component3() {
        return this.productIdentifier;
    }

    public final String component4() {
        return this.productId;
    }

    public final Date component5() {
        return this.purchaseDate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return t.c(this.transactionIdentifier, transaction.transactionIdentifier) && t.c(this.revenuecatId, transaction.revenuecatId) && t.c(this.productIdentifier, transaction.productIdentifier) && t.c(this.productId, transaction.productId) && t.c(this.purchaseDate, transaction.purchaseDate);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        return (((((((this.transactionIdentifier.hashCode() * 31) + this.revenuecatId.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseDate.hashCode();
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ')';
    }

    public final Transaction copy(String transactionIdentifier, String revenuecatId, String productIdentifier, String str, Date purchaseDate) {
        t.g(transactionIdentifier, "transactionIdentifier");
        t.g(revenuecatId, "revenuecatId");
        t.g(productIdentifier, "productIdentifier");
        t.g(str, kDsnNkYbBsI.TromyI);
        t.g(purchaseDate, "purchaseDate");
        return new Transaction(transactionIdentifier, revenuecatId, productIdentifier, str, purchaseDate);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        t.g(parcel, dCqzKmEghGTQ.uPsxN);
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(String productId, JSONObject jsonObject) throws JSONException {
        t.g(productId, "productId");
        t.g(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        t.f(string, "jsonObject.getString(\"id\")");
        String string2 = jsonObject.getString("id");
        t.f(string2, "jsonObject.getString(\"id\")");
        this(string, string2, productId, productId, JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date"));
    }
}
