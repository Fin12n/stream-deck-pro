package A;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p090k.zI.jULK;

/* JADX INFO: renamed from: A.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0888o0 extends D0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f295k;

    public /* synthetic */ C0888o0(List list, V0 v8, List list2, int i8, AbstractC2633k abstractC2633k) {
        this(list, (i8 & 2) != 0 ? null : v8, (i8 & 4) != 0 ? D6.r.n() : list2);
    }

    @Override // A.D0
    public boolean m() {
        return this.f295k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0888o0(List<? extends T0> list, V0 v8, List<? extends AbstractC0885n> effects) {
        super(list, v8, effects, null, null, null, 56, null);
        kotlin.jvm.internal.t.g(list, jULK.PaungCfu);
        kotlin.jvm.internal.t.g(effects, "effects");
        this.f295k = true;
    }

    public C0888o0(U0 useCaseGroup) {
        kotlin.jvm.internal.t.g(useCaseGroup, "useCaseGroup");
        throw null;
    }
}
