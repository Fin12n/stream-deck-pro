package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0 f18817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q0 f18818b;

    static {
        Q0 q8 = null;
        try {
            q8 = (Q0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f18817a = q8;
        f18818b = new Q0();
    }

    public static Q0 a() {
        return f18817a;
    }

    public static Q0 b() {
        return f18818b;
    }
}
