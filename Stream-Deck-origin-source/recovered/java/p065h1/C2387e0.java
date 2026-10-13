package p065h1;

import L0.l;
import R0.F;
import R0.InterfaceC1586f0;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.h;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: h1.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2387e0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24280a;

    public C2387e0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(l.f4862J, Boolean.TRUE);
    }

    public final void a(InterfaceC1586f0 interfaceC1586f0, View view, long j8) {
        super.drawChild(F.d(interfaceC1586f0), view, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            t.e(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((h) childAt).u()) {
                this.f24280a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f24280a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f24280a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }
}
