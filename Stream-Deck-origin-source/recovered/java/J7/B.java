package J7;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends C1032c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Socket f4355o;

    public B(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "socket");
        this.f4355o = socket;
    }

    @Override // J7.C1032c
    public void B() {
        try {
            this.f4355o.close();
        } catch (AssertionError e8) {
            if (!p.e(e8)) {
                throw e8;
            }
            q.f4410a.log(Level.WARNING, "Failed to close timed out socket " + this.f4355o, (Throwable) e8);
        } catch (Exception e9) {
            q.f4410a.log(Level.WARNING, "Failed to close timed out socket " + this.f4355o, (Throwable) e9);
        }
    }

    @Override // J7.C1032c
    public IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
