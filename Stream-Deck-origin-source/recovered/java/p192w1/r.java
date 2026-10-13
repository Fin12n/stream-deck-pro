package p192w1;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f36752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f36753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f36754c;

    public r(q1 q1Var, r rVar) {
        this.f36752a = q1Var;
        this.f36753b = rVar;
        this.f36754c = q1Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f36754c;
        t.e(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f36752a.getValue() != this.f36754c) {
            return true;
        }
        r rVar = this.f36753b;
        return rVar != null && rVar.b();
    }

    public /* synthetic */ r(q1 q1Var, r rVar, int i8, AbstractC2633k abstractC2633k) {
        this(q1Var, (i8 & 2) != 0 ? null : rVar);
    }
}
