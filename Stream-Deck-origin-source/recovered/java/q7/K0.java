package q7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f32037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32038b;

    public K0(short[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32037a = bufferWithData;
        this.f32038b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        short[] sArr = this.f32037a;
        if (sArr.length < i8) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, W6.n.d(i8, sArr.length * 2));
            kotlin.jvm.internal.t.f(sArrCopyOf, "copyOf(...)");
            this.f32037a = sArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32038b;
    }

    public final void e(short s8) {
        B0.c(this, 0, 1, null);
        short[] sArr = this.f32037a;
        int iD = d();
        this.f32038b = iD + 1;
        sArr[iD] = s8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f32037a, d());
        kotlin.jvm.internal.t.f(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
