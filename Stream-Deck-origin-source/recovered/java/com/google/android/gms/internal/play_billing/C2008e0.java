package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2008e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C2008e0 f18886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2008e0 f18887c = new C2008e0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18888a = Collections.EMPTY_MAP;

    public C2008e0(boolean z8) {
    }

    public static C2008e0 a() {
        C2008e0 c2008e0 = f18886b;
        if (c2008e0 != null) {
            return c2008e0;
        }
        synchronized (C2008e0.class) {
            try {
                C2008e0 c2008e1 = f18886b;
                if (c2008e1 != null) {
                    return c2008e1;
                }
                C2008e0 c2008e0B = AbstractC2036l0.b(C2008e0.class);
                f18886b = c2008e0B;
                return c2008e0B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2052p0 b(V0 v8, int i8) {
        p063h.s.a(this.f18888a.get(new C2004d0(v8, i8)));
        return null;
    }
}
