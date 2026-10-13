package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1997b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1993a1 f18877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1993a1 f18878b;

    static {
        C1993a1 c1993a1 = null;
        try {
            c1993a1 = (C1993a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18877a = c1993a1;
        f18878b = new C1993a1();
    }

    public static C1993a1 a() {
        return f18877a;
    }

    public static C1993a1 b() {
        return f18878b;
    }
}
