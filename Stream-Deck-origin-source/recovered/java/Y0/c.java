package Y0;

import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f12085b;

    public /* synthetic */ c(int i8, k kVar, AbstractC2633k abstractC2633k) {
        this(i8, kVar);
    }

    @Override // Y0.b
    public int a() {
        return ((a) this.f12085b.getValue()).i();
    }

    public void b(int i8) {
        this.f12085b.setValue(a.c(i8));
    }

    public c(int i8, k kVar) {
        this.f12084a = kVar;
        this.f12085b = l1.e(a.c(i8), null, 2, null);
    }
}
