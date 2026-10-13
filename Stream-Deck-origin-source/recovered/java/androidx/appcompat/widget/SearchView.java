package androidx.appcompat.widget;

import U1.I;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p117n.C2701c;
import p117n.S;
import p117n.X;
import p117n.b0;
import p117n.d0;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements p099l.c {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final o f13860z0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f13861A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int[] f13862B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f13863C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f13864D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Drawable f13865E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f13866F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f13867G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Intent f13868H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Intent f13869I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final CharSequence f13870V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View.OnFocusChangeListener f13871W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public View.OnClickListener f13872a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13873b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f13874c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public p012b2.a f13875d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f13876e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f13877f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13878g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f13879h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f13880i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f13881j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CharSequence f13882k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public CharSequence f13883l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f13884m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f13885n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SearchableInfo f13886o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f13887p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Bundle f13888p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f13889q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Runnable f13890q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f13891r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Runnable f13892r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f13893s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final WeakHashMap f13894s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f13895t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final View.OnClickListener f13896t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f13897u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View.OnKeyListener f13898u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f13899v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f13900v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f13901w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f13902w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f13903x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f13904x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f13905y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public TextWatcher f13906y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f13907z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class SearchAutoComplete extends C2701c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f13909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f13910g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f13911h;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i8 >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f13860z0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f13910g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f13910g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f13908e <= 0 || super.enoughToFilter();
        }

        @Override // p117n.C2701c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f13910g) {
                removeCallbacks(this.f13911h);
                post(this.f13911h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z8, int i8, Rect rect) {
            super.onFocusChanged(z8, i8, rect);
            this.f13909f.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f13909f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z8) {
            super.onWindowFocusChanged(z8);
            if (z8 && this.f13909f.hasFocus() && getVisibility() == 0) {
                this.f13910g = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        public void setImeVisibility(boolean z8) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z8) {
                this.f13910g = false;
                removeCallbacks(this.f13911h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f13910g = true;
                    return;
                }
                this.f13910g = false;
                removeCallbacks(this.f13911h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f13909f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f13908e = i8;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p054g.a.f22387q);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f13911h = new a();
            this.f13908e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p012b2.a aVar = SearchView.this.f13875d0;
            if (aVar instanceof S) {
                aVar.a(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z8) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f13871W;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            SearchView.this.x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f13895t) {
                searchView.R();
                return;
            }
            if (view == searchView.f13899v) {
                searchView.N();
                return;
            }
            if (view == searchView.f13897u) {
                searchView.S();
            } else if (view == searchView.f13901w) {
                searchView.W();
            } else if (view == searchView.f13887p) {
                searchView.D();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f13886o0 == null) {
                return false;
            }
            if (searchView.f13887p.isPopupShowing() && SearchView.this.f13887p.getListSelection() != -1) {
                return SearchView.this.T(view, i8, keyEvent);
            }
            if (SearchView.this.f13887p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f13887p.getText().toString());
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
            SearchView.this.O(i8, 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i8) {
            searchAutoComplete.setInputMethodMode(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface l {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface m {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface n {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f13923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f13924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f13925c;

        public o() {
            this.f13923a = null;
            this.f13924b = null;
            this.f13925c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f13923a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f13924b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f13925c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13924b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13923a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f13925c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class p extends p030d2.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13926c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i8) {
                return new p[i8];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13926c + "}";
        }

        @Override // p030d2.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Boolean.valueOf(this.f13926c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13926c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f13927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f13928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f13929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f13930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f13931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13932f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f13931e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f13928b = new Rect();
            this.f13930d = new Rect();
            this.f13929c = new Rect();
            a(rect, rect2);
            this.f13927a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f13928b.set(rect);
            this.f13930d.set(rect);
            Rect rect3 = this.f13930d;
            int i8 = this.f13931e;
            rect3.inset(-i8, -i8);
            this.f13929c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z8;
            boolean z9;
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z10 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z9 = this.f13932f;
                    if (z9 && !this.f13930d.contains(x8, y8)) {
                        z10 = z9;
                        z8 = false;
                    }
                } else if (action != 3) {
                    z8 = true;
                    z10 = false;
                } else {
                    z9 = this.f13932f;
                    this.f13932f = false;
                }
                z10 = z9;
                z8 = true;
            } else if (this.f13928b.contains(x8, y8)) {
                this.f13932f = true;
                z8 = true;
            } else {
                z8 = true;
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (!z8 || this.f13929c.contains(x8, y8)) {
                Rect rect = this.f13929c;
                motionEvent.setLocation(x8 - rect.left, y8 - rect.top);
            } else {
                motionEvent.setLocation(this.f13927a.getWidth() / 2, this.f13927a.getHeight() / 2);
            }
            return this.f13927a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f13860z0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p054g.d.f22412g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p054g.d.f22413h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f13887p.setText(charSequence);
        this.f13887p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void C() {
        this.f13887p.dismissDropDown();
    }

    public void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f13887p);
            return;
        }
        o oVar = f13860z0;
        oVar.b(this.f13887p);
        oVar.a(this.f13887p);
    }

    public final void E(View view, Rect rect) {
        view.getLocationInWindow(this.f13862B);
        getLocationInWindow(this.f13863C);
        int[] iArr = this.f13862B;
        int i8 = iArr[1];
        int[] iArr2 = this.f13863C;
        int i9 = i8 - iArr2[1];
        int i10 = iArr[0] - iArr2[0];
        rect.set(i10, i9, view.getWidth() + i10, view.getHeight() + i9);
    }

    public final CharSequence F(CharSequence charSequence) {
        if (!this.f13873b0 || this.f13865E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f13887p.getTextSize()) * 1.25d);
        this.f13865E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f13865E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean G() {
        Intent intent;
        SearchableInfo searchableInfo = this.f13886o0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f13886o0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f13868H;
            } else {
                intent = this.f13886o0.getVoiceSearchLaunchRecognizer() ? this.f13869I : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        return this.f13874c0;
    }

    public final boolean J() {
        return (this.f13876e0 || this.f13881j0) && !H();
    }

    public final void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    public void L(int i8, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i8, str));
    }

    public final boolean M(int i8, int i9, String str) {
        Cursor cursorB = this.f13875d0.b();
        if (cursorB == null || !cursorB.moveToPosition(i8)) {
            return false;
        }
        K(z(cursorB, i9, str));
        return true;
    }

    public void N() {
        if (!TextUtils.isEmpty(this.f13887p.getText())) {
            this.f13887p.setText("");
            this.f13887p.requestFocus();
            this.f13887p.setImeVisibility(true);
        } else if (this.f13873b0) {
            clearFocus();
            g0(true);
        }
    }

    public boolean O(int i8, int i9, String str) {
        M(i8, 0, null);
        this.f13887p.setImeVisibility(false);
        C();
        return true;
    }

    public boolean P(int i8) {
        Y(i8);
        return true;
    }

    public void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void R() {
        g0(false);
        this.f13887p.requestFocus();
        this.f13887p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f13872a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void S() {
        Editable text = this.f13887p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f13886o0 != null) {
            L(0, null, text.toString());
        }
        this.f13887p.setImeVisibility(false);
        C();
    }

    public boolean T(View view, int i8, KeyEvent keyEvent) {
        if (this.f13886o0 != null && this.f13875d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i8 == 66 || i8 == 84 || i8 == 61) {
                return O(this.f13887p.getListSelection(), 0, null);
            }
            if (i8 == 21 || i8 == 22) {
                this.f13887p.setSelection(i8 == 21 ? 0 : this.f13887p.length());
                this.f13887p.setListSelection(0);
                this.f13887p.clearListSelection();
                this.f13887p.b();
                return true;
            }
            if (i8 == 19) {
                this.f13887p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void U(CharSequence charSequence) {
        Editable text = this.f13887p.getText();
        this.f13883l0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        f0(!zIsEmpty);
        h0(zIsEmpty);
        a0();
        e0();
        this.f13882k0 = charSequence.toString();
    }

    public void V() {
        g0(H());
        X();
        if (this.f13887p.hasFocus()) {
            D();
        }
    }

    public void W() {
        SearchableInfo searchableInfo = this.f13886o0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(B(this.f13868H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(A(this.f13869I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void X() {
        post(this.f13890q0);
    }

    public final void Y(int i8) {
        Editable text = this.f13887p.getText();
        Cursor cursorB = this.f13875d0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i8)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f13875d0.convertToString(cursorB);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    public void Z(CharSequence charSequence, boolean z8) {
        this.f13887p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f13887p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f13883l0 = charSequence;
        }
        if (!z8 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    public final void a0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f13887p.getText());
        this.f13899v.setVisibility(!zIsEmpty || (this.f13873b0 && !this.f13884m0) ? 0 : 8);
        Drawable drawable = this.f13899v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void b0() {
        int[] iArr = this.f13887p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f13891r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f13893s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f13887p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f13879h0 = true;
        super.clearFocus();
        this.f13887p.clearFocus();
        this.f13887p.setImeVisibility(false);
        this.f13879h0 = false;
    }

    public final void d0() {
        this.f13887p.setThreshold(this.f13886o0.getSuggestThreshold());
        this.f13887p.setImeOptions(this.f13886o0.getImeOptions());
        int inputType = this.f13886o0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f13886o0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f13887p.setInputType(inputType);
        p012b2.a aVar = this.f13875d0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f13886o0.getSuggestAuthority() != null) {
            S s8 = new S(getContext(), this, this.f13886o0, this.f13894s0);
            this.f13875d0 = s8;
            this.f13887p.setAdapter(s8);
            ((S) this.f13875d0).w(this.f13878g0 ? 2 : 1);
        }
    }

    public final void e0() {
        this.f13893s.setVisibility((J() && (this.f13897u.getVisibility() == 0 || this.f13901w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void f0(boolean z8) {
        this.f13897u.setVisibility((this.f13876e0 && J() && hasFocus() && (z8 || !this.f13881j0)) ? 0 : 8);
    }

    public final void g0(boolean z8) {
        this.f13874c0 = z8;
        int i8 = 8;
        int i9 = z8 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f13887p.getText());
        this.f13895t.setVisibility(i9);
        f0(!zIsEmpty);
        this.f13889q.setVisibility(z8 ? 8 : 0);
        if (this.f13864D.getDrawable() != null && !this.f13873b0) {
            i8 = 0;
        }
        this.f13864D.setVisibility(i8);
        a0();
        h0(zIsEmpty);
        e0();
    }

    public int getImeOptions() {
        return this.f13887p.getImeOptions();
    }

    public int getInputType() {
        return this.f13887p.getInputType();
    }

    public int getMaxWidth() {
        return this.f13880i0;
    }

    public CharSequence getQuery() {
        return this.f13887p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f13877f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f13886o0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f13870V : getContext().getText(this.f13886o0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f13867G;
    }

    public int getSuggestionRowLayout() {
        return this.f13866F;
    }

    public p012b2.a getSuggestionsAdapter() {
        return this.f13875d0;
    }

    public final void h0(boolean z8) {
        int i8 = 8;
        if (this.f13881j0 && !H() && z8) {
            this.f13897u.setVisibility(8);
            i8 = 0;
        }
        this.f13901w.setVisibility(i8);
    }

    @Override // p099l.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f13887p.setImeOptions(this.f13885n0);
        this.f13884m0 = false;
    }

    @Override // p099l.c
    public void onActionViewExpanded() {
        if (this.f13884m0) {
            return;
        }
        this.f13884m0 = true;
        int imeOptions = this.f13887p.getImeOptions();
        this.f13885n0 = imeOptions;
        this.f13887p.setImeOptions(imeOptions | 33554432);
        this.f13887p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f13890q0);
        post(this.f13892r0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8) {
            E(this.f13887p, this.f13907z);
            Rect rect = this.f13861A;
            Rect rect2 = this.f13907z;
            rect.set(rect2.left, 0, rect2.right, i11 - i9);
            q qVar = this.f13905y;
            if (qVar != null) {
                qVar.a(this.f13861A, this.f13907z);
                return;
            }
            q qVar2 = new q(this.f13861A, this.f13907z, this.f13887p);
            this.f13905y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        if (H()) {
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            int i11 = this.f13880i0;
            size = i11 > 0 ? Math.min(i11, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f13880i0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i10 = this.f13880i0) > 0) {
            size = Math.min(i10, size);
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        g0(pVar.f13926c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f13926c = H();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i8, Rect rect) {
        if (this.f13879h0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i8, rect);
        }
        boolean zRequestFocus = this.f13887p.requestFocus(i8, rect);
        if (zRequestFocus) {
            g0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f13888p0 = bundle;
    }

    public void setIconified(boolean z8) {
        if (z8) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z8) {
        if (this.f13873b0 == z8) {
            return;
        }
        this.f13873b0 = z8;
        g0(z8);
        c0();
    }

    public void setImeOptions(int i8) {
        this.f13887p.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.f13887p.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.f13880i0 = i8;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f13871W = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f13872a0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f13877f0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z8) {
        this.f13878g0 = z8;
        p012b2.a aVar = this.f13875d0;
        if (aVar instanceof S) {
            ((S) aVar).w(z8 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f13886o0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean zG = G();
        this.f13881j0 = zG;
        if (zG) {
            this.f13887p.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z8) {
        this.f13876e0 = z8;
        g0(H());
    }

    public void setSuggestionsAdapter(p012b2.a aVar) {
        this.f13875d0 = aVar;
        this.f13887p.setAdapter(aVar);
    }

    public void x() {
        if (this.f13903x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f13891r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = d0.b(this);
            int dimensionPixelSize = this.f13873b0 ? resources.getDimensionPixelSize(p054g.d.f22410e) + resources.getDimensionPixelSize(p054g.d.f22411f) : 0;
            this.f13887p.getDropDownBackground().getPadding(rect);
            this.f13887p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f13887p.setDropDownWidth((((this.f13903x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent z(Cursor cursor, int i8, String str) {
        int position;
        String strN;
        try {
            String strN2 = S.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f13886o0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = S.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f13886o0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = S.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return y(str2, strN3 == null ? null : Uri.parse(strN3), S.n(cursor, "suggest_intent_extra_data"), S.n(cursor, "suggest_intent_query"), i8, str);
        } catch (RuntimeException e8) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e8);
            return null;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22365K);
    }

    public final Intent y(String str, Uri uri, String str2, String str3, int i8, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f13883l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f13888p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i8 != 0) {
            intent.putExtra("action_key", i8);
            intent.putExtra(bGZGhbtQmA.yEB, str4);
        }
        intent.setComponent(this.f13886o0.getSearchActivity());
        return intent;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f13907z = new Rect();
        this.f13861A = new Rect();
        this.f13862B = new int[2];
        this.f13863C = new int[2];
        this.f13890q0 = new b();
        this.f13892r0 = new c();
        this.f13894s0 = new WeakHashMap();
        f fVar = new f();
        this.f13896t0 = fVar;
        this.f13898u0 = new g();
        h hVar = new h();
        this.f13900v0 = hVar;
        i iVar = new i();
        this.f13902w0 = iVar;
        j jVar = new j();
        this.f13904x0 = jVar;
        this.f13906y0 = new a();
        X xU = X.u(context, attributeSet, p054g.j.f22672f2, i8, 0);
        I.G(this, context, p054g.j.f22672f2, attributeSet, xU.q(), i8, 0);
        LayoutInflater.from(context).inflate(xU.m(p054g.j.f22722p2, p054g.g.f22520r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(p054g.f.f22464C);
        this.f13887p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f13889q = findViewById(p054g.f.f22501y);
        View viewFindViewById = findViewById(p054g.f.f22463B);
        this.f13891r = viewFindViewById;
        View viewFindViewById2 = findViewById(p054g.f.f22470I);
        this.f13893s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(p054g.f.f22499w);
        this.f13895t = imageView;
        ImageView imageView2 = (ImageView) findViewById(p054g.f.f22502z);
        this.f13897u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(p054g.f.f22500x);
        this.f13899v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(p054g.f.f22465D);
        this.f13901w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(p054g.f.f22462A);
        this.f13864D = imageView5;
        I.L(viewFindViewById, xU.f(p054g.j.f22727q2));
        I.L(viewFindViewById2, xU.f(p054g.j.f22747u2));
        imageView.setImageDrawable(xU.f(p054g.j.f22742t2));
        imageView2.setImageDrawable(xU.f(p054g.j.f22712n2));
        imageView3.setImageDrawable(xU.f(p054g.j.f22697k2));
        imageView4.setImageDrawable(xU.f(p054g.j.f22757w2));
        imageView5.setImageDrawable(xU.f(p054g.j.f22742t2));
        this.f13865E = xU.f(p054g.j.f22737s2);
        b0.a(imageView, getResources().getString(p054g.h.f22533l));
        this.f13866F = xU.m(p054g.j.f22752v2, p054g.g.f22519q);
        this.f13867G = xU.m(p054g.j.f22702l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f13906y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f13898u0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(xU.a(p054g.j.f22717o2, true));
        int iE = xU.e(p054g.j.f22682h2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.f13870V = xU.o(p054g.j.f22707m2);
        this.f13877f0 = xU.o(p054g.j.f22732r2);
        int iJ = xU.j(p054g.j.f22692j2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = xU.j(p054g.j.f22687i2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(xU.a(p054g.j.f22677g2, true));
        xU.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f13868H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f13869I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f13903x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.f13873b0);
        c0();
    }

    public final Intent A(Intent intent, SearchableInfo searchableInfo) {
        String string;
        String string2;
        String string3;
        int voiceMaxResults;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f13888p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            string = "free_form";
        }
        String strFlattenToShortString = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            string2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            string3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        } else {
            voiceMaxResults = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra(WaYxBuDSBD.daeIiqqmNaJTdO, string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            strFlattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", strFlattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SearchView.this.U(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
            SearchView.this.P(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
