package p038e1;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f20432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar) {
            super(1);
            this.f20432a = kVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("onSizeChanged");
            c2403m0.a().b("onSizeChanged", this.f20432a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, k kVar) {
        return iVar.j(new V(kVar, AbstractC2401l0.c() ? new a(kVar) : AbstractC2401l0.a()));
    }
}
