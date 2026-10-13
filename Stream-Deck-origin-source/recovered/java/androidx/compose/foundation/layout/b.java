package androidx.compose.foundation.layout;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p082j0.InterfaceC2603g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2603g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14485a = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.c f14486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0.c cVar) {
            super(1);
            this.f14486a = cVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("align");
            c2403m0.c(this.f14486a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    @Override // p082j0.InterfaceC2603g
    public i c(i iVar, L0.c cVar) {
        return iVar.j(new BoxChildDataElement(cVar, false, AbstractC2401l0.c() ? new a(cVar) : AbstractC2401l0.a()));
    }
}
