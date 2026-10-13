package p117n;

import U1.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p003a2.h;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f30154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f30155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f30156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f30157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f30158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f30159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V f30160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V f30161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D f30162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30163j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30164k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f30165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30166m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f30171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f30172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30173c;

        public b(TextView textView, Typeface typeface, int i8) {
            this.f30171a = textView;
            this.f30172b = typeface;
            this.f30173c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30171a.setTypeface(this.f30172b, this.f30173c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i8, int i9, int i10, int i11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        public static void c(TextView textView, int[] iArr, int i8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public static Typeface a(Typeface typeface, int i8, boolean z8) {
            return Typeface.create(typeface, i8, z8);
        }
    }

    public B(TextView textView) {
        this.f30154a = textView;
        this.f30162i = new D(textView);
    }

    public static V d(Context context, C2708j c2708j, int i8) {
        ColorStateList colorStateListF = c2708j.f(context, i8);
        if (colorStateListF == null) {
            return null;
        }
        V v8 = new V();
        v8.f30337d = true;
        v8.f30334a = colorStateListF;
        return v8;
    }

    public void A(int i8, float f8) {
        if (d0.f30371c || l()) {
            return;
        }
        B(i8, f8);
    }

    public final void B(int i8, float f8) {
        this.f30162i.t(i8, f8);
    }

    public final void C(Context context, X x8) {
        String strN;
        this.f30163j = x8.j(j.f22571H2, this.f30163j);
        int iJ = x8.j(j.f22579J2, -1);
        this.f30164k = iJ;
        if (iJ != -1) {
            this.f30163j &= 2;
        }
        if (!x8.r(j.f22575I2) && !x8.r(j.f22583K2)) {
            if (x8.r(j.f22567G2)) {
                this.f30166m = false;
                int iJ2 = x8.j(j.f22567G2, 1);
                if (iJ2 == 1) {
                    this.f30165l = Typeface.SANS_SERIF;
                    return;
                } else if (iJ2 == 2) {
                    this.f30165l = Typeface.SERIF;
                    return;
                } else {
                    if (iJ2 != 3) {
                        return;
                    }
                    this.f30165l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f30165l = null;
        int i8 = x8.r(j.f22583K2) ? j.f22583K2 : j.f22575I2;
        int i9 = this.f30164k;
        int i10 = this.f30163j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = x8.i(i8, this.f30163j, new a(i9, i10, new WeakReference(this.f30154a)));
                if (typefaceI != null) {
                    if (this.f30164k != -1) {
                        this.f30165l = e.a(Typeface.create(typefaceI, 0), this.f30164k, (this.f30163j & 2) != 0);
                    } else {
                        this.f30165l = typefaceI;
                    }
                }
                this.f30166m = this.f30165l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f30165l != null || (strN = x8.n(i8)) == null) {
            return;
        }
        if (this.f30164k != -1) {
            this.f30165l = e.a(Typeface.create(strN, 0), this.f30164k, (this.f30163j & 2) != 0);
        } else {
            this.f30165l = Typeface.create(strN, this.f30163j);
        }
    }

    public final void a(Drawable drawable, V v8) {
        if (drawable == null || v8 == null) {
            return;
        }
        C2708j.i(drawable, v8, this.f30154a.getDrawableState());
    }

    public void b() {
        if (this.f30155b != null || this.f30156c != null || this.f30157d != null || this.f30158e != null) {
            Drawable[] compoundDrawables = this.f30154a.getCompoundDrawables();
            a(compoundDrawables[0], this.f30155b);
            a(compoundDrawables[1], this.f30156c);
            a(compoundDrawables[2], this.f30157d);
            a(compoundDrawables[3], this.f30158e);
        }
        if (this.f30159f == null && this.f30160g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f30154a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f30159f);
        a(compoundDrawablesRelative[2], this.f30160g);
    }

    public void c() {
        this.f30162i.a();
    }

    public int e() {
        return this.f30162i.f();
    }

    public int f() {
        return this.f30162i.g();
    }

    public int g() {
        return this.f30162i.h();
    }

    public int[] h() {
        return this.f30162i.i();
    }

    public int i() {
        return this.f30162i.j();
    }

    public ColorStateList j() {
        V v8 = this.f30161h;
        if (v8 != null) {
            return v8.f30334a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        V v8 = this.f30161h;
        if (v8 != null) {
            return v8.f30335b;
        }
        return null;
    }

    public boolean l() {
        return this.f30162i.n();
    }

    public void m(AttributeSet attributeSet, int i8) {
        boolean zA;
        boolean z8;
        String strN;
        String strN2;
        int iA;
        float fE;
        Context context = this.f30154a.getContext();
        C2708j c2708jB = C2708j.b();
        X xU = X.u(context, attributeSet, j.f22636Y, i8, 0);
        TextView textView = this.f30154a;
        I.G(textView, textView.getContext(), j.f22636Y, attributeSet, xU.q(), i8, 0);
        int iM = xU.m(j.f22640Z, -1);
        if (xU.r(j.f22655c0)) {
            this.f30155b = d(context, c2708jB, xU.m(j.f22655c0, 0));
        }
        if (xU.r(j.f22645a0)) {
            this.f30156c = d(context, c2708jB, xU.m(j.f22645a0, 0));
        }
        if (xU.r(j.f22660d0)) {
            this.f30157d = d(context, c2708jB, xU.m(j.f22660d0, 0));
        }
        if (xU.r(j.f22650b0)) {
            this.f30158e = d(context, c2708jB, xU.m(j.f22650b0, 0));
        }
        if (xU.r(j.f22665e0)) {
            this.f30159f = d(context, c2708jB, xU.m(j.f22665e0, 0));
        }
        if (xU.r(j.f22670f0)) {
            this.f30160g = d(context, c2708jB, xU.m(j.f22670f0, 0));
        }
        xU.w();
        boolean z9 = this.f30154a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z10 = true;
        if (iM != -1) {
            X xS = X.s(context, iM, j.f22559E2);
            if (z9 || !xS.r(j.f22591M2)) {
                zA = false;
                z8 = false;
            } else {
                zA = xS.a(j.f22591M2, false);
                z8 = true;
            }
            C(context, xS);
            strN = xS.r(j.f22595N2) ? xS.n(j.f22595N2) : null;
            strN2 = xS.r(j.f22587L2) ? xS.n(j.f22587L2) : null;
            xS.w();
        } else {
            zA = false;
            z8 = false;
            strN = null;
            strN2 = null;
        }
        X xU2 = X.u(context, attributeSet, j.f22559E2, i8, 0);
        if (z9 || !xU2.r(j.f22591M2)) {
            z10 = z8;
        } else {
            zA = xU2.a(j.f22591M2, false);
        }
        if (xU2.r(j.f22595N2)) {
            strN = xU2.n(j.f22595N2);
        }
        if (xU2.r(j.f22587L2)) {
            strN2 = xU2.n(j.f22587L2);
        }
        if (xU2.r(j.f22563F2) && xU2.e(j.f22563F2, -1) == 0) {
            this.f30154a.setTextSize(0, 0.0f);
        }
        C(context, xU2);
        xU2.w();
        if (!z9 && z10) {
            s(zA);
        }
        Typeface typeface = this.f30165l;
        if (typeface != null) {
            if (this.f30164k == -1) {
                this.f30154a.setTypeface(typeface, this.f30163j);
            } else {
                this.f30154a.setTypeface(typeface);
            }
        }
        if (strN2 != null) {
            d.d(this.f30154a, strN2);
        }
        if (strN != null) {
            c.b(this.f30154a, c.a(strN));
        }
        this.f30162i.o(attributeSet, i8);
        if (d0.f30371c && this.f30162i.j() != 0) {
            int[] iArrI = this.f30162i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f30154a) != -1.0f) {
                    d.b(this.f30154a, this.f30162i.g(), this.f30162i.f(), this.f30162i.h(), 0);
                } else {
                    d.c(this.f30154a, iArrI, 0);
                }
            }
        }
        X xT = X.t(context, attributeSet, j.f22675g0);
        int iM2 = xT.m(j.f22715o0, -1);
        Drawable drawableC = iM2 != -1 ? c2708jB.c(context, iM2) : null;
        int iM3 = xT.m(j.f22740t0, -1);
        Drawable drawableC2 = iM3 != -1 ? c2708jB.c(context, iM3) : null;
        int iM4 = xT.m(j.f22720p0, -1);
        Drawable drawableC3 = iM4 != -1 ? c2708jB.c(context, iM4) : null;
        int iM5 = xT.m(j.f22705m0, -1);
        Drawable drawableC4 = iM5 != -1 ? c2708jB.c(context, iM5) : null;
        int iM6 = xT.m(j.f22725q0, -1);
        Drawable drawableC5 = iM6 != -1 ? c2708jB.c(context, iM6) : null;
        int iM7 = xT.m(j.f22710n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iM7 != -1 ? c2708jB.c(context, iM7) : null);
        if (xT.r(j.f22730r0)) {
            h.e(this.f30154a, xT.c(j.f22730r0));
        }
        if (xT.r(j.f22735s0)) {
            h.f(this.f30154a, H.c(xT.j(j.f22735s0, -1), null));
        }
        int iE = xT.e(j.f22750v0, -1);
        int iE2 = xT.e(j.f22755w0, -1);
        if (xT.r(j.f22760x0)) {
            TypedValue typedValueV = xT.v(j.f22760x0);
            if (typedValueV == null || typedValueV.type != 5) {
                fE = xT.e(j.f22760x0, -1);
                iA = -1;
            } else {
                iA = T1.h.a(typedValueV.data);
                fE = TypedValue.complexToFloat(typedValueV.data);
            }
        } else {
            iA = -1;
            fE = -1.0f;
        }
        xT.w();
        if (iE != -1) {
            h.g(this.f30154a, iE);
        }
        if (iE2 != -1) {
            h.h(this.f30154a, iE2);
        }
        if (fE != -1.0f) {
            if (iA == -1) {
                h.i(this.f30154a, (int) fE);
            } else {
                h.j(this.f30154a, iA, fE);
            }
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f30166m) {
            this.f30165l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f30163j));
                } else {
                    textView.setTypeface(typeface, this.f30163j);
                }
            }
        }
    }

    public void o(boolean z8, int i8, int i9, int i10, int i11) {
        if (d0.f30371c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i8) {
        String strN;
        X xS = X.s(context, i8, j.f22559E2);
        if (xS.r(j.f22591M2)) {
            s(xS.a(j.f22591M2, false));
        }
        if (xS.r(j.f22563F2) && xS.e(j.f22563F2, -1) == 0) {
            this.f30154a.setTextSize(0, 0.0f);
        }
        C(context, xS);
        if (xS.r(j.f22587L2) && (strN = xS.n(j.f22587L2)) != null) {
            d.d(this.f30154a, strN);
        }
        xS.w();
        Typeface typeface = this.f30165l;
        if (typeface != null) {
            this.f30154a.setTypeface(typeface, this.f30163j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        Z1.a.e(editorInfo, textView.getText());
    }

    public void s(boolean z8) {
        this.f30154a.setAllCaps(z8);
    }

    public void t(int i8, int i9, int i10, int i11) {
        this.f30162i.p(i8, i9, i10, i11);
    }

    public void u(int[] iArr, int i8) {
        this.f30162i.q(iArr, i8);
    }

    public void v(int i8) {
        this.f30162i.r(i8);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f30161h == null) {
            this.f30161h = new V();
        }
        V v8 = this.f30161h;
        v8.f30334a = colorStateList;
        v8.f30337d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f30161h == null) {
            this.f30161h = new V();
        }
        V v8 = this.f30161h;
        v8.f30335b = mode;
        v8.f30336c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f30154a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f30154a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f30154a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f30154a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f30154a.getCompoundDrawables();
        TextView textView2 = this.f30154a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        V v8 = this.f30161h;
        this.f30155b = v8;
        this.f30156c = v8;
        this.f30157d = v8;
        this.f30158e = v8;
        this.f30159f = v8;
        this.f30160g = v8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends K1.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f30169c;

        public a(int i8, int i9, WeakReference weakReference) {
            this.f30167a = i8;
            this.f30168b = i9;
            this.f30169c = weakReference;
        }

        @Override // K1.h.e
        public void g(Typeface typeface) {
            int i8 = this.f30167a;
            if (i8 != -1) {
                typeface = e.a(typeface, i8, (this.f30168b & 2) != 0);
            }
            B.this.n(this.f30169c, typeface);
        }

        @Override // K1.h.e
        public void f(int i8) {
        }
    }
}
