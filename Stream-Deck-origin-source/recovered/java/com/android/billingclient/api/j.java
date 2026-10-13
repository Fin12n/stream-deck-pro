package com.android.billingclient.api;

import com.revenuecat.purchases.google.ErrorsKt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final d f17467A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final d f17468B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final d f17469C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final d f17470D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final d f17471E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final d f17472F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f17473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f17474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f17475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f17476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f17477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f17478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f17479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f17480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f17481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f17482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f17483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f17484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f17485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f17486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f17487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f17488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f17489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f17490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f17491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f17492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f17493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f17494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f17495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f17496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f17497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f17498z;

    static {
        d.a aVarC = d.c();
        aVarC.c(3);
        aVarC.b(ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE);
        f17473a = aVarC.a();
        d.a aVarC2 = d.c();
        aVarC2.c(3);
        aVarC2.b("Google Play In-app Billing API version is less than 9");
        f17474b = aVarC2.a();
        d.a aVarC3 = d.c();
        aVarC3.c(3);
        aVarC3.b("Billing service unavailable on device.");
        f17475c = aVarC3.a();
        d.a aVarC4 = d.c();
        aVarC4.c(5);
        aVarC4.b("Client is already in the process of connecting to billing service.");
        f17476d = aVarC4.a();
        d.a aVarC5 = d.c();
        aVarC5.c(5);
        aVarC5.b("The list of SKUs can't be empty.");
        f17477e = aVarC5.a();
        d.a aVarC6 = d.c();
        aVarC6.c(5);
        aVarC6.b("SKU type can't be empty.");
        f17478f = aVarC6.a();
        d.a aVarC7 = d.c();
        aVarC7.c(5);
        aVarC7.b("Product type can't be empty.");
        f17479g = aVarC7.a();
        d.a aVarC8 = d.c();
        aVarC8.c(-2);
        aVarC8.b("Client does not support extra params.");
        f17480h = aVarC8.a();
        d.a aVarC9 = d.c();
        aVarC9.c(5);
        aVarC9.b("Invalid purchase token.");
        f17481i = aVarC9.a();
        d.a aVarC10 = d.c();
        aVarC10.c(6);
        aVarC10.b("An internal error occurred.");
        f17482j = aVarC10.a();
        d.a aVarC11 = d.c();
        aVarC11.c(5);
        aVarC11.b("SKU can't be null.");
        f17483k = aVarC11.a();
        d.a aVarC12 = d.c();
        aVarC12.c(0);
        f17484l = aVarC12.a();
        d.a aVarC13 = d.c();
        aVarC13.c(-1);
        aVarC13.b("Service connection is disconnected.");
        f17485m = aVarC13.a();
        d.a aVarC14 = d.c();
        aVarC14.c(2);
        aVarC14.b("Timeout communicating with service.");
        f17486n = aVarC14.a();
        d.a aVarC15 = d.c();
        aVarC15.c(-2);
        aVarC15.b("Client does not support subscriptions.");
        f17487o = aVarC15.a();
        d.a aVarC16 = d.c();
        aVarC16.c(-2);
        aVarC16.b("Client does not support subscriptions update.");
        f17488p = aVarC16.a();
        d.a aVarC17 = d.c();
        aVarC17.c(-2);
        aVarC17.b("Client does not support get purchase history.");
        f17489q = aVarC17.a();
        d.a aVarC18 = d.c();
        aVarC18.c(-2);
        aVarC18.b("Client does not support price change confirmation.");
        f17490r = aVarC18.a();
        d.a aVarC19 = d.c();
        aVarC19.c(-2);
        aVarC19.b("Play Store version installed does not support cross selling products.");
        f17491s = aVarC19.a();
        d.a aVarC20 = d.c();
        aVarC20.c(-2);
        aVarC20.b("Client does not support multi-item purchases.");
        f17492t = aVarC20.a();
        d.a aVarC21 = d.c();
        aVarC21.c(-2);
        aVarC21.b("Client does not support offer_id_token.");
        f17493u = aVarC21.a();
        d.a aVarC22 = d.c();
        aVarC22.c(-2);
        aVarC22.b("Client does not support ProductDetails.");
        f17494v = aVarC22.a();
        d.a aVarC23 = d.c();
        aVarC23.c(-2);
        aVarC23.b("Client does not support in-app messages.");
        f17495w = aVarC23.a();
        d.a aVarC24 = d.c();
        aVarC24.c(-2);
        aVarC24.b("Client does not support user choice billing.");
        f17496x = aVarC24.a();
        d.a aVarC25 = d.c();
        aVarC25.c(-2);
        aVarC25.b("Play Store version installed does not support external offer.");
        f17497y = aVarC25.a();
        d.a aVarC26 = d.c();
        aVarC26.c(5);
        aVarC26.b("Unknown feature");
        f17498z = aVarC26.a();
        d.a aVarC27 = d.c();
        aVarC27.c(-2);
        aVarC27.b("Play Store version installed does not support get billing config.");
        f17467A = aVarC27.a();
        d.a aVarC28 = d.c();
        aVarC28.c(-2);
        aVarC28.b("Query product details with serialized docid is not supported.");
        f17468B = aVarC28.a();
        d.a aVarC29 = d.c();
        aVarC29.c(4);
        aVarC29.b("Item is unavailable for purchase.");
        f17469C = aVarC29.a();
        d.a aVarC30 = d.c();
        aVarC30.c(-2);
        aVarC30.b("Query product details with developer specified account is not supported.");
        f17470D = aVarC30.a();
        d.a aVarC31 = d.c();
        aVarC31.c(-2);
        aVarC31.b("Play Store version installed does not support alternative billing only.");
        f17471E = aVarC31.a();
        d.a aVarC32 = d.c();
        aVarC32.c(5);
        aVarC32.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f17472F = aVarC32.a();
    }

    public static d a(int i8, String str) {
        d.a aVarC = d.c();
        aVarC.c(i8);
        aVarC.b(str);
        return aVarC.a();
    }
}
