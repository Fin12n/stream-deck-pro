package p028d0;

import androidx.compose.animation.a;
import androidx.compose.animation.f;
import androidx.compose.animation.g;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3185w0;
import p215z0.InterfaceC3158i0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f19680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f19681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3158i0 f19682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f19683d;

    public k(f fVar, g gVar, float f8, z zVar) {
        this.f19680a = fVar;
        this.f19681b = gVar;
        this.f19682c = AbstractC3185w0.a(f8);
        this.f19683d = zVar;
    }

    public final g a() {
        return this.f19681b;
    }

    public final z b() {
        return this.f19683d;
    }

    public final f c() {
        return this.f19680a;
    }

    public final float d() {
        return this.f19682c.b();
    }

    public /* synthetic */ k(f fVar, g gVar, float f8, z zVar, int i8, AbstractC2633k abstractC2633k) {
        this(fVar, gVar, (i8 & 4) != 0 ? 0.0f : f8, (i8 & 8) != 0 ? a.d(false, null, 3, null) : zVar);
    }
}
