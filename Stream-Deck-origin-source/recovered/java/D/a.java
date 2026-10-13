package D;

import A.J;
import H.AbstractC0994n0;
import H.c1;
import H.u1;
import K.n;
import android.util.Size;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1666a = b.f1668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1667b = new C0064a();

    /* JADX INFO: renamed from: D.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0064a implements a {
        @Override // D.a
        public boolean a(c1 sessionConfig) {
            t.g(sessionConfig, "sessionConfig");
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f1668a = new b();

        /* JADX INFO: renamed from: D.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0065a extends AbstractC0994n0 {
            public C0065a(Size size, int i8) {
                super(size, i8);
            }

            @Override // H.AbstractC0994n0
            public Y4.a o() {
                Y4.a aVarP = n.p(null);
                t.f(aVarP, "immediateFuture(...)");
                return aVarP;
            }
        }

        public final c1.b a(u1 u1Var, Size resolution, J dynamicRange) {
            t.g(u1Var, "<this>");
            t.g(resolution, "resolution");
            t.g(dynamicRange, "dynamicRange");
            C0065a c0065a = new C0065a(resolution, u1Var.u());
            Class clsB = c.f1671c.c(u1Var).b();
            if (clsB != null) {
                c0065a.p(clsB);
            }
            c1.b bVarM = c1.b.q(u1Var, resolution).m(c0065a, dynamicRange);
            t.f(bVarM, "addSurface(...)");
            return bVarM;
        }
    }

    static c1.b b(u1 u1Var, Size size, J j8) {
        return f1666a.a(u1Var, size, j8);
    }

    boolean a(c1 c1Var);
}
