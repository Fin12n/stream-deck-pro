package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2020h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2012f0 f18906a = new C2016g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2012f0 f18907b;

    static {
        AbstractC2012f0 abstractC2012f0 = null;
        try {
            abstractC2012f0 = (AbstractC2012f0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18907b = abstractC2012f0;
    }

    public static AbstractC2012f0 a() {
        AbstractC2012f0 abstractC2012f0 = f18907b;
        if (abstractC2012f0 != null) {
            return abstractC2012f0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC2012f0 b() {
        return f18906a;
    }
}
