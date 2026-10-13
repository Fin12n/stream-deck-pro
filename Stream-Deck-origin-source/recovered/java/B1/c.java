package B1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements B1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f912c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f913d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f915b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final float b(float f8, float[] fArr, float[] fArr2) {
            float f9;
            float f10;
            float f11;
            float fA;
            float fAbs = Math.abs(f8);
            float fSignum = Math.signum(f8);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i8 = -(iBinarySearch + 1);
                int i9 = i8 - 1;
                float f12 = 0.0f;
                if (i9 >= fArr.length - 1) {
                    float f13 = fArr[fArr.length - 1];
                    float f14 = fArr2[fArr.length - 1];
                    if (f13 == 0.0f) {
                        return 0.0f;
                    }
                    return f8 * (f14 / f13);
                }
                if (i9 == -1) {
                    f9 = fArr[0];
                    f11 = fArr2[0];
                    f10 = 0.0f;
                } else {
                    f12 = fArr[i9];
                    f9 = fArr[i8];
                    f10 = fArr2[i9];
                    f11 = fArr2[i8];
                }
                fA = d.f916a.a(f10, f11, f12, f9, fAbs);
            }
            return fSignum * fA;
        }

        public a() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f914a = fArr;
        this.f915b = fArr2;
    }

    @Override // B1.a
    public float a(float f8) {
        return f912c.b(f8, this.f915b, this.f914a);
    }

    @Override // B1.a
    public float b(float f8) {
        return f912c.b(f8, this.f914a, this.f915b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f914a, cVar.f914a) && Arrays.equals(this.f915b, cVar.f915b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f914a) * 31) + Arrays.hashCode(this.f915b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f914a);
        String str = kDsnNkYbBsI.vXYfMYh;
        t.f(string, str);
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f915b);
        t.f(string2, str);
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
