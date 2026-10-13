package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface W0 extends Closeable {
    static Date J1(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return AbstractC2519l.e(str);
            } catch (Exception e8) {
                iLogger.b(EnumC2596z2.ERROR, "Error when deserializing millis timestamp format.", e8);
                return null;
            }
        } catch (Exception unused) {
            return AbstractC2519l.f(str);
        }
    }

    Double D0();

    String F0();

    String G();

    List O1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0);

    void R();

    Date S0(ILogger iLogger);

    Integer T();

    Boolean Z0();

    Long a0();

    TimeZone g0(ILogger iLogger);

    Float j1();

    String k0();

    Object m1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0);

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    io.sentry.vendor.gson.stream.b peek();

    Map q0(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0);

    void s(boolean z8);

    void t0(ILogger iLogger, Map map, String str);

    void u();

    void x();

    Object y1();
}
