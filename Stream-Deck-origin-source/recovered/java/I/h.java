package I;

import A.AbstractC0890p0;
import E4.JFpq.XRlnZWSrAFn;
import H.EnumC1012x;
import android.os.Build;
import android.util.Pair;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3622c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j[] f3623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j[] f3624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j[] f3625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j[] f3626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j[] f3627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j[][] f3628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f3629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3630k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f3632b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3633a;

        static {
            int[] iArr = new int[EnumC1012x.values().length];
            f3633a = iArr;
            try {
                iArr[EnumC1012x.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3633a[EnumC1012x.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3633a[EnumC1012x.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f3634c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f3635d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f3636e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final List f3637f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3638a = Collections.list(new C0138b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteOrder f3639b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3640a = 0;

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap nextElement() {
                HashMap map = new HashMap();
                for (j jVar : h.f3628i[this.f3640a]) {
                    map.put(jVar.f3656b, jVar);
                }
                this.f3640a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3640a < h.f3628i.length;
            }
        }

        /* JADX INFO: renamed from: I.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0138b implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3641a = 0;

            public C0138b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                this.f3641a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3641a < h.f3628i.length;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class c implements Enumeration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Enumeration f3643a;

            public c() {
                this.f3643a = Collections.enumeration(b.this.f3638a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map nextElement() {
                return new HashMap((Map) this.f3643a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f3643a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f3639b = byteOrder;
        }

        public static Pair b(String str) {
            if (str.contains(com.amazon.a.a.o.b.f.f16777a)) {
                String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16777a, -1);
                Pair pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                    Pair pairB2 = b(strArrSplit[i8]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j8 = Long.parseLong(str);
                        if (j8 < 0 || j8 > 65535) {
                            return j8 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                        }
                        return new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j9 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j10 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j9 >= 0 && j10 >= 0) {
                        if (j9 <= 2147483647L && j10 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f3638a);
            return this;
        }

        public final void d(String str, String str2, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        public final void e(String str, String str2, List list) {
            int i8;
            int i9;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f3635d.matcher(strReplaceAll).find();
                boolean zFind2 = f3636e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    AbstractC0890p0.l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i10 = 2;
            int i11 = 1;
            if (strReplaceAll != null && h.f3629j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f3634c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        AbstractC0890p0.l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) T1.f.g(matcher.group(1))) + "/1," + Integer.parseInt((String) T1.f.g(matcher.group(2))) + "/1," + Integer.parseInt((String) T1.f.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new l(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e8) {
                        AbstractC0890p0.m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e8);
                        return;
                    }
                }
            }
            int i12 = 0;
            while (i12 < h.f3628i.length) {
                j jVar = (j) ((HashMap) f3637f.get(i12)).get(str4);
                if (jVar == null) {
                    i8 = i11;
                } else {
                    if (strReplaceAll != null) {
                        Pair pairB = b(strReplaceAll);
                        int i13 = -1;
                        if (jVar.f3657c == ((Integer) pairB.first).intValue() || jVar.f3657c == ((Integer) pairB.second).intValue()) {
                            i9 = jVar.f3657c;
                        } else {
                            int i14 = jVar.f3658d;
                            if (i14 == -1 || !(i14 == ((Integer) pairB.first).intValue() || jVar.f3658d == ((Integer) pairB.second).intValue())) {
                                i9 = jVar.f3657c;
                                if (i9 == i11 || i9 == 7 || i9 == i10) {
                                }
                            } else {
                                i9 = jVar.f3658d;
                            }
                        }
                        String str5 = "/";
                        switch (i9) {
                            case 1:
                                i8 = i11;
                                ((Map) list.get(i12)).put(str4, g.a(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i8 = i11;
                                ((Map) list.get(i12)).put(str4, g.e(strReplaceAll));
                                continue;
                            case 3:
                                i8 = i11;
                                String[] strArrSplit = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                                    iArr[i15] = Integer.parseInt(strArrSplit[i15]);
                                }
                                ((Map) list.get(i12)).put(str4, g.i(iArr, bVar.f3639b));
                                continue;
                            case 4:
                                i8 = i11;
                                String[] strArrSplit2 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i16 = 0; i16 < strArrSplit2.length; i16++) {
                                    jArr[i16] = Long.parseLong(strArrSplit2[i16]);
                                }
                                ((Map) list.get(i12)).put(str4, g.g(jArr, bVar.f3639b));
                                continue;
                            case 5:
                                i8 = i11;
                                int i17 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                l[] lVarArr = new l[strArrSplit3.length];
                                int i18 = 0;
                                while (i18 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i18].split("/", i17);
                                    lVarArr[i18] = new l((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i8]));
                                    i18++;
                                    i17 = -1;
                                }
                                bVar = this;
                                ((Map) list.get(i12)).put(str4, g.h(lVarArr, bVar.f3639b));
                                continue;
                            case 9:
                                i8 = i11;
                                String[] strArrSplit5 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i19 = 0; i19 < strArrSplit5.length; i19++) {
                                    iArr2[i19] = Integer.parseInt(strArrSplit5[i19]);
                                }
                                ((Map) list.get(i12)).put(str4, g.c(iArr2, bVar.f3639b));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                l[] lVarArr2 = new l[strArrSplit6.length];
                                int i20 = 0;
                                while (i20 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i20].split(str5, i13);
                                    int i21 = i11;
                                    lVarArr2[i20] = new l((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i21]));
                                    i20++;
                                    i11 = i21;
                                    str5 = str5;
                                    i13 = -1;
                                }
                                i8 = i11;
                                ((Map) list.get(i12)).put(str4, g.d(lVarArr2, bVar.f3639b));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i22 = 0; i22 < strArrSplit8.length; i22++) {
                                    dArr[i22] = Double.parseDouble(strArrSplit8[i22]);
                                }
                                ((Map) list.get(i12)).put(str4, g.b(dArr, bVar.f3639b));
                                break;
                        }
                    } else {
                        ((Map) list.get(i12)).remove(str4);
                    }
                    i8 = i11;
                }
                i12++;
                i11 = i8;
                i10 = 2;
            }
        }

        public b f(long j8) {
            return c("ExposureTime", String.valueOf(j8 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(EnumC1012x enumC1012x) {
            int i8;
            if (enumC1012x == EnumC1012x.UNKNOWN) {
                return this;
            }
            int i9 = a.f3633a[enumC1012x.ordinal()];
            if (i9 == 1) {
                i8 = 0;
            } else if (i9 == 2) {
                i8 = 32;
            } else {
                if (i9 != 3) {
                    AbstractC0890p0.l("ExifData", "Unknown flash state: " + enumC1012x);
                    return this;
                }
                i8 = 1;
            }
            if ((i8 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i8));
        }

        public b h(float f8) {
            return c("FocalLength", new l((long) (f8 * 1000.0f), 1000L).toString());
        }

        public b i(int i8) {
            return c("ImageLength", String.valueOf(i8));
        }

        public b j(int i8) {
            return c("ImageWidth", String.valueOf(i8));
        }

        public b k(int i8) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i8)));
        }

        public b l(float f8) {
            return c("FNumber", String.valueOf(f8));
        }

        public b m(int i8) {
            int i9;
            if (i8 == 0) {
                i9 = 1;
            } else if (i8 == 90) {
                i9 = 6;
            } else if (i8 == 180) {
                i9 = 3;
            } else if (i8 != 270) {
                AbstractC0890p0.l("ExifData", "Unexpected orientation value: " + i8 + ". Must be one of 0, 90, 180, 270.");
                i9 = 0;
            } else {
                i9 = 8;
            }
            return c("Orientation", String.valueOf(i9));
        }

        public b n(c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }

        public h a() {
            ArrayList list = Collections.list(new c());
            if (!((Map) list.get(1)).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", hJroAgFztiMK.JZzaxNa, list);
                d(ajyWhveMDgQ.icFYeLGzBN, h.f3630k, list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f3639b, list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        AUTO,
        MANUAL
    }

    public h(ByteOrder byteOrder, List list) {
        T1.f.j(list.size() == f3628i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f3632b = byteOrder;
        this.f3631a = list;
    }

    public static b b() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static h c(androidx.camera.core.d dVar, int i8) {
        b bVarB = b();
        if (dVar.e1() != null) {
            dVar.e1().d(bVarB);
        }
        bVarB.m(i8);
        return bVarB.j(dVar.g()).i(dVar.f()).a();
    }

    public Map d(int i8) {
        T1.f.c(i8, 0, f3628i.length, "Invalid IFD index: " + i8 + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.f3631a.get(i8);
    }

    public ByteOrder e() {
        return this.f3632b;
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f3623d = jVarArr;
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j(XRlnZWSrAFn.lVTD, 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j("FlashpixVersion", 40960, 7), new j("ColorSpace", 40961, 3), new j("PixelXDimension", 40962, 3, 4), new j("PixelYDimension", 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j("ExposureMode", 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        f3624e = jVarArr2;
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f3625f = jVarArr3;
        f3626g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j("InteroperabilityIndex", 1, 2)};
        f3627h = jVarArr4;
        f3628i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f3629j = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f3630k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }
}
