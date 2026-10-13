package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2031k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18922c;

    public C2031k(Object obj, Object obj2, Object obj3) {
        this.f18920a = obj;
        this.f18921b = obj2;
        this.f18922c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f18922c;
        Object obj2 = this.f18921b;
        Object obj3 = this.f18920a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(obj));
    }
}
