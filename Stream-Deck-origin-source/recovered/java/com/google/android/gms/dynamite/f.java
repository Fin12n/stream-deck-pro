package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0424b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0424b c0424b = new DynamiteModule.b.C0424b();
        int iB = aVar.b(context, str);
        c0424b.f17930a = iB;
        int i8 = 1;
        int i9 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0424b.f17931b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0424b.f17931b = iA;
        }
        int i10 = c0424b.f17930a;
        if (i10 == 0) {
            if (iA == 0) {
                i8 = 0;
            }
            c0424b.f17932c = i8;
            return c0424b;
        }
        i9 = i10;
        if (i9 >= iA) {
            i8 = -1;
        }
        c0424b.f17932c = i8;
        return c0424b;
    }
}
