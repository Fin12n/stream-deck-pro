package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U1 f18028c = new U1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f18030b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1895g2 f18029a = new F1();

    public static U1 a() {
        return f18028c;
    }

    public final InterfaceC1890f2 b(Class cls) {
        AbstractC1953s1.c(cls, "messageType");
        InterfaceC1890f2 interfaceC1890f2 = (InterfaceC1890f2) this.f18030b.get(cls);
        if (interfaceC1890f2 != null) {
            return interfaceC1890f2;
        }
        InterfaceC1890f2 interfaceC1890f2A = this.f18029a.a(cls);
        AbstractC1953s1.c(cls, "messageType");
        InterfaceC1890f2 interfaceC1890f3 = (InterfaceC1890f2) this.f18030b.putIfAbsent(cls, interfaceC1890f2A);
        return interfaceC1890f3 == null ? interfaceC1890f2A : interfaceC1890f3;
    }
}
