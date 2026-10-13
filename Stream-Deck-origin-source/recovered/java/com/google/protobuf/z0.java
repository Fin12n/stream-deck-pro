package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import p201x2.vAk.kDsnNkYbBsI;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f19502a = H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f19503b = AbstractC2092d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f19504c = q(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f19505d = q(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f19506e = F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f19507f = X();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f19508g = W();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f19509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f19510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f19511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f19512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f19513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f19514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f19515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f19516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f19517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f19518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f19519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f19520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f19521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f19522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f19523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f19524w;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j8) {
            return z0.f19524w ? z0.u(obj, j8) : z0.v(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j8) {
            return z0.f19524w ? z0.y(obj, j8) : z0.z(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j8) {
            return Double.longBitsToDouble(k(obj, j8));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j8) {
            return Float.intBitsToFloat(i(obj, j8));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j8, boolean z8) {
            if (z0.f19524w) {
                z0.M(obj, j8, z8);
            } else {
                z0.N(obj, j8, z8);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j8, byte b8) {
            if (z0.f19524w) {
                z0.P(obj, j8, b8);
            } else {
                z0.Q(obj, j8, b8);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j8, double d8) {
            s(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j8, float f8) {
            r(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j8) {
            return z0.f19524w ? z0.u(obj, j8) : z0.v(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j8) {
            return z0.f19524w ? z0.y(obj, j8) : z0.z(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j8) {
            return Double.longBitsToDouble(k(obj, j8));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j8) {
            return Float.intBitsToFloat(i(obj, j8));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j8, boolean z8) {
            if (z0.f19524w) {
                z0.M(obj, j8, z8);
            } else {
                z0.N(obj, j8, z8);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j8, byte b8) {
            if (z0.f19524w) {
                z0.P(obj, j8, b8);
            } else {
                z0.Q(obj, j8, b8);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j8, double d8) {
            s(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j8, float f8) {
            r(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j8, byte[] bArr, long j9, long j10) {
            this.f19525a.copyMemory((Object) null, j8, bArr, z0.f19509h + j9, j10);
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j8) {
            return this.f19525a.getBoolean(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j8) {
            return this.f19525a.getByte(j8);
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j8) {
            return this.f19525a.getByte(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j8) {
            return this.f19525a.getDouble(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j8) {
            return this.f19525a.getFloat(obj, j8);
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j8) {
            return this.f19525a.getLong(j8);
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j8, boolean z8) {
            this.f19525a.putBoolean(obj, j8, z8);
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j8, byte b8) {
            this.f19525a.putByte(obj, j8, b8);
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j8, double d8) {
            this.f19525a.putDouble(obj, j8, d8);
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j8, float f8) {
            this.f19525a.putFloat(obj, j8, f8);
        }

        @Override // com.google.protobuf.z0.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.f19525a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f19525a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f19525a;

        public e(Unsafe unsafe) {
            this.f19525a = unsafe;
        }

        public final int a(Class cls) {
            return this.f19525a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f19525a.arrayIndexScale(cls);
        }

        public abstract void c(long j8, byte[] bArr, long j9, long j10);

        public abstract boolean d(Object obj, long j8);

        public abstract byte e(long j8);

        public abstract byte f(Object obj, long j8);

        public abstract double g(Object obj, long j8);

        public abstract float h(Object obj, long j8);

        public final int i(Object obj, long j8) {
            return this.f19525a.getInt(obj, j8);
        }

        public abstract long j(long j8);

        public final long k(Object obj, long j8) {
            return this.f19525a.getLong(obj, j8);
        }

        public final Object l(Object obj, long j8) {
            return this.f19525a.getObject(obj, j8);
        }

        public final long m(java.lang.reflect.Field field) {
            return this.f19525a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j8, boolean z8);

        public abstract void o(Object obj, long j8, byte b8);

        public abstract void p(Object obj, long j8, double d8);

        public abstract void q(Object obj, long j8, float f8);

        public final void r(Object obj, long j8, int i8) {
            this.f19525a.putInt(obj, j8, i8);
        }

        public final void s(Object obj, long j8, long j9) {
            this.f19525a.putLong(obj, j8, j9);
        }

        public final void t(Object obj, long j8, Object obj2) {
            this.f19525a.putObject(obj, j8, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f19525a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f19525a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z0.o() != null;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f19509h = jM;
        f19510i = m(boolean[].class);
        f19511j = n(boolean[].class);
        f19512k = m(int[].class);
        f19513l = n(int[].class);
        f19514m = m(long[].class);
        f19515n = n(long[].class);
        f19516o = m(float[].class);
        f19517p = n(float[].class);
        f19518q = m(double[].class);
        f19519r = n(double[].class);
        f19520s = m(Object[].class);
        f19521t = n(Object[].class);
        f19522u = s(o());
        f19523v = (int) (jM & 7);
        f19524w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static double A(Object obj, long j8) {
        return f19506e.g(obj, j8);
    }

    public static float B(Object obj, long j8) {
        return f19506e.h(obj, j8);
    }

    public static int C(Object obj, long j8) {
        return f19506e.i(obj, j8);
    }

    public static long D(long j8) {
        return f19506e.j(j8);
    }

    public static long E(Object obj, long j8) {
        return f19506e.k(obj, j8);
    }

    public static e F() {
        Unsafe unsafe = f19502a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC2092d.c()) {
            return new d(unsafe);
        }
        if (f19504c) {
            return new c(unsafe);
        }
        if (f19505d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object G(Object obj, long j8) {
        return f19506e.l(obj, j8);
    }

    public static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean I() {
        return f19508g;
    }

    public static boolean J() {
        return f19507f;
    }

    public static void K(Throwable th) {
        Logger.getLogger(z0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void L(Object obj, long j8, boolean z8) {
        f19506e.n(obj, j8, z8);
    }

    public static void M(Object obj, long j8, boolean z8) {
        P(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    public static void N(Object obj, long j8, boolean z8) {
        Q(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    public static void O(byte[] bArr, long j8, byte b8) {
        f19506e.o(bArr, f19509h + j8, b8);
    }

    public static void P(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int iC = C(obj, j9);
        int i8 = ((~((int) j8)) & 3) << 3;
        T(obj, j9, ((255 & b8) << i8) | (iC & (~(255 << i8))));
    }

    public static void Q(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        T(obj, j9, ((255 & b8) << i8) | (C(obj, j9) & (~(255 << i8))));
    }

    public static void R(Object obj, long j8, double d8) {
        f19506e.p(obj, j8, d8);
    }

    public static void S(Object obj, long j8, float f8) {
        f19506e.q(obj, j8, f8);
    }

    public static void T(Object obj, long j8, int i8) {
        f19506e.r(obj, j8, i8);
    }

    public static void U(Object obj, long j8, long j9) {
        f19506e.s(obj, j8, j9);
    }

    public static void V(Object obj, long j8, Object obj2) {
        f19506e.t(obj, j8, obj2);
    }

    public static boolean W() {
        e eVar = f19506e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    public static boolean X() {
        e eVar = f19506e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    public static long k(ByteBuffer byteBuffer) {
        return f19506e.k(byteBuffer, f19522u);
    }

    public static Object l(Class cls) {
        try {
            return f19502a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int m(Class cls) {
        if (f19508g) {
            return f19506e.a(cls);
        }
        return -1;
    }

    public static int n(Class cls) {
        if (f19508g) {
            return f19506e.b(cls);
        }
        return -1;
    }

    public static void p(long j8, byte[] bArr, long j9, long j10) {
        f19506e.c(j8, bArr, j9, j10);
    }

    public static boolean q(Class cls) {
        if (!AbstractC2092d.c()) {
            return false;
        }
        try {
            Class cls2 = f19503b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static java.lang.reflect.Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long s(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f19506e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    public static boolean t(Object obj, long j8) {
        return f19506e.d(obj, j8);
    }

    public static boolean u(Object obj, long j8) {
        return y(obj, j8) != 0;
    }

    public static boolean v(Object obj, long j8) {
        return z(obj, j8) != 0;
    }

    public static byte w(long j8) {
        return f19506e.e(j8);
    }

    public static byte x(byte[] bArr, long j8) {
        return f19506e.f(bArr, f19509h + j8);
    }

    public static byte y(Object obj, long j8) {
        return (byte) ((C(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte z(Object obj, long j8) {
        return (byte) ((C(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static java.lang.reflect.Field o() {
        java.lang.reflect.Field fieldR;
        if (AbstractC2092d.c() && (fieldR = r(Buffer.class, kDsnNkYbBsI.KPgaL)) != null) {
            return fieldR;
        }
        java.lang.reflect.Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 != null && fieldR2.getType() == Long.TYPE) {
            return fieldR2;
        }
        return null;
    }
}
