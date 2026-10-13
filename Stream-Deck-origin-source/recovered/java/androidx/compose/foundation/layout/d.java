package androidx.compose.foundation.layout;

import A1.h;
import C6.G;
import I0.mIk.efuWFSeiT;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.C2403m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f14489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8, float f9) {
            super(1);
            this.f14488a = f8;
            this.f14489b = f9;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b(com.amazon.device.iap.internal.c.b.as);
            c2403m0.a().b("x", h.d(this.f14488a));
            c2403m0.a().b(efuWFSeiT.ZHVDaTMwVEHgE, h.d(this.f14489b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f14490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(1);
            this.f14490a = kVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b(com.amazon.device.iap.internal.c.b.as);
            c2403m0.a().b(com.amazon.device.iap.internal.c.b.as, this.f14490a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, k kVar) {
        return iVar.j(new OffsetPxElement(kVar, true, new b(kVar)));
    }

    public static final i b(i iVar, float f8, float f9) {
        return iVar.j(new OffsetElement(f8, f9, true, new a(f8, f9), null));
    }
}
