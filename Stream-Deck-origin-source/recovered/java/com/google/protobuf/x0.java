package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class x0 extends v0 {
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public w0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(w0 w0Var) {
        return w0Var.d();
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(w0 w0Var) {
        return w0Var.e();
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public w0 k(w0 w0Var, w0 w0Var2) {
        if (w0.c().equals(w0Var2)) {
            return w0Var;
        }
        return w0.c().equals(w0Var) ? w0.n(w0Var, w0Var2) : w0Var.k(w0Var2);
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public w0 n() {
        return w0.o();
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, w0 w0Var) {
        p(obj, w0Var);
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, w0 w0Var) {
        ((GeneratedMessageLite) obj).unknownFields = w0Var;
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public w0 r(w0 w0Var) {
        w0Var.h();
        return w0Var;
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(w0 w0Var, D0 d8) {
        w0Var.t(d8);
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(w0 w0Var, D0 d8) {
        w0Var.v(d8);
    }

    @Override // com.google.protobuf.v0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.v0
    public boolean q(m0 m0Var) {
        return false;
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(w0 w0Var, int i8, int i9) {
        w0Var.r(C0.c(i8, 5), Integer.valueOf(i9));
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(w0 w0Var, int i8, long j8) {
        w0Var.r(C0.c(i8, 1), Long.valueOf(j8));
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(w0 w0Var, int i8, w0 w0Var2) {
        w0Var.r(C0.c(i8, 3), w0Var2);
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(w0 w0Var, int i8, AbstractC2097h abstractC2097h) {
        w0Var.r(C0.c(i8, 2), abstractC2097h);
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(w0 w0Var, int i8, long j8) {
        w0Var.r(C0.c(i8, 0), Long.valueOf(j8));
    }

    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public w0 f(Object obj) {
        w0 w0VarG = g(obj);
        if (w0VarG != w0.c()) {
            return w0VarG;
        }
        w0 w0VarO = w0.o();
        p(obj, w0VarO);
        return w0VarO;
    }
}
