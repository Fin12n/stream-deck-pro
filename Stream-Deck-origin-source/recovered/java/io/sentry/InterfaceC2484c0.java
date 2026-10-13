package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2484c0 {
    void a(Object obj, Writer writer);

    void b(W1 w8, OutputStream outputStream);

    Object c(Reader reader, Class cls);

    W1 d(InputStream inputStream);

    Object e(Reader reader, Class cls, InterfaceC2524m0 interfaceC2524m0);

    String f(Map map);
}
