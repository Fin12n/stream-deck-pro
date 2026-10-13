package p117n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b0.C;
import p010b0.D;
import p010b0.m;
import p010b0.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static O f30283i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f30285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f30286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f30287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f30288d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f30289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f30291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f30282h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f30284j = new a(6);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends o {
        public a(int i8) {
            super(i8);
        }

        public static int h(int i8, PorterDuff.Mode mode) {
            return ((i8 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter i(int i8, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i8, mode)));
        }

        public PorterDuffColorFilter j(int i8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i8, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        Drawable a(O o8, Context context, int i8);

        boolean b(Context context, int i8, Drawable drawable);

        PorterDuff.Mode c(int i8);

        ColorStateList d(Context context, int i8);

        boolean e(Context context, int i8, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized O g() {
        try {
            if (f30283i == null) {
                O o8 = new O();
                f30283i = o8;
                o(o8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f30283i;
    }

    public static synchronized PorterDuffColorFilter k(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        a aVar = f30284j;
        porterDuffColorFilterI = aVar.i(i8, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i8, mode);
            aVar.j(i8, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof F2.b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, V v8, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z8 = v8.f30337d;
        if (z8 || v8.f30336c) {
            drawable.setColorFilter(f(z8 ? v8.f30334a : null, v8.f30336c ? v8.f30335b : f30282h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            m mVar = (m) this.f30288d.get(context);
            if (mVar == null) {
                mVar = new m();
                this.f30288d.put(context, mVar);
            }
            mVar.i(j8, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i8, ColorStateList colorStateList) {
        if (this.f30285a == null) {
            this.f30285a = new WeakHashMap();
        }
        D d8 = (D) this.f30285a.get(context);
        if (d8 == null) {
            d8 = new D();
            this.f30285a.put(context, d8);
        }
        d8.a(i8, colorStateList);
    }

    public final void c(Context context) {
        if (this.f30290f) {
            return;
        }
        this.f30290f = true;
        Drawable drawableI = i(context, p090k.a.f28384a);
        if (drawableI == null || !p(drawableI)) {
            this.f30290f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i8) {
        if (this.f30289e == null) {
            this.f30289e = new TypedValue();
        }
        TypedValue typedValue = this.f30289e;
        context.getResources().getValue(i8, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f30291g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i8);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable h(Context context, long j8) {
        m mVar = (m) this.f30288d.get(context);
        if (mVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) mVar.e(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            mVar.k(j8);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i8) {
        return j(context, i8, false);
    }

    public synchronized Drawable j(Context context, int i8, boolean z8) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i8);
            if (drawableQ == null) {
                drawableQ = e(context, i8);
            }
            if (drawableQ == null) {
                drawableQ = I1.a.d(context, i8);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i8, z8, drawableQ);
            }
            if (drawableQ != null) {
                H.a(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(Context context, int i8) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i8);
        if (colorStateListM == null) {
            c cVar = this.f30291g;
            colorStateListM = cVar == null ? null : cVar.d(context, i8);
            if (colorStateListM != null) {
                b(context, i8, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(Context context, int i8) {
        D d8;
        WeakHashMap weakHashMap = this.f30285a;
        if (weakHashMap == null || (d8 = (D) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) d8.f(i8);
    }

    public PorterDuff.Mode n(int i8) {
        c cVar = this.f30291g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i8);
    }

    public final Drawable q(Context context, int i8) {
        int next;
        C c8 = this.f30286b;
        if (c8 == null || c8.isEmpty()) {
            return null;
        }
        D d8 = this.f30287c;
        if (d8 != null) {
            String str = (String) d8.f(i8);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f30286b.get(str) == null)) {
                return null;
            }
        } else {
            this.f30287c = new D();
        }
        if (this.f30289e == null) {
            this.f30289e = new TypedValue();
        }
        TypedValue typedValue = this.f30289e;
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i8);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f30287c.a(i8, name);
                b bVar = (b) this.f30286b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e8) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e8);
            }
        }
        if (drawableH == null) {
            this.f30287c.a(i8, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized void r(Context context) {
        m mVar = (m) this.f30288d.get(context);
        if (mVar != null) {
            mVar.a();
        }
    }

    public synchronized Drawable s(Context context, c0 c0Var, int i8) {
        try {
            Drawable drawableQ = q(context, i8);
            if (drawableQ == null) {
                drawableQ = c0Var.a(i8);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i8, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f30291g = cVar;
    }

    public final Drawable u(Context context, int i8, boolean z8, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i8);
        if (colorStateListL != null) {
            Drawable drawableI = M1.a.i(drawable.mutate());
            M1.a.g(drawableI, colorStateListL);
            PorterDuff.Mode modeN = n(i8);
            if (modeN != null) {
                M1.a.h(drawableI, modeN);
            }
            return drawableI;
        }
        c cVar = this.f30291g;
        if ((cVar == null || !cVar.e(context, i8, drawable)) && !w(context, i8, drawable) && z8) {
            return null;
        }
        return drawable;
    }

    public boolean w(Context context, int i8, Drawable drawable) {
        c cVar = this.f30291g;
        return cVar != null && cVar.b(context, i8, drawable);
    }

    public static void o(O o8) {
    }
}
