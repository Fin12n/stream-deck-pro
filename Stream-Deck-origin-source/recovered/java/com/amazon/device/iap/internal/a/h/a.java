package com.amazon.device.iap.internal.a.h;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17119b = "submit_metric";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17120c = "metricName";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17121d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, f17119b, "1.0", cVar.d().toString(), PurchasingService.SDK_VERSION);
        a(f17120c, str);
        a(f17121d, str2);
        b(false);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        return true;
    }
}
