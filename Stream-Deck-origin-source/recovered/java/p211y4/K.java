package p211y4;

import F4.a;
import S4.InterfaceC1634e;
import S4.k;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import p203x4.b;
import p219z4.AbstractC3194c;
import p219z4.C3196e;
import p219z4.C3205n;
import p219z4.C3208q;
import p219z4.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements InterfaceC1634e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3104e f38304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3101b f38306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38308e;

    public K(C3104e c3104e, int i8, C3101b c3101b, long j8, long j9, String str, String str2) {
        this.f38304a = c3104e;
        this.f38305b = i8;
        this.f38306c = c3101b;
        this.f38307d = j8;
        this.f38308e = j9;
    }

    public static K b(C3104e c3104e, int i8, C3101b c3101b) {
        boolean zD;
        if (!c3104e.d()) {
            return null;
        }
        r rVarA = C3208q.b().a();
        if (rVarA == null) {
            zD = true;
        } else {
            if (!rVarA.c()) {
                return null;
            }
            zD = rVarA.d();
            B bS = c3104e.s(c3101b);
            if (bS != null) {
                if (!(bS.w() instanceof AbstractC3194c)) {
                    return null;
                }
                AbstractC3194c abstractC3194c = (AbstractC3194c) bS.w();
                if (abstractC3194c.I() && !abstractC3194c.g()) {
                    C3196e c3196eC = c(bS, abstractC3194c, i8);
                    if (c3196eC == null) {
                        return null;
                    }
                    bS.H();
                    zD = c3196eC.e();
                }
            }
        }
        return new K(c3104e, i8, c3101b, zD ? System.currentTimeMillis() : 0L, zD ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static C3196e c(B b8, AbstractC3194c abstractC3194c, int i8) {
        int[] iArrB;
        int[] iArrC;
        C3196e c3196eG = abstractC3194c.G();
        if (c3196eG == null || !c3196eG.d() || ((iArrB = c3196eG.b()) != null ? !a.a(iArrB, i8) : !((iArrC = c3196eG.c()) == null || !a.a(iArrC, i8))) || b8.t() >= c3196eG.a()) {
            return null;
        }
        return c3196eG;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
      0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // S4.InterfaceC1634e
    public final void a(k kVar) {
        B bS;
        int iE;
        int i8;
        int i9;
        int iA;
        long j8;
        long j9;
        if (this.f38304a.d()) {
            r rVarA = C3208q.b().a();
            if ((rVarA == null || rVarA.c()) && (bS = this.f38304a.s(this.f38306c)) != null && (bS.w() instanceof AbstractC3194c)) {
                AbstractC3194c abstractC3194c = (AbstractC3194c) bS.w();
                int i10 = 0;
                boolean zD = this.f38307d > 0;
                int iY = abstractC3194c.y();
                int iB = 100;
                if (rVarA != null) {
                    zD &= rVarA.d();
                    int iA2 = rVarA.a();
                    int iB2 = rVarA.b();
                    iE = rVarA.e();
                    if (abstractC3194c.I() && !abstractC3194c.g()) {
                        C3196e c3196eC = c(bS, abstractC3194c, this.f38305b);
                        if (c3196eC == null) {
                            return;
                        }
                        boolean z8 = c3196eC.e() && this.f38307d > 0;
                        iB2 = c3196eC.a();
                        zD = z8;
                    }
                    i9 = iA2;
                    i8 = iB2;
                } else {
                    iE = 0;
                    i8 = 100;
                    i9 = 5000;
                }
                C3104e c3104e = this.f38304a;
                int iElapsedRealtime = -1;
                if (kVar.l()) {
                    iA = 0;
                } else if (kVar.j()) {
                    i10 = iB;
                    iA = -1;
                } else {
                    Exception excH = kVar.h();
                    if (excH instanceof b) {
                        Status statusA = ((b) excH).a();
                        iB = statusA.b();
                        p195w4.b bVarA = statusA.a();
                        if (bVarA == null) {
                            i10 = iB;
                            iA = -1;
                        } else {
                            iA = bVarA.a();
                            i10 = iB;
                        }
                    } else {
                        i10 = 101;
                        iA = -1;
                    }
                }
                if (zD) {
                    long j10 = this.f38307d;
                    long j11 = this.f38308e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j11);
                    j9 = jCurrentTimeMillis;
                    j8 = j10;
                } else {
                    j8 = 0;
                    j9 = 0;
                }
                c3104e.A(new C3205n(this.f38305b, i10, iA, j8, j9, null, null, iY, iElapsedRealtime), iE, i9, i8);
            }
        }
    }
}
