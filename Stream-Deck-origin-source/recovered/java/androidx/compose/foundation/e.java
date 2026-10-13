package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import p046f0.C2284l;
import p073i0.m;
import p110m1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C2284l f14374v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f14375w;

    public /* synthetic */ e(m mVar, boolean z8, String str, h hVar, Function0 function0, AbstractC2633k abstractC2633k) {
        this(mVar, z8, str, hVar, function0);
    }

    @Override // androidx.compose.foundation.a
    /* JADX INFO: renamed from: n2, reason: merged with bridge method [inline-methods] */
    public f k2() {
        return this.f14375w;
    }

    public C2284l o2() {
        return this.f14374v;
    }

    public final void p2(m mVar, boolean z8, String str, h hVar, Function0 function0) {
        m2(mVar, z8, str, hVar, function0);
        o2().f2(z8, str, hVar, function0, null, null);
        k2().q2(z8, mVar, function0);
    }

    public e(m mVar, boolean z8, String str, h hVar, Function0 function0) {
        super(mVar, z8, str, hVar, function0, null);
        this.f14374v = (C2284l) d2(new C2284l(z8, str, hVar, function0, null, null, null));
        this.f14375w = (f) d2(new f(z8, mVar, function0, l2()));
    }
}
