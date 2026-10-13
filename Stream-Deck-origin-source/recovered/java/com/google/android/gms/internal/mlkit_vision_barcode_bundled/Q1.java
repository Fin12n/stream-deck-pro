package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q1 implements InterfaceC1890f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f18010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1954s2 f18011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W0 f18013d;

    public Q1(AbstractC1954s2 abstractC1954s2, W0 w8, M1 m8) {
        this.f18011b = abstractC1954s2;
        this.f18012c = m8 instanceof AbstractC1899h1;
        this.f18013d = w8;
        this.f18010a = m8;
    }

    public static Q1 j(AbstractC1954s2 abstractC1954s2, W0 w8, M1 m8) {
        return new Q1(abstractC1954s2, w8, m8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void a(Object obj) {
        this.f18011b.a(obj);
        this.f18013d.a(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final boolean b(Object obj) {
        return ((AbstractC1899h1) obj).zzb.k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final int c(Object obj) {
        int iHashCode = ((AbstractC1914k1) obj).zzc.hashCode();
        return this.f18012c ? (iHashCode * 53) + ((AbstractC1899h1) obj).zzb.f18053a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final int d(Object obj) {
        int iB = ((AbstractC1914k1) obj).zzc.b();
        return this.f18012c ? iB + ((AbstractC1899h1) obj).zzb.b() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void e(Object obj, Object obj2) {
        AbstractC1900h2.u(this.f18011b, obj, obj2);
        if (this.f18012c) {
            AbstractC1900h2.t(this.f18013d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final Object f() {
        M1 m8 = this.f18010a;
        return m8 instanceof AbstractC1914k1 ? ((AbstractC1914k1) m8).p() : m8.h().A();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final boolean g(Object obj, Object obj2) {
        if (!((AbstractC1914k1) obj).zzc.equals(((AbstractC1914k1) obj2).zzc)) {
            return false;
        }
        if (this.f18012c) {
            return ((AbstractC1899h1) obj).zzb.equals(((AbstractC1899h1) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void h(Object obj, byte[] bArr, int i8, int i9, C1982y0 c1982y0) throws C1963u1 {
        int iJ;
        AbstractC1914k1 abstractC1914k1 = (AbstractC1914k1) obj;
        C1959t2 c1959t2F = abstractC1914k1.zzc;
        if (c1959t2F == C1959t2.c()) {
            c1959t2F = C1959t2.f();
            abstractC1914k1.zzc = c1959t2F;
        }
        C1959t2 c1959t2 = c1959t2F;
        C1864a1 c1864a1J = ((AbstractC1899h1) obj).J();
        C1909j1 c1909j1B = null;
        while (i8 < i9) {
            int iJ2 = AbstractC1987z0.j(bArr, i8, c1982y0);
            int i10 = c1982y0.f18695a;
            if (i10 == 11) {
                int i11 = i9;
                C1982y0 c1982y1 = c1982y0;
                int i12 = 0;
                J0 j8 = null;
                while (true) {
                    if (iJ2 >= i11) {
                        iJ = iJ2;
                        break;
                    }
                    iJ = AbstractC1987z0.j(bArr, iJ2, c1982y1);
                    int i13 = c1982y1.f18695a;
                    int i14 = i13 >>> 3;
                    int i15 = i13 & 7;
                    if (i14 == 2) {
                        if (i15 != 0) {
                            if (i13 != 12) {
                                break;
                                break;
                            }
                            iJ2 = AbstractC1987z0.p(i13, bArr, iJ, i11, c1982y1);
                        } else {
                            iJ2 = AbstractC1987z0.j(bArr, iJ, c1982y1);
                            i12 = c1982y1.f18695a;
                            c1909j1B = c1982y1.f18698d.b(this.f18010a, i12);
                        }
                    } else {
                        if (i14 == 3) {
                            if (c1909j1B != null) {
                                iJ2 = AbstractC1987z0.e(U1.a().b(c1909j1B.f18583a.getClass()), bArr, iJ, i11, c1982y1);
                                c1864a1J.i(c1909j1B.f18584b, c1982y1.f18697c);
                            } else if (i15 == 2) {
                                iJ2 = AbstractC1987z0.a(bArr, iJ, c1982y1);
                                j8 = (J0) c1982y1.f18697c;
                            }
                        }
                        if (i13 != 12) {
                            break;
                        } else {
                            iJ2 = AbstractC1987z0.p(i13, bArr, iJ, i11, c1982y1);
                        }
                    }
                }
                if (j8 != null) {
                    c1959t2.j((i12 << 3) | 2, j8);
                }
                i8 = iJ;
                i9 = i11;
                c1982y0 = c1982y1;
            } else if ((i10 & 7) == 2) {
                c1909j1B = c1982y0.f18698d.b(this.f18010a, i10 >>> 3);
                if (c1909j1B != null) {
                    i8 = AbstractC1987z0.e(U1.a().b(c1909j1B.f18583a.getClass()), bArr, iJ2, i9, c1982y0);
                    c1864a1J.i(c1909j1B.f18584b, c1982y0.f18697c);
                } else {
                    i8 = AbstractC1987z0.i(i10, bArr, iJ2, i9, c1959t2, c1982y0);
                }
            } else {
                i8 = AbstractC1987z0.p(i10, bArr, iJ2, i9, c1982y0);
            }
        }
        if (i8 != i9) {
            throw new C1963u1("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void i(Object obj, I2 i8) {
        Iterator itF = ((AbstractC1899h1) obj).zzb.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            Z0 z8 = (Z0) entry.getKey();
            if (z8.f() != H2.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            z8.o();
            z8.l();
            if (entry instanceof AbstractC1973w1) {
                z8.zza();
                ((AbstractC1973w1) entry).a();
                throw null;
            }
            i8.x(z8.zza(), entry.getValue());
        }
        ((AbstractC1914k1) obj).zzc.k(i8);
    }
}
