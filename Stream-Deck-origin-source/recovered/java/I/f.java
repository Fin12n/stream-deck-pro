package I;

import A.AbstractC0890p0;
import android.location.Location;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3605c = "f";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3606d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f3607e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f3608f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f3609g = i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f3610h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p093k2.a f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3612b = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f3613a;

            public a(double d8) {
                this.f3613a = d8;
            }

            public double a() {
                return this.f3613a / 2.23694d;
            }
        }

        public static a a(double d8) {
            return new a(d8 * 0.621371d);
        }

        public static a b(double d8) {
            return new a(d8 * 1.15078d);
        }

        public static a c(double d8) {
            return new a(d8);
        }
    }

    public f(p093k2.a aVar) {
        this.f3611a = aVar;
    }

    public static Date a(String str) {
        return ((SimpleDateFormat) f3606d.get()).parse(str);
    }

    public static Date b(String str) {
        return ((SimpleDateFormat) f3608f.get()).parse(str);
    }

    public static Date c(String str) {
        return ((SimpleDateFormat) f3607e.get()).parse(str);
    }

    public static f e(File file) {
        return f(file.toString());
    }

    public static f f(String str) {
        return new f(new p093k2.a(str));
    }

    public static f g(androidx.camera.core.d dVar) {
        ByteBuffer byteBufferL = dVar.D()[0].l();
        byteBufferL.rewind();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.get(bArr);
        return h(new ByteArrayInputStream(bArr));
    }

    public static f h(InputStream inputStream) {
        return new f(new p093k2.a(inputStream));
    }

    public void d(f fVar) {
        ArrayList<String> arrayList = new ArrayList(f3609g);
        arrayList.removeAll(f3610h);
        for (String str : arrayList) {
            String strH = this.f3611a.h(str);
            String strH2 = fVar.f3611a.h(str);
            if (strH != null && !strH.equals(strH2)) {
                fVar.f3611a.T(str, strH);
            }
        }
    }

    public String j() {
        return this.f3611a.h("ImageDescription");
    }

    public int k() {
        return this.f3611a.j("ImageLength", 0);
    }

    public Location l() {
        double dA;
        String strH = this.f3611a.h("GPSProcessingMethod");
        double[] dArrN = this.f3611a.n();
        double dG = this.f3611a.g(0.0d);
        double dI = this.f3611a.i("GPSSpeed", 0.0d);
        String strH2 = this.f3611a.h("GPSSpeedRef");
        if (strH2 == null) {
            strH2 = "K";
        }
        long jT = t(this.f3611a.h("GPSDateStamp"), this.f3611a.h("GPSTimeStamp"));
        if (dArrN == null) {
            return null;
        }
        if (strH == null) {
            strH = f3605c;
        }
        Location location = new Location(strH);
        location.setLatitude(dArrN[0]);
        location.setLongitude(dArrN[1]);
        if (dG != 0.0d) {
            location.setAltitude(dG);
        }
        if (dI != 0.0d) {
            int iHashCode = strH2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strH2.equals("N")) {
                        dA = d.b(dI).a();
                    }
                } else if (strH2.equals("M")) {
                    dA = d.c(dI).a();
                }
                location.setSpeed((float) dA);
            } else {
                strH2.equals("K");
            }
            dA = d.a(dI).a();
            location.setSpeed((float) dA);
        }
        if (jT != -1) {
            location.setTime(jT);
        }
        return location;
    }

    public int m() {
        return this.f3611a.j("Orientation", 0);
    }

    public int n() {
        switch (m()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long o() {
        long jS = s(this.f3611a.h("DateTimeOriginal"));
        if (jS == -1) {
            return -1L;
        }
        String strH = this.f3611a.h("SubSecTimeOriginal");
        if (strH == null) {
            return jS;
        }
        try {
            long j8 = Long.parseLong(strH);
            while (j8 > 1000) {
                j8 /= 10;
            }
            return jS + j8;
        } catch (NumberFormatException unused) {
            return jS;
        }
    }

    public int p() {
        return this.f3611a.j("ImageWidth", 0);
    }

    public boolean q() {
        return m() == 2;
    }

    public boolean r() {
        int iM = m();
        return iM == 4 || iM == 5 || iM == 7;
    }

    public final long s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return s(str + " " + str2);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(p()), Integer.valueOf(k()), Integer.valueOf(n()), Boolean.valueOf(r()), Boolean.valueOf(q()), l(), Long.valueOf(o()), j());
    }

    public void u(int i8) {
        if (i8 % 90 != 0) {
            AbstractC0890p0.l(f3605c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i8)));
            this.f3611a.T("Orientation", String.valueOf(0));
            return;
        }
        int i9 = i8 % 360;
        int iM = m();
        while (i9 < 0) {
            i9 += 90;
            switch (iM) {
                case 2:
                    iM = 5;
                    break;
                case 3:
                case 8:
                    iM = 6;
                    break;
                case 4:
                    iM = 7;
                    break;
                case 5:
                    iM = 4;
                    break;
                case 6:
                    iM = 1;
                    break;
                case 7:
                    iM = 2;
                    break;
                default:
                    iM = 8;
                    break;
            }
        }
        while (i9 > 0) {
            i9 -= 90;
            switch (iM) {
                case 2:
                    iM = 7;
                    break;
                case 3:
                    iM = 8;
                    break;
                case 4:
                    iM = 5;
                    break;
                case 5:
                    iM = 2;
                    break;
                case 6:
                    iM = 3;
                    break;
                case 7:
                    iM = 4;
                    break;
                case 8:
                    iM = 1;
                    break;
                default:
                    iM = 6;
                    break;
            }
        }
        this.f3611a.T("Orientation", String.valueOf(iM));
    }

    public static List i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", ajyWhveMDgQ.UBhfXqX, "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", vHKCAgr.vfx, "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }
}
