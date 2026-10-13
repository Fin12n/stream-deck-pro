package p025c6;

import Z6.j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import p016b6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16282b;

    public b(j expression, Map<String, ? extends List<Integer>> indexes) {
        t.g(expression, "expression");
        t.g(indexes, "indexes");
        this.f16281a = expression;
        this.f16282b = indexes;
    }

    @Override // p016b6.i
    public boolean a(String input) {
        t.g(input, "input");
        return this.f16281a.d(input);
    }
}
