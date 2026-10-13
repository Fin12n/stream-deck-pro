package p216z1;

import C6.m;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.P0;
import R0.U0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39032a = a.f39033a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f39033a = new a();

        public final n a(AbstractC1582d0 abstractC1582d0, float f8) {
            if (abstractC1582d0 == null) {
                return b.f39034b;
            }
            if (abstractC1582d0 instanceof U0) {
                return b(m.c(((U0) abstractC1582d0).b(), f8));
            }
            if (abstractC1582d0 instanceof P0) {
                return new p216z1.c((P0) abstractC1582d0, f8);
            }
            throw new m();
        }

        public final n b(long j8) {
            return j8 != C1598l0.f9405b.e() ? new p216z1.d(j8, null) : b.f39034b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f39034b = new b();

        @Override // p216z1.n
        public float c() {
            return Float.NaN;
        }

        @Override // p216z1.n
        public long d() {
            return C1598l0.f9405b.e();
        }

        @Override // p216z1.n
        public AbstractC1582d0 e() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return n.this;
        }
    }

    default n a(n nVar) {
        boolean z8 = nVar instanceof p216z1.c;
        if (z8 && (this instanceof p216z1.c)) {
            return new p216z1.c(((p216z1.c) nVar).f(), m.d(nVar.c(), new c()));
        }
        if (!z8 || (this instanceof p216z1.c)) {
            return (z8 || !(this instanceof p216z1.c)) ? nVar.b(new d()) : this;
        }
        return nVar;
    }

    default n b(Function0 function0) {
        return !t.c(this, b.f39034b) ? this : (n) function0.invoke();
    }

    float c();

    long d();

    AbstractC1582d0 e();
}
