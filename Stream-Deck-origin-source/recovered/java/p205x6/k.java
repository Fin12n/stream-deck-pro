package p205x6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37426i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f37427j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a() {
            return k.f37427j;
        }

        public a() {
        }
    }

    static {
        y6.a.d dVar = p213y6.a.f38436j;
        f37427j = new k(dVar.a(), 0L, dVar.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p213y6.a head, long j8, g pool) {
        super(head, j8, pool);
        t.g(head, "head");
        t.g(pool, "pool");
        q1();
    }

    @Override // p205x6.n
    public final p213y6.a H0() {
        return null;
    }

    @Override // p205x6.n
    public final int J0(ByteBuffer destination, int i8, int i9) {
        t.g(destination, "destination");
        return 0;
    }

    public final k j2() {
        return new k(h.a(V0()), o1(), k1());
    }

    public String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(p213y6.a head, g pool) {
        this(head, h.e(head), pool);
        t.g(head, "head");
        t.g(pool, "pool");
    }

    @Override // p205x6.n
    public final void v() {
    }
}
