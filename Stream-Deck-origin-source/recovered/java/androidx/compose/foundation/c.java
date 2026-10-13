package androidx.compose.foundation;

import C6.G;
import L0.i;
import Q6.k;
import R0.C1598l0;
import R0.N0;
import R0.T0;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f14344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T0 f14345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, T0 t8) {
            super(1);
            this.f14344a = j8;
            this.f14345b = t8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("background");
            c2403m0.c(C1598l0.g(this.f14344a));
            c2403m0.a().b("color", C1598l0.g(this.f14344a));
            c2403m0.a().b("shape", this.f14345b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, long j8, T0 t8) {
        return iVar.j(new BackgroundElement(j8, null, 1.0f, t8, AbstractC2401l0.c() ? new a(j8, t8) : AbstractC2401l0.a(), 2, null));
    }

    public static /* synthetic */ i b(i iVar, long j8, T0 t8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            t8 = N0.a();
        }
        return a(iVar, j8, t8);
    }
}
