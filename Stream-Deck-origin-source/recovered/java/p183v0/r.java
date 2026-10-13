package p183v0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import W6.n;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35049e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1598l0 f35051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f35052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35053d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35054a = new b();

        public final void a(RippleDrawable rippleDrawable, int i8) {
            rippleDrawable.setRadius(i8);
        }
    }

    public r(boolean z8) {
        super(ColorStateList.valueOf(-16777216), null, z8 ? new ColorDrawable(-1) : null);
        this.f35050a = z8;
    }

    public final long a(long j8, float f8) {
        return C1598l0.o(j8, n.f(f8, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j8, float f8) {
        long jA = a(j8, f8);
        C1598l0 c1598l0 = this.f35051b;
        if (c1598l0 == null ? false : C1598l0.q(c1598l0.y(), jA)) {
            return;
        }
        this.f35051b = C1598l0.g(jA);
        setColor(ColorStateList.valueOf(AbstractC1602n0.j(jA)));
    }

    public final void c(int i8) {
        Integer num = this.f35052c;
        if (num != null && num.intValue() == i8) {
            return;
        }
        this.f35052c = Integer.valueOf(i8);
        b.f35054a.a(this, i8);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f35050a) {
            this.f35053d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f35053d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f35053d;
    }
}
