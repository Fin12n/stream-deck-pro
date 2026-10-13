package X;

import A.S0;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f11614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f11615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11616d = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a();
    }

    public n(FrameLayout frameLayout, f fVar) {
        this.f11614b = frameLayout;
        this.f11615c = fVar;
    }

    public Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f11615c.a(bitmapC, new Size(this.f11614b.getWidth(), this.f11614b.getHeight()), this.f11614b.getLayoutDirection());
    }

    public abstract View b();

    public abstract Bitmap c();

    public abstract void d();

    public abstract void e();

    public void f() {
        this.f11616d = true;
        h();
    }

    public abstract void g(S0 s8, a aVar);

    public void h() {
        View viewB = b();
        if (viewB == null || !this.f11616d) {
            return;
        }
        this.f11615c.s(new Size(this.f11614b.getWidth(), this.f11614b.getHeight()), this.f11614b.getLayoutDirection(), viewB);
    }

    public abstract Y4.a i();
}
