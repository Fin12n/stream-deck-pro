package p144q1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31982a;

    public a(Locale locale, CharSequence charSequence) {
        this.f31982a = new b(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int i8) {
        int iG = this.f31982a.i(this.f31982a.n(i8)) ? this.f31982a.g(i8) : this.f31982a.d(i8);
        return iG == -1 ? i8 : iG;
    }

    public final int b(int i8) {
        int iF = this.f31982a.k(this.f31982a.o(i8)) ? this.f31982a.f(i8) : this.f31982a.e(i8);
        return iF == -1 ? i8 : iF;
    }
}
