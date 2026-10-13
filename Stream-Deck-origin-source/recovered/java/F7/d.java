package F7;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2433a = new d();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        t.g(record, "record");
        c cVar = c.f2430a;
        String loggerName = record.getLoggerName();
        t.f(loggerName, "record.loggerName");
        int iB = e.b(record);
        String message = record.getMessage();
        t.f(message, "record.message");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
