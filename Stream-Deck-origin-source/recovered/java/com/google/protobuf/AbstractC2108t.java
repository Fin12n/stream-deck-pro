package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2108t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f19406a = new C2107s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f19407b = c();

    public static r a() {
        r rVar = f19407b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static r b() {
        return f19406a;
    }

    public static r c() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
