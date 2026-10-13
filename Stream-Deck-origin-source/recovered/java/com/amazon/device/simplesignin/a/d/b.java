package com.amazon.device.simplesignin.a.d;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17330a = "b";

    private b() {
    }

    public static List<Link> a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                a.a(f17330a, "No links available, links object received is empty.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i8);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f17266z));
                    link.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f17265y));
                    link.setPartnerUserId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f17229A));
                    link.setLinkedTimestamp(jSONObject.getLong(com.amazon.device.simplesignin.a.a.a.f17230B));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f17231C));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString(kDsnNkYbBsI.smoESo));
                    link.setSsiToken(token);
                    arrayList.add(link);
                } catch (JSONException e8) {
                    a.b(f17330a, "Failure generating Link object from response." + e8);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e9) {
            a.b(f17330a, "Failure generating Link object from Kiwi response." + e9);
            return null;
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).getString(com.amazon.device.simplesignin.a.a.a.f17265y);
        } catch (JSONException e8) {
            a.b(f17330a, "Failure extracting Link ID object from response." + e8);
            return null;
        }
    }
}
