package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2013f1 implements S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f18893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f18895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18896d;

    public C2013f1(V0 v8, String str, Object[] objArr) {
        this.f18893a = v8;
        this.f18894b = str;
        this.f18895c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18896d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f18896d = i8 | (cCharAt2 << i10);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    public final String a() {
        return this.f18894b;
    }

    public final Object[] b() {
        return this.f18895c;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int j() {
        int i8 = this.f18896d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final V0 zza() {
        return this.f18893a;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean zzb() {
        return (this.f18896d & 2) == 2;
    }
}
