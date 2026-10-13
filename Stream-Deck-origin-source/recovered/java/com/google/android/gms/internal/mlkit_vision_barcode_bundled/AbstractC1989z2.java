package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D6.iIQ.BmWxZhjGfw;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1989z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1984y2 f18722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f18723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f18724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f18725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f18726h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z8;
        boolean z9;
        AbstractC1984y2 abstractC1984y2;
        Unsafe unsafeL = l();
        f18719a = unsafeL;
        int i8 = AbstractC1977x0.f18689a;
        f18720b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f18721c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        AbstractC1984y2 c1974w2 = null;
        if (unsafeL != null) {
            if (zA) {
                c1974w2 = new C1979x2(unsafeL);
            } else if (zA2) {
                c1974w2 = new C1974w2(unsafeL);
            }
        }
        f18722d = c1974w2;
        if (c1974w2 == null) {
            z8 = false;
        } else {
            try {
                Class<?> cls3 = c1974w2.f18700a.getClass();
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
        f18723e = z8;
        AbstractC1984y2 abstractC1984y3 = f18722d;
        if (abstractC1984y3 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls4 = abstractC1984y3.f18700a.getClass();
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
        f18724f = z9;
        f18725g = E(byte[].class);
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
        if (fieldB != null && (abstractC1984y2 = f18722d) != null) {
            abstractC1984y2.f18700a.objectFieldOffset(fieldB);
        }
        f18726h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static boolean A(Class cls) {
        int i8 = AbstractC1977x0.f18689a;
        try {
            Class cls2 = f18720b;
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

    public static boolean B(Object obj, long j8) {
        return f18722d.g(obj, j8);
    }

    public static boolean C() {
        return f18724f;
    }

    public static boolean D() {
        return f18723e;
    }

    public static int E(Class cls) {
        if (f18724f) {
            return f18722d.f18700a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f18724f) {
            return f18722d.f18700a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i8 = AbstractC1977x0.f18689a;
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
        AbstractC1984y2 abstractC1984y2 = f18722d;
        long j9 = (-4) & j8;
        int i8 = abstractC1984y2.f18700a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        abstractC1984y2.f18700a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    public static void e(Object obj, long j8, byte b8) {
        AbstractC1984y2 abstractC1984y2 = f18722d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        abstractC1984y2.f18700a.putInt(obj, j9, ((255 & b8) << i8) | (abstractC1984y2.f18700a.getInt(obj, j9) & (~(255 << i8))));
    }

    public static double f(Object obj, long j8) {
        return f18722d.a(obj, j8);
    }

    public static float g(Object obj, long j8) {
        return f18722d.b(obj, j8);
    }

    public static int h(Object obj, long j8) {
        return f18722d.f18700a.getInt(obj, j8);
    }

    public static long i(Object obj, long j8) {
        return f18722d.f18700a.getLong(obj, j8);
    }

    public static Object j(Class cls) {
        try {
            return f18719a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static Object k(Object obj, long j8) {
        return f18722d.f18700a.getObject(obj, j8);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1969v2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r(Object obj, long j8, boolean z8) {
        f18722d.c(obj, j8, z8);
    }

    public static void s(byte[] bArr, long j8, byte b8) {
        f18722d.d(bArr, f18725g + j8, b8);
    }

    public static void t(Object obj, long j8, double d8) {
        f18722d.e(obj, j8, d8);
    }

    public static void u(Object obj, long j8, float f8) {
        f18722d.f(obj, j8, f8);
    }

    public static void v(Object obj, long j8, int i8) {
        f18722d.f18700a.putInt(obj, j8, i8);
    }

    public static void w(Object obj, long j8, long j9) {
        f18722d.f18700a.putLong(obj, j8, j9);
    }

    public static void x(Object obj, long j8, Object obj2) {
        f18722d.f18700a.putObject(obj, j8, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        return ((byte) ((f18722d.f18700a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        return ((byte) ((f18722d.f18700a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(AbstractC1989z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", BmWxZhjGfw.neafnTiFcku.concat(th.toString()));
    }
}
