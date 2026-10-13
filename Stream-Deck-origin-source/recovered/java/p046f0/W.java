package p046f0;

import A1.d;
import A1.s;
import Q0.f;
import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W implements V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f21343b = new W();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f21344c = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Magnifier f21345a;

        public a(Magnifier magnifier) {
            this.f21345a = magnifier;
        }

        @Override // p046f0.U
        public long a() {
            return s.a(this.f21345a.getWidth(), this.f21345a.getHeight());
        }

        @Override // p046f0.U
        public void b(long j8, long j9, float f8) {
            this.f21345a.show(f.o(j8), f.p(j8));
        }

        @Override // p046f0.U
        public void c() {
            this.f21345a.update();
        }

        public final Magnifier d() {
            return this.f21345a;
        }

        @Override // p046f0.U
        public void dismiss() {
            this.f21345a.dismiss();
        }
    }

    @Override // p046f0.V
    public boolean a() {
        return f21344c;
    }

    @Override // p046f0.V
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b(View view, boolean z8, long j8, float f8, float f9, boolean z9, d dVar, float f10) {
        return new a(new Magnifier(view));
    }
}
