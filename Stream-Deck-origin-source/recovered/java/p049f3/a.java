package p049f3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p004a3.C1696b;
import p058g3.c;
import p058g3.i;
import p121n3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f21796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1696b f21797e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f21793a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f21794b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f21795c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21798f = ".ttf";

    public a(Drawable.Callback callback, C1696b c1696b) {
        this.f21797e = c1696b;
        if (callback instanceof View) {
            this.f21796d = ((View) callback).getContext().getAssets();
        } else {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f21796d = null;
        }
    }

    public final Typeface a(c cVar) {
        Typeface typefaceCreateFromAsset;
        String strA = cVar.a();
        Typeface typeface = (Typeface) this.f21795c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        String strC = cVar.c();
        String strB = cVar.b();
        C1696b c1696b = this.f21797e;
        if (c1696b != null) {
            typefaceCreateFromAsset = c1696b.b(strA, strC, strB);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f21797e.a(strA);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        C1696b c1696b2 = this.f21797e;
        if (c1696b2 != null && typefaceCreateFromAsset == null) {
            String strD = c1696b2.d(strA, strC, strB);
            if (strD == null) {
                strD = this.f21797e.c(strA);
            }
            if (strD != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f21796d, strD);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f21796d, "fonts/" + strA + this.f21798f);
        }
        this.f21795c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(c cVar) {
        this.f21793a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f21794b.get(this.f21793a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f21794b.put(this.f21793a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f21798f = str;
    }

    public void d(C1696b c1696b) {
        this.f21797e = c1696b;
    }

    public final Typeface e(Typeface typeface, String str) {
        int i8;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i8 = 3;
        } else if (zContains) {
            i8 = 2;
        } else {
            i8 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i8 ? typeface : Typeface.create(typeface, i8);
    }
}
