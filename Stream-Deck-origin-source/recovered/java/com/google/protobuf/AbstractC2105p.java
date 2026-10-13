package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2105p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f19367a = c();

    public static C2106q a() {
        C2106q c2106qB = b("getEmptyRegistry");
        return c2106qB != null ? c2106qB : C2106q.f19373d;
    }

    public static final C2106q b(String str) {
        Class cls = f19367a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2106q) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
