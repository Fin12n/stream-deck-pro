package p084j2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f28157a;

    public h(TransformationMethod transformationMethod) {
        this.f28157a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f28157a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f28157a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || c.c().g() != 1) ? charSequence : c.c().r(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z8, int i8, Rect rect) {
        TransformationMethod transformationMethod = this.f28157a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z8, i8, rect);
        }
    }
}
