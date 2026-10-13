package com.google.android.gms.internal.play_billing;

import E4.JFpq.XRlnZWSrAFn;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f18761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f18762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F1 f18764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f18765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f18766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f18767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f18768h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z8;
        boolean z9;
        F1 f8;
        Unsafe unsafeL = l();
        f18761a = unsafeL;
        int i8 = D.f18749a;
        f18762b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f18763c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        F1 d8 = null;
        if (unsafeL != null) {
            if (zA) {
                d8 = new E1(unsafeL);
            } else if (zA2) {
                d8 = new D1(unsafeL);
            }
        }
        f18764d = d8;
        if (d8 == null) {
            z8 = false;
        } else {
            try {
                Class<?> cls3 = d8.f18760a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z8 = false;
                } else {
                    z8 = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f18765e = z8;
        F1 f9 = f18764d;
        if (f9 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls4 = f9.f18760a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z9 = true;
            } catch (Throwable th2) {
                m(th2);
                z9 = false;
            }
        }
        f18766f = z9;
        f18767g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (f8 = f18764d) != null) {
            f8.f18760a.objectFieldOffset(fieldB);
        }
        f18768h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static boolean B(Object obj, long j8) {
        return f18764d.g(obj, j8);
    }

    public static boolean C() {
        return f18766f;
    }

    public static boolean D() {
        return f18765e;
    }

    public static int E(Class cls) {
        if (f18766f) {
            return f18764d.f18760a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f18766f) {
            return f18764d.f18760a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i8 = D.f18749a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j8, byte b8) {
        F1 f8 = f18764d;
        long j9 = (-4) & j8;
        int i8 = f8.f18760a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        f8.f18760a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    public static void e(Object obj, long j8, byte b8) {
        F1 f8 = f18764d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        f8.f18760a.putInt(obj, j9, ((255 & b8) << i8) | (f8.f18760a.getInt(obj, j9) & (~(255 << i8))));
    }

    public static double f(Object obj, long j8) {
        return f18764d.a(obj, j8);
    }

    public static float g(Object obj, long j8) {
        return f18764d.b(obj, j8);
    }

    public static int h(Object obj, long j8) {
        return f18764d.f18760a.getInt(obj, j8);
    }

    public static long i(Object obj, long j8) {
        return f18764d.f18760a.getLong(obj, j8);
    }

    public static Object j(Class cls) {
        try {
            return f18761a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static Object k(Object obj, long j8) {
        return f18764d.f18760a.getObject(obj, j8);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(G1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void r(Object obj, long j8, boolean z8) {
        f18764d.c(obj, j8, z8);
    }

    public static void s(byte[] bArr, long j8, byte b8) {
        f18764d.d(bArr, f18767g + j8, b8);
    }

    public static void t(Object obj, long j8, double d8) {
        f18764d.e(obj, j8, d8);
    }

    public static void u(Object obj, long j8, float f8) {
        f18764d.f(obj, j8, f8);
    }

    public static void v(Object obj, long j8, int i8) {
        f18764d.f18760a.putInt(obj, j8, i8);
    }

    public static void w(Object obj, long j8, long j9) {
        f18764d.f18760a.putLong(obj, j8, j9);
    }

    public static void x(Object obj, long j8, Object obj2) {
        f18764d.f18760a.putObject(obj, j8, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        return ((byte) ((f18764d.f18760a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        return ((byte) ((f18764d.f18760a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static boolean A(Class cls) {
        int i8 = D.f18749a;
        try {
            Class cls2 = f18762b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod(XRlnZWSrAFn.cJlwEdndIRN, cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
