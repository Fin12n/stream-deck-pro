package p046f0;

import A1.a;
import A1.h;
import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21243b;

    public B(Context context) {
        super(context);
        this.f21242a = a.a(context).E0(h.m(1));
    }

    public final void a(float f8) {
        float f9 = this.f21243b + f8;
        this.f21243b = f9;
        if (Math.abs(f9) > this.f21242a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i8) {
        this.f21243b = 0.0f;
        super.onAbsorb(i8);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f8, float f9) {
        this.f21243b = 0.0f;
        super.onPull(f8, f9);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f21243b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f8) {
        this.f21243b = 0.0f;
        super.onPull(f8);
    }
}
