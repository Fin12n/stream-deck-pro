package p192w1;

import androidx.emoji2.text.c;
import kotlin.jvm.internal.t;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1 f36743a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f36744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f36745b;

        public a(InterfaceC3164l0 interfaceC3164l0, j jVar) {
            this.f36744a = interfaceC3164l0;
            this.f36745b = jVar;
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th) {
            this.f36745b.f36743a = n.f36750a;
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            this.f36744a.setValue(Boolean.TRUE);
            this.f36745b.f36743a = new o(true);
        }
    }

    public j() {
        this.f36743a = c.k() ? c() : null;
    }

    @Override // p192w1.m
    public q1 a() {
        q1 q1Var = this.f36743a;
        if (q1Var != null) {
            t.d(q1Var);
            return q1Var;
        }
        if (!c.k()) {
            return n.f36750a;
        }
        q1 q1VarC = c();
        this.f36743a = q1VarC;
        t.d(q1VarC);
        return q1VarC;
    }

    public final q1 c() {
        c cVarC = c.c();
        if (cVarC.g() == 1) {
            return new o(true);
        }
        InterfaceC3164l0 interfaceC3164l0E = l1.e(Boolean.FALSE, null, 2, null);
        cVarC.v(new a(interfaceC3164l0E, this));
        return interfaceC3164l0E;
    }
}
