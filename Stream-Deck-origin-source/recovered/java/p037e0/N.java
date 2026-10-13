package p037e0;

import C6.o;
import C6.v;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f20054b;

    public /* synthetic */ N(Object obj, B b8, AbstractC2633k abstractC2633k) {
        this(obj, b8);
    }

    public final B a() {
        return this.f20054b;
    }

    public final Object b() {
        return this.f20053a;
    }

    public final void c(B b8) {
        this.f20054b = b8;
    }

    public final o d(k kVar) {
        return v.a(kVar.invoke(this.f20053a), this.f20054b);
    }

    public N(Object obj, B b8) {
        this.f20053a = obj;
        this.f20054b = b8;
    }
}
