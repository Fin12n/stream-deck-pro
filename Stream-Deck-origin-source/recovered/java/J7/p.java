package J7;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    public static final A a(File file) {
        return q.b(file);
    }

    public static final A b() {
        return r.a();
    }

    public static final InterfaceC1035f c(A a8) {
        return r.b(a8);
    }

    public static final g d(C c8) {
        return r.c(c8);
    }

    public static final boolean e(AssertionError assertionError) {
        return q.c(assertionError);
    }

    public static final A f(File file, boolean z8) {
        return q.d(file, z8);
    }

    public static final A g(OutputStream outputStream) {
        return q.e(outputStream);
    }

    public static final A h(Socket socket) {
        return q.f(socket);
    }

    public static final C j(File file) {
        return q.h(file);
    }

    public static final C k(InputStream inputStream) {
        return q.i(inputStream);
    }

    public static final C l(Socket socket) {
        return q.j(socket);
    }
}
