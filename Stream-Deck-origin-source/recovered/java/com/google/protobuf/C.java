package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static void a(Buffer buffer, int i8) {
        buffer.limit(i8);
    }

    public static void b(Buffer buffer, int i8) {
        buffer.position(i8);
    }
}
