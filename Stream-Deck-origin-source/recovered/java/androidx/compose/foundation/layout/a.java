package androidx.compose.foundation.layout;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0360a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0360a(float f8, boolean z8) {
            super(1);
            this.f14483a = f8;
            this.f14484b = z8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("aspectRatio");
            c2403m0.a().b("ratio", Float.valueOf(this.f14483a));
            c2403m0.a().b("matchHeightConstraintsFirst", Boolean.valueOf(this.f14484b));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, float f8, boolean z8) {
        return iVar.j(new AspectRatioElement(f8, z8, AbstractC2401l0.c() ? new C0360a(f8, z8) : AbstractC2401l0.a()));
    }

    public static /* synthetic */ i b(i iVar, float f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return a(iVar, f8, z8);
    }
}
