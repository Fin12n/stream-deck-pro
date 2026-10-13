package p136p1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f31063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f31064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31066d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31067e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f31068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31069g;

    public j(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.f31063a = charSequence;
        this.f31064b = textPaint;
        this.f31065c = i8;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f31069g) {
            this.f31068f = c.f31041a.c(this.f31063a, this.f31064b, A.j(this.f31065c));
            this.f31069g = true;
        }
        return this.f31068f;
    }

    public final float b() {
        if (!Float.isNaN(this.f31066d)) {
            return this.f31066d;
        }
        BoringLayout.Metrics metricsA = a();
        Float fValueOf = metricsA != null ? Float.valueOf(metricsA.width) : null;
        if (fValueOf == null) {
            CharSequence charSequence = this.f31063a;
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f31064b)));
        }
        if (l.e(fValueOf.floatValue(), this.f31063a, this.f31064b)) {
            fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
        }
        float fFloatValue = fValueOf.floatValue();
        this.f31066d = fFloatValue;
        return fFloatValue;
    }

    public final float c() {
        if (!Float.isNaN(this.f31067e)) {
            return this.f31067e;
        }
        float fC = l.c(this.f31063a, this.f31064b);
        this.f31067e = fC;
        return fC;
    }
}
