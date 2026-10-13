package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18827e;

    public /* synthetic */ U(byte[] bArr, int i8, int i9, boolean z8, T t8) {
        super(null);
        this.f18827e = Integer.MAX_VALUE;
        this.f18824b = bArr;
        this.f18825c = 0;
    }

    public final int c(int i8) {
        int i9 = this.f18827e;
        this.f18827e = 0;
        int i10 = this.f18825c + this.f18826d;
        this.f18825c = i10;
        if (i10 <= 0) {
            this.f18826d = 0;
            return i9;
        }
        this.f18826d = i10;
        this.f18825c = 0;
        return i9;
    }
}
