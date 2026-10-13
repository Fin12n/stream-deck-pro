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
public class d1 extends H implements InterfaceC3162k0, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f38740b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f38741c;

        public a(long j8) {
            this.f38741c = j8;
        }

        @Override // J0.I
        public void c(I i8) {
            t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f38741c = ((a) i8).f38741c;
        }

        @Override // J0.I
        public I d() {
            return new a(this.f38741c);
        }

        public final long i() {
            return this.f38741c;
        }

        public final void j(long j8) {
            this.f38741c = j8;
        }
    }

    public d1(long j8) {
        this.f38740b = new a(j8);
    }

    @Override // p215z0.InterfaceC3162k0, p215z0.InterfaceC3144b0
    public long a() {
        return ((a) p.X(this.f38740b, this)).i();
    }

    @Override // J0.G
    public I c() {
        return this.f38740b;
    }

    @Override // J0.u
    public f1 d() {
        return g1.r();
    }

    @Override // J0.G
    public void o(I i8) {
        t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f38740b = (a) i8;
    }

    @Override // J0.G
    public I s(I i8, I i9, I i10) {
        t.e(i9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        t.e(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) i9).i() == ((a) i10).i()) {
            return i9;
        }
        return null;
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) p.F(this.f38740b)).i() + ")@" + hashCode();
    }

    @Override // p215z0.InterfaceC3162k0
    public void v(long j8) {
        AbstractC1028k abstractC1028kD;
        a aVar = (a) p.F(this.f38740b);
        if (aVar.i() != j8) {
            a aVar2 = this.f38740b;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                ((a) p.S(aVar2, this, abstractC1028kD, aVar)).j(j8);
                G g8 = G.f1419a;
            }
            p.Q(abstractC1028kD, this);
        }
    }
}
