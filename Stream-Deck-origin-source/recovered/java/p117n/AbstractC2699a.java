package p117n;

import U1.I;
import U1.S;
import U1.T;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import p054g.j;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2699a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0653a f30344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f30346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f30347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S f30349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30351h;

    /* JADX INFO: renamed from: n.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0653a implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30352a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30353b;

        public C0653a() {
        }

        @Override // U1.T
        public void a(View view) {
            this.f30352a = true;
        }

        @Override // U1.T
        public void b(View view) {
            if (this.f30352a) {
                return;
            }
            AbstractC2699a abstractC2699a = AbstractC2699a.this;
            abstractC2699a.f30349f = null;
            AbstractC2699a.super.setVisibility(this.f30353b);
        }

        @Override // U1.T
        public void c(View view) {
            AbstractC2699a.super.setVisibility(0);
            this.f30352a = false;
        }

        public C0653a d(S s8, int i8) {
            AbstractC2699a.this.f30349f = s8;
            this.f30353b = i8;
            return this;
        }
    }

    public AbstractC2699a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f30344a = new C0653a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p054g.a.f22371a, typedValue, true) || typedValue.resourceId == 0) {
            this.f30345b = context;
        } else {
            this.f30345b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i8, int i9, boolean z8) {
        return z8 ? i8 - i9 : i8 + i9;
    }

    public int c(View view, int i8, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i9);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - i10);
    }

    public int e(View view, int i8, int i9, int i10, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i9 + ((i10 - measuredHeight) / 2);
        if (z8) {
            view.layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
        } else {
            view.layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
        }
        return z8 ? -measuredWidth : measuredWidth;
    }

    public S f(int i8, long j8) {
        S s8 = this.f30349f;
        if (s8 != null) {
            s8.c();
        }
        if (i8 != 0) {
            S sB = I.c(this).b(0.0f);
            sB.e(j8);
            sB.g(this.f30344a.d(sB, i8));
            return sB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        S sB2 = I.c(this).b(1.0f);
        sB2.e(j8);
        sB2.g(this.f30344a.d(sB2, i8));
        return sB2;
    }

    public int getAnimatedVisibility() {
        return this.f30349f != null ? this.f30344a.f30353b : getVisibility();
    }

    public int getContentHeight() {
        return this.f30348e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, j.f22644a, p054g.a.f22373c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(j.f22689j, 0));
        typedArrayObtainStyledAttributes.recycle();
        a aVar = this.f30347d;
        if (aVar != null) {
            aVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f30351h = false;
        }
        if (!this.f30351h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f30351h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f30351h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f30350g = false;
        }
        if (!this.f30350g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f30350g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f30350g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i8);

    @Override // android.view.View
    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            S s8 = this.f30349f;
            if (s8 != null) {
                s8.c();
            }
            super.setVisibility(i8);
        }
    }
}
