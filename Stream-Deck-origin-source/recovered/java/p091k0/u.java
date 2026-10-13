package p091k0;

import A1.b;
import A1.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p109m0.t;
import p109m0.v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f28525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f28526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28527c;

    public /* synthetic */ u(long j8, boolean z8, m mVar, v vVar, AbstractC2633k abstractC2633k) {
        this(j8, z8, mVar, vVar);
    }

    public abstract t a(int i8, Object obj, Object obj2, List list);

    public final t b(int i8) {
        return a(i8, this.f28525a.a(i8), this.f28525a.e(i8), this.f28526b.o0(i8, this.f28527c));
    }

    public final long c() {
        return this.f28527c;
    }

    public final t d() {
        return this.f28525a.b();
    }

    public u(long j8, boolean z8, m mVar, v vVar) {
        this.f28525a = mVar;
        this.f28526b = vVar;
        this.f28527c = c.b(0, z8 ? b.n(j8) : Integer.MAX_VALUE, 0, z8 ? Integer.MAX_VALUE : b.m(j8), 5, null);
    }
}
