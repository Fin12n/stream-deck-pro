package q7;

import java.util.Arrays;

/* JADX INFO: renamed from: q7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2844j extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f32119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32120b;

    public C2844j(byte[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32119a = bufferWithData;
        this.f32120b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        byte[] bArr = this.f32119a;
        if (bArr.length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, W6.n.d(i8, bArr.length * 2));
            kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
            this.f32119a = bArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32120b;
    }

    public final void e(byte b8) {
        B0.c(this, 0, 1, null);
        byte[] bArr = this.f32119a;
        int iD = d();
        this.f32120b = iD + 1;
        bArr[iD] = b8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f32119a, d());
        kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
