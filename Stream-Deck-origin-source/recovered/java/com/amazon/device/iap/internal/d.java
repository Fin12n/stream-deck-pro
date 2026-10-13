package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f17207a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f17208b = "sku";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f17209c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f17210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f17211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PurchasingListener f17212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17213g = false;

    private d() {
    }

    public static d f() {
        return f17209c;
    }

    private void g() {
        if (this.f17212f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f17212f;
    }

    public Context b() {
        return this.f17211e;
    }

    public void c() {
        this.f17213g = true;
    }

    public boolean d() {
        return this.f17213g;
    }

    public boolean e() {
        g();
        return com.amazon.a.a.a((Application) this.f17211e.getApplicationContext());
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(f17207a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(f17207a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.f17211e = context.getApplicationContext();
        e eVarA = b.a().a(this.f17211e);
        this.f17210d = eVarA;
        if (eVarA == null) {
            com.amazon.device.iap.internal.util.b.a(f17207a, "requestHandler is null");
        }
        this.f17212f = purchasingListener;
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.f17210d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, f17208b);
        g();
        RequestId requestId = new RequestId();
        this.f17210d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.f16714O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.f16714O);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.f17210d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z8) {
        g();
        RequestId requestId = new RequestId();
        this.f17210d.a(requestId, z8);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!f.a(str)) {
            f.a(fulfillmentResult, "fulfillmentResult");
            g();
            this.f17210d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.f17210d.a(context, intent);
        } catch (Exception e8) {
            com.amazon.device.iap.internal.util.b.b(f17207a, "Error in onReceive: " + e8);
        }
    }
}
