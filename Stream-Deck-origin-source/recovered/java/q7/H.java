package q7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f32029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32030b;

    public H(float[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32029a = bufferWithData;
        this.f32030b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        float[] fArr = this.f32029a;
        if (fArr.length < i8) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, W6.n.d(i8, fArr.length * 2));
            kotlin.jvm.internal.t.f(fArrCopyOf, "copyOf(...)");
            this.f32029a = fArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32030b;
    }

    public final void e(float f8) {
        B0.c(this, 0, 1, null);
        float[] fArr = this.f32029a;
        int iD = d();
        this.f32030b = iD + 1;
        fArr[iD] = f8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f32029a, d());
        kotlin.jvm.internal.t.f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
