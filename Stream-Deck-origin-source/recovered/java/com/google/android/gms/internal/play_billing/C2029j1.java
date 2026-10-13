package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2029j1 extends AbstractC2067t1 {
    public C2029j1(int i8) {
        super(i8, null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2067t1
    public final void a() {
        if (!j()) {
            if (b() > 0) {
                p063h.s.a(g(0).getKey());
                throw null;
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                p063h.s.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
