package com.google.android.gms.auth.api.signin;

import A4.a;
import A4.c;
import F4.b;
import F4.d;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new p171t4.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f17881n = d.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f17887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f17891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f17894m = new HashSet();

    public GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List list, String str7, String str8) {
        this.f17882a = i8;
        this.f17883b = str;
        this.f17884c = str2;
        this.f17885d = str3;
        this.f17886e = str4;
        this.f17887f = uri;
        this.f17888g = str5;
        this.f17889h = j8;
        this.f17890i = str6;
        this.f17891j = list;
        this.f17892k = str7;
        this.f17893l = str8;
    }

    public static GoogleSignInAccount j(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), AbstractC3207p.e(str7), new ArrayList((Collection) AbstractC3207p.k(set)), str5, str6);
    }

    public static GoogleSignInAccount k(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        GoogleSignInAccount googleSignInAccountJ = j(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j8), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountJ.f17888g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountJ;
    }

    public String a() {
        return this.f17886e;
    }

    public String b() {
        return this.f17885d;
    }

    public String c() {
        return this.f17893l;
    }

    public String d() {
        return this.f17892k;
    }

    public String e() {
        return this.f17883b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f17890i.equals(this.f17890i) && googleSignInAccount.h().equals(h());
    }

    public String f() {
        return this.f17884c;
    }

    public Uri g() {
        return this.f17887f;
    }

    public Set h() {
        HashSet hashSet = new HashSet(this.f17891j);
        hashSet.addAll(this.f17894m);
        return hashSet;
    }

    public int hashCode() {
        return ((this.f17890i.hashCode() + 527) * 31) + h().hashCode();
    }

    public String i() {
        return this.f17888g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f17882a);
        c.n(parcel, 2, e(), false);
        c.n(parcel, 3, f(), false);
        c.n(parcel, 4, b(), false);
        c.n(parcel, 5, a(), false);
        c.m(parcel, 6, g(), i8, false);
        c.n(parcel, 7, i(), false);
        c.l(parcel, 8, this.f17889h);
        c.n(parcel, 9, this.f17890i, false);
        c.r(parcel, 10, this.f17891j, false);
        c.n(parcel, 11, d(), false);
        c.n(parcel, 12, c(), false);
        c.b(parcel, iA);
    }
}
