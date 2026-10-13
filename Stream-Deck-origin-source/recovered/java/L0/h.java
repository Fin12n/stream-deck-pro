package L0;

import Q6.p;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4834a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i.b bVar) {
            return Boolean.valueOf(!(bVar instanceof g));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3163l f4835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3163l interfaceC3163l) {
            super(2);
            this.f4835a = interfaceC3163l;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke(i iVar, i.b bVar) {
            boolean z8 = bVar instanceof g;
            i iVarC = bVar;
            if (z8) {
                p pVarK = ((g) bVar).k();
                t.e(pVarK, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                iVarC = h.c(this.f4835a, (i) ((p) P.e(pVarK, 3)).invoke(i.f4836a, this.f4835a, 0));
            }
            return iVar.j(iVarC);
        }
    }

    public static final i a(i iVar, Q6.k kVar, p pVar) {
        return iVar.j(new g(kVar, pVar));
    }

    public static /* synthetic */ i b(i iVar, Q6.k kVar, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVar = AbstractC2401l0.a();
        }
        return a(iVar, kVar, pVar);
    }

    public static final i c(InterfaceC3163l interfaceC3163l, i iVar) {
        if (iVar.a(a.f4834a)) {
            return iVar;
        }
        interfaceC3163l.f(1219399079);
        i iVar2 = (i) iVar.b(i.f4836a, new b(interfaceC3163l));
        interfaceC3163l.N();
        return iVar2;
    }
}
