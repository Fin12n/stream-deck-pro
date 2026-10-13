package q7;

import java.util.Arrays;

/* JADX INFO: renamed from: q7.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2833d0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f32093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32094b;

    public C2833d0(long[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32093a = bufferWithData;
        this.f32094b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        long[] jArr = this.f32093a;
        if (jArr.length < i8) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, W6.n.d(i8, jArr.length * 2));
            kotlin.jvm.internal.t.f(jArrCopyOf, "copyOf(...)");
            this.f32093a = jArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32094b;
    }

    public final void e(long j8) {
        B0.c(this, 0, 1, null);
        long[] jArr = this.f32093a;
        int iD = d();
        this.f32094b = iD + 1;
        jArr[iD] = j8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f32093a, d());
        kotlin.jvm.internal.t.f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
