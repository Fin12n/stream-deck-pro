package q7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f32063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32064b;

    public S(int[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32063a = bufferWithData;
        this.f32064b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        int[] iArr = this.f32063a;
        if (iArr.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, W6.n.d(i8, iArr.length * 2));
            kotlin.jvm.internal.t.f(iArrCopyOf, "copyOf(...)");
            this.f32063a = iArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32064b;
    }

    public final void e(int i8) {
        B0.c(this, 0, 1, null);
        int[] iArr = this.f32063a;
        int iD = d();
        this.f32064b = iD + 1;
        iArr[iD] = i8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f32063a, d());
        kotlin.jvm.internal.t.f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
