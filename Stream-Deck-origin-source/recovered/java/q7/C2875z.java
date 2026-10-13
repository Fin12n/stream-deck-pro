package q7;

import java.util.Arrays;

/* JADX INFO: renamed from: q7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2875z extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f32179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32180b;

    public C2875z(double[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32179a = bufferWithData;
        this.f32180b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        double[] dArr = this.f32179a;
        if (dArr.length < i8) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, W6.n.d(i8, dArr.length * 2));
            kotlin.jvm.internal.t.f(dArrCopyOf, "copyOf(...)");
            this.f32179a = dArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32180b;
    }

    public final void e(double d8) {
        B0.c(this, 0, 1, null);
        double[] dArr = this.f32179a;
        int iD = d();
        this.f32180b = iD + 1;
        dArr[iD] = d8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f32179a, d());
        kotlin.jvm.internal.t.f(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
