package androidx.lifecycle;

import V.ocy.SVzBK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f15223a;

    public G(J provider) {
        kotlin.jvm.internal.t.g(provider, "provider");
        this.f15223a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p source, AbstractC1726i.a aVar) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(aVar, SVzBK.LkeTWgLHxHsiskG);
        if (aVar == AbstractC1726i.a.ON_CREATE) {
            source.w().d(this);
            this.f15223a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
