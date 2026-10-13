package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2035l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f18979a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18980b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2031k f18981c;

    public final C2035l a(Object obj, Object obj2) {
        int i8 = this.f18980b + 1;
        Object[] objArr = this.f18979a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i9) {
                int iHighestOneBit = Integer.highestOneBit(i9 - 1);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
            this.f18979a = Arrays.copyOf(objArr, i10);
        }
        AbstractC2007e.a(obj, obj2);
        Object[] objArr2 = this.f18979a;
        int i11 = this.f18980b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f18980b = i11 + 1;
        return this;
    }

    public final AbstractC2039m b() {
        C2031k c2031k = this.f18981c;
        if (c2031k != null) {
            throw c2031k.a();
        }
        C2068u c2068uG = C2068u.g(this.f18980b, this.f18979a, this);
        C2031k c2031k2 = this.f18981c;
        if (c2031k2 == null) {
            return c2068uG;
        }
        throw c2031k2.a();
    }
}
