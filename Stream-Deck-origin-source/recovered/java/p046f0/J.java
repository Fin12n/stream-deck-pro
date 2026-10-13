package p046f0;

import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p110m1.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f21300a = new w("MagnifierPositionInRoot", null, 2, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f21301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f21302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f21303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f21304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f21305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f21306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f21307g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, k kVar2, float f8, long j8, float f9, float f10, boolean z8) {
            super(1);
            this.f21301a = kVar;
            this.f21302b = kVar2;
            this.f21303c = f8;
            this.f21304d = j8;
            this.f21305e = f9;
            this.f21306f = f10;
            this.f21307g = z8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("magnifier (not supported)");
            c2403m0.a().b("sourceCenter", this.f21301a);
            c2403m0.a().b("magnifierCenter", this.f21302b);
            c2403m0.a().b("zoom", Float.valueOf(this.f21303c));
            c2403m0.a().b("size", A1.k.c(this.f21304d));
            c2403m0.a().b("cornerRadius", h.d(this.f21305e));
            c2403m0.a().b("elevation", h.d(this.f21306f));
            c2403m0.a().b("clippingEnabled", Boolean.valueOf(this.f21307g));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final w a() {
        return f21300a;
    }

    public static final boolean b(int i8) {
        return i8 >= 28;
    }

    public static /* synthetic */ boolean c(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = Build.VERSION.SDK_INT;
        }
        return b(i8);
    }

    public static final i d(i iVar, k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8) {
        if (c(0, 1, null)) {
            return iVar.j(new MagnifierElement(kVar, kVar2, kVar3, f8, z8, j8, f9, f10, z9, v8 == null ? V.f21341a.a() : v8, null));
        }
        return AbstractC2401l0.b(iVar, AbstractC2401l0.c() ? new a(kVar, kVar2, f8, j8, f9, f10, z9) : AbstractC2401l0.a(), i.f4836a);
    }

    public static /* synthetic */ i e(i iVar, k kVar, k kVar2, k kVar3, float f8, boolean z8, long j8, float f9, float f10, boolean z9, V v8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar2 = null;
        }
        if ((i8 & 4) != 0) {
            kVar3 = null;
        }
        if ((i8 & 8) != 0) {
            f8 = Float.NaN;
        }
        if ((i8 & 16) != 0) {
            z8 = false;
        }
        if ((i8 & 32) != 0) {
            j8 = A1.k.f441b.a();
        }
        if ((i8 & 64) != 0) {
            f9 = h.f432b.c();
        }
        if ((i8 & 128) != 0) {
            f10 = h.f432b.c();
        }
        if ((i8 & 256) != 0) {
            z9 = true;
        }
        if ((i8 & 512) != 0) {
            v8 = null;
        }
        return d(iVar, kVar, kVar2, kVar3, f8, z8, j8, f9, f10, z9, v8);
    }
}
