package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2005d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2005d1 f18883c = new C2005d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f18885b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2021h1 f18884a = new O0();

    public static C2005d1 a() {
        return f18883c;
    }

    public final InterfaceC2017g1 b(Class cls) {
        AbstractC2081y0.c(cls, "messageType");
        InterfaceC2017g1 interfaceC2017g1 = (InterfaceC2017g1) this.f18885b.get(cls);
        if (interfaceC2017g1 != null) {
            return interfaceC2017g1;
        }
        InterfaceC2017g1 interfaceC2017g1A = this.f18884a.a(cls);
        AbstractC2081y0.c(cls, "messageType");
        InterfaceC2017g1 interfaceC2017g2 = (InterfaceC2017g1) this.f18885b.putIfAbsent(cls, interfaceC2017g1A);
        return interfaceC2017g2 == null ? interfaceC2017g1A : interfaceC2017g2;
    }
}
