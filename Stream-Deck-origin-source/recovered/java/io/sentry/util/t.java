package io.sentry.util;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.W0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque f27732a;

    public t(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f27732a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.W0
    public Double D0() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return Double.valueOf(((Number) objT).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.W0
    public String F0() throws IOException {
        Map.Entry entry = (Map.Entry) this.f27732a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.W0
    public String G() throws IOException {
        String str = (String) t();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // io.sentry.W0
    public List O1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        try {
            b();
            ArrayList arrayList = new ArrayList();
            if (j()) {
                do {
                    try {
                        arrayList.add(interfaceC2524m0.a(this, iLogger));
                    } catch (Exception e8) {
                        iLogger.b(EnumC2596z2.WARNING, "Failed to deserialize object in list.", e8);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            c();
            return arrayList;
        } catch (Exception e9) {
            throw new IOException(e9);
        }
    }

    @Override // io.sentry.W0
    public Date S0(ILogger iLogger) {
        return W0.J1(k0(), iLogger);
    }

    @Override // io.sentry.W0
    public Integer T() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return Integer.valueOf(((Number) objT).intValue());
        }
        return null;
    }

    @Override // io.sentry.W0
    public Boolean Z0() {
        return (Boolean) t();
    }

    @Override // io.sentry.W0
    public Long a0() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return Long.valueOf(((Number) objT).longValue());
        }
        return null;
    }

    public void b() throws IOException {
        Map.Entry entry = (Map.Entry) this.f27732a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f27732a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f27732a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    public void c() {
        if (this.f27732a.size() > 1) {
            this.f27732a.removeLast();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27732a.clear();
    }

    @Override // io.sentry.W0
    public TimeZone g0(ILogger iLogger) {
        String strK0 = k0();
        if (strK0 != null) {
            return TimeZone.getTimeZone(strK0);
        }
        return null;
    }

    public boolean j() {
        return !this.f27732a.isEmpty();
    }

    @Override // io.sentry.W0
    public Float j1() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return Float.valueOf(((Number) objT).floatValue());
        }
        return null;
    }

    @Override // io.sentry.W0
    public String k0() {
        return (String) t();
    }

    @Override // io.sentry.W0
    public Object m1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) {
        return v(iLogger, interfaceC2524m0);
    }

    @Override // io.sentry.W0
    public double nextDouble() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return ((Number) objT).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.W0
    public float nextFloat() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return ((Number) objT).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.W0
    public int nextInt() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return ((Number) objT).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.W0
    public long nextLong() throws IOException {
        Object objT = t();
        if (objT instanceof Number) {
            return ((Number) objT).longValue();
        }
        throw new IOException("Expected long");
    }

    public void o() throws IOException {
        if (t() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.W0
    public io.sentry.vendor.gson.stream.b peek() {
        if (this.f27732a.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) this.f27732a.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.b.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.b.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.b.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.W0
    public Map q0(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        try {
            x();
            HashMap map = new HashMap();
            if (j()) {
                while (true) {
                    try {
                        map.put(F0(), interfaceC2524m0.a(this, iLogger));
                    } catch (Exception e8) {
                        iLogger.b(EnumC2596z2.WARNING, "Failed to deserialize object in map.", e8);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            u();
            return map;
        } catch (Exception e9) {
            throw new IOException(e9);
        }
    }

    public final Object t() throws IOException {
        try {
            return v(null, null);
        } catch (Exception e8) {
            throw new IOException(e8);
        }
    }

    @Override // io.sentry.W0
    public void t0(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, y1());
        } catch (Exception e8) {
            iLogger.a(EnumC2596z2.ERROR, e8, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.W0
    public void u() {
        if (this.f27732a.size() > 1) {
            this.f27732a.removeLast();
        }
    }

    public final Object v(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) {
        Map.Entry entry = (Map.Entry) this.f27732a.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (interfaceC2524m0 != null && iLogger != null) {
            return interfaceC2524m0.a(this, iLogger);
        }
        this.f27732a.removeLast();
        return value;
    }

    @Override // io.sentry.W0
    public void x() throws IOException {
        Map.Entry entry = (Map.Entry) this.f27732a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f27732a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f27732a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.W0
    public Object y1() {
        return t();
    }

    @Override // io.sentry.W0
    public void R() {
    }

    @Override // io.sentry.W0
    public void s(boolean z8) {
    }
}
