package p065h1;

import A1.v;
import A1.w;
import A1.x;
import C6.A;
import D6.r;
import Q0.g;
import R0.C1598l0;
import R0.R0;
import android.os.Parcel;
import android.util.Base64;
import p128o1.B;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p216z1.a;
import p216z1.k;
import p216z1.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcel f24214a;

    public Y(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f24214a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final int a() {
        return this.f24214a.dataAvail();
    }

    public final float b() {
        return a.c(e());
    }

    public final byte c() {
        return this.f24214a.readByte();
    }

    public final long d() {
        return C1598l0.l(p());
    }

    public final float e() {
        return this.f24214a.readFloat();
    }

    public final int f() {
        byte bC = c();
        if (bC == 0) {
            return y.f34112b.b();
        }
        return bC == 1 ? y.f34112b.a() : y.f34112b.b();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return z.f34116b.b();
        }
        if (bC == 1) {
            return z.f34116b.a();
        }
        if (bC == 3) {
            return z.f34116b.c();
        }
        return bC == 2 ? z.f34116b.d() : z.f34116b.b();
    }

    public final C h() {
        return new C(i());
    }

    public final int i() {
        return this.f24214a.readInt();
    }

    public final R0 j() {
        return new R0(d(), g.a(e(), e()), e(), null);
    }

    public final B k() {
        C2416t0 c2416t0 = new C2416t0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f24214a.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            c2416t0.j(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        c2416t0.k(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    c2416t0.a(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                c2416t0.l(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            c2416t0.b(a.b(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        c2416t0.i(o());
                                    }
                                } else {
                                    c2416t0.d(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                c2416t0.g(z.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            c2416t0.f(y.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        c2416t0.h(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    c2416t0.e(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                c2416t0.c(d());
            }
        }
        return c2416t0.m();
    }

    public final String l() {
        return this.f24214a.readString();
    }

    public final k m() {
        int i8 = i();
        k.a aVar = k.f39019b;
        boolean z8 = (aVar.b().e() & i8) != 0;
        boolean z9 = (i8 & aVar.d().e()) != 0;
        if (z8 && z9) {
            return aVar.a(r.q(aVar.b(), aVar.d()));
        }
        if (z8) {
            return aVar.b();
        }
        return z9 ? aVar.d() : aVar.c();
    }

    public final o n() {
        return new o(e(), e());
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = x.f466b.b();
        } else {
            jA = bC == 2 ? x.f466b.a() : x.f466b.c();
        }
        return x.g(jA, x.f466b.c()) ? v.f462b.a() : w.a(e(), jA);
    }

    public final long p() {
        return A.b(this.f24214a.readLong());
    }
}
