package p055g0;

import C6.v;
import L0.i;
import androidx.compose.foundation.gestures.a;
import p047f1.g;
import p047f1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z extends i.c implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f23303o = p047f1.i.b(v.a(a.h(), Boolean.TRUE));

    public z(boolean z8) {
        this.f23302n = z8;
    }

    public final void d2(boolean z8) {
        this.f23302n = z8;
    }

    @Override // p047f1.h
    public g u0() {
        return this.f23302n ? this.f23303o : p047f1.i.a();
    }
}
