package p041e4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            sb.append(str.charAt(i8));
            if (str2.length() > i8) {
                sb.append(str2.charAt(i8));
            }
        }
        return sb.toString();
    }
}
