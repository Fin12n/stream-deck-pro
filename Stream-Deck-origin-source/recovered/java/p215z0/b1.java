package p215z0;

import C6.G;
import J0.AbstractC1028k;
import J0.H;
import J0.I;
import J0.p;
import J0.u;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b1 extends H implements InterfaceC3158i0, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f38732b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f38733c;

        public a(float f8) {
            this.f38733c = f8;
        }

        @Override // J0.I
        public void c(I i8) {
            t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f38733c = ((a) i8).f38733c;
        }

        @Override // J0.I
        public I d() {
            return new a(this.f38733c);
        }

        public final float i() {
            return this.f38733c;
        }

        public final void j(float f8) {
            this.f38733c = f8;
        }
    }

    public b1(float f8) {
        this.f38732b = new a(f8);
    }

    @Override // p215z0.InterfaceC3158i0, p215z0.L
    public float b() {
        return ((a) p.X(this.f38732b, this)).i();
    }

    @Override // J0.G
    public I c() {
        return this.f38732b;
    }

    @Override // J0.u
    public f1 d() {
        return g1.r();
    }

    @Override // p215z0.InterfaceC3158i0
    public void k(float f8) {
        AbstractC1028k abstractC1028kD;
        a aVar = (a) p.F(this.f38732b);
        if (aVar.i() == f8) {
            return;
        }
        a aVar2 = this.f38732b;
        p.J();
        synchronized (p.I()) {
            abstractC1028kD = AbstractC1028k.f3974e.d();
            ((a) p.S(aVar2, this, abstractC1028kD, aVar)).j(f8);
            G g8 = G.f1419a;
        }
        p.Q(abstractC1028kD, this);
    }

    @Override // J0.G
    public void o(I i8) {
        t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f38732b = (a) i8;
    }

    @Override // J0.G
    public I s(I i8, I i9, I i10) {
        t.e(i9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        t.e(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) i9).i() == ((a) i10).i()) {
            return i9;
        }
        return null;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) p.F(this.f38732b)).i() + ")@" + hashCode();
    }
}
