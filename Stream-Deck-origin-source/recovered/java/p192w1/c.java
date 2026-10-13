package p192w1;

import A1.d;
import A1.w;
import Q6.q;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;
import kotlin.jvm.internal.t;
import p128o1.I;
import p128o1.x;
import p128o1.z;
import p216z1.h;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36724a = new a();

    public static final CharSequence a(String str, float f8, I i8, List list, List list2, d dVar, q qVar, boolean z8) {
        CharSequence charSequenceR;
        float f9;
        d dVar2;
        if (z8 && androidx.emoji2.text.c.k()) {
            charSequenceR = androidx.emoji2.text.c.c().r(str);
            t.d(charSequenceR);
        } else {
            charSequenceR = str;
        }
        if (list.isEmpty() && list2.isEmpty() && t.c(i8.D(), p216z1.q.f39041c.a()) && w.g(i8.s())) {
            return charSequenceR;
        }
        Spannable spannableString = charSequenceR instanceof Spannable ? (Spannable) charSequenceR : new SpannableString(charSequenceR);
        if (t.c(i8.A(), k.f39019b.d())) {
            p200x1.d.u(spannableString, f36724a, 0, str.length());
        }
        if (b(i8) && i8.t() == null) {
            p200x1.d.r(spannableString, i8.s(), f8, dVar);
            f9 = f8;
            dVar2 = dVar;
        } else {
            h hVarT = i8.t();
            if (hVarT == null) {
                hVarT = h.f38993c.a();
            }
            f9 = f8;
            dVar2 = dVar;
            p200x1.d.q(spannableString, i8.s(), f9, dVar2, hVarT);
        }
        p200x1.d.y(spannableString, i8.D(), f9, dVar2);
        p200x1.d.w(spannableString, i8, list, dVar2, qVar);
        p200x1.c.d(spannableString, list2, dVar2);
        return spannableString;
    }

    public static final boolean b(I i8) {
        x xVarA;
        z zVarW = i8.w();
        if (zVarW == null || (xVarA = zVarW.a()) == null) {
            return false;
        }
        return xVarA.c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
