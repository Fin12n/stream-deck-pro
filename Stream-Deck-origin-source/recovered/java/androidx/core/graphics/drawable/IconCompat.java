package androidx.core.graphics.drawable;

import T1.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import p143q0.nKy.bGZGhbtQmA;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f15052k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f15055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f15056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f15059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f15060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15062j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static IconCompat a(Object obj) {
            f.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.k(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.h(e(obj));
            }
            if (iD == 6) {
                return IconCompat.e(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f15054b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            return c.a(obj);
        }

        public static String c(Object obj) {
            return c.b(obj);
        }

        public static int d(Object obj) {
            return c.c(obj);
        }

        public static Uri e(Object obj) {
            return c.d(obj);
        }

        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f15053a) {
                case HTTPClient.NO_STATUS_CODE /* -1 */:
                    return (Icon) iconCompat.f15054b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f15054b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.n(), iconCompat.f15057e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f15054b, iconCompat.f15057e, iconCompat.f15058f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f15054b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.b((Bitmap) iconCompat.f15054b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.p());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.p());
                        }
                        InputStream inputStreamQ = iconCompat.q(context);
                        if (inputStreamQ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.p());
                        }
                        iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamQ));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f15059g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f15060h;
            if (mode != IconCompat.f15052k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f15053a = -1;
        this.f15055c = null;
        this.f15056d = null;
        this.f15057e = 0;
        this.f15058f = 0;
        this.f15059g = null;
        this.f15060h = f15052k;
        this.f15061i = null;
    }

    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    public static IconCompat c(Icon icon) {
        if (a.d(icon) == 2 && a.b(icon) == 0) {
            return null;
        }
        return a.a(icon);
    }

    public static Bitmap d(Bitmap bitmap, boolean z8) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f8 = iMin;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z8) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat e(Uri uri) {
        T1.d.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        T1.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f15054b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        T1.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f15054b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        T1.d.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        T1.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f15054b = str;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i8) {
        T1.d.c(context);
        return k(context.getResources(), context.getPackageName(), i8);
    }

    public static IconCompat k(Resources resources, String str, int i8) {
        T1.d.c(str);
        if (i8 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f15057e = i8;
        if (resources != null) {
            try {
                iconCompat.f15054b = resources.getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f15054b = str;
        }
        iconCompat.f15062j = str;
        return iconCompat;
    }

    public static String w(int i8) {
        switch (i8) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap l() {
        int i8 = this.f15053a;
        if (i8 == -1) {
            Object obj = this.f15054b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i8 == 1) {
            return (Bitmap) this.f15054b;
        }
        if (i8 == 5) {
            return d((Bitmap) this.f15054b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int m() {
        int i8 = this.f15053a;
        if (i8 == -1) {
            return a.b(this.f15054b);
        }
        if (i8 == 2) {
            return this.f15057e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i8 = this.f15053a;
        if (i8 == -1) {
            return a.c(this.f15054b);
        }
        if (i8 == 2) {
            String str = this.f15062j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f15054b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0] : this.f15062j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i8 = this.f15053a;
        return i8 == -1 ? a.d(this.f15054b) : i8;
    }

    public Uri p() {
        int i8 = this.f15053a;
        if (i8 == -1) {
            return a.e(this.f15054b);
        }
        if (i8 == 4 || i8 == 6) {
            return Uri.parse((String) this.f15054b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream q(Context context) {
        Uri uriP = p();
        String scheme = uriP.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriP);
            } catch (Exception e8) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriP, e8);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f15054b));
        } catch (FileNotFoundException e9) {
            Log.w("IconCompat", "Unable to load image from path: " + uriP, e9);
            return null;
        }
    }

    public void r() {
        this.f15060h = PorterDuff.Mode.valueOf(this.f15061i);
        switch (this.f15053a) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                Parcelable parcelable = this.f15056d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f15054b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f15056d;
                if (parcelable2 != null) {
                    this.f15054b = parcelable2;
                    return;
                }
                byte[] bArr = this.f15055c;
                this.f15054b = bArr;
                this.f15053a = 3;
                this.f15057e = 0;
                this.f15058f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f15055c, Charset.forName("UTF-16"));
                this.f15054b = str;
                if (this.f15053a == 2 && this.f15062j == null) {
                    this.f15062j = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f15054b = this.f15055c;
                return;
        }
    }

    public void s(boolean z8) {
        this.f15061i = this.f15060h.name();
        switch (this.f15053a) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                if (z8) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f15056d = (Parcelable) this.f15054b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z8) {
                    this.f15056d = (Parcelable) this.f15054b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f15054b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f15055c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f15055c = ((String) this.f15054b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f15055c = (byte[]) this.f15054b;
                return;
            case 4:
            case 6:
                this.f15055c = this.f15054b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public String toString() {
        if (this.f15053a == -1) {
            return String.valueOf(this.f15054b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(w(this.f15053a));
        switch (this.f15053a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f15054b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f15054b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f15062j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f15057e);
                if (this.f15058f != 0) {
                    sb.append(" off=");
                    sb.append(this.f15058f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f15054b);
                break;
        }
        if (this.f15059g != null) {
            sb.append(" tint=");
            sb.append(this.f15059g);
        }
        if (this.f15060h != f15052k) {
            sb.append(" mode=");
            sb.append(this.f15060h);
        }
        sb.append(")");
        return sb.toString();
    }

    public Icon u() {
        return v(null);
    }

    public Icon v(Context context) {
        return a.g(this, context);
    }

    public static IconCompat a(Bundle bundle) {
        int i8 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i8);
        iconCompat.f15057e = bundle.getInt("int1");
        iconCompat.f15058f = bundle.getInt("int2");
        iconCompat.f15062j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f15059g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f15060h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i8) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
            case 1:
            case 5:
                iconCompat.f15054b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", kDsnNkYbBsI.rTyFcgcPJHrK + i8);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f15054b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f15054b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public Bundle t() {
        Bundle bundle = new Bundle();
        switch (this.f15053a) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                bundle.putParcelable("obj", (Parcelable) this.f15054b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f15054b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f15054b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f15054b);
                break;
        }
        bundle.putInt("type", this.f15053a);
        bundle.putInt("int1", this.f15057e);
        bundle.putInt(bGZGhbtQmA.RhcAtZ, this.f15058f);
        bundle.putString("string1", this.f15062j);
        ColorStateList colorStateList = this.f15059g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f15060h;
        if (mode != f15052k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public IconCompat(int i8) {
        this.f15055c = null;
        this.f15056d = null;
        this.f15057e = 0;
        this.f15058f = 0;
        this.f15059g = null;
        this.f15060h = f15052k;
        this.f15061i = null;
        this.f15053a = i8;
    }
}
