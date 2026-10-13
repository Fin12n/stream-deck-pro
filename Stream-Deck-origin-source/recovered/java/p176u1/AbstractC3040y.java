package p176u1;

import Z6.w;
import android.view.inputmethod.ExtractedText;
import p128o1.G;

/* JADX INFO: renamed from: u1.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3040y {
    public static final ExtractedText a(M m8) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = m8.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = m8.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = G.l(m8.g());
        extractedText.selectionEnd = G.k(m8.g());
        extractedText.flags = !w.L(m8.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
