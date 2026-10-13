package q7;

import java.util.Arrays;

/* JADX INFO: renamed from: q7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2856p extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f32132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32133b;

    public C2856p(char[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.f32132a = bufferWithData;
        this.f32133b = bufferWithData.length;
        b(10);
    }

    @Override // q7.B0
    public void b(int i8) {
        char[] cArr = this.f32132a;
        if (cArr.length < i8) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, W6.n.d(i8, cArr.length * 2));
            kotlin.jvm.internal.t.f(cArrCopyOf, "copyOf(...)");
            this.f32132a = cArrCopyOf;
        }
    }

    @Override // q7.B0
    public int d() {
        return this.f32133b;
    }

    public final void e(char c8) {
        B0.c(this, 0, 1, null);
        char[] cArr = this.f32132a;
        int iD = d();
        this.f32133b = iD + 1;
        cArr[iD] = c8;
    }

    @Override // q7.B0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f32132a, d());
        kotlin.jvm.internal.t.f(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
