package p016b6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15851a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d grammar) {
        super(null);
        t.g(grammar, "grammar");
        this.f15851a = grammar;
    }

    @Override // p016b6.o
    public d a() {
        return this.f15851a;
    }
}
