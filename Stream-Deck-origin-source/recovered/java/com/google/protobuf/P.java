package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f19218a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f19219b = new O();

    public static N a() {
        return f19218a;
    }

    public static N b() {
        return f19219b;
    }

    public static N c() {
        try {
            return (N) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
