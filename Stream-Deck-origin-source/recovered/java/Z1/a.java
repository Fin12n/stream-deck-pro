package Z1;

import T1.f;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f12842a = new String[0];

    /* JADX INFO: renamed from: Z1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0319a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence, int i8) {
            editorInfo.setInitialSurroundingSubText(charSequence, i8);
        }
    }

    @Deprecated
    public a() {
    }

    public static boolean a(CharSequence charSequence, int i8, int i9) {
        if (i9 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i8));
        }
        if (i9 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i8));
    }

    public static boolean b(int i8) {
        int i9 = i8 & 4095;
        return i9 == 129 || i9 == 225 || i9 == 18;
    }

    public static void c(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence, int i8) {
        f.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C0319a.a(editorInfo, charSequence, i8);
            return;
        }
        int i9 = editorInfo.initialSelStart;
        int i10 = editorInfo.initialSelEnd;
        int i11 = i9 > i10 ? i10 - i8 : i9 - i8;
        int i12 = i9 > i10 ? i9 - i8 : i10 - i8;
        int length = charSequence.length();
        if (i8 < 0 || i11 < 0 || i12 > length) {
            f(editorInfo, null, 0, 0);
            return;
        }
        if (b(editorInfo.inputType)) {
            f(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            f(editorInfo, charSequence, i11, i12);
        } else {
            g(editorInfo, charSequence, i11, i12);
        }
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0319a.a(editorInfo, charSequence, 0);
        } else {
            d(editorInfo, charSequence, 0);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i8);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i9);
    }

    public static void g(EditorInfo editorInfo, CharSequence charSequence, int i8, int i9) {
        int i10 = i9 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int iMin = Math.min(charSequence.length() - i9, i12 - Math.min(i8, (int) (((double) i12) * 0.8d)));
        int iMin2 = Math.min(i8, i12 - iMin);
        int i13 = i8 - iMin2;
        if (a(charSequence, i13, 0)) {
            i13++;
            iMin2--;
        }
        if (a(charSequence, (i9 + iMin) - 1, 1)) {
            iMin--;
        }
        f(editorInfo, i11 != i10 ? TextUtils.concat(charSequence.subSequence(i13, i13 + iMin2), charSequence.subSequence(i9, iMin + i9)) : charSequence.subSequence(i13, iMin2 + i11 + iMin + i13), iMin2, i11 + iMin2);
    }
}
