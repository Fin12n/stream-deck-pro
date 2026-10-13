package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2091c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2087a0 f19266a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2087a0 f19267b = new C2089b0();

    public static InterfaceC2087a0 a() {
        return f19266a;
    }

    public static InterfaceC2087a0 b() {
        return f19267b;
    }

    public static InterfaceC2087a0 c() {
        try {
            return (InterfaceC2087a0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
