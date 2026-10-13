package androidx.compose.foundation.layout;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p082j0.EnumC2621z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EnumC2621z f14487a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC2621z enumC2621z) {
            super(1);
            this.f14487a = enumC2621z;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("width");
            c2403m0.a().b("intrinsicSize", this.f14487a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, EnumC2621z enumC2621z) {
        return iVar.j(new IntrinsicWidthElement(enumC2621z, true, AbstractC2401l0.c() ? new a(enumC2621z) : AbstractC2401l0.a()));
    }
}
