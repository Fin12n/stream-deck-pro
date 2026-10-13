package p117n;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p054g.j;

/* JADX INFO: renamed from: n.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2723z extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f30447i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f30450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f30451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f30453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f30455h;

    /* JADX INFO: renamed from: n.z$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends K {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f30456j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.f30456j = fVar;
        }

        @Override // p117n.K
        public p108m.f b() {
            return this.f30456j;
        }

        @Override // p117n.K
        public boolean c() {
            if (C2723z.this.getInternalPopup().a()) {
                return true;
            }
            C2723z.this.b();
            return true;
        }
    }

    /* JADX INFO: renamed from: n.z$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C2723z.this.getInternalPopup().a()) {
                C2723z.this.b();
            }
            ViewTreeObserver viewTreeObserver = C2723z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: n.z$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (T1.d.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: n.z$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.a f30459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f30460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f30461c;

        public d() {
        }

        @Override // p117n.C2723z.h
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f30459a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // p117n.C2723z.h
        public int c() {
            return 0;
        }

        @Override // p117n.C2723z.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f30459a;
            if (aVar != null) {
                aVar.dismiss();
                this.f30459a = null;
            }
        }

        @Override // p117n.C2723z.h
        public void e(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p117n.C2723z.h
        public CharSequence f() {
            return this.f30461c;
        }

        @Override // p117n.C2723z.h
        public Drawable h() {
            return null;
        }

        @Override // p117n.C2723z.h
        public void i(CharSequence charSequence) {
            this.f30461c = charSequence;
        }

        @Override // p117n.C2723z.h
        public void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p117n.C2723z.h
        public void l(int i8) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p117n.C2723z.h
        public void m(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // p117n.C2723z.h
        public void n(int i8, int i9) {
            if (this.f30460b == null) {
                return;
            }
            androidx.appcompat.app.a.C0340a c0340a = new androidx.appcompat.app.a.C0340a(C2723z.this.getPopupContext());
            CharSequence charSequence = this.f30461c;
            if (charSequence != null) {
                c0340a.h(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0340a.g(this.f30460b, C2723z.this.getSelectedItemPosition(), this).a();
            this.f30459a = aVarA;
            ListView listViewM = aVarA.m();
            listViewM.setTextDirection(i8);
            listViewM.setTextAlignment(i9);
            this.f30459a.show();
        }

        @Override // p117n.C2723z.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i8) {
            C2723z.this.setSelection(i8);
            if (C2723z.this.getOnItemClickListener() != null) {
                C2723z.this.performItemClick(null, i8, this.f30460b.getItemId(i8));
            }
            dismiss();
        }

        @Override // p117n.C2723z.h
        public void p(ListAdapter listAdapter) {
            this.f30460b = listAdapter;
        }
    }

    /* JADX INFO: renamed from: n.z$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f30463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f30464b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f30463a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f30464b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f30464b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i8);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i8);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i8) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            return getDropDownView(i8, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i8) {
            ListAdapter listAdapter = this.f30464b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i8);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f30463a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: n.z$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f extends L implements h {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public CharSequence f30465I;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public ListAdapter f30466V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public final Rect f30467W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f30468X;

        /* JADX INFO: renamed from: n.z$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2723z f30470a;

            public a(C2723z c2723z) {
                this.f30470a = c2723z;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                C2723z.this.setSelection(i8);
                if (C2723z.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C2723z.this.performItemClick(view, i8, fVar.f30466V.getItemId(i8));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: n.z$f$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.Q(C2723z.this)) {
                    f.this.dismiss();
                } else {
                    f.this.O();
                    f.super.b();
                }
            }
        }

        /* JADX INFO: renamed from: n.z$f$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f30473a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f30473a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C2723z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f30473a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f30467W = new Rect();
            z(C2723z.this);
            F(true);
            K(0);
            H(new a(C2723z.this));
        }

        public void O() {
            int i8;
            Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(C2723z.this.f30455h);
                i8 = d0.b(C2723z.this) ? C2723z.this.f30455h.right : -C2723z.this.f30455h.left;
            } else {
                Rect rect = C2723z.this.f30455h;
                rect.right = 0;
                rect.left = 0;
                i8 = 0;
            }
            int paddingLeft = C2723z.this.getPaddingLeft();
            int paddingRight = C2723z.this.getPaddingRight();
            int width = C2723z.this.getWidth();
            C2723z c2723z = C2723z.this;
            int i9 = c2723z.f30454g;
            if (i9 == -2) {
                int iA = c2723z.a((SpinnerAdapter) this.f30466V, h());
                int i10 = C2723z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C2723z.this.f30455h;
                int i11 = (i10 - rect2.left) - rect2.right;
                if (iA > i11) {
                    iA = i11;
                }
                B(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i9 == -1) {
                B((width - paddingLeft) - paddingRight);
            } else {
                B(i9);
            }
            e(d0.b(C2723z.this) ? i8 + (((width - paddingRight) - v()) - P()) : i8 + paddingLeft + P());
        }

        public int P() {
            return this.f30468X;
        }

        public boolean Q(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f30467W);
        }

        @Override // p117n.C2723z.h
        public CharSequence f() {
            return this.f30465I;
        }

        @Override // p117n.C2723z.h
        public void i(CharSequence charSequence) {
            this.f30465I = charSequence;
        }

        @Override // p117n.C2723z.h
        public void m(int i8) {
            this.f30468X = i8;
        }

        @Override // p117n.C2723z.h
        public void n(int i8, int i9) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            O();
            E(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            listViewJ.setTextDirection(i8);
            listViewJ.setTextAlignment(i9);
            L(C2723z.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = C2723z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // p117n.L, p117n.C2723z.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f30466V = listAdapter;
        }
    }

    /* JADX INFO: renamed from: n.z$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30475a;

        /* JADX INFO: renamed from: n.z$g$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.f30475a ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f30475a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: n.z$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface h {
        boolean a();

        int c();

        void dismiss();

        void e(int i8);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i8);

        void m(int i8);

        void n(int i8, int i9);

        int o();

        void p(ListAdapter listAdapter);
    }

    public C2723z(Context context) {
        this(context, (AttributeSet) null);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f30455h);
        Rect rect = this.f30455h;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f30453f.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            c2702d.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f30453f;
        return hVar != null ? hVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f30453f;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f30453f != null ? this.f30454g : super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f30453f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f30453f;
        return hVar != null ? hVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f30449b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f30453f;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f30453f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f30453f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f30453f == null || View.MeasureSpec.getMode(i8) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f30475a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f30453f;
        gVar.f30475a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        K k8 = this.f30450c;
        if (k8 == null || !k8.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f30453f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i8) {
        h hVar = this.f30453f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i8);
        } else {
            hVar.m(i8);
            this.f30453f.e(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i8) {
        h hVar = this.f30453f;
        if (hVar != null) {
            hVar.l(i8);
        } else {
            super.setDropDownVerticalOffset(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i8) {
        if (this.f30453f != null) {
            this.f30454g = i8;
        } else {
            super.setDropDownWidth(i8);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f30453f;
        if (hVar != null) {
            hVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i8) {
        setPopupBackgroundDrawable(p072i.a.b(getPopupContext(), i8));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f30453f;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30448a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public C2723z(Context context, int i8) {
        this(context, null, p054g.a.f22367M, i8);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f30452e) {
            this.f30451d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f30453f != null) {
            Context context = this.f30449b;
            if (context == null) {
                context = getContext();
            }
            this.f30453f.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C2723z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22367M);
    }

    public C2723z(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, -1);
    }

    public C2723z(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(context, attributeSet, i8, i9, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, n.z] */
    public C2723z(Context context, AttributeSet attributeSet, int i8, int i9, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrP;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i8);
        this.f30455h = new Rect();
        T.a(this, getContext());
        X xU = X.u(context, attributeSet, j.f22762x2, i8, 0);
        this.f30448a = new C2702d(this);
        if (theme != null) {
            this.f30449b = new p099l.d(context, theme);
        } else {
            int iM = xU.m(j.f22550C2, 0);
            if (iM != 0) {
                this.f30449b = new p099l.d(context, iM);
            } else {
                this.f30449b = context;
            }
        }
        ?? r11 = -1;
        ?? r8 = 0;
        try {
            if (i9 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30447i, i8, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i9 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i9 != 0) {
                            d dVar = new d();
                            this.f30453f = dVar;
                            dVar.i(xU.n(j.f22540A2));
                        } else if (i9 == 1) {
                            f fVar = new f(this.f30449b, attributeSet, i8);
                            X xU2 = X.u(this.f30449b, attributeSet, j.f22762x2, i8, 0);
                            this.f30454g = xU2.l(j.f22545B2, -2);
                            fVar.k(xU2.f(j.f22772z2));
                            fVar.i(xU.n(j.f22540A2));
                            xU2.w();
                            this.f30453f = fVar;
                            this.f30450c = new a(this, fVar);
                        }
                        charSequenceArrP = xU.p(j.f22767y2);
                        if (charSequenceArrP != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                            arrayAdapter.setDropDownViewResource(p054g.g.f22521s);
                            setAdapter(arrayAdapter);
                        }
                        xU.w();
                        this.f30452e = true;
                        spinnerAdapter = this.f30451d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f30451d = null;
                        }
                        this.f30448a.e(attributeSet, i8);
                    }
                } catch (Exception e9) {
                    e = e9;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r8 != 0) {
                        r8.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i9 != 0) {
                d dVar2 = new d();
                this.f30453f = dVar2;
                dVar2.i(xU.n(j.f22540A2));
            } else if (i9 == 1) {
                f fVar2 = new f(this.f30449b, attributeSet, i8);
                X xU3 = X.u(this.f30449b, attributeSet, j.f22762x2, i8, 0);
                this.f30454g = xU3.l(j.f22545B2, -2);
                fVar2.k(xU3.f(j.f22772z2));
                fVar2.i(xU.n(j.f22540A2));
                xU3.w();
                this.f30453f = fVar2;
                this.f30450c = new a(this, fVar2);
            }
            charSequenceArrP = xU.p(j.f22767y2);
            if (charSequenceArrP != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                arrayAdapter2.setDropDownViewResource(p054g.g.f22521s);
                setAdapter(arrayAdapter2);
            }
            xU.w();
            this.f30452e = true;
            spinnerAdapter = this.f30451d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f30451d = null;
            }
            this.f30448a.e(attributeSet, i8);
        } catch (Throwable th2) {
            th = th2;
            r8 = r11;
        }
    }
}
