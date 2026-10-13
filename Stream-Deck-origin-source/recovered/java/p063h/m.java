package p063h;

import M6.eLZq.eGwOBWCdOTaKus;
import U1.I;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b0.C;
import p054g.j;
import p099l.d;
import p117n.C2701c;
import p117n.C2703e;
import p117n.C2704f;
import p117n.C2705g;
import p117n.C2709k;
import p117n.C2713o;
import p117n.C2715q;
import p117n.C2718u;
import p117n.C2719v;
import p117n.C2721x;
import p117n.C2723z;
import p117n.E;
import p117n.U;
import p117n.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f24004b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f24005c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f24006d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f24007e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f24008f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f24009g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C f24010h = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f24011a = new Object[2];

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f24012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f24014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f24015d;

        public a(View view, String str) {
            this.f24012a = view;
            this.f24013b = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f24013b, View.class)) != null) {
                        this.f24014c = method;
                        this.f24015d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f24012a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f24012a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f24013b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f24012a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f24014c == null) {
                a(this.f24012a.getContext());
            }
            try {
                this.f24014c.invoke(this.f24015d, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("Could not execute method for android:onClick", e9);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z8, boolean z9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22738s3, 0, 0);
        int resourceId = z8 ? typedArrayObtainStyledAttributes.getResourceId(j.f22743t3, 0) : 0;
        if (z9 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(j.f22748u3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof d) && ((d) context).c() == resourceId)) ? context : new d(context, resourceId);
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24006d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            I.J(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f24007e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            I.K(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f24008f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            I.S(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24005c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C2701c c(Context context, AttributeSet attributeSet) {
        return new C2701c(context, attributeSet);
    }

    public C2703e d(Context context, AttributeSet attributeSet) {
        return new C2703e(context, attributeSet);
    }

    public C2704f e(Context context, AttributeSet attributeSet) {
        return new C2704f(context, attributeSet);
    }

    public C2705g f(Context context, AttributeSet attributeSet) {
        return new C2705g(context, attributeSet);
    }

    public C2709k g(Context context, AttributeSet attributeSet) {
        return new C2709k(context, attributeSet);
    }

    public C2713o h(Context context, AttributeSet attributeSet) {
        return new C2713o(context, attributeSet);
    }

    public C2715q i(Context context, AttributeSet attributeSet) {
        return new C2715q(context, attributeSet);
    }

    public r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public C2718u k(Context context, AttributeSet attributeSet) {
        return new C2718u(context, attributeSet);
    }

    public C2719v l(Context context, AttributeSet attributeSet) {
        return new C2719v(context, attributeSet);
    }

    public C2721x m(Context context, AttributeSet attributeSet) {
        return new C2721x(context, attributeSet);
    }

    public C2723z n(Context context, AttributeSet attributeSet) {
        return new C2723z(context, attributeSet);
    }

    public p117n.C o(Context context, AttributeSet attributeSet) {
        return new p117n.C(context, attributeSet);
    }

    public E p(Context context, AttributeSet attributeSet) {
        return new E(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        C c8 = f24010h;
        Constructor constructor = (Constructor) c8.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f24004b);
            c8.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f24011a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f24011a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i8 = 0;
            while (true) {
                String[] strArr = f24009g;
                if (i8 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i8]);
                if (viewS != null) {
                    return viewS;
                }
                i8++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f24011a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z8, boolean z9, boolean z10, boolean z11) {
        View viewL;
        Context context2 = (!z8 || view == null) ? context : view.getContext();
        if (z9 || z10) {
            context2 = u(context2, attributeSet, z9, z10);
        }
        if (z11) {
            context2 = U.b(context2);
        }
        str.getClass();
        byte b8 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b8 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b8 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b8 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b8 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b8 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b8 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b8 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b8 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b8 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b8 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b8 = 10;
                }
                break;
            case 1601505219:
                if (str.equals(eGwOBWCdOTaKus.gZpsVk)) {
                    b8 = 11;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b8 = 12;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b8 = 13;
                }
                break;
        }
        switch (b8) {
            case 0:
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case 1:
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case 2:
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case 3:
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case 4:
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case 5:
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case 6:
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case 7:
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case 8:
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case 9:
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case 10:
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case 11:
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case 12:
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
