package p089j7;

import Q6.p;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f28345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f28346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f28347d;

    public e(Object obj, p pVar, p pVar2) {
        this.f28344a = obj;
        this.f28345b = pVar;
        this.f28346c = pVar2;
        this.f28347d = k.f28371a;
    }

    @Override // p089j7.h
    public p a() {
        return this.f28345b;
    }

    @Override // p089j7.h
    public Object b() {
        return this.f28344a;
    }

    @Override // p089j7.h
    public p c() {
        return this.f28346c;
    }

    @Override // p089j7.h
    public p d() {
        return this.f28347d;
    }

    public /* synthetic */ e(Object obj, p pVar, p pVar2, int i8, AbstractC2633k abstractC2633k) {
        this(obj, pVar, (i8 & 4) != 0 ? null : pVar2);
    }
}
