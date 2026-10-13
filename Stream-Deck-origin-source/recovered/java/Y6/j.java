package Y6;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f12535a;

        public a(Q6.o oVar) {
            this.f12535a = oVar;
        }

        @Override // Y6.g
        public Iterator iterator() {
            return j.a(this.f12535a);
        }
    }

    public static final Iterator a(Q6.o block) {
        t.g(block, "block");
        h hVar = new h();
        hVar.e(H6.b.a(block, hVar, hVar));
        return hVar;
    }

    public static g b(Q6.o block) {
        t.g(block, "block");
        return new a(block);
    }
}
