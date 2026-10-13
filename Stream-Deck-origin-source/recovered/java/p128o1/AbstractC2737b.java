package p128o1;

import A1.v;
import A1.w;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import p136p1.z;
import p152r1.c;
import p200x1.d;
import p216z1.e;
import p216z1.f;
import p216z1.j;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2737b {
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        d.u(spannableString, new c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    public static final int j(z zVar, int i8) {
        int iL = zVar.l();
        for (int i9 = 0; i9 < iL; i9++) {
            if (zVar.k(i9) > i8) {
                return i9;
            }
        }
        return zVar.l();
    }

    public static final boolean k(I i8, boolean z8) {
        if (z8 && !v.e(i8.q(), w.f(0)) && !v.e(i8.q(), v.f462b.a())) {
            int iZ = i8.z();
            j.a aVar = j.f39010b;
            if (!j.k(iZ, aVar.g()) && !j.k(i8.z(), aVar.f()) && !j.k(i8.z(), aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public static final int l(int i8) {
        j.a aVar = j.f39010b;
        if (j.k(i8, aVar.d())) {
            return 3;
        }
        if (j.k(i8, aVar.e())) {
            return 4;
        }
        if (j.k(i8, aVar.a())) {
            return 2;
        }
        return (!j.k(i8, aVar.f()) && j.k(i8, aVar.b())) ? 1 : 0;
    }

    public static final int m(int i8) {
        f.b.a aVar = f.b.f38978a;
        if (f.b.e(i8, aVar.c())) {
            return 0;
        }
        if (f.b.e(i8, aVar.b())) {
            return 1;
        }
        return f.b.e(i8, aVar.a()) ? 2 : 0;
    }

    public static final int n(int i8) {
        e.a aVar = e.f38967b;
        if (e.g(i8, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        e.g(i8, aVar.b());
        return 0;
    }

    public static final int o(int i8) {
        f.c.a aVar = f.c.f38983a;
        if (f.c.f(i8, aVar.a())) {
            return 0;
        }
        if (f.c.f(i8, aVar.b())) {
            return 1;
        }
        if (f.c.f(i8, aVar.c())) {
            return 2;
        }
        return f.c.f(i8, aVar.d()) ? 3 : 0;
    }

    public static final int p(int i8) {
        f.d.a aVar = f.d.f38989a;
        return (!f.d.d(i8, aVar.a()) && f.d.d(i8, aVar.b())) ? 1 : 0;
    }
}
