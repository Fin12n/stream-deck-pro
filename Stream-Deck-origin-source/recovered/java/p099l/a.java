package p099l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p054g.b;
import p054g.d;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28819a;

    public a(Context context) {
        this.f28819a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f28819a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f28819a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f28819a.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600) {
            return 5;
        }
        if (i8 > 960 && i9 > 720) {
            return 5;
        }
        if (i8 > 720 && i9 > 960) {
            return 5;
        }
        if (i8 >= 500) {
            return 4;
        }
        if (i8 > 640 && i9 > 480) {
            return 4;
        }
        if (i8 <= 480 || i9 <= 640) {
            return i8 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f28819a.getResources().getDimensionPixelSize(d.f22407b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f28819a.obtainStyledAttributes(null, j.f22644a, p054g.a.f22373c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f22689j, 0);
        Resources resources = this.f28819a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.f22406a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f28819a.getResources().getBoolean(b.f22397a);
    }

    public boolean h() {
        return true;
    }
}
