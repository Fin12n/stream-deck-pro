package androidx.emoji2.text;

import L1.i;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b implements c.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f15105b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f15106a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f15106a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f15105b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.e
    public boolean a(CharSequence charSequence, int i8, int i9, int i10) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i8 < i9) {
            sbB.append(charSequence.charAt(i8));
            i8++;
        }
        return i.a(this.f15106a, sbB.toString());
    }
}
