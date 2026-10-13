package p121n3;

import android.view.Choreographer;
import p004a3.AbstractC1699e;
import p004a3.C1705k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1705k f30559l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30551d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30552e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f30553f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30554g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f30555h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30556i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30557j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f30558k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30560m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30561n = false;

    public void B() {
        this.f30560m = true;
        w();
        this.f30553f = 0L;
        if (s() && m() == q()) {
            E(p());
        } else if (!s() && m() == p()) {
            E(q());
        }
        f();
    }

    public void C() {
        I(-r());
    }

    public void D(C1705k c1705k) {
        boolean z8 = this.f30559l == null;
        this.f30559l = c1705k;
        if (z8) {
            G(Math.max(this.f30557j, c1705k.p()), Math.min(this.f30558k, c1705k.f()));
        } else {
            G((int) c1705k.p(), (int) c1705k.f());
        }
        float f8 = this.f30555h;
        this.f30555h = 0.0f;
        this.f30554g = 0.0f;
        E((int) f8);
        h();
    }

    public void E(float f8) {
        if (this.f30554g == f8) {
            return;
        }
        float fB = i.b(f8, q(), p());
        this.f30554g = fB;
        if (this.f30561n) {
            fB = (float) Math.floor(fB);
        }
        this.f30555h = fB;
        this.f30553f = 0L;
        h();
    }

    public void F(float f8) {
        G(this.f30557j, f8);
    }

    public void G(float f8, float f9) {
        if (f8 > f9) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f8), Float.valueOf(f9)));
        }
        C1705k c1705k = this.f30559l;
        float fP = c1705k == null ? -3.4028235E38f : c1705k.p();
        C1705k c1705k2 = this.f30559l;
        float f10 = c1705k2 == null ? Float.MAX_VALUE : c1705k2.f();
        float fB = i.b(f8, fP, f10);
        float fB2 = i.b(f9, fP, f10);
        if (fB == this.f30557j && fB2 == this.f30558k) {
            return;
        }
        this.f30557j = fB;
        this.f30558k = fB2;
        E((int) i.b(this.f30555h, fB, fB2));
    }

    public void H(int i8) {
        G(i8, (int) this.f30558k);
    }

    public void I(float f8) {
        this.f30551d = f8;
    }

    public void J(boolean z8) {
        this.f30561n = z8;
    }

    public final void K() {
        if (this.f30559l == null) {
            return;
        }
        float f8 = this.f30555h;
        if (f8 < this.f30557j || f8 > this.f30558k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f30557j), Float.valueOf(this.f30558k), Float.valueOf(this.f30555h)));
        }
    }

    @Override // p121n3.a
    public void a() {
        super.a();
        b(s());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        x();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        w();
        if (this.f30559l == null || !isRunning()) {
            return;
        }
        AbstractC1699e.b("LottieValueAnimator#doFrame");
        long j9 = this.f30553f;
        float fN = (j9 != 0 ? j8 - j9 : 0L) / n();
        float f8 = this.f30554g;
        if (s()) {
            fN = -fN;
        }
        float f9 = f8 + fN;
        boolean zD = i.d(f9, q(), p());
        float f10 = this.f30554g;
        float fB = i.b(f9, q(), p());
        this.f30554g = fB;
        if (this.f30561n) {
            fB = (float) Math.floor(fB);
        }
        this.f30555h = fB;
        this.f30553f = j8;
        if (!this.f30561n || this.f30554g != f10) {
            h();
        }
        if (!zD) {
            if (getRepeatCount() == -1 || this.f30556i < getRepeatCount()) {
                e();
                this.f30556i++;
                if (getRepeatMode() == 2) {
                    this.f30552e = !this.f30552e;
                    C();
                } else {
                    float fP = s() ? p() : q();
                    this.f30554g = fP;
                    this.f30555h = fP;
                }
                this.f30553f = j8;
            } else {
                float fQ = this.f30551d < 0.0f ? q() : p();
                this.f30554g = fQ;
                this.f30555h = fQ;
                x();
                b(s());
            }
        }
        K();
        AbstractC1699e.c("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fQ;
        float fP;
        float fQ2;
        if (this.f30559l == null) {
            return 0.0f;
        }
        if (s()) {
            fQ = p() - this.f30555h;
            fP = p();
            fQ2 = q();
        } else {
            fQ = this.f30555h - q();
            fP = p();
            fQ2 = q();
        }
        return fQ / (fP - fQ2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(l());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C1705k c1705k = this.f30559l;
        if (c1705k == null) {
            return 0L;
        }
        return (long) c1705k.d();
    }

    public void i() {
        this.f30559l = null;
        this.f30557j = -2.1474836E9f;
        this.f30558k = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f30560m;
    }

    public void k() {
        x();
        b(s());
    }

    public float l() {
        C1705k c1705k = this.f30559l;
        if (c1705k == null) {
            return 0.0f;
        }
        return (this.f30555h - c1705k.p()) / (this.f30559l.f() - this.f30559l.p());
    }

    public float m() {
        return this.f30555h;
    }

    public final float n() {
        C1705k c1705k = this.f30559l;
        if (c1705k == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c1705k.i()) / Math.abs(this.f30551d);
    }

    public float p() {
        C1705k c1705k = this.f30559l;
        if (c1705k == null) {
            return 0.0f;
        }
        float f8 = this.f30558k;
        return f8 == 2.1474836E9f ? c1705k.f() : f8;
    }

    public float q() {
        C1705k c1705k = this.f30559l;
        if (c1705k == null) {
            return 0.0f;
        }
        float f8 = this.f30557j;
        return f8 == -2.1474836E9f ? c1705k.p() : f8;
    }

    public float r() {
        return this.f30551d;
    }

    public final boolean s() {
        return r() < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i8) {
        super.setRepeatMode(i8);
        if (i8 == 2 || !this.f30552e) {
            return;
        }
        this.f30552e = false;
        C();
    }

    public void u() {
        x();
        d();
    }

    public void v() {
        this.f30560m = true;
        g(s());
        E((int) (s() ? p() : q()));
        this.f30553f = 0L;
        this.f30556i = 0;
        w();
    }

    public void w() {
        if (isRunning()) {
            z(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void x() {
        z(true);
    }

    public void z(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f30560m = false;
        }
    }
}
