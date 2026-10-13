package R0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y extends C1600m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9386d;

    public /* synthetic */ Y(long j8, int i8, ColorFilter colorFilter, AbstractC2633k abstractC2633k) {
        this(j8, i8, colorFilter);
    }

    public final int b() {
        return this.f9386d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y8 = (Y) obj;
        return C1598l0.q(this.f9385c, y8.f9385c) && X.E(this.f9386d, y8.f9386d);
    }

    public int hashCode() {
        return (C1598l0.w(this.f9385c) * 31) + X.F(this.f9386d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) C1598l0.x(this.f9385c)) + ", blendMode=" + ((Object) X.G(this.f9386d)) + ')';
    }

    public /* synthetic */ Y(long j8, int i8, AbstractC2633k abstractC2633k) {
        this(j8, i8);
    }

    public Y(long j8, int i8, ColorFilter colorFilter) {
        super(colorFilter);
        this.f9385c = j8;
        this.f9386d = i8;
    }

    public Y(long j8, int i8) {
        this(j8, i8, G.a(j8, i8), null);
    }
}
