package q7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f32073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32074b;

    public /* synthetic */ V0(int[] iArr, AbstractC2633k abstractC2633k) {
        this(iArr);
    }

    @Override // q7.B0
    public /* bridge */ /* synthetic */ Object a() {
        return C6.z.c(f());
    }

    @Override // q7.B0
    public void b(int i8) {
        if (C6.z.E(this.f32073a) < i8) {
            int[] iArr = this.f32073a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, W6.n.d(i8, C6.z.E(iArr) * 2));
            kotlin.jvm.internal.t.f(iArrCopyOf, "copyOf(...)");
            this.f32073a = C6.z.o(iArrCopyOf);
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32074b;
    }

    public final void e(int i8) {
        B0.c(this, 0, 1, null);
        int[] iArr = this.f32073a;
        int iD = d();
        this.f32074b = iD + 1;
        C6.z.I(iArr, iD, i8);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f32073a, d());
        kotlin.jvm.internal.t.f(iArrCopyOf, "copyOf(...)");
        return C6.z.o(iArrCopyOf);
    }

    public V0(int[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32073a = bufferWithData;
        this.f32074b = C6.z.E(bufferWithData);
        b(10);
    }
}
