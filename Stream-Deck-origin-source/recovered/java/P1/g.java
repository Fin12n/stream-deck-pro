package P1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8868b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8869a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f8870a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : f8870a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = S1.a.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(S1.a.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public g(h hVar) {
        this.f8869a = hVar;
    }

    public static g a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static g b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16777a, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i8 = 0; i8 < length; i8++) {
            localeArr[i8] = a.a(strArrSplit[i8]);
        }
        return a(localeArr);
    }

    public static g d() {
        return j(b.c());
    }

    public static g e() {
        return f8868b;
    }

    public static g j(LocaleList localeList) {
        return new g(new i(localeList));
    }

    public Locale c(int i8) {
        return this.f8869a.get(i8);
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f8869a.equals(((g) obj).f8869a);
    }

    public boolean f() {
        return this.f8869a.isEmpty();
    }

    public int g() {
        return this.f8869a.size();
    }

    public String h() {
        return this.f8869a.a();
    }

    public int hashCode() {
        return this.f8869a.hashCode();
    }

    public Object i() {
        return this.f8869a.b();
    }

    public String toString() {
        return this.f8869a.toString();
    }
}
