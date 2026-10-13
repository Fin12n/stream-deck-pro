package p089j7;

import Q6.p;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f28349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f28350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f28351d;

    public g(Object obj, p pVar, p pVar2, p pVar3) {
        this.f28348a = obj;
        this.f28349b = pVar;
        this.f28350c = pVar2;
        this.f28351d = pVar3;
    }

    @Override // p089j7.h
    public p a() {
        return this.f28349b;
    }

    @Override // p089j7.h
    public Object b() {
        return this.f28348a;
    }

    @Override // p089j7.h
    public p c() {
        return this.f28351d;
    }

    @Override // p089j7.h
    public p d() {
        return this.f28350c;
    }

    public /* synthetic */ g(Object obj, p pVar, p pVar2, p pVar3, int i8, AbstractC2633k abstractC2633k) {
        this(obj, pVar, pVar2, (i8 & 8) != 0 ? null : pVar3);
    }
}
