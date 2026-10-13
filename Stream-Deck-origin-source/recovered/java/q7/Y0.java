package q7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f32081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32082b;

    public /* synthetic */ Y0(long[] jArr, AbstractC2633k abstractC2633k) {
        this(jArr);
    }

    @Override // q7.B0
    public /* bridge */ /* synthetic */ Object a() {
        return C6.B.c(f());
    }

    @Override // q7.B0
    public void b(int i8) {
        if (C6.B.E(this.f32081a) < i8) {
            long[] jArr = this.f32081a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, W6.n.d(i8, C6.B.E(jArr) * 2));
            kotlin.jvm.internal.t.f(jArrCopyOf, "copyOf(...)");
            this.f32081a = C6.B.o(jArrCopyOf);
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32082b;
    }

    public final void e(long j8) {
        B0.c(this, 0, 1, null);
        long[] jArr = this.f32081a;
        int iD = d();
        this.f32082b = iD + 1;
        C6.B.I(jArr, iD, j8);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f32081a, d());
        kotlin.jvm.internal.t.f(jArrCopyOf, "copyOf(...)");
        return C6.B.o(jArrCopyOf);
    }

    public Y0(long[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32081a = bufferWithData;
        this.f32082b = C6.B.E(bufferWithData);
        b(10);
    }
}
