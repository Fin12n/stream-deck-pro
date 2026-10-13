package Y5;

import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12490a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p221z6.d f12491b = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends p221z6.d {
        public a() {
            super(1000);
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public int[] t() {
            return new int[512];
        }
    }

    public static final void c(e eVar, String indent, Appendable out) throws IOException {
        t.g(eVar, "<this>");
        t.g(indent, "indent");
        t.g(out, "out");
        int iE = eVar.e();
        for (int i8 = 0; i8 < iE; i8++) {
            out.append(indent);
            out.append(eVar.f(i8));
            out.append(" => ");
            out.append(eVar.i(i8));
            out.append("\n");
        }
    }
}
