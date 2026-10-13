package p117n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p054g.j;
import p084j2.f;

/* JADX INFO: renamed from: n.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2711m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f30413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f30414b;

    public C2711m(TextView textView) {
        this.f30413a = textView;
        this.f30414b = new f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f30414b.a(inputFilterArr);
    }

    public void b(AttributeSet attributeSet, int i8) {
        TypedArray typedArrayObtainStyledAttributes = this.f30413a.getContext().obtainStyledAttributes(attributeSet, j.f22675g0, i8, 0);
        try {
            boolean z8 = typedArrayObtainStyledAttributes.hasValue(j.f22745u0) ? typedArrayObtainStyledAttributes.getBoolean(j.f22745u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z8);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(boolean z8) {
        this.f30414b.b(z8);
    }

    public void d(boolean z8) {
        this.f30414b.c(z8);
    }
}
