package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p066h2.i;
import p066h2.j;
import p066h2.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.c.j f15141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.f f15142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.emoji2.text.c.e f15143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f15145e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static int a(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z8 = false;
                while (i9 != 0) {
                    i8--;
                    if (i8 < 0) {
                        return z8 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i8);
                    if (z8) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i9--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i9--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z8 = true;
                    }
                }
                return i8;
            }
        }

        public static int b(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z8 = false;
                while (i9 != 0) {
                    if (i8 >= length) {
                        if (z8) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i8);
                    if (z8) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i9--;
                        i8++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i9--;
                        i8++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8++;
                        z8 = true;
                    }
                }
                return i8;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f15146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.emoji2.text.c.j f15147b;

        public b(l lVar, androidx.emoji2.text.c.j jVar) {
            this.f15146a = lVar;
            this.f15147b = jVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean b(CharSequence charSequence, int i8, int i9, j jVar) {
            if (jVar.k()) {
                return true;
            }
            if (this.f15146a == null) {
                this.f15146a = new l(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f15146a.setSpan(this.f15147b.a(jVar), i8, i9, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public l a() {
            return this.f15146a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        Object a();

        boolean b(CharSequence charSequence, int i8, int i9, j jVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15152a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.emoji2.text.f.a f15153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.emoji2.text.f.a f15154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.emoji2.text.f.a f15155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f15158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f15159h;

        public f(androidx.emoji2.text.f.a aVar, boolean z8, int[] iArr) {
            this.f15153b = aVar;
            this.f15154c = aVar;
            this.f15158g = z8;
            this.f15159h = iArr;
        }

        public static boolean d(int i8) {
            return i8 == 65039;
        }

        public static boolean f(int i8) {
            return i8 == 65038;
        }

        public int a(int i8) {
            androidx.emoji2.text.f.a aVarA = this.f15154c.a(i8);
            int iG = 2;
            if (this.f15152a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f15152a = 2;
                    this.f15154c = aVarA;
                    this.f15157f = 1;
                }
            } else if (aVarA != null) {
                this.f15154c = aVarA;
                this.f15157f++;
            } else if (f(i8)) {
                iG = g();
            } else if (!d(i8)) {
                if (this.f15154c.b() != null) {
                    iG = 3;
                    if (this.f15157f != 1 || h()) {
                        this.f15155d = this.f15154c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f15156e = i8;
            return iG;
        }

        public j b() {
            return this.f15154c.b();
        }

        public j c() {
            return this.f15155d.b();
        }

        public boolean e() {
            if (this.f15152a != 2 || this.f15154c.b() == null) {
                return false;
            }
            return this.f15157f > 1 || h();
        }

        public final int g() {
            this.f15152a = 1;
            this.f15154c = this.f15153b;
            this.f15157f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f15154c.b().j() || d(this.f15156e)) {
                return true;
            }
            if (this.f15158g) {
                if (this.f15159h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f15159h, this.f15154c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(androidx.emoji2.text.f fVar, androidx.emoji2.text.c.j jVar, androidx.emoji2.text.c.e eVar, boolean z8, int[] iArr, Set set) {
        this.f15141a = jVar;
        this.f15142b = fVar;
        this.f15143c = eVar;
        this.f15144d = z8;
        this.f15145e = iArr;
        i(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z8) {
        p066h2.e[] eVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (eVarArr = (p066h2.e[]) editable.getSpans(selectionStart, selectionEnd, p066h2.e.class)) != null && eVarArr.length > 0) {
            for (p066h2.e eVar : eVarArr) {
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((z8 && spanStart == selectionStart) || ((!z8 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z8) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i8 >= 0 && i9 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z8) {
                iMax = a.a(editable, selectionStart, Math.max(i8, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i9, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i8, 0);
                iMin = Math.min(selectionEnd + i9, editable.length());
            }
            p066h2.e[] eVarArr = (p066h2.e[]) editable.getSpans(iMax, iMin, p066h2.e.class);
            if (eVarArr != null && eVarArr.length > 0) {
                for (p066h2.e eVar : eVarArr) {
                    int spanStart = editable.getSpanStart(eVar);
                    int spanEnd = editable.getSpanEnd(eVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean e(Editable editable, int i8, KeyEvent keyEvent) {
        boolean zA;
        if (i8 != 67) {
            zA = i8 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean g(int i8, int i9) {
        return i8 == -1 || i9 == -1 || i8 != i9;
    }

    public static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int b(CharSequence charSequence, int i8) {
        if (i8 < 0 || i8 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            p066h2.e[] eVarArr = (p066h2.e[]) spanned.getSpans(i8, i8 + 1, p066h2.e.class);
            if (eVarArr.length > 0) {
                return spanned.getSpanEnd(eVarArr[0]);
            }
        }
        return ((C0372d) k(charSequence, Math.max(0, i8 - 16), Math.min(charSequence.length(), i8 + 16), Integer.MAX_VALUE, true, new C0372d(i8))).f15150c;
    }

    public int c(CharSequence charSequence, int i8) {
        if (i8 < 0 || i8 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            p066h2.e[] eVarArr = (p066h2.e[]) spanned.getSpans(i8, i8 + 1, p066h2.e.class);
            if (eVarArr.length > 0) {
                return spanned.getSpanStart(eVarArr[0]);
            }
        }
        return ((C0372d) k(charSequence, Math.max(0, i8 - 16), Math.min(charSequence.length(), i8 + 16), Integer.MAX_VALUE, true, new C0372d(i8))).f15149b;
    }

    public final boolean f(CharSequence charSequence, int i8, int i9, j jVar) {
        if (jVar.d() == 0) {
            jVar.m(this.f15143c.a(charSequence, i8, i9, jVar.h()));
        }
        return jVar.d() == 2;
    }

    public final void i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public CharSequence j(CharSequence charSequence, int i8, int i9, int i10, boolean z8) throws Throwable {
        l lVar;
        CharSequence charSequence2;
        Throwable th;
        int i11;
        int i12;
        i iVar;
        p066h2.e[] eVarArr;
        int i13;
        int spanStart;
        boolean z9 = charSequence instanceof i;
        if (z9) {
            ((i) charSequence).a();
        }
        if (z9) {
            lVar = new l((Spannable) charSequence);
            if (lVar != null) {
                for (p066h2.e eVar : eVarArr) {
                    spanStart = lVar.getSpanStart(eVar);
                    int spanEnd = lVar.getSpanEnd(eVar);
                    if (spanStart != i9) {
                        lVar.removeSpan(eVar);
                    }
                    i8 = Math.min(spanStart, i8);
                    i9 = Math.max(spanEnd, i9);
                }
            }
            i11 = i8;
            i12 = i9;
            if (i11 == i12) {
                charSequence2 = charSequence;
                if (!z9) {
                    return charSequence2;
                }
                iVar = (i) charSequence2;
                iVar.d();
            } else {
                charSequence2 = charSequence;
                if (!z9) {
                    return charSequence2;
                }
                iVar = (i) charSequence2;
                iVar.d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    lVar = new l((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((i) charSequence2).d();
                    throw th;
                }
            } else {
                lVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i8 + (-1), i9 + 1, p066h2.e.class) > i9) ? null : new l(charSequence);
            }
            if (lVar != null && (eVarArr = (p066h2.e[]) lVar.getSpans(i8, i9, p066h2.e.class)) != null && eVarArr.length > 0) {
                while (i13 < r5) {
                    spanStart = lVar.getSpanStart(eVar);
                    int spanEnd2 = lVar.getSpanEnd(eVar);
                    if (spanStart != i9) {
                        lVar.removeSpan(eVar);
                    }
                    i8 = Math.min(spanStart, i8);
                    i9 = Math.max(spanEnd2, i9);
                }
            }
            i11 = i8;
            i12 = i9;
            if (i11 == i12 && i11 < charSequence.length()) {
                if (i10 != Integer.MAX_VALUE && lVar != null) {
                    i10 -= ((p066h2.e[]) lVar.getSpans(0, lVar.length(), p066h2.e.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    l lVar2 = (l) k(charSequence2, i11, i12, i10, z8, new b(lVar, this.f15141a));
                    if (lVar2 == null) {
                        if (z9) {
                            iVar = (i) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = lVar2.b();
                    if (z9) {
                        ((i) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z9) {
                        throw th;
                    }
                    ((i) charSequence2).d();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z9) {
                return charSequence2;
            }
            iVar = (i) charSequence2;
            iVar.d();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z9) {
            throw th;
        }
        ((i) charSequence2).d();
        throw th;
    }

    public final Object k(CharSequence charSequence, int i8, int i9, int i10, boolean z8, c cVar) {
        int iCharCount;
        f fVar = new f(this.f15142b.f(), this.f15144d, this.f15145e);
        int i11 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i8);
        loop0: while (true) {
            iCharCount = i8;
            while (true) {
                if (i8 >= i9 || i11 >= i10 || !zB) {
                    break loop0;
                }
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i9) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i8 = iCharCount;
                } else if (iA == 2) {
                    i8 += Character.charCount(iCodePointAt);
                    if (i8 < i9) {
                        iCodePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (iA != 3) {
                }
            }
            if (z8 || !f(charSequence, iCharCount, i8, fVar.c())) {
                zB = cVar.b(charSequence, iCharCount, i8, fVar.c());
                i11++;
            }
        }
        if (fVar.e() && i11 < i10 && zB && (z8 || !f(charSequence, iCharCount, i8, fVar.b()))) {
            cVar.b(charSequence, iCharCount, i8, fVar.b());
        }
        return cVar.a();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0372d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15149b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15150c = -1;

        public C0372d(int i8) {
            this.f15148a = i8;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean b(CharSequence charSequence, int i8, int i9, j jVar) {
            int i10 = this.f15148a;
            if (i8 > i10 || i10 >= i9) {
                return i9 <= i10;
            }
            this.f15149b = i8;
            this.f15150c = i9;
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0372d a() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15151a;

        public e(String str) {
            this.f15151a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean b(CharSequence charSequence, int i8, int i9, j jVar) {
            if (!TextUtils.equals(charSequence.subSequence(i8, i9), this.f15151a)) {
                return true;
            }
            jVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }
}
