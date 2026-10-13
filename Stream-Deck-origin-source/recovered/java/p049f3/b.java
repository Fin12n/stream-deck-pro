package p049f3;

import T0.Vl.PCRzgdeK;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import p004a3.InterfaceC1697c;
import p004a3.K;
import p121n3.d;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f21799d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f21802c;

    public b(Drawable.Callback callback, String str, InterfaceC1697c interfaceC1697c, Map<String, K> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f21801b = str;
        } else {
            this.f21801b = str + '/';
        }
        this.f21802c = map;
        d(interfaceC1697c);
        if (callback instanceof View) {
            this.f21800a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f21800a = null;
        }
    }

    public boolean b(Context context) {
        if (this.f21800a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f21800a;
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (f21799d) {
            ((K) this.f21802c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public void d(InterfaceC1697c interfaceC1697c) {
    }

    public Bitmap a(String str) {
        K k8 = (K) this.f21802c.get(str);
        if (k8 == null) {
            return null;
        }
        Bitmap bitmapB = k8.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f21800a;
        if (context == null) {
            return null;
        }
        String strC = k8.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e8) {
                d.d("data URL did not have correct base64 format.", e8);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f21801b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f21801b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, j.l(bitmapDecodeStream, k8.f(), k8.d()));
                }
                d.c(PCRzgdeK.RGSXLWFaeg + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e9) {
                d.d("Unable to decode image `" + str + "`.", e9);
                return null;
            }
        } catch (IOException e10) {
            d.d("Unable to open asset.", e10);
            return null;
        }
    }
}
