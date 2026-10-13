package p017b7;

import G6.b;
import G6.g;
import Q6.k;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: b7.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1796l0 extends F implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15966c = new a(null);

    /* JADX INFO: renamed from: b7.l0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends b {

        /* JADX INFO: renamed from: b7.l0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0398a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0398a f15967a = new C0398a();

            public C0398a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC1796l0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC1796l0) {
                    return (AbstractC1796l0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
            super(F.f15894b, C0398a.f15967a);
        }
    }
}
