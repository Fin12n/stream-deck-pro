package p136p1;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final int a(Layout layout, int i8, boolean z8) {
        if (i8 <= 0) {
            return 0;
        }
        if (i8 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i8);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i8 || lineEnd == i8) {
            if (lineStart == i8) {
                if (z8) {
                    return lineForOffset - 1;
                }
            } else if (!z8) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
