package H;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0994n0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Surface f2834o;

    public B0(Surface surface, Size size, int i8) {
        super(size, i8);
        this.f2834o = surface;
    }

    @Override // H.AbstractC0994n0
    public Y4.a o() {
        return K.n.p(this.f2834o);
    }

    public B0(Surface surface) {
        this.f2834o = surface;
    }
}
