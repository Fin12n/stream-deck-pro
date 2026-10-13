package io.sentry.android.replay.util;

import C6.o;
import C6.v;
import D6.C0937q;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import io.sentry.J2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static final void a(View view, ViewTreeObserver.OnDrawListener listener) {
        t.g(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int b(TextView textView) {
        t.g(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List c(m mVar, Rect globalRect, int i8, int i9) {
        t.g(globalRect, "globalRect");
        if (mVar == null) {
            return C0937q.e(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int iE = mVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            int iF = (int) mVar.f(i10, mVar.d(i10));
            int i11 = mVar.i(i10);
            int iH = mVar.h(i10);
            int iF2 = (int) mVar.f(i10, (iH - i11) + (i11 > 0 ? 1 : 0));
            if (iF2 == 0 && iH > 0) {
                iF2 = ((int) mVar.f(i10, iH - 1)) + 1;
            }
            int iA = mVar.a(i10);
            int iB = mVar.b(i10);
            Rect rect = new Rect();
            int i12 = globalRect.left + i8 + iF;
            rect.left = i12;
            rect.right = i12 + (iF2 - iF);
            int i13 = globalRect.top + i9 + iA;
            rect.top = i13;
            rect.bottom = i13 + (iB - iA);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean d(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final o e(View view) {
        t.g(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return v.a(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return v.a(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return v.a(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return v.a(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void f(View view, ViewTreeObserver.OnDrawListener listener) {
        t.g(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int g(int i8) {
        return i8 | (-16777216);
    }

    public static final void h(View view, io.sentry.android.replay.viewhierarchy.b parentNode, J2 options) {
        t.g(view, "<this>");
        t.g(parentNode, "parentNode");
        t.g(options, "options");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f26924a.b(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f26927m.a(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(bVarA);
                    h(childAt, bVarA, options);
                }
            }
            parentNode.f(arrayList);
        }
    }
}
