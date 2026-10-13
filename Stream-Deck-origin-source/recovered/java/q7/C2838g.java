package q7;

import java.util.Arrays;

/* JADX INFO: renamed from: q7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2838g extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f32103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32104b;

    public C2838g(boolean[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32103a = bufferWithData;
        this.f32104b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        boolean[] zArr = this.f32103a;
        if (zArr.length < i8) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, W6.n.d(i8, zArr.length * 2));
            kotlin.jvm.internal.t.f(zArrCopyOf, "copyOf(...)");
            this.f32103a = zArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32104b;
    }

    public final void e(boolean z8) {
        B0.c(this, 0, 1, null);
        boolean[] zArr = this.f32103a;
        int iD = d();
        this.f32104b = iD + 1;
        zArr[iD] = z8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f32103a, d());
        kotlin.jvm.internal.t.f(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
