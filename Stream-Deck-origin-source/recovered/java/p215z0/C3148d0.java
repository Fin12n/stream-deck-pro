package p215z0;

import Q6.k;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: z0.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3148d0 extends u implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f38739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3148d0(k kVar) {
        super(1);
        this.f38739a = kVar;
    }

    public final Object b(long j8) {
        return this.f38739a.invoke(Long.valueOf(j8 / 1000000));
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).longValue());
    }
}
