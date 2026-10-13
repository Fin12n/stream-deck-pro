package p016b6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String name, d grammar) {
        super(null);
        t.g(name, "name");
        t.g(grammar, "grammar");
        this.f15854a = name;
        this.f15855b = grammar;
    }

    public final d a() {
        return this.f15855b;
    }

    public final String c() {
        return this.f15854a;
    }
}
