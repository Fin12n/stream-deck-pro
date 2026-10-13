package p016b6;

import D6.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15856a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<? extends d> sourceGrammars) {
        super(null);
        t.g(sourceGrammars, "sourceGrammars");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sourceGrammars) {
            if (obj instanceof h) {
                w.E(arrayList, ((c) obj).b());
            } else {
                arrayList.add(obj);
            }
        }
        this.f15856a = arrayList;
    }

    @Override // p016b6.c
    public List b() {
        return this.f15856a;
    }
}
