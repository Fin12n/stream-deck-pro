package X5;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F extends p115m6.E implements C {
    /* JADX WARN: Multi-variable type inference failed */
    public F() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p115m6.E
    public String toString() {
        return "Parameters " + a();
    }

    public /* synthetic */ F(Map map, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? D6.M.g() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Map<String, ? extends List<String>> values) {
        super(true, values);
        kotlin.jvm.internal.t.g(values, "values");
    }
}
