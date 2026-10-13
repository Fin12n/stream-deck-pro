package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2056q0 extends AbstractC2083z {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2079x1 zzc = C2079x1.c();

    public static AbstractC2056q0 A(AbstractC2056q0 abstractC2056q0, byte[] bArr, int i8, int i9, C2008e0 c2008e0) throws A0 {
        if (i9 == 0) {
            return abstractC2056q0;
        }
        AbstractC2056q0 abstractC2056q0K = abstractC2056q0.k();
        try {
            InterfaceC2017g1 interfaceC2017g1B = C2005d1.a().b(abstractC2056q0K.getClass());
            interfaceC2017g1B.i(abstractC2056q0K, bArr, 0, i9, new E(c2008e0));
            interfaceC2017g1B.a(abstractC2056q0K);
            return abstractC2056q0K;
        } catch (A0 e8) {
            e8.f(abstractC2056q0K);
            throw e8;
        } catch (C2073v1 e9) {
            A0 a0A = e9.a();
            a0A.f(abstractC2056q0K);
            throw a0A;
        } catch (IOException e10) {
            if (e10.getCause() instanceof A0) {
                throw ((A0) e10.getCause());
            }
            A0 a8 = new A0(e10);
            a8.f(abstractC2056q0K);
            throw a8;
        } catch (IndexOutOfBoundsException unused) {
            A0 a0G = A0.g();
            a0G.f(abstractC2056q0K);
            throw a0G;
        }
    }

    public static AbstractC2056q0 i(Class cls) {
        Map map = zzb;
        AbstractC2056q0 abstractC2056q0 = (AbstractC2056q0) map.get(cls);
        if (abstractC2056q0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2056q0 = (AbstractC2056q0) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC2056q0 != null) {
            return abstractC2056q0;
        }
        AbstractC2056q0 abstractC2056q1 = (AbstractC2056q0) ((AbstractC2056q0) G1.j(cls)).y(6, null, null);
        if (abstractC2056q1 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC2056q1);
        return abstractC2056q1;
    }

    public static AbstractC2056q0 m(AbstractC2056q0 abstractC2056q0, byte[] bArr, C2008e0 c2008e0) throws A0 {
        AbstractC2056q0 abstractC2056q0A = A(abstractC2056q0, bArr, 0, bArr.length, c2008e0);
        if (abstractC2056q0A == null || abstractC2056q0A.j()) {
            return abstractC2056q0A;
        }
        A0 a0A = new C2073v1(abstractC2056q0A).a();
        a0A.f(abstractC2056q0A);
        throw a0A;
    }

    public static InterfaceC2072v0 n() {
        return C2059r0.o();
    }

    public static InterfaceC2078x0 p() {
        return C2009e1.m();
    }

    public static Object q(Method method, Object obj, Object... objArr) {
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

    public static Object r(V0 v8, String str, Object[] objArr) {
        return new C2013f1(v8, str, objArr);
    }

    public static void u(Class cls, AbstractC2056q0 abstractC2056q0) {
        abstractC2056q0.t();
        zzb.put(cls, abstractC2056q0);
    }

    public static final boolean w(AbstractC2056q0 abstractC2056q0, boolean z8) {
        byte bByteValue = ((Byte) abstractC2056q0.y(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = C2005d1.a().b(abstractC2056q0.getClass()).b(abstractC2056q0);
        if (z8) {
            abstractC2056q0.y(2, true != zB ? null : abstractC2056q0, null);
        }
        return zB;
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final /* synthetic */ U0 a() {
        return (AbstractC2044n0) y(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final void b(AbstractC1992a0 abstractC1992a0) {
        C2005d1.a().b(getClass()).h(this, C1996b0.L(abstractC1992a0));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2083z
    public final int c(InterfaceC2017g1 interfaceC2017g1) {
        if (x()) {
            int iD = interfaceC2017g1.d(this);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iD);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iD2 = interfaceC2017g1.d(this);
        if (iD2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    @Override // com.google.android.gms.internal.play_billing.W0
    public final /* synthetic */ V0 d() {
        return (AbstractC2056q0) y(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2005d1.a().b(getClass()).g(this, (AbstractC2056q0) obj);
    }

    public final int f() {
        return C2005d1.a().b(getClass()).c(this);
    }

    public final AbstractC2044n0 g() {
        return (AbstractC2044n0) y(5, null, null);
    }

    public final AbstractC2044n0 h() {
        AbstractC2044n0 abstractC2044n0 = (AbstractC2044n0) y(5, null, null);
        abstractC2044n0.g(this);
        return abstractC2044n0;
    }

    public final int hashCode() {
        if (x()) {
            return f();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int iF = f();
        this.zza = iF;
        return iF;
    }

    public final boolean j() {
        return w(this, true);
    }

    public final AbstractC2056q0 k() {
        return (AbstractC2056q0) y(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final int l() {
        if (x()) {
            int iZ = z(null);
            if (iZ >= 0) {
                return iZ;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZ);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iZ2 = z(null);
        if (iZ2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZ2;
            return iZ2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZ2);
    }

    public final void s() {
        C2005d1.a().b(getClass()).a(this);
        t();
    }

    public final void t() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return X0.a(this, super.toString());
    }

    public final void v(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object y(int i8, Object obj, Object obj2);

    public final int z(InterfaceC2017g1 interfaceC2017g1) {
        return C2005d1.a().b(getClass()).d(this);
    }
}
