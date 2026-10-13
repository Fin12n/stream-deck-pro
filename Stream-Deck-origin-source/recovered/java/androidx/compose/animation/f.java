package androidx.compose.animation;

import D6.M;
import io.sentry.exception.uXy.SZCvugJaXc;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p028d0.B;
import p028d0.F;
import p028d0.i;
import p028d0.o;
import p028d0.q;
import p028d0.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14282a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14283b = new o(new F(null, null, null, null, false, null, 63, null));

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f a() {
            return f.f14283b;
        }

        public a() {
        }
    }

    public /* synthetic */ f(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract F b();

    public final f c(f fVar) {
        q qVarC = b().c();
        if (qVarC == null) {
            qVarC = fVar.b().c();
        }
        B bF = b().f();
        if (bF == null) {
            bF = fVar.b().f();
        }
        i iVarA = b().a();
        if (iVarA == null) {
            iVarA = fVar.b().a();
        }
        x xVarE = b().e();
        if (xVarE == null) {
            xVarE = fVar.b().e();
        }
        return new o(new F(qVarC, bF, iVarA, xVarE, false, M.n(b().b(), fVar.b().b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && t.c(((f) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public f() {
    }

    public String toString() {
        if (t.c(this, f14283b)) {
            return "EnterTransition.None";
        }
        F fB = b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        q qVarC = fB.c();
        sb.append(qVarC != null ? qVarC.toString() : null);
        sb.append(SZCvugJaXc.GlqatCnuS);
        B bF = fB.f();
        sb.append(bF != null ? bF.toString() : null);
        sb.append(",\nShrink - ");
        i iVarA = fB.a();
        sb.append(iVarA != null ? iVarA.toString() : null);
        sb.append(",\nScale - ");
        x xVarE = fB.e();
        sb.append(xVarE != null ? xVarE.toString() : null);
        return sb.toString();
    }
}
