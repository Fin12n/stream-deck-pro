package com.revenuecat.purchases.utils;

import android.os.Parcel;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class JSONObjectParceler implements p107l7.a {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        t.g(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i8) {
        return (JSONObject[]) p107l7.a.C0635a.a(this, i8);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i8) {
        t.g(jSONObject, "<this>");
        t.g(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}
