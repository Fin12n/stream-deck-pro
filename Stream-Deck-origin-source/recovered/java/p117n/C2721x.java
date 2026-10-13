package p117n;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p054g.a;

/* JADX INFO: renamed from: n.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2721x extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2722y f30440a;

    public C2721x(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f30440a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f30440a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30440a.g(canvas);
    }

    public C2721x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22366L);
    }

    public C2721x(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        T.a(this, getContext());
        C2722y c2722y = new C2722y(this);
        this.f30440a = c2722y;
        c2722y.c(attributeSet, i8);
    }
}
