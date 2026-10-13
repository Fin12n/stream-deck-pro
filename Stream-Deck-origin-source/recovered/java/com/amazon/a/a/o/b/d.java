package com.amazon.a.a.o.b;

import P2.Lsk.mHPawN;
import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16768a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16769b = "AppstoreAuthenticationKey.pem";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16770c = "-----BEGIN PUBLIC KEY-----";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16771d = "-----END PUBLIC KEY-----";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16772e = "RSA";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f16773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16774g;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16768a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f16774g.a(com.amazon.a.a.m.c.f16553a);
        if (com.amazon.a.a.o.c.f16782a) {
            com.amazon.a.a.o.c cVar = f16768a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    @Override // com.amazon.a.a.o.b.b
    public PublicKey a() throws Throwable {
        if (com.amazon.a.a.o.c.f16782a) {
            f16768a.a("Loading data authentication key...");
        }
        PublicKey publicKeyB = b();
        if (publicKeyB != null) {
            return publicKeyB;
        }
        PublicKey publicKeyC = c();
        a(publicKeyC);
        return publicKeyC;
    }

    private PublicKey c() throws Throwable {
        if (com.amazon.a.a.o.c.f16782a) {
            f16768a.a("Loading authentication key from apk...");
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f16773f.getAssets().open(f16769b)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                if (com.amazon.a.a.o.c.f16782a) {
                                    f16768a.b("Failed to close stream", e8);
                                }
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        f16768a.b(mHPawN.ltawW, e);
                        throw com.amazon.a.a.o.b.a.a.d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                if (com.amazon.a.a.o.c.f16782a) {
                                    f16768a.b("Failed to close stream", e10);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return a(sb.toString());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16768a.a("Placing auth key into storage");
        }
        this.f16774g.a(com.amazon.a.a.m.c.f16553a, publicKey);
    }

    public PublicKey a(String str) throws com.amazon.a.a.o.b.a.a {
        try {
            return KeyFactory.getInstance(f16772e).generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace(f16770c, "").replace(f16771d, ""))));
        } catch (Exception e8) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e8);
        }
    }
}
