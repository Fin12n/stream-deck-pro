package J7;

import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f4410a = Logger.getLogger("okio.Okio");

    public static final boolean c(AssertionError assertionError) {
        kotlin.jvm.internal.t.g(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? Z6.w.M(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final A d(File file, boolean z8) {
        kotlin.jvm.internal.t.g(file, "<this>");
        return p.g(new FileOutputStream(file, z8));
    }

    public static final A e(OutputStream outputStream) {
        kotlin.jvm.internal.t.g(outputStream, "<this>");
        return new t(outputStream, new D());
    }

    public static final A f(Socket socket) throws IOException {
        kotlin.jvm.internal.t.g(socket, "<this>");
        B b8 = new B(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.t.f(outputStream, "getOutputStream(...)");
        return b8.z(new t(outputStream, b8));
    }

    public static /* synthetic */ A g(File file, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return p.f(file, z8);
    }

    public static final C h(File file) {
        kotlin.jvm.internal.t.g(file, "<this>");
        return new o(new FileInputStream(file), D.f4357e);
    }

    public static final C i(InputStream inputStream) {
        kotlin.jvm.internal.t.g(inputStream, "<this>");
        return new o(inputStream, new D());
    }

    public static final C j(Socket socket) throws IOException {
        kotlin.jvm.internal.t.g(socket, "<this>");
        B b8 = new B(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.t.f(inputStream, "getInputStream(...)");
        return b8.A(new o(inputStream, b8));
    }

    public static final A b(File file) {
        kotlin.jvm.internal.t.g(file, cFAYKUlMj.cXflCc);
        return p.g(new FileOutputStream(file, true));
    }
}
