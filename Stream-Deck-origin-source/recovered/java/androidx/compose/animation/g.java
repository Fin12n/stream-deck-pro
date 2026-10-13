package androidx.compose.animation;

import D6.M;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p028d0.B;
import p028d0.F;
import p028d0.i;
import p028d0.p;
import p028d0.q;
import p028d0.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14284a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f14285b = new p(new F(null, null, null, null, false, null, 63, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f14286c = new p(new F(null, null, null, null, true, null, 47, null));

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a() {
            return g.f14285b;
        }

        public a() {
        }
    }

    public /* synthetic */ g(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract F b();

    public final g c(g gVar) {
        q qVarC = b().c();
        if (qVarC == null) {
            qVarC = gVar.b().c();
        }
        B bF = b().f();
        if (bF == null) {
            bF = gVar.b().f();
        }
        i iVarA = b().a();
        if (iVarA == null) {
            iVarA = gVar.b().a();
        }
        x xVarE = b().e();
        if (xVarE == null) {
            xVarE = gVar.b().e();
        }
        return new p(new F(qVarC, bF, iVarA, xVarE, b().d() || gVar.b().d(), M.n(b().b(), gVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && t.c(((g) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (t.c(this, f14285b)) {
            return "ExitTransition.None";
        }
        if (t.c(this, f14286c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        F fB = b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        q qVarC = fB.c();
        sb.append(qVarC != null ? qVarC.toString() : null);
        sb.append(",\nSlide - ");
        B bF = fB.f();
        sb.append(bF != null ? bF.toString() : null);
        sb.append(",\nShrink - ");
        i iVarA = fB.a();
        sb.append(iVarA != null ? iVarA.toString() : null);
        sb.append(",\nScale - ");
        x xVarE = fB.e();
        sb.append(xVarE != null ? xVarE.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(fB.d());
        return sb.toString();
    }

    public g() {
    }
}
