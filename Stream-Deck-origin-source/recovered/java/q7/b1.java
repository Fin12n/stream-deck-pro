package q7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f32088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32089b;

    public /* synthetic */ b1(short[] sArr, AbstractC2633k abstractC2633k) {
        this(sArr);
    }

    @Override // q7.B0
    public /* bridge */ /* synthetic */ Object a() {
        return C6.E.c(f());
    }

    @Override // q7.B0
    public void b(int i8) {
        if (C6.E.E(this.f32088a) < i8) {
            short[] sArr = this.f32088a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, W6.n.d(i8, C6.E.E(sArr) * 2));
            kotlin.jvm.internal.t.f(sArrCopyOf, "copyOf(...)");
            this.f32088a = C6.E.o(sArrCopyOf);
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32089b;
    }

    public final void e(short s8) {
        B0.c(this, 0, 1, null);
        short[] sArr = this.f32088a;
        int iD = d();
        this.f32089b = iD + 1;
        C6.E.I(sArr, iD, s8);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f32088a, d());
        kotlin.jvm.internal.t.f(sArrCopyOf, "copyOf(...)");
        return C6.E.o(sArrCopyOf);
    }

    public b1(short[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32088a = bufferWithData;
        this.f32089b = C6.E.E(bufferWithData);
        b(10);
    }
}
