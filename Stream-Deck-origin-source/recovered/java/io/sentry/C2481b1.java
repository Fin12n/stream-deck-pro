package io.sentry;

import io.sentry.util.AbstractC2571c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2481b1 extends AbstractC2558t implements O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Charset f26982i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f26983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f26984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2484c0 f26985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ILogger f26986h;

    public C2481b1(X x8, N n8, InterfaceC2484c0 interfaceC2484c0, ILogger iLogger, long j8, int i8) {
        super(x8, iLogger, j8, i8);
        this.f26983e = (X) io.sentry.util.u.c(x8, "Scopes are required.");
        this.f26984f = (N) io.sentry.util.u.c(n8, "Envelope reader is required.");
        this.f26985g = (InterfaceC2484c0) io.sentry.util.u.c(interfaceC2484c0, "Serializer is required.");
        this.f26986h = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(C2481b1 c2481b1, File file, io.sentry.hints.k kVar) {
        c2481b1.getClass();
        if (kVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            c2481b1.f26986h.c(EnumC2596z2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e8) {
            c2481b1.f26986h.a(EnumC2596z2.ERROR, e8, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.O
    public void a(String str, H h8) {
        io.sentry.util.u.c(str, "Path is required.");
        e(new File(str), h8);
    }

    @Override // io.sentry.AbstractC2558t
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC2558t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC2558t
    public void e(final File file, H h8) {
        io.sentry.util.u.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f26986h.c(EnumC2596z2.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    W1 w1A = this.f26984f.a(bufferedInputStream);
                    if (w1A == null) {
                        this.f26986h.c(EnumC2596z2.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m(w1A, h8);
                        this.f26986h.c(EnumC2596z2.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f26986h, new io.sentry.util.m.a() { // from class: io.sentry.Z0
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            C2481b1.f(this.f26072a, file, (io.sentry.hints.k) obj);
                        }
                    });
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                this.f26986h.b(EnumC2596z2.ERROR, "Error processing envelope.", e8);
                io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f26986h, new io.sentry.util.m.a() { // from class: io.sentry.Z0
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        C2481b1.f(this.f26072a, file, (io.sentry.hints.k) obj);
                    }
                });
            }
        } catch (Throwable th3) {
            io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f26986h, new io.sentry.util.m.a() { // from class: io.sentry.Z0
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    C2481b1.f(this.f26072a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th3;
        }
    }

    public final r3 h(p3 p3Var) {
        String strB;
        if (p3Var != null && (strB = p3Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.y.g(dValueOf, false)) {
                    String strA = p3Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.y.g(dValueOf2, false)) {
                            return new r3(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.y.a(new r3(Boolean.TRUE, dValueOf));
                }
                this.f26986h.c(EnumC2596z2.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f26986h.c(EnumC2596z2.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new r3(Boolean.TRUE);
    }

    public final void i(C2550q2 c2550q2, int i8) {
        this.f26986h.c(EnumC2596z2.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i8), c2550q2.B().b());
    }

    public final void j(int i8) {
        this.f26986h.c(EnumC2596z2.DEBUG, "Item %d is being captured.", Integer.valueOf(i8));
    }

    public final void k(io.sentry.protocol.u uVar) {
        this.f26986h.c(EnumC2596z2.WARNING, "Timed out waiting for event id submission: %s", uVar);
    }

    public final void l(W1 w8, io.sentry.protocol.u uVar, int i8) {
        this.f26986h.c(EnumC2596z2.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i8), w8.b().a(), uVar);
    }

    public final void m(W1 w8, H h8) {
        Object objG;
        this.f26986h.c(EnumC2596z2.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(AbstractC2571c.d(w8.c())));
        int i8 = 0;
        for (C2550q2 c2550q2 : w8.c()) {
            i8++;
            if (c2550q2.B() == null) {
                this.f26986h.c(EnumC2596z2.ERROR, "Item %d has no header", Integer.valueOf(i8));
            } else if (EnumC2592y2.Event.equals(c2550q2.B().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c2550q2.A()), f26982i));
                    try {
                        C2557s2 c2557s2 = (C2557s2) this.f26985g.c(bufferedReader, C2557s2.class);
                        if (c2557s2 == null) {
                            i(c2550q2, i8);
                        } else {
                            if (c2557s2.L() != null) {
                                io.sentry.util.m.o(h8, c2557s2.L().e());
                            }
                            if (w8.b().a() == null || w8.b().a().equals(c2557s2.G())) {
                                this.f26983e.F(c2557s2, h8);
                                j(i8);
                                if (!n(h8)) {
                                    k(c2557s2.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(w8, c2557s2.G(), i8);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objG = io.sentry.util.m.g(h8);
                        if (!(objG instanceof io.sentry.hints.p) && !((io.sentry.hints.p) objG).f()) {
                            this.f26986h.c(EnumC2596z2.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i8));
                            return;
                        }
                        io.sentry.util.m.k(h8, io.sentry.hints.j.class, new io.sentry.util.m.a() { // from class: io.sentry.a1
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                ((io.sentry.hints.j) obj).reset();
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.f26986h.b(EnumC2596z2.ERROR, "Item failed to process.", th3);
                }
            } else {
                if (EnumC2592y2.Transaction.equals(c2550q2.B().b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c2550q2.A()), f26982i));
                        try {
                            io.sentry.protocol.B b8 = (io.sentry.protocol.B) this.f26985g.c(bufferedReader2, io.sentry.protocol.B.class);
                            if (b8 == null) {
                                i(c2550q2, i8);
                            } else if (w8.b().a() == null || w8.b().a().equals(b8.G())) {
                                p3 p3VarC = w8.b().c();
                                if (b8.C().h() != null) {
                                    b8.C().h().s(h(p3VarC));
                                }
                                this.f26983e.t(b8, p3VarC, h8);
                                j(i8);
                                if (!n(h8)) {
                                    k(b8.G());
                                    bufferedReader2.close();
                                    return;
                                }
                            } else {
                                l(w8, b8.G(), i8);
                                bufferedReader2.close();
                            }
                            bufferedReader2.close();
                        } catch (Throwable th4) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        this.f26986h.b(EnumC2596z2.ERROR, "Item failed to process.", th6);
                    }
                } else {
                    this.f26983e.r(new W1(w8.b().a(), w8.b().b(), c2550q2), h8);
                    this.f26986h.c(EnumC2596z2.DEBUG, "%s item %d is being captured.", c2550q2.B().b().getItemType(), Integer.valueOf(i8));
                    if (!n(h8)) {
                        this.f26986h.c(EnumC2596z2.WARNING, "Timed out waiting for item type submission: %s", c2550q2.B().b().getItemType());
                        return;
                    }
                }
                objG = io.sentry.util.m.g(h8);
                if (!(objG instanceof io.sentry.hints.p)) {
                }
                io.sentry.util.m.k(h8, io.sentry.hints.j.class, new io.sentry.util.m.a() { // from class: io.sentry.a1
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).reset();
                    }
                });
            }
        }
    }

    public final boolean n(H h8) {
        Object objG = io.sentry.util.m.g(h8);
        if (objG instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objG).e();
        }
        io.sentry.util.s.a(io.sentry.hints.i.class, objG, this.f26986h);
        return true;
    }
}
