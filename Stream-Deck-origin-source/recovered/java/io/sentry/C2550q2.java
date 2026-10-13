package io.sentry;

import io.sentry.util.C2576h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2550q2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f27527d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2553r2 f27528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f27529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f27530c;

    /* JADX INFO: renamed from: io.sentry.q2$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f27531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callable f27532b;

        public a(Callable<byte[]> callable) {
            this.f27532b = callable;
        }

        public static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable callable;
            if (this.f27531a == null && (callable = this.f27532b) != null) {
                this.f27531a = (byte[]) callable.call();
            }
            return b(this.f27531a);
        }
    }

    public C2550q2(C2553r2 c2553r2, byte[] bArr) {
        this.f27528a = (C2553r2) io.sentry.util.u.c(c2553r2, "SentryEnvelopeItemHeader is required.");
        this.f27530c = bArr;
        this.f27529b = null;
    }

    public static byte[] D(Map map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry entry : map.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f27527d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static /* synthetic */ byte[] f(InterfaceC2484c0 interfaceC2484c0, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f27527d));
            try {
                interfaceC2484c0.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] h(InterfaceC2484c0 interfaceC2484c0, P1 p8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f27527d));
            try {
                interfaceC2484c0.a(p8, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] i(File file, long j8, C2497f1 c2497f1, InterfaceC2484c0 interfaceC2484c0) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strC = io.sentry.vendor.a.c(C2576h.b(file.getPath(), j8), 3);
        if (strC.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        c2497f1.F(strC);
        c2497f1.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f27527d));
                    try {
                        interfaceC2484c0.a(c2497f1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                file.delete();
                throw th5;
            }
        } catch (IOException e8) {
            throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e8.getMessage()));
        }
    }

    public static /* synthetic */ byte[] k(InterfaceC2484c0 interfaceC2484c0, K2 k8, C2517k1 c2517k1, File file, ILogger iLogger, boolean z8) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f27527d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC2484c0.a(k8, bufferedWriter);
                    linkedHashMap.put(EnumC2592y2.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (c2517k1 != null) {
                        interfaceC2484c0.a(c2517k1, bufferedWriter);
                        linkedHashMap.put(EnumC2592y2.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = C2576h.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(EnumC2592y2.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrD = D(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z8) {
                            C2576h.a(file.getParentFile());
                            return bArrD;
                        }
                        file.delete();
                    }
                    return bArrD;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                iLogger.b(EnumC2596z2.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z8) {
                        C2576h.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] o(InterfaceC2484c0 interfaceC2484c0, Y2 y8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f27527d));
            try {
                interfaceC2484c0.a(y8, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ byte[] r(C2479b c2479b, long j8, InterfaceC2484c0 interfaceC2484c0, ILogger iLogger) throws io.sentry.exception.b {
        if (c2479b.e() != null) {
            byte[] bArrE = c2479b.e();
            s(bArrE.length, j8, c2479b.g());
            return bArrE;
        }
        if (c2479b.i() != null) {
            byte[] bArrB = io.sentry.util.p.b(interfaceC2484c0, iLogger, c2479b.i());
            if (bArrB != null) {
                s(bArrB.length, j8, c2479b.g());
                return bArrB;
            }
        } else if (c2479b.h() != null) {
            return C2576h.b(c2479b.h(), j8);
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", c2479b.g()));
    }

    public static void s(long j8, long j9, String str) throws io.sentry.exception.b {
        if (j8 > j9) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static C2550q2 t(final InterfaceC2484c0 interfaceC2484c0, final ILogger iLogger, final C2479b c2479b, final long j8) {
        final a aVar = new a(new Callable() { // from class: io.sentry.j2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.r(c2479b, j8, interfaceC2484c0, iLogger);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.Attachment, new Callable() { // from class: io.sentry.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, c2479b.f(), c2479b.g(), c2479b.d()), new Callable() { // from class: io.sentry.l2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static C2550q2 u(final InterfaceC2484c0 interfaceC2484c0, final io.sentry.clientreport.c cVar) {
        io.sentry.util.u.c(interfaceC2484c0, "ISerializer is required.");
        io.sentry.util.u.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.e2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.f(interfaceC2484c0, cVar);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.resolve(cVar), new Callable() { // from class: io.sentry.f2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.g2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static C2550q2 v(final InterfaceC2484c0 interfaceC2484c0, final P1 p8) {
        io.sentry.util.u.c(interfaceC2484c0, "ISerializer is required.");
        io.sentry.util.u.c(p8, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.b2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.h(interfaceC2484c0, p8);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.resolve(p8), new Callable() { // from class: io.sentry.c2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static C2550q2 w(final C2497f1 c2497f1, final long j8, final InterfaceC2484c0 interfaceC2484c0) {
        final File fileC = c2497f1.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.m2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.i(fileC, j8, c2497f1, interfaceC2484c0);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.Profile, new Callable() { // from class: io.sentry.n2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileC.getName()), new Callable() { // from class: io.sentry.o2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static C2550q2 x(final InterfaceC2484c0 interfaceC2484c0, final ILogger iLogger, final K2 k8, final C2517k1 c2517k1, final boolean z8) {
        final File fileG0 = k8.g0();
        final a aVar = new a(new Callable() { // from class: io.sentry.Y1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.k(interfaceC2484c0, k8, c2517k1, fileG0, iLogger, z8);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.ReplayVideo, new Callable() { // from class: io.sentry.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), new Callable() { // from class: io.sentry.i2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static C2550q2 y(final InterfaceC2484c0 interfaceC2484c0, final Y2 y8) {
        io.sentry.util.u.c(interfaceC2484c0, "ISerializer is required.");
        io.sentry.util.u.c(y8, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.p2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2550q2.o(interfaceC2484c0, y8);
            }
        });
        return new C2550q2(new C2553r2(EnumC2592y2.Session, new Callable() { // from class: io.sentry.Z1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public byte[] A() {
        Callable callable;
        if (this.f27530c == null && (callable = this.f27529b) != null) {
            this.f27530c = (byte[]) callable.call();
        }
        return this.f27530c;
    }

    public C2553r2 B() {
        return this.f27528a;
    }

    public io.sentry.protocol.B C(InterfaceC2484c0 interfaceC2484c0) throws IOException {
        C2553r2 c2553r2 = this.f27528a;
        if (c2553r2 == null || c2553r2.b() != EnumC2592y2.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(A()), f27527d));
        try {
            io.sentry.protocol.B b8 = (io.sentry.protocol.B) interfaceC2484c0.c(bufferedReader, io.sentry.protocol.B.class);
            bufferedReader.close();
            return b8;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public io.sentry.clientreport.c z(InterfaceC2484c0 interfaceC2484c0) throws IOException {
        C2553r2 c2553r2 = this.f27528a;
        if (c2553r2 == null || c2553r2.b() != EnumC2592y2.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(A()), f27527d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) interfaceC2484c0.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C2550q2(C2553r2 c2553r2, Callable callable) {
        this.f27528a = (C2553r2) io.sentry.util.u.c(c2553r2, "SentryEnvelopeItemHeader is required.");
        this.f27529b = (Callable) io.sentry.util.u.c(callable, "DataFactory is required.");
        this.f27530c = null;
    }
}
