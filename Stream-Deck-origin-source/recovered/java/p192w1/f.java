package p192w1;

import A1.d;
import java.util.List;
import kotlin.jvm.internal.t;
import p128o1.C2736a;
import p128o1.I;
import p128o1.n;
import p128o1.q;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final n a(q qVar, int i8, boolean z8, long j8) {
        t.e(qVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C2736a((d) qVar, i8, z8, j8, null);
    }

    public static final n b(String str, I i8, List list, List list2, int i9, boolean z8, long j8, d dVar, AbstractC3009n.b bVar) {
        return new C2736a(new d(str, i8, list, list2, bVar, dVar), i9, z8, j8, null);
    }
}
