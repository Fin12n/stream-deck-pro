package com.amazon.a.a.o.b;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16777a = ",";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16778b = "=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16779c = "|";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16780d = new com.amazon.a.a.o.c("SignedToken");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f16781e = new HashMap();

    private void a(String str, String str2, PublicKey publicKey) throws com.amazon.a.a.o.b.a.c {
        if (!e.a(str, str2, publicKey)) {
            throw new com.amazon.a.a.o.b.a.c();
        }
    }

    private String b(String str) throws com.amazon.a.a.o.b.a.b {
        try {
            return new String(com.amazon.c.a.a.c.c(str.getBytes()));
        } catch (IOException e8) {
            throw com.amazon.a.a.o.b.a.b.a((Throwable) e8);
        }
    }

    private void c(String str) throws com.amazon.a.a.o.b.a.b {
        StringTokenizer stringTokenizer = new StringTokenizer(str, f16777a);
        while (stringTokenizer.hasMoreElements()) {
            String strNextToken = stringTokenizer.nextToken();
            com.amazon.a.a.o.c cVar = f16780d;
            cVar.a("Field: " + strNextToken);
            int iIndexOf = strNextToken.indexOf(f16778b);
            if (iIndexOf == -1) {
                throw com.amazon.a.a.o.b.a.b.d();
            }
            String strSubstring = strNextToken.substring(0, iIndexOf);
            String strSubstring2 = strNextToken.substring(iIndexOf + 1);
            cVar.a("FieldName: " + strSubstring);
            cVar.a("FieldValue: " + strSubstring2);
            this.f16781e.put(strSubstring, strSubstring2);
        }
    }

    public String toString() {
        return "Signed Token: " + this.f16781e;
    }

    public f(String str, PublicKey publicKey) throws com.amazon.a.a.o.b.a.c, com.amazon.a.a.o.b.a.b {
        String strB = b(str);
        int iLastIndexOf = strB.lastIndexOf(f16779c);
        if (iLastIndexOf != -1) {
            String strSubstring = strB.substring(0, iLastIndexOf);
            String strSubstring2 = strB.substring(iLastIndexOf + 1);
            if (com.amazon.a.a.o.c.f16782a) {
                com.amazon.a.a.o.c cVar = f16780d;
                cVar.a("Token data: " + strSubstring);
                cVar.a(HRHLwtyqJWz.SgdqqHUYLhmjS + strSubstring2);
            }
            a(strSubstring, strSubstring2, publicKey);
            c(strSubstring);
            return;
        }
        throw com.amazon.a.a.o.b.a.b.d();
    }

    public String a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f16781e.get(str);
    }
}
