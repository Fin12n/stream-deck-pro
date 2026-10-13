package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: renamed from: io.sentry.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2559t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2578v0 f27646a;

    public C2559t0(int i8) {
        this.f27646a = new C2578v0(i8);
    }

    public final void b(X0 x8, ILogger iLogger, Collection collection) {
        x8.l();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(x8, iLogger, it.next());
        }
        x8.j();
    }

    public final void c(X0 x8, ILogger iLogger, Date date) {
        try {
            x8.c(AbstractC2519l.g(date));
        } catch (Exception e8) {
            iLogger.b(EnumC2596z2.ERROR, "Error when serializing Date", e8);
            x8.i();
        }
    }

    public final void d(X0 x8, ILogger iLogger, Map map) {
        x8.x();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                x8.k((String) obj);
                a(x8, iLogger, map.get(obj));
            }
        }
        x8.u();
    }

    public final void e(X0 x8, ILogger iLogger, TimeZone timeZone) {
        try {
            x8.c(timeZone.getID());
        } catch (Exception e8) {
            iLogger.b(EnumC2596z2.ERROR, "Error when serializing TimeZone", e8);
            x8.i();
        }
    }

    public void a(X0 x8, ILogger iLogger, Object obj) {
        if (obj == null) {
            x8.i();
            return;
        }
        if (obj instanceof Character) {
            x8.c(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            x8.c((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            x8.d(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            x8.f((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(x8, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(x8, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof InterfaceC2582w0) {
            ((InterfaceC2582w0) obj).serialize(x8, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(x8, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(x8, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(x8, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            x8.c(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(x8, iLogger, io.sentry.util.p.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            x8.d(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            x8.c(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            x8.c(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            x8.c(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            x8.c(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(x8, iLogger, io.sentry.util.p.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            x8.c(obj.toString());
            return;
        }
        try {
            a(x8, iLogger, this.f27646a.d(obj, iLogger));
        } catch (Exception e8) {
            iLogger.b(EnumC2596z2.ERROR, "Failed serializing unknown object.", e8);
            x8.c(GOKsbdzhLhXAMt.ZumCKOQfArD);
        }
    }
}
