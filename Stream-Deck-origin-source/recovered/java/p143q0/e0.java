package p143q0;

import p176u1.D;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f31633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31635d;

    public e0(D d8, int i8, int i9) {
        this.f31633b = d8;
        this.f31634c = i8;
        this.f31635d = i9;
    }

    @Override // p176u1.D
    public int a(int i8) {
        int iA = this.f31633b.a(i8);
        if (i8 < 0 || i8 > this.f31635d) {
            return iA;
        }
        if (iA >= 0 && iA <= this.f31634c) {
            return iA;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i8 + " -> " + iA + " is not in range of original text [0, " + this.f31634c + ']').toString());
    }

    @Override // p176u1.D
    public int b(int i8) {
        int iB = this.f31633b.b(i8);
        if (i8 < 0 || i8 > this.f31634c) {
            return iB;
        }
        if (iB >= 0 && iB <= this.f31635d) {
            return iB;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i8 + " -> " + iB + hJroAgFztiMK.pYLyYLjePQ + this.f31635d + ']').toString());
    }
}
