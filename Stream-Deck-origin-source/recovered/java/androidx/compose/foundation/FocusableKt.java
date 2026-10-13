package androidx.compose.foundation;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p046f0.C2291t;
import p056g1.U;
import p065h1.AbstractC2401l0;
import p065h1.C2399k0;
import p065h1.C2403m0;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2399k0 f14301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f14302b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f14304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, m mVar) {
            super(1);
            this.f14303a = z8;
            this.f14304b = mVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("focusableInNonTouchMode");
            c2403m0.a().b("enabled", Boolean.valueOf(this.f14303a));
            c2403m0.a().b("interactionSource", this.f14304b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {
        public b() {
            super(1);
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("focusGroup");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f14301a = new C2399k0(AbstractC2401l0.c() ? new b() : AbstractC2401l0.a());
        f14302b = new U() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // p056g1.U
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // p056g1.U
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C2291t k() {
                return new C2291t();
            }

            @Override // p056g1.U
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void p(C2291t c2291t) {
            }
        };
    }

    public static final i a(i iVar, boolean z8, m mVar) {
        return iVar.j(z8 ? androidx.compose.ui.focus.d.a(new FocusableElement(mVar)) : i.f4836a);
    }

    public static /* synthetic */ i b(i iVar, boolean z8, m mVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            mVar = null;
        }
        return a(iVar, z8, mVar);
    }

    public static final i c(i iVar, boolean z8, m mVar) {
        return AbstractC2401l0.b(iVar, new a(z8, mVar), a(i.f4836a.j(f14302b), z8, mVar));
    }
}
