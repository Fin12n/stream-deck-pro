package p028d0;

import A1.r;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import p037e0.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f19600b;

    public A(boolean z8, o oVar) {
        this.f19599a = z8;
        this.f19600b = oVar;
    }

    @Override // p028d0.z
    public boolean a() {
        return this.f19599a;
    }

    @Override // p028d0.z
    public E b(long j8, long j9) {
        return (E) this.f19600b.invoke(r.b(j8), r.b(j9));
    }

    public /* synthetic */ A(boolean z8, o oVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8, oVar);
    }
}
