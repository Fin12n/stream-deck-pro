package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f19360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f19362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19363d;

    public l0(T t8, String str, Object[] objArr) {
        this.f19360a = t8;
        this.f19361b = str;
        this.f19362c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19363d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f19363d = i8 | (cCharAt2 << i9);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    @Override // com.google.protobuf.Q
    public boolean a() {
        return (this.f19363d & 2) == 2;
    }

    @Override // com.google.protobuf.Q
    public T b() {
        return this.f19360a;
    }

    @Override // com.google.protobuf.Q
    public i0 c() {
        int i8 = this.f19363d;
        if ((i8 & 1) != 0) {
            return i0.PROTO2;
        }
        return (i8 & 4) == 4 ? i0.EDITIONS : i0.PROTO3;
    }

    public Object[] d() {
        return this.f19362c;
    }

    public String e() {
        return this.f19361b;
    }
}
