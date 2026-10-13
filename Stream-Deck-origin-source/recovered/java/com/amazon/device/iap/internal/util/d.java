package com.amazon.device.iap.internal.util;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17225e;

    d(int i8) {
        this.f17225e = i8;
    }

    public int a() {
        return this.f17225e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f17225e < dVar.f17225e;
    }
}
