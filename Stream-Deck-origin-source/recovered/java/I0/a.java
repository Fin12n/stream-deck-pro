package I0;

import Q6.o;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: I0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0139a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f3674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0139a(o oVar) {
            super(2);
            this.f3674a = oVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Object obj) {
            List list = (List) this.f3674a.invoke(lVar, obj);
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj2 = list.get(i8);
                if (obj2 != null && !lVar.a(obj2)) {
                    throw new IllegalArgumentException(HRHLwtyqJWz.UVUvLxgarb);
                }
            }
            if (list.isEmpty()) {
                return null;
            }
            return new ArrayList(list);
        }
    }

    public static final j a(o oVar, Q6.k kVar) {
        C0139a c0139a = new C0139a(oVar);
        t.e(kVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return k.a(c0139a, (Q6.k) P.e(kVar, 1));
    }
}
