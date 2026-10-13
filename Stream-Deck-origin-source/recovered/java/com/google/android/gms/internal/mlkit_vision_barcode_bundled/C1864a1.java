package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1864a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1864a1 f18052d = new C1864a1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1940p2 f18053a = new C1905i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18055c;

    public C1864a1() {
    }

    public static int a(Z0 z8, Object obj) {
        int iY;
        int iA;
        G2 g2K = z8.k();
        int iZza = z8.zza();
        z8.o();
        int iA2 = R0.a(iZza << 3);
        if (g2K == G2.f17962k) {
            Charset charset = AbstractC1953s1.f18650a;
            if (((M1) obj) instanceof AbstractC1967v0) {
                throw null;
            }
            iA2 += iA2;
        }
        H2 h8 = H2.INT;
        int iB = 4;
        switch (g2K.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 1:
                ((Float) obj).getClass();
                return iA2 + iB;
            case 2:
                iB = R0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 3:
                iB = R0.b(((Long) obj).longValue());
                return iA2 + iB;
            case 4:
                iB = R0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 6:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                return iA2 + iB;
            case 8:
                if (obj instanceof J0) {
                    iY = ((J0) obj).y();
                    iA = R0.a(iY);
                    iB = iA + iY;
                } else {
                    iB = R0.C((String) obj);
                }
                return iA2 + iB;
            case 9:
                iB = ((M1) obj).a();
                return iA2 + iB;
            case 10:
                iB = R0.A((M1) obj);
                return iA2 + iB;
            case 11:
                if (obj instanceof J0) {
                    iY = ((J0) obj).y();
                    iA = R0.a(iY);
                } else {
                    iY = ((byte[]) obj).length;
                    iA = R0.a(iY);
                }
                iB = iA + iY;
                return iA2 + iB;
            case 12:
                iB = R0.a(((Integer) obj).intValue());
                return iA2 + iB;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                iB = obj instanceof InterfaceC1924m1 ? R0.b(((InterfaceC1924m1) obj).zza()) : R0.b(((Integer) obj).intValue());
                return iA2 + iB;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                ((Integer) obj).getClass();
                return iA2 + iB;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                ((Long) obj).getClass();
                iB = 8;
                return iA2 + iB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iB = R0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iA2 + iB;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                iB = R0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iA2 + iB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static C1864a1 d() {
        return f18052d;
    }

    public static Object l(Object obj) {
        if (obj instanceof R1) {
            return ((R1) obj).j();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static boolean n(Map.Entry entry) {
        Z0 z8 = (Z0) entry.getKey();
        if (z8.f() != H2.MESSAGE) {
            return true;
        }
        z8.o();
        Object value = entry.getValue();
        if (value instanceof N1) {
            return ((N1) value).e();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int o(Map.Entry entry) {
        Z0 z8 = (Z0) entry.getKey();
        Object value = entry.getValue();
        if (z8.f() != H2.MESSAGE) {
            return a(z8, value);
        }
        z8.o();
        z8.l();
        int iZza = ((Z0) entry.getKey()).zza();
        int iA = R0.a(8);
        return iA + iA + R0.a(16) + R0.a(iZza) + R0.a(24) + R0.A((M1) value);
    }

    public final int b() {
        int iC = this.f18053a.c();
        int iO = 0;
        for (int i8 = 0; i8 < iC; i8++) {
            iO += o(this.f18053a.g(i8));
        }
        Iterator it = this.f18053a.d().iterator();
        while (it.hasNext()) {
            iO += o((Map.Entry) it.next());
        }
        return iO;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1864a1 clone() {
        C1864a1 c1864a1 = new C1864a1();
        int iC = this.f18053a.c();
        for (int i8 = 0; i8 < iC; i8++) {
            Map.Entry entryG = this.f18053a.g(i8);
            c1864a1.i((Z0) ((C1910j2) entryG).a(), entryG.getValue());
        }
        for (Map.Entry entry : this.f18053a.d()) {
            c1864a1.i((Z0) entry.getKey(), entry.getValue());
        }
        c1864a1.f18055c = this.f18055c;
        return c1864a1;
    }

    public final Object e(Z0 z8) {
        return this.f18053a.get(z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1864a1) {
            return this.f18053a.equals(((C1864a1) obj).f18053a);
        }
        return false;
    }

    public final Iterator f() {
        if (this.f18053a.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f18055c ? new C1978x1(this.f18053a.entrySet().iterator()) : this.f18053a.entrySet().iterator();
    }

    public final void g() {
        if (this.f18054b) {
            return;
        }
        int iC = this.f18053a.c();
        for (int i8 = 0; i8 < iC; i8++) {
            Map.Entry entryG = this.f18053a.g(i8);
            if (entryG.getValue() instanceof AbstractC1914k1) {
                ((AbstractC1914k1) entryG.getValue()).z();
            }
        }
        this.f18053a.a();
        this.f18054b = true;
    }

    public final void h(C1864a1 c1864a1) {
        int iC = c1864a1.f18053a.c();
        for (int i8 = 0; i8 < iC; i8++) {
            m(c1864a1.f18053a.g(i8));
        }
        Iterator it = c1864a1.f18053a.d().iterator();
        while (it.hasNext()) {
            m((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f18053a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1924m1) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Z0 z8, Object obj) {
        boolean z9;
        z8.o();
        z8.k();
        Charset charset = AbstractC1953s1.f18650a;
        obj.getClass();
        G2 g8 = G2.f17953b;
        H2 h8 = H2.INT;
        switch (r0.a()) {
            case INT:
                z9 = obj instanceof Integer;
                break;
            case LONG:
                z9 = obj instanceof Long;
                break;
            case FLOAT:
                z9 = obj instanceof Float;
                break;
            case DOUBLE:
                z9 = obj instanceof Double;
                break;
            case BOOLEAN:
                z9 = obj instanceof Boolean;
                break;
            case STRING:
                z9 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof J0)) {
                    break;
                }
                this.f18053a.put(z8, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                this.f18053a.put(z8, obj);
                return;
            case MESSAGE:
                break;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(z8.zza()), z8.k().a(), obj.getClass().getName()));
        }
    }

    public final boolean j() {
        return this.f18054b;
    }

    public final boolean k() {
        int iC = this.f18053a.c();
        for (int i8 = 0; i8 < iC; i8++) {
            if (!n(this.f18053a.g(i8))) {
                return false;
            }
        }
        Iterator it = this.f18053a.d().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void m(Map.Entry entry) {
        Z0 z8 = (Z0) entry.getKey();
        Object value = entry.getValue();
        z8.o();
        if (z8.f() != H2.MESSAGE) {
            this.f18053a.put(z8, l(value));
            return;
        }
        Object objE = e(z8);
        if (objE == null) {
            this.f18053a.put(z8, l(value));
        } else {
            this.f18053a.put(z8, objE instanceof R1 ? z8.r((R1) objE, (R1) value) : z8.p(((M1) objE).g(), (M1) value).y());
        }
    }

    public C1864a1(boolean z8) {
        g();
        g();
    }
}
