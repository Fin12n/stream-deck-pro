package io.sentry;

import R0.pkXL.Oitvkwcwn;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC2558t implements O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f25817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2484c0 f25818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ILogger f25819g;

    public B(X x8, InterfaceC2484c0 interfaceC2484c0, ILogger iLogger, long j8, int i8) {
        super(x8, iLogger, j8, i8);
        this.f25817e = (X) io.sentry.util.u.c(x8, "Scopes are required.");
        this.f25818f = (InterfaceC2484c0) io.sentry.util.u.c(interfaceC2484c0, "Serializer is required.");
        this.f25819g = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(B b8, io.sentry.hints.i iVar) {
        b8.getClass();
        if (iVar.e()) {
            return;
        }
        b8.f25819g.c(EnumC2596z2.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void h(B b8, Throwable th, File file, io.sentry.hints.k kVar) {
        b8.getClass();
        kVar.c(false);
        b8.f25819g.a(EnumC2596z2.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    @Override // io.sentry.O
    public void a(String str, H h8) {
        io.sentry.util.u.c(str, "Path is required.");
        e(new File(str), h8);
    }

    @Override // io.sentry.AbstractC2558t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC2558t
    public void e(final File file, H h8) {
        ILogger iLogger;
        io.sentry.util.m.a aVar;
        if (!file.isFile()) {
            this.f25819g.c(EnumC2596z2.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f25819g.c(EnumC2596z2.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f25819g.c(EnumC2596z2.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        W1 w1D = this.f25818f.d(bufferedInputStream);
                        if (w1D == null) {
                            this.f25819g.c(EnumC2596z2.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f25817e.r(w1D, h8);
                        }
                        io.sentry.util.m.m(h8, io.sentry.hints.i.class, this.f25819g, new io.sentry.util.m.a() { // from class: io.sentry.y
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                B.f(this.f27810a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f25819g, new io.sentry.util.m.a() { // from class: io.sentry.z
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                B.g(this.f27817a, file, (io.sentry.hints.k) obj);
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
                } catch (FileNotFoundException e8) {
                    this.f25819g.a(EnumC2596z2.ERROR, e8, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f25819g;
                    aVar = new io.sentry.util.m.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            B.g(this.f27817a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.m.m(h8, io.sentry.hints.k.class, iLogger, aVar);
                }
            } catch (IOException e9) {
                this.f25819g.a(EnumC2596z2.ERROR, e9, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f25819g;
                aVar = new io.sentry.util.m.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        B.g(this.f27817a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.m.m(h8, io.sentry.hints.k.class, iLogger, aVar);
            } catch (Throwable th3) {
                this.f25819g.a(EnumC2596z2.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f25819g, new io.sentry.util.m.a() { // from class: io.sentry.A
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        B.h(this.f25804a, th3, file, (io.sentry.hints.k) obj);
                    }
                });
                iLogger = this.f25819g;
                aVar = new io.sentry.util.m.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        B.g(this.f27817a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.m.m(h8, io.sentry.hints.k.class, iLogger, aVar);
            }
        } catch (Throwable th4) {
            io.sentry.util.m.m(h8, io.sentry.hints.k.class, this.f25819g, new io.sentry.util.m.a() { // from class: io.sentry.z
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    B.g(this.f27817a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th4;
        }
    }

    public final void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f25819g.c(EnumC2596z2.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f25819g.a(EnumC2596z2.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.AbstractC2558t
    public boolean c(String str) {
        return str.endsWith(Oitvkwcwn.QdGCmOkVyford);
    }

    public static /* synthetic */ void g(B b8, File file, io.sentry.hints.k kVar) {
        b8.getClass();
        if (!kVar.a()) {
            b8.i(file, "after trying to capture it");
            b8.f25819g.c(EnumC2596z2.DEBUG, Oitvkwcwn.ahoAeqIn, file.getAbsolutePath());
            return;
        }
        b8.f25819g.c(EnumC2596z2.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
    }
}
