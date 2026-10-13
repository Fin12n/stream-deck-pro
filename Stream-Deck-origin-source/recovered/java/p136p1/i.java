package p136p1;

import D6.C0934n;
import D6.r;
import W6.n;
import Z6.w;
import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f31056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f31057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char[] f31058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31059f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31062c;

        public a(int i8, int i9, boolean z8) {
            this.f31060a = i8;
            this.f31061b = i9;
            this.f31062c = z8;
        }

        public final int a() {
            return this.f31061b;
        }

        public final int b() {
            return this.f31060a;
        }

        public final boolean c() {
            return this.f31062c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31060a == aVar.f31060a && this.f31061b == aVar.f31061b && this.f31062c == aVar.f31062c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f31060a) * 31) + Integer.hashCode(this.f31061b)) * 31) + Boolean.hashCode(this.f31062c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f31060a + ", end=" + this.f31061b + ", isRtl=" + this.f31062c + ')';
        }
    }

    public i(Layout layout) {
        this.f31054a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iX = w.X(this.f31054a.getText(), '\n', length, false, 4, null);
            length = iX < 0 ? this.f31054a.getText().length() : iX + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f31054a.getText().length());
        this.f31055b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(null);
        }
        this.f31056c = arrayList2;
        this.f31057d = new boolean[this.f31055b.size()];
        this.f31059f = this.f31055b.size();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    public final Bidi a(int i8) {
        Bidi bidi;
        if (this.f31057d[i8]) {
            return (Bidi) this.f31056c.get(i8);
        }
        int iIntValue = i8 == 0 ? 0 : ((Number) this.f31055b.get(i8 - 1)).intValue();
        int iIntValue2 = ((Number) this.f31055b.get(i8)).intValue();
        int i9 = iIntValue2 - iIntValue;
        char[] cArr = this.f31058e;
        if (cArr == null || cArr.length < i9) {
            cArr = new char[i9];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.f31054a.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i9)) {
            bidi = new Bidi(cArr2, 0, null, 0, i9, h(i8) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.f31056c.set(i8, bidi);
        this.f31057d[i8] = true;
        if (bidi != null) {
            char[] cArr3 = this.f31058e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f31058e = cArr2;
        return bidi;
    }

    public final float b(int i8, boolean z8) {
        int iG = n.g(i8, this.f31054a.getLineEnd(this.f31054a.getLineForOffset(i8)));
        return z8 ? this.f31054a.getPrimaryHorizontal(iG) : this.f31054a.getSecondaryHorizontal(iG);
    }

    public final float c(int i8, boolean z8, boolean z9) {
        int i9 = i8;
        if (!z9) {
            return b(i8, z8);
        }
        int iA = h.a(this.f31054a, i9, z9);
        int lineStart = this.f31054a.getLineStart(iA);
        int lineEnd = this.f31054a.getLineEnd(iA);
        if (i9 != lineStart && i9 != lineEnd) {
            return b(i8, z8);
        }
        if (i9 == 0 || i9 == this.f31054a.getText().length()) {
            return b(i8, z8);
        }
        int iE = e(i9, z9);
        boolean zH = h(iE);
        int i10 = i(lineEnd, lineStart);
        int iF = f(iE);
        int i11 = lineStart - iF;
        int i12 = i10 - iF;
        Bidi bidiA = a(iE);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i11, i12) : null;
        boolean z10 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f31054a.isRtlCharAt(lineStart);
            if (z8 || zH == zIsRtlCharAt) {
                zH = !zH;
            }
            if (i9 == lineStart) {
                z10 = zH;
            } else if (!zH) {
                z10 = true;
            }
            Layout layout = this.f31054a;
            return z10 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (i9 == lineStart) {
            for (int i16 = 0; i16 < runCount; i16++) {
                if (aVarArr[i16].b() == i9) {
                    i15 = i16;
                    break;
                }
            }
            a aVar = aVarArr[i15];
            if (z8 || zH == aVar.c()) {
                zH = !zH;
            }
            if (i15 == 0 && zH) {
                return this.f31054a.getLineLeft(iA);
            }
            if (i15 != C0934n.T(aVarArr) || zH) {
                return zH ? this.f31054a.getPrimaryHorizontal(aVarArr[i15 - 1].b()) : this.f31054a.getPrimaryHorizontal(aVarArr[i15 + 1].b());
            }
            return this.f31054a.getLineRight(iA);
        }
        if (i9 > i10) {
            i9 = i(i9, lineStart);
        }
        for (int i17 = 0; i17 < runCount; i17++) {
            if (aVarArr[i17].a() == i9) {
                i15 = i17;
                break;
            }
        }
        a aVar2 = aVarArr[i15];
        if (!z8 && zH != aVar2.c()) {
            zH = !zH;
        }
        if (i15 == 0 && zH) {
            return this.f31054a.getLineLeft(iA);
        }
        if (i15 != C0934n.T(aVarArr) || zH) {
            return zH ? this.f31054a.getPrimaryHorizontal(aVarArr[i15 - 1].a()) : this.f31054a.getPrimaryHorizontal(aVarArr[i15 + 1].a());
        }
        return this.f31054a.getLineRight(iA);
    }

    public final int d(int i8) {
        return i(this.f31054a.getLineEnd(i8), this.f31054a.getLineStart(i8));
    }

    public final int e(int i8, boolean z8) {
        int iM = r.m(this.f31055b, Integer.valueOf(i8), 0, 0, 6, null);
        int i9 = iM < 0 ? -(iM + 1) : iM + 1;
        if (z8 && i9 > 0) {
            int i10 = i9 - 1;
            if (i8 == ((Number) this.f31055b.get(i10)).intValue()) {
                return i10;
            }
        }
        return i9;
    }

    public final int f(int i8) {
        if (i8 == 0) {
            return 0;
        }
        return ((Number) this.f31055b.get(i8 - 1)).intValue();
    }

    public final boolean g(char c8) {
        if (c8 == ' ' || c8 == '\n' || c8 == 5760) {
            return true;
        }
        return (t.h(c8, 8192) >= 0 && t.h(c8, 8202) <= 0 && c8 != 8199) || c8 == 8287 || c8 == 12288;
    }

    public final boolean h(int i8) {
        return this.f31054a.getParagraphDirection(this.f31054a.getLineForOffset(f(i8))) == -1;
    }

    public final int i(int i8, int i9) {
        while (i8 > i9 && g(this.f31054a.getText().charAt(i8 - 1))) {
            i8--;
        }
        return i8;
    }
}
