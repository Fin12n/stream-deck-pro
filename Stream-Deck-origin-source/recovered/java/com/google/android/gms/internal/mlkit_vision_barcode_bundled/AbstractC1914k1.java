package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1914k1 extends AbstractC1962u0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C1959t2 zzc = C1959t2.c();

    public static void C(Class cls, AbstractC1914k1 abstractC1914k1) {
        abstractC1914k1.B();
        zzb.put(cls, abstractC1914k1);
    }

    public static final boolean E(AbstractC1914k1 abstractC1914k1, boolean z8) {
        byte bByteValue = ((Byte) abstractC1914k1.I(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = U1.a().b(abstractC1914k1.getClass()).b(abstractC1914k1);
        if (z8) {
            abstractC1914k1.I(2, true != zB ? null : abstractC1914k1, null);
        }
        return zB;
    }

    public static AbstractC1914k1 H(AbstractC1914k1 abstractC1914k1, byte[] bArr, int i8, int i9, V0 v8) throws C1963u1 {
        if (i9 == 0) {
            return abstractC1914k1;
        }
        AbstractC1914k1 abstractC1914k1P = abstractC1914k1.p();
        try {
            InterfaceC1890f2 interfaceC1890f2B = U1.a().b(abstractC1914k1P.getClass());
            interfaceC1890f2B.h(abstractC1914k1P, bArr, 0, i9, new C1982y0(v8));
            interfaceC1890f2B.a(abstractC1914k1P);
            return abstractC1914k1P;
        } catch (C1949r2 e8) {
            throw e8.a();
        } catch (C1963u1 e9) {
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C1963u1) {
                throw ((C1963u1) e10.getCause());
            }
            throw new C1963u1(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1963u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static C1909j1 n(M1 m8, Object obj, M1 m9, InterfaceC1929n1 interfaceC1929n1, int i8, G2 g8, Class cls) {
        return new C1909j1(m8, obj, m9, new C1904i1(null, i8, g8, false, false), cls);
    }

    public static AbstractC1914k1 o(Class cls) {
        Map map = zzb;
        AbstractC1914k1 abstractC1914k1 = (AbstractC1914k1) map.get(cls);
        if (abstractC1914k1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1914k1 = (AbstractC1914k1) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC1914k1 != null) {
            return abstractC1914k1;
        }
        AbstractC1914k1 abstractC1914k2 = (AbstractC1914k1) ((AbstractC1914k1) AbstractC1989z2.j(cls)).I(6, null, null);
        if (abstractC1914k2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC1914k2);
        return abstractC1914k2;
    }

    public static AbstractC1914k1 q(AbstractC1914k1 abstractC1914k1, byte[] bArr, V0 v8) throws C1963u1 {
        AbstractC1914k1 abstractC1914k1H = H(abstractC1914k1, bArr, 0, bArr.length, v8);
        if (abstractC1914k1H == null || E(abstractC1914k1H, true)) {
            return abstractC1914k1H;
        }
        throw new C1949r2(abstractC1914k1H).a();
    }

    public static InterfaceC1939p1 r() {
        return C1874c1.o();
    }

    public static InterfaceC1939p1 s(InterfaceC1939p1 interfaceC1939p1) {
        int size = interfaceC1939p1.size();
        return interfaceC1939p1.b(size == 0 ? 10 : size + size);
    }

    public static InterfaceC1944q1 t() {
        return C1919l1.o();
    }

    public static InterfaceC1948r1 u() {
        return V1.m();
    }

    public static InterfaceC1948r1 v(InterfaceC1948r1 interfaceC1948r1) {
        int size = interfaceC1948r1.size();
        return interfaceC1948r1.b(size == 0 ? 10 : size + size);
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object x(M1 m8, String str, Object[] objArr) {
        return new W1(m8, str, objArr);
    }

    public final void B() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void D(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int G(InterfaceC1890f2 interfaceC1890f2) {
        return U1.a().b(getClass()).d(this);
    }

    public abstract Object I(int i8, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final int a() {
        if (F()) {
            int iG = G(null);
            if (iG >= 0) {
                return iG;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iG);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iG2 = G(null);
        if (iG2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iG2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final void b(R0 r8) {
        U1.a().b(getClass()).i(this, S0.L(r8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1962u0
    public final int c(InterfaceC1890f2 interfaceC1890f2) {
        if (F()) {
            int iD = interfaceC1890f2.d(this);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iD);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iD2 = interfaceC1890f2.d(this);
        if (iD2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final /* synthetic */ M1 d() {
        return (AbstractC1914k1) I(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final boolean e() {
        return E(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return U1.a().b(getClass()).g(this, (AbstractC1914k1) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final /* synthetic */ L1 g() {
        AbstractC1889f1 abstractC1889f1 = (AbstractC1889f1) I(5, null, null);
        abstractC1889f1.m(this);
        return abstractC1889f1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final /* synthetic */ L1 h() {
        return (AbstractC1889f1) I(5, null, null);
    }

    public final int hashCode() {
        if (F()) {
            return k();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int iK = k();
        this.zza = iK;
        return iK;
    }

    public final int k() {
        return U1.a().b(getClass()).c(this);
    }

    public final AbstractC1889f1 l() {
        return (AbstractC1889f1) I(5, null, null);
    }

    public final AbstractC1889f1 m() {
        AbstractC1889f1 abstractC1889f1 = (AbstractC1889f1) I(5, null, null);
        abstractC1889f1.m(this);
        return abstractC1889f1;
    }

    public final AbstractC1914k1 p() {
        return (AbstractC1914k1) I(4, null, null);
    }

    public final String toString() {
        return O1.a(this, super.toString());
    }

    public final void z() {
        U1.a().b(getClass()).a(this);
        B();
    }
}
