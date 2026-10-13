package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements DynamiteModule.b {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0424b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0424b c0424b = new DynamiteModule.b.C0424b();
        c0424b.f17930a = aVar.b(context, str);
        int i8 = 1;
        int iA = aVar.a(context, str, true);
        c0424b.f17931b = iA;
        int i9 = c0424b.f17930a;
        if (i9 == 0) {
            i9 = 0;
            if (iA == 0) {
                i8 = 0;
            } else if (i9 >= iA) {
                i8 = -1;
            }
        } else if (i9 >= iA) {
            i8 = -1;
        }
        c0424b.f17932c = i8;
        return c0424b;
    }
}
