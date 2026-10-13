package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2092d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f19268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f19269b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f19270c;

    static {
        f19270c = (f19268a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f19269b;
    }

    public static boolean c() {
        if (f19268a) {
            return true;
        }
        return (f19269b == null || f19270c) ? false : true;
    }
}
