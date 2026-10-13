package io.sentry;

import E4.JFpq.XRlnZWSrAFn;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2555s0 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.vendor.gson.stream.a f27619a;

    public C2555s0(Reader reader) {
        this.f27619a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.W0
    public Double D0() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f27619a.nextDouble());
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public String F0() {
        return this.f27619a.F0();
    }

    @Override // io.sentry.W0
    public String G() {
        return this.f27619a.G();
    }

    @Override // io.sentry.W0
    public List O1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) throws IOException {
        if (this.f27619a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f27619a.j0();
            return null;
        }
        this.f27619a.b();
        ArrayList arrayList = new ArrayList();
        if (this.f27619a.y()) {
            do {
                try {
                    arrayList.add(interfaceC2524m0.a(this, iLogger));
                } catch (Exception e8) {
                    iLogger.b(EnumC2596z2.WARNING, "Failed to deserialize object in list.", e8);
                }
            } while (this.f27619a.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f27619a.t();
        return arrayList;
    }

    @Override // io.sentry.W0
    public void R() throws IOException {
        this.f27619a.R();
    }

    @Override // io.sentry.W0
    public Date S0(ILogger iLogger) throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return W0.J1(this.f27619a.G(), iLogger);
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public Integer T() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f27619a.nextInt());
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public Boolean Z0() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f27619a.Y());
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public Long a0() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f27619a.nextLong());
        }
        this.f27619a.j0();
        return null;
    }

    public void b() {
        this.f27619a.b();
    }

    public void c() {
        this.f27619a.t();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27619a.close();
    }

    @Override // io.sentry.W0
    public TimeZone g0(ILogger iLogger) throws IOException {
        if (this.f27619a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f27619a.j0();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f27619a.G());
        } catch (Exception e8) {
            iLogger.b(EnumC2596z2.ERROR, "Error when deserializing TimeZone", e8);
            return null;
        }
    }

    public boolean j() {
        return this.f27619a.Y();
    }

    @Override // io.sentry.W0
    public Float j1() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public String k0() throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f27619a.G();
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public Object m1(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) throws IOException {
        if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return interfaceC2524m0.a(this, iLogger);
        }
        this.f27619a.j0();
        return null;
    }

    @Override // io.sentry.W0
    public double nextDouble() {
        return this.f27619a.nextDouble();
    }

    @Override // io.sentry.W0
    public float nextFloat() {
        return (float) this.f27619a.nextDouble();
    }

    @Override // io.sentry.W0
    public int nextInt() {
        return this.f27619a.nextInt();
    }

    @Override // io.sentry.W0
    public long nextLong() {
        return this.f27619a.nextLong();
    }

    public void o() {
        this.f27619a.j0();
    }

    @Override // io.sentry.W0
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f27619a.peek();
    }

    @Override // io.sentry.W0
    public Map q0(ILogger iLogger, InterfaceC2524m0 interfaceC2524m0) throws IOException {
        if (this.f27619a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f27619a.j0();
            return null;
        }
        this.f27619a.x();
        HashMap map = new HashMap();
        if (this.f27619a.y()) {
            while (true) {
                try {
                    map.put(this.f27619a.F0(), interfaceC2524m0.a(this, iLogger));
                } catch (Exception e8) {
                    iLogger.b(EnumC2596z2.WARNING, "Failed to deserialize object in map.", e8);
                }
                if (this.f27619a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f27619a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f27619a.u();
        return map;
    }

    @Override // io.sentry.W0
    public void s(boolean z8) {
        this.f27619a.s(z8);
    }

    @Override // io.sentry.W0
    public void u() {
        this.f27619a.u();
    }

    @Override // io.sentry.W0
    public void x() {
        this.f27619a.x();
    }

    @Override // io.sentry.W0
    public Object y1() {
        return new C2551r0().e(this);
    }

    @Override // io.sentry.W0
    public void t0(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, y1());
        } catch (Exception e8) {
            iLogger.a(EnumC2596z2.ERROR, e8, XRlnZWSrAFn.PceyCtJslvoaY, str);
        }
    }
}
