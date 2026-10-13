package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0424b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0424b c0424b = new DynamiteModule.b.C0424b();
        int iB = aVar.b(context, str);
        c0424b.f17930a = iB;
        if (iB != 0) {
            c0424b.f17932c = -1;
            return c0424b;
        }
        int iA = aVar.a(context, str, true);
        c0424b.f17931b = iA;
        if (iA != 0) {
            c0424b.f17932c = 1;
        }
        return c0424b;
    }
}
