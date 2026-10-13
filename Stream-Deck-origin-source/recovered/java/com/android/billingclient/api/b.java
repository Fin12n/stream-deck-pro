package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.google.android.gms.internal.play_billing.AbstractC1995b;
import com.google.android.gms.internal.play_billing.AbstractC2027j;
import com.google.android.gms.internal.play_billing.AbstractC2047o;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C1998b2;
import com.google.android.gms.internal.play_billing.C2034k2;
import com.google.android.gms.internal.play_billing.C2038l2;
import com.google.android.gms.internal.play_billing.C2058q2;
import com.google.android.gms.internal.play_billing.K2;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.X1;
import com.google.android.gms.internal.play_billing.s2;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import p116m7.kKPq.toqHM;
import p138p3.C;
import p138p3.C2761a;
import p138p3.C2762a0;
import p138p3.C2771f;
import p138p3.C2773h;
import p138p3.C2774i;
import p138p3.C2781p;
import p138p3.C2782q;
import p138p3.D;
import p138p3.E;
import p138p3.InterfaceC2763b;
import p138p3.InterfaceC2765c;
import p138p3.InterfaceC2768d0;
import p138p3.InterfaceC2769e;
import p138p3.InterfaceC2772g;
import p138p3.InterfaceC2775j;
import p138p3.InterfaceC2777l;
import p138p3.InterfaceC2778m;
import p138p3.InterfaceC2779n;
import p138p3.InterfaceC2780o;
import p138p3.L;
import p138p3.M;
import p138p3.T;
import p138p3.V;
import p138p3.W;
import p138p3.l0;
import p138p3.m0;
import p138p3.w0;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17352A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ExecutorService f17353B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f17354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f17356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w0 f17357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f17358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W f17359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile K2 f17360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile h f17361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f17379z;

    public b(String str, Context context, W w8, ExecutorService executorService) {
        this.f17354a = 0;
        this.f17356c = new Handler(Looper.getMainLooper());
        this.f17364k = 0;
        String strV = V();
        this.f17355b = strV;
        this.f17358e = context.getApplicationContext();
        C2034k2 c2034k2E = C2038l2.E();
        c2034k2E.r(strV);
        c2034k2E.q(this.f17358e.getPackageName());
        this.f17359f = new C2762a0(this.f17358e, (C2038l2) c2034k2E.h());
        this.f17358e.getPackageName();
    }

    public static /* bridge */ /* synthetic */ l0 O(b bVar, String str, int i8) {
        B.i("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = B.c(bVar.f17367n, bVar.f17375v, bVar.f17379z.a(), bVar.f17379z.b(), bVar.f17355b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleK = bVar.f17367n ? bVar.f17360g.K(true != bVar.f17375v ? 9 : 19, bVar.f17358e.getPackageName(), str, string, bundleC) : bVar.f17360g.u(3, bVar.f17358e.getPackageName(), str, string);
                m0 m0VarA = q.a(bundleK, "BillingClient", "getPurchase()");
                d dVarA = m0VarA.a();
                if (dVarA != j.f17484l) {
                    bVar.X(V.a(m0VarA.b(), 9, dVarA));
                    return new l0(dVarA, list);
                }
                ArrayList<String> stringArrayList = bundleK.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleK.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleK.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z8 = false;
                for (int i9 = 0; i9 < stringArrayList2.size(); i9++) {
                    String str2 = stringArrayList2.get(i9);
                    String str3 = stringArrayList3.get(i9);
                    B.i("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i9))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.f())) {
                            B.j("BillingClient", "BUG: empty/null token!");
                            z8 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e8) {
                        B.k("BillingClient", "Got an exception trying to decode the purchase!", e8);
                        d dVar = j.f17482j;
                        bVar.X(V.a(51, 9, dVar));
                        return new l0(dVar, null);
                    }
                }
                if (z8) {
                    bVar.X(V.a(26, 9, j.f17482j));
                }
                string = bundleK.getString("INAPP_CONTINUATION_TOKEN");
                B.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new l0(j.f17484l, arrayList);
                }
                list = null;
            } catch (Exception e9) {
                d dVar2 = j.f17485m;
                bVar.X(V.a(52, 9, dVar2));
                B.k("BillingClient", "Got exception trying to get purchasesm try to reconnect", e9);
                return new l0(dVar2, null);
            }
        }
    }

    public static String V() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public static /* bridge */ /* synthetic */ M i0(b bVar, String str) {
        B.i("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = B.c(bVar.f17367n, bVar.f17375v, bVar.f17379z.a(), bVar.f17379z.b(), bVar.f17355b);
        String string = null;
        while (bVar.f17365l) {
            try {
                Bundle bundleO = bVar.f17360g.o(6, bVar.f17358e.getPackageName(), str, string, bundleC);
                m0 m0VarA = q.a(bundleO, "BillingClient", "getPurchaseHistory()");
                d dVarA = m0VarA.a();
                if (dVarA != j.f17484l) {
                    bVar.X(V.a(m0VarA.b(), 11, dVarA));
                    return new M(dVarA, null);
                }
                ArrayList<String> stringArrayList = bundleO.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleO.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleO.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z8 = false;
                for (int i8 = 0; i8 < stringArrayList2.size(); i8++) {
                    String str2 = stringArrayList2.get(i8);
                    String str3 = stringArrayList3.get(i8);
                    B.i("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i8))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            B.j("BillingClient", "BUG: empty/null token!");
                            z8 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e8) {
                        B.k("BillingClient", "Got an exception trying to decode the purchase!", e8);
                        d dVar = j.f17482j;
                        bVar.X(V.a(51, 11, dVar));
                        return new M(dVar, null);
                    }
                }
                if (z8) {
                    bVar.X(V.a(26, 11, j.f17482j));
                }
                string = bundleO.getString("INAPP_CONTINUATION_TOKEN");
                B.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new M(j.f17484l, arrayList);
                }
            } catch (RemoteException e9) {
                B.k("BillingClient", "Got exception trying to get purchase history, try to reconnect", e9);
                d dVar2 = j.f17485m;
                bVar.X(V.a(59, 11, dVar2));
                return new M(dVar2, null);
            }
        }
        B.j("BillingClient", "getPurchaseHistory is not supported on current device");
        return new M(j.f17489q, null);
    }

    public final /* synthetic */ void F(InterfaceC2763b interfaceC2763b) {
        d dVar = j.f17486n;
        X(V.a(24, 3, dVar));
        interfaceC2763b.a(dVar);
    }

    public final /* synthetic */ void G(d dVar) {
        if (this.f17357d.d() != null) {
            this.f17357d.d().onPurchasesUpdated(dVar, null);
        } else {
            B.j("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void H(InterfaceC2772g interfaceC2772g, C2771f c2771f) {
        d dVar = j.f17486n;
        X(V.a(24, 4, dVar));
        interfaceC2772g.a(dVar, c2771f.a());
    }

    public final /* synthetic */ void I(InterfaceC2769e interfaceC2769e) {
        d dVar = j.f17486n;
        X(V.a(24, 13, dVar));
        interfaceC2769e.a(dVar, null);
    }

    public final /* synthetic */ void J(InterfaceC2777l interfaceC2777l) {
        d dVar = j.f17486n;
        X(V.a(24, 7, dVar));
        interfaceC2777l.a(dVar, new ArrayList());
    }

    public final /* synthetic */ void L(InterfaceC2778m interfaceC2778m) {
        d dVar = j.f17486n;
        X(V.a(24, 11, dVar));
        interfaceC2778m.a(dVar, null);
    }

    public final /* synthetic */ void M(InterfaceC2779n interfaceC2779n) {
        d dVar = j.f17486n;
        X(V.a(24, 9, dVar));
        interfaceC2779n.a(dVar, AbstractC2027j.G());
    }

    public final Handler R() {
        return Looper.myLooper() == null ? this.f17356c : new Handler(Looper.myLooper());
    }

    public final d S(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f17356c.post(new Runnable() { // from class: p3.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31232a.G(dVar);
            }
        });
        return dVar;
    }

    public final d T() {
        return (this.f17354a == 0 || this.f17354a == 3) ? j.f17485m : j.f17482j;
    }

    public final String U(g gVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f17358e.getPackageName();
        }
        return null;
    }

    public final Future W(Callable callable, long j8, final Runnable runnable, Handler handler) {
        if (this.f17353B == null) {
            this.f17353B = Executors.newFixedThreadPool(B.f18730a, new p138p3.B(this));
        }
        try {
            final Future futureSubmit = this.f17353B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: p3.E0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    B.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j8 * 0.95d));
            return futureSubmit;
        } catch (Exception e8) {
            B.k("BillingClient", "Async task throws exception!", e8);
            return null;
        }
    }

    public final void X(R1 r8) {
        this.f17359f.d(r8, this.f17364k);
    }

    public final void Y(V1 v8) {
        this.f17359f.b(v8, this.f17364k);
    }

    public final void Z(String str, final InterfaceC2778m interfaceC2778m) {
        if (!f()) {
            d dVar = j.f17485m;
            X(V.a(2, 11, dVar));
            interfaceC2778m.a(dVar, null);
        } else if (W(new D(this, str, interfaceC2778m), 30000L, new Runnable() { // from class: p3.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f31219a.L(interfaceC2778m);
            }
        }, R()) == null) {
            d dVarT = T();
            X(V.a(25, 11, dVarT));
            interfaceC2778m.a(dVarT, null);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void a(final C2761a c2761a, final InterfaceC2763b interfaceC2763b) {
        if (!f()) {
            d dVar = j.f17485m;
            X(V.a(2, 3, dVar));
            interfaceC2763b.a(dVar);
            return;
        }
        if (TextUtils.isEmpty(c2761a.a())) {
            B.j("BillingClient", "Please provide a valid purchase token.");
            d dVar2 = j.f17481i;
            X(V.a(26, 3, dVar2));
            interfaceC2763b.a(dVar2);
            return;
        }
        if (!this.f17367n) {
            d dVar3 = j.f17474b;
            X(V.a(27, 3, dVar3));
            interfaceC2763b.a(dVar3);
        } else if (W(new Callable() { // from class: p3.A0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f31154a.m0(c2761a, interfaceC2763b);
                return null;
            }
        }, 30000L, new Runnable() { // from class: p3.B0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31159a.F(interfaceC2763b);
            }
        }, R()) == null) {
            d dVarT = T();
            X(V.a(25, 3, dVarT));
            interfaceC2763b.a(dVarT);
        }
    }

    public final void a0(String str, final InterfaceC2779n interfaceC2779n) {
        if (!f()) {
            d dVar = j.f17485m;
            X(V.a(2, 9, dVar));
            interfaceC2779n.a(dVar, AbstractC2027j.G());
        } else {
            if (TextUtils.isEmpty(str)) {
                B.j("BillingClient", "Please provide a valid product type.");
                d dVar2 = j.f17479g;
                X(V.a(50, 9, dVar2));
                interfaceC2779n.a(dVar2, AbstractC2027j.G());
                return;
            }
            if (W(new C(this, str, interfaceC2779n), 30000L, new Runnable() { // from class: p3.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31208a.M(interfaceC2779n);
                }
            }, R()) == null) {
                d dVarT = T();
                X(V.a(25, 9, dVarT));
                interfaceC2779n.a(dVarT, AbstractC2027j.G());
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public final void b(final C2771f c2771f, final InterfaceC2772g interfaceC2772g) {
        if (!f()) {
            d dVar = j.f17485m;
            X(V.a(2, 4, dVar));
            interfaceC2772g.a(dVar, c2771f.a());
        } else if (W(new Callable() { // from class: p3.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f31210a.n0(c2771f, interfaceC2772g);
                return null;
            }
        }, 30000L, new Runnable() { // from class: p3.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f31213a.H(interfaceC2772g, c2771f);
            }
        }, R()) == null) {
            d dVarT = T();
            X(V.a(25, 4, dVarT));
            interfaceC2772g.a(dVarT, c2771f.a());
        }
    }

    public final boolean b0() {
        return this.f17375v && this.f17379z.b();
    }

    @Override // com.android.billingclient.api.a
    public final void c() {
        Y(V.c(12));
        try {
            try {
                if (this.f17357d != null) {
                    this.f17357d.f();
                }
                if (this.f17361h != null) {
                    this.f17361h.c();
                }
                if (this.f17361h != null && this.f17360g != null) {
                    B.i("BillingClient", "Unbinding from service.");
                    this.f17358e.unbindService(this.f17361h);
                    this.f17361h = null;
                }
                this.f17360g = null;
                ExecutorService executorService = this.f17353B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f17353B = null;
                }
            } catch (Exception e8) {
                B.k("BillingClient", "There was an exception while ending connection!", e8);
            }
        } finally {
            this.f17354a = 3;
        }
    }

    public final void c0(d dVar, int i8, int i9) {
        V1 v8 = null;
        R1 r8 = null;
        if (dVar.b() == 0) {
            int i10 = V.f31181a;
            try {
                U1 u1D = V1.D();
                u1D.q(5);
                C2058q2 c2058q2C = s2.C();
                c2058q2C.p(i9);
                u1D.p((s2) c2058q2C.h());
                v8 = (V1) u1D.h();
            } catch (Exception e8) {
                B.k("BillingLogger", "Unable to create logging payload", e8);
            }
            Y(v8);
            return;
        }
        int i11 = V.f31181a;
        try {
            Q1 q1F = R1.F();
            X1 x1F = C1998b2.F();
            x1F.r(dVar.b());
            x1F.q(dVar.a());
            x1F.s(i8);
            q1F.p(x1F);
            q1F.r(5);
            C2058q2 c2058q2C2 = s2.C();
            c2058q2C2.p(i9);
            q1F.q((s2) c2058q2C2.h());
            r8 = (R1) q1F.h();
        } catch (Exception e9) {
            B.k("BillingLogger", "Unable to create logging payload", e9);
        }
        X(r8);
    }

    @Override // com.android.billingclient.api.a
    public void d(C2773h c2773h, final InterfaceC2769e interfaceC2769e) {
        if (!f()) {
            B.j("BillingClient", "Service disconnected.");
            d dVar = j.f17485m;
            X(V.a(2, 13, dVar));
            interfaceC2769e.a(dVar, null);
            return;
        }
        if (!this.f17374u) {
            B.j("BillingClient", "Current client doesn't support get billing config.");
            d dVar2 = j.f17467A;
            X(V.a(32, 13, dVar2));
            interfaceC2769e.a(dVar2, null);
            return;
        }
        String str = this.f17355b;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (W(new Callable() { // from class: p3.C0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f31164a.o0(bundle, interfaceC2769e);
                return null;
            }
        }, 30000L, new Runnable() { // from class: p3.D0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31170a.I(interfaceC2769e);
            }
        }, R()) == null) {
            d dVarT = T();
            X(V.a(25, 13, dVarT));
            interfaceC2769e.a(dVarT, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.a
    public final d e(String str) {
        if (!f()) {
            d dVar = j.f17485m;
            if (dVar.b() != 0) {
                X(V.a(2, 5, dVar));
                return dVar;
            }
            Y(V.c(5));
            return dVar;
        }
        d dVar2 = j.f17473a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    d dVar3 = this.f17363j ? j.f17484l : j.f17488p;
                    c0(dVar3, 10, 3);
                    return dVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    d dVar4 = this.f17371r ? j.f17484l : j.f17491s;
                    c0(dVar4, 31, 6);
                    return dVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    d dVar5 = this.f17369p ? j.f17484l : j.f17495w;
                    c0(dVar5, 30, 5);
                    return dVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    d dVar6 = this.f17372s ? j.f17484l : j.f17492t;
                    c0(dVar6, 19, 8);
                    return dVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    d dVar7 = this.f17370q ? j.f17484l : j.f17493u;
                    c0(dVar7, 21, 7);
                    return dVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    d dVar8 = this.f17372s ? j.f17484l : j.f17492t;
                    c0(dVar8, 61, 9);
                    return dVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    d dVar9 = this.f17373t ? j.f17484l : j.f17494v;
                    c0(dVar9, 20, 10);
                    return dVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    d dVar10 = this.f17374u ? j.f17484l : j.f17467A;
                    c0(dVar10, 32, 11);
                    return dVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    d dVar11 = this.f17374u ? j.f17484l : j.f17468B;
                    c0(dVar11, 33, 12);
                    return dVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    d dVar12 = this.f17376w ? j.f17484l : j.f17470D;
                    c0(dVar12, 60, 13);
                    return dVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    d dVar13 = this.f17377x ? j.f17484l : j.f17471E;
                    c0(dVar13, 66, 14);
                    return dVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    d dVar14 = this.f17378y ? j.f17484l : j.f17497y;
                    c0(dVar14, 103, 18);
                    return dVar14;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    d dVar15 = this.f17366m ? j.f17484l : j.f17490r;
                    c0(dVar15, 35, 4);
                    return dVar15;
                }
                break;
            case 1987365622:
                if (str.equals(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS)) {
                    d dVar16 = this.f17362i ? j.f17484l : j.f17487o;
                    c0(dVar16, 9, 2);
                    return dVar16;
                }
                break;
        }
        B.j("BillingClient", "Unsupported feature: ".concat(str));
        d dVar17 = j.f17498z;
        c0(dVar17, 34, 1);
        return dVar17;
    }

    public final /* synthetic */ Bundle e0(int i8, String str, String str2, c cVar, Bundle bundle) {
        return this.f17360g.C(i8, this.f17358e.getPackageName(), str, str2, null, bundle);
    }

    @Override // com.android.billingclient.api.a
    public final boolean f() {
        return (this.f17354a != 2 || this.f17360g == null || this.f17361h == null) ? false : true;
    }

    public final /* synthetic */ Bundle f0(String str, String str2) {
        return this.f17360g.v(3, this.f17358e.getPackageName(), str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0405  */
    /* JADX WARN: Code duplicated, block: B:174:0x0436  */
    /* JADX WARN: Code duplicated, block: B:176:0x043a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x043f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0443  */
    /* JADX WARN: Code duplicated, block: B:181:0x0446  */
    @Override // com.android.billingclient.api.a
    public final d g(Activity activity, final c cVar) {
        String strD;
        String strE;
        String str;
        String str2;
        Future futureW;
        int i8;
        String str3;
        boolean z8;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z9;
        Intent intent;
        String str9;
        int i9;
        final int i10;
        String str10;
        final b bVar = this;
        String str11 = "proxyPackageVersion";
        if (bVar.f17357d == null || bVar.f17357d.d() == null) {
            d dVar = j.f17472F;
            bVar.X(V.a(12, 2, dVar));
            return dVar;
        }
        if (!bVar.f()) {
            d dVar2 = j.f17485m;
            bVar.X(V.a(2, 2, dVar2));
            bVar.S(dVar2);
            return dVar2;
        }
        ArrayList<SkuDetails> arrayListG = cVar.g();
        List listH = cVar.h();
        SkuDetails skuDetails = (SkuDetails) AbstractC2047o.a(arrayListG, null);
        c.b bVar2 = (c.b) AbstractC2047o.a(listH, null);
        if (skuDetails != null) {
            strD = skuDetails.a();
            strE = skuDetails.b();
        } else {
            strD = bVar2.b().d();
            strE = bVar2.b().e();
        }
        String str12 = "BillingClient";
        if (strE.equals("subs") && !bVar.f17362i) {
            B.j("BillingClient", "Current client doesn't support subscriptions.");
            d dVar3 = j.f17487o;
            bVar.X(V.a(9, 2, dVar3));
            bVar.S(dVar3);
            return dVar3;
        }
        if (cVar.q() && !bVar.f17365l) {
            B.j("BillingClient", "Current client doesn't support extra params for buy intent.");
            d dVar4 = j.f17480h;
            bVar.X(V.a(18, 2, dVar4));
            bVar.S(dVar4);
            return dVar4;
        }
        if (arrayListG.size() > 1 && !bVar.f17372s) {
            B.j("BillingClient", uYOhHhTXuF.kVrvQzlXXIQMGe);
            d dVar5 = j.f17492t;
            bVar.X(V.a(19, 2, dVar5));
            bVar.S(dVar5);
            return dVar5;
        }
        if (!listH.isEmpty() && !bVar.f17373t) {
            B.j("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            d dVar6 = j.f17494v;
            bVar.X(V.a(20, 2, dVar6));
            bVar.S(dVar6);
            return dVar6;
        }
        if (bVar.f17365l) {
            boolean z10 = bVar.f17367n;
            boolean z11 = bVar.f17375v;
            boolean zA = bVar.f17379z.a();
            boolean zB = bVar.f17379z.b();
            boolean z12 = bVar.f17352A;
            String str13 = bVar.f17355b;
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str13);
            if (cVar.b() != 0) {
                bundle.putInt(com.amazon.a.a.o.b.f16737l, cVar.b());
            }
            if (!TextUtils.isEmpty(cVar.c())) {
                bundle.putString("accountId", cVar.c());
            }
            if (!TextUtils.isEmpty(cVar.d())) {
                bundle.putString("obfuscatedProfileId", cVar.d());
            }
            if (cVar.p()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(cVar.e())) {
                bundle.putString("oldSkuPurchaseToken", cVar.e());
            }
            if (TextUtils.isEmpty(null)) {
                str3 = null;
            } else {
                str3 = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(cVar.f())) {
                bundle.putString("originalExternalTransactionId", cVar.f());
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("paymentsPurchaseParams", str10);
            }
            if (z10 && zA) {
                z8 = true;
                bundle.putBoolean(com.amazon.a.a.o.b.ac, true);
            } else {
                str10 = str3;
                z8 = true;
            }
            if (z11 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z8);
            }
            if (z12) {
                bundle.putBoolean("enableAlternativeBilling", z8);
            }
            boolean zIsEmpty = arrayListG.isEmpty();
            String str14 = yOZfxp.iauEXPxSOWyxdY;
            if (zIsEmpty) {
                str4 = "proxyPackageVersion";
                str = "BUY_INTENT";
                str5 = strD;
                str6 = strE;
                str7 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                for (int i11 = 0; i11 < listH.size(); i11++) {
                    c.b bVar3 = (c.b) listH.get(i11);
                    f fVarB = bVar3.b();
                    if (!fVarB.i().isEmpty()) {
                        arrayList3.add(fVarB.i());
                    }
                    arrayList4.add(bVar3.c());
                    if (!TextUtils.isEmpty(fVarB.j())) {
                        arrayList5.add(fVarB.j());
                    }
                    if (i11 > 0) {
                        arrayList.add(((c.b) listH.get(i11)).b().d());
                        arrayList2.add(((c.b) listH.get(i11)).b().e());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList(str14, arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                str5 = strD;
                ArrayList<String> arrayList7 = new ArrayList<>();
                str6 = strE;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str = "BUY_INTENT";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                for (SkuDetails skuDetails2 : arrayListG) {
                    if (!skuDetails2.h().isEmpty()) {
                        arrayList6.add(skuDetails2.h());
                    }
                    String strE2 = skuDetails2.e();
                    String str15 = str12;
                    String strD2 = skuDetails2.d();
                    int iC = skuDetails2.c();
                    String strG = skuDetails2.g();
                    arrayList7.add(strE2);
                    z13 |= !TextUtils.isEmpty(strE2);
                    arrayList8.add(strD2);
                    z14 |= !TextUtils.isEmpty(strD2);
                    arrayList9.add(Integer.valueOf(iC));
                    z15 |= iC != 0;
                    z16 |= !TextUtils.isEmpty(strG);
                    arrayList10.add(strG);
                    str11 = str11;
                    str12 = str15;
                }
                str4 = str11;
                str7 = str12;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z13) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z14) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z15) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z16) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayListG.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListG.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListG.size() - 1);
                    for (int i12 = 1; i12 < arrayListG.size(); i12++) {
                        arrayList11.add(((SkuDetails) arrayListG.get(i12)).a());
                        arrayList12.add(((SkuDetails) arrayListG.get(i12)).b());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList(str14, arrayList12);
                }
            }
            bVar = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !bVar.f17370q) {
                d dVar7 = j.f17493u;
                bVar.X(V.a(21, 2, dVar7));
                bVar.S(dVar7);
                return dVar7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.f())) {
                if (bVar2 == null || TextUtils.isEmpty(bVar2.b().h())) {
                    str8 = null;
                    z9 = false;
                } else {
                    bundle.putString("skuPackageName", bVar2.b().h());
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("accountName", str8);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    str2 = str7;
                    B.j(str2, "Activity's intent is null.");
                } else {
                    str2 = str7;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str9 = str4;
                            try {
                                bundle.putString(str9, bVar.f17358e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (PackageManager.NameNotFoundException unused) {
                                bundle.putString(str9, "package not found");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str9 = str4;
                        }
                    }
                }
                if (!bVar.f17373t && !listH.isEmpty()) {
                    i9 = 17;
                } else if (bVar.f17371r || !z9) {
                    if (bVar.f17367n) {
                        i10 = 9;
                    } else {
                        i9 = 6;
                    }
                    final String str16 = str5;
                    final String str17 = str6;
                    futureW = bVar.W(new Callable() { // from class: p3.A
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f31148a.e0(i10, str16, str17, cVar, bundle);
                        }
                    }, 5000L, null, bVar.f17356c);
                    i8 = 78;
                } else {
                    i9 = 15;
                }
                i10 = i9;
                final String str18 = str5;
                final String str19 = str6;
                futureW = bVar.W(new Callable() { // from class: p3.A
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f31148a.e0(i10, str18, str19, cVar, bundle);
                    }
                }, 5000L, null, bVar.f17356c);
                i8 = 78;
            } else {
                bundle.putString("skuPackageName", skuDetails.f());
            }
            str8 = null;
            z9 = true;
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("accountName", str8);
            }
            intent = activity.getIntent();
            if (intent == null) {
                str2 = str7;
                B.j(str2, "Activity's intent is null.");
            } else {
                str2 = str7;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra2);
                    str9 = str4;
                    bundle.putString(str9, bVar.f17358e.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
                }
            }
            if (!bVar.f17373t) {
                if (bVar.f17371r) {
                    if (bVar.f17367n) {
                        i10 = 9;
                    } else {
                        i9 = 6;
                        i10 = i9;
                    }
                } else if (bVar.f17367n) {
                    i10 = 9;
                } else {
                    i9 = 6;
                    i10 = i9;
                }
            } else if (bVar.f17371r) {
                if (bVar.f17367n) {
                    i10 = 9;
                } else {
                    i9 = 6;
                    i10 = i9;
                }
            } else if (bVar.f17367n) {
                i10 = 9;
            } else {
                i9 = 6;
                i10 = i9;
            }
            final String str110 = str5;
            final String str111 = str6;
            futureW = bVar.W(new Callable() { // from class: p3.A
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f31148a.e0(i10, str110, str111, cVar, bundle);
                }
            }, 5000L, null, bVar.f17356c);
            i8 = 78;
        } else {
            str = "BUY_INTENT";
            final String str20 = strD;
            final String str21 = strE;
            str2 = "BillingClient";
            futureW = bVar.W(new Callable() { // from class: p3.z0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f31238a.f0(str20, str21);
                }
            }, 5000L, null, bVar.f17356c);
            i8 = 80;
        }
        try {
            if (futureW == null) {
                d dVar8 = j.f17485m;
                bVar.X(V.a(25, 2, dVar8));
                bVar.S(dVar8);
                return dVar8;
            }
            Bundle bundle2 = (Bundle) futureW.get(5000L, TimeUnit.MILLISECONDS);
            int iB = B.b(bundle2, str2);
            String strF = B.f(bundle2, str2);
            if (iB == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str22 = str;
                intent2.putExtra(str22, (PendingIntent) bundle2.getParcelable(str22));
                activity.startActivity(intent2);
                return j.f17484l;
            }
            B.j(str2, "Unable to buy item, Error response code: " + iB);
            d dVarA = j.a(iB, strF);
            if (bundle2 != null) {
                i8 = 23;
            }
            bVar.X(V.a(i8, 2, dVarA));
            bVar.S(dVarA);
            return dVarA;
        } catch (CancellationException e8) {
            e = e8;
            B.k(str2, "Time out while launching billing flow. Try to reconnect", e);
            d dVar9 = j.f17486n;
            bVar.X(V.a(4, 2, dVar9));
            bVar.S(dVar9);
            return dVar9;
        } catch (TimeoutException e9) {
            e = e9;
            B.k(str2, "Time out while launching billing flow. Try to reconnect", e);
            d dVar10 = j.f17486n;
            bVar.X(V.a(4, 2, dVar10));
            bVar.S(dVar10);
            return dVar10;
        } catch (Exception e10) {
            B.k(str2, "Exception while launching billing flow. Try to reconnect", e10);
            d dVar11 = j.f17485m;
            bVar.X(V.a(5, 2, dVar11));
            bVar.S(dVar11);
            return dVar11;
        }
    }

    @Override // com.android.billingclient.api.a
    public final void i(final g gVar, final InterfaceC2777l interfaceC2777l) {
        if (!f()) {
            d dVar = j.f17485m;
            X(V.a(2, 7, dVar));
            interfaceC2777l.a(dVar, new ArrayList());
        } else {
            if (!this.f17373t) {
                B.j("BillingClient", "Querying product details is not supported.");
                d dVar2 = j.f17494v;
                X(V.a(20, 7, dVar2));
                interfaceC2777l.a(dVar2, new ArrayList());
                return;
            }
            if (W(new Callable() { // from class: p3.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f31227a.p0(gVar, interfaceC2777l);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: p3.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31230a.J(interfaceC2777l);
                }
            }, R()) == null) {
                d dVarT = T();
                X(V.a(25, 7, dVarT));
                interfaceC2777l.a(dVarT, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public final void j(C2781p c2781p, InterfaceC2778m interfaceC2778m) {
        Z(c2781p.b(), interfaceC2778m);
    }

    @Override // com.android.billingclient.api.a
    public final void k(C2782q c2782q, InterfaceC2779n interfaceC2779n) {
        a0(c2782q.b(), interfaceC2779n);
    }

    @Override // com.android.billingclient.api.a
    public final d l(final Activity activity, C2774i c2774i, InterfaceC2775j interfaceC2775j) {
        if (!f()) {
            B.j("BillingClient", "Service disconnected.");
            return j.f17485m;
        }
        if (!this.f17369p) {
            B.j("BillingClient", "Current client doesn't support showing in-app messages.");
            return j.f17495w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        H1.e.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f17355b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c2774i.b());
        final E e8 = new E(this, this.f17356c, interfaceC2775j);
        W(new Callable() { // from class: p3.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f31234a.q0(bundle, activity, e8);
                return null;
            }
        }, 5000L, null, this.f17356c);
        return j.f17484l;
    }

    @Override // com.android.billingclient.api.a
    public final void m(InterfaceC2765c interfaceC2765c) {
        if (f()) {
            B.i("BillingClient", "Service connection is valid. No need to re-initialize.");
            Y(V.c(6));
            interfaceC2765c.onBillingSetupFinished(j.f17484l);
            return;
        }
        int i8 = 1;
        if (this.f17354a == 1) {
            B.j("BillingClient", "Client is already in the process of connecting to billing service.");
            d dVar = j.f17476d;
            X(V.a(37, 6, dVar));
            interfaceC2765c.onBillingSetupFinished(dVar);
            return;
        }
        if (this.f17354a == 3) {
            B.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            d dVar2 = j.f17485m;
            X(V.a(38, 6, dVar2));
            interfaceC2765c.onBillingSetupFinished(dVar2);
            return;
        }
        this.f17354a = 1;
        B.i("BillingClient", "Starting in-app billing setup.");
        this.f17361h = new h(this, interfaceC2765c, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f17358e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i8 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    B.j("BillingClient", "The device doesn't have valid Play Store.");
                    i8 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f17355b);
                    if (this.f17358e.bindService(intent2, this.f17361h, 1)) {
                        B.i("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        B.j("BillingClient", "Connection to Billing service is blocked.");
                        i8 = 39;
                    }
                }
            }
        }
        this.f17354a = 0;
        B.i("BillingClient", "Billing service unavailable on device.");
        d dVar3 = j.f17475c;
        X(V.a(i8, 6, dVar3));
        interfaceC2765c.onBillingSetupFinished(dVar3);
    }

    public final void n(Context context, InterfaceC2780o interfaceC2780o, e eVar, T t8, String str, W w8) {
        this.f17358e = context.getApplicationContext();
        C2034k2 c2034k2E = C2038l2.E();
        c2034k2E.r(str);
        c2034k2E.q(this.f17358e.getPackageName());
        if (w8 != null) {
            this.f17359f = w8;
        } else {
            this.f17359f = new C2762a0(this.f17358e, (C2038l2) c2034k2E.h());
        }
        if (interfaceC2780o == null) {
            B.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f17357d = new w0(this.f17358e, interfaceC2780o, null, t8, null, this.f17359f);
        this.f17379z = eVar;
        this.f17352A = t8 != null;
        this.f17358e.getPackageName();
    }

    public final /* synthetic */ Object n0(C2771f c2771f, InterfaceC2772g interfaceC2772g) {
        int iG;
        String strF;
        String strA = c2771f.a();
        try {
            B.i("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f17367n) {
                K2 k8 = this.f17360g;
                String packageName = this.f17358e.getPackageName();
                boolean z8 = this.f17367n;
                String str = this.f17355b;
                Bundle bundle = new Bundle();
                if (z8) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleH = k8.h(9, packageName, strA, bundle);
                iG = bundleH.getInt("RESPONSE_CODE");
                strF = B.f(bundleH, "BillingClient");
            } else {
                iG = this.f17360g.g(3, this.f17358e.getPackageName(), strA);
                strF = "";
            }
            d dVarA = j.a(iG, strF);
            if (iG == 0) {
                B.i("BillingClient", "Successfully consumed purchase.");
                interfaceC2772g.a(dVarA, strA);
                return null;
            }
            B.j("BillingClient", "Error consuming purchase with token. Response code: " + iG);
            X(V.a(23, 4, dVarA));
            interfaceC2772g.a(dVarA, strA);
            return null;
        } catch (Exception e8) {
            B.k("BillingClient", "Error consuming purchase!", e8);
            d dVar = j.f17485m;
            X(V.a(29, 4, dVar));
            interfaceC2772g.a(dVar, strA);
            return null;
        }
    }

    public final /* synthetic */ Object o0(Bundle bundle, InterfaceC2769e interfaceC2769e) {
        try {
            this.f17360g.A(18, this.f17358e.getPackageName(), bundle, new i(interfaceC2769e, this.f17359f, this.f17364k, null));
        } catch (DeadObjectException e8) {
            B.k("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e8);
            d dVar = j.f17485m;
            X(V.a(62, 13, dVar));
            interfaceC2769e.a(dVar, null);
        } catch (Exception e9) {
            B.k("BillingClient", "getBillingConfig got an exception.", e9);
            d dVar2 = j.f17482j;
            X(V.a(62, 13, dVar2));
            interfaceC2769e.a(dVar2, null);
        }
        return null;
    }

    public final /* synthetic */ Object q0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.f17360g.G(12, this.f17358e.getPackageName(), bundle, new L(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    public final /* synthetic */ Object m0(C2761a c2761a, InterfaceC2763b interfaceC2763b) {
        try {
            K2 k8 = this.f17360g;
            String packageName = this.f17358e.getPackageName();
            String strA = c2761a.a();
            String str = this.f17355b;
            Bundle bundle = new Bundle();
            bundle.putString(RaiWHuj.slUp, str);
            Bundle bundleO = k8.O(9, packageName, strA, bundle);
            interfaceC2763b.a(j.a(B.b(bundleO, "BillingClient"), B.f(bundleO, "BillingClient")));
            return null;
        } catch (Exception e8) {
            B.k("BillingClient", "Error acknowledge purchase!", e8);
            d dVar = j.f17485m;
            X(V.a(28, 3, dVar));
            interfaceC2763b.a(dVar);
            return null;
        }
    }

    public final /* synthetic */ Object p0(g gVar, InterfaceC2777l interfaceC2777l) {
        String strF;
        int iB;
        int i8;
        ArrayList arrayList = new ArrayList();
        String strC = gVar.c();
        AbstractC2027j abstractC2027jB = gVar.b();
        int size = abstractC2027jB.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                int i10 = i9 + 20;
                ArrayList arrayList2 = new ArrayList(abstractC2027jB.subList(i9, i10 > size ? size : i10));
                ArrayList<String> arrayList3 = new ArrayList<>();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList3.add(((g.b) arrayList2.get(i11)).b());
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                bundle.putString("playBillingLibraryVersion", this.f17355b);
                try {
                    K2 k8 = this.f17360g;
                    int i12 = true != this.f17376w ? 17 : 20;
                    String packageName = this.f17358e.getPackageName();
                    boolean zB0 = b0();
                    String str = this.f17355b;
                    U(gVar);
                    U(gVar);
                    U(gVar);
                    int i13 = i12;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("playBillingLibraryVersion", str);
                    bundle2.putBoolean(com.amazon.a.a.o.b.ac, true);
                    bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                    if (zB0) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    int size3 = arrayList2.size();
                    int i14 = 0;
                    boolean z8 = false;
                    boolean z9 = false;
                    while (i14 < size3) {
                        g.b bVar = (g.b) arrayList2.get(i14);
                        K2 k9 = k8;
                        arrayList4.add(null);
                        z8 |= !TextUtils.isEmpty(null);
                        String strC2 = bVar.c();
                        AbstractC2027j abstractC2027j = abstractC2027jB;
                        if (strC2.equals("first_party")) {
                            AbstractC1995b.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                            arrayList5.add(null);
                            z9 = true;
                        }
                        i14++;
                        abstractC2027jB = abstractC2027j;
                        k8 = k9;
                    }
                    AbstractC2027j abstractC2027j2 = abstractC2027jB;
                    K2 k10 = k8;
                    if (z8) {
                        bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                    }
                    if (z9 && !TextUtils.isEmpty(null)) {
                        bundle2.putString("accountName", null);
                    }
                    Bundle bundleF = k10.f(i13, packageName, strC, bundle, bundle2);
                    i8 = 4;
                    strF = "Item is unavailable for purchase.";
                    if (bundleF == null) {
                        B.j("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        X(V.a(44, 7, j.f17469C));
                    } else {
                        if (!bundleF.containsKey("DETAILS_LIST")) {
                            iB = B.b(bundleF, "BillingClient");
                            strF = B.f(bundleF, "BillingClient");
                            if (iB == 0) {
                                B.j("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                X(V.a(45, 7, j.a(6, strF)));
                                iB = 6;
                                break;
                            }
                            B.j("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB);
                            X(V.a(23, 7, j.a(iB, strF)));
                            break;
                        }
                        ArrayList<String> stringArrayList = bundleF.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            B.j("BillingClient", "queryProductDetailsAsync got null response list");
                            X(V.a(46, 7, j.f17469C));
                        } else {
                            for (int i15 = 0; i15 < stringArrayList.size(); i15++) {
                                try {
                                    f fVar = new f(stringArrayList.get(i15));
                                    B.i("BillingClient", LYdqVGvOGMNr.MGRG.concat(fVar.toString()));
                                    arrayList.add(fVar);
                                } catch (JSONException e8) {
                                    B.k("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e8);
                                    strF = toqHM.Cbo;
                                    i8 = 6;
                                    X(V.a(47, 7, j.a(6, strF)));
                                }
                            }
                            i9 = i10;
                            abstractC2027jB = abstractC2027j2;
                        }
                    }
                } catch (Exception e9) {
                    i8 = 6;
                    B.k("BillingClient", HRHLwtyqJWz.EpwgqD, e9);
                    X(V.a(43, 7, j.f17482j));
                    strF = "An internal error occurred.";
                }
                iB = i8;
                break;
            }
            strF = "";
            iB = 0;
            break;
        }
        interfaceC2777l.a(j.a(iB, strF), arrayList);
        return null;
    }

    public b(String str, e eVar, Context context, InterfaceC2768d0 interfaceC2768d0, W w8, ExecutorService executorService) {
        this.f17354a = 0;
        this.f17356c = new Handler(Looper.getMainLooper());
        this.f17364k = 0;
        this.f17355b = V();
        this.f17358e = context.getApplicationContext();
        C2034k2 c2034k2E = C2038l2.E();
        c2034k2E.r(V());
        c2034k2E.q(this.f17358e.getPackageName());
        this.f17359f = new C2762a0(this.f17358e, (C2038l2) c2034k2E.h());
        B.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f17357d = new w0(this.f17358e, null, null, null, null, this.f17359f);
        this.f17379z = eVar;
        this.f17358e.getPackageName();
    }

    public b(String str, e eVar, Context context, InterfaceC2780o interfaceC2780o, T t8, W w8, ExecutorService executorService) {
        String strV = V();
        this.f17354a = 0;
        this.f17356c = new Handler(Looper.getMainLooper());
        this.f17364k = 0;
        this.f17355b = strV;
        n(context, interfaceC2780o, eVar, null, strV, null);
    }
}
