package N4;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;

/* JADX INFO: renamed from: N4.ba, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1097ba extends AbstractC1121da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7059d;

    public C1097ba(float f8, float f9, float f10, float f11, float f12) {
        this.f7056a = f8;
        this.f7057b = f9;
        this.f7058c = f10;
        this.f7059d = f11;
    }

    @Override // N4.AbstractC1121da
    public final float a() {
        return 0.0f;
    }

    @Override // N4.AbstractC1121da
    public final float b() {
        return this.f7058c;
    }

    @Override // N4.AbstractC1121da
    public final float c() {
        return this.f7056a;
    }

    @Override // N4.AbstractC1121da
    public final float d() {
        return this.f7059d;
    }

    @Override // N4.AbstractC1121da
    public final float e() {
        return this.f7057b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1121da) {
            AbstractC1121da abstractC1121da = (AbstractC1121da) obj;
            if (Float.floatToIntBits(this.f7056a) == Float.floatToIntBits(abstractC1121da.c()) && Float.floatToIntBits(this.f7057b) == Float.floatToIntBits(abstractC1121da.e()) && Float.floatToIntBits(this.f7058c) == Float.floatToIntBits(abstractC1121da.b()) && Float.floatToIntBits(this.f7059d) == Float.floatToIntBits(abstractC1121da.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                abstractC1121da.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f7056a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f7057b)) * 1000003) ^ Float.floatToIntBits(this.f7058c)) * 1000003) ^ Float.floatToIntBits(this.f7059d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f7056a + ", yMin=" + this.f7057b + ", xMax=" + this.f7058c + ", yMax=" + this.f7059d + ajyWhveMDgQ.ouglihlXqpP + "0.0}";
    }
}
