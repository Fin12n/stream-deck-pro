package p152r1;

import android.graphics.Paint;
import android.text.Layout;
import p136p1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32297a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32297a = iArr;
        }
    }

    public static final float a(Layout layout, int i8, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i8);
        if (!A.l(layout, i8) || layout.getParagraphDirection(i8) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i8) + layout.getEllipsisStart(i8)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i8);
        if ((paragraphAlignment == null ? -1 : a.f32297a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i8, Paint paint, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i8, paint);
    }

    public static final float c(Layout layout, int i8, Paint paint) {
        float width;
        float width2;
        if (!A.l(layout, i8)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i8) != -1 || layout.getWidth() >= layout.getLineRight(i8)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i8) - layout.getPrimaryHorizontal(layout.getLineStart(i8) + layout.getEllipsisStart(i8))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i8);
        if ((paragraphAlignment != null ? a.f32297a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i8);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i8);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i8, Paint paint, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i8, paint);
    }
}
