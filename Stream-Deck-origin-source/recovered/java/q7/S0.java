package q7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f32065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32066b;

    public /* synthetic */ S0(byte[] bArr, AbstractC2633k abstractC2633k) {
        this(bArr);
    }

    @Override // q7.B0
    public /* bridge */ /* synthetic */ Object a() {
        return C6.x.c(f());
    }

    @Override // q7.B0
    public void b(int i8) {
        if (C6.x.E(this.f32065a) < i8) {
            byte[] bArr = this.f32065a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, W6.n.d(i8, C6.x.E(bArr) * 2));
            kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
            this.f32065a = C6.x.o(bArrCopyOf);
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32066b;
    }

    public final void e(byte b8) {
        B0.c(this, 0, 1, null);
        byte[] bArr = this.f32065a;
        int iD = d();
        this.f32066b = iD + 1;
        C6.x.I(bArr, iD, b8);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f32065a, d());
        kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
        return C6.x.o(bArrCopyOf);
    }

    public S0(byte[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32065a = bufferWithData;
        this.f32066b = C6.x.E(bufferWithData);
        b(10);
    }
}
