package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o3 implements ILogger {
    @Override // io.sentry.ILogger
    public void a(EnumC2596z2 enumC2596z2, Throwable th, String str, Object... objArr) {
        if (th == null) {
            c(enumC2596z2, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC2596z2, String.format(str, objArr), th.toString(), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC2596z2 enumC2596z2, String str, Throwable th) {
        if (th == null) {
            c(enumC2596z2, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC2596z2, String.format(str, th.toString()), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC2596z2 enumC2596z2, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC2596z2, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC2596z2 enumC2596z2) {
        return true;
    }

    public final String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
