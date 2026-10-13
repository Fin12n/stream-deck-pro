package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: io.sentry.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2566u0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.vendor.gson.stream.c f27704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2559t0 f27705b;

    public C2566u0(Writer writer, int i8) {
        this.f27704a = new io.sentry.vendor.gson.stream.c(writer);
        this.f27705b = new C2559t0(i8);
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C2566u0 f(Number number) throws IOException {
        this.f27704a.T0(number);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C2566u0 c(String str) throws IOException {
        this.f27704a.V0(str);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C2566u0 d(boolean z8) throws IOException {
        this.f27704a.a1(z8);
        return this;
    }

    @Override // io.sentry.X0
    public X0 e(String str) throws IOException {
        this.f27704a.z(str);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2566u0 l() throws IOException {
        this.f27704a.j();
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2566u0 x() throws IOException {
        this.f27704a.o();
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2566u0 j() {
        this.f27704a.v();
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C2566u0 u() {
        this.f27704a.y();
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2566u0 k(String str) {
        this.f27704a.A(str);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2566u0 i() throws IOException {
        this.f27704a.i0();
        return this;
    }

    @Override // io.sentry.X0
    public void s(boolean z8) {
        this.f27704a.s(z8);
    }

    public void t(String str) {
        this.f27704a.H0(str);
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C2566u0 b(double d8) throws IOException {
        this.f27704a.L0(d8);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C2566u0 a(long j8) throws IOException {
        this.f27704a.O0(j8);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2566u0 g(ILogger iLogger, Object obj) {
        this.f27705b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.X0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C2566u0 h(Boolean bool) throws IOException {
        this.f27704a.Q0(bool);
        return this;
    }
}
