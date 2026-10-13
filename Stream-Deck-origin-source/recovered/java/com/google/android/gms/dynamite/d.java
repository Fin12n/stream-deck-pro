package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0424b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0424b c0424b = new DynamiteModule.b.C0424b();
        int iA = aVar.a(context, str, false);
        c0424b.f17931b = iA;
        c0424b.f17932c = iA != 0 ? 1 : 0;
        return c0424b;
    }
}
