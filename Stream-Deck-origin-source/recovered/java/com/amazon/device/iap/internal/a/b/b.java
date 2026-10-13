package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
abstract class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f17077b = "purchase_updates";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f17078c;

    public b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z8) {
        super(cVar, f17077b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f17078c = z8;
    }

    @Override // com.amazon.a.a.n.a.a
    public void e() {
        super.e();
        a(com.amazon.a.a.o.b.f16727b, this.f17078c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
        a(com.amazon.a.a.o.b.ac, Boolean.valueOf(com.amazon.device.iap.internal.d.f().d()));
    }
}
