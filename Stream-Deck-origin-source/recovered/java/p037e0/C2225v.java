package p037e0;

import com.amazon.a.a.o.c.a.b;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;

/* JADX INFO: renamed from: e0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2225v implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20344d;

    @Override // p037e0.B
    public float a(float f8) {
        float f9 = 0.0f;
        if (f8 > 0.0f) {
            float f10 = 1.0f;
            if (f8 < 1.0f) {
                while (true) {
                    float f11 = (f9 + f10) / 2;
                    float fB = b(this.f20341a, this.f20343c, f11);
                    if (Math.abs(f8 - fB) < 0.001f) {
                        return b(this.f20342b, this.f20344d, f11);
                    }
                    if (fB < f8) {
                        f9 = f11;
                    } else {
                        f10 = f11;
                    }
                }
            }
        }
        return f8;
    }

    public final float b(float f8, float f9, float f10) {
        float f11 = 3;
        float f12 = 1 - f10;
        return (f8 * f11 * f12 * f12 * f10) + (f11 * f9 * f12 * f10 * f10) + (f10 * f10 * f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2225v)) {
            return false;
        }
        C2225v c2225v = (C2225v) obj;
        return this.f20341a == c2225v.f20341a && this.f20342b == c2225v.f20342b && this.f20343c == c2225v.f20343c && this.f20344d == c2225v.f20344d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f20341a) * 31) + Float.hashCode(this.f20342b)) * 31) + Float.hashCode(this.f20343c)) * 31) + Float.hashCode(this.f20344d);
    }

    public C2225v(float f8, float f9, float f10, float f11) {
        this.f20341a = f8;
        this.f20342b = f9;
        this.f20343c = f10;
        this.f20344d = f11;
        if (!Float.isNaN(f8) && !Float.isNaN(f9) && !Float.isNaN(f10) && !Float.isNaN(f11)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
        sb.append(f8);
        String str = yOZfxp.vsuhPsS;
        sb.append(str);
        sb.append(f9);
        sb.append(str);
        sb.append(f10);
        sb.append(str);
        sb.append(f11);
        sb.append(b.f16789a);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
