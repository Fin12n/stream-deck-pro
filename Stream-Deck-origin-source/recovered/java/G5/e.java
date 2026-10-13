package G5;

import C6.G;
import G6.g;
import J5.h;
import Q6.k;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J5.b f2810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J5.b bVar) {
            super(1);
            this.f2810a = bVar;
        }

        public final void b(Throwable th) throws IOException {
            this.f2810a.close();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public static final G5.a a(h engineFactory, k block) {
        t.g(engineFactory, "engineFactory");
        t.g(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        J5.b bVarA = engineFactory.a(bVar.d());
        G5.a aVar = new G5.a(bVarA, bVar, true);
        g.b bVarA2 = aVar.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        t.d(bVarA2);
        ((InterfaceC1815v0) bVarA2).H0(new a(bVarA));
        return aVar;
    }
}
