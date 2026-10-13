package p057g2;

import G6.d;
import Q6.k;
import kotlin.jvm.internal.t;
import p048f2.C2302e;
import p048f2.InterfaceC2303f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2303f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23680a;

    public b(k produceNewData) {
        t.g(produceNewData, "produceNewData");
        this.f23680a = produceNewData;
    }

    @Override // p048f2.InterfaceC2303f
    public Object a(C2302e c2302e, d dVar) {
        return this.f23680a.invoke(c2302e);
    }
}
