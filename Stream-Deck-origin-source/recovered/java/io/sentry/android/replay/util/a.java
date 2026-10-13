package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f26880a;

    public a(Layout layout) {
        t.g(layout, "layout");
        this.f26880a = layout;
    }

    @Override // io.sentry.android.replay.util.m
    public int a(int i8) {
        return this.f26880a.getLineTop(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public int b(int i8) {
        return this.f26880a.getLineBottom(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public int d(int i8) {
        return this.f26880a.getLineStart(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public int e() {
        return this.f26880a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.m
    public float f(int i8, int i9) {
        return this.f26880a.getPrimaryHorizontal(i9);
    }

    @Override // io.sentry.android.replay.util.m
    public Integer g() {
        int i8;
        if (!(this.f26880a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f26880a.getText();
        t.e(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] spans = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f26880a.getText().length(), ForegroundColorSpan.class);
        t.f(spans, "spans");
        int i9 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : spans) {
            CharSequence text2 = this.f26880a.getText();
            t.e(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f26880a.getText();
            t.e(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i8 = spanEnd - spanStart) > i9) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i9 = i8;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(n.g(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.m
    public int h(int i8) {
        return this.f26880a.getLineVisibleEnd(i8);
    }

    @Override // io.sentry.android.replay.util.m
    public int i(int i8) {
        return this.f26880a.getEllipsisCount(i8);
    }
}
