package p046f0;

import A1.d;
import Q0.f;
import Q0.g;
import Q0.l;
import S6.c;
import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X implements V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f21346b = new X();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f21347c = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends W.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // f0.W.a, p046f0.U
        public void b(long j8, long j9, float f8) {
            if (!Float.isNaN(f8)) {
                d().setZoom(f8);
            }
            if (g.c(j9)) {
                d().show(f.o(j8), f.p(j8), f.o(j9), f.p(j9));
            } else {
                d().show(f.o(j8), f.p(j8));
            }
        }
    }

    @Override // p046f0.V
    public boolean a() {
        return f21347c;
    }

    @Override // p046f0.V
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b(View view, boolean z8, long j8, float f8, float f9, boolean z9, d dVar, float f10) {
        if (z8) {
            return new a(new Magnifier(view));
        }
        long jI1 = dVar.i1(j8);
        float fE0 = dVar.E0(f8);
        float fE1 = dVar.E0(f9);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jI1 != l.f9103b.a()) {
            builder.setSize(c.d(l.i(jI1)), c.d(l.g(jI1)));
        }
        if (!Float.isNaN(fE0)) {
            builder.setCornerRadius(fE0);
        }
        if (!Float.isNaN(fE1)) {
            builder.setElevation(fE1);
        }
        if (!Float.isNaN(f10)) {
            builder.setInitialZoom(f10);
        }
        builder.setClippingEnabled(z9);
        return new a(builder.build());
    }
}
