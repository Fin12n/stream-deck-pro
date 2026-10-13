package p164s5;

import H4.b;
import X4.C1668a;
import X4.C1671d;
import X4.e;
import X4.f;
import X4.g;
import X4.i;
import X4.j;
import X4.l;
import X4.m;
import X4.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1893g0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1923m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1927n;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1932o;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1933o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1937p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1942q;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1951s;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1952s0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1956t;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1961u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1966v;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1971w;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1976x;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1981y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1986z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.O;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p204x5.d;
import p212y5.B;
import p212y5.C3125a;
import p212y5.C3131g;
import p212y5.C3132h;
import p212y5.C3134j;
import p212y5.C3137m;
import p212y5.D;
import p212y5.F;
import p212y5.H;
import p212y5.L;
import p212y5.P;
import p212y5.q;
import p212y5.s;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f33165d = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double[][] f33166e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f33168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BarhopperV3 f33169c;

    public a(Context context, C c8) {
        this.f33167a = context;
        this.f33168b = c8;
    }

    public static C1932o Q(B b8, String str, String str2) {
        if (b8 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C1932o(b8.O(), b8.M(), b8.J(), b8.K(), b8.L(), b8.N(), b8.R(), matcher.find() ? matcher.group(1) : null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public final List F(H4.a aVar, C1893g0 c1893g0, E e8) {
        RecognitionOptions recognitionOptionsP = P();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(e8.a().c());
        multiScaleDecodingOptions.b(e8.a().a());
        multiScaleDecodingOptions.c(e8.a().b());
        recognitionOptionsP.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(e8.a().c());
        recognitionOptionsP.e(multiScaleDetectionOptions);
        recognitionOptionsP.g(e8.b());
        return S(aVar, c1893g0, recognitionOptionsP);
    }

    public final RecognitionOptions P() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.a(this.f33168b.a());
        recognitionOptions.f(this.f33168b.b());
        recognitionOptions.b(true);
        recognitionOptions.c(true);
        return recognitionOptions;
    }

    public final C3125a R(ByteBuffer byteBuffer, C1893g0 c1893g0, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC3207p.k(this.f33169c);
        if (((ByteBuffer) AbstractC3207p.k(byteBuffer)).isDirect()) {
            return barhopperV3.c(c1893g0.d(), c1893g0.a(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.j(c1893g0.d(), c1893g0.a(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.j(c1893g0.d(), c1893g0.a(), bArr, recognitionOptions);
    }

    public final List S(H4.a aVar, C1893g0 c1893g0, RecognitionOptions recognitionOptions) {
        C3125a c3125aO;
        C1951s c1951s;
        C1966v c1966v;
        C1971w c1971w;
        C1981y c1981y;
        C1976x c1976x;
        C1956t c1956t;
        C1937p c1937p;
        C1942q c1942q;
        r rVar;
        byte b8;
        Point[] pointArr;
        int i8;
        C1966v[] c1966vArr;
        C1951s[] c1951sArr;
        C1927n[] c1927nArr;
        int iB = c1893g0.b();
        byte b9 = -1;
        if (iB == -1) {
            c3125aO = ((BarhopperV3) AbstractC3207p.k(this.f33169c)).o((Bitmap) b.d(aVar), recognitionOptions);
        } else if (iB == 17) {
            c3125aO = R((ByteBuffer) b.d(aVar), c1893g0, recognitionOptions);
        } else if (iB != 35) {
            if (iB != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + c1893g0.b());
            }
            c3125aO = R((ByteBuffer) b.d(aVar), c1893g0, recognitionOptions);
        } else {
            c3125aO = R(((Image) AbstractC3207p.k((Image) b.d(aVar))).getPlanes()[0].getBuffer(), c1893g0, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        Matrix matrixD = d.b().d(c1893g0.d(), c1893g0.a(), c1893g0.c());
        for (s sVar : c3125aO.L()) {
            if (sVar.K() > 0 && matrixD != null) {
                float[] fArr = new float[8];
                List listX = sVar.X();
                int iK = sVar.K();
                for (int i9 = 0; i9 < iK; i9++) {
                    int i10 = i9 + i9;
                    fArr[i10] = ((C3132h) listX.get(i9)).J();
                    fArr[i10 + 1] = ((C3132h) listX.get(i9)).K();
                }
                matrixD.mapPoints(fArr);
                int iC = c1893g0.c();
                int i11 = 0;
                while (i11 < iK) {
                    p212y5.r rVar2 = (p212y5.r) sVar.m();
                    int i12 = i11 + i11;
                    byte b10 = b9;
                    C3131g c3131gL = C3132h.L();
                    c3131gL.s((int) fArr[i12]);
                    c3131gL.u((int) fArr[i12 + 1]);
                    rVar2.s((i11 + iC) % iK, (C3132h) c3131gL.y());
                    sVar = (s) rVar2.y();
                    i11++;
                    b9 = b10;
                }
            }
            byte b11 = b9;
            if (sVar.c0()) {
                L lQ = sVar.Q();
                c1951s = new C1951s(lQ.O() - 1, lQ.L(), lQ.N(), lQ.M());
            } else {
                c1951s = null;
            }
            if (sVar.e0()) {
                C1952s0 c1952s0L = sVar.L();
                c1966v = new C1966v(c1952s0L.M() - 1, c1952s0L.L());
            } else {
                c1966v = null;
            }
            if (sVar.f0()) {
                C3134j c3134jS = sVar.S();
                c1971w = new C1971w(c3134jS.L(), c3134jS.M());
            } else {
                c1971w = null;
            }
            if (sVar.h0()) {
                q qVarU = sVar.U();
                c1981y = new C1981y(qVarU.M(), qVarU.L(), qVarU.N() - 1);
            } else {
                c1981y = null;
            }
            if (sVar.g0()) {
                C3137m c3137mT = sVar.T();
                c1976x = new C1976x(c3137mT.L(), c3137mT.M());
            } else {
                c1976x = null;
            }
            if (sVar.d0()) {
                P pR = sVar.R();
                c1956t = new C1956t(pR.J(), pR.K());
            } else {
                c1956t = null;
            }
            if (sVar.Z()) {
                D dN = sVar.N();
                c1937p = new C1937p(dN.R(), dN.N(), dN.O(), dN.P(), dN.Q(), Q(dN.K(), sVar.V().J() ? sVar.V().P() : null, "DTSTART:([0-9TZ]*)"), Q(dN.J(), sVar.V().J() ? sVar.V().P() : null, "DTEND:([0-9TZ]*)"));
            } else {
                c1937p = null;
            }
            if (sVar.a0()) {
                F fO = sVar.O();
                C1933o0 c1933o0J = fO.J();
                C1961u c1961u = c1933o0J != null ? new C1961u(c1933o0J.M(), c1933o0J.Q(), c1933o0J.P(), c1933o0J.L(), c1933o0J.O(), c1933o0J.N(), c1933o0J.R()) : null;
                String strM = fO.M();
                String strN = fO.N();
                List listQ = fO.Q();
                if (listQ.isEmpty()) {
                    c1966vArr = null;
                } else {
                    C1966v[] c1966vArr2 = new C1966v[listQ.size()];
                    for (int i13 = 0; i13 < listQ.size(); i13++) {
                        c1966vArr2[i13] = new C1966v(((C1952s0) listQ.get(i13)).M() - 1, ((C1952s0) listQ.get(i13)).L());
                    }
                    c1966vArr = c1966vArr2;
                }
                List listP = fO.P();
                if (listP.isEmpty()) {
                    c1951sArr = null;
                } else {
                    C1951s[] c1951sArr2 = new C1951s[listP.size()];
                    for (int i14 = 0; i14 < listP.size(); i14++) {
                        c1951sArr2[i14] = new C1951s(((L) listP.get(i14)).O() - 1, ((L) listP.get(i14)).L(), ((L) listP.get(i14)).N(), ((L) listP.get(i14)).M());
                    }
                    c1951sArr = c1951sArr2;
                }
                String[] strArr = (String[]) fO.R().toArray(new String[0]);
                List listO = fO.O();
                if (listO.isEmpty()) {
                    c1927nArr = null;
                } else {
                    C1927n[] c1927nArr2 = new C1927n[listO.size()];
                    for (int i15 = 0; i15 < listO.size(); i15++) {
                        c1927nArr2[i15] = new C1927n(((C1923m0) listO.get(i15)).L() - 1, (String[]) ((C1923m0) listO.get(i15)).K().toArray(new String[0]));
                    }
                    c1927nArr = c1927nArr2;
                }
                c1942q = new C1942q(c1961u, strM, strN, c1966vArr, c1951sArr, strArr, c1927nArr);
            } else {
                c1942q = null;
            }
            if (sVar.b0()) {
                H hP = sVar.P();
                rVar = new r(hP.Q(), hP.S(), hP.Y(), hP.W(), hP.T(), hP.N(), hP.L(), hP.M(), hP.O(), hP.X(), hP.U(), hP.R(), hP.P(), hP.V());
            } else {
                rVar = null;
            }
            int i16 = 4;
            switch (sVar.i0() - 1) {
                case 0:
                    b8 = 0;
                    break;
                case 1:
                    b8 = 1;
                    break;
                case 2:
                    b8 = 2;
                    break;
                case 3:
                    b8 = 4;
                    break;
                case 4:
                    b8 = 8;
                    break;
                case 5:
                    b8 = 16;
                    break;
                case 6:
                    b8 = 32;
                    break;
                case 7:
                    b8 = 64;
                    break;
                case 8:
                    b8 = 128;
                    break;
                case 9:
                    b8 = 256;
                    break;
                case 10:
                    b8 = 512;
                    break;
                case 11:
                    b8 = 1024;
                    break;
                case 12:
                    b8 = 2048;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    b8 = 4096;
                    break;
                default:
                    b8 = b11;
                    break;
            }
            String strW = sVar.W();
            String strP = sVar.V().J() ? sVar.V().P() : null;
            byte[] bArrS = sVar.V().S();
            List listX2 = sVar.X();
            if (listX2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[listX2.size()];
                for (int i17 = 0; i17 < listX2.size(); i17++) {
                    pointArr2[i17] = new Point(((C3132h) listX2.get(i17)).J(), ((C3132h) listX2.get(i17)).K());
                }
                pointArr = pointArr2;
            }
            switch (sVar.J() - 1) {
                case 1:
                    i8 = 1;
                    continue;
                    arrayList.add(new C1986z(b8, strW, strP, bArrS, pointArr, i8, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar));
                    b9 = b11;
                    break;
                case 2:
                    i8 = 2;
                    continue;
                    arrayList.add(new C1986z(b8, strW, strP, bArrS, pointArr, i8, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar));
                    b9 = b11;
                    break;
                case 3:
                    i16 = 3;
                    break;
                case 4:
                    break;
                case 5:
                    i16 = 5;
                    break;
                case 6:
                    i16 = 6;
                    break;
                case 7:
                    i16 = 7;
                    break;
                case 8:
                    i8 = 8;
                    continue;
                    arrayList.add(new C1986z(b8, strW, strP, bArrS, pointArr, i8, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar));
                    b9 = b11;
                    break;
                case 9:
                    i16 = 9;
                    break;
                case 10:
                    i16 = 10;
                    break;
                case 11:
                    i16 = 11;
                    break;
                case 12:
                    i16 = 12;
                    break;
                default:
                    i8 = 0;
                    continue;
                    arrayList.add(new C1986z(b8, strW, strP, bArrS, pointArr, i8, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar));
                    b9 = b11;
                    break;
            }
            i8 = i16;
            arrayList.add(new C1986z(b8, strW, strP, bArrS, pointArr, i8, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar));
            b9 = b11;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public final void k() {
        if (this.f33169c != null) {
            return;
        }
        this.f33169c = new BarhopperV3();
        l lVarJ = m.J();
        i iVarJ = j.J();
        int i8 = 16;
        int i9 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            f fVarJ = g.J();
            fVarJ.v(i8);
            fVarJ.w(i8);
            for (int i11 = 0; i11 < f33165d[i10]; i11++) {
                double[] dArr = f33166e[i9];
                double d8 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f8 = (float) d8;
                fVarJ.s(f8 / fSqrt);
                fVarJ.u(f8 * fSqrt);
                i9++;
            }
            i8 += i8;
            iVarJ.s(fVarJ);
        }
        lVarJ.s(iVarJ);
        try {
            InputStream inputStreamOpen = this.f33167a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = this.f33167a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = this.f33167a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC3207p.k(this.f33169c);
                        o oVarJ = C1668a.J();
                        lVarJ.u(J0.O(inputStreamOpen));
                        oVarJ.s(lVarJ);
                        C1671d c1671dJ = e.J();
                        c1671dJ.s(J0.O(inputStreamOpen2));
                        c1671dJ.u(J0.O(inputStreamOpen3));
                        oVarJ.u(c1671dJ);
                        barhopperV3.b((C1668a) oVarJ.y());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (IOException e8) {
            throw new IllegalStateException("Failed to open Barcode models", e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public final void l() {
        BarhopperV3 barhopperV3 = this.f33169c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f33169c = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public final List q(H4.a aVar, C1893g0 c1893g0) {
        return S(aVar, c1893g0, P());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P
    public final void w(G g8) {
        k();
    }
}
