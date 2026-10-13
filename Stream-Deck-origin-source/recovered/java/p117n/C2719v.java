package p117n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p054g.a;

/* JADX INFO: renamed from: n.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2719v extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2717t f30439a;

    public C2719v(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        Bitmap bitmapB = this.f30439a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i8, 0), getMeasuredHeight());
        }
    }

    public C2719v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22364J);
    }

    public C2719v(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        T.a(this, getContext());
        C2717t c2717t = new C2717t(this);
        this.f30439a = c2717t;
        c2717t.c(attributeSet, i8);
    }
}
