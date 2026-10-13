package p065h1;

import A1.v;
import A1.x;
import Q0.f;
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

/* JADX INFO: renamed from: h1.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2389f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f24283a = Parcel.obtain();

    public final void a(byte b8) {
        this.f24283a.writeByte(b8);
    }

    public final void b(float f8) {
        this.f24283a.writeFloat(f8);
    }

    public final void c(int i8) {
        this.f24283a.writeInt(i8);
    }

    public final void d(R0 r8) {
        m(r8.c());
        b(f.o(r8.d()));
        b(f.p(r8.d()));
        b(r8.b());
    }

    public final void e(String str) {
        this.f24283a.writeString(str);
    }

    public final void f(B b8) {
        long jG = b8.g();
        C1598l0.a aVar = C1598l0.f9405b;
        if (!C1598l0.q(jG, aVar.e())) {
            a((byte) 1);
            m(b8.g());
        }
        long jK = b8.k();
        v.a aVar2 = v.f462b;
        if (!v.e(jK, aVar2.a())) {
            a((byte) 2);
            j(b8.k());
        }
        C cN = b8.n();
        if (cN != null) {
            a((byte) 3);
            g(cN);
        }
        y yVarL = b8.l();
        if (yVarL != null) {
            int i8 = yVarL.i();
            a((byte) 4);
            o(i8);
        }
        z zVarM = b8.m();
        if (zVarM != null) {
            int iM = zVarM.m();
            a((byte) 5);
            l(iM);
        }
        String strJ = b8.j();
        if (strJ != null) {
            a((byte) 6);
            e(strJ);
        }
        if (!v.e(b8.o(), aVar2.a())) {
            a((byte) 7);
            j(b8.o());
        }
        a aVarE = b8.e();
        if (aVarE != null) {
            float fH = aVarE.h();
            a((byte) 8);
            k(fH);
        }
        o oVarU = b8.u();
        if (oVarU != null) {
            a((byte) 9);
            i(oVarU);
        }
        if (!C1598l0.q(b8.d(), aVar.e())) {
            a((byte) 10);
            m(b8.d());
        }
        k kVarS = b8.s();
        if (kVarS != null) {
            a((byte) 11);
            h(kVarS);
        }
        R0 r0R = b8.r();
        if (r0R != null) {
            a((byte) 12);
            d(r0R);
        }
    }

    public final void g(C c8) {
        c(c8.s());
    }

    public final void h(k kVar) {
        c(kVar.e());
    }

    public final void i(o oVar) {
        b(oVar.b());
        b(oVar.c());
    }

    public final void j(long j8) {
        long jG = v.g(j8);
        x.a aVar = x.f466b;
        byte b8 = 0;
        if (!x.g(jG, aVar.c())) {
            if (x.g(jG, aVar.b())) {
                b8 = 1;
            } else if (x.g(jG, aVar.a())) {
                b8 = 2;
            }
        }
        a(b8);
        if (x.g(v.g(j8), aVar.c())) {
            return;
        }
        b(v.h(j8));
    }

    public final void k(float f8) {
        b(f8);
    }

    public final void l(int i8) {
        z.a aVar = z.f34116b;
        byte b8 = 0;
        if (!z.h(i8, aVar.b())) {
            if (z.h(i8, aVar.a())) {
                b8 = 1;
            } else if (z.h(i8, aVar.d())) {
                b8 = 2;
            } else if (z.h(i8, aVar.c())) {
                b8 = 3;
            }
        }
        a(b8);
    }

    public final void m(long j8) {
        n(j8);
    }

    public final void n(long j8) {
        this.f24283a.writeLong(j8);
    }

    public final void o(int i8) {
        y.a aVar = y.f34112b;
        byte b8 = 0;
        if (!y.f(i8, aVar.b()) && y.f(i8, aVar.a())) {
            b8 = 1;
        }
        a(b8);
    }

    public final String p() {
        return Base64.encodeToString(this.f24283a.marshall(), 0);
    }

    public final void q() {
        this.f24283a.recycle();
        this.f24283a = Parcel.obtain();
    }
}
