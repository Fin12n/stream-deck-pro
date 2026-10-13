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
public class e1 extends H implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f38742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f38743c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f38744c;

        public a(Object obj) {
            this.f38744c = obj;
        }

        @Override // J0.I
        public void c(I i8) {
            t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f38744c = ((a) i8).f38744c;
        }

        @Override // J0.I
        public I d() {
            return new a(this.f38744c);
        }

        public final Object i() {
            return this.f38744c;
        }

        public final void j(Object obj) {
            this.f38744c = obj;
        }
    }

    public e1(Object obj, f1 f1Var) {
        this.f38742b = f1Var;
        this.f38743c = new a(obj);
    }

    @Override // J0.G
    public I c() {
        return this.f38743c;
    }

    @Override // J0.u
    public f1 d() {
        return this.f38742b;
    }

    @Override // p215z0.InterfaceC3164l0, p215z0.q1
    public Object getValue() {
        return ((a) p.X(this.f38743c, this)).i();
    }

    @Override // J0.G
    public void o(I i8) {
        t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f38743c = (a) i8;
    }

    @Override // J0.G
    public I s(I i8, I i9, I i10) {
        t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) i8;
        t.e(i9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) i9;
        t.e(i10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) i10;
        if (d().a(aVar2.i(), aVar3.i())) {
            return i9;
        }
        Object objB = d().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        I iD = aVar3.d();
        t.e(iD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((a) iD).j(objB);
        return iD;
    }

    @Override // p215z0.InterfaceC3164l0
    public void setValue(Object obj) {
        AbstractC1028k abstractC1028kD;
        a aVar = (a) p.F(this.f38743c);
        if (d().a(aVar.i(), obj)) {
            return;
        }
        a aVar2 = this.f38743c;
        p.J();
        synchronized (p.I()) {
            abstractC1028kD = AbstractC1028k.f3974e.d();
            ((a) p.S(aVar2, this, abstractC1028kD, aVar)).j(obj);
            G g8 = G.f1419a;
        }
        p.Q(abstractC1028kD, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) p.F(this.f38743c)).i() + ")@" + hashCode();
    }
}
