package p168t1;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.u;
import p160s1.b;
import p192w1.p;
import p192w1.q;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f34021a = p.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34022b = new b(16);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ S f34024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S s8) {
            super(1);
            this.f34024b = s8;
        }

        public final void b(U u8) {
            q qVarB = T.this.b();
            T t8 = T.this;
            S s8 = this.f34024b;
            synchronized (qVarB) {
                try {
                    if (u8.h()) {
                        t8.f34022b.e(s8, u8);
                    } else {
                        t8.f34022b.f(s8);
                    }
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((U) obj);
            return G.f1419a;
        }
    }

    public final q b() {
        return this.f34021a;
    }

    public final q1 c(S s8, k kVar) {
        synchronized (this.f34021a) {
            U u8 = (U) this.f34022b.d(s8);
            if (u8 != null) {
                if (u8.h()) {
                    return u8;
                }
            }
            try {
                U u9 = (U) kVar.invoke(new a(s8));
                synchronized (this.f34021a) {
                    try {
                        if (this.f34022b.d(s8) == null && u9.h()) {
                            this.f34022b.e(s8, u9);
                        }
                        G g8 = G.f1419a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return u9;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }
}
