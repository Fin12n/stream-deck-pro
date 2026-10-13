package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1991a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AbstractC2039m f18869q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18871a;

    static {
        C2035l c2035l = new C2035l();
        for (EnumC1991a enumC1991a : values()) {
            c2035l.a(Integer.valueOf(enumC1991a.f18871a), enumC1991a);
        }
        f18869q = c2035l.b();
    }

    EnumC1991a(int i8) {
        this.f18871a = i8;
    }

    public static EnumC1991a a(int i8) {
        AbstractC2039m abstractC2039m = f18869q;
        Integer numValueOf = Integer.valueOf(i8);
        return !abstractC2039m.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC1991a) abstractC2039m.get(numValueOf);
    }
}
